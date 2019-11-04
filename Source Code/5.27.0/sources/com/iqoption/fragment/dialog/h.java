package com.iqoption.fragment.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import com.google.gson.JsonObject;
import com.iqoption.app.managers.e;
import com.iqoption.core.util.u.b;
import com.iqoption.dto.Currencies;
import com.iqoption.dto.Currencies.ConversionCurrency;
import com.iqoption.e.gi;
import com.iqoption.fragment.b.g;
import com.iqoption.util.ak;
import com.iqoption.util.j;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* compiled from: OtnEmissionStatisticsDialog */
public final class h extends g {
    private static final String TAG = "com.iqoption.fragment.dialog.h";
    private DecimalFormat cXm;
    private e del;
    private String dem;
    private double den;
    private String deo;
    private gi dep;
    private g deq;
    private Double der;
    private Double des;
    private BigDecimal det;
    private BigDecimal deu;

    /* compiled from: OtnEmissionStatisticsDialog */
    private static class a {
        private final double dew;
        private final double dex;
        private final double dey;

        public a(double d, double d2, double d3) {
            this.dew = d;
            this.dex = d2;
            this.dey = d3;
        }

        private Bundle toBundle() {
            return new com.iqoption.util.e().i("arg.totalCommission", this.dew).i("arg.yourCommission", this.dex).i("arg.otnAmount", this.dey).toBundle();
        }
    }

    public static void a(@IdRes int i, FragmentManager fragmentManager) {
        a(i, fragmentManager, null);
    }

    public static void a(@IdRes int i, FragmentManager fragmentManager, double d, double d2, double d3) {
        a(i, fragmentManager, new a(d, d2, d3));
    }

    private static void a(@IdRes int i, FragmentManager fragmentManager, @Nullable a aVar) {
        if (fragmentManager.findFragmentByTag(TAG) == null) {
            fragmentManager.beginTransaction().add(i, a(aVar), TAG).addToBackStack(TAG).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    private static h a(@Nullable a aVar) {
        if (aVar == null) {
            return new h();
        }
        h hVar = new h();
        hVar.setArguments(aVar.toBundle());
        return hVar;
    }

    public String getEventName() {
        return this.deq.getEventName();
    }

    public JsonObject aBP() {
        return b.anq().o("total_com_paid", this.der).o("your_com", this.des).o("tokens_to_distr", this.det).o("you_receive", this.deu).anr();
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.del = e.Hv();
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        this.dem = DG.DO();
        this.den = j.b(DG.DQ()).doubleValue();
        this.cXm = j.aWK();
        ConversionCurrency du = DG.du(Currencies.OTN_CURRENCY);
        if (du == null) {
            onClose();
            return null;
        }
        this.deo = du.mask;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.dep = gi.n(layoutInflater, viewGroup, false);
        this.dep.aRl.setLayoutTransition(ak.anP());
        this.dep.cci.setLayoutTransition(ak.anP());
        this.del.HM().size();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.deq = new j(this, arguments);
        } else {
            this.deq = new i(this);
        }
        this.dep.alH.setText(this.deq.getTitle());
        this.der = this.deq.aBX();
        if (this.der != null) {
            this.dep.cce.setText(j.d(this.dem, j.b(this.der, Double.valueOf(this.den))));
        }
        this.des = this.deq.aBY();
        if (this.des != null) {
            this.dep.ccj.setText(j.d(this.dem, j.b(this.des, Double.valueOf(this.den))));
        }
        this.dep.ccb.setText(this.deq.aBW());
        this.det = this.deq.aBZ();
        if (this.det != null) {
            this.dep.ccd.setText(j.a(this.deo, Double.valueOf(this.det.doubleValue()), this.cXm));
        }
        this.deu = this.deq.aCa();
        if (this.deu != null) {
            this.dep.ccg.setText(j.a(this.deo, Double.valueOf(this.deu.doubleValue()), this.cXm));
        }
        this.dep.bYq.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                h.this.onClose();
            }
        });
        this.dep.cbY.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                com.iqoption.analytics.h.a(h.g(view, h.this.dep.ccf), "total_com_paid");
            }
        });
        this.dep.cca.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                com.iqoption.analytics.h.a(h.g(view, h.this.dep.cck), "your_com");
            }
        });
        this.dep.cbX.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                com.iqoption.analytics.h.a(h.g(view, h.this.dep.ccc), "tokens_to_distr");
            }
        });
        this.dep.cbZ.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                com.iqoption.analytics.h.a(h.g(view, h.this.dep.cch), "you_receive");
            }
        });
        return this.dep.getRoot();
    }

    private static boolean g(View view, View view2) {
        boolean isSelected = view.isSelected();
        if (isSelected) {
            view2.setVisibility(8);
        } else {
            view2.setVisibility(0);
        }
        view.setSelected(isSelected ^ 1);
        return isSelected;
    }
}
