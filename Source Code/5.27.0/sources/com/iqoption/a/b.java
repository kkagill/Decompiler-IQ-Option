package com.iqoption.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.iqoption.analytics.EventManager;
import com.iqoption.app.managers.l;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.rx.i;
import com.iqoption.core.util.TimeUtil;
import com.iqoption.core.util.af;
import com.iqoption.core.util.u;
import com.iqoption.dto.Event;
import com.iqoption.fragment.TabType;
import com.iqoption.fragment.q;
import com.iqoption.fragment.rightpanel.j;
import com.iqoption.util.ab;
import com.iqoption.view.FavoriteVectorSwitchView;
import com.iqoption.x.R;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: AssetAdapter */
public class b extends Adapter implements Filterable {
    private final Ordering<a> akA = this.akj.compound(this.akk).compound(this.aki.reverse());
    private int akB = 1;
    private final com.iqoption.a.b.a akC;
    private com.iqoption.fragment.b akD;
    private final f akE = new f() {
        public void onItemClick(View view, int i) {
            if (i >= 0 && i < b.this.akH.size() && b.this.akH.size() > 0) {
                a aVar = (a) b.this.akH.get(i);
                EventManager.BS().a(Event.Builder(Event.CATEGORY_BUTTON_PRESSED, "traderoom_add-favorite-asset").setValue(Double.valueOf(aVar.akY.booleanValue() ? 0.0d : 1.0d)).setParameters(u.anp().o("active_id", Integer.valueOf(aVar.activeId)).o("instrument_type", aVar.instrumentType).anr()).build());
            }
        }
    };
    private Set<Integer> akF;
    private ArrayList<a> akG = new ArrayList();
    private ArrayList<a> akH = new ArrayList();
    private String akI = "";
    private final b akJ = new b(this, null);
    private final Ordering<a> akb = new Ordering<a>() {
        /* renamed from: a */
        public int compare(a aVar, a aVar2) {
            double d = 0.0d;
            double intValue = aVar2.akX == null ? 0.0d : (double) aVar2.akX.intValue();
            if (aVar.akX != null) {
                d = (double) aVar.akX.intValue();
            }
            return Double.compare(intValue, d);
        }
    };
    private final Ordering<a> akc = new Ordering<a>() {
        /* renamed from: a */
        public int compare(a aVar, a aVar2) {
            long j = 0;
            long longValue = aVar2.akW == null ? 0 : aVar2.akW.longValue();
            if (aVar.akW != null) {
                j = aVar.akW.longValue();
            }
            return Long.compare(longValue, j);
        }
    };
    private final Ordering<a> akd = new Ordering<a>() {
        /* renamed from: a */
        public int compare(a aVar, a aVar2) {
            double d = 0.0d;
            double intValue = aVar2.leverage == null ? 0.0d : (double) aVar2.leverage.intValue();
            if (aVar.leverage != null) {
                d = (double) aVar.leverage.intValue();
            }
            return Double.compare(intValue, d);
        }
    };
    private final Ordering<a> ake = new Ordering<a>() {
        /* renamed from: a */
        public int compare(a aVar, a aVar2) {
            double d = 0.0d;
            double doubleValue = aVar2.akV == null ? 0.0d : aVar2.akV.doubleValue();
            if (aVar.akV != null) {
                d = aVar.akV.doubleValue();
            }
            return Double.compare(doubleValue, d);
        }
    };
    private final Ordering<a> akf = new Ordering<a>() {
        /* renamed from: a */
        public int compare(a aVar, a aVar2) {
            double d = Double.MAX_VALUE;
            double doubleValue = aVar2.akT == null ? Double.MAX_VALUE : aVar2.akT.doubleValue();
            if (aVar.akT != null) {
                d = aVar.akT.doubleValue();
            }
            return Double.compare(doubleValue, d);
        }
    };
    private final Ordering<a> akg = new Ordering<a>() {
        /* renamed from: a */
        public int compare(a aVar, a aVar2) {
            double d = 0.0d;
            double doubleValue = aVar2.akU == null ? 0.0d : aVar2.akU.doubleValue();
            if (aVar.akU != null) {
                d = aVar.akU.doubleValue();
            }
            return Double.compare(doubleValue, d);
        }
    };
    private final Ordering<a> akh = new Ordering<a>() {
        /* renamed from: a */
        public int compare(a aVar, a aVar2) {
            return com.google.common.primitives.c.compare(aVar.commission, aVar2.commission);
        }
    };
    private final Ordering<a> aki = new Ordering<a>() {
        /* renamed from: a */
        public int compare(a aVar, a aVar2) {
            return String.CASE_INSENSITIVE_ORDER.compare(aVar.akO, aVar2.akO);
        }
    };
    private final Ordering<a> akj = new Ordering<a>() {
        /* renamed from: a */
        public int compare(a aVar, a aVar2) {
            return com.google.common.primitives.a.compare(aVar2.akY.booleanValue(), aVar.akY.booleanValue());
        }
    };
    private final Ordering<a> akk = new Ordering<a>() {
        /* renamed from: a */
        public int compare(a aVar, a aVar2) {
            return com.google.common.primitives.a.compare(aVar2.isEnabled, aVar.isEnabled);
        }
    };
    private final Ordering<a> akl = this.akj.compound(this.akk).compound(this.akb);
    private final Ordering<a> akm = this.akj.compound(this.akk).compound(this.akb.reverse());
    private final Ordering<a> akn = this.akj.compound(this.akk).compound(this.akc);
    private final Ordering<a> ako = this.akj.compound(this.akk).compound(this.akc.reverse());
    private final Ordering<a> akp = this.akj.compound(this.akk).compound(this.akd);
    private final Ordering<a> akq = this.akj.compound(this.akk).compound(this.akd.reverse());
    private final Ordering<a> akr = this.akj.compound(this.akk).compound(this.ake);
    private final Ordering<a> aks = this.akj.compound(this.akk).compound(this.ake.reverse());
    private final Ordering<a> akt = this.akj.compound(this.akk).compound(this.akg);
    private final Ordering<a> aku = this.akj.compound(this.akk).compound(this.akg.reverse());
    private final Ordering<a> akv = this.akj.compound(this.akk).compound(this.akf);
    private final Ordering<a> akw = this.akj.compound(this.akk).compound(this.akf.reverse());
    private final Ordering<a> akx = this.akj.compound(this.akk).compound(this.akh);
    private final Ordering<a> aky = this.akj.compound(this.akk).compound(this.akh.reverse());
    private final Ordering<a> akz = this.akj.compound(this.akk).compound(this.aki);
    private io.reactivex.disposables.b disposable;

