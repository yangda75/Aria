/*
Adept MobileRobots Robotics Interface for Applications (ARIA)
Copyright (C) 2004-2005 ActivMedia Robotics LLC
Copyright (C) 2006-2010 MobileRobots Inc.
Copyright (C) 2011-2014 Adept Technology

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
Adept MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; +1-603-881-7960
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArRobotParams extends ArConfig {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArRobotParams(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArRobotParamsUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArRobotParams obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArRobotParams(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArRobotParams() {
    this(AriaJavaJNI.new_ArRobotParams(), true);
  }

  public String getClassName() {
    return AriaJavaJNI.ArRobotParams_getClassName(swigCPtr, this);
  }

  public String getSubClassName() {
    return AriaJavaJNI.ArRobotParams_getSubClassName(swigCPtr, this);
  }

  public double getRobotRadius() {
    return AriaJavaJNI.ArRobotParams_getRobotRadius(swigCPtr, this);
  }

  public double getRobotDiagonal() {
    return AriaJavaJNI.ArRobotParams_getRobotDiagonal(swigCPtr, this);
  }

  public double getRobotWidth() {
    return AriaJavaJNI.ArRobotParams_getRobotWidth(swigCPtr, this);
  }

  public double getRobotLength() {
    return AriaJavaJNI.ArRobotParams_getRobotLength(swigCPtr, this);
  }

  public double getRobotLengthFront() {
    return AriaJavaJNI.ArRobotParams_getRobotLengthFront(swigCPtr, this);
  }

  public double getRobotLengthRear() {
    return AriaJavaJNI.ArRobotParams_getRobotLengthRear(swigCPtr, this);
  }

  public boolean isHolonomic() {
    return AriaJavaJNI.ArRobotParams_isHolonomic(swigCPtr, this);
  }

  public boolean hasMoveCommand() {
    return AriaJavaJNI.ArRobotParams_hasMoveCommand(swigCPtr, this);
  }

  public int getAbsoluteMaxVelocity() {
    return AriaJavaJNI.ArRobotParams_getAbsoluteMaxVelocity(swigCPtr, this);
  }

  public int getAbsoluteMaxRotVelocity() {
    return AriaJavaJNI.ArRobotParams_getAbsoluteMaxRotVelocity(swigCPtr, this);
  }

  public int getAbsoluteMaxLatVelocity() {
    return AriaJavaJNI.ArRobotParams_getAbsoluteMaxLatVelocity(swigCPtr, this);
  }

  public boolean getRequestIOPackets() {
    return AriaJavaJNI.ArRobotParams_getRequestIOPackets(swigCPtr, this);
  }

  public boolean getRequestEncoderPackets() {
    return AriaJavaJNI.ArRobotParams_getRequestEncoderPackets(swigCPtr, this);
  }

  public int getSwitchToBaudRate() {
    return AriaJavaJNI.ArRobotParams_getSwitchToBaudRate(swigCPtr, this);
  }

  public double getAngleConvFactor() {
    return AriaJavaJNI.ArRobotParams_getAngleConvFactor(swigCPtr, this);
  }

  public double getDistConvFactor() {
    return AriaJavaJNI.ArRobotParams_getDistConvFactor(swigCPtr, this);
  }

  public double getVelConvFactor() {
    return AriaJavaJNI.ArRobotParams_getVelConvFactor(swigCPtr, this);
  }

  public double getRangeConvFactor() {
    return AriaJavaJNI.ArRobotParams_getRangeConvFactor(swigCPtr, this);
  }

  public double getDiffConvFactor() {
    return AriaJavaJNI.ArRobotParams_getDiffConvFactor(swigCPtr, this);
  }

  public double getVel2Divisor() {
    return AriaJavaJNI.ArRobotParams_getVel2Divisor(swigCPtr, this);
  }

  public double getGyroScaler() {
    return AriaJavaJNI.ArRobotParams_getGyroScaler(swigCPtr, this);
  }

  public boolean haveTableSensingIR() {
    return AriaJavaJNI.ArRobotParams_haveTableSensingIR(swigCPtr, this);
  }

  public boolean haveNewTableSensingIR() {
    return AriaJavaJNI.ArRobotParams_haveNewTableSensingIR(swigCPtr, this);
  }

  public boolean haveFrontBumpers() {
    return AriaJavaJNI.ArRobotParams_haveFrontBumpers(swigCPtr, this);
  }

  public int numFrontBumpers() {
    return AriaJavaJNI.ArRobotParams_numFrontBumpers(swigCPtr, this);
  }

  public boolean haveRearBumpers() {
    return AriaJavaJNI.ArRobotParams_haveRearBumpers(swigCPtr, this);
  }

  public int numRearBumpers() {
    return AriaJavaJNI.ArRobotParams_numRearBumpers(swigCPtr, this);
  }

  public int getNumIR() {
    return AriaJavaJNI.ArRobotParams_getNumIR(swigCPtr, this);
  }

  public boolean haveIR(int number) {
    return AriaJavaJNI.ArRobotParams_haveIR(swigCPtr, this, number);
  }

  public int getIRX(int number) {
    return AriaJavaJNI.ArRobotParams_getIRX(swigCPtr, this, number);
  }

  public int getIRY(int number) {
    return AriaJavaJNI.ArRobotParams_getIRY(swigCPtr, this, number);
  }

  public int getIRType(int number) {
    return AriaJavaJNI.ArRobotParams_getIRType(swigCPtr, this, number);
  }

  public int getIRCycles(int number) {
    return AriaJavaJNI.ArRobotParams_getIRCycles(swigCPtr, this, number);
  }

  public int getNumSonar() {
    return AriaJavaJNI.ArRobotParams_getNumSonar(swigCPtr, this);
  }

  public boolean getLaserPossessed() {
    return AriaJavaJNI.ArRobotParams_getLaserPossessed(swigCPtr, this);
  }

  public String getLaserType(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserType__SWIG_0(swigCPtr, this, laserNumber);
  }

  public String getLaserType() {
    return AriaJavaJNI.ArRobotParams_getLaserType__SWIG_1(swigCPtr, this);
  }

  public String getLaserPortType(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserPortType__SWIG_0(swigCPtr, this, laserNumber);
  }

  public String getLaserPortType() {
    return AriaJavaJNI.ArRobotParams_getLaserPortType__SWIG_1(swigCPtr, this);
  }

  public String getLaserPort(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserPort__SWIG_0(swigCPtr, this, laserNumber);
  }

  public String getLaserPort() {
    return AriaJavaJNI.ArRobotParams_getLaserPort__SWIG_1(swigCPtr, this);
  }

  public boolean getConnectLaser(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getConnectLaser__SWIG_0(swigCPtr, this, laserNumber);
  }

  public boolean getConnectLaser() {
    return AriaJavaJNI.ArRobotParams_getConnectLaser__SWIG_1(swigCPtr, this);
  }

  public boolean getLaserFlipped(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserFlipped__SWIG_0(swigCPtr, this, laserNumber);
  }

  public boolean getLaserFlipped() {
    return AriaJavaJNI.ArRobotParams_getLaserFlipped__SWIG_1(swigCPtr, this);
  }

  public boolean getLaserPowerControlled(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserPowerControlled__SWIG_0(swigCPtr, this, laserNumber);
  }

  public boolean getLaserPowerControlled() {
    return AriaJavaJNI.ArRobotParams_getLaserPowerControlled__SWIG_1(swigCPtr, this);
  }

  public int getLaserMaxRange(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserMaxRange__SWIG_0(swigCPtr, this, laserNumber);
  }

  public int getLaserMaxRange() {
    return AriaJavaJNI.ArRobotParams_getLaserMaxRange__SWIG_1(swigCPtr, this);
  }

  public int getLaserCumulativeBufferSize(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserCumulativeBufferSize__SWIG_0(swigCPtr, this, laserNumber);
  }

  public int getLaserCumulativeBufferSize() {
    return AriaJavaJNI.ArRobotParams_getLaserCumulativeBufferSize__SWIG_1(swigCPtr, this);
  }

  public int getLaserX(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserX__SWIG_0(swigCPtr, this, laserNumber);
  }

  public int getLaserX() {
    return AriaJavaJNI.ArRobotParams_getLaserX__SWIG_1(swigCPtr, this);
  }

  public int getLaserY(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserY__SWIG_0(swigCPtr, this, laserNumber);
  }

  public int getLaserY() {
    return AriaJavaJNI.ArRobotParams_getLaserY__SWIG_1(swigCPtr, this);
  }

  public double getLaserTh(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserTh__SWIG_0(swigCPtr, this, laserNumber);
  }

  public double getLaserTh() {
    return AriaJavaJNI.ArRobotParams_getLaserTh__SWIG_1(swigCPtr, this);
  }

  public int getLaserZ(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserZ__SWIG_0(swigCPtr, this, laserNumber);
  }

  public int getLaserZ() {
    return AriaJavaJNI.ArRobotParams_getLaserZ__SWIG_1(swigCPtr, this);
  }

  public String getLaserIgnore(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserIgnore__SWIG_0(swigCPtr, this, laserNumber);
  }

  public String getLaserIgnore() {
    return AriaJavaJNI.ArRobotParams_getLaserIgnore__SWIG_1(swigCPtr, this);
  }

  public String getLaserStartDegrees(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserStartDegrees__SWIG_0(swigCPtr, this, laserNumber);
  }

  public String getLaserStartDegrees() {
    return AriaJavaJNI.ArRobotParams_getLaserStartDegrees__SWIG_1(swigCPtr, this);
  }

  public String getLaserEndDegrees(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserEndDegrees__SWIG_0(swigCPtr, this, laserNumber);
  }

  public String getLaserEndDegrees() {
    return AriaJavaJNI.ArRobotParams_getLaserEndDegrees__SWIG_1(swigCPtr, this);
  }

  public String getLaserDegreesChoice(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserDegreesChoice__SWIG_0(swigCPtr, this, laserNumber);
  }

  public String getLaserDegreesChoice() {
    return AriaJavaJNI.ArRobotParams_getLaserDegreesChoice__SWIG_1(swigCPtr, this);
  }

  public String getLaserIncrement(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserIncrement__SWIG_0(swigCPtr, this, laserNumber);
  }

  public String getLaserIncrement() {
    return AriaJavaJNI.ArRobotParams_getLaserIncrement__SWIG_1(swigCPtr, this);
  }

  public String getLaserIncrementChoice(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserIncrementChoice__SWIG_0(swigCPtr, this, laserNumber);
  }

  public String getLaserIncrementChoice() {
    return AriaJavaJNI.ArRobotParams_getLaserIncrementChoice__SWIG_1(swigCPtr, this);
  }

  public String getLaserUnitsChoice(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserUnitsChoice__SWIG_0(swigCPtr, this, laserNumber);
  }

  public String getLaserUnitsChoice() {
    return AriaJavaJNI.ArRobotParams_getLaserUnitsChoice__SWIG_1(swigCPtr, this);
  }

  public String getLaserReflectorBitsChoice(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserReflectorBitsChoice__SWIG_0(swigCPtr, this, laserNumber);
  }

  public String getLaserReflectorBitsChoice() {
    return AriaJavaJNI.ArRobotParams_getLaserReflectorBitsChoice__SWIG_1(swigCPtr, this);
  }

  public String getLaserStartingBaudChoice(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserStartingBaudChoice__SWIG_0(swigCPtr, this, laserNumber);
  }

  public String getLaserStartingBaudChoice() {
    return AriaJavaJNI.ArRobotParams_getLaserStartingBaudChoice__SWIG_1(swigCPtr, this);
  }

  public String getLaserAutoBaudChoice(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserAutoBaudChoice__SWIG_0(swigCPtr, this, laserNumber);
  }

  public String getLaserAutoBaudChoice() {
    return AriaJavaJNI.ArRobotParams_getLaserAutoBaudChoice__SWIG_1(swigCPtr, this);
  }

  public String getLaserSection(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserSection__SWIG_0(swigCPtr, this, laserNumber);
  }

  public String getLaserSection() {
    return AriaJavaJNI.ArRobotParams_getLaserSection__SWIG_1(swigCPtr, this);
  }

  public String getLaserPowerOutput(int laserNumber) {
    return AriaJavaJNI.ArRobotParams_getLaserPowerOutput__SWIG_0(swigCPtr, this, laserNumber);
  }

  public String getLaserPowerOutput() {
    return AriaJavaJNI.ArRobotParams_getLaserPowerOutput__SWIG_1(swigCPtr, this);
  }

  public String getBatteryMTXBoardType(int batteryNumber) {
    return AriaJavaJNI.ArRobotParams_getBatteryMTXBoardType__SWIG_0(swigCPtr, this, batteryNumber);
  }

  public String getBatteryMTXBoardType() {
    return AriaJavaJNI.ArRobotParams_getBatteryMTXBoardType__SWIG_1(swigCPtr, this);
  }

  public String getBatteryMTXBoardPortType(int batteryNumber) {
    return AriaJavaJNI.ArRobotParams_getBatteryMTXBoardPortType__SWIG_0(swigCPtr, this, batteryNumber);
  }

  public String getBatteryMTXBoardPortType() {
    return AriaJavaJNI.ArRobotParams_getBatteryMTXBoardPortType__SWIG_1(swigCPtr, this);
  }

  public String getBatteryMTXBoardPort(int batteryNumber) {
    return AriaJavaJNI.ArRobotParams_getBatteryMTXBoardPort__SWIG_0(swigCPtr, this, batteryNumber);
  }

  public String getBatteryMTXBoardPort() {
    return AriaJavaJNI.ArRobotParams_getBatteryMTXBoardPort__SWIG_1(swigCPtr, this);
  }

  public int getBatteryMTXBoardBaud(int batteryNumber) {
    return AriaJavaJNI.ArRobotParams_getBatteryMTXBoardBaud__SWIG_0(swigCPtr, this, batteryNumber);
  }

  public int getBatteryMTXBoardBaud() {
    return AriaJavaJNI.ArRobotParams_getBatteryMTXBoardBaud__SWIG_1(swigCPtr, this);
  }

  public boolean getBatteryMTXBoardAutoConn(int batteryNumber) {
    return AriaJavaJNI.ArRobotParams_getBatteryMTXBoardAutoConn__SWIG_0(swigCPtr, this, batteryNumber);
  }

  public boolean getBatteryMTXBoardAutoConn() {
    return AriaJavaJNI.ArRobotParams_getBatteryMTXBoardAutoConn__SWIG_1(swigCPtr, this);
  }

  public String getLCDMTXBoardType(int lcdNumber) {
    return AriaJavaJNI.ArRobotParams_getLCDMTXBoardType__SWIG_0(swigCPtr, this, lcdNumber);
  }

  public String getLCDMTXBoardType() {
    return AriaJavaJNI.ArRobotParams_getLCDMTXBoardType__SWIG_1(swigCPtr, this);
  }

  public String getLCDMTXBoardPortType(int lcdNumber) {
    return AriaJavaJNI.ArRobotParams_getLCDMTXBoardPortType__SWIG_0(swigCPtr, this, lcdNumber);
  }

  public String getLCDMTXBoardPortType() {
    return AriaJavaJNI.ArRobotParams_getLCDMTXBoardPortType__SWIG_1(swigCPtr, this);
  }

  public String getLCDMTXBoardPort(int lcdNumber) {
    return AriaJavaJNI.ArRobotParams_getLCDMTXBoardPort__SWIG_0(swigCPtr, this, lcdNumber);
  }

  public String getLCDMTXBoardPort() {
    return AriaJavaJNI.ArRobotParams_getLCDMTXBoardPort__SWIG_1(swigCPtr, this);
  }

  public int getLCDMTXBoardBaud(int lcdNumber) {
    return AriaJavaJNI.ArRobotParams_getLCDMTXBoardBaud__SWIG_0(swigCPtr, this, lcdNumber);
  }

  public int getLCDMTXBoardBaud() {
    return AriaJavaJNI.ArRobotParams_getLCDMTXBoardBaud__SWIG_1(swigCPtr, this);
  }

  public boolean getLCDMTXBoardAutoConn(int lcdNumber) {
    return AriaJavaJNI.ArRobotParams_getLCDMTXBoardAutoConn__SWIG_0(swigCPtr, this, lcdNumber);
  }

  public boolean getLCDMTXBoardAutoConn() {
    return AriaJavaJNI.ArRobotParams_getLCDMTXBoardAutoConn__SWIG_1(swigCPtr, this);
  }

  public boolean getLCDMTXBoardConnFailOption(int lcdNumber) {
    return AriaJavaJNI.ArRobotParams_getLCDMTXBoardConnFailOption__SWIG_0(swigCPtr, this, lcdNumber);
  }

  public boolean getLCDMTXBoardConnFailOption() {
    return AriaJavaJNI.ArRobotParams_getLCDMTXBoardConnFailOption__SWIG_1(swigCPtr, this);
  }

  public String getLCDMTXBoardPowerOutput(int lcdNumber) {
    return AriaJavaJNI.ArRobotParams_getLCDMTXBoardPowerOutput__SWIG_0(swigCPtr, this, lcdNumber);
  }

  public String getLCDMTXBoardPowerOutput() {
    return AriaJavaJNI.ArRobotParams_getLCDMTXBoardPowerOutput__SWIG_1(swigCPtr, this);
  }

  public String getSonarMTXBoardType(int sonarNumber) {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardType__SWIG_0(swigCPtr, this, sonarNumber);
  }

  public String getSonarMTXBoardType() {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardType__SWIG_1(swigCPtr, this);
  }

  public String getSonarMTXBoardPortType(int sonarNumber) {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardPortType__SWIG_0(swigCPtr, this, sonarNumber);
  }

  public String getSonarMTXBoardPortType() {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardPortType__SWIG_1(swigCPtr, this);
  }

  public String getSonarMTXBoardPort(int sonarNumber) {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardPort__SWIG_0(swigCPtr, this, sonarNumber);
  }

  public String getSonarMTXBoardPort() {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardPort__SWIG_1(swigCPtr, this);
  }

  public int getSonarMTXBoardBaud(int sonarNumber) {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardBaud__SWIG_0(swigCPtr, this, sonarNumber);
  }

  public int getSonarMTXBoardBaud() {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardBaud__SWIG_1(swigCPtr, this);
  }

  public boolean getSonarMTXBoardAutoConn(int sonarNumber) {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardAutoConn__SWIG_0(swigCPtr, this, sonarNumber);
  }

  public boolean getSonarMTXBoardAutoConn() {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardAutoConn__SWIG_1(swigCPtr, this);
  }

  public int getSonarMTXBoardDelay(int sonarBoardNum) {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardDelay__SWIG_0(swigCPtr, this, sonarBoardNum);
  }

  public int getSonarMTXBoardDelay() {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardDelay__SWIG_1(swigCPtr, this);
  }

  public int getSonarMTXBoardGain(int sonarBoardNum) {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardGain__SWIG_0(swigCPtr, this, sonarBoardNum);
  }

  public int getSonarMTXBoardGain() {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardGain__SWIG_1(swigCPtr, this);
  }

  public int getSonarMTXBoardDetectionThreshold(int sonarBoardNum) {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardDetectionThreshold__SWIG_0(swigCPtr, this, sonarBoardNum);
  }

  public int getSonarMTXBoardDetectionThreshold() {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardDetectionThreshold__SWIG_1(swigCPtr, this);
  }

  public int getSonarMTXBoardMaxRange(int sonarBoardNum) {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardMaxRange__SWIG_0(swigCPtr, this, sonarBoardNum);
  }

  public int getSonarMTXBoardMaxRange() {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardMaxRange__SWIG_1(swigCPtr, this);
  }

  public int getSonarMTXBoardUseForAutonomousDriving(int sonarBoardNum) {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardUseForAutonomousDriving__SWIG_0(swigCPtr, this, sonarBoardNum);
  }

  public int getSonarMTXBoardUseForAutonomousDriving() {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardUseForAutonomousDriving__SWIG_1(swigCPtr, this);
  }

  public String getSonarMTXBoardPowerOutput(int sonarBoardNum) {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardPowerOutput__SWIG_0(swigCPtr, this, sonarBoardNum);
  }

  public String getSonarMTXBoardPowerOutput() {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardPowerOutput__SWIG_1(swigCPtr, this);
  }

  public int getNumSonarOnMTXBoard(int sonarBoardNum) {
    return AriaJavaJNI.ArRobotParams_getNumSonarOnMTXBoard__SWIG_0(swigCPtr, this, sonarBoardNum);
  }

  public int getNumSonarOnMTXBoard() {
    return AriaJavaJNI.ArRobotParams_getNumSonarOnMTXBoard__SWIG_1(swigCPtr, this);
  }

  public int getNumSonarUnits() {
    return AriaJavaJNI.ArRobotParams_getNumSonarUnits(swigCPtr, this);
  }

  public boolean haveSonar(int boardNum) {
    return AriaJavaJNI.ArRobotParams_haveSonar(swigCPtr, this, boardNum);
  }

  public int getSonarX(int number) {
    return AriaJavaJNI.ArRobotParams_getSonarX(swigCPtr, this, number);
  }

  public int getSonarY(int number) {
    return AriaJavaJNI.ArRobotParams_getSonarY(swigCPtr, this, number);
  }

  public int getSonarTh(int number) {
    return AriaJavaJNI.ArRobotParams_getSonarTh(swigCPtr, this, number);
  }

  public int getSonarGain(int number) {
    return AriaJavaJNI.ArRobotParams_getSonarGain(swigCPtr, this, number);
  }

  public int getSonarDetectionThreshold(int number) {
    return AriaJavaJNI.ArRobotParams_getSonarDetectionThreshold(swigCPtr, this, number);
  }

  public int getSonarMaxRange(int number) {
    return AriaJavaJNI.ArRobotParams_getSonarMaxRange(swigCPtr, this, number);
  }

  public int getSonarUseForAutonomousDriving(int number) {
    return AriaJavaJNI.ArRobotParams_getSonarUseForAutonomousDriving(swigCPtr, this, number);
  }

  public int getSonarMTXBoard(int number) {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoard(swigCPtr, this, number);
  }

  public int getSonarMTXBoardUnitPosition(int number) {
    return AriaJavaJNI.ArRobotParams_getSonarMTXBoardUnitPosition(swigCPtr, this, number);
  }

  public boolean hasSettableVelMaxes() {
    return AriaJavaJNI.ArRobotParams_hasSettableVelMaxes(swigCPtr, this);
  }

  public int getTransVelMax() {
    return AriaJavaJNI.ArRobotParams_getTransVelMax(swigCPtr, this);
  }

  public int getRotVelMax() {
    return AriaJavaJNI.ArRobotParams_getRotVelMax(swigCPtr, this);
  }

  public boolean hasSettableAccsDecs() {
    return AriaJavaJNI.ArRobotParams_hasSettableAccsDecs(swigCPtr, this);
  }

  public int getTransAccel() {
    return AriaJavaJNI.ArRobotParams_getTransAccel(swigCPtr, this);
  }

  public int getTransDecel() {
    return AriaJavaJNI.ArRobotParams_getTransDecel(swigCPtr, this);
  }

  public int getRotAccel() {
    return AriaJavaJNI.ArRobotParams_getRotAccel(swigCPtr, this);
  }

  public int getRotDecel() {
    return AriaJavaJNI.ArRobotParams_getRotDecel(swigCPtr, this);
  }

  public boolean hasLatVel() {
    return AriaJavaJNI.ArRobotParams_hasLatVel(swigCPtr, this);
  }

  public int getLatVelMax() {
    return AriaJavaJNI.ArRobotParams_getLatVelMax(swigCPtr, this);
  }

  public int getLatAccel() {
    return AriaJavaJNI.ArRobotParams_getLatAccel(swigCPtr, this);
  }

  public int getLatDecel() {
    return AriaJavaJNI.ArRobotParams_getLatDecel(swigCPtr, this);
  }

  public boolean save() {
    return AriaJavaJNI.ArRobotParams_save(swigCPtr, this);
  }

  public int getGPSX() {
    return AriaJavaJNI.ArRobotParams_getGPSX(swigCPtr, this);
  }

  public int getGPSY() {
    return AriaJavaJNI.ArRobotParams_getGPSY(swigCPtr, this);
  }

  public int getGPSBaud() {
    return AriaJavaJNI.ArRobotParams_getGPSBaud(swigCPtr, this);
  }

  public String getGPSPort() {
    return AriaJavaJNI.ArRobotParams_getGPSPort(swigCPtr, this);
  }

  public String getGPSType() {
    return AriaJavaJNI.ArRobotParams_getGPSType(swigCPtr, this);
  }

  public String getCompassType() {
    return AriaJavaJNI.ArRobotParams_getCompassType(swigCPtr, this);
  }

  public String getCompassPort() {
    return AriaJavaJNI.ArRobotParams_getCompassPort(swigCPtr, this);
  }

  public SWIGTYPE_p_std__vectorT_ArVideoParams_t getVideoParams() {
    return new SWIGTYPE_p_std__vectorT_ArVideoParams_t(AriaJavaJNI.ArRobotParams_getVideoParams(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__vectorT_ArPTZParams_t getPTZParams() {
    return new SWIGTYPE_p_std__vectorT_ArPTZParams_t(AriaJavaJNI.ArRobotParams_getPTZParams(swigCPtr, this), false);
  }

}
