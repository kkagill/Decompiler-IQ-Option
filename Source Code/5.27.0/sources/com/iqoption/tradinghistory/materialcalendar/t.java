package com.iqoption.tradinghistory.materialcalendar;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.iqoption.tradinghistory.materialcalendar.a.e;
import com.iqoption.tradinghistory.materialcalendar.a.g;
import com.iqoption.tradinghistory.materialcalendar.a.h;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: WeekPagerAdapter */
public class t extends d<u> {

    /* compiled from: WeekPagerAdapter */
    public static class a implements g {
        private final int count;
        private final b eaz;

        public a(@NonNull b bVar, @NonNull b bVar2, int i) {
            this.eaz = a(bVar, i);
            this.count = f(this.eaz, bVar2) + 1;
        }

        public int getCount() {
            return this.count;
        }

        public int e(b bVar) {
            return f(this.eaz, bVar);
        }

        public b hi(int i) {
            return b.b(new Date(this.eaz.getDate().getTime() + TimeUnit.MILLISECONDS.convert((long) (i * 7), TimeUnit.DAYS)));
        }

        private int f(@NonNull b bVar, @NonNull b bVar2) {
            return (int) (TimeUnit.DAYS.convert(((bVar2.getDate().getTime() - bVar.getDate().getTime()) + ((long) bVar2.getCalendar().get(16))) - ((long) bVar.getCalendar().get(16)), TimeUnit.MILLISECONDS) / 7);
        }

        private b a(@NonNull b bVar, int i) {
            Calendar instance = Calendar.getInstance();
            bVar.c(instance);
            while (instance.get(7) != i) {
                instance.add(7, -1);
            }
            return b.b(instance);
        }
    }

    public /* bridge */ /* synthetic */ void a(b bVar, boolean z) {
        super.a(bVar, z);
    }

    public /* bridge */ /* synthetic */ void aWl() {
        super.aWl();
    }

    public /* bridge */ /* synthetic */ g aWm() {
        return super.aWm();
    }

    public /* bridge */ /* synthetic */ void aWn() {
        super.aWn();
    }

    public /* bridge */ /* synthetic */ int c(b bVar) {
        return super.c(bVar);
    }

    public /* bridge */ /* synthetic */ void c(b bVar, b bVar2) {
        super.c(bVar, bVar2);
    }

    public /* bridge */ /* synthetic */ void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        super.destroyItem(viewGroup, i, obj);
    }

    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public /* bridge */ /* synthetic */ int getItemPosition(Object obj) {
        return super.getItemPosition(obj);
    }

    public /* bridge */ /* synthetic */ CharSequence getPageTitle(int i) {
        return super.getPageTitle(i);
    }

    @NonNull
    public /* bridge */ /* synthetic */ List getSelectedDates() {
        return super.getSelectedDates();
    }

    public /* bridge */ /* synthetic */ int getShowOtherDates() {
        return super.getShowOtherDates();
    }

    public /* bridge */ /* synthetic */ b hi(int i) {
        return super.hi(i);
    }

    public /* bridge */ /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i) {
        return super.instantiateItem(viewGroup, i);
    }

    public /* bridge */ /* synthetic */ boolean isViewFromObject(View view, Object obj) {
        return super.isViewFromObject(view, obj);
    }

    public /* bridge */ /* synthetic */ void setDateTextAppearance(int i) {
        super.setDateTextAppearance(i);
    }

    public /* bridge */ /* synthetic */ void setDayFormatter(e eVar) {
        super.setDayFormatter(eVar);
    }

    public /* bridge */ /* synthetic */ void setSelectionColor(int i) {
        super.setSelectionColor(i);
    }

    public /* bridge */ /* synthetic */ void setSelectionEnabled(boolean z) {
        super.setSelectionEnabled(z);
    }

    public /* bridge */ /* synthetic */ void setShowOtherDates(int i) {
        super.setShowOtherDates(i);
    }

    public /* bridge */ /* synthetic */ void setTitleFormatter(@NonNull g gVar) {
        super.setTitleFormatter(gVar);
    }

    public /* bridge */ /* synthetic */ void setWeekDayFormatter(h hVar) {
        super.setWeekDayFormatter(hVar);
    }

    public /* bridge */ /* synthetic */ void setWeekDayTextAppearance(int i) {
        super.setWeekDayTextAppearance(i);
    }

    public t(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: hr */
    public u hh(int i) {
        return new u(this.dZf, hi(i), this.dZf.getFirstDayOfWeek());
    }

    /* Access modifiers changed, original: protected */
    public int a(u uVar) {
        return aWm().e(uVar.getFirstViewDay());
    }

    /* Access modifiers changed, original: protected */
    public boolean co(Object obj) {
        return obj instanceof u;
    }

    /* Access modifiers changed, original: protected */
    public g b(b bVar, b bVar2) {
        return new a(bVar, bVar2, this.dZf.getFirstDayOfWeek());
    }
}
