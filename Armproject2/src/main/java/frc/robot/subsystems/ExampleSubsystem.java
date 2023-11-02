// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.WaitCommand;

public class ExampleSubsystem extends SubsystemBase {
  private final Servo m_servo;
  private final Servo x_servo;
  private final Servo y_servo;
  private final Servo wrist_servo;
  private final Servo claw_servo;

  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {
    m_servo = new Servo(9);
    x_servo = new Servo(8);
    y_servo = new Servo(7);
    wrist_servo = new Servo(5);
    claw_servo = new Servo(6);
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public CommandBase SwivelMethodCommand(double value) {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          m_servo.set(m_servo.get() + value);
          /* one-time action goes here */
        });
  }

  public CommandBase MyMethodCommand(double value) {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          x_servo.set(x_servo.get() + value);
          /* one-time action goes here */
        });
  }

  public CommandBase YourMethodCommand(double value) {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          y_servo.set(y_servo.get() + value);
          /* one-time action goes here */
        });
  }

  public CommandBase WristMethodCommand(double value) {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          wrist_servo.set(wrist_servo.get() + value);
          /* one-time action goes here */
        });
  }

  public CommandBase ClawMethodCommand(double value) {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          claw_servo.set(claw_servo.get() + value);
          /* one-time action goes here */
        });
  }

  public CommandBase PresetMethodCommand(double value) {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          m_servo.set(0.5);
          x_servo.set(x_servo.get() + value);
          y_servo.set(y_servo.get() + value);
          wrist_servo.set(0.5);
          claw_servo.set(0);
          /* one-time action goes here */
        });
  }

  public CommandBase Preset2MethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          m_servo.set(0.5);
          x_servo.set(1);
          y_servo.set(1);
          wrist_servo.set(0.5);
          claw_servo.set(0);
          System.out.println("**************************************************");
          /* one-time action goes here */
        }).andThen(runOnce(() -> {System.out.println("0000000000000000000000000000000000000000");
          m_servo.set(0);}));
  }

  public CommandBase ResetMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          m_servo.set(0.5);
          x_servo.set(1);
          //try {
          //  Thread.sleep(10000);
          //} catch (InterruptedException e) {
          //  e.printStackTrace();
          //}
          /* one-time action goes here */
        }.andThen(runOnce(() -> {System.out.println("0000000000000000000000000000000000000000");
        y_servo.set(1);
        wrist_servo.set(0.5);})));
  }

  public CommandBase BestMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          x_servo.set(0.2);
          y_servo.set(0.2);
          /* one-time action goes here */
        });
  }

  public CommandBase AutoMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          m_servo.set(0);
          x_servo.set(0.4);
          y_servo.set(0.5);
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          wrist_servo.set(0.2);
          claw_servo.set(1);
          /* one-time action goes here */
        });
  }

  public CommandBase Auto2MethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return run(
        () -> {
          x_servo.set(0.2);
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a
   * digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
