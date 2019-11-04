package com.iqoption.core.microservices.chat.response;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\bR\u0018\u0010\u0007\u001a\u00028\u00008\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, bng = {"Lcom/iqoption/core/microservices/chat/response/ChatDataResponse;", "Data", "Lcom/iqoption/core/microservices/chat/response/ChatResponse;", "isSuccessful", "", "errorMessage", "", "data", "(ZLjava/lang/String;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "core_release"})
/* compiled from: ChatDataResponse.kt */
public class c<Data> extends j {
    @SerializedName("data")
    private final Data data;

    public final Data getData() {
        return this.data;
    }
}
