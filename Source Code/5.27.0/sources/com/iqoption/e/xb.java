package com.iqoption.e;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: RightPanelDelegateCfdBinding */
public abstract class xb extends ViewDataBinding {
    @NonNull
    public final xd cqV;
    @NonNull
    public final xf cqW;

    protected xb(Object obj, View view, int i, xd xdVar, xf xfVar) {
        super(obj, view, i);
        this.cqV = xdVar;
        setContainedBinding(this.cqV);
        this.cqW = xfVar;
        setContainedBinding(this.cqW);
    }
}
