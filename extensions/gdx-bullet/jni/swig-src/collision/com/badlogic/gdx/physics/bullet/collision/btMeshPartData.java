/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btMeshPartData extends BulletBase {
	private long swigCPtr;
	
	protected btMeshPartData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btMeshPartData, normally you should not need this constructor it's intended for low-level usage. */ 
	public btMeshPartData(long cPtr, boolean cMemoryOwn) {
		this("btMeshPartData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btMeshPartData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btMeshPartData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setVertices3f(btVector3FloatData value) {
    CollisionJNI.btMeshPartData_vertices3f_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getVertices3f() {
    long cPtr = CollisionJNI.btMeshPartData_vertices3f_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setVertices3d(btVector3DoubleData value) {
    CollisionJNI.btMeshPartData_vertices3d_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getVertices3d() {
    long cPtr = CollisionJNI.btMeshPartData_vertices3d_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setIndices32(btIntIndexData value) {
    CollisionJNI.btMeshPartData_indices32_set(swigCPtr, this, btIntIndexData.getCPtr(value), value);
  }

  public btIntIndexData getIndices32() {
    long cPtr = CollisionJNI.btMeshPartData_indices32_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btIntIndexData(cPtr, false);
  }

  public void set3indices16(btShortIntIndexTripletData value) {
    CollisionJNI.btMeshPartData_3indices16_set(swigCPtr, this, btShortIntIndexTripletData.getCPtr(value), value);
  }

  public btShortIntIndexTripletData get3indices16() {
    long cPtr = CollisionJNI.btMeshPartData_3indices16_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btShortIntIndexTripletData(cPtr, false);
  }

  public void set3indices8(btCharIndexTripletData value) {
    CollisionJNI.btMeshPartData_3indices8_set(swigCPtr, this, btCharIndexTripletData.getCPtr(value), value);
  }

  public btCharIndexTripletData get3indices8() {
    long cPtr = CollisionJNI.btMeshPartData_3indices8_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btCharIndexTripletData(cPtr, false);
  }

  public void setIndices16(btShortIntIndexData value) {
    CollisionJNI.btMeshPartData_indices16_set(swigCPtr, this, btShortIntIndexData.getCPtr(value), value);
  }

  public btShortIntIndexData getIndices16() {
    long cPtr = CollisionJNI.btMeshPartData_indices16_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btShortIntIndexData(cPtr, false);
  }

  public void setNumTriangles(int value) {
    CollisionJNI.btMeshPartData_numTriangles_set(swigCPtr, this, value);
  }

  public int getNumTriangles() {
    return CollisionJNI.btMeshPartData_numTriangles_get(swigCPtr, this);
  }

  public void setNumVertices(int value) {
    CollisionJNI.btMeshPartData_numVertices_set(swigCPtr, this, value);
  }

  public int getNumVertices() {
    return CollisionJNI.btMeshPartData_numVertices_get(swigCPtr, this);
  }

  public btMeshPartData() {
    this(CollisionJNI.new_btMeshPartData(), true);
  }

}
