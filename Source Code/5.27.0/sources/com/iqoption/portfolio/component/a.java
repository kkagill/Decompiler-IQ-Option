package com.iqoption.portfolio.component;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.iqoption.portfolio.fragment.m;
import java.util.List;

/* compiled from: BindingPagerAdapter */
public final class a extends PagerAdapter {
    private final TabLayout dLQ;
    private final List<m> iA;

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    public a(TabLayout tabLayout, List<m> list) {
        this.dLQ = tabLayout;
        this.iA = list;
    }

    public int getCount() {
        return this.iA.size();
    }

    public CharSequence getPageTitle(int i) {
        return ((m) this.iA.get(i)).getTitle();
    }

    @NonNull
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View root = ((m) this.iA.get(i)).getBinding().getRoot();
        viewGroup.addView(root);
        return root;
    }
}
