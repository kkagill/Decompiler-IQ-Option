package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.common.a.b;
import com.facebook.common.a.c;
import com.facebook.internal.e;
import com.facebook.internal.u;
import com.facebook.internal.z;
import com.facebook.login.h;
import com.facebook.share.a.a;

public class FacebookActivity extends FragmentActivity {
    private static final String TAG = "com.facebook.FacebookActivity";
    public static String tf = "PassThrough";
    private static String tg = "SingleFragment";
    private Fragment th;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!f.isInitialized()) {
            z.G(TAG, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            f.L(getApplicationContext());
        }
        setContentView(c.com_facebook_activity_layout);
        if (tf.equals(intent.getAction())) {
            gJ();
        } else {
            this.th = gH();
        }
    }

    /* Access modifiers changed, original: protected */
    public Fragment gH() {
        Intent intent = getIntent();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(tg);
        if (findFragmentByTag != null) {
            return findFragmentByTag;
        }
        if ("FacebookDialogFragment".equals(intent.getAction())) {
            findFragmentByTag = new e();
            findFragmentByTag.setRetainInstance(true);
            findFragmentByTag.show(supportFragmentManager, tg);
            return findFragmentByTag;
        }
        if ("DeviceShareDialogFragment".equals(intent.getAction())) {
            findFragmentByTag = new a();
            findFragmentByTag.setRetainInstance(true);
            findFragmentByTag.a((com.facebook.share.b.a) intent.getParcelableExtra("content"));
            findFragmentByTag.show(supportFragmentManager, tg);
            return findFragmentByTag;
        }
        h hVar = new h();
        hVar.setRetainInstance(true);
        supportFragmentManager.beginTransaction().add(b.com_facebook_fragment_container, hVar, tg).commit();
        return hVar;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.th;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    public Fragment gI() {
        return this.th;
    }

    private void gJ() {
        setResult(0, u.a(getIntent(), null, u.l(u.f(getIntent()))));
        finish();
    }
}