    /* compiled from: AssetAdapter */
    /* renamed from: com.iqoption.a.b$5 */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$iqoption$core$data$model$InstrumentType = new int[InstrumentType.values().length];
        static final /* synthetic */ int[] akM = new int[TabType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0070 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00b0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00d4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00bc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a4 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|(3:47|48|50)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|(3:47|48|50)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|(3:47|48|50)) */
        static {
            /*
            r0 = com.iqoption.core.data.model.InstrumentType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$iqoption$core$data$model$InstrumentType = r0;
            r0 = 1;
            r1 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.iqoption.core.data.model.InstrumentType.CFD_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.iqoption.core.data.model.InstrumentType.FOREX_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = com.iqoption.core.data.model.InstrumentType.CRYPTO_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = com.iqoption.core.data.model.InstrumentType.FX_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = 5;
            r5 = $SwitchMap$com$iqoption$core$data$model$InstrumentType;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = com.iqoption.core.data.model.InstrumentType.DIGITAL_INSTRUMENT;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5[r6] = r4;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r5 = com.iqoption.fragment.TabType.values();
            r5 = r5.length;
            r5 = new int[r5];
            akM = r5;
            r5 = akM;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r6 = com.iqoption.fragment.TabType.ACTIVE_TAB;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0053 }
            r5[r6] = r0;	 Catch:{ NoSuchFieldError -> 0x0053 }
        L_0x0053:
            r5 = com.iqoption.core.data.model.ActiveType.values();
            r5 = r5.length;
            r5 = new int[r5];
            akL = r5;
            r5 = akL;	 Catch:{ NoSuchFieldError -> 0x0066 }
            r6 = com.iqoption.core.data.model.ActiveType.TURBO_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x0066 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0066 }
            r5[r6] = r0;	 Catch:{ NoSuchFieldError -> 0x0066 }
        L_0x0066:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x0070 }
            r5 = com.iqoption.core.data.model.ActiveType.BINARY_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x0070 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0070 }
            r0[r5] = r1;	 Catch:{ NoSuchFieldError -> 0x0070 }
        L_0x0070:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x007a }
            r1 = com.iqoption.core.data.model.ActiveType.INTRADAY_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x007a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x0084 }
            r1 = com.iqoption.core.data.model.ActiveType.BOND_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x0084 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0084 }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x0084 }
        L_0x0084:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x008e }
            r1 = com.iqoption.core.data.model.ActiveType.INDEX_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x008e }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x008e }
            r0[r1] = r4;	 Catch:{ NoSuchFieldError -> 0x008e }
        L_0x008e:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x0099 }
            r1 = com.iqoption.core.data.model.ActiveType.COMMODITY_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x0099 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0099 }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0099 }
        L_0x0099:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x00a4 }
            r1 = com.iqoption.core.data.model.ActiveType.ETF_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x00a4 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00a4 }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00a4 }
        L_0x00a4:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x00b0 }
            r1 = com.iqoption.core.data.model.ActiveType.STOCK_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x00b0 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b0 }
            r2 = 8;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00b0 }
        L_0x00b0:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x00bc }
            r1 = com.iqoption.core.data.model.ActiveType.FOREX_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x00bc }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00bc }
            r2 = 9;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00bc }
        L_0x00bc:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x00c8 }
            r1 = com.iqoption.core.data.model.ActiveType.CRYPTO_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x00c8 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00c8 }
            r2 = 10;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00c8 }
        L_0x00c8:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x00d4 }
            r1 = com.iqoption.core.data.model.ActiveType.FX_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x00d4 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00d4 }
            r2 = 11;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00d4 }
        L_0x00d4:
            r0 = akL;	 Catch:{ NoSuchFieldError -> 0x00e0 }
            r1 = com.iqoption.core.data.model.ActiveType.DIGITAL_ACTIVE;	 Catch:{ NoSuchFieldError -> 0x00e0 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00e0 }
            r2 = 12;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00e0 }
        L_0x00e0:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.a.b$AnonymousClass5.<clinit>():void");
        }
    }

    /* compiled from: AssetAdapter */
    public static class a {
        public final int activeId;
        public final long akN;
        public final String akO;
        public final long akP;
        public final int akQ = (100 - this.commission);
        public final int akR;
        public final Double akS;
        public final Double akT;
        public final Double akU;
        public final Double akV;
        public final Long akW;
        public final Integer akX;
        public final Boolean akY;
        public final int commission;
        public final String image;
        public final InstrumentType instrumentType;
        public final boolean isEnabled;
        public final Integer leverage;
        public final String name;

        a(com.iqoption.core.microservices.tradingengine.response.active.a aVar, long j, boolean z, Set<Integer> set) {
            this.activeId = aVar.getActiveId();
            this.instrumentType = aVar.getInstrumentType();
            this.akN = j;
            this.image = aVar.getImage();
            this.name = com.iqoption.core.microservices.tradingengine.response.active.d.B(aVar);
            this.akO = com.iqoption.util.c.a.al(aVar);
            this.isEnabled = aVar.aX(j);
            this.akP = aVar.aY(j);
            this.commission = aVar.ahR();
            this.akY = Boolean.valueOf(set.contains(Integer.valueOf(this.activeId)));
            this.akR = aVar.getPrecision();
            com.iqoption.app.helpers.a Gs = com.iqoption.app.helpers.a.Gs();
            com.iqoption.core.microservices.tradingengine.response.b.a a = Gs.a(this.instrumentType, this.activeId);
            if (a != null) {
                int[] a2 = j.a(a.cB(z), this.instrumentType);
                this.leverage = a2.length == 0 ? null : Integer.valueOf(com.google.common.primitives.c.d(a2));
            } else {
                this.leverage = null;
            }
            com.iqoption.core.microservices.f.a.a.a a3 = Gs.a(this.activeId, this.instrumentType);
            if (a3 != null) {
                this.akS = com.iqoption.core.microservices.f.a.a.a.a(a3.ahz());
                int i = AnonymousClass5.$SwitchMap$com$iqoption$core$data$model$InstrumentType[this.instrumentType.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    Double a4 = com.iqoption.core.microservices.f.a.a.a.a(a3.ahw());
                    if (a4 != null) {
                        Double d = this.akS;
                        if (d != null) {
                            if (this.leverage == null) {
                                this.akT = ab.e(d, a4);
                            } else {
                                this.akT = Double.valueOf(com.iqoption.asset.c.a.a(this.akR, a4.doubleValue(), this.akS.doubleValue(), com.iqoption.asset.c.b.axz.b(this.activeId, this.instrumentType, this.leverage.intValue()).getValue()));
                            }
                            this.akU = com.iqoption.core.microservices.f.a.a.a.a(a3.ahy());
                            this.akV = com.iqoption.core.microservices.f.a.a.a.a(a3.ahA());
                            this.akW = null;
                            this.akX = null;
                            return;
                        }
                    }
                    this.akT = null;
                    this.akU = com.iqoption.core.microservices.f.a.a.a.a(a3.ahy());
                    this.akV = com.iqoption.core.microservices.f.a.a.a.a(a3.ahA());
                    this.akW = null;
                    this.akX = null;
                    return;
                } else if (i == 4) {
                    Long a5 = com.iqoption.core.microservices.f.a.a.a.a(a3);
                    this.akW = a5 != null ? Long.valueOf((a5.longValue() - this.akN) / 1000) : null;
                    this.akT = null;
                    this.akV = null;
                    this.akU = com.iqoption.core.microservices.f.a.a.a.a(a3.ahx());
                    this.akX = null;
                    return;
                } else if (i != 5) {
                    this.akT = null;
                    this.akV = null;
                    this.akU = null;
                    this.akW = null;
                    this.akX = null;
                    return;
                } else {
                    this.akT = null;
                    this.akV = null;
                    this.akW = null;
                    this.akU = com.iqoption.core.microservices.f.a.a.a.a(a3.ahx());
                    this.akX = com.iqoption.core.microservices.f.a.a.a.b(a3);
                    return;
                }
            }
            this.akS = null;
            this.akT = null;
            this.akU = null;
            this.akV = null;
            this.akW = null;
            this.akX = null;
        }
    }

    /* compiled from: AssetAdapter */
    private class b extends Filter {
        /* synthetic */ b(b bVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        private b() {
        }

        /* Access modifiers changed, original: protected */
        public FilterResults performFiltering(CharSequence charSequence) {
            try {
                Thread.sleep(150);
            } catch (InterruptedException unused) {
            }
            FilterResults filterResults = new FilterResults();
            ArrayList arrayList = new ArrayList();
            if (charSequence.length() == 0) {
                arrayList.addAll(b.this.akG);
            } else {
                String trim = charSequence.toString().toLowerCase().trim();
                Iterator it = b.this.akG.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    if (aVar.akO.toLowerCase().trim().contains(trim)) {
                        arrayList.add(aVar);
                    }
                }
            }
            filterResults.values = b.this.e(arrayList);
            filterResults.count = arrayList.size();
            return filterResults;
        }

        /* Access modifiers changed, original: protected */
        public void publishResults(CharSequence charSequence, FilterResults filterResults) {
            b.this.akH = (ArrayList) filterResults.values;
            b.this.notifyDataSetChanged();
        }
    }

    /* compiled from: AssetAdapter */
    public interface f {
        void onItemClick(View view, int i);
    }

    /* compiled from: AssetAdapter */
    private static class c extends ViewHolder implements OnClickListener {
        f akE;
        ImageView akZ;
        TextView ala;
        TextView alb;
        View alc;
        View ald;
        TextView ale;
        View alf;
        View alg;
        FavoriteVectorSwitchView alh;
        com.iqoption.a.b.a listener;

        public void a(a aVar) {
        }

        c(View view, com.iqoption.a.b.a aVar, f fVar) {
            super(view);
            this.listener = aVar;
            this.akE = fVar;
            this.alg = view.findViewById(R.id.itemView);
            this.akZ = (ImageView) view.findViewById(R.id.activeIcon);
            this.ala = (TextView) view.findViewById(R.id.activeTitle);
            this.alb = (TextView) view.findViewById(R.id.activeQuote);
            this.alc = view.findViewById(R.id.closedConteiner);
            this.ald = view.findViewById(R.id.paramsContainer);
            this.ale = (TextView) view.findViewById(R.id.timeValue);
            this.alf = view.findViewById(R.id.timeIcon);
            view.findViewById(R.id.infoBtn).setOnClickListener(this);
            this.alh = (FavoriteVectorSwitchView) view.findViewById(R.id.switcherFavorite);
            this.alh.setOnClickListener(this);
            this.alg.setOnClickListener(this);
        }

        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            if (view.getId() != this.alh.getId()) {
                com.iqoption.a.b.a aVar = this.listener;
                if (aVar != null) {
                    aVar.onItemClick(view, adapterPosition);
                }
            } else if (this.akE != null) {
                FavoriteVectorSwitchView favoriteVectorSwitchView = this.alh;
                favoriteVectorSwitchView.setSwitched(favoriteVectorSwitchView.aXF() ^ 1);
                favoriteVectorSwitchView = this.alh;
                favoriteVectorSwitchView.setSelected(favoriteVectorSwitchView.aXF());
                this.akE.onItemClick(view, adapterPosition);
            }
        }
    }

