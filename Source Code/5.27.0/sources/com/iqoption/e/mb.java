package com.iqoption.e;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.databinding.ViewDataBinding;
import androidx.legacy.widget.Space;

/* compiled from: FragmentOtnLeadingBoardProfileBinding */
public abstract class mb extends ViewDataBinding {
    @NonNull
    public final Space chA;
    @NonNull
    public final mj chB;
    @NonNull
    public final ml chC;
    @NonNull
    public final md cht;
    @NonNull
    public final mf chu;
    @NonNull
    public final mh chv;
    @NonNull
    public final FrameLayout chw;
    @NonNull
    public final Space chx;
    @NonNull
    public final Space chy;
    @NonNull
    public final Space chz;

    protected mb(Object obj, View view, int i, md mdVar, mf mfVar, mh mhVar, FrameLayout frameLayout, Space space, Space space2, Space space3, Space space4, mj mjVar, ml mlVar) {
        super(obj, view, i);
        this.cht = mdVar;
        setContainedBinding(this.cht);
        this.chu = mfVar;
        setContainedBinding(this.chu);
        this.chv = mhVar;
        setContainedBinding(this.chv);
        this.chw = frameLayout;
        this.chx = space;
        this.chy = space2;
        this.chz = space3;
        this.chA = space4;
        this.chB = mjVar;
        setContainedBinding(this.chB);
        this.chC = mlVar;
        setContainedBinding(this.chC);
    }
}
