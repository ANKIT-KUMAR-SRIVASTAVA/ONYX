package com.as.ankitshubham.onyx.mylibrary.interfaces;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.as.ankitshubham.onyx.mylibrary.TextSurface;

/**
 * Created by Eugene Levenetc.
 */
public interface ISurfaceAnimation {

	void onStart();

	void start(@Nullable IEndListener listener);

	void setTextSurface(@NonNull TextSurface textSurface);

	long getDuration();

	void cancel();

}
