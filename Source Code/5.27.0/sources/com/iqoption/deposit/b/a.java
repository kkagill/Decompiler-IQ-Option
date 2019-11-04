package com.iqoption.deposit.b;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;

/* compiled from: ConstructorSpinnerFieldLightBinding */
public abstract class a extends ViewDataBinding {
    @NonNull
    public final ImageView cAG;
    @NonNull
    public final EditText cAH;

    protected a(Object obj, View view, int i, ImageView imageView, EditText editText) {
        super(obj, view, i);
        this.cAG = imageView;
        this.cAH = editText;
    }
}
