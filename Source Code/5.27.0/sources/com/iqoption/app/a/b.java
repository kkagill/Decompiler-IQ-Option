package com.iqoption.app.a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.StringRes;
import androidx.multidex.MultiDexApplication;
import com.iqoption.app.IQApp;
import com.iqoption.app.d;
import com.iqoption.core.c.a;
import com.iqoption.util.aj;
import com.iqoption.x.R;
import io.fabric.sdk.android.c;

/* compiled from: IQBaseApp */
public class b extends MultiDexApplication {
    public static boolean Gp() {
        return d.Fa().Fj();
    }

    public static void dY(String str) {
        a(str, IQApp.Eu(), 1);
    }

    public static void dT(@StringRes int i) {
        a(IQApp.Eu().getString(i), IQApp.Eu(), 0);
    }

    public static void dZ(String str) {
        if (TextUtils.isEmpty(str)) {
            Gq();
        } else {
            a(str, IQApp.Eu(), 0);
        }
    }

    public static void b(String str, Context context) {
        a(str, context, 1);
    }

    public static void a(String str, Context context, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (aj.anH()) {
                Toast.makeText(context, str, i).show();
            } else {
                a.biN.execute(new -$$Lambda$b$rLjKLDpmA_kDVx86mal1cYP3WeE(context, str, i));
            }
        }
    }

    public static void Gq() {
        IQApp Eu = IQApp.Eu();
        b(Eu.getString(R.string.unknown_error_occurred), Eu);
    }

    public static void aQ(Context context) {
        if (context != null) {
            b(context.getString(R.string.unknown_error_occurred), context);
        } else {
            Gq();
        }
    }

    public void onCreate() {
        super.onCreate();
        c.a((Context) this, new com.crashlytics.android.a(), new com.crashlytics.android.ndk.c());
    }
}
