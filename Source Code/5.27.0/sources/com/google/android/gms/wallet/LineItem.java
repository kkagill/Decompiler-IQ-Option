package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "LineItemCreator")
@Reserved({1})
public final class LineItem extends AbstractSafeParcelable {
    public static final Creator<LineItem> CREATOR = new zzt();
    @Field(id = 2)
    String description;
    @Field(id = 5)
    String zzao;
    @Field(id = 7)
    String zzap;
    @Field(id = 3)
    String zzcb;
    @Field(id = 4)
    String zzcc;
    @Field(defaultValueUnchecked = "com.google.android.gms.wallet.LineItem.Role.REGULAR", id = 6)
    int zzcd;

    public final class Builder {
        private Builder() {
        }

        public final Builder setDescription(String str) {
            LineItem.this.description = str;
            return this;
        }

        public final Builder setQuantity(String str) {
            LineItem.this.zzcb = str;
            return this;
        }

        public final Builder setUnitPrice(String str) {
            LineItem.this.zzcc = str;
            return this;
        }

        public final Builder setTotalPrice(String str) {
            LineItem.this.zzao = str;
            return this;
        }

        public final Builder setRole(int i) {
            LineItem.this.zzcd = i;
            return this;
        }

        public final Builder setCurrencyCode(String str) {
            LineItem.this.zzap = str;
            return this;
        }

        public final LineItem build() {
            return LineItem.this;
        }

        /* synthetic */ Builder(LineItem lineItem, zzs zzs) {
            this();
        }
    }

    public interface Role {
        public static final int REGULAR = 0;
        public static final int SHIPPING = 2;
        public static final int TAX = 1;
    }

    public static Builder newBuilder() {
        return new Builder(new LineItem(), null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.description, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzcb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzcc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzao, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzcd);
        SafeParcelWriter.writeString(parcel, 7, this.zzap, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }

    @Constructor
    LineItem(@Param(id = 2) String str, @Param(id = 3) String str2, @Param(id = 4) String str3, @Param(id = 5) String str4, @Param(id = 6) int i, @Param(id = 7) String str5) {
        this.description = str;
        this.zzcb = str2;
        this.zzcc = str3;
        this.zzao = str4;
        this.zzcd = i;
        this.zzap = str5;
    }

    LineItem() {
        this.zzcd = 0;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getQuantity() {
        return this.zzcb;
    }

    public final String getUnitPrice() {
        return this.zzcc;
    }

    public final String getTotalPrice() {
        return this.zzao;
    }

    public final int getRole() {
        return this.zzcd;
    }

    public final String getCurrencyCode() {
        return this.zzap;
    }
}
