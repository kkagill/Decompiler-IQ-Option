package com.jumio.nv.data.country;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.NonNull;
import com.jumio.nv.IsoCountryConverter;
import com.jumio.nv.data.document.DocumentType;
import java.io.Serializable;
import java.text.CollationKey;
import java.text.Collator;
import java.util.Locale;

public class Country implements Parcelable, Serializable, Comparable<Country> {
    public static final Creator<Country> CREATOR = new Creator<Country>() {
        /* renamed from: a */
        public Country createFromParcel(Parcel parcel) {
            return new Country(parcel);
        }

        /* renamed from: a */
        public Country[] newArray(int i) {
            return new Country[i];
        }
    };
    private String a;
    private String b;

    public boolean canUseTemplateMatcher(Context context, DocumentType documentType) {
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean prepareTemplateMatcher(Context context, DocumentType documentType) {
        return false;
    }

    public Country(String str, boolean z) {
        String str2 = "";
        this.a = str2;
        this.b = str2;
        String convertToAlpha2 = str.length() == 3 ? IsoCountryConverter.convertToAlpha2(str) : str;
        if (convertToAlpha2 == null) {
            convertToAlpha2 = str2;
        }
        if (z) {
            a(str, new Locale(str2, convertToAlpha2).getDisplayCountry());
        } else {
            a(str, new Locale(str2, convertToAlpha2).getDisplayCountry(Locale.ENGLISH));
        }
    }

    public Country(String str) {
        this(str, true);
    }

    public Country(String str, String str2) {
        String str3 = "";
        this.a = str3;
        this.b = str3;
        a(str, str2);
    }

    public Country(Parcel parcel) {
        String str = "";
        this.a = str;
        this.b = str;
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    private void a(String str, String str2) {
        this.a = str;
        if (str2.equals("")) {
            this.b = str;
        } else {
            this.b = str2;
        }
    }

    public CollationKey getCollationKey() {
        return Collator.getInstance().getCollationKey(this.b);
    }

    public String getIsoCode() {
        return this.a;
    }

    public void setIsoCode(String str) {
        this.a = str;
    }

    public String getName() {
        return this.b;
    }

    public void setName(String str) {
        this.b = str;
    }

    public int compareTo(@NonNull Country country) {
        return Collator.getInstance().getCollationKey(this.b).compareTo(country.getCollationKey());
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Country)) {
            return false;
        }
        Country country = (Country) obj;
        if (country.b.equals(this.b) && country.getIsoCode().equals(this.a)) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public String toString() {
        return String.format("%s (%s)", new Object[]{this.b, this.a});
    }
}
