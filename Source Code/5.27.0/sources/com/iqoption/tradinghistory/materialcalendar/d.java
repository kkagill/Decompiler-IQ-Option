package com.iqoption.tradinghistory.materialcalendar;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import com.iqoption.tradinghistory.materialcalendar.a.e;
import com.iqoption.tradinghistory.materialcalendar.a.g;
import com.iqoption.tradinghistory.materialcalendar.a.h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: CalendarPagerAdapter */
abstract class d<V extends e> extends PagerAdapter {
    private final ArrayDeque<V> dZe;
    protected final MaterialCalendarView dZf;
    private final b dZg;
    private g dZh = null;
    private Integer dZi = null;
    private Integer dZj = null;
    private Integer dZk = null;
    private int dZl = 4;
    private b dZm = null;
    private b dZn = null;
    private g dZo;
    private List<b> dZp = new ArrayList();
    private h dZq = h.eaO;
    private e dZr = e.eaM;
    private List<i> dZs = new ArrayList();
    private List<k> dZt = null;
    private boolean dZu = true;

    public abstract int a(V v);

    public abstract g b(b bVar, b bVar2);

    public abstract boolean co(Object obj);

    public abstract V hh(int i);

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    d(MaterialCalendarView materialCalendarView) {
        this.dZf = materialCalendarView;
        this.dZg = b.aWk();
        this.dZe = new ArrayDeque();
        this.dZe.iterator();
        c(null, null);
    }

    public void aWl() {
        this.dZt = new ArrayList();
        for (i iVar : this.dZs) {
            j jVar = new j();
            iVar.b(jVar);
            if (jVar.aWw()) {
                this.dZt.add(new k(iVar, jVar));
            }
        }
        Iterator it = this.dZe.iterator();
        while (it.hasNext()) {
            ((e) it.next()).setDayViewDecorators(this.dZt);
        }
    }

    public int getCount() {
        return this.dZo.getCount();
    }

    public CharSequence getPageTitle(int i) {
        g gVar = this.dZh;
        return gVar == null ? "" : gVar.o(hi(i));
    }

    public d<?> a(d<?> dVar) {
        dVar.dZh = this.dZh;
        dVar.dZi = this.dZi;
        dVar.dZj = this.dZj;
        dVar.dZk = this.dZk;
        dVar.dZl = this.dZl;
        dVar.dZm = this.dZm;
        dVar.dZn = this.dZn;
        dVar.dZp = this.dZp;
        dVar.dZq = this.dZq;
        dVar.dZr = this.dZr;
        dVar.dZs = this.dZs;
        dVar.dZt = this.dZt;
        dVar.dZu = this.dZu;
        return dVar;
    }

    public int c(b bVar) {
        if (bVar == null) {
            return getCount() / 2;
        }
        b bVar2 = this.dZm;
        if (bVar2 != null && bVar.a(bVar2)) {
            return 0;
        }
        bVar2 = this.dZn;
        if (bVar2 == null || !bVar.b(bVar2)) {
            return this.dZo.e(bVar);
        }
        return getCount() - 1;
    }

    public int getItemPosition(Object obj) {
        if (!co(obj)) {
            return -2;
        }
        e eVar = (e) obj;
        if (eVar.getFirstViewDay() == null) {
            return -2;
        }
        int a = a(eVar);
        if (a < 0) {
            return -2;
        }
        return a;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        e hh = hh(i);
        hh.setContentDescription(this.dZf.getCalendarContentDescription());
        hh.setAlpha(0.0f);
        hh.setSelectionEnabled(this.dZu);
        hh.setWeekDayFormatter(this.dZq);
        hh.setDayFormatter(this.dZr);
        Integer num = this.dZi;
        if (num != null) {
            hh.setSelectionColor(num.intValue());
        }
        num = this.dZj;
        if (num != null) {
            hh.setDateTextAppearance(num.intValue());
        }
        num = this.dZk;
        if (num != null) {
            hh.setWeekDayTextAppearance(num.intValue());
        }
        hh.setShowOtherDates(this.dZl);
        hh.setMinimumDate(this.dZm);
        hh.setMaximumDate(this.dZn);
        hh.setSelectedDates(this.dZp);
        viewGroup.addView(hh);
        this.dZe.add(hh);
        hh.setDayViewDecorators(this.dZt);
        return hh;
    }

