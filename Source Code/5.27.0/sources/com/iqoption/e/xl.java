package com.iqoption.e;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.CryptoAssetPager;

/* compiled from: RightPanelDelegateCryptoBinding */
public abstract class xl extends ViewDataBinding {
    @NonNull
    public final CryptoAssetPager csf;
    @NonNull
    public final xn csg;
    @NonNull
    public final xp csh;
    @NonNull
    public final xr csi;
    @NonNull
    public final xt csj;
    @NonNull
    public final xv csk;

    protected xl(Object obj, View view, int i, CryptoAssetPager cryptoAssetPager, xn xnVar, xp xpVar, xr xrVar, xt xtVar, xv xvVar) {
        super(obj, view, i);
        this.csf = cryptoAssetPager;
        this.csg = xnVar;
        setContainedBinding(this.csg);
        this.csh = xpVar;
        setContainedBinding(this.csh);
        this.csi = xrVar;
        setContainedBinding(this.csi);
        this.csj = xtVar;
        setContainedBinding(this.csj);
        this.csk = xvVar;
        setContainedBinding(this.csk);
    }
}
