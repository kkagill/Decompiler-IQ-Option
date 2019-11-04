package com.jumio.dv;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.jumio.MobileActivity;
import com.jumio.analytics.DismissType;
import com.jumio.commons.enums.Rotation;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.DeviceRotationManager;
import com.jumio.commons.view.CompatibilityLayer;
import com.jumio.dv.a.a;
import com.jumio.dv.api.calls.DvBackend;
import com.jumio.dv.models.DvScanPartModel;
import com.jumio.dv.view.fragment.DvScanFragment;
import com.jumio.dv.view.fragment.IDvActivityCallback;
import com.jumio.dv.view.fragment.IDvFragmentCallback;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.models.CredentialsModel;
import java.io.File;
import java.util.ArrayList;

public class DocumentVerificationActivity extends MobileActivity implements IDvFragmentCallback {
    private final Object a;
    private ArrayList<Fragment> b;
    private IDvActivityCallback c;
    private BroadcastReceiver d;
    private DeviceRotationManager e;
    private Toolbar f;

    public DocumentVerificationActivity() {
        this.a = new Object();
        this.b = null;
        this.c = null;
        this.b = new ArrayList();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setFinishOnTouchOutside(false);
        getWindow().addFlags(8192);
        setContentView(R.layout.activity_dv);
        this.e = new DeviceRotationManager(this, Rotation.NATIVE);
        this.f = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(this.f);
        if (bundle == null) {
            startFragment(new DvScanFragment(), false, 0, 0);
        } else {
            int i = bundle.getInt("FragmentBackstackCount", 0);
            for (int i2 = 0; i2 < i; i2++) {
                this.b.add(getSupportFragmentManager().getFragment(bundle, String.format("FragmentBackstack%d", new Object[]{Integer.valueOf(i2)})));
            }
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeActionContentDescription(getString(R.string.jumio_accessibility_quit_scan));
            TypedValue typedValue = new TypedValue();
            getTheme().resolveAttribute(R.attr.colorControlNormal, typedValue, true);
            Drawable drawable = CompatibilityLayer.getDrawable(getResources(), R.drawable.jumio_ic_clear);
            drawable.setColorFilter(typedValue.data, Mode.SRC_ATOP);
            getSupportActionBar().setHomeAsUpIndicator(drawable);
            getSupportActionBar().setShowHideAnimationEnabled(false);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        super.onResume();
        this.d = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("com.jumio.dv.CLOSE_SDK")) {
                    DocumentVerificationActivity.this.a(intent);
                }
            }
        };
        LocalBroadcastManager.getInstance(this).registerReceiver(this.d, a.a());
    }

    /* Access modifiers changed, original: protected */
    public void onPause() {
        super.onPause();
        if (this.d != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.d);
            this.d = null;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        DvBackend.freeEncryption();
    }

    /* Access modifiers changed, original: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putInt("FragmentBackstackCount", this.b.size());
            for (int i = 0; i < this.b.size(); i++) {
                getSupportFragmentManager().putFragment(bundle, String.format("FragmentBackstack%d", new Object[]{Integer.valueOf(i)}), (Fragment) this.b.get(i));
            }
        }
    }

    public void onBackPressed() {
        IDvActivityCallback iDvActivityCallback = this.c;
        if (!(iDvActivityCallback != null ? iDvActivityCallback.onBackButtonPressed() : false)) {
            Object obj = 1;
            if (this.b.size() <= 1) {
                obj = null;
            }
            if (obj != null) {
                closeFragment(0, R.animator.dv_fade_out);
                return;
            }
            JumioError jumioError = new JumioError(a.CANCEL_TYPE_USER);
            a(new a(jumioError.getErrorCode(), jumioError.getLocalizedError(this)));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        IDvActivityCallback iDvActivityCallback = this.c;
        if (iDvActivityCallback == null || !iDvActivityCallback.onHomeButtonPressed()) {
            JumioError jumioError = new JumioError(a.CANCEL_TYPE_USER);
            a(new a(jumioError.getErrorCode(), jumioError.getLocalizedError(this)));
        }
        return true;
    }

    public void registerActivityCallback(IDvActivityCallback iDvActivityCallback) {
        this.c = iDvActivityCallback;
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
            this.c = null;
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

    public DeviceRotationManager getRotationManager() {
        return this.e;
    }

    public void animateActionbar(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        Toolbar toolbar = this.f;
        float[] fArr = new float[2];
        float f = 0.5f;
        fArr[0] = z ? 0.5f : 1.0f;
        if (z) {
            f = 1.0f;
        }
        fArr[1] = f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(toolbar, "alpha", fArr);
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.play(ofFloat);
        animatorSet.start();
    }

    private void a(Intent intent) {
        synchronized (this.a) {
            intent.setAction("");
            int i = 0;
            int intExtra = intent.getIntExtra("com.jumio.dv.RESULT", 0);
            intent.removeExtra("com.jumio.dv.RESULT");
            setResult(intExtra, intent);
            DismissType dismissType;
            if (intExtra == -1) {
                dismissType = DismissType.FINISHED;
            } else {
                dismissType = DismissType.CANCELLED;
            }
            DataAccess.delete((Context) this, DvScanPartModel.class);
            File[] listFiles = new File(getFilesDir(), "jumio").listFiles();
            if (listFiles != null) {
                intExtra = listFiles.length;
                while (i < intExtra) {
                    File file = listFiles[i];
                    if (file.isFile() && file.getName().startsWith("tmpm_") && !file.delete()) {
                        file.deleteOnExit();
                    }
                    i++;
                }
            }
            DvBackend.cancelAllPending();
            finish();
        }
    }

    public void setUiAutomationId(int i) {
        setUiAutomationString(getResources().getString(i));
    }

    public void setUiAutomationString(String str) {
        findViewById(R.id.fragment_container).setContentDescription(str);
    }
}
