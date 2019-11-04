package com.iqoption.app.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.appsflyer.j;
import com.iqoption.app.IQApp;
import com.iqoption.app.c;
import com.iqoption.app.d;
import com.iqoption.core.data.d.b;
import com.iqoption.core.e;
import java.util.Locale;

/* compiled from: IQBaseAccount */
public abstract class a extends c implements e {
    private static final String TAG = "com.iqoption.app.a.a";
    private boolean asT = false;
    private String qO = "";
    private long userId;

    public a(Context context) {
        init(context);
    }

    /* Access modifiers changed, original: protected */
    public void clear() {
        this.qO = "";
        this.userId = -1;
        bv(false);
    }

    public long getUserId() {
        return this.userId;
    }

    public void i(Long l) {
        if (l != null) {
            this.userId = l.longValue();
            StringBuilder stringBuilder = new StringBuilder();
            String str = "time_first_login";
            stringBuilder.append(str);
            stringBuilder.append(l);
            if (d.getLong(stringBuilder.toString()) == 0) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(l);
                d.setLong(stringBuilder.toString(), System.currentTimeMillis());
            }
            com.crashlytics.android.a.ah(l.toString());
            if (com.iqoption.core.data.d.e.bdq.WG()) {
                b.WB().cr(true);
                com.iqoption.core.data.d.e.bdq.cx(false);
            }
        } else {
            this.userId = -1;
            com.crashlytics.android.a.ah("-1");
        }
        j.dq().O(l != null ? String.valueOf(l) : null);
    }

    public void Gn() {
        bv(true);
    }

    public void Go() {
        bv(false);
    }

    public void aM(Context context) {
        Editor edit = d.aP(context).Fb().edit();
        edit.putBoolean("anonym_register_successful", this.asT);
        edit.putString("session_id", this.qO);
        edit.putLong("user_id", this.userId);
        edit.apply();
    }

    private void init(Context context) {
        String str;
        SharedPreferences Fb = d.aP(context).Fb();
        this.asT = Fb.getBoolean("anonym_register_successful", false);
        this.qO = Fb.getString("session_id", "");
        this.userId = Fb.getLong("user_id", -1);
        if (this.userId == -1) {
            str = "unregistered";
        } else {
            str = String.format(Locale.US, "%04d", new Object[]{Long.valueOf(this.userId)});
        }
        com.crashlytics.android.a.ah(str);
    }

    private void bv(boolean z) {
        if (this.asT != z) {
            this.asT = z;
            IQApp.Ex().bd(new com.iqoption.app.b.b.j().setValue(Boolean.valueOf(z)));
        }
    }
}
