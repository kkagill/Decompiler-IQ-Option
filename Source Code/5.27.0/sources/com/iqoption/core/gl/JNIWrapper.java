package com.iqoption.core.gl;

import android.content.res.AssetManager;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Keep
final class JNIWrapper {
    static native long allocChartWindow(int i);

    @Nullable
    static native String getScriptedInstrumentInputs(@NonNull String str);

    @Nullable
    static native String getScriptedInstrumentParams(@NonNull String str, @NonNull String str2);

    static native long getScriptedRuntimeVersion();

    static native void init(@NonNull AssetManager assetManager);

    JNIWrapper() {
    }

    static {
        System.loadLibrary("game");
    }
}
