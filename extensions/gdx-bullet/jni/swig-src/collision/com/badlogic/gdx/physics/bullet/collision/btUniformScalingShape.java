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

public class btUniformScalingShape extends btConvexShape {
	private long swigCPtr;
	
	protected btUniformScalingShape(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btUniformScalingShape_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btUniformScalingShape, normally you should not need this constructor it's intended for low-level usage. */
	public btUniformScalingShape(long cPtr, boolean cMemoryOwn) {
		this("btUniformScalingShape", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btUniformScalingShape_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btUniformScalingShape obj) {
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
				CollisionJNI.delete_btUniformScalingShape(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btUniformScalingShape(btConvexShape convexChildShape, float uniformScalingFactor) {
    this(CollisionJNI.new_btUniformScalingShape(btConvexShape.getCPtr(convexChildShape), convexChildShape, uniformScalingFactor), true);
  }

  public float getUniformScalingFactor() {
    return CollisionJNI.btUniformScalingShape_getUniformScalingFactor(swigCPtr, this);
  }

  public btConvexShape getChildShape() {
    long cPtr = CollisionJNI.btUniformScalingShape_getChildShape__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexShape(cPtr, false);
  }

}
