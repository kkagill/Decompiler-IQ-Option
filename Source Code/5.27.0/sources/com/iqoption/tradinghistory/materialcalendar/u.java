package com.iqoption.tradinghistory.materialcalendar;

import android.annotation.SuppressLint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import com.iqoption.tradinghistory.materialcalendar.a.e;
import com.iqoption.tradinghistory.materialcalendar.a.h;
import java.util.Calendar;
import java.util.Collection;

@SuppressLint({"ViewConstructor"})
/* compiled from: WeekView */
public class u extends e {
    /* Access modifiers changed, original: protected */
    public boolean d(b bVar) {
        return true;
    }

    /* Access modifiers changed, original: protected */
    public int getRows() {
        return 2;
    }

    public /* bridge */ /* synthetic */ a e(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    public /* bridge */ /* synthetic */ void onClick(View view) {
        super.onClick(view);
    }

    public /* bridge */ /* synthetic */ void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public /* bridge */ /* synthetic */ void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    public /* bridge */ /* synthetic */ void setDateTextAppearance(int i) {
        super.setDateTextAppearance(i);
    }

    public /* bridge */ /* synthetic */ void setDayFormatter(e eVar) {
        super.setDayFormatter(eVar);
    }

    public /* bridge */ /* synthetic */ void setMaximumDate(b bVar) {
        super.setMaximumDate(bVar);
    }

    public /* bridge */ /* synthetic */ void setMinimumDate(b bVar) {
        super.setMinimumDate(bVar);
    }

    public /* bridge */ /* synthetic */ void setSelectedDates(Collection collection) {
        super.setSelectedDates(collection);
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

    public /* bridge */ /* synthetic */ void setWeekDayFormatter(h hVar) {
        super.setWeekDayFormatter(hVar);
    }

    public /* bridge */ /* synthetic */ void setWeekDayTextAppearance(int i) {
        super.setWeekDayTextAppearance(i);
    }

    public /* bridge */ /* synthetic */ boolean shouldDelayChildPressedState() {
        return super.shouldDelayChildPressedState();
    }

    public u(@NonNull MaterialCalendarView materialCalendarView, b bVar, int i) {
        super(materialCalendarView, bVar, i);
    }

    /* Access modifiers changed, original: protected */
    public void b(Collection<h> collection, Calendar calendar) {
        for (int i = 0; i < 7; i++) {
            a(collection, calendar);
        }
    }
}
