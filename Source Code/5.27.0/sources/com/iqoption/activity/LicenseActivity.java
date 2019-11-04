package com.iqoption.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.iqoption.fragment.account.security.touchId.PasscodeFragment;
import com.iqoption.x.R;

public class LicenseActivity extends AppCompatActivity {
    public static Intent aH(Context context) {
        return new Intent(context, LicenseActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.license_activity);
        ((WebView) findViewById(R.id.content)).loadUrl("file:///android_asset/licenses.html");
    }

    /* Access modifiers changed, original: protected */
    public void onPause() {
        super.onPause();
        PasscodeFragment.bv(this);
    }
}
