package org.usfirst.frc2813.LeftoverRoverDan.commands;

import org.usfirst.frc2813.LeftoverRoverDan.Robot;


public class RotateWithPID {
	
	public static void changeSetpoint(double setpoint) {
		double desiredValue = Robot.driveTrain.getOldSetpoint() + setpoint;
		Robot.driveTrain.setNewSetpoint(desiredValue);
	}
}
