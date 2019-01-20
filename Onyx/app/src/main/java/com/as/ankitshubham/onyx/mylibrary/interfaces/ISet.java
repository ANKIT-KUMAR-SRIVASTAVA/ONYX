package com.as.ankitshubham.onyx.mylibrary.interfaces;

import com.as.ankitshubham.onyx.mylibrary.contants.TYPE;

import java.util.LinkedList;

/**
 * Created by Eugene Levenetc.
 */
public interface ISet extends ISurfaceAnimation {
	TYPE getType();

	LinkedList<ISurfaceAnimation> getAnimations();
}
