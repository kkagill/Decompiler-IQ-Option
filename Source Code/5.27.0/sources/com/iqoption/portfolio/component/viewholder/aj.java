package com.iqoption.portfolio.component.viewholder;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.portfolio.component.l;
import com.iqoption.portfolio.component.m;

/* compiled from: OpenPositionViewHolder */
public abstract class aj extends ViewHolder {
    protected l dNo;

    public abstract void aRi();

    public aj(View view, l lVar) {
        super(view);
        this.dNo = lVar;
    }

    /* Access modifiers changed, original: protected|final */
    public final m aRX() {
        return this.dNo.aRX();
    }
}
