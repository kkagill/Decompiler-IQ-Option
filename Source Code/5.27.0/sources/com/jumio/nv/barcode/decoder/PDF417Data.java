package com.jumio.nv.barcode.decoder;

import com.jumio.nv.barcode.enums.EyeColor;
import com.jumio.nv.enums.NVGender;
import java.util.Date;

public class PDF417Data {
    private String addressCity;
    private String addressState;
    private String addressStreet1;
    private String addressStreet2;
    private String addressZip;
    private Date dateOfBirth;
    private String endorsementCodes;
    private Date expiryDate = null;
    private EyeColor eyeColor;
    private String firstName;
    private NVGender gender;
    private String height;
    private String idNumber;
    private Date issueDate = null;
    private String issuingCountry;
    private String lastName;
    private String middleName;
    private String nameSuffix;
    private String restrictionCodes;
    private StringBuilder unparsedData;
    private String vehicleClass;

    public PDF417Data() {
        String str = "";
        this.issuingCountry = str;
        this.vehicleClass = str;
        this.restrictionCodes = str;
        this.endorsementCodes = str;
        this.firstName = str;
        this.lastName = str;
        this.middleName = str;
        this.nameSuffix = str;
        this.dateOfBirth = null;
        this.gender = null;
        this.eyeColor = null;
        this.height = str;
        this.addressStreet1 = str;
        this.addressStreet2 = str;
        this.addressCity = str;
        this.addressState = str;
        this.addressZip = str;
        this.idNumber = str;
        this.unparsedData = new StringBuilder();
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(String str) {
        this.idNumber = checkValue(str);
    }

    public Date getIssueDate() {
        return this.issueDate;
    }

    public void setIssueDate(Date date) {
        this.issueDate = date;
    }

    public Date getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(Date date) {
        this.expiryDate = date;
    }

    public String getIssuingCountry() {
        return this.issuingCountry;
    }

    public void setIssuingCountry(String str) {
        this.issuingCountry = checkValue(str);
    }

    public String getVehicleClass() {
        return this.vehicleClass;
    }

    public void setVehicleClass(String str) {
        if (str != null && !str.trim().equals("")) {
            this.vehicleClass = str.trim();
        }
    }

    public String getRestrictionCodes() {
        return this.restrictionCodes;
    }

    public void setRestrictionCodes(String str) {
        if (str != null && !str.trim().equals("")) {
            this.restrictionCodes = str.trim();
        }
    }

    public String getEndorsementCodes() {
        return this.endorsementCodes;
    }

    public void setEndorsementCodes(String str) {
        if (str != null && !str.trim().equals("")) {
            this.endorsementCodes = str.trim();
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String str) {
        this.firstName = checkValue(str.trim());
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String str) {
        this.lastName = checkValue(str.trim());
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String str) {
        this.middleName = checkValue(str.trim());
    }

    public String getNameSuffix() {
        return this.nameSuffix;
    }

    public void setNameSuffix(String str) {
        this.nameSuffix = checkValue(str.trim());
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Date date) {
        this.dateOfBirth = date;
    }

    public NVGender getGender() {
        return this.gender;
    }

    public void setGender(NVGender nVGender) {
        if (nVGender != null) {
            this.gender = nVGender;
        }
    }

    public EyeColor getEyeColor() {
        return this.eyeColor;
    }

    public void setEyeColor(EyeColor eyeColor) {
        if (eyeColor != null) {
            this.eyeColor = eyeColor;
        }
    }

    public String getHeight() {
        return this.height;
    }

    public void setHeight(String str) {
        if (str != null && !str.trim().equals("")) {
            this.height = str.trim();
        }
    }

    public String getAddressStreet1() {
        return this.addressStreet1;
    }

    public void setAddressStreet1(String str) {
        this.addressStreet1 = checkValue(str);
    }

    public String getAddressStreet2() {
        return this.addressStreet2;
    }

    public void setAddressStreet2(String str) {
        this.addressStreet2 = checkValue(str);
    }

    public String getAddressCity() {
        return this.addressCity;
    }

    public void setAddressCity(String str) {
        this.addressCity = checkValue(str);
    }

    public String getAddressState() {
        return this.addressState;
    }

    public void setAddressState(String str) {
        this.addressState = checkValue(str);
    }

    public String getAddressZip() {
        return this.addressZip;
    }

    public void setAddressZip(String str) {
        this.addressZip = checkValue(str);
    }

    public StringBuilder getUnparsedData() {
        return this.unparsedData;
    }

    public void addUnparsedData(String str, String str2) {
        StringBuilder stringBuilder = this.unparsedData;
        stringBuilder.append(str);
        stringBuilder.append(str2);
    }

    public String toString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.issueDate != null) {
            stringBuilder.append("issueDate: ");
            stringBuilder.append(this.issueDate.toString());
            stringBuilder.append(str);
        }
        if (this.expiryDate != null) {
            stringBuilder.append("expiryDate: ");
            stringBuilder.append(this.expiryDate.toString());
            stringBuilder.append(str);
        }
        String str2 = this.issuingCountry;
        String str3 = "";
        if (!(str2 == null || str2.equals(str3))) {
            stringBuilder.append("issuingCountry: ");
            stringBuilder.append(this.issuingCountry);
            stringBuilder.append(str);
        }
        str2 = this.vehicleClass;
        if (!(str2 == null || str2.equals(str3))) {
            stringBuilder.append("vehicleClass: ");
            stringBuilder.append(this.vehicleClass);
            stringBuilder.append(str);
        }
        str2 = this.restrictionCodes;
        if (!(str2 == null || str2.equals(str3))) {
            stringBuilder.append("restrictionCodes: ");
            stringBuilder.append(this.restrictionCodes);
            stringBuilder.append(str);
        }
        str2 = this.endorsementCodes;
        if (!(str2 == null || str2.equals(str3))) {
            stringBuilder.append("endorsementCodes: ");
            stringBuilder.append(this.endorsementCodes);
            stringBuilder.append(str);
        }
        str2 = this.firstName;
        if (!(str2 == null || str2.equals(str3))) {
            stringBuilder.append("firstName: ");
            stringBuilder.append(this.firstName);
            stringBuilder.append(str);
        }
        str2 = this.lastName;
        if (!(str2 == null || str2.equals(str3))) {
            stringBuilder.append("lastName: ");
            stringBuilder.append(this.lastName);
            stringBuilder.append(str);
        }
        str2 = this.middleName;
        if (!(str2 == null || str2.equals(str3))) {
            stringBuilder.append("middleName: ");
            stringBuilder.append(this.middleName);
            stringBuilder.append(str);
        }
        if (this.dateOfBirth != null) {
            stringBuilder.append("dateOfBirth: ");
            stringBuilder.append(this.dateOfBirth);
            stringBuilder.append(str);
        }
        if (this.gender != null) {
            stringBuilder.append("sex: ");
            stringBuilder.append(this.gender.name());
            stringBuilder.append(str);
        }
        if (this.eyeColor != null) {
            stringBuilder.append("eyeColor: ");
            stringBuilder.append(this.eyeColor);
            stringBuilder.append(str);
        }
        str2 = this.height;
        if (!(str2 == null || str2.equals(str3))) {
            stringBuilder.append("height: ");
            stringBuilder.append(this.height);
            stringBuilder.append(str);
        }
        str2 = this.addressStreet1;
        if (!(str2 == null || str2.equals(str3))) {
            stringBuilder.append("addressStreet1: ");
            stringBuilder.append(this.addressStreet1);
            stringBuilder.append(str);
        }
        str2 = this.addressStreet2;
        if (!(str2 == null || str2.equals(str3))) {
            stringBuilder.append("addressStreet2: ");
            stringBuilder.append(this.addressStreet2);
            stringBuilder.append(str);
        }
        str2 = this.addressCity;
        if (!(str2 == null || str2.equals(str3))) {
            stringBuilder.append("addressCity: ");
            stringBuilder.append(this.addressCity);
            stringBuilder.append(str);
        }
        str2 = this.addressState;
        if (!(str2 == null || str2.equals(str3))) {
            stringBuilder.append("addressState: ");
            stringBuilder.append(this.addressState);
            stringBuilder.append(str);
        }
        str2 = this.addressZip;
        if (!(str2 == null || str2.equals(str3))) {
            stringBuilder.append("addressZip: ");
            stringBuilder.append(this.addressZip);
            stringBuilder.append(str);
        }
        str = this.idNumber;
        if (!(str == null || str.equals(str3))) {
            stringBuilder.append("idNumber: ");
            stringBuilder.append(this.idNumber);
        }
        return stringBuilder.toString();
    }

    private String checkValue(String str) {
        String str2 = "";
        if (!(str == null || str.length() == 0)) {
            str = str.replace(",", " ").trim();
            return (str.equalsIgnoreCase("none") || str.equalsIgnoreCase("unavl")) ? str2 : str;
        }
    }

    public String toString() {
        return toString(", ");
    }
}
