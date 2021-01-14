/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {

  Talon shooter;

  /**
   * Creates a new Shooter.
   */
  public Shooter() {
    shooter = new Talon(Constants.SHOOTER_TALON);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void shootBall(double speed) {
    shooter.set(speed);
  }

  public void stop() {
    shooter.set(0); 
  }
}
