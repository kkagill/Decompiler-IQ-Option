package com.iqoption.dto;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.common.base.j;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Currencies {
    public static final String BTC_CURRENCY = "BTC";
    public static final int BTC_CURRENCY_ID = 44;
    public static final int DEFAULT_CRYPTO_MINOR_UNITS = 6;
    public static final int DEFAULT_FIAT_MINOR_UNITS = 2;
    public static final String ETH_CURRENCY = "ETH";
    public static final int ETH_CURRENCY_ID = 46;
    public static final String EUR_CURRENCY = "EUR";
    public static final String OTM_CURRENCY = "OTM";
    public static final int OTM_CURRENCY_ID = 47;
    public static final String OTN_CURRENCY = "OTN";
    public static final int OTN_CURRENCY_ID = 45;
    public static final String REPLACE_CURRENCY_MASK = "%s";
    public static final transient j<Currency> isRegistration = -$$Lambda$Currencies$jqoKsB5Me048e_IqPBLrN_Ai_XA.INSTANCE;
    @SerializedName("isSuccessful")
    public Boolean isSuccessful = Boolean.valueOf(false);
    @SerializedName("result")
    public List<Currency> result;

    public static class ConversionCurrency implements Parcelable {
        public static final Creator<ConversionCurrency> CREATOR = new Creator<ConversionCurrency>() {
            public ConversionCurrency createFromParcel(Parcel parcel) {
                return new ConversionCurrency(parcel);
            }

            public ConversionCurrency[] newArray(int i) {
                return new ConversionCurrency[i];
            }
        };
        @SerializedName("id")
        public Integer id;
        @SerializedName("mask")
        public String mask;
        @SerializedName("max_deal_amount")
        private Double maxDealAmount;
        @SerializedName("min_deal_amount")
        private Double minDealAmount;
        @SerializedName("minor_units")
        public Integer minorUnits;
        @SerializedName("name")
        public String name;
        @SerializedName("rate")
        public Double rate;
        @SerializedName("rate_usd")
        public Double rateUsd;
        @SerializedName("symbol")
        public String symbol;
        @SerializedName("unit")
        public Double unit;

        public static class List extends ArrayList<ConversionCurrency> {
        }

        public int describeContents() {
            return 0;
        }

        public int getMinorUnits() {
            Integer num = this.minorUnits;
            return num == null ? 2 : num.intValue();
        }

        public String getName() {
            String str = this.name;
            return str == null ? "" : str;
        }

        public String getMask() {
            if (TextUtils.isEmpty(this.mask)) {
                return Currencies.REPLACE_CURRENCY_MASK;
            }
            return this.mask;
        }

        public String getSymbol() {
            String str = this.symbol;
            return str == null ? "" : str;
        }

        public Double getMinDealAmount() {
            Double d = this.minDealAmount;
            return Double.valueOf(d == null ? 1.0d : d.doubleValue());
        }

        public Double getMaxDealAmount() {
            Double d = this.maxDealAmount;
            return Double.valueOf(d == null ? Double.MAX_VALUE : d.doubleValue());
        }

        public boolean equals(Object obj) {
            return obj == this || ((obj instanceof ConversionCurrency) && this.id == null ? ((ConversionCurrency) obj).id != null : !this.id.equals(((ConversionCurrency) obj).id));
        }

        public int hashCode() {
            Integer num = this.id;
            return num == null ? 0 : num.hashCode();
        }

        public String toString() {
            String str = this.name;
            return str != null ? str : "";
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeValue(this.id);
            parcel.writeString(this.name);
            parcel.writeString(this.mask);
            parcel.writeString(this.symbol);
            parcel.writeValue(this.unit);
            parcel.writeValue(this.rate);
            parcel.writeValue(this.rateUsd);
            parcel.writeValue(this.minorUnits);
            parcel.writeValue(this.minDealAmount);
            parcel.writeValue(this.maxDealAmount);
        }

        protected ConversionCurrency(Parcel parcel) {
            this.id = (Integer) parcel.readValue(Integer.class.getClassLoader());
            this.name = parcel.readString();
            this.mask = parcel.readString();
            this.symbol = parcel.readString();
            this.unit = (Double) parcel.readValue(Double.class.getClassLoader());
            this.rate = (Double) parcel.readValue(Double.class.getClassLoader());
            this.rateUsd = (Double) parcel.readValue(Double.class.getClassLoader());
            this.minorUnits = (Integer) parcel.readValue(Integer.class.getClassLoader());
            this.minDealAmount = (Double) parcel.readValue(Double.class.getClassLoader());
            this.maxDealAmount = (Double) parcel.readValue(Double.class.getClassLoader());
        }
    }

    public static class Currency implements Parcelable {
        public static final Creator<Currency> CREATOR = new Creator<Currency>() {
            public Currency createFromParcel(Parcel parcel) {
                return new Currency(parcel);
            }

            public Currency[] newArray(int i) {
                return new Currency[i];
            }
        };
        @SerializedName("id")
        public Integer id;
        @SerializedName("is_default")
        public Boolean isDefault;
        @SerializedName("registration")
        public Boolean isRegistration;
        @SerializedName("mask")
        public String mask;
        @SerializedName("min_investment")
        public Double minInvestment;
        @SerializedName("name")
        public String name;
        @SerializedName("symbol")
        public String symbol;

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return obj == this || ((obj instanceof Currency) && this.id == null ? ((Currency) obj).id != null : !this.id.equals(((Currency) obj).id));
        }

        public int hashCode() {
            Integer num = this.id;
            return num == null ? 0 : num.hashCode();
        }

        public String toString() {
            String str = this.name;
            return str != null ? str : "";
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeValue(this.id);
            parcel.writeString(this.name);
            parcel.writeString(this.mask);
            parcel.writeString(this.symbol);
            parcel.writeValue(this.isDefault);
            parcel.writeValue(this.minInvestment);
            parcel.writeValue(this.isRegistration);
        }

        protected Currency(Parcel parcel) {
            this.id = (Integer) parcel.readValue(Integer.class.getClassLoader());
            this.name = parcel.readString();
            this.mask = parcel.readString();
            this.symbol = parcel.readString();
            this.isDefault = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
            this.minInvestment = (Double) parcel.readValue(Double.class.getClassLoader());
            this.isRegistration = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        }
    }

    public String toString() {
        List list = this.result;
        return list == null ? "result: null" : Arrays.toString(list.toArray());
    }

    public Currency getDefault() {
        List<Currency> list = this.result;
        if (list == null) {
            return null;
        }
        for (Currency currency : list) {
            if (currency.isDefault.booleanValue()) {
                return currency;
            }
        }
        return null;
    }
}
