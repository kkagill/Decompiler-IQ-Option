package com.iqoption.chat.d;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, bng = {"Lcom/iqoption/chat/tmp/ProgressLottieStateSwitcher;", "Lcom/iqoption/chat/tmp/LottieStateSwitcher;", "view", "Lcom/airbnb/lottie/LottieAnimationView;", "states", "", "(Lcom/airbnb/lottie/LottieAnimationView;[F)V", "value", "", "current", "getCurrent", "()I", "setCurrent", "(I)V", "getView", "()Lcom/airbnb/lottie/LottieAnimationView;", "canBackward", "", "canForward", "reset", "", "switchBackward", "switchForward", "chat_release"})
/* compiled from: ProgressLottieStateSwitcher.kt */
public final class b implements a {
    private final LottieAnimationView aWp;
    private final float[] aWq;
    private int current;

    public b(LottieAnimationView lottieAnimationView, float[] fArr) {
        kotlin.jvm.internal.i.f(lottieAnimationView, Promotion.ACTION_VIEW);
        kotlin.jvm.internal.i.f(fArr, "states");
        this.aWp = lottieAnimationView;
        this.aWq = fArr;
    }

    public LottieAnimationView SZ() {
        return this.aWp;
    }

    public final void eE(int i) {
        if (this.current != i) {
            this.current = i;
            LottieAnimationView SZ = SZ();
            if (SZ.isAnimating()) {
                SZ.ad();
            }
            if (i == 0) {
                SZ.setProgress(this.aWq[i]);
            } else {
                SZ.setMaxProgress(this.aWq[i]);
                if (SZ.getProgress() == 0.0f) {
                    SZ.Z();
                } else {
                    SZ.aa();
                }
            }
        }
    }

    public void SX() {
        if (SY()) {
            eE(this.current + 1);
        }
    }

    public boolean SY() {
        return this.current < this.aWq.length - 1;
    }

    public void reset() {
        eE(0);
    }
}
