package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public final class Phonemetadata {

    public static class NumberFormat implements Externalizable {
        private static final long serialVersionUID = 1;
        private String domesticCarrierCodeFormattingRule_;
        private String format_;
        private boolean hasDomesticCarrierCodeFormattingRule;
        private boolean hasFormat;
        private boolean hasNationalPrefixFormattingRule;
        private boolean hasNationalPrefixOptionalWhenFormatting;
        private boolean hasPattern;
        private List<String> leadingDigitsPattern_ = new ArrayList();
        private String nationalPrefixFormattingRule_;
        private boolean nationalPrefixOptionalWhenFormatting_;
        private String pattern_;

        public NumberFormat() {
            String str = "";
            this.pattern_ = str;
            this.format_ = str;
            this.nationalPrefixFormattingRule_ = str;
            this.nationalPrefixOptionalWhenFormatting_ = false;
            this.domesticCarrierCodeFormattingRule_ = str;
        }

        public String getPattern() {
            return this.pattern_;
        }

        public NumberFormat cA(String str) {
            this.hasPattern = true;
            this.pattern_ = str;
            return this;
        }

        public String getFormat() {
            return this.format_;
        }

        public NumberFormat cB(String str) {
            this.hasFormat = true;
            this.format_ = str;
            return this;
        }

        public int xu() {
            return this.leadingDigitsPattern_.size();
        }

        public String cE(int i) {
            return (String) this.leadingDigitsPattern_.get(i);
        }

        public String xv() {
            return this.nationalPrefixFormattingRule_;
        }

        public NumberFormat cC(String str) {
            this.hasNationalPrefixFormattingRule = true;
            this.nationalPrefixFormattingRule_ = str;
            return this;
        }

        public boolean xw() {
            return this.nationalPrefixOptionalWhenFormatting_;
        }

        public NumberFormat an(boolean z) {
            this.hasNationalPrefixOptionalWhenFormatting = true;
            this.nationalPrefixOptionalWhenFormatting_ = z;
            return this;
        }

        public boolean xx() {
            return this.hasDomesticCarrierCodeFormattingRule;
        }

        public String xy() {
            return this.domesticCarrierCodeFormattingRule_;
        }

        public NumberFormat cD(String str) {
            this.hasDomesticCarrierCodeFormattingRule = true;
            this.domesticCarrierCodeFormattingRule_ = str;
            return this;
        }

        public void writeExternal(ObjectOutput objectOutput) {
            objectOutput.writeUTF(this.pattern_);
            objectOutput.writeUTF(this.format_);
            int xu = xu();
            objectOutput.writeInt(xu);
            for (int i = 0; i < xu; i++) {
                objectOutput.writeUTF((String) this.leadingDigitsPattern_.get(i));
            }
            objectOutput.writeBoolean(this.hasNationalPrefixFormattingRule);
            if (this.hasNationalPrefixFormattingRule) {
                objectOutput.writeUTF(this.nationalPrefixFormattingRule_);
            }
            objectOutput.writeBoolean(this.hasDomesticCarrierCodeFormattingRule);
            if (this.hasDomesticCarrierCodeFormattingRule) {
                objectOutput.writeUTF(this.domesticCarrierCodeFormattingRule_);
            }
            objectOutput.writeBoolean(this.nationalPrefixOptionalWhenFormatting_);
        }

        public void readExternal(ObjectInput objectInput) {
            cA(objectInput.readUTF());
            cB(objectInput.readUTF());
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                this.leadingDigitsPattern_.add(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                cC(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                cD(objectInput.readUTF());
            }
            an(objectInput.readBoolean());
        }
    }

    public static class PhoneMetadata implements Externalizable {
        private static final long serialVersionUID = 1;
        private PhoneNumberDesc carrierSpecific_ = null;
        private int countryCode_;
        private PhoneNumberDesc emergency_ = null;
        private PhoneNumberDesc fixedLine_ = null;
        private PhoneNumberDesc generalDesc_ = null;
        private boolean hasCarrierSpecific;
        private boolean hasCountryCode;
        private boolean hasEmergency;
        private boolean hasFixedLine;
        private boolean hasGeneralDesc;
        private boolean hasId;
        private boolean hasInternationalPrefix;
        private boolean hasLeadingDigits;
        private boolean hasLeadingZeroPossible;
        private boolean hasMainCountryForCode;
        private boolean hasMobile;
        private boolean hasMobileNumberPortableRegion;
        private boolean hasNationalPrefix;
        private boolean hasNationalPrefixForParsing;
        private boolean hasNationalPrefixTransformRule;
        private boolean hasNoInternationalDialling;
        private boolean hasPager;
        private boolean hasPersonalNumber;
        private boolean hasPreferredExtnPrefix;
        private boolean hasPreferredInternationalPrefix;
        private boolean hasPremiumRate;
        private boolean hasSameMobileAndFixedLinePattern;
        private boolean hasSharedCost;
        private boolean hasShortCode;
        private boolean hasSmsServices;
        private boolean hasStandardRate;
        private boolean hasTollFree;
        private boolean hasUan;
        private boolean hasVoicemail;
        private boolean hasVoip;
        private String id_;
        private String internationalPrefix_;
        private List<NumberFormat> intlNumberFormat_;
        private String leadingDigits_;
        private boolean leadingZeroPossible_;
        private boolean mainCountryForCode_;
        private boolean mobileNumberPortableRegion_;
        private PhoneNumberDesc mobile_ = null;
        private String nationalPrefixForParsing_;
        private String nationalPrefixTransformRule_;
        private String nationalPrefix_;
        private PhoneNumberDesc noInternationalDialling_ = null;
        private List<NumberFormat> numberFormat_;
        private PhoneNumberDesc pager_ = null;
        private PhoneNumberDesc personalNumber_ = null;
        private String preferredExtnPrefix_;
        private String preferredInternationalPrefix_;
        private PhoneNumberDesc premiumRate_ = null;
        private boolean sameMobileAndFixedLinePattern_;
        private PhoneNumberDesc sharedCost_ = null;
        private PhoneNumberDesc shortCode_ = null;
        private PhoneNumberDesc smsServices_ = null;
        private PhoneNumberDesc standardRate_ = null;
        private PhoneNumberDesc tollFree_ = null;
        private PhoneNumberDesc uan_ = null;
        private PhoneNumberDesc voicemail_ = null;
        private PhoneNumberDesc voip_ = null;

        public PhoneMetadata() {
            String str = "";
            this.id_ = str;
            this.countryCode_ = 0;
            this.internationalPrefix_ = str;
            this.preferredInternationalPrefix_ = str;
            this.nationalPrefix_ = str;
            this.preferredExtnPrefix_ = str;
            this.nationalPrefixForParsing_ = str;
            this.nationalPrefixTransformRule_ = str;
            this.sameMobileAndFixedLinePattern_ = false;
            this.numberFormat_ = new ArrayList();
            this.intlNumberFormat_ = new ArrayList();
            this.mainCountryForCode_ = false;
            this.leadingDigits_ = str;
            this.leadingZeroPossible_ = false;
            this.mobileNumberPortableRegion_ = false;
        }

        public PhoneNumberDesc xz() {
            return this.generalDesc_;
        }

        public PhoneMetadata b(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasGeneralDesc = true;
                this.generalDesc_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneNumberDesc xA() {
            return this.fixedLine_;
        }

        public PhoneMetadata c(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasFixedLine = true;
                this.fixedLine_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneNumberDesc xB() {
            return this.mobile_;
        }

        public PhoneMetadata d(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasMobile = true;
                this.mobile_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneNumberDesc xC() {
            return this.tollFree_;
        }

        public PhoneMetadata e(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasTollFree = true;
                this.tollFree_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneNumberDesc xD() {
            return this.premiumRate_;
        }

        public PhoneMetadata f(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasPremiumRate = true;
                this.premiumRate_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneNumberDesc xE() {
            return this.sharedCost_;
        }

        public PhoneMetadata g(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasSharedCost = true;
                this.sharedCost_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneNumberDesc xF() {
            return this.personalNumber_;
        }

        public PhoneMetadata h(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasPersonalNumber = true;
                this.personalNumber_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneNumberDesc xG() {
            return this.voip_;
        }

        public PhoneMetadata i(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasVoip = true;
                this.voip_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneNumberDesc xH() {
            return this.pager_;
        }

        public PhoneMetadata j(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasPager = true;
                this.pager_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneNumberDesc xI() {
            return this.uan_;
        }

        public PhoneMetadata k(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasUan = true;
                this.uan_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneMetadata l(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasEmergency = true;
                this.emergency_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneNumberDesc xJ() {
            return this.voicemail_;
        }

        public PhoneMetadata m(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasVoicemail = true;
                this.voicemail_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneMetadata n(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasShortCode = true;
                this.shortCode_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneMetadata o(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasStandardRate = true;
                this.standardRate_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneMetadata p(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasCarrierSpecific = true;
                this.carrierSpecific_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneMetadata q(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasSmsServices = true;
                this.smsServices_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneMetadata r(PhoneNumberDesc phoneNumberDesc) {
            if (phoneNumberDesc != null) {
                this.hasNoInternationalDialling = true;
                this.noInternationalDialling_ = phoneNumberDesc;
                return this;
            }
            throw new NullPointerException();
        }

        public PhoneMetadata cE(String str) {
            this.hasId = true;
            this.id_ = str;
            return this;
        }

        public int xK() {
            return this.countryCode_;
        }

        public PhoneMetadata cF(int i) {
            this.hasCountryCode = true;
            this.countryCode_ = i;
            return this;
        }

        public String xL() {
            return this.internationalPrefix_;
        }

        public PhoneMetadata cF(String str) {
            this.hasInternationalPrefix = true;
            this.internationalPrefix_ = str;
            return this;
        }

        public PhoneMetadata cG(String str) {
            this.hasPreferredInternationalPrefix = true;
            this.preferredInternationalPrefix_ = str;
            return this;
        }

        public PhoneMetadata cH(String str) {
            this.hasNationalPrefix = true;
            this.nationalPrefix_ = str;
            return this;
        }

        public boolean xM() {
            return this.hasPreferredExtnPrefix;
        }

        public String xN() {
            return this.preferredExtnPrefix_;
        }

        public PhoneMetadata cI(String str) {
            this.hasPreferredExtnPrefix = true;
            this.preferredExtnPrefix_ = str;
            return this;
        }

        public boolean xO() {
            return this.hasNationalPrefixForParsing;
        }

        public String xP() {
            return this.nationalPrefixForParsing_;
        }

        public PhoneMetadata cJ(String str) {
            this.hasNationalPrefixForParsing = true;
            this.nationalPrefixForParsing_ = str;
            return this;
        }

        public String xQ() {
            return this.nationalPrefixTransformRule_;
        }

        public PhoneMetadata cK(String str) {
            this.hasNationalPrefixTransformRule = true;
            this.nationalPrefixTransformRule_ = str;
            return this;
        }

        public boolean xR() {
            return this.sameMobileAndFixedLinePattern_;
        }

        public PhoneMetadata ao(boolean z) {
            this.hasSameMobileAndFixedLinePattern = true;
            this.sameMobileAndFixedLinePattern_ = z;
            return this;
        }

        public List<NumberFormat> xS() {
            return this.numberFormat_;
        }

        public int xT() {
            return this.numberFormat_.size();
        }

        public List<NumberFormat> xU() {
            return this.intlNumberFormat_;
        }

        public int xV() {
            return this.intlNumberFormat_.size();
        }

        public PhoneMetadata ap(boolean z) {
            this.hasMainCountryForCode = true;
            this.mainCountryForCode_ = z;
            return this;
        }

        public boolean xW() {
            return this.hasLeadingDigits;
        }

        public String xX() {
            return this.leadingDigits_;
        }

        public PhoneMetadata cL(String str) {
            this.hasLeadingDigits = true;
            this.leadingDigits_ = str;
            return this;
        }

        public PhoneMetadata aq(boolean z) {
            this.hasLeadingZeroPossible = true;
            this.leadingZeroPossible_ = z;
            return this;
        }

        public PhoneMetadata ar(boolean z) {
            this.hasMobileNumberPortableRegion = true;
            this.mobileNumberPortableRegion_ = z;
            return this;
        }

        public void writeExternal(ObjectOutput objectOutput) {
            objectOutput.writeBoolean(this.hasGeneralDesc);
            if (this.hasGeneralDesc) {
                this.generalDesc_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasFixedLine);
            if (this.hasFixedLine) {
                this.fixedLine_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasMobile);
            if (this.hasMobile) {
                this.mobile_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasTollFree);
            if (this.hasTollFree) {
                this.tollFree_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasPremiumRate);
            if (this.hasPremiumRate) {
                this.premiumRate_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasSharedCost);
            if (this.hasSharedCost) {
                this.sharedCost_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasPersonalNumber);
            if (this.hasPersonalNumber) {
                this.personalNumber_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasVoip);
            if (this.hasVoip) {
                this.voip_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasPager);
            if (this.hasPager) {
                this.pager_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasUan);
            if (this.hasUan) {
                this.uan_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasEmergency);
            if (this.hasEmergency) {
                this.emergency_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasVoicemail);
            if (this.hasVoicemail) {
                this.voicemail_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasShortCode);
            if (this.hasShortCode) {
                this.shortCode_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasStandardRate);
            if (this.hasStandardRate) {
                this.standardRate_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasCarrierSpecific);
            if (this.hasCarrierSpecific) {
                this.carrierSpecific_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasSmsServices);
            if (this.hasSmsServices) {
                this.smsServices_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasNoInternationalDialling);
            if (this.hasNoInternationalDialling) {
                this.noInternationalDialling_.writeExternal(objectOutput);
            }
            objectOutput.writeUTF(this.id_);
            objectOutput.writeInt(this.countryCode_);
            objectOutput.writeUTF(this.internationalPrefix_);
            objectOutput.writeBoolean(this.hasPreferredInternationalPrefix);
            if (this.hasPreferredInternationalPrefix) {
                objectOutput.writeUTF(this.preferredInternationalPrefix_);
            }
            objectOutput.writeBoolean(this.hasNationalPrefix);
            if (this.hasNationalPrefix) {
                objectOutput.writeUTF(this.nationalPrefix_);
            }
            objectOutput.writeBoolean(this.hasPreferredExtnPrefix);
            if (this.hasPreferredExtnPrefix) {
                objectOutput.writeUTF(this.preferredExtnPrefix_);
            }
            objectOutput.writeBoolean(this.hasNationalPrefixForParsing);
            if (this.hasNationalPrefixForParsing) {
                objectOutput.writeUTF(this.nationalPrefixForParsing_);
            }
            objectOutput.writeBoolean(this.hasNationalPrefixTransformRule);
            if (this.hasNationalPrefixTransformRule) {
                objectOutput.writeUTF(this.nationalPrefixTransformRule_);
            }
            objectOutput.writeBoolean(this.sameMobileAndFixedLinePattern_);
            int xT = xT();
            objectOutput.writeInt(xT);
            for (int i = 0; i < xT; i++) {
                ((NumberFormat) this.numberFormat_.get(i)).writeExternal(objectOutput);
            }
            xT = xV();
            objectOutput.writeInt(xT);
            for (int i2 = 0; i2 < xT; i2++) {
                ((NumberFormat) this.intlNumberFormat_.get(i2)).writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.mainCountryForCode_);
            objectOutput.writeBoolean(this.hasLeadingDigits);
            if (this.hasLeadingDigits) {
                objectOutput.writeUTF(this.leadingDigits_);
            }
            objectOutput.writeBoolean(this.leadingZeroPossible_);
            objectOutput.writeBoolean(this.mobileNumberPortableRegion_);
        }

        public void readExternal(ObjectInput objectInput) {
            PhoneNumberDesc phoneNumberDesc;
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                b(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                c(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                d(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                e(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                f(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                g(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                h(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                i(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                j(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                k(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                l(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                m(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                n(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                o(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                p(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                q(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                r(phoneNumberDesc);
            }
            cE(objectInput.readUTF());
            cF(objectInput.readInt());
            cF(objectInput.readUTF());
            if (objectInput.readBoolean()) {
                cG(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                cH(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                cI(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                cJ(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                cK(objectInput.readUTF());
            }
            ao(objectInput.readBoolean());
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                NumberFormat numberFormat = new NumberFormat();
                numberFormat.readExternal(objectInput);
                this.numberFormat_.add(numberFormat);
            }
            readInt = objectInput.readInt();
            for (int i2 = 0; i2 < readInt; i2++) {
                NumberFormat numberFormat2 = new NumberFormat();
                numberFormat2.readExternal(objectInput);
                this.intlNumberFormat_.add(numberFormat2);
            }
            ap(objectInput.readBoolean());
            if (objectInput.readBoolean()) {
                cL(objectInput.readUTF());
            }
            aq(objectInput.readBoolean());
            ar(objectInput.readBoolean());
        }
    }

    public static class PhoneMetadataCollection implements Externalizable {
        private static final long serialVersionUID = 1;
        private List<PhoneMetadata> metadata_ = new ArrayList();

        public List<PhoneMetadata> xY() {
            return this.metadata_;
        }

        public int xZ() {
            return this.metadata_.size();
        }

        public void writeExternal(ObjectOutput objectOutput) {
            int xZ = xZ();
            objectOutput.writeInt(xZ);
            for (int i = 0; i < xZ; i++) {
                ((PhoneMetadata) this.metadata_.get(i)).writeExternal(objectOutput);
            }
        }

        public void readExternal(ObjectInput objectInput) {
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                PhoneMetadata phoneMetadata = new PhoneMetadata();
                phoneMetadata.readExternal(objectInput);
                this.metadata_.add(phoneMetadata);
            }
        }
    }

    public static class PhoneNumberDesc implements Externalizable {
        private static final long serialVersionUID = 1;
        private String exampleNumber_;
        private boolean hasExampleNumber;
        private boolean hasNationalNumberPattern;
        private String nationalNumberPattern_;
        private List<Integer> possibleLengthLocalOnly_ = new ArrayList();
        private List<Integer> possibleLength_ = new ArrayList();

        public PhoneNumberDesc() {
            String str = "";
            this.nationalNumberPattern_ = str;
            this.exampleNumber_ = str;
        }

        public String ya() {
            return this.nationalNumberPattern_;
        }

        public PhoneNumberDesc cM(String str) {
            this.hasNationalNumberPattern = true;
            this.nationalNumberPattern_ = str;
            return this;
        }

        public List<Integer> yb() {
            return this.possibleLength_;
        }

        public int yc() {
            return this.possibleLength_.size();
        }

        public int cG(int i) {
            return ((Integer) this.possibleLength_.get(i)).intValue();
        }

        public List<Integer> yd() {
            return this.possibleLengthLocalOnly_;
        }

        public int ye() {
            return this.possibleLengthLocalOnly_.size();
        }

        public boolean yf() {
            return this.hasExampleNumber;
        }

        public String yg() {
            return this.exampleNumber_;
        }

        public PhoneNumberDesc cN(String str) {
            this.hasExampleNumber = true;
            this.exampleNumber_ = str;
            return this;
        }

        public void writeExternal(ObjectOutput objectOutput) {
            objectOutput.writeBoolean(this.hasNationalNumberPattern);
            if (this.hasNationalNumberPattern) {
                objectOutput.writeUTF(this.nationalNumberPattern_);
            }
            int yc = yc();
            objectOutput.writeInt(yc);
            for (int i = 0; i < yc; i++) {
                objectOutput.writeInt(((Integer) this.possibleLength_.get(i)).intValue());
            }
            yc = ye();
            objectOutput.writeInt(yc);
            for (int i2 = 0; i2 < yc; i2++) {
                objectOutput.writeInt(((Integer) this.possibleLengthLocalOnly_.get(i2)).intValue());
            }
            objectOutput.writeBoolean(this.hasExampleNumber);
            if (this.hasExampleNumber) {
                objectOutput.writeUTF(this.exampleNumber_);
            }
        }

        public void readExternal(ObjectInput objectInput) {
            if (objectInput.readBoolean()) {
                cM(objectInput.readUTF());
            }
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                this.possibleLength_.add(Integer.valueOf(objectInput.readInt()));
            }
            readInt = objectInput.readInt();
            for (int i2 = 0; i2 < readInt; i2++) {
                this.possibleLengthLocalOnly_.add(Integer.valueOf(objectInput.readInt()));
            }
            if (objectInput.readBoolean()) {
                cN(objectInput.readUTF());
            }
        }
    }
}
