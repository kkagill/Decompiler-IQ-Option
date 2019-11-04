package com.iqoption.tradinghistory.materialcalendar;

import androidx.annotation.NonNull;
import androidx.collection.SparseArrayCompat;

/* compiled from: MonthPagerAdapter */
class m extends d<n> {

    /* compiled from: MonthPagerAdapter */
    public static class a implements g {
        private final int count;
        private SparseArrayCompat<b> eaA = new SparseArrayCompat();
        private final b eaz;

        public a(@NonNull b bVar, @NonNull b bVar2) {
            this.eaz = b.t(bVar.getYear(), bVar.getMonth(), 1);
            this.count = e(b.t(bVar2.getYear(), bVar2.getMonth(), 1)) + 1;
        }

        public int getCount() {
            return this.count;
        }

        public int e(b bVar) {
            return ((bVar.getYear() - this.eaz.getYear()) * 12) + (bVar.getMonth() - this.eaz.getMonth());
        }

        public b hi(int i) {
            b bVar = (b) this.eaA.get(i);
            if (bVar != null) {
                return bVar;
            }
            int year = this.eaz.getYear() + (i / 12);
            int month = this.eaz.getMonth() + (i % 12);
            if (month >= 12) {
                year++;
                month -= 12;
            }
            bVar = b.t(year, month, 1);
            this.eaA.put(i, bVar);
            return bVar;
        }
    }

    m(MaterialCalendarView materialCalendarView) {
        super(materialCalendarView);
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: hp */
    public n hh(int i) {
        return new n(this.dZf, hi(i), this.dZf.getFirstDayOfWeek());
    }

    /* Access modifiers changed, original: protected */
    public int a(n nVar) {
        return aWm().e(nVar.aWF());
    }

    /* Access modifiers changed, original: protected */
    public boolean co(Object obj) {
        return obj instanceof n;
    }

    /* Access modifiers changed, original: protected */
    public g b(b bVar, b bVar2) {
        return new a(bVar, bVar2);
    }
}
