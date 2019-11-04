package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "PaymentMethodTokenizationParametersCreator")
@Reserved({1})
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    public static final Creator<PaymentMethodTokenizationParameters> CREATOR = new zzai();
    @Field(id = 2)
    int zzed;
    @Field(id = 3)
    Bundle zzef = new Bundle();

    public final class Builder {
        private Builder() {
        }

        public final Builder setPaymentMethodTokenizationType(int i) {
            PaymentMethodTokenizationParameters.this.zzed = i;
            return this;
        }

        public final Builder addParameter(@NonNull String str, @NonNull String str2) {
            Preconditions.checkNotEmpty(str, "Tokenization parameter name must not be empty");
            Preconditions.checkNotEmpty(str2, "Tokenization parameter value must not be empty");
            PaymentMethodTokenizationParameters.this.zzef.putString(str, str2);
            return this;
        }

        public final PaymentMethodTokenizationParameters build() {
            return PaymentMethodTokenizationParameters.this;
        }

        /* synthetic */ Builder(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, zzah zzah) {
            this();
        }
    }

    public static Builder newBuilder() {
        return new Builder(new PaymentMethodTokenizationParameters(), null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zzed);
        SafeParcelWriter.writeBundle(parcel, 3, this.zzef, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }

    @Constructor
    PaymentMethodTokenizationParameters(@Param(id = 2) int i, @Param(id = 3) Bundle bundle) {
        this.zzed = i;
        this.zzef = bundle;
    }

    private PaymentMethodTokenizationParameters() {
    }

    public final int getPaymentMethodTokenizationType() {
        return this.zzed;
    }

    public final Bundle getParameters() {
        return new Bundle(this.zzef);
    }
}
