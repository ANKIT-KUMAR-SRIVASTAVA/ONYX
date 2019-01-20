package com.as.ankitshubham.onyx.mylibrary.animations;

import com.as.ankitshubham.onyx.mylibrary.contants.TYPE;
import com.as.ankitshubham.onyx.mylibrary.interfaces.ISurfaceAnimation;

/**
 * Created by Eugene Levenetc.
 */
public class Sequential extends AnimationsSet {
	public Sequential(ISurfaceAnimation... animations) {
		super(TYPE.SEQUENTIAL, animations);
	}
}
