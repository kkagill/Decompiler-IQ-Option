package com.iqoption.core.microservices.auth.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, bng = {"Lcom/iqoption/core/microservices/auth/response/Message;", "", "password", "", "", "curPassword", "(Ljava/util/List;Ljava/util/List;)V", "getCurPassword", "()Ljava/util/List;", "getPassword", "core_release"})
/* compiled from: MessageResponse.kt */
public final class e {
    @SerializedName("password")
    private final List<String> blQ;
    @SerializedName("current_password")
    private final List<String> blR;

    public e() {
        this(null, null, 3, null);
    }

    public e(List<String> list, List<String> list2) {
        this.blQ = list;
        this.blR = list2;
    }

    public /* synthetic */ e(List list, List list2, int i, f fVar) {
        if ((i & 1) != 0) {
            list = (List) null;
        }
        if ((i & 2) != 0) {
            list2 = (List) null;
        }
        this(list, list2);
    }
}
