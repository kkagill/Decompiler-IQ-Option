package com.iqoption.feed;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.t;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.microservices.feed.response.FeedItem;
import com.iqoption.feed.fetching.FeedFetcher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Triple;
import kotlin.i;
import kotlin.j;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001AB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0018J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u000bH\u0002J\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180!0-JV\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0!2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140!2\u0014\u00103\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020504\u0018\u00010\u001c2\u0006\u00106\u001a\u00020\u0006H\u0002J*\u00107\u001a\u00020%2\u0016\b\u0002\u00103\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020504\u0018\u00010\u001c2\b\b\u0002\u00106\u001a\u00020\u0006H\u0007J\"\u00108\u001a\u00020%2\u0012\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000205040\u001c2\u0006\u00109\u001a\u00020:J\b\u0010;\u001a\u00020%H\u0002J\u000e\u0010<\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0018J\u000e\u0010=\u001a\u00020%2\u0006\u0010>\u001a\u00020\u001dJ\u0006\u0010?\u001a\u00020%J\u0006\u0010@\u001a\u00020%R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R2\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\u000b0\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u000eX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR \u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180!0\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, bng = {"Lcom/iqoption/feed/FeedRepository;", "", "()V", "FETCH_UPDATE_PERIOD", "", "NOTIFY_UPDATE_PERIOD", "", "OPTION_TYPE_ORDER", "", "Lcom/iqoption/core/data/model/InstrumentType;", "kotlin.jvm.PlatformType", "", "REVERSED_OPTION_TYPE_ORDER", "firstButtonAtives", "", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "firstItems", "Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;", "firstTagAtives", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "loadDisposable", "Lio/reactivex/disposables/SerialDisposable;", "pendingUpdateEventMap", "Lcom/iqoption/core/microservices/feed/response/FeedItemUpdateEvent;", "prefetchingFuture", "Lcom/google/common/util/concurrent/ListenableFuture;", "removeItemLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/iqoption/feed/feedlist/FeedAdapterItem;", "getRemoveItemLiveData", "()Landroidx/lifecycle/MutableLiveData;", "updateEventLiveData", "", "updateExecutor", "Lcom/iqoption/feed/feedlist/SparseUiExecutor;", "applyChangeEvent", "", "item", "event", "collectButtonInstrumentTypes", "", "items", "Lcom/iqoption/core/microservices/feed/response/FeedItem;", "getEventsLiveData", "Landroidx/lifecycle/LiveData;", "handleFeed", "feedResponse", "Lcom/iqoption/core/microservices/feed/response/FeedListResponse;", "buttonAssetsMap", "tagsAssetsMap", "liveData", "Lcom/iqoption/core/ui/Resource;", "Lcom/iqoption/feed/FeedRepository$FeedItemsHolder;", "from", "loadFeed", "loadInitialFeed", "force", "", "notifyFeedUpdateEvents", "onFeedUpdateEvent", "onItemRemoved", "feedAdapterItem", "startPrefetch", "stopPrefetch", "FeedItemsHolder", "feed_release"})
/* compiled from: FeedRepository.kt */
public final class e {
    private static final List<InstrumentType> cOk = Arrays.asList(new InstrumentType[]{InstrumentType.CRYPTO_INSTRUMENT, InstrumentType.FOREX_INSTRUMENT, InstrumentType.CFD_INSTRUMENT, InstrumentType.DIGITAL_INSTRUMENT, InstrumentType.FX_INSTRUMENT, InstrumentType.BINARY_INSTRUMENT, InstrumentType.TURBO_INSTRUMENT});
    private static final List<InstrumentType> cOl;
    private static t<?> cOm;
    private static final List<com.iqoption.core.microservices.feed.response.a> cOn = new ArrayList();
    private static final Map<Integer, com.iqoption.asset.mediators.a> cOo = new LinkedHashMap();
    private static final Map<String, com.iqoption.core.microservices.tradingengine.response.active.a> cOp = new LinkedHashMap();
    private static final MutableLiveData<com.iqoption.feed.feedlist.d> cOq = new MutableLiveData();
    private static final MutableLiveData<Map<Integer, com.iqoption.core.microservices.feed.response.d>> cOr = new MutableLiveData();
    private static final Map<Integer, com.iqoption.core.microservices.feed.response.d> cOs = new LinkedHashMap();
    private static final com.iqoption.feed.feedlist.i cOt = new com.iqoption.feed.feedlist.i(FeedRepository$updateExecutor$1.cOF, 5000);
    private static final io.reactivex.disposables.d cOu = new io.reactivex.disposables.d();
    public static final e cOv = new e();

