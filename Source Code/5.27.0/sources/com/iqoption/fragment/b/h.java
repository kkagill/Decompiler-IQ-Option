package com.iqoption.fragment.b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.MediaController;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.gson.JsonObject;
import com.iqoption.analytics.EventManager;
import com.iqoption.core.ui.fragment.d;
import com.iqoption.dto.Event;
import com.iqoption.e.mx;
import com.iqoption.popup.c;
import com.iqoption.util.e;
import com.iqoption.x.R;
import java.util.Map.Entry;

/* compiled from: PromoVideoFragment */
public class h extends d {
    public static final String TAG = "com.iqoption.fragment.b.h";
    private Rect ddA;
    private float ddB;
    private float ddC;
    private float ddD;
    private float ddE;
    private String ddF;
    private boolean ddG;
    private a ddH;
    protected AnimatorSet ddI;
    protected mx ddy;
    protected boolean ddz = true;
    private int progress;

    /* compiled from: PromoVideoFragment */
    private static final class a {
        private final float alpha;
        private final float apo;
        private final float dM;

        /* synthetic */ a(float f, float f2, float f3, AnonymousClass1 anonymousClass1) {
            this(f, f2, f3);
        }

        private a(float f, float f2, float f3) {
            this.alpha = f;
            this.apo = f2;
            this.dM = f3;
        }
    }

    /* compiled from: PromoVideoFragment */
    private class b implements OnTouchListener {
        private float aAc;
        private float ddK;
        private float ddL;

        private b() {
            this.aAc = -1.0f;
            this.ddK = -1.0f;
            this.ddL = -1.0f;
        }

