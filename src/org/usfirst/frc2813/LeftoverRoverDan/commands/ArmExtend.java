package org.usfirst.frc2813.LeftoverRoverDan.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc2813.LeftoverRoverDan.Robot;

public class ArmExtend extends Command {

	public ArmExtend() {
		requires(Robot.arms);
	}

	protected void initialize() {

	}

	protected void execute() {
		Robot.arms.move(90);
	}

	protected boolean isFinished() {
		return true;
	}

	protected void end() {

	}

	protected void interrupted() {

	}
}