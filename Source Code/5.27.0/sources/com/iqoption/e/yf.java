package com.iqoption.e;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: RightPanelDelegateOnOpenCfdBinding */
public abstract class yf extends ViewDataBinding {
    @NonNull
    public final xh ctt;
    @NonNull
    public final xj ctu;

    protected yf(Object obj, View view, int i, xh xhVar, xj xjVar) {
        super(obj, view, i);
        this.ctt = xhVar;
        setContainedBinding(this.ctt);
        this.ctu = xjVar;
        setContainedBinding(this.ctu);
    }
}
