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
import java.util.ArrayList;
import java.util.Collection;

@Class(creator = "ShippingAddressRequirementsCreator")
public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    public static final Creator<ShippingAddressRequirements> CREATOR = new zzan();
    @Field(id = 1)
    ArrayList<String> zzen;

    public final class Builder {
        private Builder() {
        }

        public final Builder addAllowedCountryCode(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "allowedCountryCode can't be null or empty! If you don't have restrictions, just leave it unset.");
            if (ShippingAddressRequirements.this.zzen == null) {
                ShippingAddressRequirements.this.zzen = new ArrayList();
            }
            ShippingAddressRequirements.this.zzen.add(str);
            return this;
        }

        public final Builder addAllowedCountryCodes(@NonNull Collection<String> collection) {
            if (collection == null || collection.isEmpty()) {
                throw new IllegalArgumentException("allowedCountryCodes can't be null or empty! If you don't have restrictions, just leave it unset.");
            }
            if (ShippingAddressRequirements.this.zzen == null) {
                ShippingAddressRequirements.this.zzen = new ArrayList();
            }
            ShippingAddressRequirements.this.zzen.addAll(collection);
            return this;
        }

        public final ShippingAddressRequirements build() {
            return ShippingAddressRequirements.this;
        }

        /* synthetic */ Builder(ShippingAddressRequirements shippingAddressRequirements, zzam zzam) {
            this();
        }
    }

    @Constructor
    ShippingAddressRequirements(@Param(id = 1) ArrayList<String> arrayList) {
        this.zzen = arrayList;
    }

    private ShippingAddressRequirements() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.zzen, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }

    @Nullable
    public final ArrayList<String> getAllowedCountryCodes() {
        return this.zzen;
    }

    public static Builder newBuilder() {
        return new Builder(new ShippingAddressRequirements(), null);
    }
}
