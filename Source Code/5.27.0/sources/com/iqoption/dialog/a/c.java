package com.iqoption.dialog.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.google.common.collect.ImmutableList;
import com.iqoption.dialog.a.a.d;
import com.iqoption.dto.Point;

/* compiled from: ComponentFactory */
interface c {

    /* compiled from: ComponentFactory */
    public final /* synthetic */ class -CC {
        @Nullable
        public static View $default$a(c cVar, LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener) {
            return null;
        }

        public static void $default$a(@NonNull c cVar, ImmutableList immutableList, float f, float f2) {
        }

        public static void $default$a(@NonNull c cVar, d dVar) {
        }

        @Nullable
        public static d $default$d(c cVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return null;
        }
    }

    @Nullable
    View a(LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener);

    void a(@NonNull ImmutableList<Point> immutableList, float f, float f2);

    void a(@NonNull d dVar);

    @NonNull
    Adapter atC();

    @NonNull
    View b(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @NonNull
    View c(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Nullable
    d d(LayoutInflater layoutInflater, ViewGroup viewGroup);
}
