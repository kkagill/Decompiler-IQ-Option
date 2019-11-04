package com.iqoption.core.ui.fragment;

import androidx.fragment.app.Fragment;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "", "it", "Landroidx/fragment/app/Fragment;", "invoke"})
/* compiled from: IQFragment.kt */
final class IQFragment$onHiddenChanged$1 extends Lambda implements b<Fragment, l> {
    final /* synthetic */ boolean $hidden;

    IQFragment$onHiddenChanged$1(boolean z) {
        this.$hidden = z;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        x((Fragment) obj);
        return l.eVB;
    }

    public final void x(Fragment fragment) {
        kotlin.jvm.internal.i.f(fragment, "it");
        if (fragment instanceof d) {
            ((d) fragment).cG(this.$hidden);
        }
    }
}
