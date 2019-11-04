package com.iqoption.a.d;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.util.ak;
import com.iqoption.view.ColorPickerView;
import com.iqoption.x.R;

/* compiled from: ColorPickerAdapter */
public class a extends Adapter<ViewHolder> {
    private final com.iqoption.a.b.a akC;
    private int anW = 0;

    /* compiled from: ColorPickerAdapter */
    public static class a extends ViewHolder implements OnClickListener {
        private View anX;
        private com.iqoption.a.b.a listener;

        a(View view, View view2, com.iqoption.a.b.a aVar) {
            super(view);
            this.anX = view2;
            this.itemView.setOnClickListener(this);
            this.listener = aVar;
        }

        public void onClick(View view) {
            com.iqoption.a.b.a aVar = this.listener;
            if (aVar != null) {
                aVar.onItemClick(view, getAdapterPosition());
            }
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public a(com.iqoption.a.b.a aVar) {
        this.akC = aVar;
    }

    public void dB(int i) {
        int i2 = this.anW;
        this.anW = i;
        if (i2 != -1) {
            notifyItemChanged(i2);
        }
        if (i != -1) {
            notifyItemChanged(i);
        }
    }

    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        i = viewGroup.getResources().getDimensionPixelOffset(R.dimen.dp15);
        int dimensionPixelOffset = viewGroup.getResources().getDimensionPixelOffset(R.dimen.dp10);
        int i2 = i + dimensionPixelOffset;
        LayoutParams layoutParams = new LayoutParams(i2, i2);
        dimensionPixelOffset /= 2;
        layoutParams.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        ak.setBackground(frameLayout, ContextCompat.getDrawable(viewGroup.getContext(), R.drawable.selecter_color_picker_item));
        View view = new View(viewGroup.getContext());
        LayoutParams layoutParams2 = new LayoutParams(i, i);
        layoutParams2.gravity = 17;
        view.setLayoutParams(layoutParams2);
        frameLayout.addView(view);
        return new a(frameLayout, view, this.akC);
    }

    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        a aVar = (a) viewHolder;
        GradientDrawable gradientDrawable = (GradientDrawable) ContextCompat.getDrawable(viewHolder.itemView.getContext(), R.drawable.color_picker_item);
        gradientDrawable.setColor(ColorPickerView.hR[i]);
        ak.setBackground(aVar.anX, gradientDrawable);
        if (i == this.anW) {
            viewHolder.itemView.setSelected(true);
            aVar.anX.setScaleX(0.7f);
            aVar.anX.setScaleY(0.7f);
            return;
        }
        viewHolder.itemView.setSelected(false);
        aVar.anX.setScaleX(1.0f);
        aVar.anX.setScaleY(1.0f);
    }

    public int getItemCount() {
        return ColorPickerView.hR.length;
    }
}
