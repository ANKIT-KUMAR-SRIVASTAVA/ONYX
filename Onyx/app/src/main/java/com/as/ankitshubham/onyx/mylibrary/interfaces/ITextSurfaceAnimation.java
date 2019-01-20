package com.as.ankitshubham.onyx.mylibrary.interfaces;

import android.support.annotation.NonNull;

import com.as.ankitshubham.onyx.mylibrary.Text;

/**
 * Created by Eugene Levenetc.
 */
public interface ITextSurfaceAnimation extends ISurfaceAnimation {

	void setInitValues(@NonNull Text text);

	Text getText();

}