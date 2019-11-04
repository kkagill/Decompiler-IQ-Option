package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.NumberAnimateTextView;
import com.iqoption.view.RobotoTextView;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: CryptoConfirmDialogViewBinding */
public abstract class eo extends ViewDataBinding {
    @NonNull
    public final NumberAnimateTextView bZM;
    @NonNull
    public final ImageView bZN;
    @NonNull
    public final FormattedTextView bZO;
    @NonNull
    public final RobotoTextView bZP;
    @NonNull
    public final NumberAnimateTextView bZQ;

    protected eo(Object obj, View view, int i, NumberAnimateTextView numberAnimateTextView, ImageView imageView, FormattedTextView formattedTextView, RobotoTextView robotoTextView, NumberAnimateTextView numberAnimateTextView2) {
        super(obj, view, i);
        this.bZM = numberAnimateTextView;
        this.bZN = imageView;
        this.bZO = formattedTextView;
        this.bZP = robotoTextView;
        this.bZQ = numberAnimateTextView2;
    }
}
