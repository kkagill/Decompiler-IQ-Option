package com.iqoption.e;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ToolsContentIndicatorsSearchBinding */
public abstract class zx extends ViewDataBinding {
    @NonNull
    public final ImageView bZN;
    @NonNull
    public final EditText cfF;
    @NonNull
    public final LinearLayout cus;
    @NonNull
    public final ImageView cuu;
    @NonNull
    public final ConstraintLayout cuv;
    @NonNull
    public final RecyclerView cuw;

    protected zx(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, LinearLayout linearLayout, EditText editText, ImageView imageView2, RecyclerView recyclerView) {
        super(obj, view, i);
        this.bZN = imageView;
        this.cuv = constraintLayout;
        this.cus = linearLayout;
        this.cfF = editText;
        this.cuu = imageView2;
        this.cuw = recyclerView;
    }
}
