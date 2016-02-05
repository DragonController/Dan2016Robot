package org.usfirst.frc2813.LeftoverRoverDan.subsystems;

import org.usfirst.frc2813.LeftoverRoverDan.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Intake extends Subsystem {

	private final SpeedController speedControllerLeft = RobotMap.intakeSpeedControllerLeft;
	private final SpeedController speedControllerRight = RobotMap.intakeSpeedControllerRight;

	public void initDefaultCommand() {

	}

	public void move(int speed) {
		speedControllerLeft.set(-speed);
		speedControllerRight.set(speed);
	}
}