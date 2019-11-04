package com.iqoption.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.List;

/* compiled from: SimplePagerAdapter */
public class f extends PagerAdapter {
    private List<View> ano;

    public f(List<View> list) {
        this.ano = list;
    }

    public int getCount() {
        return this.ano.size();
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        viewGroup.addView((View) this.ano.get(i));
        return this.ano.get(i);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
