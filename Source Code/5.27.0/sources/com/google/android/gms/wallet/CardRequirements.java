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

@Class(creator = "CardRequirementsCreator")
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Creator<CardRequirements> CREATOR = new zze();
    @Field(id = 1)
    ArrayList<Integer> zzaj;
    @Field(defaultValue = "true", id = 2)
    boolean zzak;
    @Field(id = 3)
    boolean zzal;
    @Field(id = 4)
    int zzam;

    public final class Builder {
        private Builder() {
        }

        public final Builder addAllowedCardNetwork(int i) {
            if (CardRequirements.this.zzaj == null) {
                CardRequirements.this.zzaj = new ArrayList();
            }
            CardRequirements.this.zzaj.add(Integer.valueOf(i));
            return this;
        }

        public final Builder addAllowedCardNetworks(@NonNull Collection<Integer> collection) {
            boolean z = (collection == null || collection.isEmpty()) ? false : true;
            Preconditions.checkArgument(z, "allowedCardNetworks can't be null or empty! You must provide a valid value from WalletConstants.CardNetwork.");
            if (CardRequirements.this.zzaj == null) {
                CardRequirements.this.zzaj = new ArrayList();
            }
            CardRequirements.this.zzaj.addAll(collection);
            return this;
        }

        public final Builder setAllowPrepaidCards(boolean z) {
            CardRequirements.this.zzak = z;
            return this;
        }

        public final Builder setBillingAddressRequired(boolean z) {
            CardRequirements.this.zzal = z;
            return this;
        }

        public final Builder setBillingAddressFormat(int i) {
            CardRequirements.this.zzam = i;
            return this;
        }

        public final CardRequirements build() {
            Preconditions.checkNotNull(CardRequirements.this.zzaj, "Allowed card networks must be non-empty! You can set it through addAllowedCardNetwork() or addAllowedCardNetworks() in the CardRequirements Builder.");
            return CardRequirements.this;
        }

        /* synthetic */ Builder(CardRequirements cardRequirements, zzd zzd) {
            this();
        }
    }

    @Constructor
    CardRequirements(@Param(id = 1) ArrayList<Integer> arrayList, @Param(id = 2) boolean z, @Param(id = 3) boolean z2, @Param(id = 4) int i) {
        this.zzaj = arrayList;
        this.zzak = z;
        this.zzal = z2;
        this.zzam = i;
    }

    private CardRequirements() {
        this.zzak = true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 1, this.zzaj, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzak);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzal);
        SafeParcelWriter.writeInt(parcel, 4, this.zzam);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }

    @Nullable
    public final ArrayList<Integer> getAllowedCardNetworks() {
        return this.zzaj;
    }

    public final boolean allowPrepaidCards() {
        return this.zzak;
    }

    public final boolean isBillingAddressRequired() {
        return this.zzal;
    }

    public final int getBillingAddressFormat() {
        return this.zzam;
    }

    public static Builder newBuilder() {
        return new Builder(new CardRequirements(), null);
    }
}
