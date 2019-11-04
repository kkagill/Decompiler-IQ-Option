package com.jumio.bam;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.jumio.bam.enums.CreditCardType;
import java.util.Arrays;
import java.util.HashMap;
import jumio.bam.w;

public class BamCardInformation implements Parcelable {
    public static final Creator<BamCardInformation> CREATOR = new Creator<BamCardInformation>() {
        /* renamed from: a */
        public BamCardInformation createFromParcel(Parcel parcel) {
            return new BamCardInformation(parcel);
        }

        /* renamed from: a */
        public BamCardInformation[] newArray(int i) {
            return new BamCardInformation[i];
        }
    };
    protected char[] cardAccountNumber;
    protected boolean cardAccountNumberValid = false;
    protected char[] cardCvvCode;
    protected char[] cardExpiryDate;
    protected char[] cardExpiryDateMonth;
    protected char[] cardExpiryDateYear;
    protected char[] cardHolderName;
    protected char[] cardNumber;
    protected char[] cardNumberGrouped;
    protected char[] cardNumberMasked;
    protected char[] cardSortCode;
    protected boolean cardSortCodeValid = false;
    protected CreditCardType cardType = CreditCardType.UNKNOWN;
    protected HashMap<String, String> customFields = new HashMap();

    public int describeContents() {
        return 0;
    }

    protected BamCardInformation() {
    }

    public BamCardInformation(Parcel parcel) {
        boolean z = false;
        this.cardNumber = new char[parcel.readInt()];
        parcel.readCharArray(this.cardNumber);
        this.cardNumberGrouped = new char[parcel.readInt()];
        parcel.readCharArray(this.cardNumberGrouped);
        this.cardNumberMasked = new char[parcel.readInt()];
        parcel.readCharArray(this.cardNumberMasked);
        this.cardHolderName = new char[parcel.readInt()];
        parcel.readCharArray(this.cardHolderName);
        this.cardSortCode = new char[parcel.readInt()];
        parcel.readCharArray(this.cardSortCode);
        this.cardAccountNumber = new char[parcel.readInt()];
        parcel.readCharArray(this.cardAccountNumber);
        this.cardType = (CreditCardType) parcel.readSerializable();
        this.cardExpiryDateMonth = new char[parcel.readInt()];
        parcel.readCharArray(this.cardExpiryDateMonth);
        this.cardExpiryDateYear = new char[parcel.readInt()];
        parcel.readCharArray(this.cardExpiryDateYear);
        this.cardCvvCode = new char[parcel.readInt()];
        parcel.readCharArray(this.cardCvvCode);
        this.customFields = (HashMap) parcel.readSerializable();
        this.cardAccountNumberValid = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.cardSortCodeValid = z;
    }

    public void clear() {
        char[] cArr = this.cardNumber;
        if (cArr != null) {
            Arrays.fill(cArr, 0);
            this.cardNumber = null;
        }
        cArr = this.cardNumberGrouped;
        if (cArr != null) {
            Arrays.fill(cArr, 0);
            this.cardNumberGrouped = null;
        }
        cArr = this.cardNumberMasked;
        if (cArr != null) {
            Arrays.fill(cArr, 0);
            this.cardNumberMasked = null;
        }
        cArr = this.cardHolderName;
        if (cArr != null) {
            Arrays.fill(cArr, 0);
            this.cardHolderName = null;
        }
        cArr = this.cardSortCode;
        if (cArr != null) {
            Arrays.fill(cArr, 0);
            this.cardSortCode = null;
            this.cardSortCodeValid = false;
        }
        cArr = this.cardAccountNumber;
        if (cArr != null) {
            Arrays.fill(cArr, 0);
            this.cardAccountNumber = null;
            this.cardAccountNumberValid = false;
        }
        cArr = this.cardExpiryDateMonth;
        if (cArr != null) {
            Arrays.fill(cArr, 0);
            this.cardExpiryDateMonth = null;
        }
        cArr = this.cardExpiryDateYear;
        if (cArr != null) {
            Arrays.fill(cArr, 0);
            this.cardExpiryDateYear = null;
        }
        cArr = this.cardExpiryDate;
        if (cArr != null) {
            Arrays.fill(cArr, 0);
            this.cardExpiryDate = null;
        }
        cArr = this.cardCvvCode;
        if (cArr != null) {
            Arrays.fill(cArr, 0);
            this.cardCvvCode = null;
        }
        this.cardType = CreditCardType.UNKNOWN;
    }

    public boolean isCleared() {
        char[] cArr = this.cardNumber;
        return cArr == null || cArr.length == 0;
    }

    public char[] getCardNumber() {
        char[] cArr = this.cardNumber;
        return cArr == null ? new char[0] : cArr;
    }

    public char[] getCardNumberGrouped() {
        char[] cArr = this.cardNumberGrouped;
        return cArr == null ? new char[0] : cArr;
    }

    public char[] getCardNumberMasked() {
        char[] cArr = this.cardNumberMasked;
        return cArr == null ? new char[0] : cArr;
    }

    public char[] getCardHolderName() {
        char[] cArr = this.cardHolderName;
        return cArr == null ? new char[0] : cArr;
    }

    public char[] getCardSortCode() {
        char[] cArr = this.cardSortCode;
        return cArr == null ? new char[0] : cArr;
    }

    public boolean isCardSortCodeValid() {
        return this.cardSortCodeValid;
    }

