package com.iqoption.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.d;
import com.iqoption.dto.Event;
import com.iqoption.e.wt;
import com.iqoption.e.wv;
import com.iqoption.mobbtech.connect.request.api.e;
import com.iqoption.x.R;
import java.util.ArrayList;

/* compiled from: PushSettingsAdapter */
public class g extends Adapter<ViewHolder> {
    private ArrayList<c> amP = new ArrayList();

    /* compiled from: PushSettingsAdapter */
    public static class c {
        public boolean amT = false;
        public String description;
        public boolean enabled;
        public Long id;
        public String title;
        public int type;
    }

    /* compiled from: PushSettingsAdapter */
    public static class a extends ViewHolder {
        wt amQ;

        private a(wt wtVar) {
            super(wtVar.getRoot());
            this.amQ = wtVar;
        }

        public void a(c cVar) {
            this.amQ.cqA.setText(cVar.title);
        }
    }

    /* compiled from: PushSettingsAdapter */
    public static class b extends ViewHolder implements OnCheckedChangeListener {
        private c amR;
        private wv amS;

        b(wv wvVar) {
            super(wvVar.getRoot());
            this.amS = wvVar;
            wvVar.cqD.setOnCheckedChangeListener(this);
        }

        public void a(c cVar) {
            this.amR = cVar;
            this.amS.cqA.setText(this.amR.title);
            this.amS.cqC.setText(this.amR.description);
            this.amS.cqD.setOnCheckedChangeListener(null);
            this.amS.cqD.setChecked(this.amR.enabled);
            this.amS.cqD.setOnCheckedChangeListener(this);
            if (this.amR.amT) {
                this.amS.cqE.setVisibility(0);
                this.amS.cqD.setEnabled(false);
                return;
            }
            this.amS.cqE.setVisibility(4);
            this.amS.cqD.setEnabled(true);
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Context context = this.itemView.getContext();
            EventManager BS = EventManager.BS();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("push-settings_");
            stringBuilder.append(this.amR.id);
            BS.a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, stringBuilder.toString()).setValue(Double.valueOf(z ? 1.0d : 0.0d)).build());
            this.amR.enabled = z;
            d.aP(context).a(this.amR.id.longValue(), this.amR.enabled);
            e.a(this.amR.id, Boolean.valueOf(this.amR.enabled));
        }

        public View AO() {
            return this.amS.cqC;
        }
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new a((wt) DataBindingUtil.inflate(from, R.layout.push_settings_category_item, viewGroup, false));
        }
        if (i != 1) {
            return null;
        }
        return new b((wv) DataBindingUtil.inflate(from, R.layout.push_settings_group_item, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        c cVar = (c) this.amP.get(i);
        int i2 = cVar.type;
        if (i2 == 0) {
            ((a) viewHolder).a(cVar);
        } else if (i2 == 1) {
            ((b) viewHolder).a(cVar);
        }
    }

    public int getItemCount() {
        ArrayList arrayList = this.amP;
        return arrayList == null ? 0 : arrayList.size();
    }

    public final int getItemViewType(int i) {
        return ((c) this.amP.get(i)).type;
    }

    public long getItemId(int i) {
        return ((c) this.amP.get(i)).id.longValue();
    }

    public void a(Long l, String str) {
        c cVar = new c();
        cVar.type = 0;
        cVar.id = l;
        cVar.title = str;
        this.amP.add(cVar);
    }

    public void a(Long l, String str, String str2, boolean z) {
        c cVar = new c();
        cVar.type = 1;
        cVar.id = l;
        cVar.title = str;
        cVar.description = str2;
        cVar.enabled = z;
        this.amP.add(cVar);
    }

    public void AN() {
        this.amP.clear();
    }
}
