package com.iqoption.chat.a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.iqoption.chat.fragment.BadgeView;

/* compiled from: FragmentRoomBinding */
public abstract class cm extends ViewDataBinding {
    @NonNull
    public final ImageView aHK;
    @NonNull
    public final LinearLayout aRs;
    @NonNull
    public final FrameLayout aSa;
    @NonNull
    public final FrameLayout aSb;
    @NonNull
    public final BadgeView aSc;
    @NonNull
    public final RecyclerView aSd;
    @NonNull
    public final FrameLayout aSe;
    @NonNull
    public final ConstraintLayout aSf;
    @NonNull
    public final FrameLayout aSg;

    protected cm(Object obj, View view, int i, FrameLayout frameLayout, ImageView imageView, FrameLayout frameLayout2, BadgeView badgeView, RecyclerView recyclerView, FrameLayout frameLayout3, ConstraintLayout constraintLayout, LinearLayout linearLayout, FrameLayout frameLayout4) {
        super(obj, view, i);
        this.aSa = frameLayout;
        this.aHK = imageView;
        this.aSb = frameLayout2;
        this.aSc = badgeView;
        this.aSd = recyclerView;
        this.aSe = frameLayout3;
        this.aSf = constraintLayout;
        this.aRs = linearLayout;
        this.aSg = frameLayout4;
    }
}