    public char[] getCardAccountNumber() {
        char[] cArr = this.cardAccountNumber;
        return cArr == null ? new char[0] : cArr;
    }

    public boolean isCardAccountNumberValid() {
        return this.cardAccountNumberValid;
    }

    public CreditCardType getCardType() {
        return this.cardType;
    }

    public char[] getCardExpiryDate() {
        if (getCardExpiryDateMonth().length == 0 || getCardExpiryDateYear().length == 0) {
            return new char[0];
        }
        if (this.cardExpiryDate == null) {
            this.cardExpiryDate = new char[5];
        }
        System.arraycopy(getCardExpiryDateMonth(), 0, this.cardExpiryDate, 0, getCardExpiryDateMonth().length);
        this.cardExpiryDate[2] = '/';
        System.arraycopy(getCardExpiryDateYear(), 0, this.cardExpiryDate, 3, getCardExpiryDateYear().length);
        return this.cardExpiryDate;
    }

    public char[] getCardExpiryDateMonth() {
        char[] cArr = this.cardExpiryDateMonth;
        return cArr == null ? new char[0] : cArr;
    }

    public char[] getCardExpiryDateYear() {
        char[] cArr = this.cardExpiryDateYear;
        return cArr == null ? new char[0] : cArr;
    }

    public char[] getCardCvvCode() {
        char[] cArr = this.cardCvvCode;
        return cArr == null ? new char[0] : cArr;
    }

    public String getCustomField(String str) {
        return (String) this.customFields.get(str);
    }

    public void writeToParcel(Parcel parcel, int i) {
        char[] cArr = this.cardNumber;
        parcel.writeInt(cArr != null ? cArr.length : 0);
        cArr = this.cardNumber;
        if (cArr == null) {
            cArr = new char[0];
        }
        parcel.writeCharArray(cArr);
        cArr = this.cardNumberGrouped;
        parcel.writeInt(cArr != null ? cArr.length : 0);
        cArr = this.cardNumberGrouped;
        if (cArr == null) {
            cArr = new char[0];
        }
        parcel.writeCharArray(cArr);
        cArr = this.cardNumberMasked;
        parcel.writeInt(cArr != null ? cArr.length : 0);
        cArr = this.cardNumberMasked;
        if (cArr == null) {
            cArr = new char[0];
        }
        parcel.writeCharArray(cArr);
        cArr = this.cardHolderName;
        parcel.writeInt(cArr != null ? cArr.length : 0);
        cArr = this.cardHolderName;
        if (cArr == null) {
            cArr = new char[0];
        }
        parcel.writeCharArray(cArr);
        cArr = this.cardSortCode;
        parcel.writeInt(cArr != null ? cArr.length : 0);
        cArr = this.cardSortCode;
        if (cArr == null) {
            cArr = new char[0];
        }
        parcel.writeCharArray(cArr);
        cArr = this.cardAccountNumber;
        parcel.writeInt(cArr != null ? cArr.length : 0);
        cArr = this.cardAccountNumber;
        if (cArr == null) {
            cArr = new char[0];
        }
        parcel.writeCharArray(cArr);
        parcel.writeSerializable(this.cardType);
        cArr = this.cardExpiryDateMonth;
        parcel.writeInt(cArr != null ? cArr.length : 0);
        cArr = this.cardExpiryDateMonth;
        if (cArr == null) {
            cArr = new char[0];
        }
        parcel.writeCharArray(cArr);
        cArr = this.cardExpiryDateYear;
        parcel.writeInt(cArr != null ? cArr.length : 0);
        cArr = this.cardExpiryDateYear;
        if (cArr == null) {
            cArr = new char[0];
        }
        parcel.writeCharArray(cArr);
        cArr = this.cardCvvCode;
        parcel.writeInt(cArr != null ? cArr.length : 0);
        cArr = this.cardCvvCode;
        if (cArr == null) {
            cArr = new char[0];
        }
        parcel.writeCharArray(cArr);
        parcel.writeSerializable(this.customFields);
        parcel.writeInt(this.cardAccountNumberValid);
        parcel.writeInt(this.cardSortCodeValid);
    }

    protected static BamCardInformation create(w wVar) {
        BamCardInformation bamCardInformation = new BamCardInformation();
        bamCardInformation.cardNumber = copyField(wVar.cardNumber);
        bamCardInformation.cardNumberGrouped = copyField(wVar.cardNumberGrouped);
        bamCardInformation.cardNumberMasked = copyField(wVar.cardNumberMasked);
        bamCardInformation.cardExpiryDateMonth = copyField(wVar.cardExpiryDateMonth);
        bamCardInformation.cardExpiryDateYear = copyField(wVar.cardExpiryDateYear);
        bamCardInformation.cardCvvCode = copyField(wVar.cardCvvCode);
        bamCardInformation.cardHolderName = copyField(wVar.cardHolderName);
        bamCardInformation.cardSortCode = copyField(wVar.cardSortCode);
        bamCardInformation.cardAccountNumber = copyField(wVar.cardAccountNumber);
        bamCardInformation.cardType = wVar.cardType;
        bamCardInformation.customFields = (HashMap) wVar.customFields.clone();
        bamCardInformation.cardSortCodeValid = wVar.cardSortCodeValid;
        bamCardInformation.cardAccountNumberValid = wVar.cardAccountNumberValid;
        return bamCardInformation;
    }

    protected static char[] copyField(char[] cArr) {
        return cArr != null ? Arrays.copyOf(cArr, cArr.length) : null;
    }
}
