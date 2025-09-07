// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.Rev2mDistanceSensor.Port;
import com.studica.frc.AHRS;

import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.lib.Rev2mDistanceSensor;

/**
 * The methods in this class are called automatically corresponding to each
 * mode, as described in
 * the TimedRobot documentation. If you change the name of this class or the
 * package after creating
 * this project, you must also update the Main.java file in the project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used
   * for any
   * initialization code.
   */
  AHRS navX_SPI = new AHRS(AHRS.NavXComType.kMXP_SPI);

  Encoder encoder_0_1 = new Encoder(0, 1);
  Encoder encoder_2_3 = new Encoder(2, 3);
  Encoder encoder_4_5 = new Encoder(4, 5);
  Encoder encoder_6_7 = new Encoder(6, 7);
  Encoder encoder_8_9 = new Encoder(8, 9);

  Encoder encoder_1_2 = new Encoder(1, 2);
  Encoder encoder_3_4 = new Encoder(3, 4);
  Encoder encoder_5_6 = new Encoder(5, 6);
  Encoder encoder_7_8 = new Encoder(7, 8);

  DutyCycleEncoder dutyCycleEncoder_0 = new DutyCycleEncoder(0);
  DutyCycleEncoder dutyCycleEncoder_1 = new DutyCycleEncoder(1);
  DutyCycleEncoder dutyCycleEncoder_2 = new DutyCycleEncoder(2);
  DutyCycleEncoder dutyCycleEncoder_3 = new DutyCycleEncoder(3);
  DutyCycleEncoder dutyCycleEncoder_4 = new DutyCycleEncoder(4);
  DutyCycleEncoder dutyCycleEncoder_5 = new DutyCycleEncoder(5);
  DutyCycleEncoder dutyCycleEncoder_6 = new DutyCycleEncoder(6);
  DutyCycleEncoder dutyCycleEncoder_7 = new DutyCycleEncoder(7);
  DutyCycleEncoder dutyCycleEncoder_8 = new DutyCycleEncoder(8);
  DutyCycleEncoder dutyCycleEncoder_9 = new DutyCycleEncoder(9);
  DutyCycleEncoder dutyCycleEncoder_10 = new DutyCycleEncoder(10);

  Rev2mDistanceSensor rev2mDistanceSensor = new Rev2mDistanceSensor(Port.kOnboard);

  public Robot() {
    rev2mDistanceSensor.setAutomaticMode(true);
  }

  @Override

  public void robotPeriodic() {
  }

  @Override

  public void autonomousInit() {
  }

  @Override

  public void autonomousPeriodic() {
  }

  @Override

  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    SmartDashboard.putNumber("NavX_SPI Angle", navX_SPI.getAngle());

    SmartDashboard.putNumber("Encoder_0-1", encoder_0_1.get());
    SmartDashboard.putNumber("Encoder_2-3", encoder_2_3.get());
    SmartDashboard.putNumber("Encoder_4-5", encoder_4_5.get());
    SmartDashboard.putNumber("Encoder_6-7", encoder_6_7.get());
    SmartDashboard.putNumber("Encoder_8-9", encoder_8_9.get());

    SmartDashboard.putNumber("Encoder_1-2", encoder_1_2.get());
    SmartDashboard.putNumber("Encoder_3-4", encoder_3_4.get());
    SmartDashboard.putNumber("Encoder_5-6", encoder_5_6.get());
    SmartDashboard.putNumber("Encoder_7-8", encoder_7_8.get());

    SmartDashboard.putNumber("Encoder_0", dutyCycleEncoder_0.get());
    SmartDashboard.putNumber("Encoder_1", dutyCycleEncoder_1.get());
    SmartDashboard.putNumber("Encoder_2", dutyCycleEncoder_2.get());
    SmartDashboard.putNumber("Encoder_3", dutyCycleEncoder_3.get());
    SmartDashboard.putNumber("Encoder_4", dutyCycleEncoder_4.get());
    SmartDashboard.putNumber("Encoder_5", dutyCycleEncoder_5.get());
    SmartDashboard.putNumber("Encoder_6", dutyCycleEncoder_6.get());
    SmartDashboard.putNumber("Encoder_7", dutyCycleEncoder_7.get());
    SmartDashboard.putNumber("Encoder_8", dutyCycleEncoder_8.get());
    SmartDashboard.putNumber("Encoder_9", dutyCycleEncoder_9.get());
    SmartDashboard.putNumber("Encoder_10", dutyCycleEncoder_10.get());

    SmartDashboard.putNumber("Rev2mDistanceSensor", rev2mDistanceSensor.getDistance());
  }

  @Override

  public void disabledInit() {
  }

  @Override

  public void disabledPeriodic() {
  }

  @Override

  public void testInit() {
  }

  @Override

  public void testPeriodic() {
  }

  @Override

  public void simulationInit() {
  }

  @Override

  public void simulationPeriodic() {
  }
}
