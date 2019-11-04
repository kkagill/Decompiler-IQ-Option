package com.iqoption.chat.a;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import com.iqoption.chat.fragment.MessageView;

/* compiled from: ChatTextMessageBodyItemBinding */
public abstract class bs extends ViewDataBinding {
    @NonNull
    public final MessageView aRK;

    protected bs(Object obj, View view, int i, MessageView messageView) {
        super(obj, view, i);
        this.aRK = messageView;
    }
}
