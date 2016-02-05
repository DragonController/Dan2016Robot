package org.usfirst.frc2813.LeftoverRoverDan.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc2813.LeftoverRoverDan.Robot;

public class Pull extends Command {

	public Pull() {
		requires(Robot.arms);
	}

	protected void initialize() {

	}

	protected void execute() {
		Robot.arms.pull(-1);
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {

	}

	protected void interrupted() {
		Robot.arms.pull(0);
	}
}
