package com.jumio.nv;

public interface NetverifyInitiateCallback {
    void onNetverifyInitiateError(String str, String str2, boolean z);

    void onNetverifyInitiateSuccess();
}
