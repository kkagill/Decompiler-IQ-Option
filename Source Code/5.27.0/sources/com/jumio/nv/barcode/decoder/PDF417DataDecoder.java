package com.jumio.nv.barcode.decoder;

import android.annotation.SuppressLint;
import com.jumio.commons.log.Log;
import com.jumio.nv.barcode.decoder.exception.PDF417DecoderException;
import com.jumio.nv.barcode.enums.EyeColor;
import com.jumio.nv.enums.NVGender;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"SimpleDateFormat"})
public class PDF417DataDecoder {
    private static final String ADDRESS_CITY = "DAI";
    private static final String ADDRESS_CITY_2000 = "DAN";
    private static final String ADDRESS_STATE = "DAJ";
    private static final String ADDRESS_STATE_2000 = "DAO";
    private static final String ADDRESS_STREET_1 = "DAG";
    private static final String ADDRESS_STREET_1_2000 = "DAL";
    private static final String ADDRESS_STREET_2 = "DAH";
    private static final String ADDRESS_STREET_2_2000 = "DAM";
    private static final String ADDRESS_ZIP = "DAK";
    private static final String ADDRESS_ZIP_2000 = "DAP";
    private static final String COMPLIANCE_INDICATOR = "@";
    private static final int COMPLIANCE_INDICATOR_LENGTH = 1;
    private static final String DATE_OF_BIRTH = "DBB";
    private static final String ENDORSEMENT_CODES = "DCD";
    private static final String EXPIRY_DATE = "DBA";
    private static final String EYE_COLOR = "DAY";
    private static final String EYE_COLOR_BLACK = "BLK";
    private static final String EYE_COLOR_BLUE = "BLU";
    private static final String EYE_COLOR_BROWN = "BRO";
    private static final String EYE_COLOR_BROWN_LEGACY_1 = "BR";
    private static final String EYE_COLOR_BROWN_LEGACY_2 = "BRN";
    private static final String EYE_COLOR_DICHROMATIC = "DIC";
    private static final String EYE_COLOR_GRAY = "GRY";
    private static final String EYE_COLOR_GREEN = "GRN";
    private static final String EYE_COLOR_HAZEL = "HAZ";
    private static final String EYE_COLOR_HAZEL_LEGACY_1 = "HZL";
    private static final String EYE_COLOR_MAROON = "MAR";
    private static final String EYE_COLOR_PINK = "PNK";
    private static final String EYE_COLOR_UNKNOWN = "UNK";
    private static final String FALLBACK_RECORD_SEPARATOR = ",";
    private static final String FIRST_NAME = "DAC";
    private static final String GIVEN_NAME = "DCT";
    private static final String HEADER_REGEX = "@([\\x00-\\x1F\\x21-\\x40\\x5B-\\xFF]{2,3})[A-Z ]*([0-9]{6})([0-9]{2})[0-9]*";
    private static final String HEIGHT = "DAU";
    private static final String ID_NUMBER = "DAQ";
    private static final String IIN_COLORADO = "636020";
    private static final String ISSUE_DATE = "DBD";
    private static final String ISSUING_COUNTRY = "DCG";
    private static final String LAST_NAME = "DCS";
    private static final String LAST_NAME_2000 = "DAB";
    private static final int MAGSTRIPE_ADDRESS_MAX_LENGTH = 29;
    private static final int MAGSTRIPE_CDS_VERSION_LENGTH = 1;
    private static final int MAGSTRIPE_CITY_MAX_LENGTH = 13;
    private static final int MAGSTRIPE_CLASS_LENGTH = 2;
    private static final int MAGSTRIPE_DATE_OF_BIRTH_LENGTH = 8;
    private static final int MAGSTRIPE_ENDORSEMENTS_LENGTH = 4;
    private static final int MAGSTRIPE_EXPIRY_DATE_LENGTH = 4;
    private static final String MAGSTRIPE_FIELD_SEPERATOR = "^";
    private static final String MAGSTRIPE_IDNO_SEPERATOR = "=";
    private static final int MAGSTRIPE_IIN_LENGTH = 6;
    private static final int MAGSTRIPE_JURISDICATION_VERSION_LENGTH = 1;
    private static final String MAGSTRIPE_LINE_SEPERATOR = "\\$";
    private static final int MAGSTRIPE_NAME_MAX_LENGTH = 35;
    private static final int MAGSTRIPE_POSTAL_CODE_LENGTH = 11;
    private static final int MAGSTRIPE_RESTRICTION_LENGTH = 10;
    private static final int MAGSTRIPE_SEX_LENGTH = 1;
    private static final int MAGSTRIPE_STATE_LENGTH = 2;
    private static final String MAGSTRIPE_TRACK1_START = "%";
    private static final String MAGSTRIPE_TRACK2_START = ";";
    private static final String MAGSTRIPE_TRACK3_START = "%";
    private static final String MIDDLE_NAME = "DAD";
    private static final String NAME = "DAA";
    private static final String NAME_SUFFIX = "DCU";
    private static final String RESTRICTION_CODES = "DCB";
    private static final String SEX = "DBC";
    private static final String SUBFILE_DESIGNATOR_REGEX = "^((?:[A-Z]{2}[0-9]{8})*)";
    private static final String SUBFILE_TYPE_REGEX = "([A-Z]{2})";
    private static final String VEHICLE_CLASS = "DCA";
    private final String FORMAT_DDMM = "ddMM";
    private final String FORMAT_MMDD = "MMdd";
    private final String FORMAT_YYYY = "yyyy";
    private final String REGEX_DDMM = "^(?:0[1-9]|[12][0-9]|3[01])(?:0[1-9]|1[0-2])$";
    private final String REGEX_MMDD = "^(?:0[1-9]|1[0-2])(?:0[1-9]|[12][0-9]|3[01])$";
    private final String REGEX_YYYY = "^(?:(?:19|20)\\d{2})$";
    private int aamvaVersion;
    private PDF417Data data;
    private SimpleDateFormat dateFormat = null;
    private char[] delimiter;
    private int index;
    private String issuerIdentificationNumber;
    private String rawData;
    private ArrayList<String> subfiles;

