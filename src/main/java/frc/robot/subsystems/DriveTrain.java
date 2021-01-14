/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */

  Talon leftFront;
  Talon rightFront;
  Talon leftBack;
  Talon rightBack;

  SpeedControllerGroup leftMotors;
  SpeedControllerGroup rightMotors;

  DifferentialDrive twoMotorDrive;

  public DriveTrain() {
    leftFront = new Talon(Constants.LEFT_FRONT);
    rightFront = new Talon(Constants.RIGHT_FRONT);
    leftBack = new Talon(Constants.LEFT_BACK);
    rightBack = new Talon(Constants.RIGHT_BACK);

    leftMotors = new SpeedControllerGroup(leftFront, leftBack);
    rightMotors = new SpeedControllerGroup(rightFront, rightBack);

    twoMotorDrive = new DifferentialDrive(leftMotors, rightMotors);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void driveWithJoysticks(Joystick leftStick, Joystick rightStick) {
    twoMotorDrive.tankDrive(leftStick.getY(), rightStick.getY()); 
  }

  public void driveForward(double speed){
    twoMotorDrive.tankDrive(speed,speed);  
  }
}