    /* compiled from: AssetAdapter */
    private static class d extends c implements OnClickListener {
        TextView ali;
        TextView alj;

        d(View view, com.iqoption.a.b.a aVar, f fVar) {
            super(view, aVar, fVar);
            this.ali = (TextView) view.findViewById(R.id.activeDiff);
            this.alj = (TextView) view.findViewById(R.id.activeSpotProfit);
        }

        public void a(a aVar) {
            if (aVar.akU != null) {
                this.ali.setText(af.a(aVar.akU.doubleValue(), com.iqoption.util.j.b(aVar.akU), 2, true));
                this.ali.setTextColor(com.iqoption.util.j.a(this.itemView.getContext(), aVar.akU));
            } else {
                this.ali.setText(null);
            }
            if (aVar.akX != null) {
                this.alj.setText(af.i(aVar.akX));
            } else {
                this.alj.setText(null);
            }
        }
    }

    /* compiled from: AssetAdapter */
    private static class e extends c implements OnClickListener {
        TextView ali;
        TextView alk;

        e(View view, com.iqoption.a.b.a aVar, f fVar) {
            super(view, aVar, fVar);
            this.ali = (TextView) view.findViewById(R.id.activeDiff);
            this.alk = (TextView) view.findViewById(R.id.activeExpiration);
        }

