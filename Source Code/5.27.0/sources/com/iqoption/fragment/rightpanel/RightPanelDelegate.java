package com.iqoption.fragment.rightpanel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.app.d;
import com.iqoption.app.managers.feature.c;
import com.iqoption.core.microservices.kyc.response.restriction.b;
import com.iqoption.core.microservices.tradingengine.response.active.a;
import com.iqoption.core.util.j;
import com.iqoption.fragment.ah;
import com.iqoption.util.ab;
import com.iqoption.x.R;
import java.text.DecimalFormat;

abstract class RightPanelDelegate implements LifecycleObserver, LifecycleOwner, a {
    private int ami = -1;
    protected final DecimalFormat dkQ = j.fq(2);
    private LifecycleRegistry dpk = new LifecycleRegistry(this);
    private final RightPanelFragment dpl;
    protected final boolean dpm;

    /* Access modifiers changed, original: 0000 */
    public void T(@NonNull a aVar) {
    }

    public boolean aFo() {
        return false;
    }

    public abstract boolean b(@NonNull a aVar, @Nullable com.iqoption.core.microservices.useralerts.response.a aVar2);

    public abstract View e(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup);

    static void bH(View view) {
        if (!view.isEnabled()) {
            view.animate().cancel();
            view.animate().alpha(1.0f).start();
            view.setEnabled(true);
        }
    }

    static void bI(View view) {
        if (view.isEnabled()) {
            view.animate().cancel();
            view.animate().alpha(0.7f).start();
            view.setEnabled(false);
        }
    }

    RightPanelDelegate(RightPanelFragment rightPanelFragment) {
        this.dpl = rightPanelFragment;
        this.dpl.getLifecycle().addObserver(this);
        this.dpm = c.Iw().ej("not-accept-deals");
    }

    /* Access modifiers changed, original: protected */
    public String getString(@StringRes int i) {
        return this.dpl.getString(i);
    }

    /* Access modifiers changed, original: protected|varargs */
    public String getString(@StringRes int i, Object... objArr) {
        return this.dpl.getString(i, objArr);
    }

    /* Access modifiers changed, original: 0000 */
    public void create() {
        onCreate();
        onStart();
        onResume();
    }

    /* Access modifiers changed, original: 0000 */
    public void destroy() {
        onPause();
        onStop();
        onDestroy();
    }

    @OnLifecycleEvent(Event.ON_CREATE)
    private void onCreate() {
        this.dpk.handleLifecycleEvent(Event.ON_CREATE);
    }

    @OnLifecycleEvent(Event.ON_START)
    private void onStart() {
        this.dpk.handleLifecycleEvent(Event.ON_START);
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    private void onResume() {
        this.dpk.handleLifecycleEvent(Event.ON_RESUME);
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    private void onPause() {
        this.dpk.handleLifecycleEvent(Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Event.ON_STOP)
    private void onStop() {
        this.dpk.handleLifecycleEvent(Event.ON_STOP);
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    private void onDestroy() {
        this.dpk.handleLifecycleEvent(Event.ON_DESTROY);
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.dpk;
    }

    /* Access modifiers changed, original: protected|final */
    public final FragmentManager getFragmentManager() {
        return this.dpl.getActivity().getSupportFragmentManager();
    }

    public void aFt() {
        ah PM = this.dpl.PM();
        if (PM != null) {
            PM.ij(this.dpl.getString(R.string.investment_bigger_then_balance));
        }
    }

    public void b(boolean z, double d) {
        ah PM = this.dpl.PM();
        if (PM != null) {
            String string;
            if (z) {
                string = this.dpl.getString(R.string.maximum_investment_amount_for_deal);
            } else {
                string = com.iqoption.util.j.a(d, this.dkQ);
                string = this.dpl.getString(R.string.the_value_you_entered_is_too_small, string);
            }
            PM.ij(string);
        }
    }

    public final Context getContext() {
        return this.dpl.getContext();
    }

    public ah getTradeFragment() {
        return this.dpl.PM();
    }

    public TradeRoomActivity aFs() {
        return this.dpl.getTradeRoomActivity();
    }

    public RightPanelFragment aFr() {
        return this.dpl;
    }

    public LiveData<com.iqoption.core.microservices.risks.response.overnightfee.c> aFq() {
        return this.dpl.dpu.aFq();
    }

    @Nullable
    public b aFp() {
        ah PM = this.dpl.PM();
        if (PM == null) {
            return null;
        }
        return PM.dt(true);
    }

    public void b(@NonNull b bVar) {
        ah PM = this.dpl.PM();
        if (PM != null && PM.getActivity() != null) {
            com.iqoption.fragment.restriction.a.a.dkF.b(PM.getActivity(), getFragmentManager(), R.id.fragment).ae(PM).a(bVar).show();
        }
    }

    public void bA(View view) {
        if (this.ami == -1) {
            this.ami = getContext().getResources().getDimensionPixelSize(R.dimen.dp1);
        }
        com.iqoption.core.util.b.o(view, this.ami);
    }

    /* Access modifiers changed, original: protected */
    public double Fd() {
        com.iqoption.app.b DG = com.iqoption.app.b.DG();
        double Fd = d.Fa().Fd();
        if (Fd != 0.0d) {
            return Fd;
        }
        if (DG.DJ() == 4) {
            return c(DG);
        }
        return com.iqoption.util.j.ae(getInstrumentType())[0];
    }

    /* Access modifiers changed, original: protected */
    public double c(com.iqoption.app.b bVar) {
        Double f = ab.f(bVar.DI(), com.iqoption.app.managers.feature.a.bA(bVar.Ej()));
        if (f == null) {
            return 50.0d;
        }
        d.Fa().j(f.doubleValue());
        return f.doubleValue();
    }
}
