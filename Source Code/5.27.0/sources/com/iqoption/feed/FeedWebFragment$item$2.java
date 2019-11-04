package com.iqoption.feed;

import android.os.Parcelable;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;", "invoke"})
/* compiled from: FeedWebFragment.kt */
final class FeedWebFragment$item$2 extends Lambda implements a<com.iqoption.core.microservices.feed.response.a> {
    final /* synthetic */ g this$0;

    FeedWebFragment$item$2(g gVar) {
        this.this$0 = gVar;
        super(0);
    }

    /* renamed from: avu */
    public final com.iqoption.core.microservices.feed.response.a invoke() {
        Parcelable parcelable = com.iqoption.core.ext.a.s(this.this$0).getParcelable("ARG_WEB_BUTTON_ITEM");
        if (parcelable != null) {
            return (com.iqoption.core.microservices.feed.response.a) parcelable;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.feed.response.CommonFeedItem");
    }
}
