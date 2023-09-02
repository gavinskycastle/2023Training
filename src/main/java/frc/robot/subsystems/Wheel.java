// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Wheel extends SubsystemBase {
  /** Creates a new Wheel. */

  private TalonFX m_wheelMotor = new TalonFX(0);

  private double m_output = 0.0;

  public Wheel() {
    m_wheelMotor.configFactoryDefault();
  }

  public void setPercentOutput(double output) {
    m_output = output;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    m_wheelMotor.set(TalonFXControlMode.PercentOutput, m_output);
  }
}
