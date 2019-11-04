package com.iqoption.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.iqoption.x.R;

public class DialpadDot extends FrameLayout {
    public static int cZV = 150;
    private View eoA;
    private State eoB = State.disabled;
    private View eox;
    private View eoy;
    private View eoz;

    /* renamed from: com.iqoption.widget.DialpadDot$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] eoD = new int[State.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = com.iqoption.widget.DialpadDot.State.values();
            r0 = r0.length;
            r0 = new int[r0];
            eoD = r0;
            r0 = eoD;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.widget.DialpadDot.State.error;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = eoD;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.widget.DialpadDot.State.success;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = eoD;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.iqoption.widget.DialpadDot.State.enabled;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = eoD;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.iqoption.widget.DialpadDot.State.disabled;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.widget.DialpadDot$AnonymousClass2.<clinit>():void");
        }
    }

    public enum State {
        disabled,
        enabled,
        error,
        success
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public DialpadDot(Context context) {
        super(context);
        b(context, null);
    }

    public DialpadDot(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public DialpadDot(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context, attributeSet);
    }

    @TargetApi(21)
    public DialpadDot(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b(context, attributeSet);
    }

    private void b(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialpad_dot_layout, this, true);
        this.eox = inflate.findViewById(R.id.dotDisabled);
        this.eoy = inflate.findViewById(R.id.dotEnabled);
        this.eoz = inflate.findViewById(R.id.dotError);
        this.eoA = inflate.findViewById(R.id.dotSuccess);
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void a(State state, boolean z) {
        State state2 = this.eoB;
        if (state2 != state) {
            this.eoB = state;
            int i = AnonymousClass2.eoD[state.ordinal()];
            if (i == 1) {
                h(this.eoz, z);
            } else if (i == 2) {
                h(this.eoA, z);
            } else if (i != 3) {
                if (i == 4) {
                    this.eox.setVisibility(0);
                    if (state2 == State.enabled) {
                        i(this.eoy, z);
                    } else if (state2 == State.error) {
                        this.eoy.setVisibility(8);
                        i(this.eoz, z);
                    }
                }
            } else if (state2 == State.error) {
                this.eoy.setVisibility(0);
                i(this.eoz, z);
            } else {
                h(this.eoy, z);
            }
        }
    }

    private void h(View view, boolean z) {
        if (z) {
            ck(view);
        } else {
            ak(view);
        }
    }

    private void i(View view, boolean z) {
        if (z) {
            cl(view);
        } else {
            hide(view);
        }
    }

    private void ck(View view) {
        view.setAlpha(0.2f);
        view.setScaleX(0.2f);
        view.setScaleY(0.2f);
        view.setVisibility(0);
        view.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setListener(null).setDuration((long) cZV);
    }

    private void cl(final View view) {
        view.animate().scaleX(0.2f).scaleY(0.2f).alpha(0.2f).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                view.setVisibility(8);
                view.animate().setListener(null);
            }
        }).setDuration((long) cZV);
    }

    private void ak(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setVisibility(0);
    }

    private void hide(View view) {
        view.setVisibility(8);
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }
}
