package com.iqoption.core.microservices.withdraw.response;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.microservices.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, bng = {"Lcom/iqoption/core/microservices/withdraw/response/WithdrawResponse;", "Lcom/iqoption/core/microservices/ResponseStatus;", "status", "", "id", "", "(IJ)V", "getId", "()J", "isSuccessful", "", "()Z", "message", "", "getMessage", "()Ljava/lang/String;", "getStatus", "()I", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "core_release"})
/* compiled from: WithdrawResponse.kt */
public final class q implements c {
    @SerializedName("id")
    private final long id;
    @SerializedName("status")
    private final int status;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if ((this.status == qVar.status ? 1 : null) != null) {
                    if ((this.id == qVar.id ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public String getMessage() {
        return "";
    }

    public int hashCode() {
        int i = this.status * 31;
        long j = this.id;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WithdrawResponse(status=");
        stringBuilder.append(this.status);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public boolean isSuccessful() {
        return this.status == 200;
    }
}
