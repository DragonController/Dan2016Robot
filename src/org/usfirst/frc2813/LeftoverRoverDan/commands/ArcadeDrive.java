package org.usfirst.frc2813.LeftoverRoverDan.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc2813.LeftoverRoverDan.Robot;

public class ArcadeDrive extends Command {

	public ArcadeDrive() {
		requires(Robot.driveTrain);
	}

	protected void initialize() {

	}

	protected void execute() {
		if (!Robot.driveTrain.getPIDStatus()) {
			Robot.driveTrain.testDrive(0, Robot.oi.getJoystick1().getX());
			// Robot.driveTrain.testDrive(Robot.oi.getJoystick1().getY(), 0);
		}
		SmartDashboard.putNumber("JoysitckX", Robot.oi.getJoystick1().getX());
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {

	}

	protected void interrupted() {

	}
}