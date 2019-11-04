package com.iqoption.tradinghistory.a;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.tradinghistory.materialcalendar.MaterialCalendarView;

/* compiled from: FragmentTradingHistorySetDateBinding */
public abstract class m extends ViewDataBinding {
    @NonNull
    public final RadioButton dWk;
    @NonNull
    public final MaterialCalendarView dWl;
    @NonNull
    public final RadioButton dWm;
    @NonNull
    public final RadioButton dWn;
    @NonNull
    public final RadioGroup dWo;
    @NonNull
    public final RadioButton dWp;
    @NonNull
    public final RadioButton dWq;
    @NonNull
    public final y dWr;
    @NonNull
    public final RadioButton dWs;

    protected m(Object obj, View view, int i, RadioButton radioButton, MaterialCalendarView materialCalendarView, RadioButton radioButton2, RadioButton radioButton3, RadioGroup radioGroup, RadioButton radioButton4, RadioButton radioButton5, y yVar, RadioButton radioButton6) {
        super(obj, view, i);
        this.dWk = radioButton;
        this.dWl = materialCalendarView;
        this.dWm = radioButton2;
        this.dWn = radioButton3;
        this.dWo = radioGroup;
        this.dWp = radioButton4;
        this.dWq = radioButton5;
        this.dWr = yVar;
        setContainedBinding(this.dWr);
        this.dWs = radioButton6;
    }
}
