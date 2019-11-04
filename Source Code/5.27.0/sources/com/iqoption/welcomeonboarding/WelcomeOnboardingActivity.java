package com.iqoption.welcomeonboarding;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.airbnb.lottie.LottieAnimationView;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.d;
import com.iqoption.deposit.g;
import com.iqoption.dto.Event;
import com.iqoption.e.al;
import com.iqoption.service.WebSocketHandler;
import com.iqoption.system.c.b;
import com.iqoption.util.ak;
import com.iqoption.util.v;
import com.iqoption.welcome.AuthDone;
import com.iqoption.welcome.l;
import com.iqoption.welcome.o;
import com.iqoption.welcome.p;
import com.iqoption.x.R;

public class WelcomeOnboardingActivity extends com.iqoption.core.ui.a.a {
    private static final String TAG = "com.iqoption.welcomeonboarding.WelcomeOnboardingActivity";
    private al enP;
    private boolean enQ = false;
    private int enR = -1;

    /* renamed from: com.iqoption.welcomeonboarding.WelcomeOnboardingActivity$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] enV = new int[AuthDone.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Missing block: B:13:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.iqoption.welcome.AuthDone.values();
            r0 = r0.length;
            r0 = new int[r0];
            enV = r0;
            r0 = enV;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.welcome.AuthDone.ANONYM_REGISTERED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = enV;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.welcome.AuthDone.LOGGED_IN;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = enV;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.welcome.AuthDone.REGISTERED;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = enV;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.iqoption.welcome.AuthDone.RECOVERY_PASSWORD;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = enV;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = com.iqoption.welcome.AuthDone.CHANGE_PASSWORD;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.welcomeonboarding.WelcomeOnboardingActivity$AnonymousClass2.<clinit>():void");
        }
    }

    private static class a extends b<WelcomeOnboardingActivity, Object> {
        public a(WelcomeOnboardingActivity welcomeOnboardingActivity) {
            super(welcomeOnboardingActivity, Object.class);
        }

        /* renamed from: a */
        public void v(@NonNull WelcomeOnboardingActivity welcomeOnboardingActivity, Object obj) {
            super.v(welcomeOnboardingActivity, obj);
            g.a(welcomeOnboardingActivity, false, true);
            com.iqoption.util.a.i(welcomeOnboardingActivity);
        }

