// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc100.RobotAndrew;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSP;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainright;
    public static SpeedController driveTrainleft;
    public static RobotDrive driveTrainRobotDrive;
    public static ADXRS450_Gyro internalGyro;
    public static Encoder encoderRight;
    public static Encoder encoderLeft;
    public static PowerDistributionPanel pdp;
    public static CANTalon rightMaster;
    public static CANTalon rightFollwer;
    public static CANTalon leftMaster;
    public static CANTalon leftFollower;
    public static SpeedController practice;
  //..  public static CANTalon right;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
    	internalGyro = new ADXRS450_Gyro();
    	//right = new CANTalon(5);
    	//practice = new Victor(2);
    	rightMaster	= new CANTalon(5);
    	rightMaster.changeControlMode(TalonControlMode.PercentVbus);
    	rightFollwer = new CANTalon(4);
    	rightFollwer.changeControlMode(TalonControlMode.Follower);
    	rightFollwer.set(5);
    	rightFollwer.setSafetyEnabled(false);
    	leftMaster = new CANTalon(3);
    	leftMaster.changeControlMode(TalonControlMode.PercentVbus);
    	leftFollower = new CANTalon(2);
    	leftFollower.changeControlMode(TalonControlMode.Follower);
    	leftFollower.set(3);
    	leftFollower.setSafetyEnabled(false);
    	//leftFollower.reverseOutput(true);
    	pdp = new PowerDistributionPanel();
    	encoderRight = new Encoder(2, 3);
        encoderLeft = new Encoder(0,1);
        //encoderRight.
        encoderRight.setDistancePerPulse(1.0/1937.2032);
        encoderLeft.setDistancePerPulse(1.0/1937.2032);
    	//internalGyro = new ADXRS450_Gyro();
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainright = new Victor(1); //0
    //    LiveWindow.addActuator("DriveTrain", "right", (Talon) driveTrainright);
        
        driveTrainleft = new Victor(0);
        driveTrainleft.setInverted(true);
     //   LiveWindow.addActuator("DriveTrain", "left", (Talon) driveTrainleft);
        
        driveTrainRobotDrive = new RobotDrive(rightMaster, leftMaster);//rightFollwer, leftMaster, leftFollower);
        
        driveTrainRobotDrive.setSafetyEnabled(false);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);

        driveTrainRobotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}