package org.usfirst.frc2813.LeftoverRoverDan.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc2813.LeftoverRoverDan.Robot;

public class Intake extends Command {

	public Intake() {
		requires(Robot.intake);
	}

	protected void initialize() {
		Robot.intake.move(1);
	}

	protected void execute() {

	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {

	}

	protected void interrupted() {
		Robot.intake.move(0);
	}
}