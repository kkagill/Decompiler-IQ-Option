package com.iqoption.dto.entity.result;

import com.google.common.base.e;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.ActiveType;

public class BuybackResult {
    @SerializedName("active")
    public String active;
    @SerializedName("active_id")
    public Integer activeId;
    @SerializedName("amount")
    public Long amount;
    @SerializedName("buyback_state")
    public String buybackState;
    @SerializedName("buyback_time")
    public Long buybackTime;
    @SerializedName("client_platform_id")
    public Integer clientPlatformId;
    @SerializedName("created")
    public Long created;
    @SerializedName("dir")
    public String dir;
    @SerializedName("error")
    public String error;
    @SerializedName("exp_value")
    public Long expValue;
    @SerializedName("expired")
    public Long expired;
    @SerializedName("game_state")
    public Integer gameState;
    @SerializedName("id")
    public Long optionId;
    @SerializedName("profit_amount")
    public Double profitAmount;
    @SerializedName("profit_income")
    public Long profitIncome;
    @SerializedName("profit_return")
    public Long profitReturn;
    @SerializedName("sum")
    public Double sum;
    @SerializedName("type_name")
    public ActiveType typeName;
    @SerializedName("value")
    public Double value;
    @SerializedName("win")
    public String win;
    @SerializedName("win_amount")
    public Double winAmount;

    public String toString() {
        return e.aj(this).d("buybackState", this.buybackState).d("buybackTime", this.buybackTime).d("winAmount", this.winAmount).toString();
    }

    /* JADX WARNING: Missing block: B:5:0x0014, code skipped:
            if ("canceled".equals(r2.buybackState) != false) goto L_0x0016;
     */
    public boolean isBuybackDone() {
        /*
        r2 = this;
        r0 = r2.buybackState;
        if (r0 == 0) goto L_0x0018;
    L_0x0004:
        r1 = "sold";
        r0 = r1.equals(r0);
        if (r0 != 0) goto L_0x0016;
    L_0x000c:
        r0 = r2.buybackState;
        r1 = "canceled";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0018;
    L_0x0016:
        r0 = 1;
        goto L_0x0019;
    L_0x0018:
        r0 = 0;
    L_0x0019:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.dto.entity.result.BuybackResult.isBuybackDone():boolean");
    }
}
