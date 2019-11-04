package com.iqoption.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.app.IQApp;
import com.iqoption.core.microservices.risks.response.overnightfee.OvernightDay;
import com.iqoption.core.microservices.risks.response.overnightfee.d;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.core.util.af;
import com.iqoption.e.gm;
import com.iqoption.e.oz;
import com.iqoption.util.ab;
import com.iqoption.util.ai;
import com.iqoption.util.e;
import com.iqoption.util.j;
import com.iqoption.util.k;
import com.iqoption.x.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: OvernightFeeInfoDialog */
public final class aa extends com.iqoption.fragment.b.b {
    private gm cWs;

    /* compiled from: OvernightFeeInfoDialog */
    private final class a extends Adapter<b> {
        private LayoutInflater aPl;
        private double bmw;
        private boolean cKy;
        private final OvernightDay[] cWt = new OvernightDay[]{OvernightDay.MON, OvernightDay.TUE, OvernightDay.WED, OvernightDay.THU, OvernightDay.FRI, OvernightDay.SAT, OvernightDay.SUN};
        private com.iqoption.core.microservices.risks.response.overnightfee.c cWu;
        private int cWv;
        private OvernightDay cWw;
        private String cWx;
        private int leverage;

        public a(com.iqoption.core.microservices.risks.response.overnightfee.c cVar, double d, int i, boolean z) {
            if (cVar != null) {
                this.cWx = j.DO();
                this.bmw = d;
                this.cKy = z;
                this.leverage = i;
                this.cWv = TimeUtil.bRM.anN();
                this.cWw = OvernightDay.today();
                this.cWu = cVar;
            }
        }

        /* renamed from: H */
        public b onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (this.aPl == null) {
                this.aPl = LayoutInflater.from(viewGroup.getContext());
            }
            return new b(oz.r(this.aPl, viewGroup, false));
        }

        /* renamed from: a */
        public void onBindViewHolder(b bVar, int i) {
            OvernightDay overnightDay = this.cWt[i];
            boolean z = this.cWw == overnightDay;
            d a = this.cWu.a(this.cWv, overnightDay);
            if (a == null) {
                bVar.a(overnightDay, z);
            } else {
                bVar.a(overnightDay, a, z, this.bmw, this.leverage, this.cKy, this.cWx);
            }
        }

