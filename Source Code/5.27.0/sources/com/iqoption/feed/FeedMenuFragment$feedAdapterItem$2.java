package com.iqoption.feed;

import android.os.Parcelable;
import com.iqoption.feed.feedlist.d;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/feed/feedlist/FeedAdapterItem;", "invoke"})
/* compiled from: FeedMenuFragment.kt */
final class FeedMenuFragment$feedAdapterItem$2 extends Lambda implements a<d> {
    final /* synthetic */ c this$0;

    FeedMenuFragment$feedAdapterItem$2(c cVar) {
        this.this$0 = cVar;
        super(0);
    }

    /* renamed from: avg */
    public final d invoke() {
        Parcelable parcelable = com.iqoption.core.ext.a.s(this.this$0).getParcelable("ARG_FEED_ITEM");
        if (parcelable != null) {
            return (d) parcelable;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.feed.feedlist.FeedAdapterItem");
    }
}
