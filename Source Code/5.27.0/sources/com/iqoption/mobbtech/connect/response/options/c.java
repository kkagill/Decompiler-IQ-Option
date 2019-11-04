package com.iqoption.mobbtech.connect.response.options;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.core.util.Pair;
import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.google.common.base.d;
import com.google.common.base.e;
import com.google.common.base.e.a;
import com.google.common.base.f;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Longs;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.iqoption.app.managers.l;
import com.iqoption.core.data.model.ActiveType;
import com.iqoption.core.data.model.InstrumentType;
import com.iqoption.core.util.u;
import com.iqoption.dto.entity.ActiveQuote;
import com.iqoption.dto.entity.position.Position;
import com.iqoption.mobbtech.connect.response.b;
import com.iqoption.util.ab;
import org.json.JSONObject;

/* compiled from: Option */
public class c implements Parcelable, Comparable<c> {
    public static final int CANCEL_OPTION_TIMEOUT = 3000;
    public static final Creator<c> CREATOR = new Creator<c>() {
        /* renamed from: ah */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: gu */
        public c[] newArray(int i) {
            return new c[i];
        }
    };
    public static final int NO_ID = -1;
    public static Ordering<c> ORDERING = orderingByCreatedTime.compound(orderingById);
    public static final d<c, Long> getId = -$$Lambda$c$RZtrGYfb0z9CTcZFSesL8YX-VlQ.INSTANCE;
    public static final d<c, Pair<Long, Long>> getIdAndCreatedTime = -$$Lambda$c$GLUqXMRKARtW3lhI7pcHwtZBXeg.INSTANCE;
    public static final d<c, String> getIdSplitString = -$$Lambda$c$mBrQ_307Q63Zm1vgqQ9vuqgedS0.INSTANCE;
    public static final Ordering<c> orderingByCreatedTime = new Ordering<c>() {
        /* renamed from: d */
        public int compare(c cVar, c cVar2) {
            return Longs.compare(cVar.getCreated(), cVar2.getCreated());
        }
    };
    public static final Ordering<c> orderingById = new Ordering<c>() {
        /* renamed from: d */
        public int compare(c cVar, c cVar2) {
            return Longs.compare(cVar.id.longValue(), cVar2.id.longValue());
        }
    };
    @SerializedName("active_id")
    private Integer activeId;
    public transient String activeNameHistory;
    @SerializedName("type_name")
    @Nullable
    private ActiveType activeType;
    @SerializedName("amount")
    private Long amount;
    @SerializedName("buyback_state")
    private String buybackState;
    @SerializedName("client_platform_id")
    private Integer clientPlatformId;
    @SerializedName("created")
    private Long created;
    @SerializedName("created_millisecond")
    private Long createdMillisecond;
    @SerializedName("currency")
    private String currency;
    @SerializedName("currency_char")
    private String currencyChar;
    protected volatile Double currentProfitAmount;
    @SerializedName("dir")
    private String dir;
    @SerializedName("exp_value")
    private Double expValue;
    @SerializedName("expired")
    protected Long expired;
    @SerializedName("game_state")
    private Integer gameState;
    private transient Integer groupId;
    @SerializedName("id")
    private Long id;
    @SerializedName("is_demo")
    private Boolean isDemo;
    private volatile transient boolean isValueChanged;
    private volatile transient double lastKnownValue;
    @SerializedName("loose_amount")
    private Long looseAmount;
    @SerializedName("now")
    private Long now;
    private volatile transient d optionKey;
    @SerializedName("option_type_id")
    private Integer optionTypeId;
    @SerializedName("profit")
    private Long profit;
    @SerializedName("profit_amount")
    private Double profitAmount;
    @SerializedName("profit_income")
    private Double profitIncome;
    @SerializedName("profit_return")
    private Double profitReturn;
    @SerializedName("re_track")
    private String reTrack;
    @SerializedName("refund")
    private Long refund;
    @SerializedName("site_id")
    private Long siteId;
    @SerializedName("sum")
    private Double sum;
    public Double timeRecieved;
    @SerializedName("type")
    private String type;
    @SerializedName("user_balance_id")
    private Long userBalanceId;
    @SerializedName("user_id")
    private Long userId;
    @SerializedName("value")
    private Double value;
    @SerializedName("win")
    private String win;

    public int describeContents() {
        return 0;
    }

