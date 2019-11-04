package com.iqoption.a;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\tH\u0016J\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, bng = {"Lcom/iqoption/adapter/TitlePagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentManager;)V", "pages", "", "Lcom/iqoption/adapter/AdapterPage;", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "getItemPosition", "page", "", "getPageTitle", "", "updatePages", "", "newPages", "", "app_optionXRelease"})
/* compiled from: TitlePagerAdapter.kt */
public final class l extends FragmentStatePagerAdapter {
    private final List<a> ano = new ArrayList();

    public l(FragmentManager fragmentManager) {
        kotlin.jvm.internal.i.f(fragmentManager, "fm");
        super(fragmentManager);
    }

    public Fragment getItem(int i) {
        return ((a) this.ano.get(i)).gH();
    }

    public int getCount() {
        return this.ano.size();
    }

    public CharSequence getPageTitle(int i) {
        return ((a) this.ano.get(i)).getTitle();
    }

    public final void s(List<a> list) {
        kotlin.jvm.internal.i.f(list, "newPages");
        this.ano.clear();
        this.ano.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemPosition(Object obj) {
        Object obj2;
        Integer num;
        kotlin.jvm.internal.i.f(obj, "page");
        Iterable iterable = this.ano;
        Collection arrayList = new ArrayList(n.e(iterable, 10));
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                m.bno();
            }
            arrayList.add(new Pair(Integer.valueOf(i), next));
            i = i2;
        }
        Iterator it = ((List) arrayList).iterator();
        do {
            num = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
        } while (!kotlin.jvm.internal.i.y(((a) ((Pair) obj2).bni()).gH(), obj));
        Pair pair = (Pair) obj2;
        if (pair != null) {
            num = (Integer) pair.getFirst();
        }
        return num != null ? num.intValue() : -2;
    }
}
