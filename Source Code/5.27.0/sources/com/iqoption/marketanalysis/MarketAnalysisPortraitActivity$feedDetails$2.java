package com.iqoption.marketanalysis;

import android.content.Intent;
import android.os.Bundle;
import com.iqoption.core.marketanalysis.c;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/marketanalysis/FeedDetailsIdentifier;", "invoke"})
/* compiled from: MarketAnalysisPortraitActivity.kt */
final class MarketAnalysisPortraitActivity$feedDetails$2 extends Lambda implements a<c> {
    final /* synthetic */ MarketAnalysisPortraitActivity this$0;

    MarketAnalysisPortraitActivity$feedDetails$2(MarketAnalysisPortraitActivity marketAnalysisPortraitActivity) {
        this.this$0 = marketAnalysisPortraitActivity;
        super(0);
    }

    /* renamed from: aNL */
    public final c invoke() {
        Intent intent = this.this$0.getIntent();
        kotlin.jvm.internal.i.e(intent, "intent");
        Bundle extras = intent.getExtras();
        return extras != null ? (c) extras.getParcelable("EXTRA_FEED_DETAILS") : null;
    }
}
