package com.iqoption.core.microservices.feed;

import com.iqoption.core.d;
import com.iqoption.core.microservices.feed.response.e;
import io.reactivex.a;
import io.reactivex.p;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0019"}, bng = {"Lcom/iqoption/core/microservices/feed/FeedRequests;", "", "()V", "ALL_SENDER_NAME", "", "CLICK", "", "CMD_GET_NEWS_FEED", "CMD_SEND_NEWS_FEEDBACK", "DEFAULT_COUNT", "DISLIKE", "EVENT_FEED_ITEM_INFO_UPDATE", "HIDE_FROM_FEED", "LIKE", "SCROLL", "getFeeds", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/feed/response/FeedListResponse;", "from", "count", "msSenderName", "sendFeedBack", "Lio/reactivex/Completable;", "id", "action", "core_release"})
/* compiled from: FeedRequests.kt */
public final class b {
    public static final b btf = new b();

    private b() {
    }

    public static /* synthetic */ p a(b bVar, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 100;
        }
        if ((i3 & 4) != 0) {
            str = "smart-feed";
        }
        return bVar.g(i, i2, str);
    }

    public final p<e> g(int i, int i2, String str) {
        kotlin.jvm.internal.i.f(str, "msSenderName");
        return d.EV().a("get-news-feed", e.class).k("from", Integer.valueOf(i)).k("n", Integer.valueOf(i2)).k("ms_sender_name", str).fp("2.0").UB();
    }

    public final a an(int i, int i2) {
        String str = "user_id";
        String str2 = "actions";
        a blf = d.EV().a("send-news-feedback", com.iqoption.core.connect.a.Uv()).k(str, Long.valueOf(d.Um().EA().getUserId())).k(str2, l.listOf(d.Um().Ez().toJsonTree(new c(i, i2)))).k("ms_name", "smart-feed").fp("2.0").UB().blf();
        kotlin.jvm.internal.i.e(blf, "requestBuilderFactory.cr…         .ignoreElement()");
        return blf;
    }
}
