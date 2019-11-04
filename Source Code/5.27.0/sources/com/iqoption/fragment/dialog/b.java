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
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.common.base.Suppliers;
import com.google.common.base.n;
import com.iqoption.analytics.k;
import com.iqoption.core.microservices.tradingengine.response.active.d;
import com.iqoption.dialogs.b.q;
import com.iqoption.dto.entity.position.Order;
import com.iqoption.util.EventSenderLifecycleObserver;
import com.iqoption.util.ai;
import com.iqoption.util.e;
import com.iqoption.util.t;
import com.iqoption.x.R;

/* compiled from: ConfirmClosePendingPositionDialog */
public final class b extends com.iqoption.fragment.b.b {
    private static final String TAG = "com.iqoption.fragment.dialog.b";
    private q cLp;
    private n<com.iqoption.core.ui.c.a> ddQ = Suppliers.a(new n<com.iqoption.core.ui.c.a>() {
        /* renamed from: aBT */
        public com.iqoption.core.ui.c.a get() {
            return new com.iqoption.core.ui.c.a(b.this.cLp.aHP, b.this.cLp.aIv);
        }
    });
    private a ddT;

    /* compiled from: ConfirmClosePendingPositionDialog */
    public interface a {
        void l(Order order);

        void m(Order order);
    }

    public long getAnimationDuration() {
        return 250;
    }

    public static void a(@IdRes int i, FragmentManager fragmentManager, a aVar, Order order) {
        if (t.c(fragmentManager, TAG)) {
            fragmentManager.beginTransaction().add(i, a(aVar, order), TAG).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(TAG).commit();
        }
    }

    private static b a(a aVar, Order order) {
        b bVar = new b();
        bVar.setArguments(new e().a("arg.order", (Parcelable) order).toBundle());
        bVar.ddT = aVar;
        return bVar;
    }

    public void att() {
        ((com.iqoption.core.ui.c.a) this.ddQ.get()).bi(axh()).start();
    }

    public void atu() {
        ((com.iqoption.core.ui.c.a) this.ddQ.get()).bj(axj()).start();
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (this.ddT == null) {
            onClose();
            return null;
        }
        bundle = getArguments();
        if (bundle == null) {
            onClose();
            return null;
        }
        final Order order = (Order) bundle.getParcelable("arg.order");
        if (order == null) {
            onClose();
            return null;
        }
        com.iqoption.core.microservices.tradingengine.response.active.a a = com.iqoption.app.helpers.a.Gs().a(order.getInstrumentActiveId(), order.getInstrumentType());
        if (a == null) {
            onClose();
            return null;
        }
        this.cLp = (q) DataBindingUtil.inflate(layoutInflater, R.layout.dialog_simple, viewGroup, false);
        this.cLp.alH.setVisibility(8);
        this.cLp.cMy.setVisibility(8);
        AnonymousClass2 anonymousClass2 = new com.iqoption.view.d.b() {
            public void M(View view) {
                b.this.ddT.m(order);
                b.this.onClose();
            }
        };
        this.cLp.getRoot().setOnClickListener(anonymousClass2);
        this.cLp.ani.setText(new ai().jP(getString(order.getType().equals(Order.ON_MKT_OPEN) ? R.string.confirm_cancellation_of_mkt_on_open_order : R.string.confirm_cancellation_of_limit_order_for)).jP(" ").cs(new ForegroundColorSpan(-1)).jP(d.B(a)).anA());
        this.cLp.cMw.setText(R.string.cancel);
        this.cLp.cMx.setText(R.string.confirm);
        this.cLp.cMw.setOnClickListener(anonymousClass2);
        this.cLp.cMx.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                b.this.ddT.l(order);
                b.this.onClose();
                k.aC(true);
            }
        });
        return this.cLp.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        getLifecycle().addObserver(new EventSenderLifecycleObserver(k.Cm(), null));
    }

    public boolean onClose() {
        requireFragmentManager().popBackStack();
        return true;
    }
}
