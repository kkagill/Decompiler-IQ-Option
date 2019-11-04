package com.iqoption.core.microservices.kyc.response;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.microservices.c;
import com.iqoption.core.util.o;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, bng = {"Lcom/iqoption/core/microservices/kyc/response/SendPhoneConfirmationResponse;", "Lcom/iqoption/core/microservices/ResponseStatus;", "isSuccessful", "", "message", "", "(ZLjava/lang/String;)V", "()Z", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "core_release"})
@o
/* compiled from: SendPhoneConfirmationResponse.kt */
public final class e implements c {
    @SerializedName("isSuccessful")
    private final boolean blS;
    @SerializedName("message")
    private final String message;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if ((isSuccessful() == eVar.isSuccessful() ? 1 : null) == null || !kotlin.jvm.internal.i.y(getMessage(), eVar.getMessage())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int isSuccessful = isSuccessful();
        if (isSuccessful != 0) {
            isSuccessful = 1;
        }
        isSuccessful *= 31;
        String message = getMessage();
        return isSuccessful + (message != null ? message.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SendPhoneConfirmationResponse(isSuccessful=");
        stringBuilder.append(isSuccessful());
        stringBuilder.append(", message=");
        stringBuilder.append(getMessage());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public e(boolean z, String str) {
        kotlin.jvm.internal.i.f(str, "message");
        this.blS = z;
        this.message = str;
    }

    public boolean isSuccessful() {
        return this.blS;
    }

    public String getMessage() {
        return this.message;
    }
}
