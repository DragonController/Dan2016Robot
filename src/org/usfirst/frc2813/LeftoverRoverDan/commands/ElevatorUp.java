package org.usfirst.frc2813.LeftoverRoverDan.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc2813.LeftoverRoverDan.Robot;

public class ElevatorUp extends Command {

	public ElevatorUp() {
		requires(Robot.elevator);
	}

	protected void initialize() {

	}

	protected void execute() {
		Robot.elevator.move(0.6);
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {

	}

	protected void interrupted() {
		//Robot.elevator.move(0);
	}
}