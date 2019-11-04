package com.jumio.nv.view.fragment;

import android.view.View;
import com.jumio.commons.utils.DeviceRotationManager;
import com.jumio.nv.extraction.NfcController;
import com.jumio.sdk.view.fragment.IBaseFragmentCallback;

public interface INetverifyFragmentCallback extends IBaseFragmentCallback<INetverifyActivityCallback> {
    void animateActionbar(boolean z, boolean z2, View view, Runnable runnable, Runnable runnable2);

    NfcController getNfcController();

    DeviceRotationManager getRotationManager();

    boolean isRunningTest();
}
