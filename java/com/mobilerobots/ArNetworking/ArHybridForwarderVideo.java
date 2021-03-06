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

package com.mobilerobots.ArNetworking;
import com.mobilerobots.Aria.*;
public class ArHybridForwarderVideo extends ArCameraCollectionItem {
  private long swigCPtr;

  /* for internal use by swig only */
  public ArHybridForwarderVideo(long cPtr, boolean cMemoryOwn) {
    super(ArNetworkingJavaJNI.SWIGArHybridForwarderVideoUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArHybridForwarderVideo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ArNetworkingJavaJNI.delete_ArHybridForwarderVideo(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArHybridForwarderVideo(ArServerBase server, ArClientBase client) {
    this(ArNetworkingJavaJNI.new_ArHybridForwarderVideo__SWIG_0(ArServerBase.getCPtr(server), server, ArClientBase.getCPtr(client), client), true);
  }

  public ArHybridForwarderVideo(ArServerBase server, String hostname, int port) {
    this(ArNetworkingJavaJNI.new_ArHybridForwarderVideo__SWIG_1(ArServerBase.getCPtr(server), server, hostname, port), true);
  }

  public ArHybridForwarderVideo(ArServerBase server, String hostname) {
    this(ArNetworkingJavaJNI.new_ArHybridForwarderVideo__SWIG_2(ArServerBase.getCPtr(server), server, hostname), true);
  }

  public ArHybridForwarderVideo(ArServerBase server) {
    this(ArNetworkingJavaJNI.new_ArHybridForwarderVideo__SWIG_3(ArServerBase.getCPtr(server), server), true);
  }

  public boolean isForwardingVideo() {
    return ArNetworkingJavaJNI.ArHybridForwarderVideo_isForwardingVideo(swigCPtr, this);
  }

  public String getCameraName() {
    return ArNetworkingJavaJNI.ArHybridForwarderVideo_getCameraName(swigCPtr, this);
  }

  public void setCameraName(String cameraName) {
    ArNetworkingJavaJNI.ArHybridForwarderVideo_setCameraName(swigCPtr, this, cameraName);
  }

  public void addToCameraCollection(ArCameraCollection collection) {
    ArNetworkingJavaJNI.ArHybridForwarderVideo_addToCameraCollection(swigCPtr, this, ArCameraCollection.getCPtr(collection), collection);
  }

  public void sendVideoSize(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArHybridForwarderVideo_sendVideoSize(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void sendVideo(ArServerClient client, ArNetPacket packet) {
    ArNetworkingJavaJNI.ArHybridForwarderVideo_sendVideo(swigCPtr, this, ArServerClient.getCPtr(client), client, ArNetPacket.getCPtr(packet), packet);
  }

  public void receiveVideoSize(ArNetPacket packet) {
    ArNetworkingJavaJNI.ArHybridForwarderVideo_receiveVideoSize(swigCPtr, this, ArNetPacket.getCPtr(packet), packet);
  }

  public void receiveVideo(ArNetPacket packet) {
    ArNetworkingJavaJNI.ArHybridForwarderVideo_receiveVideo(swigCPtr, this, ArNetPacket.getCPtr(packet), packet);
  }

  public void clientCycleCallback() {
    ArNetworkingJavaJNI.ArHybridForwarderVideo_clientCycleCallback(swigCPtr, this);
  }

  public void setVideoRequestTime(int ms) {
    ArNetworkingJavaJNI.ArHybridForwarderVideo_setVideoRequestTime__SWIG_0(swigCPtr, this, ms);
  }

  public int setVideoRequestTime() {
    return ArNetworkingJavaJNI.ArHybridForwarderVideo_setVideoRequestTime__SWIG_1(swigCPtr, this);
  }

}
