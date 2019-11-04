package com.iqoption.chat.a;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: FragmentRoomListBinding */
public abstract class co extends ViewDataBinding {
    @NonNull
    public final RecyclerView aRZ;

    protected co(Object obj, View view, int i, RecyclerView recyclerView) {
        super(obj, view, i);
        this.aRZ = recyclerView;
    }
}
