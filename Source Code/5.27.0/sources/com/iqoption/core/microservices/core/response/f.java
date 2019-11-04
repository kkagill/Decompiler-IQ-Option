package com.iqoption.core.microservices.core.response;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, bng = {"Lcom/iqoption/core/microservices/core/response/MyCountryResponse;", "", "isSuccessful", "", "result", "", "(ZLjava/lang/String;)V", "()Z", "getResult", "()Ljava/lang/String;", "core_release"})
/* compiled from: MyCountryResponse.kt */
public final class f {
    @SerializedName("isSuccessful")
    private final boolean blS;
    @SerializedName("result")
    private final String bss;

    public f() {
        this(false, null, 3, null);
    }

    public f(boolean z, String str) {
        kotlin.jvm.internal.i.f(str, "result");
        this.blS = z;
        this.bss = str;
    }

    public /* synthetic */ f(boolean z, String str, int i, f fVar) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        this(z, str);
    }

    public final String adh() {
        return this.bss;
    }
}
