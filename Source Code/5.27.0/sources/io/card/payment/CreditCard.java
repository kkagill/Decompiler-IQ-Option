package io.card.payment;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.UUID;

public class CreditCard implements Parcelable {
    public static final Creator<CreditCard> CREATOR = new Creator<CreditCard>() {
        /* renamed from: aH */
        public CreditCard createFromParcel(Parcel parcel) {
            return new CreditCard(parcel, null);
        }

        /* renamed from: jh */
        public CreditCard[] newArray(int i) {
            return new CreditCard[i];
        }
    };
    public static final int EXPIRY_MAX_FUTURE_YEARS = 15;
    private static final String TAG = "CreditCard";
    public String cardNumber;
    public String cardholderName;
    public String cvv;
    public int expiryMonth;
    public int expiryYear;
    boolean flipped;
    public String postalCode;
    String scanId;
    int[] xoff;
    int yoff;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ CreditCard(Parcel parcel, AnonymousClass1 anonymousClass1) {
        this(parcel);
    }

    public CreditCard() {
        this.expiryMonth = 0;
        this.expiryYear = 0;
        this.flipped = false;
        this.xoff = new int[16];
        this.scanId = UUID.randomUUID().toString();
    }

    public CreditCard(String str, int i, int i2, String str2, String str3, String str4) {
        this.expiryMonth = 0;
        this.expiryYear = 0;
        this.flipped = false;
        this.cardNumber = str;
        this.expiryMonth = i;
        this.expiryYear = i2;
        this.cvv = str2;
        this.postalCode = str3;
        this.cardholderName = str4;
    }

    private CreditCard(Parcel parcel) {
        this.expiryMonth = 0;
        this.expiryYear = 0;
        this.flipped = false;
        this.cardNumber = parcel.readString();
        this.expiryMonth = parcel.readInt();
        this.expiryYear = parcel.readInt();
        this.cvv = parcel.readString();
        this.postalCode = parcel.readString();
        this.cardholderName = parcel.readString();
        this.scanId = parcel.readString();
        this.yoff = parcel.readInt();
        this.xoff = parcel.createIntArray();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.cardNumber);
        parcel.writeInt(this.expiryMonth);
        parcel.writeInt(this.expiryYear);
        parcel.writeString(this.cvv);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.cardholderName);
        parcel.writeString(this.scanId);
        parcel.writeInt(this.yoff);
        parcel.writeIntArray(this.xoff);
    }

    public String getLastFourDigitsOfCardNumber() {
        String str = this.cardNumber;
        if (str == null) {
            return "";
        }
        int min = Math.min(4, str.length());
        String str2 = this.cardNumber;
        return str2.substring(str2.length() - min);
    }

    public String getRedactedCardNumber() {
        String str = this.cardNumber;
        String str2 = "";
        if (str == null) {
            return str2;
        }
        StringBuilder stringBuilder;
        if (str.length() > 4) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("%");
            stringBuilder2.append(this.cardNumber.length() - 4);
            stringBuilder2.append("s");
            stringBuilder.append(String.format(stringBuilder2.toString(), new Object[]{str2}).replace(' ', 8226));
            str2 = stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(getLastFourDigitsOfCardNumber());
        return c.a(stringBuilder.toString(), false, CardType.fromCardNumber(this.cardNumber));
    }

    public CardType getCardType() {
        return CardType.fromCardNumber(this.cardNumber);
    }

    public String getFormattedCardNumber() {
        return c.kZ(this.cardNumber);
    }

    public boolean isExpiryValid() {
        return c.aV(this.expiryMonth, this.expiryYear);
    }

    public String toString() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("{");
        stringBuilder2.append(getCardType());
        stringBuilder2.append(": ");
        stringBuilder2.append(getRedactedCardNumber());
        String stringBuilder3 = stringBuilder2.toString();
        if (this.expiryMonth > 0 || this.expiryYear > 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder.append("  expiry:");
            stringBuilder.append(this.expiryMonth);
            stringBuilder.append("/");
            stringBuilder.append(this.expiryYear);
            stringBuilder3 = stringBuilder.toString();
        }
        if (this.postalCode != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder.append("  postalCode:");
            stringBuilder.append(this.postalCode);
            stringBuilder3 = stringBuilder.toString();
        }
        if (this.cardholderName != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder.append("  cardholderName:");
            stringBuilder.append(this.cardholderName);
            stringBuilder3 = stringBuilder.toString();
        }
        if (this.cvv != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder3);
            stringBuilder.append("  cvvLength:");
            stringBuilder3 = this.cvv;
            stringBuilder.append(stringBuilder3 != null ? stringBuilder3.length() : 0);
            stringBuilder3 = stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(stringBuilder3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
