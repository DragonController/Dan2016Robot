package org.usfirst.frc2813.LeftoverRoverDan.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc2813.LeftoverRoverDan.Robot;

public class ArmRetract extends Command {

	public ArmRetract() {
		requires(Robot.arms);
	}

	protected void initialize() {

	}

	protected void execute() {
		Robot.arms.move(0);
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {

	}

	protected void interrupted() {

	}
}