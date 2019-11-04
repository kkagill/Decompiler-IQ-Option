package com.iqoption.fragment.account.security.touchId;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.ViewSwitcher.ViewFactory;
import androidx.annotation.StringRes;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import com.iqoption.app.d;
import com.iqoption.e.ho;
import com.iqoption.e.hu;
import com.iqoption.e.ik;
import com.iqoption.widget.DialpadDot;
import com.iqoption.widget.DialpadDot.State;
import com.iqoption.x.R;

public class PasscodeFragment extends Fragment {
    public static final String TAG = "com.iqoption.fragment.account.security.touchId.PasscodeFragment";
    private static final String aja;
    public static int cZU = 600000;
    public static int cZV = DialpadDot.cZV;
    private static int cZY = -1;
    private static int cZZ = 6;
    private long aje;
    private com.iqoption.system.b.c cZW;
    private boolean cZX;
    private int daa;
    private PasscodeScreen dab;
    private ik dac;
    private boolean dad;
    private ViewFactory dae = new ViewFactory() {
        public View makeView() {
            return PasscodeFragment.this.getLayoutInflater(null).inflate(R.layout.passcode_title_text, (ViewGroup) PasscodeFragment.this.dac.getRoot(), false);
        }
    };

    public enum PasscodeScreen {
        passcode,
        repeatPasscode,
        newPasscode,
        repeatNewPasscode,
        oldPasscode,
        passcodeToTurnTouchIdOff,
        passcodeVerificationOnLogin
    }

    private class a implements OnClickListener {
        private final int value;

        /* synthetic */ a(PasscodeFragment passcodeFragment, int i, AnonymousClass1 anonymousClass1) {
            this(i);
        }

        private a(int i) {
            this.value = i;
        }

        public void onClick(View view) {
            PasscodeFragment.this.onKeyPressed(this.value);
        }
    }

    public interface b {
        boolean a(PasscodeFragment passcodeFragment, PasscodeScreen passcodeScreen, long j);

        void zG();

        void zH();
    }

    private class c extends com.iqoption.system.b.b {
        private c() {
        }

        /* synthetic */ c(PasscodeFragment passcodeFragment, AnonymousClass1 anonymousClass1) {
            this();
        }

        public void azR() {
            PasscodeFragment.this.dC(false);
            if (VERSION.SDK_INT >= 21) {
                b(PasscodeFragment.this.dac.cfc);
            } else {
                azS();
            }
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            super.onAuthenticationError(i, charSequence);
            com.iqoption.app.a.b.b(charSequence.toString(), PasscodeFragment.this.getContext());
        }

        public void onAuthenticationFailed() {
            super.onAuthenticationFailed();
            ho hoVar = PasscodeFragment.this.dac.cfc;
            if (VERSION.SDK_INT >= 21) {
                c(hoVar);
            } else {
                PasscodeFragment.this.a(hoVar);
            }
        }

        @TargetApi(21)
        private void b(ho hoVar) {
            Drawable drawable = PasscodeFragment.this.getContext().getDrawable(R.drawable.lockscreen_fingerprint_draw_off_animation);
            hoVar.cdP.ced.setImageDrawable(drawable);
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
                com.iqoption.core.c.a.biN.postDelayed(new Runnable() {
                    public void run() {
                        b e = PasscodeFragment.this.azQ();
                        if (e != null) {
                            e.zG();
                        }
                    }
                }, 320);
            }
        }

