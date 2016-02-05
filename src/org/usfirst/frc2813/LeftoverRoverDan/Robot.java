package org.usfirst.frc2813.LeftoverRoverDan;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc2813.LeftoverRoverDan.subsystems.*;

public class Robot extends IterativeRobot {

	Command autonomousCommand;

	public static OI oi;
	public static Elevator elevator;
	public static Nav6 nav6;
	public static Shooter shooter;
	public static Intake intake;
	public static Pneumatics pneumatics;
	public static DriveTrain driveTrain;
	public static Arms arms;
	
	public void robotInit() {
		RobotMap.init();

		elevator = new Elevator();
		shooter = new Shooter();
		nav6 = new Nav6();
		intake = new Intake();
		pneumatics = new Pneumatics();
		driveTrain = new DriveTrain();
		arms = new Arms();
		oi = new OI();
	}

	public void disabledInit() {

	}

	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	public void autonomousInit() {
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	public void teleopInit() {
		if (autonomousCommand != null)
			autonomousCommand.cancel();
	}

	public void teleopPeriodic() {
//		nav6.displayNav6Data();
		Scheduler.getInstance().run();
	}

	public void testPeriodic() {
		LiveWindow.run();
	}
}