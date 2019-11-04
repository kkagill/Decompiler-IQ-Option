package com.iqoption.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import com.iqoption.analytics.EventManager;
import com.iqoption.dto.Event;
import com.iqoption.dto.Event.Builder;
import com.iqoption.fragment.account.security.touchId.PasscodeFragment;
import com.iqoption.fragment.account.security.touchId.PasscodeFragment.PasscodeScreen;
import com.iqoption.fragment.account.security.touchId.PasscodeFragment.b;
import com.iqoption.fragment.account.security.touchId.a.a;
import com.iqoption.x.R;

public class SetPasscodeActivity extends AppCompatActivity implements b, a {
    private static final String TAG = "com.iqoption.activity.SetPasscodeActivity";
    public static final String aiZ;
    private static final String aja;
    private static final String ajb;
    private static final String ajc;
    private PasscodeScreen ajd;
    private long aje;
    private Builder ajf;

    public void zG() {
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TAG);
        stringBuilder.append(".RESULT_PASSCODE");
        aiZ = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(TAG);
        stringBuilder.append(".ARG_PASSCODE_SCREEN");
        aja = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(TAG);
        stringBuilder.append(".KEY_LAST_PASSCODE_SCREEN");
        ajb = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(TAG);
        stringBuilder.append(".KEY_PASSCODE");
        ajc = stringBuilder.toString();
    }

    public static Intent a(Context context, PasscodeScreen passcodeScreen) {
        Intent intent = new Intent(context, SetPasscodeActivity.class);
        intent.putExtra(aja, passcodeScreen.name());
        return intent;
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_passcode);
        PasscodeScreen passcodeScreen = PasscodeScreen.newPasscode;
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(aja)) {
            passcodeScreen = PasscodeScreen.valueOf(intent.getStringExtra(aja));
        }
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).add(16908290, PasscodeFragment.a(passcodeScreen), PasscodeFragment.TAG).commit();
        } else {
            if (bundle.getString(aja) != null) {
                this.ajd = PasscodeScreen.valueOf(bundle.getString(ajb));
            }
            this.aje = bundle.getLong(ajc);
        }
        this.ajf = Event.Builder(Event.CATEGORY_POPUP_SERVED, "security-touch-id_set-passcode");
    }

    /* Access modifiers changed, original: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            setIntent(intent);
            if (intent.hasExtra(aja)) {
                PasscodeScreen valueOf = PasscodeScreen.valueOf(intent.getStringExtra(aja));
                PasscodeFragment passcodeFragment = (PasscodeFragment) getSupportFragmentManager().findFragmentByTag(PasscodeFragment.TAG);
                if (passcodeFragment != null) {
                    passcodeFragment.b((Context) this, valueOf);
                    this.ajd = valueOf;
                }
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        bundle.putLong(ajc, this.aje);
        bundle.putString(ajb, this.ajd.name());
        super.onSaveInstanceState(bundle, persistableBundle);
    }

    public void dl(@StringRes int i) {
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.fast_fade_in, R.anim.fast_fade_out).replace(16908290, com.iqoption.fragment.account.security.touchId.a.in(getString(i)), com.iqoption.fragment.account.security.touchId.a.TAG).commitNow();
    }

    /* JADX WARNING: Missing block: B:17:0x006a, code skipped:
            r4 = 1;
     */
    /* JADX WARNING: Missing block: B:19:0x0073, code skipped:
            r4 = 0;
     */
    /* JADX WARNING: Missing block: B:21:0x0075, code skipped:
            return r4 ^ 1;
     */
    public boolean a(com.iqoption.fragment.account.security.touchId.PasscodeFragment r4, com.iqoption.fragment.account.security.touchId.PasscodeFragment.PasscodeScreen r5, long r6) {
        /*
        r3 = this;
        r3.ajd = r5;
        r0 = com.iqoption.activity.SetPasscodeActivity.AnonymousClass2.aji;
        r5 = r5.ordinal();
        r5 = r0[r5];
        r0 = 2131887123; // 0x7f120413 float:1.9408844E38 double:1.0532921883E-314;
        r1 = 1;
        switch(r5) {
            case 1: goto L_0x006c;
            case 2: goto L_0x0052;
            case 3: goto L_0x004a;
            case 4: goto L_0x0031;
            case 5: goto L_0x0025;
            case 6: goto L_0x0012;
            default: goto L_0x0011;
        };
    L_0x0011:
        goto L_0x0073;
    L_0x0012:
        r4 = com.iqoption.fragment.account.security.touchId.PasscodeFragment.c(r3, r6);
        if (r4 == 0) goto L_0x006a;
    L_0x0018:
        r4 = com.iqoption.app.d.aP(r3);
        r5 = -1;
        r4.aa(r5);
        r3.L(r5);
        goto L_0x0073;
    L_0x0025:
        r5 = com.iqoption.fragment.account.security.touchId.PasscodeFragment.c(r3, r6);
        if (r5 == 0) goto L_0x006a;
    L_0x002b:
        r5 = com.iqoption.fragment.account.security.touchId.PasscodeFragment.PasscodeScreen.newPasscode;
        r4.b(r3, r5);
        goto L_0x0073;
    L_0x0031:
        r4 = r3.aje;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 != 0) goto L_0x0042;
    L_0x0037:
        r4 = com.iqoption.app.d.aP(r3);
        r4.aa(r6);
        r3.L(r6);
        goto L_0x0073;
    L_0x0042:
        r3.dl(r0);
        r4 = com.iqoption.fragment.account.security.touchId.PasscodeFragment.PasscodeScreen.newPasscode;
        r3.ajd = r4;
        goto L_0x006a;
    L_0x004a:
        r3.aje = r6;
        r5 = com.iqoption.fragment.account.security.touchId.PasscodeFragment.PasscodeScreen.repeatNewPasscode;
        r4.b(r3, r5);
        goto L_0x0073;
    L_0x0052:
        r4 = r3.aje;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 != 0) goto L_0x0063;
    L_0x0058:
        r4 = com.iqoption.app.d.aP(r3);
        r4.aa(r6);
        r3.L(r6);
        goto L_0x0073;
    L_0x0063:
        r3.dl(r0);
        r4 = com.iqoption.fragment.account.security.touchId.PasscodeFragment.PasscodeScreen.passcode;
        r3.ajd = r4;
    L_0x006a:
        r4 = 1;
        goto L_0x0074;
    L_0x006c:
        r3.aje = r6;
        r5 = com.iqoption.fragment.account.security.touchId.PasscodeFragment.PasscodeScreen.repeatPasscode;
        r4.b(r3, r5);
    L_0x0073:
        r4 = 0;
    L_0x0074:
        r4 = r4 ^ r1;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.activity.SetPasscodeActivity.a(com.iqoption.fragment.account.security.touchId.PasscodeFragment, com.iqoption.fragment.account.security.touchId.PasscodeFragment$PasscodeScreen, long):boolean");
    }

    public void zH() {
        zS();
    }

    public void onBackPressed() {
        zS();
    }

    public void zR() {
        zS();
    }

    public void zS() {
        if (this.ajf != null) {
            EventManager.BS().a(this.ajf.calcDuration().setValue(Double.valueOf(0.0d)).build());
        }
        setResult(0);
        finish();
    }

    public void L(final long j) {
        com.iqoption.core.c.a.biN.postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putLong(SetPasscodeActivity.aiZ, j);
                intent.putExtras(bundle);
                SetPasscodeActivity.this.setResult(-1, intent);
                SetPasscodeActivity.this.finish();
            }
        }, (long) PasscodeFragment.cZV);
        if (this.ajf != null) {
            EventManager.BS().a(this.ajf.calcDuration().setValue(Double.valueOf(1.0d)).build());
        }
    }

    public void zT() {
        getSupportFragmentManager().beginTransaction().setCustomAnimations(17432576, 17432577).replace(16908290, PasscodeFragment.a(this.ajd), PasscodeFragment.TAG).commitNow();
    }
}
