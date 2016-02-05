package org.usfirst.frc2813.LeftoverRoverDan.subsystems;

import org.usfirst.frc2813.LeftoverRoverDan.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Shooter extends PIDSubsystem {

	private final SpeedController speedController = RobotMap.shooterSpeedController;
	private final Encoder encoder = RobotMap.shooterEncoder;

	public Shooter() {
		super("Shooter", 1.0, 0.0, 0.0);
		setAbsoluteTolerance(0.2);
		getPIDController().setContinuous(false);
		LiveWindow.addActuator("Shooter", "PIDSubsystem Controller",
				getPIDController());
		getPIDController().setOutputRange(-1.0, 1.0);
	}

	public void initDefaultCommand() {

	}

	protected double returnPIDInput() {
		return encoder.pidGet();
	}

	protected void usePIDOutput(double output) {
		speedController.pidWrite(output);
	}

	public void move(double speed) {
		speedController.set(-speed);
	}
}