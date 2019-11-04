package com.iqoption.core.data.config;

import com.iqoption.core.microservices.core.response.b;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a>\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007¨\u0006\u000b"}, bng = {"createApiConfig", "Lcom/iqoption/core/data/config/ApiConfig;", "coreUrl", "", "default", "Lcom/iqoption/core/data/config/ApiConfigData;", "cfg", "Lcom/iqoption/core/microservices/core/response/Configuration;", "onRequestLogout", "Lkotlin/Function0;", "", "core_release"})
/* compiled from: ApiConfig.kt */
public final class f {
    public static final ApiConfig VC() {
        return a(null, null, null, null, 15, null);
    }

    public static final ApiConfig a(String str, a aVar) {
        return a(str, aVar, null, null, 12, null);
    }

    public static /* synthetic */ ApiConfig a(String str, a aVar, b bVar, a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = (String) null;
        }
        if ((i & 2) != 0) {
            aVar = (a) null;
        }
        if ((i & 4) != 0) {
            bVar = (b) null;
        }
        if ((i & 8) != 0) {
            aVar2 = (a) null;
        }
        return a(str, aVar, bVar, aVar2);
    }

    public static final ApiConfig a(String str, a aVar, b bVar, a<l> aVar2) {
        i iVar;
        if (aVar != null) {
            iVar = new i(str, aVar, bVar);
        } else {
            i iVar2 = new i(null, null, null, 7, null);
        }
        return new d(iVar, aVar2);
    }
}
