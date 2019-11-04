package com.iqoption.mobbtech.connect.response;

import androidx.annotation.Nullable;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.common.base.e;
import com.google.gson.annotations.SerializedName;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.dto.entity.position.Position;
import java.util.HashMap;

/* compiled from: BetInfoResponse */
public class a extends j {
    @SerializedName("result")
    public b dIH;

    /* compiled from: BetInfoResponse */
    public static class a {
        private static final String TAG = "com.iqoption.mobbtech.connect.response.a$a";
        @SerializedName("option_type")
        public ActiveType activeType;
        @SerializedName("balance_id")
        public Long balanceId;
        @SerializedName("buyback_state")
        public String buybackState;
        @SerializedName("client_platform_id")
        public Integer clientPlatformId;
        @SerializedName("created")
        public Long created;
        @SerializedName("deposit")
        public Double dII;
        @SerializedName("profit")
        public Double dIJ;
        @SerializedName("refund")
        public Double dIK;
        @SerializedName("direction")
        public String direction;
        @SerializedName("now")
        public Long now;
        @SerializedName("profit_income")
        public Long profitIncome;
        @SerializedName("value")
        public Double value;
        @SerializedName("win")
        public String win;

        public String toString() {
            String str = "profit";
            str = "direction";
            str = "created";
            com.google.common.base.e.a d = e.aj(this).d("deposit", this.dII).d(ConditionalUserProperty.VALUE, this.value).d(str, this.dIJ).d(str, this.direction).d(str, this.created).d(str, this.created);
            return d.d(ProductAction.ACTION_REFUND, this.dIK).d("profitIncome", this.profitIncome).d("type", this.activeType).d("balanceId", this.balanceId).d("win", this.win).d("buybackState", this.buybackState).d("clientPlatformId", this.clientPlatformId).toString();
        }
    }

    /* compiled from: BetInfoResponse */
    public static class b {
        @SerializedName("active")
        public String active;
        @SerializedName("active_id")
        public Integer activeId;
        @SerializedName("data")
        public HashMap<Long, a> dIL;
        @SerializedName("exp_value")
        public Double expValue;
        @SerializedName("expired")
        public Long expired;

        public String toString() {
            return e.aj(this).d("expValue", this.expValue).d(Position.CLOSE_REASON_EXPIRED, this.expired).d(ConditionalUserProperty.ACTIVE, this.active).d("data", this.dIL).toString();
        }

        @Nullable
        public a bV(long j) {
            HashMap hashMap = this.dIL;
            return (hashMap == null || !hashMap.containsKey(Long.valueOf(j))) ? null : (a) this.dIL.get(Long.valueOf(j));
        }
    }

    public String toString() {
        return e.aj(this).d("super", super.toString()).d("result", this.dIH).toString();
    }
}