    public PDF417DataDecoder() {
        String str = "";
        this.rawData = str;
        this.issuerIdentificationNumber = str;
        this.aamvaVersion = -1;
        this.index = 0;
        this.data = null;
        this.dateFormat = new SimpleDateFormat();
        this.subfiles = new ArrayList();
    }

    @SuppressLint({"NewApi"})
    public PDF417Data decode(byte[] bArr, Charset charset) {
        return decode(new String(bArr, charset));
    }

    public PDF417Data decode(String str) {
        if (str != null) {
            this.rawData = str;
            int i = this.index;
            if (str.substring(i, i + 1).equals(COMPLIANCE_INDICATOR)) {
                this.index++;
                parseHeader();
                parseSubfileDesignator();
                parseBarcode();
            } else {
                parseMagstripe();
                manipulateMagstripeData();
            }
            manipulateData();
            return this.data;
        }
        throw new PDF417DecoderException("Empty data");
    }

    private void parseHeader() {
        String str = HEADER_REGEX;
        Matcher matcher = Pattern.compile(str).matcher(this.rawData);
        if (matcher.find()) {
            String group = matcher.group(1);
            this.delimiter = new char[group.length()];
            group.getChars(0, group.length(), this.delimiter, 0);
            this.issuerIdentificationNumber = matcher.group(2);
            this.aamvaVersion = Integer.parseInt(matcher.group(3));
        }
        this.rawData = this.rawData.replaceAll(str, "");
        this.index = 0;
    }

    private void parseSubfileDesignator() {
        String str = SUBFILE_DESIGNATOR_REGEX;
        Matcher matcher = Pattern.compile(str).matcher(this.rawData);
        this.subfiles.clear();
        if (matcher.find()) {
            matcher = Pattern.compile(SUBFILE_TYPE_REGEX).matcher(matcher.group(1));
            while (matcher.find()) {
                this.subfiles.add(matcher.group(1));
            }
        }
        this.rawData = this.rawData.replaceAll(str, "");
        this.index = 0;
    }

    private int getNearestSeparator() {
        if (this.delimiter != null) {
            String str = this.rawData;
            if (str != null) {
                if (this.index >= str.length()) {
                    return -1;
                }
                int length = this.rawData.length();
                int i = 0;
                while (true) {
                    char[] cArr = this.delimiter;
                    if (i >= cArr.length) {
                        return length;
                    }
                    int indexOf = this.rawData.indexOf(cArr[i], this.index);
                    if (indexOf < length && indexOf != -1) {
                        length = indexOf;
                    }
                    i++;
                }
            }
        }
        throw new PDF417DecoderException("Delimiter or rawdata not set");
    }

