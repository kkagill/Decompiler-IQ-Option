package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "TransactionInfoCreator")
public final class TransactionInfo extends AbstractSafeParcelable {
    public static final Creator<TransactionInfo> CREATOR = new zzap();
    @Field(id = 2)
    String zzao;
    @Field(id = 3)
    String zzap;
    @Field(id = 1)
    int zzep;

    public final class Builder {
        private Builder() {
        }

        public final Builder setTotalPriceStatus(int i) {
            TransactionInfo.this.zzep = i;
            return this;
        }

        public final Builder setTotalPrice(@NonNull String str) {
            TransactionInfo.this.zzao = str;
            return this;
        }

        public final Builder setCurrencyCode(@NonNull String str) {
            TransactionInfo.this.zzap = str;
            return this;
        }

        public final TransactionInfo build() {
            Preconditions.checkNotEmpty(TransactionInfo.this.zzap, "currencyCode must be set!");
            Object obj = 1;
            if (!(TransactionInfo.this.zzep == 1 || TransactionInfo.this.zzep == 2 || TransactionInfo.this.zzep == 3)) {
                obj = null;
            }
            if (obj != null) {
                if (TransactionInfo.this.zzep == 2) {
                    Preconditions.checkNotEmpty(TransactionInfo.this.zzao, "An estimated total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_ESTIMATED!");
                }
                if (TransactionInfo.this.zzep == 3) {
                    Preconditions.checkNotEmpty(TransactionInfo.this.zzao, "An final total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_FINAL!");
                }
                return TransactionInfo.this;
            }
            throw new IllegalArgumentException("totalPriceStatus must be set to one of WalletConstants.TotalPriceStatus!");
        }

        /* synthetic */ Builder(TransactionInfo transactionInfo, zzao zzao) {
            this();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzep);
        SafeParcelWriter.writeString(parcel, 2, this.zzao, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzap, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }

    @Constructor
    public TransactionInfo(@Param(id = 1) int i, @Param(id = 2) String str, @Param(id = 3) String str2) {
        this.zzep = i;
        this.zzao = str;
        this.zzap = str2;
    }

    private TransactionInfo() {
    }

    public static Builder newBuilder() {
        return new Builder(new TransactionInfo(), null);
    }

    public final int getTotalPriceStatus() {
        return this.zzep;
    }

    @Nullable
    public final String getTotalPrice() {
        return this.zzao;
    }

    public final String getCurrencyCode() {
        return this.zzap;
    }
}
