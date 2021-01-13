// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.controller.PIDController;

public class elevatorPID extends Subsystem {
  /** Creates a new elevatorPID. */

  TalonSRX elevatorMotor = new TalonSRX(1);

  public elevatorPID() {
    // The PIDController used by the subsystem
    PIDController elevatorController = new PIDController(0.5, 0, 0);
  }

  @Override
  protected void initDefaultCommand() {
    // TODO Auto-generated method stub

  }
}
