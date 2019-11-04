package com.iqoption.fragment.b;

import android.os.Bundle;
import android.view.animation.Animation;
import androidx.annotation.Nullable;
import com.iqoption.view.a.a;

/* compiled from: IQAnimationFragment */
public abstract class b extends d {
    private boolean ddm = false;
    private boolean ddn = false;

    public abstract void att();

    public abstract void atu();

    public long getAnimationDuration() {
        return 500;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dK(true);
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (z && this.ddm) {
            return null;
        }
        if (!z && this.ddn) {
            return null;
        }
        a aVar = new a();
        if (z) {
            aVar.setDuration(axh() + 16);
            if (getView() != null) {
                getView().setAlpha(0.0f);
                aVar.setAnimationListener(com.iqoption.view.a.a.a.a.d(new -$$Lambda$b$odSaLbpArLR6SiYii3rqfLuGtVI(this)));
            }
        } else {
            aVar.setDuration(axj() + 16);
            aVar.setAnimationListener(com.iqoption.view.a.a.a.a.d(new -$$Lambda$-m4AMwVGxF3Fji1GlvS60LsygVM(this)));
        }
        return aVar;
    }

    private /* synthetic */ void aBL() {
        att();
        if (getView() != null) {
            getView().setAlpha(1.0f);
        }
    }

    public void dK(boolean z) {
        this.ddm = z;
    }

    public long axh() {
        return getAnimationDuration();
    }

    public long axj() {
        return getAnimationDuration();
    }
}
