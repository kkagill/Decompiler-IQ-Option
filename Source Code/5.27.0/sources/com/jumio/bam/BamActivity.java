package com.jumio.bam;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.jumio.MobileActivity;
import com.jumio.commons.log.Log;
import com.jumio.commons.view.CompatibilityLayer;
import com.jumio.sdk.models.CredentialsModel;
import java.util.ArrayList;
import jumio.bam.a;
import jumio.bam.ad;
import jumio.bam.ae;
import jumio.bam.af;

public class BamActivity extends MobileActivity implements af {
    private final Object a;
    private ArrayList<Fragment> b;
    private ae c;
    private BroadcastReceiver d;

    public void setUiAutomationString(String str) {
    }

    public BamActivity() {
        this.a = new Object();
        this.b = null;
        this.c = null;
        this.d = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("com.jumio.bam.CLOSE_SDK")) {
                    intent.setAction("");
                    String str = "com.jumio.bam.RESULT";
                    int intExtra = intent.getIntExtra(str, 0);
                    intent.removeExtra(str);
                    BamActivity.this.setResult(intExtra, intent);
                    BamActivity.this.finish();
                }
            }
        };
        this.b = new ArrayList();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setFinishOnTouchOutside(false);
        getWindow().addFlags(8192);
        setContentView(R.layout.activity_bam);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        LocalBroadcastManager.getInstance(this).registerReceiver(this.d, a.a());
        if (bundle == null) {
            getIntent();
            startFragment(new ad(), false, 0, 0);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeActionContentDescription(getString(R.string.jumio_accessibility_quit_scan));
            TypedValue typedValue = new TypedValue();
            getTheme().resolveAttribute(R.attr.colorControlNormal, typedValue, true);
            Drawable drawable = CompatibilityLayer.getDrawable(getResources(), R.drawable.jumio_ic_clear);
            drawable.setColorFilter(typedValue.data, Mode.SRC_ATOP);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onPause() {
        super.onPause();
        ae aeVar = this.c;
        if (aeVar != null) {
            aeVar.a();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        super.onDestroy();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.d);
    }

    /* Access modifiers changed, original: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    public void onBackPressed() {
        ae aeVar = this.c;
        if (!(aeVar != null ? aeVar.onBackButtonPressed() : false)) {
            Object obj = 1;
            if (this.b.size() <= 1) {
                obj = null;
            }
            if (obj != null) {
                closeFragment(0, 0);
            } else {
                super.onBackPressed();
            }
        }
    }

    public void registerActivityCallback(ae aeVar) {
        this.c = aeVar;
    }

    public CredentialsModel getCredentials() {
        return super.getCredentialsModel();
    }

    public void startFragment(Fragment fragment, boolean z, int i, int i2) {
        synchronized (this.a) {
            if (isFinishing()) {
                return;
            }
            this.c = null;
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            beginTransaction.setCustomAnimations(i, i2);
            if (this.b.size() > 0) {
                Fragment fragment2 = (Fragment) this.b.get(this.b.size() - 1);
                if (z) {
                    this.b.remove(fragment2);
                }
                beginTransaction.detach(fragment2);
            }
            if (fragment != null) {
                beginTransaction.add(R.id.fragment_container, fragment);
                this.b.add(fragment);
            }
            try {
                beginTransaction.commitAllowingStateLoss();
            } catch (IllegalStateException e) {
                Log.printStackTrace(e);
            }
        }
    }

    public void closeFragment(int i, int i2) {
        synchronized (this.a) {
            if (isFinishing()) {
                return;
            } else if (this.b.size() == 0) {
                return;
            } else {
                Fragment fragment = (Fragment) this.b.get(this.b.size() - 1);
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                beginTransaction.setCustomAnimations(i, i2);
                beginTransaction.remove(fragment);
                this.b.remove(fragment);
                if (this.b.size() > 0) {
                    beginTransaction.attach((Fragment) this.b.get(this.b.size() - 1));
                }
                try {
                    beginTransaction.commitAllowingStateLoss();
                } catch (IllegalStateException e) {
                    Log.printStackTrace(e);
                }
            }
        }
    }

    public void setUiAutomationId(int i) {
        findViewById(R.id.fragment_container).setContentDescription(getResources().getString(i));
    }
}
