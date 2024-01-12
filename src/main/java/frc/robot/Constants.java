// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.util.HashMap;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class DriveConstants {



    public static final double kTrackWidth = Units.inchesToMeters(23);
    // Distance between right and left wheels
    public static final double kWheelBase = Units.inchesToMeters(24);
    // Distance between front and back wheels


public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics(
     
    new Translation2d(kWheelBase / 2, -kTrackWidth / 2), //front left
      new Translation2d(kWheelBase / 2, kTrackWidth / 2), //front right
      new Translation2d(-kWheelBase / 2, -kTrackWidth / 2), //back left
      new Translation2d(-kWheelBase / 2, kTrackWidth / 2)); //back right

//start front front left to front right to back right and all drives then all steers then all absolutes

    public static final int kFrontLeftDriveMotorPort = 1;
    public static final int kFrontRightDriveMotorPort = 2;
    public static final int kBackRightDriveMotorPort = 3;
    public static final int kBackLeftDriveMotorPort = 4;

    public static final int kFrontLeftTurningMotorPort = 5;
    public static final int kBackLeftTurningMotorPort = 6;
    public static final int kFrontRightTurningMotorPort = 7;
    public static final int kBackRightTurningMotorPort = 8;
    
    public static final int kFrontLeftDriveAbsoluteEncoderPort = 9;
    public static final int kBackLeftDriveAbsoluteEncoderPort = 10;
    public static final int kFrontRightDriveAbsoluteEncoderPort = 11;
    public static final int kBackRightDriveAbsoluteEncoderPort = 12;
    

    //TODO fix these
    public static final double kBRDegrees = 9.405; //332.31
    public static final double kBLDegrees = 294.875; //295.92
    public static final double kFLDegrees = 68.82; //72.85
    public static final double kFRDegrees = 242.93; //278.31

    public static final boolean kFrontLeftTurningEncoderReversed = false;
    public static final boolean kBackLeftTurningEncoderReversed = false;
    public static final boolean kFrontRightTurningEncoderReversed = false;
    public static final boolean kBackRightTurningEncoderReversed = false;

    public static final boolean kFrontLeftDriveEncoderReversed = true;
    public static final boolean kBackLeftDriveEncoderReversed = true;
    public static final boolean kFrontRightDriveEncoderReversed = false;
    public static final boolean kBackRightDriveEncoderReversed = false;

    public static final boolean kFrontLeftDriveAbsoluteEncoderReversed = false;
    public static final boolean kBackLeftDriveAbsoluteEncoderReversed = false;
    public static final boolean kFrontRightDriveAbsoluteEncoderReversed = false;
    public static final boolean kBackRightDriveAbsoluteEncoderReversed = false;

 

    public static final double kPhysicalMaxSpeedMetersPerSecond = 4.572;
    public static final double kPhysicalMaxAngularSpeedRadiansPerSecond = kPhysicalMaxSpeedMetersPerSecond * Math.PI;


    
    public static final double kTeleDriveMaxSpeedMetersPerSecond = kPhysicalMaxSpeedMetersPerSecond / 1;
    public static final double kTeleDriveMaxAngularSpeedRadiansPerSecond = kPhysicalMaxAngularSpeedRadiansPerSecond / 1.35;
    public static final double kTeleDriveMaxAccelerationUnitsPerSecond = 3.5;
    public static final double kTeleDriveMaxAngularAccelerationUnitsPerSecond = 2.5;
}
  
  public static final class ModuleConstants {
    public static final double kWheelDiameterMeters = Units.inchesToMeters(4);
    public static final double kDriveMotorGearRatio = 7 / 1;
    public static final double kTurningMotorGearRatio = 12.8 / 1;
    public static final double kDriveEncoderRot2Meter = 1/23.58;
    
    
    //get this a little closer. maybe 28.23
    public static final double kTurningConversionFactor2Deg =  28.25;
    public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2Meter / 60;
    public static final double kTurningEncoderRPM2DegPerSec = kTurningConversionFactor2Deg / 60;
    public static final double kPTurning = 0.01; //test a higher value 0.025 is to high
    public static final double kITurning = 0.00015;
    public static final double kDTurning = 0.05;

    public static final double moduleRadius = 5.0660808; //meters -- measured from center of robot to furthest module.
}

//Max speed
    public static final class OIConstants {
      public static final int kOPControllerPort = 1;
      public static final double kDeadband = 0.09;
  }
  public static final class AutoConstants {
    public static final double kMaxSpeedMetersPerSecond = DriveConstants.kTeleDriveMaxSpeedMetersPerSecond;
    public static final double kMaxAngularSpeedRadiansPerSecond =  DriveConstants.kTeleDriveMaxAngularSpeedRadiansPerSecond;
    public static final double kMaxAccelerationMetersPerSecondSquared = DriveConstants.kTeleDriveMaxAccelerationUnitsPerSecond;
    public static final double kMaxAngularAccelerationUnitsPerSecond = DriveConstants.kTeleDriveMaxAngularAccelerationUnitsPerSecond;
    public static final double kPXController = 0.025;
    public static final double kPYController = 0.025;
    public static final double kPThetaController = 0.025;

    public static final HashMap<String, Command> AUTO_EVENT_MAP = new HashMap<>();

    public static final TrapezoidProfile.Constraints kThetaControllerConstraints = 
            new TrapezoidProfile.Constraints(
                    kMaxAngularSpeedRadiansPerSecond,
                    kMaxAngularAccelerationUnitsPerSecond);
  }


  public static final class PneumaticsConstants {
    //TODO Figure these out
   }

public static final class intakeConstants {
//TODO Change these cause they are gonna be wrong
  public static final int intakePair1Encoder = 13;
  public static final int intakePair2Encoder = 14;
  public static final int handoffEncoder = 15;

  public static final double ramp_rate = 0.5;

  public static final boolean pair1Inverted = false;
  public static final boolean pair2Inverted = false;
  public static final boolean handoffInverted = false;

  public static final double kP_Intake = 0.05;
  public static final double kI_Intake = 0;
  public static final double kD_Intake = 0;

  public static final double kP_Handoff = 0.05;
  public static final double kI_Handoff = 0;
  public static final double kD_Handoff = 0;

}

public static final class limelightConstants{
public static final double kP = 0.05;
public static final double kI = 0;
public static final double kD = 0;

}


}
