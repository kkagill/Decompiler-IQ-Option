package com.microblink.secured;

import androidx.annotation.UiThread;
import com.microblink.hardware.camera.CameraType;

/* compiled from: line */
public interface t extends com.microblink.hardware.a.a {

    /* compiled from: line */
    public interface a {
    }

    boolean bel();

    CameraType getOpenedCameraType();

    @UiThread
    void setZoomLevel(float f);
}
