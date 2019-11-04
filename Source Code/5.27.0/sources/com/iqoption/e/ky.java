package com.iqoption.e;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: FragmentKycReportableErrorOldBinding */
public abstract class ky extends ViewDataBinding {
    @NonNull
    public final pj cfS;
    @NonNull
    public final FormattedTextView cgX;
    @NonNull
    public final TextView cgY;

    protected ky(Object obj, View view, int i, FormattedTextView formattedTextView, TextView textView, pj pjVar) {
        super(obj, view, i);
        this.cgX = formattedTextView;
        this.cgY = textView;
        this.cfS = pjVar;
        setContainedBinding(this.cfS);
    }
}
