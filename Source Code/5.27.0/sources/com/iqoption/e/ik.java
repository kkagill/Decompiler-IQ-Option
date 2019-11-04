package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.account.security.touchId.PasscodeFragment;

/* compiled from: FragmentAccountSecurityPasscodeBinding */
public abstract class ik extends ViewDataBinding {
    @NonNull
    public final LinearLayout bgn;
    @NonNull
    public final LinearLayout ceL;
    @NonNull
    public final FrameLayout cfa;
    @NonNull
    public final TextView cfb;
    @NonNull
    public final ho cfc;
    @NonNull
    public final hq cfe;
    @NonNull
    public final hq cff;
    @NonNull
    public final hq cfg;
    @NonNull
    public final hq cfh;
    @NonNull
    public final hq cfi;
    @NonNull
    public final hq cfj;
    @NonNull
    public final TextView cfk;
    @NonNull
    public final FrameLayout cfl;
    @NonNull
    public final TextSwitcher cfm;
    @NonNull
    public final LinearLayout cfn;
    @Bindable
    protected PasscodeFragment cfo;

    public abstract void a(@Nullable PasscodeFragment passcodeFragment);

    protected ik(Object obj, View view, int i, TextView textView, ho hoVar, hq hqVar, hq hqVar2, hq hqVar3, hq hqVar4, hq hqVar5, hq hqVar6, LinearLayout linearLayout, TextView textView2, LinearLayout linearLayout2, FrameLayout frameLayout, FrameLayout frameLayout2, TextSwitcher textSwitcher, LinearLayout linearLayout3) {
        super(obj, view, i);
        this.cfb = textView;
        this.cfc = hoVar;
        setContainedBinding(this.cfc);
        this.cfe = hqVar;
        setContainedBinding(this.cfe);
        this.cff = hqVar2;
        setContainedBinding(this.cff);
        this.cfg = hqVar3;
        setContainedBinding(this.cfg);
        this.cfh = hqVar4;
        setContainedBinding(this.cfh);
        this.cfi = hqVar5;
        setContainedBinding(this.cfi);
        this.cfj = hqVar6;
        setContainedBinding(this.cfj);
        this.ceL = linearLayout;
        this.cfk = textView2;
        this.bgn = linearLayout2;
        this.cfa = frameLayout;
        this.cfl = frameLayout2;
        this.cfm = textSwitcher;
        this.cfn = linearLayout3;
    }
}
