package org.usfirst.frc2813.LeftoverRoverDan;

import org.usfirst.frc2813.LeftoverRoverDan.commands.DriveTrainClockwise;
import org.usfirst.frc2813.LeftoverRoverDan.commands.DriveTrainCounterClockwise;
import org.usfirst.frc2813.LeftoverRoverDan.commands.ResetNav6;
import org.usfirst.frc2813.LeftoverRoverDan.commands.TogglePID;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {

	public Joystick joystick1;
	public Joystick joystick2;

	public OI() {
		joystick1 = new Joystick(0);

		new JoystickButton(joystick1, 1).whenPressed(new TogglePID());
		new JoystickButton(joystick1, 3).whenPressed(new ResetNav6());
		new JoystickButton(joystick1, 5).whenPressed(new DriveTrainClockwise());
		new JoystickButton(joystick1, 4).whenPressed(new DriveTrainCounterClockwise());
	}

	public Joystick getJoystick1() {
		return joystick1;
	}

	public Joystick getJoystick2() {
		return joystick2;
	}

}