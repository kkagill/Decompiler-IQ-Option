package com.iqoption.e;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.iqoption.fragment.dialog.popup.whatsnew.a;
import com.iqoption.view.text.FormattedTextView;

/* compiled from: WhatsNewDialogTemplatesBinding */
public abstract class abf extends ViewDataBinding {
    @NonNull
    public final ImageView cle;
    @NonNull
    public final FormattedTextView clf;
    @Bindable
    protected a clg;

    public abstract void a(@Nullable a aVar);

    protected abf(Object obj, View view, int i, ImageView imageView, FormattedTextView formattedTextView) {
        super(obj, view, i);
        this.cle = imageView;
        this.clf = formattedTextView;
    }
}