    public long getExpirationPeriod() {
        return 0;
    }

    public long getIndex() {
        return 0;
    }

    public double getSelfMarginCall() {
        return 0.0d;
    }

    public boolean isLong() {
        return true;
    }

    static /* synthetic */ String lambda$static$0(c cVar) {
        return cVar instanceof Position ? ((Position) cVar).getPositionSplitId() : String.valueOf(cVar.id);
    }

    public synchronized void setLastKnowValue(double d) {
        this.lastKnownValue = d;
    }

    public synchronized double getLastKnowValue() {
        return this.lastKnownValue;
    }

    public double getValue() {
        return ab.w(this.value);
    }

    public double getOpenUnderlyingPrice() {
        return ab.w(this.value);
    }

    public boolean isCall() {
        return NotificationCompat.CATEGORY_CALL.equalsIgnoreCase(this.dir);
    }

    public String getDir() {
        return this.dir;
    }

    public double getInvestSum() {
        return ab.w(this.sum);
    }

    public double getCloseInvestSum() {
        return getInvestSum();
    }

    public double getTotalSum() {
        return getInvestSum();
    }

    public long getExpired() {
        return ab.D(this.expired);
    }

    public long getExpireTime() {
        return getExpired() * 1000;
    }

    public long getCloseTime() {
        if (isSold()) {
            Long l = this.now;
            if (l != null) {
                return l.longValue() * 1000;
            }
        }
        return getExpireTime();
    }

    public long getClosed() {
        return getCloseTime() / 1000;
    }

    public int getActiveId() {
        Integer num = this.activeId;
        return num != null ? num.intValue() : -1;
    }

    public Long getId() {
        return this.id;
    }

    @Nullable
    public ActiveType getActiveType() {
        return this.activeType;
    }

    @Nullable
    public InstrumentType getInstrumentType() {
        if (this.activeType == null && !TextUtils.isEmpty(this.type)) {
            this.activeType = ActiveType.fromServerValue(this.type);
        }
        ActiveType activeType = this.activeType;
        return activeType != null ? activeType.toInstrumentType() : null;
    }

    public String getType() {
        return this.type;
    }

    public long getCreated() {
        return ab.D(this.created);
    }

    public long getCreateTime() {
        Long l = this.createdMillisecond;
        if (l == null) {
            return getCreated() * 1000;
        }
        return ab.D(l);
    }

    public long getUserBalanceId() {
        return ab.D(this.userBalanceId);
    }

    public double getExpValue() {
        return ab.w(this.expValue);
    }

    public String getWin() {
        return this.win;
    }

    public String getCloseStatus() {
        String str = this.buybackState;
        if (str != null) {
            return str;
        }
        return this.win;
    }

    public int getGroupId() {
        return f.hashCode(Long.valueOf(getExpired()), Integer.valueOf(getActiveId()), getInstrumentType());
    }

    public boolean isSold() {
        String closeStatus = getCloseStatus();
        return "sold".equals(closeStatus) || "canceled".equals(closeStatus);
    }

