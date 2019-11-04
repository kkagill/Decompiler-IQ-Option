package com.iqoption.core.microservices.fininfo;

import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.gms.actions.SearchIntents;
import com.iqoption.core.connect.http.c;
import com.iqoption.core.d;
import com.iqoption.core.data.config.b;
import io.reactivex.p;
import kotlin.i;
import okhttp3.Request;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/microservices/fininfo/FinInfoRequests;", "", "()V", "API_FIN_INFO_ACTIVE_VIEW", "", "API_FIN_INFO_GRAPHQL", "getFinInfoGraphq", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/fininfo/response/ActiveFinInfoResult;", "idActive", "", "core_release"})
/* compiled from: FinInfoRequests.kt */
public final class a {
    public static final a btx = new a();

    private a() {
    }

    public final p<com.iqoption.core.microservices.fininfo.response.a> eT(int i) {
        String locale = d.getLocale();
        Builder encodedPath = new Builder().encodedPath(b.ad(d.EE().Vl(), "api/graphql"));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ active(id: ");
        stringBuilder.append(i);
        stringBuilder.append(") { link currencyLeftSide currencyRightSide type fininfo { ... on Pair { ticker name base { description(locale: ");
        stringBuilder.append(locale);
        stringBuilder.append(") ... on Stock { keyStat { marketCap latestEPS dividendYield peRatioHigh sharesOutstanding beta returnOnEquity revenue earnDate } } } } } } }");
        Uri build = encodedPath.appendQueryParameter(SearchIntents.EXTRA_QUERY, stringBuilder.toString()).build();
        c cVar = c.baF;
        Request.Builder builder = c.a(c.baF, new Request.Builder(), null, 1, null).url(build.toString()).get();
        kotlin.jvm.internal.i.e(builder, "Request.Builder().accept…url(uri.toString()).get()");
        return c.b(cVar, builder, FinInfoRequests$getFinInfoGraphq$1.bty, null, null, 12, null);
    }
}
