package com.iqoption.core.microservices.withdraw.response;

import android.os.Parcelable;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010!\u001a\u00020\u001eH&J\b\u0010\"\u001a\u00020#H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0018X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, bng = {"Lcom/iqoption/core/microservices/withdraw/response/BaseWithdrawMethod;", "Landroid/os/Parcelable;", "commission", "", "getCommission", "()D", "commissions", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawCommissions;", "getCommissions", "()Lcom/iqoption/core/microservices/withdraw/response/WithdrawCommissions;", "fields", "", "Lcom/iqoption/core/microservices/withdraw/response/PayoutField;", "getFields", "()Ljava/util/List;", "id", "", "getId", "()J", "limits", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawLimit;", "getLimits", "()Lcom/iqoption/core/microservices/withdraw/response/WithdrawLimit;", "maxLimit", "Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;", "getMaxLimit", "()Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;", "setMaxLimit", "(Lcom/iqoption/core/microservices/withdraw/response/AmountLimit;)V", "name", "", "getName", "()Ljava/lang/String;", "payoutMethodIdentifier", "type", "Lcom/iqoption/core/microservices/withdraw/response/WithdrawMethodType;", "core_release"})
/* compiled from: WithdrawMethod.kt */
public interface c extends Parcelable {
    String ajA();

    double ajB();

    j ajC();

    List<h> ajD();

    k ajE();

    a ajF();

    WithdrawMethodType ajz();

    long getId();

    String getName();
}