        public void a(a aVar) {
            Context context = this.itemView.getContext();
            if (aVar.akU != null) {
                this.ali.setText(af.a(aVar.akU.doubleValue(), com.iqoption.util.j.b(aVar.akU), 2, true));
                this.ali.setTextColor(com.iqoption.util.j.a(this.itemView.getContext(), aVar.akU));
            } else {
                this.ali.setText(null);
            }
            if (aVar.akW == null || aVar.akW.longValue() <= 0) {
                this.alk.setText(null);
                return;
            }
            this.alk.setText(context.getString(R.string.in_time_n1, new Object[]{TimeUtil.formatElapsedTime(aVar.akW.longValue())}));
        }
    }

    /* compiled from: AssetAdapter */
    private static class g extends c implements OnClickListener {
        TextView ali;
        TextView alm;
        TextView aln;

        g(View view, com.iqoption.a.b.a aVar, f fVar) {
            super(view, aVar, fVar);
            this.alm = (TextView) view.findViewById(R.id.activeSpread);
            this.ali = (TextView) view.findViewById(R.id.activeDiff);
            this.aln = (TextView) view.findViewById(R.id.activeLeverage);
        }

        public void a(a aVar) {
            if (aVar.akT != null) {
                this.alm.setText(String.format(Locale.US, "%s%%", new Object[]{com.iqoption.core.util.j.fr(3).format(aVar.akT)}));
            } else {
                this.alm.setText(null);
            }
            if (aVar.akU != null) {
                this.ali.setText(af.a(aVar.akU.doubleValue(), com.iqoption.util.j.b(aVar.akU), 2, true));
                this.ali.setTextColor(com.iqoption.util.j.a(this.itemView.getContext(), aVar.akU));
            } else {
                this.ali.setText(null);
            }
            if (aVar.leverage != null) {
                this.aln.setText(af.ft(aVar.leverage.intValue()));
            } else {
                this.aln.setText(null);
            }
        }
    }

