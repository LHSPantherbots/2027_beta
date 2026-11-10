// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package first.robot.subsystems;

import org.wpilib.command2.SubsystemBase;

import com.revrobotics.spark.SparkMax;

public class SparkSubsystem extends SubsystemBase {
  /** Creates a new SparkSubsystem. */
  private final SparkMax spark;
  public SparkSubsystem() {
    spark = new SparkMax(1,3, SparkMax.MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setSpeed(double speed) {
    spark.setThrottle(speed);
  }
}
