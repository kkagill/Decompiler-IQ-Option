package com.iqoption.forexcalendar;

import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.PagerAdapter;
import java.util.List;

/* compiled from: BindingPagerAdapter */
public final class b extends PagerAdapter {
    private final List<CharSequence> cSu;
    private final List<ViewDataBinding> cSv;

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public b(List<CharSequence> list, List<ViewDataBinding> list2) {
        this.cSu = list;
        this.cSv = list2;
    }

    public int getCount() {
        return this.cSv.size();
    }

    public CharSequence getPageTitle(int i) {
        return (CharSequence) this.cSu.get(i);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View root = ((ViewDataBinding) this.cSv.get(i)).getRoot();
        viewGroup.addView(root);
        return root;
    }
}
