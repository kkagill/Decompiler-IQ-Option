package com.iqoption.core.marketanalysis;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.ItemTouchHelper.Callback;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.d;
import com.iqoption.core.data.b.b;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.feed.response.FeedPriority;
import com.iqoption.core.microservices.feed.response.c;
import com.iqoption.core.util.u;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 42\u00020\u0001:\u00014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0007J\u000e\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\tJ\u0006\u0010&\u001a\u00020\"J\u000e\u0010'\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u0017J\u0016\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u001e\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020 J\u0010\u00103\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u00010\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\rR\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001eX\u0004¢\u0006\u0002\n\u0000¨\u00065"}, bng = {"Lcom/iqoption/core/marketanalysis/MarketAnalysisViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "activeLiveData", "Lcom/iqoption/core/data/livedata/IQLiveEvent;", "Lcom/iqoption/core/microservices/tradingengine/response/active/ActiveIdentifier;", "calendarEventLiveData", "Lcom/iqoption/core/microservices/economiccalendar/response/CalendarEvent;", "clickedActive", "Landroidx/lifecycle/LiveData;", "getClickedActive", "()Landroidx/lifecycle/LiveData;", "clickedCalendarEvent", "getClickedCalendarEvent", "clickedExpand", "", "getClickedExpand", "clickedFeedItem", "Lcom/iqoption/core/marketanalysis/FeedDetailsIdentifier;", "getClickedFeedItem", "currentTab", "Lcom/iqoption/core/marketanalysis/MarketAnalysisTab;", "getCurrentTab", "expandLiveData", "feedItemLiveData", "lastClickTime", "", "tabLiveData", "Landroidx/lifecycle/MutableLiveData;", "filterQuickClicks", "", "onActiveClicked", "", "active", "onCalendarEventClicked", "event", "onExpandClicked", "onTabSelected", "tab", "openActive", "instrumentType", "Lcom/iqoption/core/data/model/InstrumentType;", "activeId", "", "openActiveAndLog", "item", "Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;", "fromList", "smallScreen", "selectFeedItem", "Companion", "core_release"})
/* compiled from: MarketAnalysisViewModel.kt */
public final class f extends AndroidViewModel {
    public static final a blw = new a();
    private long bhf;
    private final MutableLiveData<MarketAnalysisTab> blm = new MutableLiveData();
    private final LiveData<MarketAnalysisTab> bln = this.blm;
    private final b<Object> blo = new b();
    private final LiveData<Object> blp = this.blo;
    private final b<c> blq = new b();
    private final LiveData<c> blr = this.blq;
    private final b<com.iqoption.core.microservices.b.a.a> bls = new b();
    private final LiveData<com.iqoption.core.microservices.b.a.a> blt = this.bls;
    private final b<com.iqoption.core.microservices.tradingengine.response.active.f> blu = new b();
    private final LiveData<com.iqoption.core.microservices.tradingengine.response.active.f> blv = this.blu;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/iqoption/core/marketanalysis/MarketAnalysisViewModel$Companion;", "", "()V", "CLICK_DELAY_MILLISECONDS", "", "get", "Lcom/iqoption/core/marketanalysis/MarketAnalysisViewModel;", "activity", "Landroidx/fragment/app/FragmentActivity;", "core_release"})
    /* compiled from: MarketAnalysisViewModel.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final f k(FragmentActivity fragmentActivity) {
            kotlin.jvm.internal.i.f(fragmentActivity, "activity");
            ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(f.class);
            kotlin.jvm.internal.i.e(viewModel, "ViewModelProviders.of(ac…sisViewModel::class.java)");
            return (f) viewModel;
        }
    }

    public f(Application application) {
        kotlin.jvm.internal.i.f(application, "app");
        super(application);
    }

    public final LiveData<MarketAnalysisTab> YW() {
        return this.bln;
    }

    public final void a(MarketAnalysisTab marketAnalysisTab) {
        kotlin.jvm.internal.i.f(marketAnalysisTab, "tab");
        if (marketAnalysisTab != ((MarketAnalysisTab) this.blm.getValue())) {
            this.blm.postValue(marketAnalysisTab);
        }
    }

    public final LiveData<Object> YX() {
        return this.blp;
    }

    public final void YY() {
        if (Zc()) {
            this.blo.postValue(null);
        }
    }

    public final LiveData<c> YZ() {
        return this.blr;
    }

    public final void a(c cVar) {
        this.blq.postValue(cVar);
    }

    public final LiveData<com.iqoption.core.microservices.b.a.a> Za() {
        return this.blt;
    }

    public final void b(com.iqoption.core.microservices.b.a.a aVar) {
        kotlin.jvm.internal.i.f(aVar, "event");
        if (Zc()) {
            this.bls.postValue(aVar);
        }
    }

    public final LiveData<com.iqoption.core.microservices.tradingengine.response.active.f> Zb() {
        return this.blv;
    }

    public final void b(com.iqoption.core.microservices.tradingengine.response.active.f fVar) {
        kotlin.jvm.internal.i.f(fVar, ConditionalUserProperty.ACTIVE);
        this.blu.postValue(fVar);
    }

    public final void a(com.iqoption.core.microservices.feed.response.a aVar, boolean z, boolean z2) {
        kotlin.jvm.internal.i.f(aVar, "item");
        c adN = aVar.adN();
        if (adN == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        int Bs = adN.Bs();
        InstrumentType instrumentType = adN.getInstrumentType();
        FeedPriority adL = aVar.adL();
        u.b o = u.anp().o("instrumentType", instrumentType).o("activeId", Integer.valueOf(Bs)).o("ordering_priority", adL != null ? Integer.valueOf(adL.getServerValue()) : null);
        if (z) {
            o.o("screen_size", Integer.valueOf(z2 ^ 1));
        }
        d.EC().a(z ? "smart-feed_feed-trade" : "smart-feed_news-trade", (double) adN.getAction(), o.anr());
        b(instrumentType, Bs);
    }

    public final void b(InstrumentType instrumentType, int i) {
        kotlin.jvm.internal.i.f(instrumentType, "instrumentType");
        b(new com.iqoption.core.microservices.tradingengine.response.active.f(instrumentType, i));
    }

    private final boolean Zc() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.bhf < ((long) Callback.DEFAULT_SWIPE_ANIMATION_DURATION)) {
            return false;
        }
        this.bhf = currentTimeMillis;
        return true;
    }
}
