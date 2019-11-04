package com.iqoption.feed.feedlist;

import android.content.Context;
import android.widget.ImageView;
import com.iqoption.core.ext.c;
import com.iqoption.core.microservices.feed.response.FeedPriority;
import com.iqoption.core.microservices.feed.response.a;
import com.iqoption.feed.i.d;
import com.squareup.picasso.Picasso;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u0013"}, bng = {"Lcom/iqoption/feed/feedlist/FeedHolderUtils;", "", "()V", "getPreviewMaxTextLines", "", "context", "Landroid/content/Context;", "item", "Lcom/iqoption/core/microservices/feed/response/CommonFeedItem;", "isMacro", "", "getSourceTextSize", "", "getSourceTitle", "", "loadServiceIcon", "", "imageView", "Landroid/widget/ImageView;", "feed_release"})
/* compiled from: FeedHolderUtils.kt */
public final class g {
    public static final g cQR = new g();

    private g() {
    }

    public static final void a(ImageView imageView, a aVar) {
        kotlin.jvm.internal.i.f(imageView, "imageView");
        kotlin.jvm.internal.i.f(aVar, "item");
        Picasso with = Picasso.with(imageView.getContext());
        if (aVar.adL() == FeedPriority.BREAKING_NEWS) {
            with.load(d.ic_fire).into(imageView);
        } else if (aVar.adL() == FeedPriority.PROMOTED) {
            with.load(d.ic_promo).into(imageView);
        } else {
            with.load((String) u.bX(aVar.adI())).into(imageView);
        }
    }

    public static final String a(Context context, a aVar) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(aVar, "item");
        String string;
        if (aVar.adL() == FeedPriority.BREAKING_NEWS) {
            string = context.getString(com.iqoption.feed.i.g.urgent_news);
            kotlin.jvm.internal.i.e(string, "context.getString(R.string.urgent_news)");
            return string;
        } else if (aVar.adL() != FeedPriority.PROMOTED) {
            return aVar.getSource();
        } else {
            string = context.getString(com.iqoption.feed.i.g.promoted_news);
            kotlin.jvm.internal.i.e(string, "context.getString(R.string.promoted_news)");
            return string;
        }
    }

    public static final float a(Context context, a aVar, boolean z) {
        int i;
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(aVar, "item");
        Object adL = aVar.adL();
        int i2 = 0;
        if (adL != null) {
            if (c.b(adL, FeedPriority.PROMOTED, FeedPriority.BREAKING_NEWS)) {
                i2 = 1;
            }
        }
        if (i2 != 0 && z) {
            i = com.iqoption.feed.i.c.sp18;
        } else if (i2 == 0 || z) {
            i = com.iqoption.feed.i.c.sp12;
        } else {
            i = com.iqoption.feed.i.c.sp14;
        }
        return context.getResources().getDimension(i);
    }

    public static final int b(Context context, a aVar, boolean z) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(aVar, "item");
        if ((aVar.adL() == FeedPriority.BREAKING_NEWS ? 1 : null) != null) {
            return 5;
        }
        return z ? 2 : 3;
    }
}
