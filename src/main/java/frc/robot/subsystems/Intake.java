// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
// import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Extensions.Talon;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  // Defining Motors, Motor
  WPI_TalonSRX talon3, talon4;
  public MotorControllerGroup intakeMotors;

  public Intake() {
    talon3 = Talon.createDefaultTalon(3);
    talon4 = Talon.createDefaultTalon(4);
    intakeMotors = new MotorControllerGroup(talon3, talon4);

  }

  // Spins Motors to Collect Cube
  public void collectCube() {
    intakeMotors.set(0.5);
  }

  // Spins Motors to Eject- Score - Cube
  public void scoreCube() {
    intakeMotors.set(-0.5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  // AHHHHHH STOP RUNNING YOU'RE GOING TOO DAMN FAST FOREST GUMP, stops motor
  // groups
  public void stopMotors() {
    talon3.stopMotor();
    talon4.stopMotor();
  }
}
