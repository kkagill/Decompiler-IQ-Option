package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;

/* compiled from: com.google.firebase:firebase-common@@17.0.0 */
public class FirebaseInitProvider extends ContentProvider {
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Nullable
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Nullable
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    public boolean onCreate() {
        String str = "FirebaseInitProvider";
        if (FirebaseApp.au(getContext()) == null) {
            Log.i(str, "FirebaseApp initialization unsuccessful");
        } else {
            Log.i(str, "FirebaseApp initialization successful");
        }
        return false;
    }

    private static void a(@NonNull ProviderInfo providerInfo) {
        Preconditions.checkNotNull(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }
}