        public int getItemCount() {
            return this.cWt.length;
        }
    }

    /* compiled from: OvernightFeeInfoDialog */
    private final class b extends ViewHolder {
        private oz cWz;

        public b(oz ozVar) {
            super(ozVar.getRoot());
            this.cWz = ozVar;
        }

        private void a(OvernightDay overnightDay, d dVar, boolean z, double d, int i, boolean z2, String str) {
            Typeface d2 = com.iqoption.core.ext.a.d((ViewHolder) this, z ? R.font.bold : R.font.regular);
            this.cWz.getRoot().setSelected(z);
            this.cWz.bWY.setTypeface(d2);
            this.cWz.anj.setTypeface(d2);
            this.cWz.cml.setTypeface(d2);
            this.cWz.cmm.setTypeface(d2);
            double ahn = z2 ? dVar.ahn() : dVar.aho();
            double d3 = (double) i;
            Double.isNaN(d3);
            double i2 = ab.i((d3 * d) - d, ahn);
            Object obj = ahn < 0.0d ? 1 : null;
            this.cWz.cmm.setTextColor(com.iqoption.core.ext.a.b((ViewHolder) this, obj != null ? R.color.green : R.color.white));
            this.cWz.bWY.setText(k.a(overnightDay));
            this.cWz.anj.setText(TimeUtil.bRM.aQ(dVar.getTime()));
            String str2 = "+";
            String str3 = "-";
            this.cWz.cml.setText(af.b(ahn, obj != null ? str2 : str3, 4));
            TextView textView = this.cWz.cmm;
            StringBuilder stringBuilder = new StringBuilder();
            if (obj == null) {
                str2 = str3;
            }
            stringBuilder.append(str2);
            stringBuilder.append(str);
            textView.setText(j.c(stringBuilder.toString(), Double.valueOf(Math.abs(i2))));
        }

        public void a(OvernightDay overnightDay, boolean z) {
            Typeface d = com.iqoption.core.ext.a.d((ViewHolder) this, z ? R.font.bold : R.font.regular);
            this.cWz.getRoot().setSelected(z);
            this.cWz.bWY.setTypeface(d);
            this.cWz.anj.setTypeface(d);
            this.cWz.cml.setTypeface(d);
            this.cWz.cmm.setTypeface(d);
            this.cWz.bWY.setText(k.a(overnightDay));
            this.cWz.anj.setText(R.string.n_a);
            this.cWz.cml.setText(R.string.n_a);
            this.cWz.cmm.setText(R.string.n_a);
        }
    }

    /* compiled from: OvernightFeeInfoDialog */
    public static class c extends com.iqoption.system.a.c<Boolean> {
    }

    @NonNull
    private static aa a(int i, int i2, double d, int i3, boolean z, com.iqoption.core.microservices.risks.response.overnightfee.c cVar) {
        aa aaVar = new aa();
        aaVar.setArguments(new e().O("arg.anchorX", i).O("arg.anchorY", i2).i("arg.amount", d).O("arg.leverage", i3).z("arg.is.long", z).b("arg.value", (Parcelable) cVar).toBundle());
        return aaVar;
    }

    public static void a(@NonNull FragmentManager fragmentManager, @IdRes int i, int i2, int i3, double d, int i4, boolean z, com.iqoption.core.microservices.risks.response.overnightfee.c cVar) {
        String str = "OvernightFeeInfoDialog";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(i, a(i2, i3, d, i4, z, cVar), str).addToBackStack(str).commit();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.cWs = (gm) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_overnight_fee_info, viewGroup, false);
        this.cWs.a(this);
        Bundle arguments = getArguments();
        arguments.getInt("arg.anchorY");
        double d = arguments.getDouble("arg.amount");
        boolean z = arguments.getBoolean("arg.is.long");
        int i = arguments.getInt("arg.leverage");
        com.iqoption.core.microservices.risks.response.overnightfee.c cVar = (com.iqoption.core.microservices.risks.response.overnightfee.c) arguments.getParcelable("arg.value");
        String format = new SimpleDateFormat("ZZZZ", Locale.getDefault()).format(new Date());
        this.cWs.cco.setText(new ai().jP(getString(R.string.schedule).toUpperCase()).cs(new ForegroundColorSpan(getColor(R.color.grey_blue))).jP(String.format(" (%s)", new Object[]{format})).anA());
        this.cWs.ccn.setAdapter(new a(cVar, d, i, z));
        return this.cWs.getRoot();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        IQApp.Ex().bd(new c().setValue(Boolean.valueOf(true)));
    }

    public boolean onClose() {
        requireFragmentManager().popBackStack();
        IQApp.Ex().bd(new c().setValue(Boolean.valueOf(false)));
        return true;
    }

    public void att() {
        this.cWs.aRl.setAlpha(0.0f);
        float f = (float) (-getResources().getDimensionPixelOffset(R.dimen.dp12));
        this.cWs.aRl.setTranslationX(f);
        this.cWs.aRl.setTranslationY(f);
        this.cWs.aRl.setPivotX((float) this.cWs.aRl.getWidth());
        this.cWs.aRl.setPivotY(1.0f);
        this.cWs.aRl.setScaleX(0.3f);
        this.cWs.aRl.setScaleY(0.3f);
        this.cWs.aRl.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).translationX(0.0f).translationY(0.0f).setDuration(400).setListener(null).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }

    public void atu() {
        this.cWs.aRl.setPivotX((float) this.cWs.aRl.getWidth());
        this.cWs.aRl.setPivotY(1.0f);
        this.cWs.aRl.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).setDuration(300).setInterpolator(com.iqoption.view.a.a.c.egR).start();
    }
}
