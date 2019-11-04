package com.iqoption.charttools.e;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.core.d;

/* compiled from: InstrumentItemsDecoration */
final class f extends ItemDecoration {
    private static final int[] aFI = new int[]{65538, 131074, 131073};
    private static final int[] aFJ = new int[]{0, 1, 16};
    private static int[] aFK;
    private final a aKn;

    /* compiled from: InstrumentItemsDecoration */
    public interface a {
        int getItemViewType(int i);
    }

    private static int getType(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 3)) {
                return -1;
            }
        }
        return i2;
    }

    private static int ad(int i, int i2) {
        i = (getType(i) << 16) | getType(i2);
        int i3 = 0;
        while (true) {
            int[] iArr = aFI;
            if (i3 >= iArr.length) {
                i3 = -1;
                break;
            } else if (iArr[i3] == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 != -1) {
            return aFK[i3];
        }
        return 0;
    }

    public f(@NonNull a aVar) {
        this.aKn = aVar;
        if (aFK == null) {
            aFK = new int[aFJ.length];
            int i = 0;
            while (true) {
                int[] iArr = aFK;
                if (i < iArr.length) {
                    iArr[i] = com.iqoption.core.ext.a.b(d.Uo(), (float) aFJ[i]);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
        ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        if (childViewHolder != null) {
            int adapterPosition = childViewHolder.getAdapterPosition();
            if (adapterPosition != 0) {
                int itemViewType = childViewHolder.getItemViewType();
                view = recyclerView.getChildAt(recyclerView.indexOfChild(view) - 1);
                if (view != null) {
                    ViewHolder findContainingViewHolder = recyclerView.findContainingViewHolder(view);
                    if (findContainingViewHolder != null) {
                        rect.top = ad(findContainingViewHolder.getItemViewType(), itemViewType);
                    }
                } else {
                    if (adapterPosition == -1) {
                        adapterPosition = childViewHolder.getOldPosition();
                    }
                    if (adapterPosition > 0) {
                        rect.top = ad(this.aKn.getItemViewType(adapterPosition - 1), itemViewType);
                    }
                }
            }
        }
    }
}
