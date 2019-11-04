package com.iqoption.core.microservices.cms;

import com.iqoption.core.connect.http.c;
import com.iqoption.core.d;
import com.iqoption.core.microservices.cms.a.b;
import io.reactivex.p;
import kotlin.i;
import okhttp3.FormBody.Builder;
import okhttp3.Request;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/core/microservices/cms/CmsRequests;", "", "()V", "CMD_API_ARTICLE_GET", "", "RISK_DISCLOSURE", "getArticle", "Lio/reactivex/Single;", "Lcom/iqoption/core/microservices/cms/response/TermsResponse;", "article", "core_release"})
/* compiled from: CmsRequests.kt */
public final class a {
    public static final a bqY = new a();

    private a() {
    }

    public static final p<b> gt(String str) {
        kotlin.jvm.internal.i.f(str, "article");
        Builder add = new Builder().add("key", str).add("lang", d.getLocale());
        Request.Builder a = c.a(c.baF, new Request.Builder(), null, 1, null);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d.EE().Vb());
        stringBuilder.append("api/article/get");
        Request.Builder post = a.url(stringBuilder.toString()).post(add.build());
        c cVar = c.baF;
        kotlin.jvm.internal.i.e(post, "builder");
        return cVar.b(post, CmsRequests$getArticle$1.bqZ, com.iqoption.core.connect.http.b.bau, c.UJ());
    }
}
