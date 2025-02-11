package com.jumio.dv;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: CloseSdkIntent */
public class a extends Intent {
    public static final Creator<a> CREATOR = new Creator<a>() {
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a();
        }

        /* renamed from: a */
        public a[] newArray(int i) {
            return new a[i];
        }
    };

    public a() {
        super("com.jumio.dv.CLOSE_SDK");
    }

    public a(String str) {
        super("com.jumio.dv.CLOSE_SDK");
        putExtra(DocumentVerificationSDK.EXTRA_SCAN_REFERENCE, str);
        putExtra("com.jumio.dv.RESULT", -1);
    }

    public a(String str, String str2) {
        super("com.jumio.dv.CLOSE_SDK");
        putExtra(DocumentVerificationSDK.EXTRA_ERROR_CODE, str);
        putExtra(DocumentVerificationSDK.EXTRA_ERROR_MESSAGE, str2);
        putExtra("com.jumio.dv.RESULT", 0);
    }

    public static IntentFilter a() {
        return new IntentFilter("com.jumio.dv.CLOSE_SDK");
    }
}