        /* synthetic */ b(h hVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX WARNING: Missing block: B:13:0x0037, code skipped:
            if (r0 != 3) goto L_0x00f1;
     */
        public boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
            /*
            r6 = this;
            r0 = r6.aAc;
            r1 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
            r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
            if (r0 != 0) goto L_0x0017;
        L_0x0008:
            r0 = r7.getContext();
            r0 = android.view.ViewConfiguration.get(r0);
            r0 = r0.getScaledTouchSlop();
            r0 = (float) r0;
            r6.aAc = r0;
        L_0x0017:
            r0 = r6.ddK;
            r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
            if (r0 != 0) goto L_0x0027;
        L_0x001d:
            r0 = r7.getHeight();
            r0 = (float) r0;
            r2 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
            r0 = r0 / r2;
            r6.ddK = r0;
        L_0x0027:
            r0 = r8.getActionMasked();
            r2 = 1;
            if (r0 == 0) goto L_0x00eb;
        L_0x002e:
            r3 = 0;
            r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            if (r0 == r2) goto L_0x0090;
        L_0x0033:
            r5 = 2;
            if (r0 == r5) goto L_0x003b;
        L_0x0036:
            r5 = 3;
            if (r0 == r5) goto L_0x0090;
        L_0x0039:
            goto L_0x00f1;
        L_0x003b:
            r7 = r6.ddL;
            r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
            if (r7 != 0) goto L_0x0043;
        L_0x0041:
            goto L_0x00f1;
        L_0x0043:
            r7 = r8.getY();
            r8 = r6.ddL;
            r7 = r7 - r8;
            r8 = java.lang.Math.abs(r7);
            r0 = r6.aAc;
            r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
            if (r8 > 0) goto L_0x0056;
        L_0x0054:
            goto L_0x00f1;
        L_0x0056:
            r8 = java.lang.Math.abs(r7);
            r0 = r6.ddK;
            r8 = r8 / r0;
            r8 = com.iqoption.util.ab.i(r8, r3, r4);
            r4 = r4 - r8;
            r8 = com.iqoption.fragment.b.h.this;
            r8 = r8.ddy;
            r8 = r8.cio;
            r8.setAlpha(r4);
            r8 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;
            r0 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
            r4 = r4 * r0;
            r4 = r4 + r8;
            r8 = com.iqoption.fragment.b.h.this;
            r8 = r8.ddy;
            r8 = r8.cir;
            r8.setScaleX(r4);
            r8 = com.iqoption.fragment.b.h.this;
            r8 = r8.ddy;
            r8 = r8.cir;
            r8.setScaleY(r4);
            r8 = com.iqoption.fragment.b.h.this;
            r8 = r8.ddy;
            r8 = r8.cir;
            r8.setTranslationY(r7);
            goto L_0x00f1;
        L_0x0090:
            r0 = r6.ddL;
            r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
            if (r0 != 0) goto L_0x0097;
        L_0x0096:
            goto L_0x00f1;
        L_0x0097:
            r8 = r8.getY();
            r0 = r6.ddL;
            r8 = r8 - r0;
            r0 = java.lang.Math.abs(r8);
            r1 = r6.aAc;
            r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
            if (r0 > 0) goto L_0x00a9;
        L_0x00a8:
            goto L_0x00f1;
        L_0x00a9:
            r0 = java.lang.Math.abs(r8);
            r1 = r6.ddK;
            r5 = 0;
            r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
            if (r0 <= 0) goto L_0x00dc;
        L_0x00b4:
            r0 = com.iqoption.fragment.b.h.this;
            r1 = new com.iqoption.fragment.b.h$a;
            r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
            if (r8 <= 0) goto L_0x00be;
        L_0x00bc:
            r8 = 1;
            goto L_0x00bf;
        L_0x00be:
            r8 = -1;
        L_0x00bf:
            r7 = r7.getHeight();
            r8 = r8 * r7;
            r7 = (float) r8;
            r8 = com.iqoption.fragment.b.h.this;
            r8 = r8.ddy;
            r8 = r8.cir;
            r8 = r8.getScaleX();
            r1.<init>(r3, r7, r8, r5);
            r0.ddH = r1;
            r7 = com.iqoption.fragment.b.h.this;
            r7.onClose();
            goto L_0x00f1;
        L_0x00dc:
            r7 = com.iqoption.fragment.b.h.this;
            r8 = new com.iqoption.fragment.b.h$a;
            r8.<init>(r4, r3, r4, r5);
            r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
            r3 = com.iqoption.view.a.a.c.egR;
            r7.a(r8, r0, r3);
            goto L_0x00f1;
        L_0x00eb:
            r7 = r8.getY();
            r6.ddL = r7;
        L_0x00f1:
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.fragment.b.h$b.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    public boolean PU() {
        return true;
    }

    public static void a(FragmentActivity fragmentActivity, FragmentManager fragmentManager, String str, Rect rect, boolean z) {
        a(R.id.other_fragment, fragmentActivity, fragmentManager, str, rect, z);
    }

    public static void a(@IdRes int i, FragmentActivity fragmentActivity, FragmentManager fragmentManager, String str, Rect rect, boolean z) {
        c.A(fragmentActivity).a(new -$$Lambda$h$6O8qbPljDx5cAcWUzOb4Uves3z0(i, fragmentManager, str, rect, z), TAG);
    }

    private static void a(@IdRes int i, FragmentManager fragmentManager, String str, Rect rect, boolean z) {
        if (fragmentManager.findFragmentByTag(TAG) == null) {
            fragmentManager.beginTransaction().add(i, a(str, rect, z, null), TAG).addToBackStack(TAG).commit();
        }
    }

    public static Fragment a(String str, Rect rect, boolean z, @Nullable com.iqoption.o.a aVar) {
        h hVar = new h();
        hVar.setArguments(new e().aF("arg.videoPath", str).a("arg.revealRect", (Parcelable) rect).z("arg.allowMediaController", z).b("arg.analyticsData", (Parcelable) aVar).toBundle());
        return hVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.progress = bundle.getInt("key.progress");
            this.ddG = bundle.getBoolean("STATE_ANALYTICS_EVENT_SENT");
        }
    }

    /* Access modifiers changed, original: protected */
    public void axE() {
        this.ddy.ciq.setOnTouchListener(new b(this, null));
        this.ddy.cip.setVisibility(8);
        com.iqoption.o.a aVar = (com.iqoption.o.a) getArguments().getParcelable("arg.analyticsData");
        if (!this.ddG && aVar != null) {
            this.ddG = true;
            JsonObject jsonObject = new JsonObject();
            for (Entry entry : aVar.aUM().entrySet()) {
                jsonObject.addProperty((String) entry.getKey(), (String) entry.getValue());
            }
            EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, aVar.getName()).setDuration((long) this.ddy.cis.getDuration()).setValue(Double.valueOf(aVar.getValue())).setParameters(jsonObject).build());
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        mx mxVar = (mx) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_promo_video, viewGroup, false);
        this.ddy = mxVar;
        return mxVar.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            onClose();
            return;
        }
        this.ddF = arguments.getString("arg.videoPath");
        if (TextUtils.isEmpty(this.ddF)) {
            onClose();
            return;
        }
        this.ddy.cip.setVisibility(this.ddz ? 0 : 8);
        this.ddy.cis.setOnErrorListener(new -$$Lambda$h$TDrZ2a6As-QPJBfCYD9l4m3EkwM(this));
        this.ddy.cis.setOnPreparedListener(new -$$Lambda$h$aSwUXp9_ZOlwBZQ2cLpatyL1gvw(this));
        this.ddy.cis.setOnCompletionListener(new -$$Lambda$h$hxrZblQT4Bz5B8Xr2ljTr33QmKM(this));
        this.ddy.cis.setVideoPath(this.ddF);
        this.ddy.cis.seekTo(this.progress);
        if (arguments.getBoolean("arg.allowMediaController")) {
            this.ddy.cis.setMediaController(new MediaController(getContext()));
        }
        this.ddA = (Rect) arguments.getParcelable("arg.revealRect");
        if (this.ddA != null) {
            this.ddy.getRoot().addOnLayoutChangeListener(new OnLayoutChangeListener() {
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    h.this.ddy.getRoot().removeOnLayoutChangeListener(this);
                    int width = h.this.ddy.cir.getWidth();
                    i = h.this.ddy.cir.getHeight();
                    i2 = h.this.ddA.width();
                    i3 = h.this.ddA.height();
                    float f = (float) width;
                    h.this.ddB = ((float) i2) / f;
                    float f2 = (float) i;
                    h.this.ddC = ((float) i3) / f2;
                    float f3 = (float) h.this.ddA.left;
                    float f4 = (float) h.this.ddA.top;
                    h.this.ddy.cir.setScaleX(h.this.ddB);
                    h.this.ddy.cir.setScaleY(h.this.ddC);
                    i4 = (int) (h.this.ddC * f2);
                    h.this.ddD = f3 - ((float) ((width - ((int) (h.this.ddB * f))) / 2));
                    h.this.ddE = f4 - ((float) ((i - i4) / 2));
                    h.this.ddy.cir.setTranslationX(h.this.ddD);
                    h.this.ddy.cir.setTranslationY(h.this.ddE);
                    h.this.ddy.cir.setAlpha(0.0f);
                }
            });
        }
    }

    public void onResume() {
        super.onResume();
        this.ddy.cis.start();
    }

    public void onPause() {
        super.onPause();
        this.ddy.cis.pause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.progress = this.ddy.cis.getCurrentPosition();
        bundle.putInt("key.progress", this.progress);
        bundle.putBoolean("STATE_ANALYTICS_EVENT_SENT", this.ddG);
    }

    /* Access modifiers changed, original: protected */
    public boolean a(@Nullable FragmentManager fragmentManager) {
        return onClose();
    }

    /* Access modifiers changed, original: protected */
    public boolean onClose() {
        FragmentManager fragmentManager = getFragmentManager();
        if (!(fragmentManager == null || fragmentManager.isStateSaved())) {
            fragmentManager.popBackStack();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            c.A(activity).jr(TAG);
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void a(a aVar, long j, Interpolator interpolator) {
        AnimatorSet animatorSet = this.ddI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.ddI = new AnimatorSet();
        animatorSet = this.ddI;
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = ObjectAnimator.ofFloat(this.ddy.cio, View.ALPHA, new float[]{aVar.alpha});
        FrameLayout frameLayout = this.ddy.cir;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[5];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{aVar.alpha});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{aVar.dM});
        propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{aVar.dM});
        propertyValuesHolderArr[3] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
        propertyValuesHolderArr[4] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{aVar.apo});
        animatorArr[1] = ObjectAnimator.ofPropertyValuesHolder(frameLayout, propertyValuesHolderArr);
        animatorSet.playTogether(animatorArr);
        com.iqoption.core.util.b.a(this.ddI, j).setInterpolator(interpolator);
        this.ddI.start();
    }

    /* Access modifiers changed, original: protected */
    public void a(long j, Interpolator interpolator) {
        AnimatorSet animatorSet = this.ddI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.ddI = new AnimatorSet();
        animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = ObjectAnimator.ofFloat(this.ddy.cio, View.ALPHA, new float[]{1.0f});
        FrameLayout frameLayout = this.ddy.cir;
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[5];
        propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{1.0f});
        propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f});
        propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f});
        propertyValuesHolderArr[3] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{0.0f});
        propertyValuesHolderArr[4] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{0.0f});
        animatorArr[1] = ObjectAnimator.ofPropertyValuesHolder(frameLayout, propertyValuesHolderArr);
        animatorSet.playTogether(animatorArr);
        AnimatorSet animatorSet2 = this.ddI;
        Animator[] animatorArr2 = new Animator[2];
        animatorArr2[0] = ObjectAnimator.ofFloat(this.ddy.cir, View.ALPHA, new float[]{1.0f});
        animatorArr2[1] = animatorSet;
        animatorSet2.playSequentially(animatorArr2);
        com.iqoption.core.util.b.a(this.ddI, j).setInterpolator(interpolator);
        this.ddI.start();
    }

    /* Access modifiers changed, original: protected */
    public void b(long j, Interpolator interpolator) {
        AnimatorSet animatorSet = this.ddI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.ddI = new AnimatorSet();
        if (this.ddA != null) {
            animatorSet = this.ddI;
            Animator[] animatorArr = new Animator[2];
            animatorArr[0] = ObjectAnimator.ofFloat(this.ddy.cio, View.ALPHA, new float[]{0.0f});
            FrameLayout frameLayout = this.ddy.cir;
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[5];
            propertyValuesHolderArr[0] = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f});
            propertyValuesHolderArr[1] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{this.ddB});
            propertyValuesHolderArr[2] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{this.ddC});
            propertyValuesHolderArr[3] = PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{this.ddD});
            propertyValuesHolderArr[4] = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{this.ddE});
            animatorArr[1] = ObjectAnimator.ofPropertyValuesHolder(frameLayout, propertyValuesHolderArr);
            animatorSet.playTogether(animatorArr);
        } else {
            animatorSet = this.ddI;
            Animator[] animatorArr2 = new Animator[2];
            animatorArr2[0] = ObjectAnimator.ofFloat(this.ddy.cio, View.ALPHA, new float[]{0.0f});
            animatorArr2[1] = ObjectAnimator.ofFloat(this.ddy.cir, View.ALPHA, new float[]{0.0f});
            animatorSet.playTogether(animatorArr2);
        }
        com.iqoption.core.util.b.a(this.ddI, j).setInterpolator(interpolator);
        this.ddI.start();
    }

    public void PX() {
        a(500, com.iqoption.view.a.a.c.egR);
    }

    public void PY() {
        a aVar = this.ddH;
        if (aVar != null) {
            a(aVar, 200, com.iqoption.view.a.a.c.bhU);
        } else {
            b(200, com.iqoption.view.a.a.c.egR);
        }
    }
}
