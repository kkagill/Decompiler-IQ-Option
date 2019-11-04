package com.iqoption.core.microservices.internalbilling.a;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.math.BigDecimal;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JD\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, bng = {"Lcom/iqoption/core/microservices/internalbilling/response/AuthBalanceChanged;", "", "id", "", "userId", "amount", "Ljava/math/BigDecimal;", "currency", "", "type", "", "(JLjava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;I)V", "getAmount", "()Ljava/math/BigDecimal;", "getCurrency", "()Ljava/lang/String;", "getId", "()J", "getType", "()I", "getUserId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;I)Lcom/iqoption/core/microservices/internalbilling/response/AuthBalanceChanged;", "equals", "", "other", "hashCode", "toString", "core_release"})
@o
/* compiled from: AuthBalanceChanged.kt */
public final class a {
    @SerializedName("amount")
    private final BigDecimal bub;
    @SerializedName("currency")
    private final String currency;
    @SerializedName("id")
    private final long id;
    @SerializedName("type")
    private final int type;
    @SerializedName("user_id")
    private final Long userId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if ((this.id == aVar.id ? 1 : null) != null && kotlin.jvm.internal.i.y(this.userId, aVar.userId) && kotlin.jvm.internal.i.y(this.bub, aVar.bub) && kotlin.jvm.internal.i.y(this.currency, aVar.currency)) {
                    if ((this.type == aVar.type ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.id;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Long l = this.userId;
        int i2 = 0;
        i = (i + (l != null ? l.hashCode() : 0)) * 31;
        BigDecimal bigDecimal = this.bub;
        i = (i + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31;
        String str = this.currency;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((i + i2) * 31) + this.type;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AuthBalanceChanged(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", amount=");
        stringBuilder.append(this.bub);
        stringBuilder.append(", currency=");
        stringBuilder.append(this.currency);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final long getId() {
        return this.id;
    }

    public final BigDecimal aeo() {
        return this.bub;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final int getType() {
        return this.type;
    }
}
