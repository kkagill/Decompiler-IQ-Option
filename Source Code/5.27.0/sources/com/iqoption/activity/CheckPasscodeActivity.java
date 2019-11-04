package com.iqoption.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.iqoption.core.c.a;
import com.iqoption.fragment.account.security.touchId.PasscodeFragment;
import com.iqoption.fragment.account.security.touchId.PasscodeFragment.PasscodeScreen;
import com.iqoption.fragment.account.security.touchId.PasscodeFragment.b;
import com.iqoption.x.R;

public class CheckPasscodeActivity extends AppCompatActivity implements b {
    private static final String TAG = "com.iqoption.activity.CheckPasscodeActivity";

    public void zH() {
    }

    public static void aG(Context context) {
        context.startActivity(new Intent(context, CheckPasscodeActivity.class));
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_passcode);
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().add(16908290, PasscodeFragment.a(PasscodeScreen.passcodeVerificationOnLogin)).commit();
        }
    }

    public boolean a(PasscodeFragment passcodeFragment, PasscodeScreen passcodeScreen, long j) {
        if (!PasscodeFragment.c(this, j)) {
            return false;
        }
        a.biN.postDelayed(new Runnable() {
            public void run() {
                CheckPasscodeActivity.this.zI();
            }
        }, (long) PasscodeFragment.cZV);
        return true;
    }

    public void zG() {
        zI();
    }

    private void zI() {
        PasscodeFragment.bv(this);
        finish();
        zJ();
    }

    private void zJ() {
        startActivity(getPackageManager().getLaunchIntentForPackage(getPackageName()));
    }

    public void onBackPressed() {
        finish();
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        super.onStop();
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
    }
}
