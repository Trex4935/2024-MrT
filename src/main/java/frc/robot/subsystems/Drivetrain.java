// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Extensions.Talon;

public class Drivetrain extends SubsystemBase {
  //Defining Motors, Motor Groups, and DifferentialDrive
  WPI_TalonSRX talon1, talon2, talon5, talon6;
  MotorControllerGroup leftmotors, rightmotors;
  public DifferentialDrive differentialDrive;
  /** Creates a new Drivetrain. */
  public Drivetrain() {
  //Newing up Motors, Motor Groups, and Differential Drive
    talon1 = Talon.createDefaultTalon(1);
    talon2 = Talon.createDefaultTalon(2);
    talon5 = Talon.createDefaultTalon(5);
    talon6 = Talon.createDefaultTalon(6);
    leftmotors = new MotorControllerGroup(talon1, talon2);
    rightmotors = new MotorControllerGroup(talon5, talon6);
    differentialDrive = new DifferentialDrive(leftmotors, rightmotors);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  //AHHHHHH STOP RUNNING YOU'RE GOING TOO DAMN FAST FOREST GUMP, stops motor groups
  public void stopMotors(){
    leftmotors.stopMotor();
    rightmotors.stopMotor();
  }
}
