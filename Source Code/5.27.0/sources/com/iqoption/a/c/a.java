package com.iqoption.a.c;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.iqoption.app.b;
import com.iqoption.app.d;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.util.j;
import com.iqoption.x.R;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: KeyboardPresetAdapter */
public class a extends Adapter {
    private com.iqoption.a.b.a akC = null;
    private ArrayList<String> anS = new ArrayList();
    private ArrayList<String> anT = new ArrayList();
    private double[] anU = new double[]{0.01d, 0.02d, 0.04d, 0.05d, 0.1d, 0.2d, 0.25d, 0.4d, 0.5d, 1.0d};
    private double[] anV = new double[]{0.005d, 0.01d, 0.02d, 0.04d, 0.08d, 0.1d, 0.2d, 0.3d, 0.4d, 0.5d};
    private int type;

    /* compiled from: KeyboardPresetAdapter */
    public static class a extends ViewHolder implements OnClickListener {
        TextView ani;
        com.iqoption.a.b.a listener;

        a(View view, com.iqoption.a.b.a aVar) {
            super(view);
            this.ani = (TextView) view;
            this.listener = aVar;
            if (this.listener != null) {
                this.ani.setOnClickListener(this);
            }
        }

        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            com.iqoption.a.b.a aVar = this.listener;
            if (aVar != null && adapterPosition >= 0) {
                aVar.onItemClick(view, adapterPosition);
            }
        }
    }

    public a(Context context, int i, @Nullable InstrumentType instrumentType, com.iqoption.a.b.a aVar) {
        this.type = i;
        this.akC = aVar;
        d aP = d.aP(context);
        for (Double a : aP.Fe()) {
            this.anT.add(a(a));
        }
        if (this.anT.size() > 3) {
            this.type = 1000;
        }
        double[] ae = j.ae(instrumentType);
        int i2 = 0;
        double d = ae[0];
        if (d <= 0.0d) {
            d = 1.0d;
        }
        double Fc = aP.Fc();
        if (Fc == 0.0d) {
            Fc = d;
        }
        int intValue = b.aK(context).DI().intValue();
        double d2 = ae[1];
        int i3 = (int) (100.0d * d);
        intValue = (intValue / i3) * i3;
        if (intValue < i3) {
            intValue = i3;
        }
        double d3 = (double) intValue;
        if (d3 > d2) {
            d3 = d2;
        }
        intValue = (int) d3;
        double d4 = (double) intValue;
        Double.isNaN(d4);
        double[] dArr = (Fc > 0.2d * d4 || intValue <= i3) ? this.anU : this.anV;
        while (i2 < dArr.length) {
            double d5 = dArr[i2];
            Double.isNaN(d4);
            d5 *= d4;
            if (d5 < d) {
                d5 = 1.0d;
            }
            if (d5 < d2) {
                this.anS.add(Integer.toString((int) d5));
            }
            i2++;
        }
        setHasStableIds(true);
    }

    private String a(Double d) {
        if (d == null) {
            return "0";
        }
        double doubleValue = d.doubleValue();
        double intValue = (double) d.intValue();
        Double.isNaN(intValue);
        if (Math.abs(doubleValue - intValue) > 0.001d) {
            return String.format(Locale.US, "%1.2f", new Object[]{d});
        }
        return String.format(Locale.US, "%1.0f", new Object[]{d});
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.keyboard_string_item, viewGroup, false), this.akC);
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        String DO = b.aK(viewHolder.itemView.getContext()).DO();
        CharSequence item = getItem(i);
        if (!TextUtils.isEmpty(DO)) {
            item = String.format(Locale.US, DO, new Object[]{item});
        }
        ((a) viewHolder).ani.setText(item);
    }

    public void AT() {
        int i = this.type;
        int i2 = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
        if (i == CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE) {
            i2 = 1000;
        }
        this.type = i2;
        notifyDataSetChanged();
    }

    public int AU() {
        return this.type;
    }

    public String getItem(int i) {
        return (String) (this.type == CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE ? this.anS : this.anT).get(i);
    }

    public long getItemId(int i) {
        return (long) (i + this.type);
    }

    public int getItemCount() {
        int i = this.type;
        if (i == 1000) {
            return this.anT.size();
        }
        return i == CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE ? this.anS.size() : 0;
    }
}
