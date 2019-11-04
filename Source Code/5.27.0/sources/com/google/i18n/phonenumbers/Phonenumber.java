package com.google.i18n.phonenumbers;

import java.io.Serializable;

public final class Phonenumber {

    public static class PhoneNumber implements Serializable {
        private static final long serialVersionUID = 1;
        private CountryCodeSource countryCodeSource_;
        private int countryCode_ = 0;
        private String extension_;
        private boolean hasCountryCode;
        private boolean hasCountryCodeSource;
        private boolean hasExtension;
        private boolean hasItalianLeadingZero;
        private boolean hasNationalNumber;
        private boolean hasNumberOfLeadingZeros;
        private boolean hasPreferredDomesticCarrierCode;
        private boolean hasRawInput;
        private boolean italianLeadingZero_;
        private long nationalNumber_ = 0;
        private int numberOfLeadingZeros_;
        private String preferredDomesticCarrierCode_;
        private String rawInput_;

        public enum CountryCodeSource {
            FROM_NUMBER_WITH_PLUS_SIGN,
            FROM_NUMBER_WITH_IDD,
            FROM_NUMBER_WITHOUT_PLUS_SIGN,
            FROM_DEFAULT_COUNTRY,
            UNSPECIFIED
        }

        public PhoneNumber() {
            String str = "";
            this.extension_ = str;
            this.italianLeadingZero_ = false;
            this.numberOfLeadingZeros_ = 1;
            this.rawInput_ = str;
            this.preferredDomesticCarrierCode_ = str;
            this.countryCodeSource_ = CountryCodeSource.UNSPECIFIED;
        }

        public boolean yh() {
            return this.hasCountryCode;
        }

        public int xK() {
            return this.countryCode_;
        }

        public PhoneNumber cH(int i) {
            this.hasCountryCode = true;
            this.countryCode_ = i;
            return this;
        }

        public boolean yi() {
            return this.hasNationalNumber;
        }

        public long yj() {
            return this.nationalNumber_;
        }

        public PhoneNumber K(long j) {
            this.hasNationalNumber = true;
            this.nationalNumber_ = j;
            return this;
        }

        public boolean yk() {
            return this.hasExtension;
        }

        public String yl() {
            return this.extension_;
        }

        public PhoneNumber cO(String str) {
            if (str != null) {
                this.hasExtension = true;
                this.extension_ = str;
                return this;
            }
            throw new NullPointerException();
        }

        public boolean ym() {
            return this.hasItalianLeadingZero;
        }

        public boolean yn() {
            return this.italianLeadingZero_;
        }

        public PhoneNumber as(boolean z) {
            this.hasItalianLeadingZero = true;
            this.italianLeadingZero_ = z;
            return this;
        }

        public boolean yo() {
            return this.hasNumberOfLeadingZeros;
        }

        public int yp() {
            return this.numberOfLeadingZeros_;
        }

        public PhoneNumber cI(int i) {
            this.hasNumberOfLeadingZeros = true;
            this.numberOfLeadingZeros_ = i;
            return this;
        }

        public boolean yq() {
            return this.hasRawInput;
        }

        public String yr() {
            return this.rawInput_;
        }

        public PhoneNumber cP(String str) {
            if (str != null) {
                this.hasRawInput = true;
                this.rawInput_ = str;
                return this;
            }
            throw new NullPointerException();
        }

        public boolean ys() {
            return this.hasCountryCodeSource;
        }

        public CountryCodeSource yt() {
            return this.countryCodeSource_;
        }

        public PhoneNumber a(CountryCodeSource countryCodeSource) {
            if (countryCodeSource != null) {
                this.hasCountryCodeSource = true;
                this.countryCodeSource_ = countryCodeSource;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneNumber yu() {
            this.hasCountryCodeSource = false;
            this.countryCodeSource_ = CountryCodeSource.UNSPECIFIED;
            return this;
        }

        public boolean yv() {
            return this.hasPreferredDomesticCarrierCode;
        }

        public String yw() {
            return this.preferredDomesticCarrierCode_;
        }

        public PhoneNumber cQ(String str) {
            if (str != null) {
                this.hasPreferredDomesticCarrierCode = true;
                this.preferredDomesticCarrierCode_ = str;
                return this;
            }
            throw new NullPointerException();
        }

        public boolean d(PhoneNumber phoneNumber) {
            boolean z = false;
            if (phoneNumber == null) {
                return false;
            }
            if (this == phoneNumber) {
                return true;
            }
            if (this.countryCode_ == phoneNumber.countryCode_ && this.nationalNumber_ == phoneNumber.nationalNumber_ && this.extension_.equals(phoneNumber.extension_) && this.italianLeadingZero_ == phoneNumber.italianLeadingZero_ && this.numberOfLeadingZeros_ == phoneNumber.numberOfLeadingZeros_ && this.rawInput_.equals(phoneNumber.rawInput_) && this.countryCodeSource_ == phoneNumber.countryCodeSource_ && this.preferredDomesticCarrierCode_.equals(phoneNumber.preferredDomesticCarrierCode_) && yv() == phoneNumber.yv()) {
                z = true;
            }
            return z;
        }

        public boolean equals(Object obj) {
            return (obj instanceof PhoneNumber) && d((PhoneNumber) obj);
        }

        public int hashCode() {
            int i = 1231;
            int xK = (((((((((((((((2173 + xK()) * 53) + Long.valueOf(yj()).hashCode()) * 53) + yl().hashCode()) * 53) + (yn() ? 1231 : 1237)) * 53) + yp()) * 53) + yr().hashCode()) * 53) + yt().hashCode()) * 53) + yw().hashCode()) * 53;
            if (!yv()) {
                i = 1237;
            }
            return xK + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Country Code: ");
            stringBuilder.append(this.countryCode_);
            stringBuilder.append(" National Number: ");
            stringBuilder.append(this.nationalNumber_);
            if (ym() && yn()) {
                stringBuilder.append(" Leading Zero(s): true");
            }
            if (yo()) {
                stringBuilder.append(" Number of leading zeros: ");
                stringBuilder.append(this.numberOfLeadingZeros_);
            }
            if (yk()) {
                stringBuilder.append(" Extension: ");
                stringBuilder.append(this.extension_);
            }
            if (ys()) {
                stringBuilder.append(" Country Code Source: ");
                stringBuilder.append(this.countryCodeSource_);
            }
            if (yv()) {
                stringBuilder.append(" Preferred Domestic Carrier Code: ");
                stringBuilder.append(this.preferredDomesticCarrierCode_);
            }
            return stringBuilder.toString();
        }
    }
}
