package com.iqoption.marketanalysis.a;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, bng = {"Lcom/iqoption/marketanalysis/adapter/MarketAnalysisPageAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "titles", "", "", "fragments", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;Ljava/util/List;)V", "getCount", "", "getItem", "position", "getPageTitle", "app_optionXRelease"})
/* compiled from: MarketAnalysisPageAdapter.kt */
public final class a extends FragmentPagerAdapter {
    private final List<CharSequence> cSu;
    private final List<Fragment> dFt;

    public a(FragmentManager fragmentManager, List<? extends CharSequence> list, List<? extends Fragment> list2) {
        kotlin.jvm.internal.i.f(fragmentManager, "fm");
        kotlin.jvm.internal.i.f(list, "titles");
        kotlin.jvm.internal.i.f(list2, "fragments");
        super(fragmentManager);
        this.cSu = list;
        this.dFt = list2;
    }

    public Fragment getItem(int i) {
        return (Fragment) this.dFt.get(i);
    }

    public int getCount() {
        return this.dFt.size();
    }

    public CharSequence getPageTitle(int i) {
        return (CharSequence) this.cSu.get(i);
    }
}
