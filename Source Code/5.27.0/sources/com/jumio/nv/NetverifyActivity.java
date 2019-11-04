package com.jumio.nv;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.jumio.MobileActivity;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.analytics.UserAction;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.DeviceRotationManager;
import com.jumio.commons.utils.ScreenUtil;
import com.jumio.commons.view.CompatibilityLayer;
import com.jumio.nv.enums.NVErrorCase;
import com.jumio.nv.extraction.NfcController;
import com.jumio.nv.models.InitiateModel;
import com.jumio.nv.view.fragment.INetverifyActivityCallback;
import com.jumio.nv.view.fragment.INetverifyFragmentCallback;
import com.jumio.nv.view.fragment.SelectionFragment;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.exception.JumioError;
import com.jumio.sdk.models.CredentialsModel;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import jumio.nv.core.a;
import jumio.nv.core.b.b;

public class NetverifyActivity extends MobileActivity implements INetverifyFragmentCallback, b {
    private final Object a;
    private ArrayList<Fragment> b;
    private INetverifyActivityCallback c;
    private Toolbar d;
    private TextView e;
    private LinearLayout f;
    private LinearLayout g;
    private jumio.nv.core.b h;
    private ArrayList<AnimatorSet> i;
    private final Object j;
    private AtomicBoolean k;