    /* compiled from: AssetAdapter */
    private static class h extends c implements OnClickListener {
        TextView alo;

        h(View view, com.iqoption.a.b.a aVar, f fVar) {
            super(view, aVar, fVar);
            this.alo = (TextView) view.findViewById(R.id.activeYield);
        }

        public void a(a aVar) {
            this.alo.setText(af.s((double) aVar.akQ));
        }
    }

    private static /* synthetic */ void n(Throwable th) {
    }

    public void onStart() {
        this.disposable = com.iqoption.asset.repository.a.aye.JZ().d(i.aki()).c(i.akj()).a(new -$$Lambda$b$Y1084uaOcfNsBGdxGdAfi3GFrg8(this), -$$Lambda$b$EWU37BnfXoeslFxVgSYnf6VTDFQ.INSTANCE);
    }

    public void onStop() {
        io.reactivex.disposables.b bVar = this.disposable;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public b(com.iqoption.a.b.a aVar) {
        this.akC = aVar;
        this.akF = Collections.emptySet();
    }

    private List<a> u(Collection<com.iqoption.core.microservices.tradingengine.response.active.a> collection) {
        long Ib = l.HZ().Ib();
        boolean Er = com.iqoption.app.b.DG().Er();
        ArrayList arrayList = new ArrayList();
        for (com.iqoption.core.microservices.tradingengine.response.active.a aVar : collection) {
            arrayList.add(new a(aVar, Ib, Er, this.akF));
        }
        return arrayList;
    }

    private ImmutableList<com.iqoption.core.microservices.tradingengine.response.active.a> a(com.iqoption.fragment.b bVar) {
        if (AnonymousClass5.akM[bVar.axq().ordinal()] != 1) {
            return ImmutableList.sQ();
        }
        ActiveType activeType = ((q) bVar).getActiveType();
        switch (activeType) {
            case TURBO_ACTIVE:
            case BINARY_ACTIVE:
                return com.iqoption.app.helpers.a.Gs().bw(false);
            case INTRADAY_ACTIVE:
            case BOND_ACTIVE:
            case INDEX_ACTIVE:
            case COMMODITY_ACTIVE:
            case ETF_ACTIVE:
            case STOCK_ACTIVE:
                return com.iqoption.app.helpers.a.Gs().a(activeType, false);
            default:
                return com.iqoption.app.helpers.a.Gs().a(activeType.toInstrumentType(), false);
        }
    }

    public void b(com.iqoption.fragment.b bVar) {
        if (bVar.axq() != TabType.MORE_TAB) {
            this.akD = bVar;
            this.akG.clear();
            this.akG.addAll(u(a(bVar)));
            this.akH.clear();
            notifyDataSetChanged();
            this.akJ.filter(this.akI);
        }
    }

    public void c(com.iqoption.fragment.b bVar) {
        if (bVar.axq() != TabType.MORE_TAB) {
            if (this.akD == null) {
                b(bVar);
            } else {
                this.akG.clear();
                this.akG.addAll(u(a(this.akD)));
                this.akJ.filter(this.akI);
            }
        }
    }

    public int Az() {
        return this.akB;
    }

    public void dm(int i) {
        h(i, true);
    }

    public void h(int i, boolean z) {
        this.akB = i;
        this.akH = e(this.akH);
        if (z) {
            notifyDataSetChanged();
        }
    }

    private ArrayList<a> e(ArrayList<a> arrayList) {
        Comparator comparator;
        switch (this.akB) {
            case 1:
                comparator = this.akz;
                break;
            case 2:
                comparator = this.akA;
                break;
            case 3:
                comparator = this.akx;
                break;
            case 4:
                comparator = this.aky;
                break;
            case 5:
                comparator = this.akt;
                break;
            case 6:
                comparator = this.aku;
                break;
            case 7:
                comparator = this.akv;
                break;
            case 8:
                comparator = this.akw;
                break;
            case 9:
                comparator = this.akr;
                break;
            case 10:
                comparator = this.aks;
                break;
            case 11:
                comparator = this.akp;
                break;
            case 12:
                comparator = this.akq;
                break;
            case 13:
                comparator = this.akn;
                break;
            case 14:
                comparator = this.ako;
                break;
            case 15:
                comparator = this.akl;
                break;
            case 16:
                comparator = this.akm;
                break;
            default:
                comparator = null;
                break;
        }
        Collections.sort(arrayList, comparator);
        return arrayList;
    }

    public long getItemId(int i) {
        a dn = dn(i);
        if (dn == null) {
            return 0;
        }
        return (((long) com.google.common.base.f.hashCode(dn.instrumentType)) << 31) | ((long) dn.activeId);
    }

    public int getItemCount() {
        if (this.akH == null) {
            return 0;
        }
        return AA() ? this.akH.size() + 1 : this.akH.size();
    }

    public final int getItemViewType(int i) {
        if (AA() && i == this.akH.size()) {
            return 3;
        }
        if (AnonymousClass5.akM[this.akD.axq().ordinal()] == 1) {
            switch (((q) this.akD).getActiveType()) {
                case TURBO_ACTIVE:
                case BINARY_ACTIVE:
                    return 0;
                case INTRADAY_ACTIVE:
                case BOND_ACTIVE:
                case INDEX_ACTIVE:
                case COMMODITY_ACTIVE:
                case ETF_ACTIVE:
                case STOCK_ACTIVE:
                case FOREX_ACTIVE:
                case CRYPTO_ACTIVE:
                    return 1;
                case FX_ACTIVE:
                    return 4;
                case DIGITAL_ACTIVE:
                    return 5;
            }
        }
        return 2;
    }

    @Nullable
    public a dn(int i) {
        if (i >= this.akH.size()) {
            return null;
        }
        return (a) this.akH.get(i);
    }

    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new h(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.asset_item, viewGroup, false), this.akC, this.akE);
        }
        if (i == 1) {
            return new g(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spread_asset_item, viewGroup, false), this.akC, this.akE);
        }
        if (i == 3) {
            return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spread_leverage_notice, viewGroup, false)) {
            };
        }
        if (i == 4) {
            return new e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fx_asset_item, viewGroup, false), this.akC, this.akE);
        }
        if (i != 5) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.asset_item, viewGroup, false), this.akC, this.akE);
        }
        return new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.digital_asset_item, viewGroup, false), this.akC, this.akE);
    }

    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        if (!(AA() && i == this.akH.size()) && (viewHolder instanceof c)) {
            c cVar = (c) viewHolder;
            Context context = cVar.itemView.getContext();
            a dn = dn(i);
            if (dn != null) {
                if (!TextUtils.isEmpty(dn.image)) {
                    Picasso.with(context).load(dn.image).into(cVar.akZ);
                }
                cVar.ala.setText(dn.name);
                if (dn.akS != null) {
                    cVar.alb.setText(com.iqoption.core.util.j.fr(dn.akR).format(dn.akS));
                    cVar.alb.setVisibility(0);
                } else {
                    cVar.alb.setVisibility(8);
                }
                cVar.alh.setSelected(dn.akY.booleanValue());
                cVar.alh.setSwitched(dn.akY.booleanValue());
                if (dn.isEnabled) {
                    cVar.a(dn);
                    cVar.ald.setVisibility(0);
                    cVar.alc.setVisibility(8);
                    cVar.itemView.setAlpha(1.0f);
                } else {
                    if (dn.akP == Long.MAX_VALUE) {
                        cVar.ale.setVisibility(8);
                        cVar.alf.setVisibility(8);
                    } else {
                        cVar.ale.setText(TimeUtil.r(dn.akN, dn.akP));
                        cVar.ale.setVisibility(0);
                        cVar.alf.setVisibility(0);
                    }
                    cVar.ald.setVisibility(8);
                    cVar.alc.setVisibility(0);
                    cVar.itemView.setAlpha(0.7f);
                }
            }
        }
    }

    private boolean AA() {
        boolean z = false;
        if (this.akD == null || AnonymousClass5.akM[this.akD.axq().ordinal()] != 1) {
            return false;
        }
        int i = AnonymousClass5.$SwitchMap$com$iqoption$core$data$model$InstrumentType[((q) this.akD).getInstrumentType().ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            return false;
        }
        ArrayList arrayList = this.akH;
        if (!(arrayList == null || arrayList.isEmpty())) {
            z = true;
        }
        return z;
    }

    public void dd(String str) {
        this.akI = str;
        this.akJ.filter(this.akI);
    }

    public Filter getFilter() {
        return this.akJ;
    }
}
