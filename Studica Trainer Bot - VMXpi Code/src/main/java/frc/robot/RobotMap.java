// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.studica.frc.TitanQuad;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into to a variable name.
 * This provides flexibility changing wiring, makes checking the wiring easier and significantly
 * reduces the number of magic numbers floating around.
 */
public class RobotMap {
  public static TitanQuad motor0;
  public static TitanQuad motor1;
  public static TitanQuad motor2;
  public static TitanQuad motor3;
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
  public static void initRobot()
  {
    drive();
  }

  static void drive()
  {
    motor0 = new TitanQuad(42, 0);
    motor1 = new TitanQuad(42, 1);
    motor2 = new TitanQuad(42, 2);
    motor3 = new TitanQuad(42, 3);

    motor2.setInverted(true);
    motor3.setInverted(true);
  }

}