    public NetverifyActivity() {
        this.a = new Object();
        this.b = null;
        this.c = null;
        this.j = new Object();
        this.b = new ArrayList();
        this.h = new jumio.nv.core.b();
        this.h.setInterface(this);
        this.i = new ArrayList();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setFinishOnTouchOutside(false);
        getWindow().addFlags(8192);
        setContentView(R.layout.activity_netverify);
        boolean z = true;
        this.h.create(this, getCredentials(), bundle == null);
        this.d = (Toolbar) findViewById(R.id.toolbar);
        this.e = (TextView) findViewById(R.id.toolbar_subtitle);
        this.f = (LinearLayout) findViewById(R.id.toolbarSubtitleContainer);
        this.g = (LinearLayout) findViewById(R.id.toolbarSubtitleSubcontainer);
        this.g.setTag(Boolean.valueOf(true));
        setSupportActionBar(this.d);
        getNfcController();
        if (bundle == null) {
            startFragment(new SelectionFragment(), false, 0, 0);
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
        if (!(getRotationManager().isScreenPortrait() || getRotationManager().isTablet())) {
            z = false;
        }
        handleOrientationChange(z, false);
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
        this.h.start();
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        super.onResume();
        getNfcController().start(this);
        this.h.resume(this);
    }

    /* Access modifiers changed, original: protected */
    public void onPause() {
        super.onPause();
        getNfcController().pause(this);
        this.h.pause(this);
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        super.onStop();
        this.h.stop();
    }

    public void onDestroy() {
        super.onDestroy();
        getNfcController().stop();
        this.h.destroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean z = configuration.orientation == 1 || getRotationManager().isTablet();
        handleOrientationChange(z, true);
    }

    public void handleOrientationChange(boolean z, boolean z2) {
        this.g.getLayoutParams().height = ScreenUtil.dpToPx((Context) this, z ? 72 : 48);
        ((LayoutParams) findViewById(R.id.spinnerContainer).getLayoutParams()).topMargin = ScreenUtil.dpToPx((Context) this, z ? 88 : 54);
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
        String str = null;
        JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), null, UserAction.BACK));
        INetverifyActivityCallback iNetverifyActivityCallback = this.c;
        if (!(iNetverifyActivityCallback != null ? iNetverifyActivityCallback.onBackButtonPressed() : false)) {
            Object obj = 1;
            if (this.b.size() <= 1) {
                obj = null;
            }
            if (obj != null) {
                closeFragment(0, R.animator.nv_fade_out);
                return;
            }
            InitiateModel initiateModel = (InitiateModel) DataAccess.load((Context) this, InitiateModel.class);
            JumioError jumioError = new JumioError(NVErrorCase.CANCEL_TYPE_USER);
            jumio.nv.core.b bVar = this.h;
            String errorCode = jumioError.getErrorCode();
            String localizedError = jumioError.getLocalizedError(this);
            if (initiateModel != null) {
                str = initiateModel.getJumioScanRef();
            }
            bVar.finishSDK(this, new a(errorCode, localizedError, str));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        INetverifyActivityCallback iNetverifyActivityCallback = this.c;
        if (iNetverifyActivityCallback == null || !iNetverifyActivityCallback.onHomeButtonPressed()) {
            String str = null;
            JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), null, UserAction.CLOSE));
            InitiateModel initiateModel = (InitiateModel) DataAccess.load((Context) this, InitiateModel.class);
            JumioError jumioError = new JumioError(NVErrorCase.CANCEL_TYPE_USER);
            jumio.nv.core.b bVar = this.h;
            String errorCode = jumioError.getErrorCode();
            String localizedError = jumioError.getLocalizedError(this);
            if (initiateModel != null) {
                str = initiateModel.getJumioScanRef();
            }
            bVar.finishSDK(this, new a(errorCode, localizedError, str));
        }
        return true;
    }

    public void registerActivityCallback(INetverifyActivityCallback iNetverifyActivityCallback) {
        this.c = iNetverifyActivityCallback;
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

    public NfcController getNfcController() {
        return this.h.getNfcController(getApplicationContext());
    }

    public DeviceRotationManager getRotationManager() {
        return this.h.getRotationManager();
    }

    public void animateActionbar(boolean z, boolean z2, View view, Runnable runnable, Runnable runnable2) {
        boolean z3 = z2;
        AnimatorSet animatorSet = new AnimatorSet();
        Toolbar toolbar = this.d;
        float[] fArr = new float[2];
        float f = 0.5f;
        float f2 = 1.0f;
        fArr[0] = z ? 0.5f : 1.0f;
        if (z) {
            f = 1.0f;
        }
        fArr[1] = f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(toolbar, "alpha", fArr);
        ofFloat.setDuration(150);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        Builder play = animatorSet.play(ofFloat);
        if (z3 != ((Boolean) this.g.getTag()).booleanValue()) {
            this.g.setTag(Boolean.valueOf(z2));
            TextView textView = this.e;
            float[] fArr2 = new float[2];
            float f3 = 0.0f;
            fArr2[0] = z3 ? 0.0f : 1.0f;
            fArr2[1] = z3 ? 1.0f : 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, "alpha", fArr2);
            ofFloat2.setDuration(100);
            ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
            LinearLayout linearLayout = this.g;
            fArr2 = new float[2];
            fArr2[0] = z3 ? 0.0f : 1.0f;
            if (!z3) {
                f2 = 0.0f;
            }
            fArr2[1] = f2;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(linearLayout, "alpha", fArr2);
            ofFloat3.setDuration(150);
            ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
            linearLayout = this.f;
            float[] fArr3 = new float[2];
            fArr3[0] = z3 ? (float) (-linearLayout.getHeight()) : 0.0f;
            if (!z3) {
                f3 = (float) (-this.f.getHeight());
            }
            fArr3[1] = f3;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(linearLayout, "translationY", fArr3);
            ofFloat4.setDuration(150);
            ofFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
            final boolean z4 = z2;
            final View view2 = view;
            final Runnable runnable3 = runnable;
            final Runnable runnable4 = runnable2;
            animatorSet.addListener(new AnimatorListener() {
                public void onAnimationCancel(Animator animator) {
                }

                public void onAnimationRepeat(Animator animator) {
                }

                public void onAnimationStart(Animator animator) {
                    if (z4) {
                        NetverifyActivity.this.f.setVisibility(0);
                    }
                    if (view2 != null && z4) {
                        NetverifyActivity.this.g.addView(view2);
                    }
                    Runnable runnable = runnable3;
                    if (runnable != null) {
                        NetverifyActivity.this.runOnUiThread(runnable);
                    }
                }

                public void onAnimationEnd(Animator animator) {
                    if (!z4) {
                        NetverifyActivity.this.f.setVisibility(8);
                    }
                    if (!(view2 == null || z4)) {
                        NetverifyActivity.this.g.removeView(view2);
                    }
                    Runnable runnable = runnable4;
                    if (runnable != null) {
                        NetverifyActivity.this.runOnUiThread(runnable);
                    }
                }
            });
            if (z3) {
                play.with(ofFloat4).before(ofFloat3).with(ofFloat2);
            } else {
                play.with(ofFloat3).with(ofFloat2).before(ofFloat4);
            }
        }
        animatorSet.addListener(new AnimatorListener() {
            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                synchronized (NetverifyActivity.this.j) {
                    NetverifyActivity.this.i.remove(0);
                    if (NetverifyActivity.this.i.size() != 0) {
                        ((AnimatorSet) NetverifyActivity.this.i.get(0)).start();
                    }
                }
            }

            public void onAnimationCancel(Animator animator) {
                synchronized (NetverifyActivity.this.j) {
                    NetverifyActivity.this.i.remove(0);
                    if (NetverifyActivity.this.i.size() != 0) {
                        ((AnimatorSet) NetverifyActivity.this.i.get(0)).start();
                    }
                }
            }
        });
        synchronized (this.j) {
            this.i.add(animatorSet);
            if (this.i.size() == 1) {
                ((AnimatorSet) this.i.get(0)).start();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!getNfcController().consumeIntent(i, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void setUiAutomationId(int i) {
        setUiAutomationString(getResources().getString(i));
    }

    public void setUiAutomationString(String str) {
        findViewById(R.id.fragment_container).setContentDescription(str);
    }

    public void finishSDK(Intent intent) {
        synchronized (this.a) {
            intent.setAction("");
            int intExtra = intent.getIntExtra("com.jumio.nv.RESULT", 0);
            intent.removeExtra("com.jumio.nv.RESULT");
            setResult(intExtra, intent);
            if (this.b != null) {
                this.b.clear();
            }
            finish();
        }
    }

    public boolean isRunningTest() {
        if (this.k == null) {
            boolean z;
            try {
                Class.forName("androidx.test.espresso.Espresso");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            this.k = new AtomicBoolean(z);
        }
        return this.k.get();
    }
}
