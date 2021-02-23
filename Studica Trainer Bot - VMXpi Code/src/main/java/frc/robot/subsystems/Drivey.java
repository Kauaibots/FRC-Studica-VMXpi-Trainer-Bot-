// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.OI;
import frc.robot.RobotMap;
import frc.robot.commands.StickyDrivey;

/** Add your docs here. */
public class Drivey extends Subsystem {
  private static OI operator = new OI();
  private static RobotMap map = new RobotMap();
  //private static StickyDrivey def = new StickyDrivey();
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {

    setDefaultCommand(new StickyDrivey());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void stickDrive()
  {
   
   double straightpower = operator.gamepad1.getRawAxis(1);
   double turnpower = operator.gamepad1.getRawAxis(2);
   double sidepower = operator.gamepad1.getRawAxis(0);

   double FRP = (straightpower + sidepower ) + turnpower;
   double FLP = (straightpower - sidepower) - turnpower;
   double RRP = (straightpower - sidepower) + turnpower;
   double RLP = (straightpower + sidepower) - turnpower;

   map.motor0.set(FRP);
   map.motor1.set(RRP);
   map.motor2.set(FLP);
   map.motor3.set(RLP);  
  }
}