    public boolean isClosed() {
        return TextUtils.isEmpty(getCloseStatus()) ^ 1;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof c) && ((c) obj).getId().equals(getId()));
    }

    public int hashCode() {
        return f.hashCode(Integer.valueOf(getId().hashCode()));
    }

    public String toString() {
        String str = "amount";
        str = "isDemo";
        String str2 = "created";
        str = "now";
        str = "expValue";
        str = "gameState";
        str = "sum";
        str = "instrumentType";
        str = "profitAmount";
        str = "profitIncome";
        str = "profitReturn";
        a d = e.aj(this).d("activeId", this.activeId).d(str, this.amount).d(str, this.isDemo).d(str2, getCreated()).d(str, this.now).d(str, this.expValue).d(Position.CLOSE_REASON_EXPIRED, this.expired).d(str, this.gameState).a(ConditionalUserProperty.VALUE, getValue()).d(str, this.sum).d(str, this.activeType).d(str, this.profitAmount).d(str, this.profitIncome).d(str, this.profitReturn);
        return d.d(NotificationCompat.CATEGORY_STATUS, this.buybackState).d("win", this.win).toString();
    }

    public double getWinAmount() {
        return this.profitAmount.doubleValue();
    }

    public double getProfitIfWin() {
        Double d = this.profitIncome;
        return d != null ? (d.doubleValue() / 100.0d) * getInvestSum() : 0.0d;
    }

    public Double getProfitPercente() {
        return Double.valueOf((getCurrentProfitAmount() * 100.0d) / getInvestSum());
    }

    public synchronized double getCurrentProfitAmount() {
        if (this.currentProfitAmount == null) {
            this.currentProfitAmount = Double.valueOf(getInvestSum());
        }
        ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(getActiveId());
        if (!(dY == null || getLastKnowValue() == dY.getVal())) {
            Double valueOf;
            setLastKnowValue(dY.getVal());
            long val = (long) (dY.getVal() * 1000000.0d);
            long value = (long) (getValue() * 1000000.0d);
            double d = 0.0d;
            if (NotificationCompat.CATEGORY_CALL.equals(getDir())) {
                if (val > value) {
                    d = getProfitIfWin();
                } else if (val >= value) {
                    d = getInvestSum();
                }
                valueOf = Double.valueOf(d);
            } else {
                if (val < value) {
                    d = getProfitIfWin();
                } else if (val <= value) {
                    d = getInvestSum();
                }
                valueOf = Double.valueOf(d);
            }
            this.currentProfitAmount = valueOf;
        }
        return this.currentProfitAmount.doubleValue();
    }

    public double getExpPnl() {
        return getCurrentProfitAmount() - getInvestSum();
    }

    public d getOptionKey() {
        return getOptionKeyInternal();
    }

    public d getCloseOptionKey() {
        return getOptionKeyInternal();
    }

    private d getOptionKeyInternal() {
        if (this.optionKey == null) {
            synchronized (this) {
                if (this.optionKey == null) {
                    this.optionKey = createOptionKey(this);
                }
            }
        }
        return this.optionKey;
    }

    public Integer getClientPlatformId() {
        return this.clientPlatformId;
    }

    @Nullable
    private synchronized Double calculateBuybackAmount(b bVar) {
        if (bVar == null) {
            return null;
        }
        return bVar.a(this, getLastKnowValue(), getProfitIfWin());
    }

    @Nullable
    public synchronized Double calculateBuybackAmountWithCancelable(long j) {
        Double calculateBuybackAmount;
        calculateBuybackAmount = calculateBuybackAmount(com.iqoption.app.managers.c.GS().a(Long.valueOf(getExpired()), Integer.valueOf(getActiveId()), getInstrumentType()));
        if (calculateBuybackAmount != null) {
            calculateBuybackAmount = Double.valueOf(isCancelable(j) ? getInvestSum() : calculateBuybackAmount.doubleValue());
        }
        return calculateBuybackAmount;
    }

    public long getCancelTimeLeft(long j) {
        if (!this.isValueChanged) {
            ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(getActiveId());
            if (dY != null) {
                this.isValueChanged = getValue() != dY.getVal();
            }
        }
        return this.isValueChanged ? 0 : ((getCreated() * 1000) + ((long) CANCEL_OPTION_TIMEOUT)) - j;
    }

    public boolean isCancelable(long j) {
        if (!this.isValueChanged) {
            ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(getActiveId());
            if (dY != null) {
                this.isValueChanged = getValue() != dY.getVal();
            }
        }
        if (this.isValueChanged || getCancelTimeLeft(j) <= 0) {
            return false;
        }
        return true;
    }

    public double getSelfPriceEnrolled() {
        ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.activeId.intValue());
        if (dY == null) {
            return 0.0d;
        }
        return dY.getVal();
    }

    public double getUnderlyingPrice() {
        ActiveQuote dY = com.iqoption.app.managers.c.GS().dY(this.activeId.intValue());
        if (dY == null) {
            return 0.0d;
        }
        return dY.getVal();
    }

    public static d createOptionKey(c cVar) {
        return new d(Long.valueOf(cVar.getExpired()), Integer.valueOf(cVar.getActiveId()), cVar.getInstrumentType());
    }

    public static c tradingOption2Option(com.iqoption.core.microservices.binaryoptions.response.b bVar) {
        c cVar = new c();
        cVar.activeId = Integer.valueOf(bVar.Bs());
        cVar.clientPlatformId = Integer.valueOf(bVar.abg().getServerId());
        cVar.expired = Long.valueOf(bVar.abj());
        cVar.sum = Double.valueOf(bVar.ZC());
        cVar.expValue = Double.valueOf(bVar.abo());
        cVar.profitAmount = Double.valueOf(bVar.abq());
        cVar.created = Long.valueOf(bVar.abl());
        cVar.createdMillisecond = Long.valueOf(bVar.abm());
        cVar.now = Long.valueOf(bVar.abn());
        cVar.dir = bVar.abi().getServerValue();
        cVar.value = Double.valueOf(bVar.getValue());
        cVar.win = bVar.abp().getServerValue();
        cVar.id = Long.valueOf(bVar.abf());
        cVar.type = bVar.abh().getServerValue();
        cVar.profitIncome = Double.valueOf((double) bVar.abk());
        cVar.activeType = bVar.abh().getInstrumentType().toOptionActiveType();
        cVar.userBalanceId = Long.valueOf(bVar.DH());
        double currentTimeMillis = (double) System.currentTimeMillis();
        Double.isNaN(currentTimeMillis);
        cVar.timeRecieved = Double.valueOf(currentTimeMillis / 1000.0d);
        return cVar;
    }

    @Nullable
    public static c jsonCore2Option(JsonElement jsonElement) {
        if (jsonElement == null || !jsonElement.isJsonObject()) {
            return null;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        c cVar = new c();
        cVar.activeId = Integer.valueOf(u.g(asJsonObject.get("active_id")));
        cVar.clientPlatformId = Integer.valueOf(u.g(asJsonObject.get("platform_id")));
        cVar.expired = Long.valueOf(u.f(asJsonObject.get("expiration_time")));
        cVar.sum = Double.valueOf(u.e(asJsonObject.get("amount")));
        cVar.expValue = Double.valueOf(u.e(asJsonObject.get("expiration_value")));
        cVar.profitAmount = Double.valueOf(u.e(asJsonObject.get("profit_amount")));
        cVar.created = Long.valueOf(u.f(asJsonObject.get("open_time")));
        cVar.createdMillisecond = Long.valueOf(u.f(asJsonObject.get("open_time_millisecond")));
        cVar.now = Long.valueOf(u.f(asJsonObject.get("actual_expire")));
        cVar.dir = u.i(asJsonObject.get("direction"));
        cVar.value = Double.valueOf(u.e(asJsonObject.get(ConditionalUserProperty.VALUE)));
        cVar.win = u.i(asJsonObject.get("result"));
        cVar.id = Long.valueOf(u.f(asJsonObject.get("option_id")));
        String str = "option_type";
        cVar.type = u.i(asJsonObject.get(str));
        cVar.profitIncome = Double.valueOf(u.e(asJsonObject.get("profit_percent")));
        cVar.activeType = ActiveType.fromServerValue(u.i(asJsonObject.get(str)));
        cVar.userBalanceId = Long.valueOf(u.f(asJsonObject.get("balance_id")));
        double currentTimeMillis = (double) System.currentTimeMillis();
        Double.isNaN(currentTimeMillis);
        cVar.timeRecieved = Double.valueOf(currentTimeMillis / 1000.0d);
        return cVar;
    }

    @Nullable
    public static c json2option(JsonElement jsonElement) {
        if (jsonElement == null || !jsonElement.isJsonObject()) {
            return null;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        c cVar = new c();
        cVar.activeId = Integer.valueOf(u.g(asJsonObject.get("active_id")));
        cVar.amount = Long.valueOf(u.f(asJsonObject.get("amount")));
        cVar.clientPlatformId = Integer.valueOf(u.g(asJsonObject.get("client_platform_id")));
        cVar.gameState = Integer.valueOf(u.g(asJsonObject.get("game_state")));
        cVar.expired = Long.valueOf(u.f(asJsonObject.get(Position.CLOSE_REASON_EXPIRED)));
        cVar.sum = Double.valueOf(u.e(asJsonObject.get("sum")));
        double f = (double) u.f(asJsonObject.get("exp_value"));
        Double.isNaN(f);
        cVar.expValue = Double.valueOf(f / 1000000.0d);
        cVar.profitAmount = Double.valueOf(u.e(asJsonObject.get("profit_amount")));
        cVar.created = Long.valueOf(u.f(asJsonObject.get("created")));
        cVar.now = Long.valueOf(u.f(asJsonObject.get("now")));
        cVar.dir = u.i(asJsonObject.get("dir"));
        cVar.value = Double.valueOf(u.e(asJsonObject.get(ConditionalUserProperty.VALUE)));
        cVar.win = u.i(asJsonObject.get("win"));
        cVar.id = Long.valueOf(u.f(asJsonObject.get("id")));
        String str = "type_name";
        cVar.type = u.i(asJsonObject.get(str));
        cVar.profitIncome = Double.valueOf(u.e(asJsonObject.get("profit_income")));
        cVar.profitReturn = Double.valueOf(u.e(asJsonObject.get("profit_return")));
        cVar.activeType = ActiveType.fromServerValue(u.i(asJsonObject.get(str)));
        cVar.userBalanceId = Long.valueOf(u.f(asJsonObject.get("user_balance_id")));
        f = (double) System.currentTimeMillis();
        Double.isNaN(f);
        cVar.timeRecieved = Double.valueOf(f / 1000.0d);
        return cVar;
    }

    public static ImmutableList<c> json2options(JsonArray jsonArray) {
        ImmutableList.a sT = ImmutableList.sT();
        for (int i = 0; i < jsonArray.size(); i++) {
            sT.aI(json2option(jsonArray.get(i)));
        }
        return sT.sU();
    }

    public static c betInfo2position(long j, com.iqoption.mobbtech.connect.response.a.b bVar) {
        com.iqoption.mobbtech.connect.response.a.a bV = bVar.bV(j);
        c cVar = new c();
        cVar.id = Long.valueOf(j);
        cVar.amount = Long.valueOf((long) (bV.dII.doubleValue() * 1000000.0d));
        cVar.dir = bV.direction;
        cVar.expired = bVar.expired;
        cVar.profitAmount = bV.dIJ;
        cVar.expValue = bVar.expValue;
        cVar.created = bV.created;
        cVar.win = bV.win;
        cVar.sum = bV.dII;
        cVar.value = bV.value;
        cVar.clientPlatformId = bV.clientPlatformId;
        cVar.activeType = bV.activeType;
        cVar.now = bV.now;
        double currentTimeMillis = (double) System.currentTimeMillis();
        Double.isNaN(currentTimeMillis);
        cVar.timeRecieved = Double.valueOf(currentTimeMillis / 1000.0d);
        cVar.activeId = bVar.activeId;
        cVar.gameState = Integer.valueOf(1);
        if (bV.buybackState != null) {
            cVar.buybackState = bV.buybackState;
        }
        return cVar;
    }

    public static c history2position(JSONObject jSONObject) {
        c cVar = new c();
        String str = "type";
        cVar.type = jSONObject.optString(str).toLowerCase();
        InstrumentType toInstrumentType = cVar.activeType.toInstrumentType();
        com.iqoption.app.helpers.a Gs = com.iqoption.app.helpers.a.Gs();
        String str2 = ConditionalUserProperty.ACTIVE;
        com.iqoption.core.microservices.tradingengine.response.active.a a = Gs.a(jSONObject.optString(str2), toInstrumentType);
        if (a != null) {
            cVar.activeId = Integer.valueOf(a.getActiveId());
        }
        cVar.amount = Long.valueOf(jSONObject.optLong("amount"));
        cVar.dir = jSONObject.optString("direction");
        cVar.expired = Long.valueOf(jSONObject.optLong(Position.CLOSE_REASON_EXPIRED));
        cVar.profitAmount = Double.valueOf(jSONObject.optDouble("win_amount"));
        cVar.expValue = Double.valueOf(jSONObject.optDouble("expired_value"));
        cVar.created = Long.valueOf(jSONObject.optLong("created"));
        cVar.win = jSONObject.optString("win_status");
        cVar.sum = Double.valueOf((double) jSONObject.optInt("enrolled_amount"));
        cVar.value = Double.valueOf(jSONObject.optDouble(ConditionalUserProperty.VALUE));
        cVar.id = Long.valueOf(jSONObject.optLong("id"));
        cVar.clientPlatformId = Integer.valueOf(jSONObject.optInt("client_platform_id"));
        cVar.activeType = ActiveType.fromServerValue(jSONObject.optString(str));
        cVar.activeNameHistory = jSONObject.optString(str2);
        cVar.userBalanceId = Long.valueOf(jSONObject.optLong("user_balance_id"));
        double currentTimeMillis = (double) System.currentTimeMillis();
        Double.isNaN(currentTimeMillis);
        cVar.timeRecieved = Double.valueOf(currentTimeMillis / 1000.0d);
        return cVar;
    }

    public int compareTo(c cVar) {
        return ORDERING.compare(this, cVar);
    }

    public Double getOptionCount() {
        return Double.valueOf(1.0d);
    }

    public Double getOptionOptPrice() {
        return this.sum;
    }

    public double getSellPnl() {
        double winAmount;
        double investSum;
        if (isClosed()) {
            winAmount = getWinAmount();
            investSum = getInvestSum();
        } else {
            Double calculateBuybackAmountWithCancelable = calculateBuybackAmountWithCancelable(l.HZ().Ib());
            if (calculateBuybackAmountWithCancelable == null) {
                return 0.0d;
            }
            winAmount = calculateBuybackAmountWithCancelable.doubleValue();
            investSum = getInvestSum();
        }
        return winAmount - investSum;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.id);
        parcel.writeValue(this.userBalanceId);
        parcel.writeValue(this.userId);
        parcel.writeValue(this.activeId);
        parcel.writeValue(this.amount);
        parcel.writeValue(this.clientPlatformId);
        parcel.writeValue(this.created);
        parcel.writeValue(this.createdMillisecond);
        parcel.writeString(this.currency);
        parcel.writeString(this.currencyChar);
        parcel.writeString(this.dir);
        parcel.writeValue(this.expValue);
        parcel.writeValue(this.expired);
        parcel.writeValue(this.gameState);
        parcel.writeValue(this.isDemo);
        parcel.writeValue(this.looseAmount);
        parcel.writeValue(this.now);
        parcel.writeValue(this.optionTypeId);
        parcel.writeValue(this.profit);
        parcel.writeValue(this.profitIncome);
        parcel.writeValue(this.profitReturn);
        parcel.writeString(this.reTrack);
        parcel.writeValue(this.refund);
        parcel.writeValue(this.siteId);
        parcel.writeValue(this.sum);
        parcel.writeString(this.type);
        parcel.writeString(ActiveType.serverValue(this.activeType));
        parcel.writeValue(this.value);
        parcel.writeString(this.win);
        parcel.writeString(this.buybackState);
        parcel.writeValue(this.profitAmount);
        parcel.writeValue(this.timeRecieved);
        parcel.writeValue(this.currentProfitAmount);
    }

    protected c(Parcel parcel) {
        this.id = (Long) parcel.readValue(Long.class.getClassLoader());
        this.userBalanceId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.userId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.activeId = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.amount = (Long) parcel.readValue(Long.class.getClassLoader());
        this.clientPlatformId = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.created = (Long) parcel.readValue(Long.class.getClassLoader());
        this.createdMillisecond = (Long) parcel.readValue(Long.class.getClassLoader());
        this.currency = parcel.readString();
        this.currencyChar = parcel.readString();
        this.dir = parcel.readString();
        this.expValue = (Double) parcel.readValue(Double.class.getClassLoader());
        this.expired = (Long) parcel.readValue(Long.class.getClassLoader());
        this.gameState = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.isDemo = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.looseAmount = (Long) parcel.readValue(Long.class.getClassLoader());
        this.now = (Long) parcel.readValue(Long.class.getClassLoader());
        this.optionTypeId = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.profit = (Long) parcel.readValue(Long.class.getClassLoader());
        this.profitIncome = (Double) parcel.readValue(Double.class.getClassLoader());
        this.profitReturn = (Double) parcel.readValue(Double.class.getClassLoader());
        this.reTrack = parcel.readString();
        this.refund = (Long) parcel.readValue(Long.class.getClassLoader());
        this.siteId = (Long) parcel.readValue(Long.class.getClassLoader());
        this.sum = (Double) parcel.readValue(Double.class.getClassLoader());
        this.type = parcel.readString();
        this.activeType = ActiveType.fromServerValueNullable(parcel.readString());
        this.value = (Double) parcel.readValue(Double.class.getClassLoader());
        this.win = parcel.readString();
        this.buybackState = parcel.readString();
        this.profitAmount = (Double) parcel.readValue(Double.class.getClassLoader());
        this.timeRecieved = (Double) parcel.readValue(Double.class.getClassLoader());
        this.currentProfitAmount = (Double) parcel.readValue(Double.class.getClassLoader());
    }
}
