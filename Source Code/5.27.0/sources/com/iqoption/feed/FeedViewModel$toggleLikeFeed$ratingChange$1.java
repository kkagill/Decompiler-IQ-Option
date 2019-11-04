package com.iqoption.feed;

import com.iqoption.core.microservices.feed.response.a;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<no name provided>", "", "data", "Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;", "invoke"})
/* compiled from: FeedViewModel.kt */
final class FeedViewModel$toggleLikeFeed$ratingChange$1 extends Lambda implements b<a, l> {
    final /* synthetic */ boolean $wasLike;

    FeedViewModel$toggleLikeFeed$ratingChange$1(boolean z) {
        this.$wasLike = z;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        c((a) obj);
        return l.eVB;
    }

    public final void c(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "data");
        int rating = aVar.getRating();
        if (this.$wasLike) {
            aVar.setRating(rating - 1);
        } else {
            aVar.setRating(rating + 1);
        }
    }
}
