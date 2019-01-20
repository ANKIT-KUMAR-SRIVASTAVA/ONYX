package com.as.ankitshubham.onyx.mylibrary.animations;

import com.as.ankitshubham.onyx.mylibrary.contants.TYPE;
import com.as.ankitshubham.onyx.mylibrary.interfaces.ISurfaceAnimation;

/**
 * Created by Eugene Levenetc.
 */
public class Parallel extends AnimationsSet {
	public Parallel(ISurfaceAnimation... animations) {
		super(TYPE.PARALLEL, animations);
	}
}