        private void azS() {
            ho hoVar = PasscodeFragment.this.dac.cfc;
            hoVar.cdP.ced.setVisibility(8);
            hoVar.cdP.ceg.setVisibility(8);
            hoVar.cdP.ceh.setVisibility(0);
            hoVar.cdP.ced.animate().alpha(0.0f);
            hoVar.cdP.ceg.animate().alpha(0.0f);
            hoVar.cdP.ceh.setScaleX(0.2f);
            hoVar.cdP.ceh.setScaleY(0.2f);
            hoVar.cdP.ceh.animate().scaleX(1.0f).alpha(1.0f).setInterpolator(new OvershootInterpolator(1.5f));
            hoVar.cdP.ceh.animate().scaleY(1.0f).alpha(1.0f).setInterpolator(new OvershootInterpolator(1.5f)).setListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    b e = PasscodeFragment.this.azQ();
                    if (e != null) {
                        e.zG();
                    }
                }
            });
        }

        @TargetApi(21)
        private void c(ho hoVar) {
            Drawable drawable = PasscodeFragment.this.requireContext().getDrawable(R.drawable.lockscreen_fingerprint_fp_to_error_state_animation);
            hoVar.cdP.ced.setImageDrawable(drawable);
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
                com.iqoption.core.c.a.biN.postDelayed(new -$$Lambda$PasscodeFragment$c$EfGNU4m3HCFqJt_Ce82AQcJstes(this, hoVar), 1200);
            }
        }

        private /* synthetic */ void d(ho hoVar) {
            Context context = PasscodeFragment.this.getContext();
            if (context != null) {
                Drawable drawable = context.getDrawable(R.drawable.lockscreen_fingerprint_error_state_to_fp_animation);
                hoVar.cdP.ced.setImageDrawable(drawable);
                if (drawable instanceof AnimatedVectorDrawable) {
                    ((AnimatedVectorDrawable) drawable).start();
                }
            }
        }
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TAG);
        stringBuilder.append(".ARG_PASSCODE_SCREEN");
        aja = stringBuilder.toString();
    }

    public static boolean c(Context context, long j) {
        return j >= 0 && d.aP(context).FM() == j;
    }

    public static void bv(Context context) {
        if (d.aP(context).FM() >= 0) {
            d.aP(context).ab(System.currentTimeMillis() + ((long) cZU));
        }
    }

    public static PasscodeFragment a(PasscodeScreen passcodeScreen) {
        PasscodeFragment passcodeFragment = new PasscodeFragment();
        Bundle bundle = new Bundle();
        bundle.putString(aja, passcodeScreen.name());
        passcodeFragment.setArguments(bundle);
        return passcodeFragment;
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onStart() {
        super.onStart();
        com.iqoption.system.b.c cVar = this.cZW;
        if (cVar != null) {
            cVar.startListening();
        }
    }

    public void onResume() {
        super.onResume();
        if (VERSION.SDK_INT >= 21) {
            Drawable drawable = this.dac.cfc.cdP.ced.getDrawable();
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    public void onPause() {
        super.onPause();
        if (VERSION.SDK_INT >= 21) {
            Drawable drawable = this.dac.cfc.cdP.ced.getDrawable();
            if (drawable instanceof AnimatedVectorDrawable) {
                drawable.setVisible(false, false);
            }
        }
    }

    public void onStop() {
        super.onStop();
        com.iqoption.system.b.c cVar = this.cZW;
        if (cVar != null) {
            cVar.stopListening();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dac = (ik) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_account_security_passcode, viewGroup, false);
        this.dac.a(this);
        if (com.iqoption.core.d.Un().Dq()) {
            this.dac.cfa.setBackground(com.iqoption.core.ext.a.n(getContext(), R.drawable.bg_radial_gradient));
        } else {
            this.dac.cfa.setBackground(com.iqoption.core.ext.a.n(getContext(), R.drawable.iq_bg));
        }
        PasscodeScreen passcodeScreen = PasscodeScreen.newPasscode;
        Bundle arguments = getArguments();
        if (arguments != null) {
            passcodeScreen = PasscodeScreen.valueOf(arguments.getString(aja, passcodeScreen.name()));
        }
        this.dac.cfm.setFactory(this.dae);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_short);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.fade_out_short);
        this.dac.cfm.setInAnimation(loadAnimation);
        this.dac.cfm.setOutAnimation(loadAnimation2);
        if (passcodeScreen == PasscodeScreen.passcodeVerificationOnLogin) {
            this.cZW = new com.iqoption.system.b.c(getContext(), new c(this, null));
        }
        azO();
        dD(false);
        b(getContext(), passcodeScreen);
        if (!((getTargetFragment() instanceof b) || (getActivity() instanceof b))) {
            Log.e(TAG, "OnFragmentInteractionListener is not implemented by target fragment or activity");
        }
        return this.dac.getRoot();
    }

    private void azO() {
        ho hoVar = this.dac.cfc;
        boolean z = true;
        a(hoVar.cdT, 1, "");
        a(hoVar.cdX, 2, "ABC");
        a(hoVar.cdW, 3, "DEF");
        a(hoVar.cdR, 4, "GHI");
        a(hoVar.cdQ, 5, "JKL");
        a(hoVar.cdV, 6, "MNO");
        a(hoVar.cdU, 7, "PQRS");
        a(hoVar.cdO, 8, "TUV");
        a(hoVar.cdS, 9, "WXYZ");
        hoVar.cdY.getRoot().setOnClickListener(new a(this, 0, null));
        hoVar.cdN.getRoot().setOnClickListener(new a(this, cZY, null));
        com.iqoption.system.b.c cVar = this.cZW;
        if (cVar == null || !cVar.aUC()) {
            z = false;
        }
        this.cZX = z;
        if (this.cZX) {
            hoVar.cdP.getRoot().setVisibility(0);
            if (VERSION.SDK_INT >= 21) {
                Drawable drawable = getContext().getDrawable(R.drawable.lockscreen_fingerprint_draw_on_animation);
                drawable.setVisible(false, false);
                hoVar.cdP.ced.setImageDrawable(drawable);
            }
            hoVar.cdP.ced.setVisibility(0);
        } else {
            hoVar.cdP.getRoot().setVisibility(4);
        }
        azP();
    }

    private void a(hu huVar, int i, String str) {
        huVar.cef.setText(String.valueOf(i));
        huVar.cee.setText(str);
        huVar.getRoot().setOnClickListener(new a(this, i, null));
    }

    private void dC(boolean z) {
        int i = z ^ 1;
        State state = z ? State.error : State.success;
        if (z || this.dab == PasscodeScreen.passcodeToTurnTouchIdOff || (this.dab == PasscodeScreen.passcodeVerificationOnLogin && !this.cZX)) {
            this.dac.cfe.cec.a(state, i);
            this.dac.cff.cec.a(state, i);
            this.dac.cfg.cec.a(state, i);
            this.dac.cfh.cec.a(state, i);
            this.dac.cfi.cec.a(state, i);
            this.dac.cfj.cec.a(state, i);
        }
        if (z && this.dab != PasscodeScreen.repeatPasscode && this.dab != PasscodeScreen.repeatNewPasscode) {
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.shake);
            loadAnimation.setAnimationListener(new AnimationListener() {
                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    PasscodeFragment.this.reinitialize();
                }
            });
            this.dac.ceL.startAnimation(loadAnimation);
        }
    }

    private void dD(boolean z) {
        this.dac.cfe.cec.a(this.daa > 0 ? State.enabled : State.disabled, z);
        this.dac.cff.cec.a(this.daa > 1 ? State.enabled : State.disabled, z);
        this.dac.cfg.cec.a(this.daa > 2 ? State.enabled : State.disabled, z);
        this.dac.cfh.cec.a(this.daa > 3 ? State.enabled : State.disabled, z);
        this.dac.cfi.cec.a(this.daa > 4 ? State.enabled : State.disabled, z);
        this.dac.cfj.cec.a(this.daa > 5 ? State.enabled : State.disabled, z);
    }

    private void azP() {
        ho hoVar = this.dac.cfc;
        boolean z = true;
        boolean z2 = this.daa < cZZ;
        if (this.daa <= 0) {
            z = false;
        }
        hoVar.cdT.getRoot().setEnabled(z2);
        hoVar.cdX.getRoot().setEnabled(z2);
        hoVar.cdW.getRoot().setEnabled(z2);
        hoVar.cdR.getRoot().setEnabled(z2);
        hoVar.cdQ.getRoot().setEnabled(z2);
        hoVar.cdV.getRoot().setEnabled(z2);
        hoVar.cdU.getRoot().setEnabled(z2);
        hoVar.cdO.getRoot().setEnabled(z2);
        hoVar.cdS.getRoot().setEnabled(z2);
        hoVar.cdY.getRoot().setEnabled(z2);
        hoVar.cdN.getRoot().setEnabled(z);
        hoVar.cdT.cef.setEnabled(z2);
        hoVar.cdX.cef.setEnabled(z2);
        hoVar.cdW.cef.setEnabled(z2);
        hoVar.cdR.cef.setEnabled(z2);
        hoVar.cdQ.cef.setEnabled(z2);
        hoVar.cdV.cef.setEnabled(z2);
        hoVar.cdU.cef.setEnabled(z2);
        hoVar.cdO.cef.setEnabled(z2);
        hoVar.cdS.cef.setEnabled(z2);
        hoVar.cdY.cef.setEnabled(z2);
        hoVar.cdN.ced.setEnabled(z);
    }

    public void b(Context context, PasscodeScreen passcodeScreen) {
        PasscodeScreen passcodeScreen2 = this.dab;
        if (passcodeScreen2 != passcodeScreen) {
            boolean z = passcodeScreen2 == null;
            this.dab = passcodeScreen;
            reinitialize();
            this.dac.cfl.setVisibility(0);
            this.dac.cfb.setVisibility(0);
            this.dac.cfn.setVisibility(8);
            switch (passcodeScreen) {
                case passcode:
                    a(context, (int) R.string.setup_password_title, z);
                    break;
                case repeatPasscode:
                    a(context, (int) R.string.confirm_password_title, z);
                    break;
                case newPasscode:
                    a(context, (int) R.string.setup_password_title, z);
                    break;
                case repeatNewPasscode:
                    a(context, (int) R.string.confirm_password_title, z);
                    break;
                case oldPasscode:
                    a(context, (int) R.string.current_password_title, z);
                    break;
                case passcodeToTurnTouchIdOff:
                    a(context, (int) R.string.current_password_title, z);
                    break;
                case passcodeVerificationOnLogin:
                    this.dac.cfl.setVisibility(8);
                    this.dac.cfb.setVisibility(8);
                    this.dac.cfn.setVisibility(0);
                    this.dac.cfk.setText(this.cZX ? R.string.enter_passcode_or_use_touchid : R.string.enter_passcode);
                    break;
                default:
                    String str = TAG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown screen:");
                    stringBuilder.append(passcodeScreen);
                    Log.w(str, stringBuilder.toString());
                    a(context, (int) R.string.setup_password_title, z);
                    break;
            }
        }
    }

    private void a(Context context, @StringRes int i, boolean z) {
        if (z) {
            this.dac.cfm.setCurrentText(context.getString(i));
        } else {
            this.dac.cfm.setText(context.getString(i));
        }
    }

    private void reinitialize() {
        this.aje = 0;
        this.daa = 0;
        this.dad = false;
        dD(false);
        azP();
    }

    public void ayg() {
        this.dad = false;
        b azQ = azQ();
        if (azQ != null) {
            azQ.zH();
        }
    }

    public void onBackPressed() {
        ayg();
    }

    private void onKeyPressed(int i) {
        if (i != cZY) {
            int i2 = this.daa;
            if (i2 < cZZ) {
                this.aje = (this.aje * 10) + ((long) i);
                this.daa = i2 + 1;
                dD(true);
                azP();
                if (this.daa == cZZ) {
                    com.iqoption.core.c.a.biN.postDelayed(new Runnable() {
                        public void run() {
                            if (PasscodeFragment.this.daa == PasscodeFragment.cZZ) {
                                b e = PasscodeFragment.this.azQ();
                                if (e != null) {
                                    PasscodeFragment passcodeFragment = PasscodeFragment.this;
                                    passcodeFragment.dad = e.a(passcodeFragment, passcodeFragment.dab, PasscodeFragment.this.aje) ^ 1;
                                    PasscodeFragment passcodeFragment2 = PasscodeFragment.this;
                                    passcodeFragment2.dC(passcodeFragment2.dad);
                                }
                            }
                        }
                    }, (long) cZV);
                }
            }
        } else if (this.dad) {
            reinitialize();
        } else {
            this.daa = Math.max(0, this.daa - 1);
            this.aje /= 10;
            azP();
            dD(true);
        }
    }

    private b azQ() {
        Fragment targetFragment = getTargetFragment();
        if (getActivity() instanceof b) {
            return (b) getActivity();
        }
        return targetFragment instanceof b ? (b) targetFragment : null;
    }

    private void a(ho hoVar) {
        final ho hoVar2 = hoVar;
        Keyframe ofFloat = Keyframe.ofFloat(0.0f, 1.0f);
        Keyframe.ofFloat(0.05f, 0.0f).setInterpolator(new DecelerateInterpolator(1.5f));
        Keyframe ofFloat2 = Keyframe.ofFloat(0.9f, 0.0f);
        Keyframe.ofFloat(1.0f, 1.0f).setInterpolator(new AccelerateInterpolator(1.5f));
        ImageView imageView = hoVar2.cdP.ced;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[1];
        Keyframe[] keyframeArr = new Keyframe[]{ofFloat, r4, ofFloat2, r8};
        String str = "alpha";
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, propertyValuesHolderArr);
        Keyframe ofFloat3 = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe.ofFloat(0.1f, 1.0f).setInterpolator(new OvershootInterpolator(2.0f));
        Keyframe ofFloat4 = Keyframe.ofFloat(1.0f, 1.0f);
        Keyframe ofFloat5 = Keyframe.ofFloat(0.9f, 1.0f);
        Keyframe.ofFloat(1.0f, 0.0f).setInterpolator(new DecelerateInterpolator(1.5f));
        ImageView imageView2 = hoVar2.cdP.ceg;
        r6 = new PropertyValuesHolder[3];
        r6[0] = PropertyValuesHolder.ofKeyframe("scaleX", new Keyframe[]{ofFloat3, r11, ofFloat4});
        r6[1] = PropertyValuesHolder.ofKeyframe("scaleY", new Keyframe[]{ofFloat3, r11, ofFloat4});
        r6[2] = PropertyValuesHolder.ofKeyframe(str, new Keyframe[]{ofFloat3, r11, ofFloat5, r1});
        ObjectAnimator.ofPropertyValuesHolder(imageView2, r6).addListener(new AnimatorListenerAdapter() {
            public void onAnimationStart(Animator animator) {
                hoVar2.cdP.ceg.setVisibility(0);
            }

            public void onAnimationEnd(Animator animator) {
                hoVar2.cdP.ceg.setVisibility(8);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofPropertyValuesHolder, r1});
        com.iqoption.core.util.b.a(animatorSet, 1500);
        animatorSet.start();
    }
}
