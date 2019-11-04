package com.iqoption.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieAnimationView;
import com.google.common.util.concurrent.t;
import com.iqoption.core.d;
import com.iqoption.system.c.b;
import com.iqoption.util.Network;
import com.iqoption.util.v;
import com.iqoption.x.R;

public class OfflineActivity extends b {
    private static final String TAG = "com.iqoption.activity.OfflineActivity";
    @Nullable
    private t<Boolean> aiY;

    private static class a extends b<OfflineActivity, Boolean> {
        public a(OfflineActivity offlineActivity) {
            super(offlineActivity);
        }

        /* renamed from: a */
        public void v(@NonNull OfflineActivity offlineActivity, @NonNull Boolean bool) {
            super.v(offlineActivity, bool);
            com.iqoption.util.a.b(offlineActivity, null);
        }
    }

    public static void h(Activity activity) {
        activity.startActivity(new Intent(activity, OfflineActivity.class));
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_offline);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.anim_logo);
        if (d.Un().Dq()) {
            lottieAnimationView.setComposition(com.iqoption.core.splash.a.bFU.akt());
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.Z();
            return;
        }
        lottieAnimationView.setImageDrawable(com.iqoption.core.ext.a.n(this, R.drawable.logo_gray));
    }

    public void onResume() {
        super.onResume();
        if (Network.ebO.aWS()) {
            com.iqoption.util.a.l(this);
            return;
        }
        this.aiY = Network.ebO.aWR();
        v.a(this.aiY, new a(this));
    }

    public void onPause() {
        super.onPause();
        if (v.f(this.aiY)) {
            this.aiY.cancel(true);
            this.aiY = null;
        }
    }

    public void onBackPressed() {
        finishAffinity();
    }
}
