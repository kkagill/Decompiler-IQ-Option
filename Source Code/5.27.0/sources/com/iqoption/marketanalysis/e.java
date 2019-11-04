package com.iqoption.marketanalysis;

import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.iqoption.core.d;
import com.iqoption.core.marketanalysis.MarketAnalysisTab;
import com.iqoption.core.marketanalysis.c;
import com.iqoption.core.marketanalysis.f;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0010\u001a\u00020\nJ\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, bng = {"Lcom/iqoption/marketanalysis/MarketAnalysisRouter;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "callbacks", "Lcom/iqoption/marketanalysis/MarketAnalysisCallbacks;", "(Landroidx/fragment/app/FragmentActivity;Lcom/iqoption/marketanalysis/MarketAnalysisCallbacks;)V", "viewModel", "Lcom/iqoption/core/marketanalysis/MarketAnalysisViewModel;", "onActivityResultMA", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onFinishMA", "openActive", "activeIdentifier", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveIdentifier;", "openExpand", "openFeedDetails", "feed", "Lcom/iqoption/core/marketanalysis/FeedDetailsIdentifier;", "openForexDetails", "event", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "retrieveDataFromIntent", "intent", "Companion", "app_optionXRelease"})
/* compiled from: MarketAnalysisRouter.kt */
public abstract class e {
    public static final a dFr = new a();
    private final f dFe;
    private final a dFq;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/marketanalysis/MarketAnalysisRouter$Companion;", "", "()V", "EXTRA_DETAIL_CALENDAR_EVENT", "", "EXTRA_SELECTED_TAB", "REQUEST_CODE_NEXT_SCREEN", "", "RESULT_CLICKED_ACTIVE", "RESULT_CLICKED_FEED_ITEM", "app_optionXRelease"})
    /* compiled from: MarketAnalysisRouter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: MarketAnalysisRouter.kt */
    /* renamed from: com.iqoption.marketanalysis.e$1 */
    static final class AnonymousClass1<T> implements Observer<Object> {
        final /* synthetic */ e dFs;

        AnonymousClass1(e eVar) {
            this.dFs = eVar;
        }

        public final void onChanged(Object obj) {
            this.dFs.aNO();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "feed", "Lcom/iqoption/core/marketanalysis/FeedDetailsIdentifier;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: MarketAnalysisRouter.kt */
    /* renamed from: com.iqoption.marketanalysis.e$2 */
    static final class AnonymousClass2<T> implements Observer<c> {
        final /* synthetic */ e dFs;

        AnonymousClass2(e eVar) {
            this.dFs = eVar;
        }

        /* renamed from: c */
        public final void onChanged(c cVar) {
            if (cVar != null) {
                this.dFs.b(cVar);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "event", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: MarketAnalysisRouter.kt */
    /* renamed from: com.iqoption.marketanalysis.e$3 */
    static final class AnonymousClass3<T> implements Observer<com.iqoption.core.microservices.b.a.a> {
        final /* synthetic */ e dFs;

        AnonymousClass3(e eVar) {
            this.dFs = eVar;
        }

        /* renamed from: i */
        public final void onChanged(com.iqoption.core.microservices.b.a.a aVar) {
            if (aVar != null) {
                this.dFs.h(aVar);
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "active", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveIdentifier;", "kotlin.jvm.PlatformType", "onChanged"})
    /* compiled from: MarketAnalysisRouter.kt */
    /* renamed from: com.iqoption.marketanalysis.e$4 */
    static final class AnonymousClass4<T> implements Observer<com.iqoption.core.microservices.tradingengine.response.active.f> {
        final /* synthetic */ e dFs;

        AnonymousClass4(e eVar) {
            this.dFs = eVar;
        }

        /* renamed from: c */
        public final void onChanged(com.iqoption.core.microservices.tradingengine.response.active.f fVar) {
            if (fVar != null) {
                this.dFs.a(fVar);
            }
        }
    }

    public e(FragmentActivity fragmentActivity, a aVar) {
        kotlin.jvm.internal.i.f(fragmentActivity, "activity");
        kotlin.jvm.internal.i.f(aVar, "callbacks");
        this.dFq = aVar;
        this.dFe = f.blw.k(fragmentActivity);
        Intent intent = fragmentActivity.getIntent();
        kotlin.jvm.internal.i.e(intent, "activity.intent");
        v(intent);
        LifecycleOwner lifecycleOwner = fragmentActivity;
        this.dFe.YX().observe(lifecycleOwner, new AnonymousClass1(this));
        this.dFe.YZ().observe(lifecycleOwner, new AnonymousClass2(this));
        this.dFe.Za().observe(lifecycleOwner, new AnonymousClass3(this));
        this.dFe.Zb().observe(lifecycleOwner, new AnonymousClass4(this));
    }

    public final void aNN() {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_SELECTED_TAB", (Serializable) this.dFe.YW().getValue());
        intent.putExtra("RESULT_CLICKED_FEED_ITEM", (Parcelable) this.dFe.YZ().getValue());
        intent.putExtra("RESULT_CLICKED_ACTIVE", (Parcelable) this.dFe.Zb().getValue());
        this.dFq.e(-1, intent);
    }

    public void aNO() {
        Intent intent = new Intent(d.Uo(), MarketAnalysisPortraitActivity.class);
        intent.putExtra("EXTRA_SELECTED_TAB", (Serializable) this.dFe.YW().getValue());
        this.dFq.b(intent, 300);
    }

    public void b(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "feed");
        Intent intent = new Intent(d.Uo(), MarketAnalysisPortraitActivity.class);
        intent.putExtra("EXTRA_SELECTED_TAB", (Serializable) this.dFe.YW().getValue());
        intent.putExtra("EXTRA_FEED_DETAILS", new c(cVar.YP(), cVar.YQ()));
        this.dFq.b(intent, 300);
    }

    public void h(com.iqoption.core.microservices.b.a.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "event");
        Intent intent = new Intent(d.Uo(), MarketAnalysisPortraitActivity.class);
        intent.putExtra("EXTRA_DETAIL_CALENDAR_EVENT", aVar);
        intent.putExtra("EXTRA_SELECTED_TAB", (Serializable) this.dFe.YW().getValue());
        this.dFq.b(intent, 300);
    }

    public void a(com.iqoption.core.microservices.tradingengine.response.active.f fVar) {
        kotlin.jvm.internal.i.f(fVar, "activeIdentifier");
        this.dFq.Av();
    }

    public final void b(int i, int i2, Intent intent) {
        if (i == 300 && intent != null) {
            v(intent);
        }
    }

    private final void v(Intent intent) {
        com.iqoption.core.microservices.b.a.a aVar = (com.iqoption.core.microservices.b.a.a) intent.getParcelableExtra("EXTRA_DETAIL_CALENDAR_EVENT");
        if (aVar != null) {
            this.dFe.b(aVar);
        }
        Serializable serializableExtra = intent.getSerializableExtra("EXTRA_SELECTED_TAB");
        if (serializableExtra != null) {
            f fVar = this.dFe;
            if (serializableExtra != null) {
                fVar.a((MarketAnalysisTab) serializableExtra);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.marketanalysis.MarketAnalysisTab");
            }
        }
        c cVar = (c) intent.getParcelableExtra("RESULT_CLICKED_FEED_ITEM");
        if (cVar != null) {
            this.dFe.a(cVar);
        }
        com.iqoption.core.microservices.tradingengine.response.active.f fVar2 = (com.iqoption.core.microservices.tradingengine.response.active.f) intent.getParcelableExtra("RESULT_CLICKED_ACTIVE");
        if (fVar2 != null) {
            this.dFe.b(fVar2);
        }
    }
}