    public void setSelectionEnabled(boolean z) {
        this.dZu = z;
        Iterator it = this.dZe.iterator();
        while (it.hasNext()) {
            ((e) it.next()).setSelectionEnabled(this.dZu);
        }
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        e eVar = (e) obj;
        this.dZe.remove(eVar);
        viewGroup.removeView(eVar);
    }

    public void setTitleFormatter(@NonNull g gVar) {
        this.dZh = gVar;
    }

    public void setSelectionColor(int i) {
        this.dZi = Integer.valueOf(i);
        Iterator it = this.dZe.iterator();
        while (it.hasNext()) {
            ((e) it.next()).setSelectionColor(i);
        }
    }

    public void setDateTextAppearance(int i) {
        if (i != 0) {
            this.dZj = Integer.valueOf(i);
            Iterator it = this.dZe.iterator();
            while (it.hasNext()) {
                ((e) it.next()).setDateTextAppearance(i);
            }
        }
    }

    public void setShowOtherDates(int i) {
        this.dZl = i;
        Iterator it = this.dZe.iterator();
        while (it.hasNext()) {
            ((e) it.next()).setShowOtherDates(i);
        }
    }

    public void setWeekDayFormatter(h hVar) {
        this.dZq = hVar;
        Iterator it = this.dZe.iterator();
        while (it.hasNext()) {
            ((e) it.next()).setWeekDayFormatter(hVar);
        }
    }

    public void setDayFormatter(e eVar) {
        this.dZr = eVar;
        Iterator it = this.dZe.iterator();
        while (it.hasNext()) {
            ((e) it.next()).setDayFormatter(eVar);
        }
    }

    public int getShowOtherDates() {
        return this.dZl;
    }

    public void setWeekDayTextAppearance(int i) {
        if (i != 0) {
            this.dZk = Integer.valueOf(i);
            Iterator it = this.dZe.iterator();
            while (it.hasNext()) {
                ((e) it.next()).setWeekDayTextAppearance(i);
            }
        }
    }

    public void c(b bVar, b bVar2) {
        this.dZm = bVar;
        this.dZn = bVar2;
        Iterator it = this.dZe.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            eVar.setMinimumDate(bVar);
            eVar.setMaximumDate(bVar2);
        }
        if (bVar == null) {
            bVar = b.t(this.dZg.getYear() - 200, this.dZg.getMonth(), this.dZg.getDay());
        }
        if (bVar2 == null) {
            bVar2 = b.t(this.dZg.getYear() + 200, this.dZg.getMonth(), this.dZg.getDay());
        }
        this.dZo = b(bVar, bVar2);
        notifyDataSetChanged();
        aWo();
    }

    public g aWm() {
        return this.dZo;
    }

    public void aWn() {
        this.dZp.clear();
        aWo();
    }

    public void a(b bVar, boolean z) {
        if (z) {
            if (!this.dZp.contains(bVar)) {
                this.dZp.add(bVar);
                aWo();
            }
        } else if (this.dZp.contains(bVar)) {
            this.dZp.remove(bVar);
            aWo();
        }
    }

    private void aWo() {
        aWp();
        Iterator it = this.dZe.iterator();
        while (it.hasNext()) {
            ((e) it.next()).setSelectedDates(this.dZp);
        }
    }

    private void aWp() {
        int i = 0;
        while (i < this.dZp.size()) {
            b bVar = (b) this.dZp.get(i);
            b bVar2 = this.dZm;
            if (bVar2 == null || !bVar2.b(bVar)) {
                bVar2 = this.dZn;
                if (bVar2 != null) {
                    if (!bVar2.a(bVar)) {
                    }
                }
                i++;
            }
            this.dZp.remove(i);
            this.dZf.i(bVar);
            i--;
            i++;
        }
    }

    public b hi(int i) {
        return this.dZo.hi(i);
    }

    @NonNull
    public List<b> getSelectedDates() {
        return Collections.unmodifiableList(this.dZp);
    }

    /* Access modifiers changed, original: protected */
    public int getDateTextAppearance() {
        Integer num = this.dZj;
        return num == null ? 0 : num.intValue();
    }

    /* Access modifiers changed, original: protected */
    public int getWeekDayTextAppearance() {
        Integer num = this.dZk;
        return num == null ? 0 : num.intValue();
    }
}
