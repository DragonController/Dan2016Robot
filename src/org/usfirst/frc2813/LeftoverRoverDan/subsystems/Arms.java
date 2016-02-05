package org.usfirst.frc2813.LeftoverRoverDan.subsystems;

import org.usfirst.frc2813.LeftoverRoverDan.RobotMap;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class Arms extends PIDSubsystem {
	
	private final SpeedController speedControllerSucker = RobotMap.armsSpeedControllerSucker;

	private final AnalogPotentiometer potentiometer = RobotMap.armsPotentiometer;

	public Arms() {
		super("Arms", 1.0, 0.0, 0.0);
		setAbsoluteTolerance(0.2);
		getPIDController().setContinuous(false);
		LiveWindow.addActuator("Arms", "PIDSubsystem Controller",
				getPIDController());
	}

	public void initDefaultCommand() {

	}

	protected double returnPIDInput() {
		return potentiometer.get();
	}

	protected void usePIDOutput(double output) {
		
	}

	public void move(double move) {
		setSetpoint(move);
	}

	public void pull(double move) {
		speedControllerSucker.set(move);
	}
}