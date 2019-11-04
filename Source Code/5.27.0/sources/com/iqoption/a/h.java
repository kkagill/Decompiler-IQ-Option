package com.iqoption.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.dto.ChartTimeInterval;
import com.iqoption.x.R;
import java.util.List;

/* compiled from: ShortTimerIntervalAdapter */
public class h extends Adapter<ViewHolder> {
    private final boolean amU;
    private int amV = 0;
    private int amW = 18;
    private com.iqoption.a.b.a amX;
    List<ChartTimeInterval> amY;
    private int textColor;

    /* compiled from: ShortTimerIntervalAdapter */
    public static class a extends ViewHolder implements OnClickListener {
        TextView amZ;
        View itemView;
        com.iqoption.a.b.a listener;

        a(View view, com.iqoption.a.b.a aVar) {
            super(view);
            this.itemView = view;
            this.itemView.setOnClickListener(this);
            this.amZ = (TextView) view.findViewById(R.id.name);
            this.listener = aVar;
        }

        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            com.iqoption.a.b.a aVar = this.listener;
            if (aVar != null) {
                aVar.onItemClick(view, adapterPosition);
            }
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public boolean onFailedToRecycleView(ViewHolder viewHolder) {
        return true;
    }

    public h(Context context, int i, boolean z, com.iqoption.a.b.a aVar) {
        this.textColor = i;
        this.amY = ChartTimeInterval.getChartTimeIntervalTemplates(context);
        this.amX = aVar;
        this.amU = z;
    }

    public void du(int i) {
        this.amV = i;
    }

    public void dv(int i) {
        this.amW = i;
    }

    public int getItemCount() {
        return this.amY.size();
    }

    public List<ChartTimeInterval> getItems() {
        return this.amY;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.horizontal_string_item, viewGroup, false), this.amX);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        a aVar = (a) viewHolder;
        ChartTimeInterval chartTimeInterval = (ChartTimeInterval) this.amY.get(i);
        aVar.amZ.setText(TimeUtil.formatElapsedTime((long) chartTimeInterval.value));
        aVar.amZ.setEnabled(chartTimeInterval.isActual);
        aVar.amZ.setTextColor(this.textColor);
        if (this.amU) {
            aVar.amZ.setTypeface(com.iqoption.core.ext.a.j(aVar.amZ, R.font.bold));
        } else {
            aVar.amZ.setTypeface(com.iqoption.core.ext.a.j(aVar.amZ, R.font.light));
        }
        if (i < this.amV || i > this.amW) {
            aVar.amZ.setAlpha(0.5f);
            aVar.itemView.setEnabled(false);
        } else {
            aVar.amZ.setAlpha(1.0f);
            aVar.itemView.setEnabled(true);
        }
        aVar.itemView.setTag(Integer.valueOf(i));
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
