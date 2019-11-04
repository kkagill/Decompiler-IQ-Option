package com.iqoption.fragment.dialog;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.tradingengine.response.active.d;
import com.iqoption.dialogs.b.q;
import com.iqoption.dto.Currencies;
import com.iqoption.dto.Event.Builder;
import com.iqoption.util.EventSenderLifecycleObserver;
import com.iqoption.util.ai;
import com.iqoption.util.e;
import com.iqoption.util.j;
import com.iqoption.x.R;
import java.lang.ref.WeakReference;
import kotlin.l;

/* compiled from: ConfirmClosePositionDialog */
public class c extends com.iqoption.fragment.b.b {
    private q cLp;
    private a ddM;
    private com.iqoption.mobbtech.connect.response.options.c ddN;
    private com.iqoption.mobbtech.connect.response.options.b ddO;
    private n<com.iqoption.core.ui.c.a> ddQ = Suppliers.a(new n<com.iqoption.core.ui.c.a>() {
        /* renamed from: aBT */
        public com.iqoption.core.ui.c.a get() {
            return new com.iqoption.core.ui.c.a(c.this.cLp.aHP, c.this.cLp.aIv);
        }
    });
    private String ddW = "";
    private ForegroundColorSpan ddX;
    private ForegroundColorSpan ddY;
    private String[] ddZ;
    private b dea = new b(this, null);
    private boolean ze = false;

    /* compiled from: ConfirmClosePositionDialog */
    public interface a {
        void ayM();

        void b(com.iqoption.mobbtech.connect.response.options.b bVar);

        void o(com.iqoption.mobbtech.connect.response.options.c cVar);
    }

    /* compiled from: ConfirmClosePositionDialog */
    private static class b implements com.iqoption.view.a.b.a {
        private final WeakReference<c> bJf;

        /* synthetic */ b(c cVar, AnonymousClass1 anonymousClass1) {
            this(cVar);
        }

        private b(c cVar) {
            this.bJf = new WeakReference(cVar);
        }

        public void onTick(long j) {
            c cVar = (c) this.bJf.get();
            if (cVar != null && cVar.isAdded()) {
                cVar.aul();
            }
        }
    }

    public static void a(@IdRes int i, FragmentManager fragmentManager, a aVar, com.iqoption.mobbtech.connect.response.options.b bVar) {
        a(fragmentManager, i, new e().a("arg.OpenOptionGroup", (Parcelable) bVar).toBundle(), aVar);
    }

    public static void a(@IdRes int i, FragmentManager fragmentManager, a aVar, com.iqoption.mobbtech.connect.response.options.c cVar) {
        a(fragmentManager, i, new e().a("arg.position", (Parcelable) cVar).toBundle(), aVar);
    }

    private static void a(FragmentManager fragmentManager, @IdRes int i, Bundle bundle, a aVar) {
        String str = "ConfirmClosePositionDialog";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(i, b(bundle, aVar), str).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(str).commit();
        }
    }

    private static c b(Bundle bundle, a aVar) {
        c cVar = new c();
        cVar.setArguments(bundle);
        cVar.ddM = aVar;
        return cVar;
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
        this.ddN = (com.iqoption.mobbtech.connect.response.options.c) arguments.getParcelable("arg.position");
        this.ddO = (com.iqoption.mobbtech.connect.response.options.b) arguments.getParcelable("arg.OpenOptionGroup");
        this.ddX = new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.white));
        this.ddY = new ForegroundColorSpan(ContextCompat.getColor(getContext(), R.color.white));
        AnonymousClass2 anonymousClass2 = new com.iqoption.view.d.b() {
            public void M(View view) {
                c.this.ddM.ayM();
                c.this.ze = true;
                c.this.onBackPressed();
            }
        };
        this.cLp.getRoot().setOnClickListener(anonymousClass2);
        this.cLp.cMw.setText(R.string.cancel);
        this.cLp.cMx.setText(R.string.confirm);
        this.cLp.cMw.setOnClickListener(anonymousClass2);
        this.cLp.cMx.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                if (c.this.ddN == null) {
                    c.this.ddM.b(c.this.ddO);
                } else {
                    c.this.ddM.o(c.this.ddN);
                }
                c.this.onBackPressed();
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getString(R.string.confirm_closing_with));
        stringBuilder.append(" %s");
        String stringBuilder2 = stringBuilder.toString();
        com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(Integer.valueOf(getActiveId()), getInstrumentType());
        if (a != null) {
            this.ddW = d.B(a);
        }
        this.ddZ = stringBuilder2.split(Currencies.REPLACE_CURRENCY_MASK);
        aBS();
        return this.cLp.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getLifecycle().addObserver(new EventSenderLifecycleObserver("sell_confirm-show", new -$$Lambda$c$GBu6tl12SWJ2Y2Qlg6vB7CQyDRo(this)));
    }

    private /* synthetic */ l f(Builder builder) {
        builder.setValue(Double.valueOf(this.ze ? 1.0d : 0.0d));
        return null;
    }

    public boolean onClose() {
        requireFragmentManager().popBackStack();
        return true;
    }

    private void aBS() {
        if (this.ddZ.length != 0) {
            if (!(this.ddN == null && this.ddO == null)) {
                this.cLp.ani.setText(new ai().jP(this.ddZ[0]).cs(this.ddX).jP(this.ddW).aWX().jP(this.ddZ[1]).cs(this.ddY).jP(j.r(Double.valueOf(getInvestSum() + getSellPnl()))).anA());
            }
        }
    }

    private double getSellPnl() {
        com.iqoption.mobbtech.connect.response.options.c cVar = this.ddN;
        return cVar == null ? this.ddO.getSellPnl() : cVar.getSellPnl();
    }

    private double getInvestSum() {
        com.iqoption.mobbtech.connect.response.options.c cVar = this.ddN;
        return cVar == null ? this.ddO.getInvestSum() : cVar.getInvestSum();
    }

    private int getActiveId() {
        com.iqoption.mobbtech.connect.response.options.c cVar = this.ddN;
        return cVar == null ? this.ddO.activeId : cVar.getActiveId();
    }

    private InstrumentType getInstrumentType() {
        com.iqoption.mobbtech.connect.response.options.c cVar = this.ddN;
        return cVar == null ? this.ddO.instrumentType : cVar.getInstrumentType();
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
        com.iqoption.view.a.b.aYv().a(this.dea, Integer.valueOf(5));
    }

    private void aup() {
        com.iqoption.view.a.b.aYv().b(this.dea);
    }
}
