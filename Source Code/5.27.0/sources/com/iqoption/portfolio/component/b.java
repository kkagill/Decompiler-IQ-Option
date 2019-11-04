package com.iqoption.portfolio.component;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.common.collect.ImmutableList;
import com.iqoption.e.rb;
import com.iqoption.e.rd;
import com.iqoption.portfolio.component.viewholder.f;
import com.iqoption.portfolio.component.viewholder.g;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ClosedGroupAdapter */
public class b extends Adapter<ViewHolder> {
    private final List<com.iqoption.portfolio.b> aKc = new ArrayList();
    private final l dLR;

    public b(l lVar) {
        this.dLR = lVar;
        setHasStableIds(true);
    }

    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new f(rb.x(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
        return new g(rd.y(LayoutInflater.from(viewGroup.getContext()), viewGroup, false), this.dLR);
    }

    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        if (viewHolder.getItemViewType() == 1) {
            ((g) viewHolder).b((com.iqoption.portfolio.b) this.aKc.get(i), i != 0 ? (com.iqoption.portfolio.b) this.aKc.get(i - 1) : null);
        }
    }

    public int getItemCount() {
        int size = this.aKc.size();
        return size != 0 ? size : 1;
    }

    public long getItemId(int i) {
        if (this.aKc.size() == 0) {
            return 0;
        }
        return ((com.iqoption.portfolio.b) this.aKc.get(i)).getId();
    }

    public int getItemViewType(int i) {
        return (i == 0 && this.aKc.isEmpty()) ? 0 : 1;
    }

    public void t(ImmutableList<com.iqoption.portfolio.b> immutableList) {
        this.aKc.clear();
        if (!com.iqoption.util.g.isEmpty(immutableList)) {
            this.aKc.addAll(immutableList);
        }
        notifyDataSetChanged();
    }
}
