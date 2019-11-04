package com.iqoption.core.microservices.billing.response.failure;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JN\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012¨\u0006#"}, bng = {"Lcom/iqoption/core/microservices/billing/response/failure/PaymentStatusResponse;", "", "invoiceId", "", "status", "Lcom/iqoption/core/microservices/billing/response/failure/PaymentStatus;", "statusCode", "errorMessage", "", "errorCategories", "", "Lcom/iqoption/core/microservices/billing/response/failure/PaymentErrorCategory;", "(Ljava/lang/Integer;Lcom/iqoption/core/microservices/billing/response/failure/PaymentStatus;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getErrorCategories", "()Ljava/util/List;", "getErrorMessage", "()Ljava/lang/String;", "getInvoiceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "()Lcom/iqoption/core/microservices/billing/response/failure/PaymentStatus;", "getStatusCode", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Lcom/iqoption/core/microservices/billing/response/failure/PaymentStatus;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/iqoption/core/microservices/billing/response/failure/PaymentStatusResponse;", "equals", "", "other", "hashCode", "toString", "core_release"})
@o
/* compiled from: PaymentStatusResponse.kt */
public final class a {
    @SerializedName("invoice_id")
    private final Integer boC;
    @SerializedName("status")
    private final PaymentStatus boD;
    @SerializedName("status_code")
    private final Integer boE;
    @SerializedName("err_categories")
    private final List<PaymentErrorCategory> boF;
    @SerializedName("err_msg")
    private final String errorMessage;

    /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (kotlin.jvm.internal.i.y(r2.boF, r3.boF) != false) goto L_0x003d;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x003d;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.microservices.billing.response.failure.a;
        if (r0 == 0) goto L_0x003b;
    L_0x0006:
        r3 = (com.iqoption.core.microservices.billing.response.failure.a) r3;
        r0 = r2.boC;
        r1 = r3.boC;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0012:
        r0 = r2.boD;
        r1 = r3.boD;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x001c:
        r0 = r2.boE;
        r1 = r3.boE;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0026:
        r0 = r2.errorMessage;
        r1 = r3.errorMessage;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0030:
        r0 = r2.boF;
        r3 = r3.boF;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003d;
    L_0x003b:
        r3 = 0;
        return r3;
    L_0x003d:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.microservices.billing.response.failure.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Integer num = this.boC;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        PaymentStatus paymentStatus = this.boD;
        hashCode = (hashCode + (paymentStatus != null ? paymentStatus.hashCode() : 0)) * 31;
        Integer num2 = this.boE;
        hashCode = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.errorMessage;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.boF;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PaymentStatusResponse(invoiceId=");
        stringBuilder.append(this.boC);
        stringBuilder.append(", status=");
        stringBuilder.append(this.boD);
        stringBuilder.append(", statusCode=");
        stringBuilder.append(this.boE);
        stringBuilder.append(", errorMessage=");
        stringBuilder.append(this.errorMessage);
        stringBuilder.append(", errorCategories=");
        stringBuilder.append(this.boF);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final PaymentStatus aaU() {
        return this.boD;
    }

    public final Integer aaV() {
        return this.boE;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final List<PaymentErrorCategory> aaW() {
        return this.boF;
    }
}
