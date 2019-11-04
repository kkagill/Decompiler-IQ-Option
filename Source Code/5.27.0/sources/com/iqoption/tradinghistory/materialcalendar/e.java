package com.iqoption.tradinghistory.materialcalendar;

import android.annotation.SuppressLint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import com.iqoption.tradinghistory.materialcalendar.a.h;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: CalendarPagerView */
abstract class e extends ViewGroup implements OnClickListener {
    private static final Calendar dZv = f.getInstance();
    private MaterialCalendarView dZf;
    protected int dZl = 4;
    private b dZm = null;
    private b dZn = null;
    private final ArrayList<s> dZw = new ArrayList();
    private final ArrayList<k> dZx = new ArrayList();
    private b dZy;
    private final Collection<h> dZz = new ArrayList();
    private int firstDayOfWeek;

    /* compiled from: CalendarPagerView */
    protected static class a extends MarginLayoutParams {
        public a() {
            super(-2, -2);
        }
    }

    public abstract void b(Collection<h> collection, Calendar calendar);

    public abstract boolean d(b bVar);

    public abstract int getRows();

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public e(@NonNull MaterialCalendarView materialCalendarView, b bVar, int i) {
        super(materialCalendarView.getContext());
        this.dZf = materialCalendarView;
        this.dZy = bVar;
        this.firstDayOfWeek = i;
        setClipChildren(false);
        setClipToPadding(false);
        d(aWq());
        b(this.dZz, aWq());
    }

    private void d(Calendar calendar) {
        for (int i = 0; i < 7; i++) {
            s sVar = new s(getContext(), f.h(calendar));
            this.dZw.add(sVar);
            addView(sVar);
            calendar.add(5, 1);
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(Collection<h> collection, Calendar calendar) {
        h hVar = new h(getContext(), b.b(calendar));
        hVar.setOnClickListener(this);
        collection.add(hVar);
        addView(hVar, new a());
        calendar.add(5, 1);
    }

    /* Access modifiers changed, original: protected */
    @SuppressLint({"WrongConstant"})
    public Calendar aWq() {
        getFirstViewDay().c(dZv);
        dZv.setFirstDayOfWeek(getFirstDayOfWeek());
        int firstDayOfWeek = getFirstDayOfWeek() - f.h(dZv);
        Object obj = 1;
        if (MaterialCalendarView.hk(this.dZl) ? firstDayOfWeek < 0 : firstDayOfWeek <= 0) {
            obj = null;
        }
        if (obj != null) {
            firstDayOfWeek -= 7;
        }
        dZv.add(5, firstDayOfWeek);
        return dZv;
    }

    /* Access modifiers changed, original: protected */
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    /* Access modifiers changed, original: 0000 */
    public void setDayViewDecorators(List<k> list) {
        this.dZx.clear();
        if (list != null) {
            this.dZx.addAll(list);
        }
        aWl();
    }

    public void setWeekDayTextAppearance(int i) {
        Iterator it = this.dZw.iterator();
        while (it.hasNext()) {
            ((s) it.next()).setTextAppearance(getContext(), i);
        }
    }

    public void setDateTextAppearance(int i) {
        for (h textAppearance : this.dZz) {
            textAppearance.setTextAppearance(getContext(), i);
        }
    }

    public void setShowOtherDates(int i) {
        this.dZl = i;
        aWr();
    }

    public void setSelectionEnabled(boolean z) {
        for (h hVar : this.dZz) {
            hVar.setOnClickListener(z ? this : null);
            hVar.setClickable(z);
        }
    }

    public void setSelectionColor(int i) {
        for (h selectionColor : this.dZz) {
            selectionColor.setSelectionColor(i);
        }
    }

    public void setWeekDayFormatter(h hVar) {
        Iterator it = this.dZw.iterator();
        while (it.hasNext()) {
            ((s) it.next()).setWeekDayFormatter(hVar);
        }
    }

    public void setDayFormatter(com.iqoption.tradinghistory.materialcalendar.a.e eVar) {
        for (h dayFormatter : this.dZz) {
            dayFormatter.setDayFormatter(eVar);
        }
    }

    public void setMinimumDate(b bVar) {
        this.dZm = bVar;
        aWr();
    }

    public void setMaximumDate(b bVar) {
        this.dZn = bVar;
        aWr();
    }

    public void setSelectedDates(Collection<b> collection) {
        for (h hVar : this.dZz) {
            boolean z = collection != null && collection.contains(hVar.aWt());
            hVar.setChecked(z);
        }
        postInvalidate();
    }

    /* Access modifiers changed, original: protected */
    public void aWr() {
        for (h hVar : this.dZz) {
            b aWt = hVar.aWt();
            hVar.b(this.dZl, aWt.a(this.dZm, this.dZn), d(aWt));
        }
        postInvalidate();
    }

    /* Access modifiers changed, original: protected */
    public void aWl() {
        j jVar = new j();
        for (h hVar : this.dZz) {
            jVar.reset();
            Iterator it = this.dZx.iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                if (kVar.dZQ.g(hVar.aWt())) {
                    kVar.dZR.c(jVar);
                }
            }
            hVar.a(jVar);
        }
    }

    public void onClick(View view) {
        if (view instanceof h) {
            this.dZf.a((h) view);
        }
    }

    /* Access modifiers changed, original: protected */
    /* renamed from: aWs */
    public a generateDefaultLayoutParams() {
        return new a();
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        i = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        if (MeasureSpec.getMode(i2) == 0 || i == 0) {
            throw new IllegalStateException("CalendarPagerView should never be left to decide it's size");
        }
        i = size / 7;
        i2 = size2 / getRows();
        setMeasuredDimension(size, size2);
        size = getChildCount();
        for (size2 = 0; size2 < size; size2++) {
            getChildAt(size2).measure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
        }
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        i3 = 0;
        i4 = 0;
        for (i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int measuredWidth = childAt.getMeasuredWidth() + i3;
            int measuredHeight = childAt.getMeasuredHeight() + i4;
            childAt.layout(i3, i4, measuredWidth, measuredHeight);
            if (i2 % 7 == 6) {
                i4 = measuredHeight;
                i3 = 0;
            } else {
                i3 = measuredWidth;
            }
        }
    }

    /* renamed from: e */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a();
    }

    /* Access modifiers changed, original: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* Access modifiers changed, original: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new a();
    }

    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(e.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(e.class.getName());
    }

    /* Access modifiers changed, original: protected */
    public b getFirstViewDay() {
        return this.dZy;
    }
}
