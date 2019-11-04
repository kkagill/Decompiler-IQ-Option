package com.iqoption.dialog.a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.common.base.n;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.i;
import com.google.common.util.concurrent.t;
import com.google.gson.JsonArray;
import com.iqoption.analytics.k;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.dialog.a.a.d;
import com.iqoption.dto.ChartTimeInterval;
import com.iqoption.dto.Point;
import com.iqoption.e.eq;
import com.iqoption.fragment.b.g;
import com.iqoption.mobbtech.connect.response.options.c;
import com.iqoption.util.e;
import com.iqoption.util.j;
import com.iqoption.util.v;
import com.iqoption.util.w;
import com.iqoption.x.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: ClosedDealsDialog */
public final class b extends g {
    private c cHC;
    private eq cHD;
    private d cHE;
    private int cHF;
    private int cHG;
    private boolean cHH;
    private boolean cHI;
    private InstrumentType instrumentType;

    /* compiled from: ClosedDealsDialog */
    private static final class a extends com.iqoption.system.c.b<b, List<? extends c>> {
        a(b bVar) {
            super(bVar);
        }

        /* renamed from: a */
        public void v(@NonNull b bVar, @Nullable List<? extends c> list) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$b$a$4Hdi-cuSAw9upFBHKPi8-XbjeuA(bVar, list));
        }

        /* renamed from: b */
        public void c(@NonNull b bVar, Throwable th) {
            com.iqoption.core.c.a.biN.execute(new -$$Lambda$b$a$uYwOl48aF1yJQSKUI9yXzdelzqQ(bVar));
        }

        private static /* synthetic */ void c(b bVar) {
            if (bVar.isAdded()) {
                bVar.onClose();
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public boolean atF() {
        return false;
    }

    public String getEventName() {
        return "closed-positions_open-closed-deal";
    }

    public static void a(FragmentManager fragmentManager, InstrumentType instrumentType, long[] jArr) {
        a(fragmentManager, (int) R.id.other_fragment, new -$$Lambda$b$LY3PEcRpkSOYoPKuYGPEW4yd9Jg(instrumentType, jArr));
    }

    public static void a(FragmentManager fragmentManager, InstrumentType instrumentType, String str) {
        a(fragmentManager, (int) R.id.other_fragment, new -$$Lambda$b$T041xs8jPO655geYMaZy6RX6H3c(instrumentType, str));
    }

    public static void a(FragmentManager fragmentManager, InstrumentType instrumentType, ArrayList<? extends c> arrayList) {
        a(fragmentManager, (int) R.id.other_fragment, new -$$Lambda$b$Y0DX9ZxBsZa5OkJYvkarjcBRckg(instrumentType, arrayList));
    }

    private static void a(FragmentManager fragmentManager, @IdRes int i, n<b> nVar) {
        String str = "ClosedDealsDialog";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(i, (Fragment) nVar.get(), str).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(str).commitAllowingStateLoss();
        }
    }

    public static b a(InstrumentType instrumentType, long[] jArr) {
        return I(new e().a("arg.instrumentType", (Serializable) instrumentType).a("arg.ids", jArr).toBundle());
    }

    public static b c(InstrumentType instrumentType, String str) {
        return I(new e().a("arg.instrumentType", (Serializable) instrumentType).aF("arg.json", str).toBundle());
    }

    public static b a(InstrumentType instrumentType, ArrayList<? extends c> arrayList) {
        return I(new e().a("arg.instrumentType", (Serializable) instrumentType).a("arg.options", (ArrayList) arrayList).toBundle());
    }

    private static b I(Bundle bundle) {
        b bVar = new b();
        bVar.setArguments(bundle);
        return bVar;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.cHD = eq.g(layoutInflater, viewGroup, false);
        return this.cHD.getRoot();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.cHF = fA(R.dimen.dp48);
        atE();
        Bundle arguments = getArguments();
        this.instrumentType = (InstrumentType) arguments.getSerializable("arg.instrumentType");
        if (this.instrumentType != null) {
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("arg.options");
            if (com.iqoption.util.g.isEmpty(parcelableArrayList)) {
                String string = arguments.getString("arg.json");
                if (string != null) {
                    if (string.isEmpty()) {
                        onClose();
                    } else {
                        e(string, this.instrumentType);
                    }
                    return;
                }
                long[] longArray = arguments.getLongArray("arg.ids");
                if (longArray != null) {
                    if (longArray.length != 0) {
                        switch (this.instrumentType) {
                            case TURBO_INSTRUMENT:
                            case BINARY_INSTRUMENT:
                                b(longArray);
                                break;
                            case MULTI_INSTRUMENT:
                            case DIGITAL_INSTRUMENT:
                            case CFD_INSTRUMENT:
                            case FOREX_INSTRUMENT:
                            case CRYPTO_INSTRUMENT:
                            case FX_INSTRUMENT:
                                a(longArray, this.instrumentType);
                                break;
                            default:
                                onClose();
                                break;
                        }
                    }
                    onClose();
                } else {
                    onClose();
                }
                return;
            }
            aK(parcelableArrayList);
        }
    }

    /* Access modifiers changed, original: protected */
    public void atD() {
        super.atD();
        if (isAdded()) {
            this.cHH = true;
            d dVar = this.cHE;
            if (dVar != null && this.cHI) {
                dVar.show();
            }
        }
    }

    private void atE() {
        this.cHD.bYq.setOnClickListener(new com.iqoption.core.ext.g() {
            public void M(View view) {
                b.this.onBackPressed();
                k.a(b.this.instrumentType);
            }
        });
        this.cHD.bZR.a(new -$$Lambda$b$3EN68IMgiJWhb9xiebEsVBk4Oo0(this));
    }

    /* Access modifiers changed, original: 0000 */
    public void aJ(List<? extends c> list) {
        String b;
        double d = 0.0d;
        double d2 = d;
        for (c cVar : list) {
            d2 += cVar.getWinAmount() - cVar.getCloseInvestSum();
            d += cVar.getWinAmount();
        }
        String DO = com.iqoption.app.b.DG().DO();
        if (d < 0.0d) {
            b = j.b(DO, Double.valueOf(d));
        } else {
            b = j.d(DO, Double.valueOf(d));
        }
        this.cHD.alH.setText(getString(R.string.trade_result, b));
        b = ")";
        TextView textView;
        StringBuilder stringBuilder;
        if (d2 > 0.0d) {
            textView = this.cHD.cab;
            stringBuilder = new StringBuilder();
            stringBuilder.append(" (+");
            stringBuilder.append(j.d(DO, Double.valueOf(d2)));
            stringBuilder.append(b);
            textView.setText(stringBuilder.toString());
            this.cHD.cab.setTextColor(ContextCompat.getColor(getContext(), R.color.green));
        } else if (d2 < 0.0d) {
            textView = this.cHD.cab;
            stringBuilder = new StringBuilder();
            stringBuilder.append(" (-");
            stringBuilder.append(j.d(DO, Double.valueOf(Math.abs(d2))));
            stringBuilder.append(b);
            textView.setText(stringBuilder.toString());
            this.cHD.cab.setTextColor(ContextCompat.getColor(getContext(), R.color.red));
        } else {
            this.cHD.cab.setText(null);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void g(@Nullable final Runnable runnable) {
        LayoutInflater from = LayoutInflater.from(getContext());
        this.cHD.bZY.addView(this.cHC.b(from, this.cHD.bZY));
        this.cHD.bZZ.addView(this.cHC.c(from, this.cHD.bZZ));
        View a = this.cHC.a(from, this.cHD.bZU, new com.iqoption.core.ext.g() {
            public void M(View view) {
                b.this.onBackPressed();
            }
        });
        if (a != null) {
            this.cHD.bZU.addView(a);
        }
        if (atF()) {
            this.cHE = this.cHC.d(from, this.cHD.bZW);
        }
        if (this.cHE != null) {
            this.cHD.bZW.addView(this.cHE, 0);
            this.cHG = this.cHE.getPaddingBottom() - this.cHE.getPaddingTop();
        }
        a(this.cHD.bZY, this.cHD.bZT, this.cHF, 0);
        a(this.cHD.bZW, this.cHD.bZS, -this.cHF, this.cHG);
        this.cHD.aIq.setAdapter(this.cHC.atC());
        this.cHD.aIq.setLayoutManager(new LinearLayoutManager(getContext()));
        this.cHD.aIq.addItemDecoration(new com.iqoption.core.ui.widget.e(fA(R.dimen.dp8)));
        this.cHD.aIq.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
            public boolean onPreDraw() {
                b.this.cHD.aIq.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = b.this.cHD.aIq.getChildCount();
                int itemCount = b.this.cHD.aIq.getAdapter().getItemCount();
                boolean z = true;
                if (childCount == itemCount) {
                    childCount = b.this.cHD.aIq.getHeight();
                    itemCount = b.this.cHD.aIq.getPaddingBottom();
                    int bottom = b.this.cHD.aIq.getChildAt(b.this.cHD.aIq.getChildCount() - 1).getBottom();
                    b bVar = b.this;
                    if (childCount - bottom >= itemCount) {
                        z = false;
                    }
                    bVar.cU(z);
                } else {
                    b bVar2 = b.this;
                    if (childCount >= itemCount) {
                        z = false;
                    }
                    bVar2.cU(z);
                }
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
                return false;
            }
        });
    }

    /* Access modifiers changed, original: 0000 */
    public void h(@NonNull ImmutableList<Point> immutableList) {
        if (this.cHE != null) {
            com.iqoption.core.c.a.biL.execute(new -$$Lambda$b$UIUyjH8Df-F6LTD8GeD9CEzpX80(this, immutableList));
        }
    }

    private /* synthetic */ void i(ImmutableList immutableList) {
        this.cHC.a(immutableList, this.cHE.getGraphWidth(), this.cHE.getGraphHeight());
        com.iqoption.core.c.a.biN.execute(new -$$Lambda$b$W3hhQVqpz-eZN5Hr1-kpCUUrlSY(this));
    }

    private /* synthetic */ void atG() {
        this.cHC.a(this.cHE);
        this.cHI = true;
        if (this.cHH) {
            this.cHE.show();
            return;
        }
        this.cHE.setGraphProgress(0.0f);
        this.cHE.setDecorProgress(0.0f);
    }

    private static void a(View view, View view2, int i, int i2) {
        view.measure(MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight() - i2;
        if (measuredHeight != view2.getHeight()) {
            view2.getLayoutParams().height = measuredHeight + i;
            view2.requestLayout();
        }
    }

    private void cU(boolean z) {
        for (int i = 0; i < this.cHD.bZR.getChildCount(); i++) {
            com.google.android.material.appbar.AppBarLayout.b bVar = (com.google.android.material.appbar.AppBarLayout.b) this.cHD.bZR.getChildAt(i).getLayoutParams();
            int mF = bVar.mF();
            bVar.av(z ? mF | 1 : mF & -2);
        }
        this.cHD.bZR.requestLayout();
    }

    private static c a(Context context, List<? extends c> list) {
        if (list == null) {
            throw new NullPointerException("options is null");
        } else if (list.isEmpty()) {
            throw new IllegalArgumentException("options is empty");
        } else {
            c cVar = (c) list.get(0);
            switch (cVar.getInstrumentType()) {
                case TURBO_INSTRUMENT:
                case BINARY_INSTRUMENT:
                case DIGITAL_INSTRUMENT:
                case FX_INSTRUMENT:
                    return new e(context, ImmutableList.m(list));
                case MULTI_INSTRUMENT:
                    return new d(context, i.b((Iterable) list).a(new f()).sC());
                case CFD_INSTRUMENT:
                case FOREX_INSTRUMENT:
                case CRYPTO_INSTRUMENT:
                    return new a(context, i.b((Iterable) list).a(new f()).sC());
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("type: ");
                    stringBuilder.append(cVar.getInstrumentType());
                    stringBuilder.append(" is not supported");
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aK(List<? extends c> list) {
        this.cHC = a(getContext(), (List) list);
        aJ(list);
        g(new -$$Lambda$b$P8Zm2azO4F6GtvM-LXQF_b_PPg4(this, list));
    }

    private /* synthetic */ void aM(List list) {
        if (atF()) {
            this.cHD.getRoot().post(new -$$Lambda$b$3sgNXbFYFhjhUtJNgEBlimMGBTg(this, list));
        }
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:6:0x0043, code skipped:
            if (r1.getExpired() <= r2) goto L_0x0050;
     */
    /* JADX WARNING: Missing block: B:8:0x004c, code skipped:
            if (r10 <= r2) goto L_0x0050;
     */
    /* renamed from: aL */
    public void aN(java.util.List<? extends com.iqoption.mobbtech.connect.response.options.c> r20) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = com.iqoption.dialog.a.-$$Lambda$b$ffdy4uPnxfMqjU1wUb3SnnhQTvQ.INSTANCE;
        r2 = java.util.Collections.min(r1, r2);
        r4 = r2;
        r4 = (com.iqoption.mobbtech.connect.response.options.c) r4;
        r2 = com.iqoption.dialog.a.-$$Lambda$b$vJe2Wq-wcIcKAu5sHwAsTxVIsUE.INSTANCE;
        r1 = java.util.Collections.max(r1, r2);
        r1 = (com.iqoption.mobbtech.connect.response.options.c) r1;
        if (r4 == 0) goto L_0x008f;
    L_0x0017:
        if (r1 != 0) goto L_0x001b;
    L_0x0019:
        goto L_0x008f;
    L_0x001b:
        r2 = r0.cHD;
        r2 = r2.bZX;
        r2.show();
        r2 = com.iqoption.app.managers.l.HZ();
        r2 = r2.Ia();
        r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 / r5;
        r5 = r4.getCreated();
        r7 = r1.isSold();
        r8 = 1;
        r9 = 0;
        if (r7 == 0) goto L_0x0046;
    L_0x0039:
        r10 = r1.getClosed();
        r12 = r1.getExpired();
        r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1));
        if (r1 > 0) goto L_0x004f;
    L_0x0045:
        goto L_0x0050;
    L_0x0046:
        r10 = r1.getExpired();
        r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r1 > 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0050;
    L_0x004f:
        r8 = 0;
    L_0x0050:
        r11 = r10;
        r10 = r8;
        r7 = r11 - r5;
        r13 = 4591870180066957722; // 0x3fb999999999999a float:-1.5881868E-23 double:0.1;
        r7 = (double) r7;
        java.lang.Double.isNaN(r7);
        r7 = r7 * r13;
        r7 = (long) r7;
        r5 = r5 - r7;
        r1 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1));
        if (r1 > 0) goto L_0x0067;
    L_0x0065:
        r7 = r11;
        goto L_0x006b;
    L_0x0067:
        r7 = 1;
        r2 = r2 - r7;
        r7 = r2;
    L_0x006b:
        r9 = r0.t(r5, r7);
        r13 = new com.iqoption.dialog.a.-$$Lambda$b$fzIOJx9gPT9Va0v5jie5j22u1nk;
        r3 = r13;
        r3.<init>(r4, r5, r7, r9, r10, r11);
        r14 = com.google.common.base.Predicates.pZ();
        r15 = com.iqoption.core.c.a.biM;
        r16 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r17 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r18 = "ClosedDealsDialog";
        r1 = com.iqoption.util.v.a(r13, r14, r15, r16, r17, r18);
        r2 = com.iqoption.dialog.a.-$$Lambda$b$HmjME1kLC_0pu0pyyOSCnoq2yyc.INSTANCE;
        r3 = com.iqoption.dialog.a.-$$Lambda$b$Y4E-9GH8OGLvBA9TydpuTR-mwf8.INSTANCE;
        r4 = com.iqoption.core.c.a.biN;
        com.iqoption.util.v.a(r1, r0, r2, r3, r4);
    L_0x008f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.dialog.a.b.aN(java.util.List):void");
    }

    private int t(long j, long j2) {
        int[] iArr = new int[]{1, 5, 10, 15, 30, 60, 120, 300, 600, ChartTimeInterval.CANDLE_15m, ChartTimeInterval.CANDLE_30m, ChartTimeInterval.CANDLE_1H, ChartTimeInterval.CANDLE_2H, ChartTimeInterval.CANDLE_4H, ChartTimeInterval.CANDLE_8H, ChartTimeInterval.CANDLE_12H, ChartTimeInterval.CANDLE_1D, ChartTimeInterval.CANDLE_1W, ChartTimeInterval.CANDLE_1M};
        float f = (float) (j2 - j);
        float graphWidth = f / this.cHE.getGraphWidth();
        int i = 0;
        int i2 = 0;
        while (i < iArr.length && ((float) iArr[i]) <= graphWidth) {
            i2 = i;
            i++;
        }
        while (f / ((float) iArr[i2]) > 1000.0f && i2 < iArr.length - 1) {
            i2++;
        }
        return iArr[i2];
    }

    private void e(String str, InstrumentType instrumentType) {
        t hR = hR(str);
        int i = AnonymousClass4.$SwitchMap$com$iqoption$core$data$model$InstrumentType[instrumentType.ordinal()];
        if (i == 1 || i == 2) {
            v.b(v.a(hR, -$$Lambda$b$AogbT3oTYm5MNufU5unbOiMqSW0.INSTANCE), new a(this));
        } else {
            v.b(v.a(hR, new -$$Lambda$b$hRKMulARzFTTHSKGmD1R2FLwmEY(instrumentType)), new a(this));
        }
    }

    private void b(long[] jArr) {
        v.b(new g(jArr).atH(), new a(this));
    }

    private void a(long[] jArr, @NonNull InstrumentType instrumentType) {
        v.b(new h(jArr, instrumentType).atH(), new a(this));
    }

    private static t<long[]> hR(String str) {
        return com.iqoption.core.c.a.biL.a(new -$$Lambda$b$3VzlkjplIBp24CK4L9HQN-7ZiuE(str), 0, TimeUnit.MILLISECONDS);
    }

    private static /* synthetic */ long[] hS(String str) {
        JsonArray jsonArray = (JsonArray) w.aWL().fromJson(str, JsonArray.class);
        long[] jArr = new long[jsonArray.size()];
        for (int i = 0; i < jArr.length; i++) {
            jArr[i] = jsonArray.get(i).getAsJsonObject().get("id").getAsLong();
        }
        return jArr;
    }
}
