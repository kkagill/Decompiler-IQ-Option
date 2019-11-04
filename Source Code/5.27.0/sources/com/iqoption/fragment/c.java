package com.iqoption.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.iqoption.activity.TradeRoomActivity;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.IQApp;
import com.iqoption.app.managers.c.h;
import com.iqoption.deposit.l;
import com.iqoption.dto.Balance;
import com.iqoption.dto.Event;
import com.iqoption.dto.entity.result.BalanceListResult;
import com.iqoption.mobbtech.connect.RequestManager;
import com.iqoption.mobbtech.connect.request.api.Requests;
import com.iqoption.mobbtech.connect.response.f;
import com.iqoption.service.e.j;
import com.iqoption.service.e.k;
import com.iqoption.system.a.e;
import com.iqoption.system.a.g;
import com.iqoption.util.t;
import com.iqoption.x.R;

/* compiled from: BalanceFragment */
public class c extends com.iqoption.fragment.b.b {
    private RecyclerView cUc;
    private com.iqoption.a.c cUd;
    private View cUe;
    private final d cUf = new d(this);
    private final b cUg = new b(this);
    private final Handler mHandler = new Handler();

    /* compiled from: BalanceFragment */
    class c extends SimpleOnGestureListener {
        c() {
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            c.this.onBackPressed();
            return true;
        }
    }

    /* compiled from: BalanceFragment */
    private static class b extends e<c> {
        public b(c cVar) {
            super(cVar);
        }

