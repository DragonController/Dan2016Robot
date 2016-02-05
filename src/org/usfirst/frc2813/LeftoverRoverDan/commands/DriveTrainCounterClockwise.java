package org.usfirst.frc2813.LeftoverRoverDan.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc2813.LeftoverRoverDan.Robot;

public class DriveTrainCounterClockwise extends Command {

	public DriveTrainCounterClockwise() {
		requires(Robot.arms);
	}

	protected void initialize() {

	}

	protected void execute() {
		RotateWithPID.changeSetpoint(-30);
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {

	}

	protected void interrupted() {
		
	}
}