    @i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0002\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\nHÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\rHÖ\u0001R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006#"}, bng = {"Lcom/iqoption/feed/FeedRepository$FeedItemsHolder;", "", "count", "", "hasMore", "", "items", "", "Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;", "buttonAssetsMap", "", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "tagsAssetsMap", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "(IZLjava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "getButtonAssetsMap", "()Ljava/util/Map;", "getCount", "()I", "getHasMore", "()Z", "getItems", "()Ljava/util/List;", "getTagsAssetsMap", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "feed_release"})
    /* compiled from: FeedRepository.kt */
    public static final class a {
        private final boolean btw;
        private final Map<Integer, com.iqoption.asset.mediators.a> cOw;
        private final Map<String, com.iqoption.core.microservices.tradingengine.response.active.a> cOx;
        private final int count;
        private final List<com.iqoption.core.microservices.feed.response.a> iA;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if ((this.count == aVar.count ? 1 : null) != null) {
                        if (!((this.btw == aVar.btw ? 1 : null) != null && kotlin.jvm.internal.i.y(this.iA, aVar.iA) && kotlin.jvm.internal.i.y(this.cOw, aVar.cOw) && kotlin.jvm.internal.i.y(this.cOx, aVar.cOx))) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.count * 31;
            int i2 = this.btw;
            if (i2 != 0) {
                i2 = 1;
            }
            i = (i + i2) * 31;
            List list = this.iA;
            int i3 = 0;
            i = (i + (list != null ? list.hashCode() : 0)) * 31;
            Map map = this.cOw;
            i = (i + (map != null ? map.hashCode() : 0)) * 31;
            map = this.cOx;
            if (map != null) {
                i3 = map.hashCode();
            }
            return i + i3;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FeedItemsHolder(count=");
            stringBuilder.append(this.count);
            stringBuilder.append(", hasMore=");
            stringBuilder.append(this.btw);
            stringBuilder.append(", items=");
            stringBuilder.append(this.iA);
            stringBuilder.append(", buttonAssetsMap=");
            stringBuilder.append(this.cOw);
            stringBuilder.append(", tagsAssetsMap=");
            stringBuilder.append(this.cOx);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public a(int i, boolean z, List<com.iqoption.core.microservices.feed.response.a> list, Map<Integer, com.iqoption.asset.mediators.a> map, Map<String, ? extends com.iqoption.core.microservices.tradingengine.response.active.a> map2) {
            kotlin.jvm.internal.i.f(list, "items");
            kotlin.jvm.internal.i.f(map, "buttonAssetsMap");
            kotlin.jvm.internal.i.f(map2, "tagsAssetsMap");
            this.count = i;
            this.btw = z;
            this.iA = list;
            this.cOw = map;
            this.cOx = map2;
        }

        public final int getCount() {
            return this.count;
        }

        public final boolean adP() {
            return this.btw;
        }

        public final List<com.iqoption.core.microservices.feed.response.a> getItems() {
            return this.iA;
        }

        public final Map<Integer, com.iqoption.asset.mediators.a> avm() {
            return this.cOw;
        }

        public final Map<String, com.iqoption.core.microservices.tradingengine.response.active.a> avn() {
            return this.cOx;
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: FeedRepository.kt */
    static final class b implements Runnable {
        final /* synthetic */ List $items;
        final /* synthetic */ Map cOA;
        final /* synthetic */ Map cOB;
        final /* synthetic */ int cOy;
        final /* synthetic */ List cOz;

        b(int i, List list, List list2, Map map, Map map2) {
            this.cOy = i;
            this.cOz = list;
            this.$items = list2;
            this.cOA = map;
            this.cOB = map2;
        }

        public final void run() {
            if (this.cOy == 0) {
                List<com.iqoption.core.microservices.feed.d> g = u.g(this.cOz, 16);
                e.cOn.clear();
                e.cOn.addAll(this.$items);
                e.cOo.clear();
                e.cOo.putAll(this.cOA);
                e.cOp.clear();
                e.cOp.putAll(this.cOB);
                for (com.iqoption.core.microservices.feed.d a : g) {
                    com.iqoption.feed.fetching.a.cRJ.a(a);
                }
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: FeedRepository.kt */
    static final class f implements Runnable {
        final /* synthetic */ MutableLiveData $liveData;

        f(MutableLiveData mutableLiveData) {
            this.$liveData = mutableLiveData;
        }

        public final void run() {
            e.a(e.cOv, this.$liveData, 0, 2, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: FeedRepository.kt */
    static final class g implements Runnable {
        public static final g cOE = new g();

        g() {
        }

        public final void run() {
            e.a(e.cOv, null, 0, 3, null);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001aÎ\u0001\u0012`\u0012^\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0004 \t*.\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0004\u0018\u00010\u00020\u0002 \t*f\u0012`\u0012^\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0004 \t*.\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\n\u001a\u00020\u0003H\n¢\u0006\u0002\b\u000b"}, bng = {"<anonymous>", "Lio/reactivex/Flowable;", "Lkotlin/Triple;", "Lcom/iqoption/core/microservices/feed/response/FeedListResponse;", "", "", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "kotlin.jvm.PlatformType", "feed", "apply"})
    /* compiled from: FeedRepository.kt */
    static final class c<T, R> implements io.reactivex.b.g<T, org.a.b<? extends R>> {
        public static final c cOC = new c();

        c() {
        }

        /* renamed from: a */
        public final io.reactivex.e<Triple<com.iqoption.core.microservices.feed.response.e, Map<Integer, com.iqoption.asset.mediators.a>, Map<String, com.iqoption.core.microservices.tradingengine.response.active.a>>> apply(final com.iqoption.core.microservices.feed.response.e eVar) {
            kotlin.jvm.internal.i.f(eVar, "feed");
            return io.reactivex.e.a((org.a.b) com.iqoption.asset.mediators.b.axN.a(new com.iqoption.asset.mediators.c(u.T(e.cOv.aQ(eVar.getItems())), null, true, null, null, null, 58, null)), (org.a.b) com.iqoption.asset.mediators.b.axN.b(new com.iqoption.asset.mediators.c(null, null, false, null, null, null, 59, null)), (io.reactivex.b.c) new io.reactivex.b.c<List<? extends com.iqoption.asset.mediators.a>, Map<InstrumentType, ? extends List<? extends com.iqoption.core.microservices.tradingengine.response.active.a>>, Triple<? extends com.iqoption.core.microservices.feed.response.e, ? extends Map<Integer, ? extends com.iqoption.asset.mediators.a>, ? extends Map<String, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>>>() {
                /* renamed from: a */
                public final Triple<com.iqoption.core.microservices.feed.response.e, Map<Integer, com.iqoption.asset.mediators.a>, Map<String, com.iqoption.core.microservices.tradingengine.response.active.a>> apply(List<com.iqoption.asset.mediators.a> list, Map<InstrumentType, ? extends List<? extends com.iqoption.core.microservices.tradingengine.response.active.a>> map) {
                    kotlin.jvm.internal.i.f(list, "buttonActivesData");
                    kotlin.jvm.internal.i.f(map, "tagActivesByType");
                    Iterable<com.iqoption.asset.mediators.a> iterable = list;
                    Collection arrayList = new ArrayList(n.e(iterable, 10));
                    for (com.iqoption.asset.mediators.a aVar : iterable) {
                        arrayList.add(j.x(Integer.valueOf(aVar.Jt().getActiveId()), aVar));
                    }
                    Map ac = af.ac((List) arrayList);
                    Map linkedHashMap = new LinkedHashMap();
                    for (InstrumentType instrumentType : e.cOl) {
                        List<com.iqoption.core.microservices.tradingengine.response.active.a> list2 = (List) map.get(instrumentType);
                        if (list2 != null) {
                            for (com.iqoption.core.microservices.tradingengine.response.active.a aVar2 : list2) {
                                linkedHashMap.put(com.iqoption.core.microservices.tradingengine.response.active.d.B(aVar2), aVar2);
                            }
                        }
                    }
                    return new Triple(eVar, ac, linkedHashMap);
                }
            }).k(10, TimeUnit.SECONDS);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012b\u0010\u0002\u001a^\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0005 \n*.\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u000b"}, bng = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Triple;", "Lcom/iqoption/core/microservices/feed/response/FeedListResponse;", "", "", "Lcom/iqoption/asset/mediators/AssetDisplayData;", "", "Lcom/iqoption/core/microservices/tradingengine/response/active/Active;", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: FeedRepository.kt */
    static final class d<T> implements io.reactivex.b.f<Triple<? extends com.iqoption.core.microservices.feed.response.e, ? extends Map<Integer, ? extends com.iqoption.asset.mediators.a>, ? extends Map<String, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>>> {
        final /* synthetic */ MutableLiveData $liveData;
        final /* synthetic */ int cOy;

        d(MutableLiveData mutableLiveData, int i) {
            this.$liveData = mutableLiveData;
            this.cOy = i;
        }

        /* renamed from: a */
        public final void accept(Triple<com.iqoption.core.microservices.feed.response.e, ? extends Map<Integer, com.iqoption.asset.mediators.a>, ? extends Map<String, ? extends com.iqoption.core.microservices.tradingengine.response.active.a>> triple) {
            e.cOv.a((com.iqoption.core.microservices.feed.response.e) triple.bnj(), (Map) triple.bnk(), (Map) triple.bnm(), this.$liveData, this.cOy);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"})
    /* compiled from: FeedRepository.kt */
    static final class e<T> implements io.reactivex.b.f<Throwable> {
        final /* synthetic */ MutableLiveData $liveData;

        e(MutableLiveData mutableLiveData) {
            this.$liveData = mutableLiveData;
        }

        /* renamed from: o */
        public final void accept(Throwable th) {
            MutableLiveData mutableLiveData = this.$liveData;
            if (mutableLiveData != null) {
                mutableLiveData.postValue(com.iqoption.core.ui.d.a.a(com.iqoption.core.ui.d.bHb, th, th.getMessage(), null, 4, null));
            }
        }
    }

    static {
        List list = cOk;
        kotlin.jvm.internal.i.e(list, "OPTION_TYPE_ORDER");
        cOl = u.Q(list);
    }

    private e() {
    }

    public final MutableLiveData<com.iqoption.feed.feedlist.d> avh() {
        return cOq;
    }

    public final void a(com.iqoption.core.microservices.feed.response.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "event");
        synchronized (this) {
            cOs.put(Integer.valueOf(dVar.getId()), dVar);
            l lVar = l.eVB;
        }
        cOt.execute();
    }

    public final void avi() {
        t tVar = cOm;
        if (tVar != null) {
            tVar.cancel(true);
        }
        cOm = com.iqoption.core.c.a.biL.a(g.cOE, 0, 5, TimeUnit.MINUTES);
    }

    public final void avj() {
        t tVar = cOm;
        if (tVar != null) {
            tVar.cancel(true);
        }
        cOm = (t) null;
    }

    public final LiveData<Map<Integer, com.iqoption.core.microservices.feed.response.d>> avk() {
        return cOr;
    }

    public final void a(MutableLiveData<com.iqoption.core.ui.d<a>> mutableLiveData, boolean z) {
        kotlin.jvm.internal.i.f(mutableLiveData, "liveData");
        if (cOn.isEmpty()) {
            mutableLiveData.postValue(com.iqoption.core.ui.d.a.b(com.iqoption.core.ui.d.bHb, null, 1, null));
        } else {
            List arrayList = new ArrayList();
            arrayList.addAll(cOn);
            mutableLiveData.setValue(com.iqoption.core.ui.d.bHb.bS(new a(arrayList.size(), false, arrayList, cOo, cOp)));
        }
        if (cOn.isEmpty() || z) {
            a(this, (MutableLiveData) mutableLiveData, 0, 2, null);
        } else {
            com.iqoption.core.c.a.biN.postDelayed(new f(mutableLiveData), 1000);
        }
    }

    @SuppressLint({"CheckResult"})
    public final void a(MutableLiveData<com.iqoption.core.ui.d<a>> mutableLiveData, int i) {
        if (com.iqoption.core.d.EH().ej("smart-feed")) {
            cOu.h(com.iqoption.core.microservices.feed.b.a(com.iqoption.core.microservices.feed.b.btf, i, 0, null, 6, null).s(c.cOC).d(com.iqoption.core.rx.i.aki()).c(com.iqoption.core.rx.i.akj()).a((io.reactivex.b.f) new d(mutableLiveData, i), (io.reactivex.b.f) new e(mutableLiveData)));
        }
    }

    private final void a(com.iqoption.core.microservices.feed.response.e eVar, Map<Integer, com.iqoption.asset.mediators.a> map, Map<String, ? extends com.iqoption.core.microservices.tradingengine.response.active.a> map2, MutableLiveData<com.iqoption.core.ui.d<a>> mutableLiveData, int i) {
        Collection arrayList = new ArrayList();
        for (FeedItem feedItem : eVar.getItems()) {
            FeedItem feedItem2;
            if (!(feedItem2 instanceof com.iqoption.core.microservices.feed.response.a)) {
                feedItem2 = null;
            }
            com.iqoption.core.microservices.feed.response.a aVar = (com.iqoption.core.microservices.feed.response.a) feedItem2;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        List T = u.T((List) arrayList);
        Iterable<com.iqoption.core.microservices.feed.response.a> iterable = T;
        Collection arrayList2 = new ArrayList(n.e(iterable, 10));
        for (com.iqoption.core.microservices.feed.response.a a : iterable) {
            arrayList2.add(FeedFetcher.cSh.a((FeedItem) a));
        }
        List list = (List) arrayList2;
        FeedFetcher.cSh.aR(list);
        if (mutableLiveData != null) {
            mutableLiveData.postValue(com.iqoption.core.ui.d.bHb.bS(new a(T.size(), eVar.adP(), T, map, map2)));
        }
        com.iqoption.core.c.a.biN.post(new b(i, list, T, map, map2));
    }

    private final Set<InstrumentType> aQ(List<? extends FeedItem> list) {
        Collection arrayList = new ArrayList();
        for (FeedItem feedItem : list) {
            FeedItem feedItem2;
            Object obj = null;
            if (!(feedItem2 instanceof com.iqoption.core.microservices.feed.response.a)) {
                feedItem2 = null;
            }
            com.iqoption.core.microservices.feed.response.a aVar = (com.iqoption.core.microservices.feed.response.a) feedItem2;
            if (aVar != null) {
                com.iqoption.core.microservices.feed.response.c adN = aVar.adN();
                if (adN != null) {
                    obj = adN.getInstrumentType();
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return u.V((List) arrayList);
    }

    private final void avl() {
        Map linkedHashMap = new LinkedHashMap();
        synchronized (this) {
            linkedHashMap.putAll(cOs);
            cOs.clear();
            l lVar = l.eVB;
        }
        for (com.iqoption.core.microservices.feed.response.a aVar : cOn) {
            com.iqoption.core.microservices.feed.response.d dVar = (com.iqoption.core.microservices.feed.response.d) linkedHashMap.get(Integer.valueOf(aVar.getId()));
            if (dVar != null) {
                cOv.a(aVar, dVar);
            }
        }
        if ((linkedHashMap.isEmpty() ^ 1) != 0) {
            cOr.postValue(linkedHashMap);
        }
    }

    public final void e(com.iqoption.feed.feedlist.d dVar) {
        kotlin.jvm.internal.i.f(dVar, "feedAdapterItem");
        cOn.remove(dVar.YQ());
        cOq.postValue(dVar);
    }

    public final void a(com.iqoption.core.microservices.feed.response.a aVar, com.iqoption.core.microservices.feed.response.d dVar) {
        kotlin.jvm.internal.i.f(aVar, "item");
        kotlin.jvm.internal.i.f(dVar, "event");
        if (dVar.getUserId() != com.iqoption.core.d.Um().EA().getUserId()) {
            aVar.setRating(dVar.getRating());
        }
        aVar.eS(dVar.adO());
    }
}
