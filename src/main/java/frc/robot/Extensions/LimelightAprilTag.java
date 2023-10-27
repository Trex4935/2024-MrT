// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Extensions;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants;

public class LimelightAprilTag {

static NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
static NetworkTableEntry tx = table.getEntry("tx");
static NetworkTableEntry ty = table.getEntry("ty");
static NetworkTableEntry ta = table.getEntry("ta");

//read values periodically
static double x = tx.getDouble(0.0);
static double y = ty.getDouble(0.0);
static double area = ta.getDouble(0.0);

//post to smart dashboard periodically
public static void getDistance(){
SmartDashboard.putNumber("LimelightX", x);
SmartDashboard.putNumber("LimelightY", y);
SmartDashboard.putNumber("LimelightArea", area);
}
}