    private void parseBarcode() {
        this.data = new PDF417Data();
        int nearestSeparator = getNearestSeparator();
        while (nearestSeparator != -1) {
            String substring = this.rawData.substring(this.index, nearestSeparator);
            for (int i = 0; i < this.subfiles.size(); i++) {
                if (substring.startsWith((String) this.subfiles.get(i))) {
                    substring = substring.substring(((String) this.subfiles.get(i)).length());
                    break;
                }
            }
            boolean startsWith = substring.startsWith(NAME);
            String str = " ";
            String str2 = FALLBACK_RECORD_SEPARATOR;
            if (startsWith) {
                substring = substring.substring(3);
                int i2 = 2;
                String[] split;
                if (substring.contains(str2)) {
                    split = substring.split(str2);
                    if (this.aamvaVersion == 1) {
                        if (IIN_COLORADO.equals(this.issuerIdentificationNumber)) {
                            if (split.length > 0) {
                                this.data.setFirstName(split[0]);
                            }
                            if (split.length > 2) {
                                this.data.setMiddleName(split[1]);
                            }
                            if (split.length > 1) {
                                this.data.setLastName(split[split.length - 1]);
                            }
                        }
                    }
                    if (split.length > 0) {
                        this.data.setLastName(split[0]);
                    }
                    if (split.length > 1) {
                        this.data.setFirstName(split[1]);
                    }
                    if (split.length > 2) {
                        this.data.setMiddleName(split[2]);
                    }
                } else {
                    split = substring.split(str);
                    if (split.length > 0) {
                        if (split.length == 1) {
                            this.data.setLastName(split[0]);
                        } else if (split.length == 2) {
                            this.data.setFirstName(split[0]);
                            this.data.setLastName(split[1]);
                        } else {
                            this.data.setFirstName(split[0]);
                            this.data.setMiddleName(split[1]);
                            StringBuilder stringBuilder = new StringBuilder();
                            while (i2 < split.length) {
                                stringBuilder.append(split[i2]);
                                stringBuilder.append(str);
                                i2++;
                            }
                            this.data.setLastName(stringBuilder.toString());
                        }
                    }
                }
            } else if (substring.startsWith(FIRST_NAME)) {
                this.data.setFirstName(substring.substring(3));
            } else if (substring.startsWith(GIVEN_NAME)) {
                this.data.setFirstName(substring.substring(3).replaceAll(str2, str));
            } else if (substring.startsWith(LAST_NAME) || substring.startsWith(LAST_NAME_2000)) {
                this.data.setLastName(substring.substring(3));
            } else if (substring.startsWith(MIDDLE_NAME)) {
                this.data.setMiddleName(substring.substring(3));
            } else if (substring.startsWith(NAME_SUFFIX)) {
                this.data.setNameSuffix(substring.substring(3));
            } else if (substring.startsWith(SEX)) {
                substring = substring.substring(3);
                if ("M".equals(substring) || "1".equals(substring)) {
                    this.data.setGender(NVGender.M);
                } else if ("F".equals(substring) || "2".equals(substring)) {
                    this.data.setGender(NVGender.F);
                }
            } else if (substring.startsWith(DATE_OF_BIRTH)) {
                this.data.setDateOfBirth(parseDate(substring.substring(3), true));
            } else if (substring.startsWith(EYE_COLOR)) {
                substring = substring.substring(3);
                if (substring.equals(EYE_COLOR_BLACK)) {
                    this.data.setEyeColor(EyeColor.BLACK);
                } else if (substring.equals(EYE_COLOR_BLUE)) {
                    this.data.setEyeColor(EyeColor.BLUE);
                } else if (substring.equals(EYE_COLOR_BROWN) || substring.equals(EYE_COLOR_BROWN_LEGACY_1) || substring.equals(EYE_COLOR_BROWN_LEGACY_2)) {
                    this.data.setEyeColor(EyeColor.BROWN);
                } else if (substring.equals(EYE_COLOR_GRAY)) {
                    this.data.setEyeColor(EyeColor.GRAY);
                } else if (substring.equals(EYE_COLOR_GREEN)) {
                    this.data.setEyeColor(EyeColor.GREEN);
                } else if (substring.equals(EYE_COLOR_HAZEL) || substring.equals(EYE_COLOR_HAZEL_LEGACY_1)) {
                    this.data.setEyeColor(EyeColor.HAZEL);
                } else if (substring.equals(EYE_COLOR_MAROON)) {
                    this.data.setEyeColor(EyeColor.MAROON);
                } else if (substring.equals(EYE_COLOR_PINK)) {
                    this.data.setEyeColor(EyeColor.PINK);
                } else if (substring.equals(EYE_COLOR_DICHROMATIC)) {
                    this.data.setEyeColor(EyeColor.DICHROMATIC);
                } else if (substring.equals(EYE_COLOR_UNKNOWN)) {
                    this.data.setEyeColor(EyeColor.UNKNOWN);
                }
            } else if (substring.startsWith(HEIGHT)) {
                this.data.setHeight(substring.substring(3));
            } else if (substring.startsWith(ADDRESS_STREET_1) || substring.startsWith(ADDRESS_STREET_1_2000)) {
                this.data.setAddressStreet1(substring.substring(3));
            } else if (substring.startsWith(ADDRESS_STREET_2) || substring.startsWith(ADDRESS_STREET_2_2000)) {
                this.data.setAddressStreet2(substring.substring(3));
            } else if (substring.startsWith(ADDRESS_CITY) || substring.startsWith(ADDRESS_CITY_2000)) {
                this.data.setAddressCity(substring.substring(3));
            } else if (substring.startsWith(ADDRESS_STATE) || substring.startsWith(ADDRESS_STATE_2000)) {
                this.data.setAddressState(substring.substring(3));
            } else if (substring.startsWith(ADDRESS_ZIP) || substring.startsWith(ADDRESS_ZIP_2000)) {
                this.data.setAddressZip(substring.substring(3));
            } else if (substring.startsWith(ID_NUMBER)) {
                this.data.setIdNumber(substring.substring(3));
            } else if (substring.startsWith(ISSUING_COUNTRY)) {
                this.data.setIssuingCountry(substring.substring(3));
            } else if (substring.startsWith(ISSUE_DATE)) {
                this.data.setIssueDate(parseDate(substring.substring(3), true));
            } else if (substring.startsWith(EXPIRY_DATE)) {
                this.data.setExpiryDate(parseDate(substring.substring(3), false));
            } else if (substring.startsWith(VEHICLE_CLASS)) {
                this.data.setVehicleClass(substring.substring(3));
            } else if (substring.startsWith(RESTRICTION_CODES)) {
                this.data.setRestrictionCodes(substring.substring(3));
            } else if (substring.startsWith(ENDORSEMENT_CODES)) {
                this.data.setEndorsementCodes(substring.substring(3));
            } else {
                this.data.addUnparsedData(substring, "\n");
            }
            this.index = nearestSeparator + 1;
            nearestSeparator = getNearestSeparator();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fa A:{Catch:{ Exception -> 0x0246 }} */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0105 A:{Catch:{ Exception -> 0x0246 }} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0114 A:{Catch:{ Exception -> 0x0246 }} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0125 A:{Catch:{ Exception -> 0x0246 }} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01cb A:{Catch:{ Exception -> 0x0246 }} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x021b A:{Catch:{ Exception -> 0x0246 }} */
    private com.jumio.nv.barcode.decoder.PDF417Data parseMagstripe() {
        /*
        r15 = this;
        r0 = "\\$";
        r1 = "";
        r2 = "[^A-Za-z\\- \\']";
        r3 = "%";
        r4 = "^";
        r5 = new com.jumio.nv.barcode.decoder.PDF417Data;	 Catch:{ Exception -> 0x0246 }
        r5.<init>();	 Catch:{ Exception -> 0x0246 }
        r15.data = r5;	 Catch:{ Exception -> 0x0246 }
        r5 = 0;
        r15.index = r5;	 Catch:{ Exception -> 0x0246 }
        r6 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r6 = r6.startsWith(r3);	 Catch:{ Exception -> 0x0246 }
        r7 = 1;
        if (r6 == 0) goto L_0x0022;
    L_0x001d:
        r6 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r6 = r6 + r7;
        r15.index = r6;	 Catch:{ Exception -> 0x0246 }
    L_0x0022:
        r6 = r15.data;	 Catch:{ Exception -> 0x0246 }
        r8 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r9 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r10 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r11 = 2;
        r10 = r10 + r11;
        r8 = r8.substring(r9, r10);	 Catch:{ Exception -> 0x0246 }
        r6.setAddressState(r8);	 Catch:{ Exception -> 0x0246 }
        r6 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r6 = r6 + r11;
        r15.index = r6;	 Catch:{ Exception -> 0x0246 }
        r6 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r8 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r6 = r6.indexOf(r4, r8);	 Catch:{ Exception -> 0x0246 }
        r8 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r6 = r6 - r8;
        r8 = 13;
        if (r6 >= r8) goto L_0x0049;
    L_0x0047:
        r9 = 1;
        goto L_0x004a;
    L_0x0049:
        r9 = 0;
    L_0x004a:
        if (r9 == 0) goto L_0x004f;
    L_0x004c:
        r8 = r8 - r6;
        r8 = r8 + r5;
        goto L_0x0052;
    L_0x004f:
        r6 = 13;
        r8 = 0;
    L_0x0052:
        r10 = r15.data;	 Catch:{ Exception -> 0x0246 }
        r12 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r13 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r14 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r14 = r14 + r6;
        r12 = r12.substring(r13, r14);	 Catch:{ Exception -> 0x0246 }
        r10.setAddressCity(r12);	 Catch:{ Exception -> 0x0246 }
        r10 = r15.index;	 Catch:{ Exception -> 0x0246 }
        if (r9 == 0) goto L_0x0068;
    L_0x0066:
        r9 = 1;
        goto L_0x0069;
    L_0x0068:
        r9 = 0;
    L_0x0069:
        r6 = r6 + r9;
        r10 = r10 + r6;
        r15.index = r10;	 Catch:{ Exception -> 0x0246 }
        r6 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r9 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r6 = r6.indexOf(r4, r9);	 Catch:{ Exception -> 0x0246 }
        r9 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r6 = r6 - r9;
        r9 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r10 = 35;
        r9 = r9 + r10;
        if (r6 >= r9) goto L_0x0081;
    L_0x007f:
        r9 = 1;
        goto L_0x0082;
    L_0x0081:
        r9 = 0;
    L_0x0082:
        if (r9 == 0) goto L_0x0087;
    L_0x0084:
        r10 = r10 - r6;
        r8 = r8 + r10;
        goto L_0x0089;
    L_0x0087:
        r6 = 35;
    L_0x0089:
        r10 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r12 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r13 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r13 = r13 + r6;
        r10 = r10.substring(r12, r13);	 Catch:{ Exception -> 0x0246 }
        r10 = r10.split(r0);	 Catch:{ Exception -> 0x0246 }
        r12 = r15.data;	 Catch:{ Exception -> 0x0246 }
        r13 = r10[r5];	 Catch:{ Exception -> 0x0246 }
        r13 = r13.replaceAll(r2, r1);	 Catch:{ Exception -> 0x0246 }
        r12.setLastName(r13);	 Catch:{ Exception -> 0x0246 }
        r12 = r10.length;	 Catch:{ Exception -> 0x0246 }
        if (r12 <= r7) goto L_0x00b1;
    L_0x00a6:
        r12 = r15.data;	 Catch:{ Exception -> 0x0246 }
        r13 = r10[r7];	 Catch:{ Exception -> 0x0246 }
        r13 = r13.replaceAll(r2, r1);	 Catch:{ Exception -> 0x0246 }
        r12.setFirstName(r13);	 Catch:{ Exception -> 0x0246 }
    L_0x00b1:
        r12 = r10.length;	 Catch:{ Exception -> 0x0246 }
        if (r12 <= r11) goto L_0x00bf;
    L_0x00b4:
        r12 = r15.data;	 Catch:{ Exception -> 0x0246 }
        r10 = r10[r11];	 Catch:{ Exception -> 0x0246 }
        r1 = r10.replaceAll(r2, r1);	 Catch:{ Exception -> 0x0246 }
        r12.setMiddleName(r1);	 Catch:{ Exception -> 0x0246 }
    L_0x00bf:
        r1 = r15.index;	 Catch:{ Exception -> 0x0246 }
        if (r9 == 0) goto L_0x00c5;
    L_0x00c3:
        r2 = 1;
        goto L_0x00c6;
    L_0x00c5:
        r2 = 0;
    L_0x00c6:
        r6 = r6 + r2;
        r1 = r1 + r6;
        r15.index = r1;	 Catch:{ Exception -> 0x0246 }
        r1 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r2 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r1 = r1.indexOf(r4, r2);	 Catch:{ Exception -> 0x0246 }
        r2 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r1 = r1 - r2;
        if (r1 < 0) goto L_0x00de;
    L_0x00d7:
        r2 = r8 + 29;
        if (r1 <= r2) goto L_0x00dc;
    L_0x00db:
        goto L_0x00de;
    L_0x00dc:
        r2 = 1;
        goto L_0x00e1;
    L_0x00de:
        r1 = r8 + 29;
        r2 = 0;
    L_0x00e1:
        r6 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r8 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r9 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r9 = r9 + r1;
        r6 = r6.substring(r8, r9);	 Catch:{ Exception -> 0x0246 }
        r0 = r6.split(r0);	 Catch:{ Exception -> 0x0246 }
        r6 = r15.data;	 Catch:{ Exception -> 0x0246 }
        r8 = r0[r5];	 Catch:{ Exception -> 0x0246 }
        r6.setAddressStreet1(r8);	 Catch:{ Exception -> 0x0246 }
        r6 = r0.length;	 Catch:{ Exception -> 0x0246 }
        if (r6 <= r7) goto L_0x0101;
    L_0x00fa:
        r6 = r15.data;	 Catch:{ Exception -> 0x0246 }
        r0 = r0[r7];	 Catch:{ Exception -> 0x0246 }
        r6.setAddressStreet2(r0);	 Catch:{ Exception -> 0x0246 }
    L_0x0101:
        r0 = r15.index;	 Catch:{ Exception -> 0x0246 }
        if (r2 == 0) goto L_0x0106;
    L_0x0105:
        r5 = 1;
    L_0x0106:
        r1 = r1 + r5;
        r0 = r0 + r1;
        r15.index = r0;	 Catch:{ Exception -> 0x0246 }
        r0 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r1 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r0 = r0.startsWith(r4, r1);	 Catch:{ Exception -> 0x0246 }
        if (r0 == 0) goto L_0x0119;
    L_0x0114:
        r0 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r0 = r0 + r7;
        r15.index = r0;	 Catch:{ Exception -> 0x0246 }
    L_0x0119:
        r0 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r1 = ";";
        r2 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r0 = r0.startsWith(r1, r2);	 Catch:{ Exception -> 0x0246 }
        if (r0 == 0) goto L_0x012a;
    L_0x0125:
        r0 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r0 = r0 + r7;
        r15.index = r0;	 Catch:{ Exception -> 0x0246 }
    L_0x012a:
        r0 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r1 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r2 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r2 = r2 + 6;
        r0 = r0.substring(r1, r2);	 Catch:{ Exception -> 0x0246 }
        r15.issuerIdentificationNumber = r0;	 Catch:{ Exception -> 0x0246 }
        r0 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r0 = r0 + 6;
        r15.index = r0;	 Catch:{ Exception -> 0x0246 }
        r0 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r1 = "=";
        r2 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r0 = r0.indexOf(r1, r2);	 Catch:{ Exception -> 0x0246 }
        r1 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r0 = r0 - r1;
        r1 = r15.data;	 Catch:{ Exception -> 0x0246 }
        r2 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r4 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r5 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r5 = r5 + r0;
        r2 = r2.substring(r4, r5);	 Catch:{ Exception -> 0x0246 }
        r1.setIdNumber(r2);	 Catch:{ Exception -> 0x0246 }
        r1 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r0 = r0 + r7;
        r1 = r1 + r0;
        r15.index = r1;	 Catch:{ Exception -> 0x0246 }
        r0 = r15.dateFormat;	 Catch:{ Exception -> 0x0246 }
        r1 = "yyMM";
        r0.applyPattern(r1);	 Catch:{ Exception -> 0x0246 }
        r0 = r15.dateFormat;	 Catch:{ Exception -> 0x0246 }
        r1 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r2 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r4 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r4 = r4 + 4;
        r1 = r1.substring(r2, r4);	 Catch:{ Exception -> 0x0246 }
        r0 = r0.parse(r1);	 Catch:{ Exception -> 0x0246 }
        r1 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r1 = r1 + 4;
        r15.index = r1;	 Catch:{ Exception -> 0x0246 }
        r1 = r15.dateFormat;	 Catch:{ Exception -> 0x0246 }
        r2 = "yyyyMMdd";
        r1.applyPattern(r2);	 Catch:{ Exception -> 0x0246 }
        r1 = r15.dateFormat;	 Catch:{ Exception -> 0x0246 }
        r2 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r4 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r5 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r5 = r5 + 8;
        r2 = r2.substring(r4, r5);	 Catch:{ Exception -> 0x0246 }
        r1 = r1.parse(r2);	 Catch:{ Exception -> 0x0246 }
        r2 = r15.data;	 Catch:{ Exception -> 0x0246 }
        r2.setDateOfBirth(r1);	 Catch:{ Exception -> 0x0246 }
        r2 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r2 = r2 + 8;
        r15.index = r2;	 Catch:{ Exception -> 0x0246 }
        r2 = new java.util.GregorianCalendar;	 Catch:{ Exception -> 0x0246 }
        r2.<init>();	 Catch:{ Exception -> 0x0246 }
        r2.setTime(r1);	 Catch:{ Exception -> 0x0246 }
        r1 = 5;
        r4 = r2.get(r1);	 Catch:{ Exception -> 0x0246 }
        r2.setTime(r0);	 Catch:{ Exception -> 0x0246 }
        r2.set(r1, r4);	 Catch:{ Exception -> 0x0246 }
        r0 = r2.getTime();	 Catch:{ Exception -> 0x0246 }
        r1 = r15.data;	 Catch:{ Exception -> 0x0246 }
        r1.setExpiryDate(r0);	 Catch:{ Exception -> 0x0246 }
        r0 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r1 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r0 = r0.indexOf(r3, r1);	 Catch:{ Exception -> 0x0246 }
        r1 = -1;
        if (r0 == r1) goto L_0x01d6;
    L_0x01cb:
        r0 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r1 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r0 = r0.indexOf(r3, r1);	 Catch:{ Exception -> 0x0246 }
        r0 = r0 + r7;
        r15.index = r0;	 Catch:{ Exception -> 0x0246 }
    L_0x01d6:
        r0 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r0 = r0 + r7;
        r15.index = r0;	 Catch:{ Exception -> 0x0246 }
        r0 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r0 = r0 + r7;
        r15.index = r0;	 Catch:{ Exception -> 0x0246 }
        r0 = r15.data;	 Catch:{ Exception -> 0x0246 }
        r1 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r2 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r3 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r3 = r3 + 11;
        r1 = r1.substring(r2, r3);	 Catch:{ Exception -> 0x0246 }
        r0.setAddressZip(r1);	 Catch:{ Exception -> 0x0246 }
        r0 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r0 = r0 + 11;
        r15.index = r0;	 Catch:{ Exception -> 0x0246 }
        r0 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r0 = r0 + r11;
        r15.index = r0;	 Catch:{ Exception -> 0x0246 }
        r0 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r0 = r0 + 10;
        r15.index = r0;	 Catch:{ Exception -> 0x0246 }
        r0 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r0 = r0 + 4;
        r15.index = r0;	 Catch:{ Exception -> 0x0246 }
        r0 = r15.rawData;	 Catch:{ Exception -> 0x0246 }
        r1 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r2 = r15.index;	 Catch:{ Exception -> 0x0246 }
        r2 = r2 + r7;
        r0 = r0.substring(r1, r2);	 Catch:{ Exception -> 0x0246 }
        r1 = "1";
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x0246 }
        if (r1 != 0) goto L_0x023c;
    L_0x021b:
        r1 = "M";
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x0246 }
        if (r1 == 0) goto L_0x0224;
    L_0x0223:
        goto L_0x023c;
    L_0x0224:
        r1 = "2";
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x0246 }
        if (r1 != 0) goto L_0x0234;
    L_0x022c:
        r1 = "F";
        r0 = r1.equals(r0);	 Catch:{ Exception -> 0x0246 }
        if (r0 == 0) goto L_0x0243;
    L_0x0234:
        r0 = r15.data;	 Catch:{ Exception -> 0x0246 }
        r1 = com.jumio.nv.enums.NVGender.F;	 Catch:{ Exception -> 0x0246 }
        r0.setGender(r1);	 Catch:{ Exception -> 0x0246 }
        goto L_0x0243;
    L_0x023c:
        r0 = r15.data;	 Catch:{ Exception -> 0x0246 }
        r1 = com.jumio.nv.enums.NVGender.M;	 Catch:{ Exception -> 0x0246 }
        r0.setGender(r1);	 Catch:{ Exception -> 0x0246 }
    L_0x0243:
        r0 = r15.data;
        return r0;
    L_0x0246:
        r0 = move-exception;
        r1 = new com.jumio.nv.barcode.decoder.exception.PDF417DecoderException;
        r2 = "Incompatible magstripe structure";
        r1.<init>(r0, r2);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.nv.barcode.decoder.PDF417DataDecoder.parseMagstripe():com.jumio.nv.barcode.decoder.PDF417Data");
    }

    private void manipulateData() {
        if ("BC".equals(this.data.getAddressState()) && this.data.getIdNumber() != null && this.data.getIdNumber().length() > 7 && this.data.getIdNumber().startsWith("28")) {
            PDF417Data pDF417Data = this.data;
            pDF417Data.setIdNumber(pDF417Data.getIdNumber().substring(2));
        }
    }

    private void manipulateMagstripeData() {
        if ("OH".equals(this.data.getAddressState()) && this.data.getIdNumber().length() == 10) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(Character.toString((char) (Integer.parseInt(this.data.getIdNumber().substring(0, 2)) + 64)));
                stringBuffer.append(Character.toString((char) (Integer.parseInt(this.data.getIdNumber().substring(2, 4)) + 64)));
                stringBuffer.append(this.data.getIdNumber().substring(4));
                this.data.setIdNumber(stringBuffer.toString());
            } catch (Exception e) {
                Log.printStackTrace(e);
            }
        }
    }

    /* JADX WARNING: Missing block: B:28:0x00bf, code skipped:
            if (r8.after(r9.parse(r9.format(new java.util.Date()))) != false) goto L_0x00c1;
     */
    private java.util.Date parseDate(java.lang.String r8, boolean r9) {
        /*
        r7 = this;
        r0 = r8.isEmpty();
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = "\\D";
        r2 = "";
        r8 = r8.replaceAll(r0, r2);	 Catch:{ Exception -> 0x00c1 }
        r0 = 0;
        r2 = 4;
        r0 = r8.substring(r0, r2);	 Catch:{ Exception -> 0x00c1 }
        r2 = r8.substring(r2);	 Catch:{ Exception -> 0x00c1 }
        r3 = "^(?:(?:19|20)\\d{2})$";
        r3 = java.util.regex.Pattern.compile(r3);	 Catch:{ Exception -> 0x00c1 }
        r4 = "^(?:0[1-9]|1[0-2])(?:0[1-9]|[12][0-9]|3[01])$";
        r4 = java.util.regex.Pattern.compile(r4);	 Catch:{ Exception -> 0x00c1 }
        r5 = "^(?:0[1-9]|[12][0-9]|3[01])(?:0[1-9]|1[0-2])$";
        r5 = java.util.regex.Pattern.compile(r5);	 Catch:{ Exception -> 0x00c1 }
        r6 = r3.matcher(r0);	 Catch:{ Exception -> 0x00c1 }
        r6 = r6.matches();	 Catch:{ Exception -> 0x00c1 }
        if (r6 == 0) goto L_0x0048;
    L_0x0036:
        r6 = r4.matcher(r2);	 Catch:{ Exception -> 0x00c1 }
        r6 = r6.matches();	 Catch:{ Exception -> 0x00c1 }
        if (r6 == 0) goto L_0x0048;
    L_0x0040:
        r0 = r7.dateFormat;	 Catch:{ Exception -> 0x00c1 }
        r2 = "yyyyMMdd";
        r0.applyPattern(r2);	 Catch:{ Exception -> 0x00c1 }
        goto L_0x009b;
    L_0x0048:
        r6 = r3.matcher(r0);	 Catch:{ Exception -> 0x00c1 }
        r6 = r6.matches();	 Catch:{ Exception -> 0x00c1 }
        if (r6 == 0) goto L_0x0064;
    L_0x0052:
        r6 = r5.matcher(r2);	 Catch:{ Exception -> 0x00c1 }
        r6 = r6.matches();	 Catch:{ Exception -> 0x00c1 }
        if (r6 == 0) goto L_0x0064;
    L_0x005c:
        r0 = r7.dateFormat;	 Catch:{ Exception -> 0x00c1 }
        r2 = "yyyyddMM";
        r0.applyPattern(r2);	 Catch:{ Exception -> 0x00c1 }
        goto L_0x009b;
    L_0x0064:
        r4 = r4.matcher(r0);	 Catch:{ Exception -> 0x00c1 }
        r4 = r4.matches();	 Catch:{ Exception -> 0x00c1 }
        if (r4 == 0) goto L_0x0080;
    L_0x006e:
        r4 = r3.matcher(r2);	 Catch:{ Exception -> 0x00c1 }
        r4 = r4.matches();	 Catch:{ Exception -> 0x00c1 }
        if (r4 == 0) goto L_0x0080;
    L_0x0078:
        r0 = r7.dateFormat;	 Catch:{ Exception -> 0x00c1 }
        r2 = "MMddyyyy";
        r0.applyPattern(r2);	 Catch:{ Exception -> 0x00c1 }
        goto L_0x009b;
    L_0x0080:
        r0 = r5.matcher(r0);	 Catch:{ Exception -> 0x00c1 }
        r0 = r0.matches();	 Catch:{ Exception -> 0x00c1 }
        if (r0 == 0) goto L_0x009b;
    L_0x008a:
        r0 = r3.matcher(r2);	 Catch:{ Exception -> 0x00c1 }
        r0 = r0.matches();	 Catch:{ Exception -> 0x00c1 }
        if (r0 == 0) goto L_0x009b;
    L_0x0094:
        r0 = r7.dateFormat;	 Catch:{ Exception -> 0x00c1 }
        r2 = "ddMMyyyy";
        r0.applyPattern(r2);	 Catch:{ Exception -> 0x00c1 }
    L_0x009b:
        r0 = r7.dateFormat;	 Catch:{ Exception -> 0x00c1 }
        r8 = r0.parse(r8);	 Catch:{ Exception -> 0x00c1 }
        if (r9 == 0) goto L_0x00c2;
    L_0x00a3:
        r9 = new java.text.SimpleDateFormat;	 Catch:{ Exception -> 0x00c2 }
        r0 = "dd/MM/yyyy";
        r2 = java.util.Locale.getDefault();	 Catch:{ Exception -> 0x00c2 }
        r9.<init>(r0, r2);	 Catch:{ Exception -> 0x00c2 }
        r0 = new java.util.Date;	 Catch:{ Exception -> 0x00c2 }
        r0.<init>();	 Catch:{ Exception -> 0x00c2 }
        r0 = r9.format(r0);	 Catch:{ Exception -> 0x00c2 }
        r9 = r9.parse(r0);	 Catch:{ Exception -> 0x00c2 }
        r9 = r8.after(r9);	 Catch:{ Exception -> 0x00c2 }
        if (r9 == 0) goto L_0x00c2;
    L_0x00c1:
        r8 = r1;
    L_0x00c2:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.nv.barcode.decoder.PDF417DataDecoder.parseDate(java.lang.String, boolean):java.util.Date");
    }
}