        /* renamed from: a */
        public void c(@NonNull WelcomeOnboardingActivity welcomeOnboardingActivity, Throwable th) {
            super.c(welcomeOnboardingActivity, th);
            com.iqoption.app.a.b.aQ(welcomeOnboardingActivity);
            com.iqoption.util.a.b(welcomeOnboardingActivity, welcomeOnboardingActivity.getIntent());
        }
    }

    @NonNull
    public static Intent bQ(@NonNull Context context) {
        return new Intent(context, WelcomeOnboardingActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.enP = (al) DataBindingUtil.setContentView(this, R.layout.activity_welcome_onboarding);
        if (d.Fa().Er()) {
            this.enP.bfy.setVisibility(0);
        }
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.content, new l(), l.TAG).commit();
            if (this.enQ) {
                this.enP.bTz.setVisibility(8);
                this.enP.bTA.setVisibility(8);
            } else {
                this.enP.bTA.setVisibility(0);
                this.enP.bTz.setVisibility(0);
                Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_SHARED_STATE");
                float a = com.iqoption.core.splash.d.a(parcelableExtra);
                com.iqoption.core.splash.b a2 = com.iqoption.core.splash.b.a(this.enP.bTz);
                a2.O(a);
                ak.a(this.enP.getRoot(), new -$$Lambda$WelcomeOnboardingActivity$yAv-TrXsZauZrdh41yyyUO0x_D0(this, com.iqoption.core.splash.d.a((FragmentActivity) this, parcelableExtra), a2));
            }
        } else {
            this.enQ = bundle.getBoolean("animation_was_played", false);
            if (this.enQ) {
                this.enP.bTz.setVisibility(8);
                this.enP.bTA.setVisibility(8);
            }
        }
        o N = o.ekt.N(this);
        N.aZx().observe(this, new -$$Lambda$WelcomeOnboardingActivity$epwvZznm3nz6wb3VWAW3pK7g9so(this));
        N.aUU().observe(this, new -$$Lambda$WelcomeOnboardingActivity$z-jKOQOc4uYQ35V8eqRG0pwRJGk(this));
        this.enP.bfC.setText(getString(R.string.you_are_connecting_to_n1, new Object[]{getString(R.string.app_name)}));
    }

    private /* synthetic */ void b(com.iqoption.core.splash.b bVar) {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.content);
        if (findFragmentById instanceof l) {
            l lVar = (l) findFragmentById;
            if (lVar.aZu() != null) {
                a(lVar.aZu(), bVar);
                this.enQ = true;
            }
        }
    }

    private /* synthetic */ void cv(Object obj) {
        zZ();
    }

    private /* synthetic */ void c(AuthDone authDone) {
        int i = AnonymousClass2.enV[authDone.ordinal()];
        if (i == 1 || i == 2) {
            aZz();
        } else if (i == 3) {
            bbJ();
        } else if (i == 4) {
            bbI();
        } else if (i == 5) {
            aZD();
        }
    }

    private void a(final com.iqoption.welcome.slide.d dVar, final com.iqoption.core.splash.b bVar) {
        dVar.fA(false);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.enP.bTA, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setDuration(400);
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setStartDelay(300);
        ofFloat.start();
        this.enP.bTz.setPivotY(0.0f);
        Rect ah = ak.ah(this.enP.bTz);
        Rect bbu = dVar.bbu();
        if (bbu == null) {
            bbu = ah;
        }
        float height = ((float) bbu.height()) / getResources().getDimension(R.dimen.splash_icon_size);
        float translationY = ((float) (bbu.top - ah.top)) + this.enP.bTz.getTranslationY();
        LottieAnimationView lottieAnimationView = this.enP.bTz;
        r5 = new PropertyValuesHolder[4];
        r5[0] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
        r5[1] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{translationY});
        r5[2] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, height});
        r5[3] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, height});
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(lottieAnimationView, r5);
        ofPropertyValuesHolder.setDuration(600);
        ofPropertyValuesHolder.setInterpolator(new DecelerateInterpolator(1.2f));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!WelcomeOnboardingActivity.this.isDestroyed()) {
                    WelcomeOnboardingActivity.this.enP.bTz.setVisibility(8);
                    WelcomeOnboardingActivity.this.enP.bTA.setVisibility(8);
                    dVar.fA(true);
                    if (com.iqoption.core.splash.a.akw()) {
                        dVar.a(bVar.aky());
                    } else {
                        dVar.a(Float.valueOf(1.0f));
                    }
                }
            }
        });
        ofPropertyValuesHolder.start();
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        bundle.putBoolean("animation_was_played", this.enQ);
        super.onSaveInstanceState(bundle, persistableBundle);
    }

    /* Access modifiers changed, original: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            this.enQ = bundle.getBoolean("animation_was_played", false);
            if (this.enQ) {
                this.enP.bTz.setVisibility(8);
                this.enP.bTA.setVisibility(8);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(l.TAG);
        if (findFragmentByTag != null) {
            findFragmentByTag.onActivityResult(i, i2, intent);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        super.onStart();
        int i = getResources().getConfiguration().orientation;
        if (this.enR != i) {
            EventManager.BS().a(Event.Builder(Event.CATEGORY_SYSTEM, "screen-orientation_change-orientation").setValue(Double.valueOf(i == 1 ? 0.0d : 1.0d)).setTechnicalLogs(Boolean.valueOf(true)).build());
            this.enR = i;
        }
    }

    public void onBackPressed() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.getBackStackEntryCount() > 0) {
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(supportFragmentManager.getBackStackEntryAt(supportFragmentManager.getBackStackEntryCount() - 1).getName());
            if ((findFragmentByTag instanceof com.iqoption.view.b.a) && ((com.iqoption.view.b.a) findFragmentByTag).onBackPressed()) {
                return;
            }
        }
        if (getSupportFragmentManager().getBackStackEntryCount() == 0 || getSupportFragmentManager().isStateSaved()) {
            super.onBackPressed();
        } else {
            getSupportFragmentManager().popBackStack();
        }
    }

    private void bbI() {
        com.iqoption.core.d.ag(R.string.password_recovery_sent, 1);
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(l.TAG);
        if (findFragmentByTag != null) {
            p.bo(findFragmentByTag).b(com.iqoption.welcome.d.eke);
        }
    }

    private void aZD() {
        com.iqoption.core.d.ag(R.string.password_changed, 1);
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(l.TAG);
        if (findFragmentByTag != null) {
            p.bo(findFragmentByTag).b(com.iqoption.welcome.d.eke);
        }
    }

    private void aZz() {
        com.iqoption.util.a.b(this, getIntent());
    }

    private void bbJ() {
        if (com.iqoption.core.d.EH().ej("skip-dep-after-reg")) {
            com.iqoption.util.a.b(this, getIntent());
        } else {
            v.a(WebSocketHandler.aTn().cj(TAG), new a(this));
        }
    }

    private void zZ() {
        v.a(com.iqoption.c.b.Kf(), TAG, "logout");
    }
}
