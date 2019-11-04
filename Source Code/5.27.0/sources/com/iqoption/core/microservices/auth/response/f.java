package com.iqoption.core.microservices.auth.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/core/microservices/auth/response/MessageResponse;", "", "message", "", "", "(Ljava/util/List;)V", "getMessage", "()Ljava/util/List;", "core_release"})
/* compiled from: MessageResponse.kt */
public final class f {
    @SerializedName("message")
    private final List<String> message;

    public f() {
        this(null, 1, null);
    }

    public f(List<String> list) {
        kotlin.jvm.internal.i.f(list, "message");
        this.message = list;
    }

    public /* synthetic */ f(List list, int i, f fVar) {
        if ((i & 1) != 0) {
            list = m.emptyList();
        }
        this(list);
    }

    public final List<String> Zk() {
        return this.message;
    }
}
