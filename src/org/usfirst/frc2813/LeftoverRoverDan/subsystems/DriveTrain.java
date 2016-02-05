package org.usfirst.frc2813.LeftoverRoverDan.subsystems;

import org.usfirst.frc2813.LeftoverRoverDan.Robot;
import org.usfirst.frc2813.LeftoverRoverDan.RobotMap;
import org.usfirst.frc2813.LeftoverRoverDan.commands.ArcadeDrive;

import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveTrain extends PIDSubsystem {

	public boolean pIDStatus = false;
	private double marginOfError = 2;

	public DriveTrain() {
		super("ArcadeDrive", 0.05, 0.01, 0.04);
		setAbsoluteTolerance(0.2);
		getPIDController().setContinuous(false);
		LiveWindow.addActuator("ArcadeDrive", "PIDSubsystem Controller",
				getPIDController());
		getPIDController().setOutputRange(-1.0, 1.0);
		enable();
		setSetpoint(0);
	}

	public void initDefaultCommand() {
		setDefaultCommand(new ArcadeDrive());
	}

	public boolean getPIDStatus() {
		return pIDStatus;
	}

	public void togglePID() {
		pIDStatus = !pIDStatus;
	}

	public void disablePID() {
		pIDStatus = false;
	}

	public void enablePID() {
		pIDStatus = true;
	}

	protected double returnPIDInput() {
		return Robot.nav6.pidGet();
	}

	protected void usePIDOutput(double output) {
		// if (returnPIDInput() > getSetpoint() - marginOfError &&
		// returnPIDInput() < getSetpoint() + marginOfError) {
		// disablePID();
		// } else {
		// enablePID();
		// }
		SmartDashboard.putNumber("DriveTrainPIDInput", returnPIDInput());
		SmartDashboard.putNumber("DriveTrainPIDOutput", output);
		SmartDashboard.putString("PIDStatus", String.valueOf(pIDStatus));
		SmartDashboard.putNumber("CurrentSetpoint", getSetpoint());
		if (pIDStatus) {
			Robot.driveTrain.testDrive(0, output);
		}
	}

	public void testDrive(double move, double rotate) {
		if (rotate > 0.75)
			rotate = 0.75;
		if (rotate < -0.75)
			rotate = -0.75;
		RobotMap.driveTrainSpeedControllers.arcadeDrive(-move, -rotate);
	}

	public double getOldSetpoint() {
		return getSetpoint();
	}

	public void setNewSetpoint(double value) {
		setSetpoint(value);
	}
}