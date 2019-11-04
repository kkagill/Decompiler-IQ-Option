package com.iqoption.fragment.dialog;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.iqoption.analytics.EventManager;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.u;
import com.iqoption.dialogs.b.q;
import com.iqoption.dto.Event;
import com.iqoption.fragment.b.b;
import com.iqoption.mobbtech.connect.response.options.c;
import com.iqoption.util.EventSenderLifecycleObserver;
import com.iqoption.util.e;
import com.iqoption.util.j;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;

/* compiled from: ConfirmCloseFullInvestPositionDialog */
public class a extends b {
    private q cLp;
    private com.iqoption.fragment.dialog.c.a ddM;
    private c ddN;
    private com.iqoption.mobbtech.connect.response.options.b ddO;
    private String ddP;
    private n<com.iqoption.core.ui.c.a> ddQ = Suppliers.a(new n<com.iqoption.core.ui.c.a>() {
        /* renamed from: aBT */
        public com.iqoption.core.ui.c.a get() {
            return new com.iqoption.core.ui.c.a(a.this.cLp.aHP, a.this.cLp.aIv);
        }
    });
    private a ddR = new a(this, null);

    /* compiled from: ConfirmCloseFullInvestPositionDialog */
    private static class a implements com.iqoption.view.a.b.a {
        private final WeakReference<a> bJf;

        /* synthetic */ a(a aVar, AnonymousClass1 anonymousClass1) {
            this(aVar);
        }

        private a(a aVar) {
            this.bJf = new WeakReference(aVar);
        }

        public void onTick(long j) {
            a aVar = (a) this.bJf.get();
            if (aVar != null && aVar.isAdded()) {
                aVar.aul();
            }
        }
    }

    public static void a(@IdRes int i, FragmentManager fragmentManager, com.iqoption.fragment.dialog.c.a aVar, com.iqoption.mobbtech.connect.response.options.b bVar) {
        a(fragmentManager, i, new e().a("arg.OpenOptionGroup", (Parcelable) bVar).toBundle(), aVar);
    }

    public static void a(@IdRes int i, FragmentManager fragmentManager, com.iqoption.fragment.dialog.c.a aVar, c cVar) {
        a(fragmentManager, i, new e().a("arg.position", (Parcelable) cVar).toBundle(), aVar);
    }

    private static void a(FragmentManager fragmentManager, @IdRes int i, Bundle bundle, com.iqoption.fragment.dialog.c.a aVar) {
        String str = "ConfirmCloseFullInvestPositionDialog";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(i, a(bundle, aVar), str).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(str).commit();
        }
    }

    private static a a(Bundle bundle, com.iqoption.fragment.dialog.c.a aVar) {
        a aVar2 = new a();
        aVar2.setArguments(bundle);
        aVar2.ddM = aVar;
        return aVar2;
    }

    public void att() {
        ((com.iqoption.core.ui.c.a) this.ddQ.get()).bi(axh()).start();
    }

    public void atu() {
        ((com.iqoption.core.ui.c.a) this.ddQ.get()).bj(axj()).start();
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (this.ddM == null) {
            onClose();
            return null;
        }
        this.cLp = (q) DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.dialog_simple, viewGroup, false);
        this.cLp.alH.setVisibility(8);
        this.cLp.cMy.setVisibility(8);
        Bundle arguments = getArguments();
        this.ddN = (c) arguments.getParcelable("arg.position");
        this.ddO = (com.iqoption.mobbtech.connect.response.options.b) arguments.getParcelable("arg.OpenOptionGroup");
        AnonymousClass2 anonymousClass2 = new com.iqoption.view.d.b() {
            public void M(View view) {
                a.this.ddM.ayM();
                a.this.onBackPressed();
                String str = "asset_id";
                EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "sell-zero_cancel").setParameters(u.anp().o("instrument_type", a.this.getInstrumentType()).o(str, a.this.aiq()).anr()).build());
            }
        };
        this.cLp.getRoot().setOnClickListener(anonymousClass2);
        this.cLp.cMw.setText(R.string.cancel);
        this.cLp.cMx.setText(R.string.confirm);
        this.cLp.cMw.setOnClickListener(anonymousClass2);
        this.cLp.cMx.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                if (a.this.ddN == null) {
                    a.this.ddM.b(a.this.ddO);
                } else {
                    a.this.ddM.o(a.this.ddN);
                }
                a.this.onBackPressed();
                String str = "asset_id";
                EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "sell-zero_confirm").setParameters(u.anp().o("instrument_type", a.this.getInstrumentType()).o(str, a.this.aiq()).anr()).build());
            }
        });
        this.ddP = getString(R.string.you_will_lose_the_full_invest_amount_n1);
        aBS();
        return this.cLp.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getLifecycle().addObserver(new EventSenderLifecycleObserver("sell-zero_show-popup", new -$$Lambda$a$p4hOajHGiClgKPswKpUofEK0JIg(this)));
    }

    public boolean onClose() {
        requireFragmentManager().popBackStack();
        return true;
    }

    private void aBS() {
        if (!TextUtils.isEmpty(this.ddP)) {
            if (!(this.ddN == null && this.ddO == null)) {
                this.cLp.ani.setText(String.format(this.ddP, new Object[]{j.r(Double.valueOf(Math.abs(getSellPnl())))}));
            }
        }
    }

    private double getSellPnl() {
        c cVar = this.ddN;
        return cVar == null ? this.ddO.getSellPnl() : cVar.getSellPnl();
    }

    private InstrumentType getInstrumentType() {
        c cVar = this.ddN;
        return cVar == null ? this.ddO.instrumentType : cVar.getInstrumentType();
    }

    private Integer aiq() {
        c cVar = this.ddN;
        return Integer.valueOf(cVar == null ? this.ddO.activeId : cVar.getActiveId());
    }

    public void onStart() {
        super.onStart();
        auo();
    }

    public void onStop() {
        super.onStop();
        aup();
    }

    private void aul() {
        aBS();
    }

    private void auo() {
        com.iqoption.view.a.b.aYv().a(this.ddR, Integer.valueOf(5));
    }

    private void aup() {
        com.iqoption.view.a.b.aYv().b(this.ddR);
    }
}
