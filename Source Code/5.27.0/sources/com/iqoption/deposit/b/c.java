package com.iqoption.deposit.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.core.ui.widget.PlaceholderedField;

/* compiled from: ConstructorTextEditFieldLightBinding */
public abstract class c extends ViewDataBinding {
    @NonNull
    public final ImageView cAG;
    @NonNull
    public final PlaceholderedField cAI;
    @NonNull
    public final TextView cAJ;

    protected c(Object obj, View view, int i, PlaceholderedField placeholderedField, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.cAI = placeholderedField;
        this.cAG = imageView;
        this.cAJ = textView;
    }
}
