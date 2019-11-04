package com.iqoption.debugmenu.debugmenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.iqoption.core.ui.fragment.d;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J&\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/DebugMenuFragment;", "Lcom/iqoption/core/ui/fragment/IQFragment;", "()V", "mEasyDebugMenu", "", "mPagerAdapter", "Landroidx/viewpager/widget/PagerAdapter;", "mViewPager", "Landroidx/viewpager/widget/ViewPager;", "onBackPressed", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "Companion", "DebugPagerAdapter", "debugmenu_release"})
/* compiled from: DebugMenuFragment.kt */
public final class b extends d {
    private static final String TAG;
    public static final a cvC = new a();
    private HashMap apm;
    private ViewPager cvA;
    private PagerAdapter cvB;
    private boolean cvz;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/DebugMenuFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "newEntryFromTradeRoom", "Lcom/iqoption/core/ui/navigation/NavigatorEntry;", "newInstance", "Lcom/iqoption/debugmenu/debugmenu/DebugMenuFragment;", "newInstanceFromTradeRoom", "debugmenu_release"})
    /* compiled from: DebugMenuFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final String Bx() {
            return b.TAG;
        }

        public final b aoc() {
            return new b();
        }

        public final b aod() {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putBoolean("mEasyDebugMenu", true);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
    /* compiled from: DebugMenuFragment.kt */
    static final class c implements OnClickListener {
        final /* synthetic */ b cvD;

        c(b bVar) {
            this.cvD = bVar;
        }

        public final void onClick(View view) {
            this.cvD.aly();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\f"}, bng = {"Lcom/iqoption/debugmenu/debugmenu/DebugMenuFragment$DebugPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Lcom/iqoption/debugmenu/debugmenu/DebugMenuFragment;Landroidx/fragment/app/FragmentManager;)V", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "pos", "getPageTitle", "", "debugmenu_release"})
    /* compiled from: DebugMenuFragment.kt */
    public final class b extends FragmentPagerAdapter {
        final /* synthetic */ b cvD;

        public b(b bVar, FragmentManager fragmentManager) {
            kotlin.jvm.internal.i.f(fragmentManager, "fm");
            this.cvD = bVar;
            super(fragmentManager);
        }

        public Fragment getItem(int i) {
            Fragment fragment = (Fragment) null;
            if (this.cvD.cvz) {
                i++;
            }
            if (i == 0) {
                return new f();
            }
            if (i == 1) {
                return new c();
            }
            if (i != 2) {
                return fragment;
            }
            return new d();
        }

        public int getCount() {
            return this.cvD.cvz ? 2 : 3;
        }

        public CharSequence getPageTitle(int i) {
            String str = (String) null;
            if (this.cvD.cvz) {
                i++;
            }
            if (i == 0) {
                str = "Sandbox";
            } else if (i == 1) {
                str = "Feature";
            } else if (i == 2) {
                str = "Parameters";
            }
            return str;
        }
    }

    public void Bj() {
        HashMap hashMap = this.apm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        Bj();
    }

    static {
        String name = b.class.getName();
        if (name == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        TAG = name;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.f(layoutInflater, "inflater");
        return layoutInflater.inflate(com.iqoption.debugmenu.c.c.debug_console, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            this.cvz = com.iqoption.core.ext.a.s(this).getBoolean("mEasyDebugMenu", false);
        }
        View findViewById = view.findViewById(com.iqoption.debugmenu.c.b.buildVersion);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            String Va = com.iqoption.core.d.EE().Va();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Version=");
            stringBuilder.append(com.iqoption.core.d.Un().Dy());
            stringBuilder.append("(");
            stringBuilder.append(com.iqoption.core.d.Un().getVersionCode());
            stringBuilder.append(")\n");
            stringBuilder.append(Va);
            textView.setText(stringBuilder.toString());
            FragmentManager childFragmentManager = getChildFragmentManager();
            kotlin.jvm.internal.i.e(childFragmentManager, "childFragmentManager");
            this.cvB = new b(this, childFragmentManager);
            findViewById = view.findViewById(com.iqoption.debugmenu.c.b.viewpager);
            if (findViewById != null) {
                this.cvA = (ViewPager) findViewById;
                ViewPager viewPager = this.cvA;
                Va = "mViewPager";
                if (viewPager == null) {
                    kotlin.jvm.internal.i.lG(Va);
                }
                PagerAdapter pagerAdapter = this.cvB;
                if (pagerAdapter == null) {
                    kotlin.jvm.internal.i.lG("mPagerAdapter");
                }
                viewPager.setAdapter(pagerAdapter);
                viewPager = this.cvA;
                if (viewPager == null) {
                    kotlin.jvm.internal.i.lG(Va);
                }
                viewPager.setCurrentItem(0);
                viewPager = this.cvA;
                if (viewPager == null) {
                    kotlin.jvm.internal.i.lG(Va);
                }
                viewPager.setOffscreenPageLimit(0);
                view.findViewById(com.iqoption.debugmenu.c.b.backButton).setOnClickListener(new c(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* Access modifiers changed, original: protected */
    public boolean a(FragmentManager fragmentManager) {
        com.iqoption.core.d.EH().save();
        com.iqoption.core.ext.a.t(this).popBackStack();
        return true;
    }
}