        @com.google.common.b.e
        public void onTotalPnl(h hVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    c cVar = (c) b.this.dUo.get();
                    if (cVar != null && cVar.isAdded()) {
                        cVar.Hh();
                    }
                }
            });
        }
    }

    /* compiled from: BalanceFragment */
    private static class d extends g<c> {
        public d(c cVar) {
            super(cVar);
        }

        @com.google.common.b.e
        public void onChangeBalanceId(com.iqoption.service.e.a aVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    c cVar = (c) d.this.dUo.get();
                    if (cVar != null && cVar.isAdded()) {
                        cVar.axr();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onUpdateBalanceFragment(j jVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    c cVar = (c) d.this.dUo.get();
                    if (cVar != null && cVar.isAdded()) {
                        cVar.axs();
                    }
                }
            });
        }

        @com.google.common.b.e
        public void onUpdateBalanceValue(k kVar) {
            com.iqoption.core.c.a.biN.execute(new Runnable() {
                public void run() {
                    c cVar = (c) d.this.dUo.get();
                    if (cVar != null && cVar.isAdded()) {
                        cVar.axs();
                    }
                }
            });
        }
    }

    /* compiled from: BalanceFragment */
    private static class a extends com.iqoption.system.c.b<c, BalanceListResult> {
        public a(c cVar, Class<BalanceListResult> cls) {
            super(cVar, cls);
        }

        /* renamed from: a */
        public void v(@NonNull c cVar, @NonNull BalanceListResult balanceListResult) {
            com.iqoption.app.b.DG().a(balanceListResult.getMapBalance());
            if (cVar.isAdded()) {
                cVar.cUd.AB();
                cVar.cUd.notifyDataSetChanged();
            }
        }
    }

    public long getAnimationDuration() {
        return 300;
    }

    public static c fR(int i) {
        c cVar = new c();
        Bundle bundle = new Bundle();
        bundle.putInt("leftMargin", i);
        cVar.setArguments(bundle);
        return cVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.balance_fragment, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.cUe = view.findViewById(R.id.baseLayout);
        this.cUe.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                c.this.onBackPressed();
            }
        });
        this.cUd = new com.iqoption.a.c(new com.iqoption.a.c.c() {
            public void dq(int i) {
            }

            public void a(View view, com.iqoption.a.c.a aVar, final int i) {
                Balance dp = c.this.cUd.dp(i);
                TradeRoomActivity tradeRoomActivity;
                switch (view.getId()) {
                    case R.id.depositBtn /*2131362522*/:
                        c.this.onBackPressed();
                        tradeRoomActivity = c.this.getTradeRoomActivity();
                        if (tradeRoomActivity != null) {
                            int i2 = dp.type;
                            if (i2 != 1) {
                                if (i2 == 5) {
                                    tradeRoomActivity.cZ(com.iqoption.util.j.d(com.iqoption.app.b.DG().du(Balance.getCurrency(dp))));
                                    break;
                                }
                            }
                            tradeRoomActivity.Ao();
                            break;
                        }
                        break;
                    case R.id.refresh_traning_balance /*2131363708*/:
                        ((com.iqoption.a.c.e) aVar).AM();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(IQApp.Ev().Vb());
                        String str = "api/demo/reset";
                        stringBuilder.append(str);
                        new com.iqoption.mobbtech.connect.request.a.a.a(RequestManager.b(stringBuilder.toString(), null, c.this.getContext()), new com.iqoption.mobbtech.connect.a.a() {
                            /* renamed from: a */
                            public void onSuccess(com.iqoption.mobbtech.connect.response.g gVar) {
                                com.iqoption.app.managers.k.f(c.this.getContext(), 524288);
                                ViewHolder findViewHolderForAdapterPosition = c.this.cUc.findViewHolderForAdapterPosition(i);
                                if (findViewHolderForAdapterPosition != null && (findViewHolderForAdapterPosition instanceof com.iqoption.a.c.e)) {
                                    ((com.iqoption.a.c.e) findViewHolderForAdapterPosition).AL();
                                }
                                c.this.onBackPressed();
                            }

                            public void a(f fVar) {
                                if (c.this.isAdded()) {
                                    c.this.cUd.notifyItemChanged(i);
                                    fVar.bF(c.this.getContext());
                                }
                            }
                        }, str).aPG();
                        break;
                    case R.id.refresh_trial_balance /*2131363709*/:
                    case R.id.registrationButton /*2131363712*/:
                        c.this.onBackPressed();
                        com.iqoption.welcomeonboarding.a.d(c.this.getFragmentManager());
                        break;
                    case R.id.withdrawalBtn /*2131364502*/:
                        if (dp.type == 1) {
                            c.this.onBackPressed();
                            tradeRoomActivity = c.this.getTradeRoomActivity();
                            if (tradeRoomActivity != null) {
                                tradeRoomActivity.Ak();
                                break;
                            }
                        }
                        break;
                    default:
                        if (!c.this.cUd.e(Long.valueOf(dp.id))) {
                            if (dp.type != 5) {
                                aVar.AI();
                                c.this.cUd.i(i, true);
                                Requests.a(c.this.getContext(), dp, new com.iqoption.mobbtech.connect.a.a() {
                                    /* renamed from: a */
                                    public void onSuccess(com.iqoption.mobbtech.connect.response.g gVar) {
                                    }

                                    public void a(f fVar) {
                                        if (c.this.isAdded()) {
                                            c.this.cUd.i(i, false);
                                            c.this.cUd.notifyItemChanged(i);
                                            fVar.bF(c.this.getContext());
                                        }
                                    }
                                });
                                EventManager.BS().a(Event.Builder(Event.CATEGORY_DROPDOWN_CHANGED, "traderoom_balance-type").setValue(Double.valueOf((double) dp.type)).build());
                                break;
                            }
                            aVar.AH();
                            break;
                        }
                        return;
                }
            }

            public void AJ() {
                EventManager.BS().a(Event.Builder(Event.CATEGORY_DROPDOWN_CHANGED, "traderoom_balance-type").setValue(Double.valueOf(-1.0d)).build());
                com.iqoption.deposit.g.a(c.this.getActivity(), true, false, l.aoQ());
            }
        });
        this.cUd.setHasStableIds(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.cUc = (RecyclerView) view.findViewById(R.id.balancesListView);
        this.cUc.setLayoutManager(linearLayoutManager);
        this.cUc.setAdapter(this.cUd);
        this.cUc.setItemAnimator(null);
        this.cUc.setOnTouchListener(new -$$Lambda$c$5ogg04_p3VYYzuUYWbkKchYjq1c(new GestureDetector(getContext(), new c())));
        int AG = this.cUd.AG();
        if (AG != -1) {
            this.mHandler.post(new -$$Lambda$c$bkNt_D1YhRqQsLXvNAuQKvvkm7E(this, AG));
        }
    }

    private /* synthetic */ void fS(int i) {
        this.cUc.scrollToPosition(i);
    }

    public void onStart() {
        super.onStart();
        this.cUf.register();
        this.cUg.register();
        com.iqoption.app.b.DG();
        this.mHandler.postDelayed(new -$$Lambda$c$uh0_rbUNkZG3QVc0bYjTpSM6ViY(this, new a(this, BalanceListResult.class)), 250);
    }

    public void onStop() {
        super.onStop();
        this.cUf.unregister();
        this.cUg.unregister();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public boolean onBackPressed() {
        if (super.onBackPressed()) {
            return true;
        }
        ah PM = PM();
        if (PM != null) {
            PM.cXz.setSelected(false);
            PM.cXy.animate().rotation(90.0f).setInterpolator(com.iqoption.view.a.a.c.egR).start();
        }
        t.q(getFragmentManager());
        return true;
    }

    public void axr() {
        if (isAdded()) {
            Balance DN = com.iqoption.app.b.aK(getContext()).DN();
            if (DN != null) {
                if (!this.cUd.e(Long.valueOf(DN.id))) {
                    DN.isLoadingChange = false;
                    this.cUd.d(Long.valueOf(DN.id));
                    this.cUd.AF();
                    this.cUd.AE();
                    onBackPressed();
                } else if (DN.isLoadingChange) {
                    DN.isLoadingChange = false;
                    this.cUd.AF();
                }
            }
        }
    }

    public void axs() {
        if (isAdded()) {
            this.cUd.AB();
            this.cUd.notifyDataSetChanged();
        }
    }

    public void Hh() {
        if (isAdded()) {
            this.cUd.AF();
        }
    }

    public void att() {
        this.cUc.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.appear_from_top_to_bottom_show));
    }

    public void atu() {
        this.cUc.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.appear_from_bottom_to_top_hide));
    }
}
