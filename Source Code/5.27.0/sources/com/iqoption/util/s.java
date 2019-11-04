package com.iqoption.util;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

/* compiled from: FileUtils */
public class s {
    @Nullable
    public static <T> T a(Context context, @RawRes int i, Type type) {
        try {
            return w.aWL().fromJson(new InputStreamReader(context.getResources().openRawResource(i)), type);
        } catch (Exception unused) {
            return null;
        }
    }
}
