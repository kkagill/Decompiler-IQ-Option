package com.iqoption.core.data.config;

import com.iqoption.core.d;
import com.iqoption.core.data.encryption.a;
import java.util.List;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "Lcom/iqoption/core/data/config/ApiConfigHosts;", "bytes", "", "kotlin.jvm.PlatformType", "invoke"})
/* compiled from: ApiConfigHosts.kt */
final class ApiConfigHosts$Companion$loadS3$loadFromS3$2$1 extends Lambda implements b<byte[], c> {
    public static final ApiConfigHosts$Companion$loadS3$loadFromS3$2$1 bbE = new ApiConfigHosts$Companion$loadS3$loadFromS3$2$1();

    ApiConfigHosts$Companion$loadS3$loadFromS3$2$1() {
        super(1);
    }

    /* renamed from: l */
    public final c invoke(byte[] bArr) {
        a aVar = new a(c.bbu, c.bbv);
        kotlin.jvm.internal.i.e(bArr, "bytes");
        List MJ = ((c.a.a) d.Um().Ez().fromJson(new String(aVar.m(bArr), kotlin.text.d.UTF_8), c.a.a.class)).MJ();
        if ((MJ.isEmpty() ^ 1) != 0) {
            return new c(MJ);
        }
        throw new RuntimeException("Received hosts is empty");
    }
}
