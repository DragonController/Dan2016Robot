package org.usfirst.frc2813.LeftoverRoverDan.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc2813.LeftoverRoverDan.Robot;

public class TogglePID extends Command {

	public TogglePID() {
//		requires(Robot.elevator);
		requires(Robot.driveTrain);
	}

	protected void initialize() {

	}

	protected void execute() {
//		Robot.elevator.togglePID();
		Robot.driveTrain.togglePID();
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {

	}

	protected void interrupted() {
		
	}
}