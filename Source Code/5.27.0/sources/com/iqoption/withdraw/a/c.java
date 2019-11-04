package com.iqoption.withdraw.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: FragmentWithdrawFieldsBinding */
public abstract class c extends ViewDataBinding {
    @NonNull
    public final y epT;
    @NonNull
    public final s epU;
    @NonNull
    public final LinearLayout epV;
    @NonNull
    public final ae epW;
    @NonNull
    public final LinearLayout epX;
    @NonNull
    public final FrameLayout epY;
    @NonNull
    public final u epZ;

    protected c(Object obj, View view, int i, y yVar, s sVar, LinearLayout linearLayout, ae aeVar, LinearLayout linearLayout2, FrameLayout frameLayout, u uVar) {
        super(obj, view, i);
        this.epT = yVar;
        setContainedBinding(this.epT);
        this.epU = sVar;
        setContainedBinding(this.epU);
        this.epV = linearLayout;
        this.epW = aeVar;
        setContainedBinding(this.epW);
        this.epX = linearLayout2;
        this.epY = frameLayout;
        this.epZ = uVar;
        setContainedBinding(this.epZ);
    }
}
