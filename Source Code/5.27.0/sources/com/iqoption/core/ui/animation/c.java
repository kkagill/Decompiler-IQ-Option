package com.iqoption.core.ui.animation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.iqoption.core.ui.fragment.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u0001J\t\u0010\u0017\u001a\u00020\u0016H\u0001R\u0012\u0010\u0006\u001a\u00020\u0007X\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, bng = {"Lcom/iqoption/core/ui/animation/EnterExitAnimationProvider;", "Lcom/iqoption/core/ui/animation/AnimationProvider;", "Lcom/iqoption/core/ui/animation/EnterExitAnimatable;", "fragment", "Lcom/iqoption/core/ui/fragment/IQFragment;", "(Lcom/iqoption/core/ui/fragment/IQFragment;)V", "enterAnimationDuration", "", "getEnterAnimationDuration", "()J", "exitAnimationDuration", "getExitAnimationDuration", "getFragment", "()Lcom/iqoption/core/ui/fragment/IQFragment;", "createAnimation", "Landroid/view/animation/Animation;", "transit", "", "enter", "", "nextAnim", "onEnterAnimation", "", "onExitAnimation", "core_release"})
/* compiled from: EnterExitAnimationProvider.kt */
public final class c implements a {
    private final d bHf;

    @i(bne = {1, 1, 15}, bnf = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b¸\u0006\u0000"}, bng = {"com/iqoption/core/ui/animation/EnterExitAnimationProvider$createAnimation$1$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "core_release"})
    /* compiled from: EnterExitAnimationProvider.kt */
    public static final class a implements AnimationListener {
        final /* synthetic */ View aBq;
        final /* synthetic */ c bHg;
        final /* synthetic */ boolean bHh;
        final /* synthetic */ long bHi;

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        a(c cVar, boolean z, View view, long j) {
            this.bHg = cVar;
            this.bHh = z;
            this.aBq = view;
            this.bHi = j;
        }

        public void onAnimationStart(Animation animation) {
            if (this.bHh) {
                this.aBq.setAlpha(1.0f);
                this.bHg.PX();
                return;
            }
            this.bHg.PY();
        }
    }

    public long PV() {
        return this.bHf.PV();
    }

    public long PW() {
        return this.bHf.PW();
    }

    public void PX() {
        this.bHf.PX();
    }

    public void PY() {
        this.bHf.PY();
    }

    public c(d dVar) {
        kotlin.jvm.internal.i.f(dVar, "fragment");
        this.bHf = dVar;
    }

    public Animation a(int i, boolean z, int i2) {
        if (i2 != 0) {
            return this.bHf.fd(i2);
        }
        if (i != 0) {
            return null;
        }
        long PV = z ? PV() : PW();
        if (PV == 0) {
            return null;
        }
        View view = this.bHf.getView();
        if (view == null) {
            return null;
        }
        kotlin.jvm.internal.i.e(view, "fragment.view ?: return null");
        com.iqoption.core.graphics.animation.d dVar = new com.iqoption.core.graphics.animation.d();
        if (z) {
            view.setAlpha(0.0f);
        }
        dVar.setDuration(PV);
        dVar.setAnimationListener(new a(this, z, view, PV));
        return dVar;
    }
}
