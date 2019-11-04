package org.jmrtd.lds.icao;

import androidx.annotation.Nullable;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import net.sf.scuba.data.Gender;
import org.jmrtd.lds.AbstractLDSInfo;

public class MRZInfo extends AbstractLDSInfo {
    private static final long serialVersionUID = 7054965914471297804L;
    private char compositeCheckDigit;
    private String dateOfBirth;
    private char dateOfBirthCheckDigit;
    private String dateOfExpiry;
    private char dateOfExpiryCheckDigit;
    private String documentCode;
    private String documentNumber;
    private char documentNumberCheckDigit;
    @Deprecated
    private int documentType;
    private Gender gender;
    private String issuingState;
    private String mrzLine1;
    private String mrzLine2;
    private String mrzLine3;
    private String nationality;
    private String optionalData1;
    private String optionalData2;
    private String primaryIdentifier;
    private String secondaryIdentifier;

    /* renamed from: org.jmrtd.lds.icao.MRZInfo$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fFt = new int[Gender.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = net.sf.scuba.data.Gender.values();
            r0 = r0.length;
            r0 = new int[r0];
            fFt = r0;
            r0 = fFt;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = net.sf.scuba.data.Gender.MALE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = fFt;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = net.sf.scuba.data.Gender.FEMALE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.lds.icao.MRZInfo$AnonymousClass1.<clinit>():void");
        }
    }

    public MRZInfo(InputStream inputStream, int i) {
        try {
            c(inputStream, i);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private void c(InputStream inputStream, int i) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        inputStream.mark(i);
        InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(inputStream));
        char[] cArr = new char[i];
        inputStreamReader.read(cArr, 0, i);
        String str = new String(cArr);
        inputStream.reset();
        this.documentCode = a(dataInputStream, 2);
        this.documentType = nA(this.documentCode);
        if (i == 88) {
            this.documentType = 3;
        } else if (i != 90) {
            this.documentType = nA(this.documentCode);
        } else {
            this.documentType = 1;
        }
        if (this.documentType == 1) {
            this.issuingState = a(dataInputStream);
            this.documentNumber = b(dataInputStream, 9);
            this.documentNumberCheckDigit = (char) dataInputStream.readUnsignedByte();
            this.optionalData1 = a(dataInputStream, 15);
            if (this.documentNumberCheckDigit == '<') {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.documentNumber);
                String str2 = this.optionalData1;
                stringBuilder.append(str2.substring(0, str2.length() - 1));
                this.documentNumber = stringBuilder.toString();
                String str3 = this.optionalData1;
                this.documentNumberCheckDigit = str3.charAt(str3.length() - 1);
                this.optionalData1 = null;
            }
            this.documentNumber = nB(this.documentNumber);
            this.dateOfBirth = c(dataInputStream);
            this.dateOfBirthCheckDigit = (char) dataInputStream.readUnsignedByte();
            this.gender = b(dataInputStream);
            this.dateOfExpiry = d(dataInputStream);
            this.dateOfExpiryCheckDigit = (char) dataInputStream.readUnsignedByte();
            this.nationality = a(dataInputStream);
            this.optionalData2 = b(dataInputStream, 11);
            this.compositeCheckDigit = (char) dataInputStream.readUnsignedByte();
            ny(b(dataInputStream, 30));
            this.mrzLine1 = str.substring(0, 30);
            this.mrzLine2 = str.substring(30, 60);
            this.mrzLine3 = str.substring(60, 90);
            return;
        }
        this.issuingState = a(dataInputStream);
        ny(b(dataInputStream, 39));
        this.documentNumber = nB(b(dataInputStream, 9));
        this.documentNumberCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.nationality = a(dataInputStream);
        this.dateOfBirth = c(dataInputStream);
        this.dateOfBirthCheckDigit = (char) dataInputStream.readUnsignedByte();
        this.gender = b(dataInputStream);
        this.dateOfExpiry = d(dataInputStream);
        this.dateOfExpiryCheckDigit = (char) dataInputStream.readUnsignedByte();
        String a = a(dataInputStream, 14);
        char readUnsignedByte = (char) dataInputStream.readUnsignedByte();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(ab(a, 14));
        stringBuilder2.append(readUnsignedByte);
        this.optionalData1 = stringBuilder2.toString();
        this.compositeCheckDigit = (char) dataInputStream.readUnsignedByte();
        i /= 2;
        this.mrzLine1 = str.substring(0, i);
        this.mrzLine2 = str.substring(i);
        this.mrzLine3 = null;
    }

    public void f(OutputStream outputStream) {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        f(dataOutputStream);
        if (this.documentType == 1) {
            a(dataOutputStream);
            if (this.documentNumber.length() <= 9 || !bq(this.optionalData1, "")) {
                a(this.documentNumber, dataOutputStream, 9);
                dataOutputStream.write(this.documentNumberCheckDigit);
                a(this.optionalData1, dataOutputStream, 15);
            } else {
                a(this.documentNumber.substring(0, 9), dataOutputStream, 9);
                dataOutputStream.write(60);
                StringBuilder stringBuilder = new StringBuilder();
                String str = this.documentNumber;
                stringBuilder.append(str.substring(9, str.length()));
                stringBuilder.append(this.documentNumberCheckDigit);
                stringBuilder.append("<");
                a(stringBuilder.toString(), dataOutputStream, 15);
            }
            d(dataOutputStream);
            dataOutputStream.write(this.dateOfBirthCheckDigit);
            c(dataOutputStream);
            b(dataOutputStream);
            dataOutputStream.write(this.dateOfExpiryCheckDigit);
            e(dataOutputStream);
            a(this.optionalData2, dataOutputStream, 11);
            dataOutputStream.write(this.compositeCheckDigit);
            a(dataOutputStream, 30);
            return;
        }
        a(dataOutputStream);
        a(dataOutputStream, 39);
        a(this.documentNumber, dataOutputStream, 9);
        dataOutputStream.write(this.documentNumberCheckDigit);
        e(dataOutputStream);
        d(dataOutputStream);
        dataOutputStream.write(this.dateOfBirthCheckDigit);
        c(dataOutputStream);
        b(dataOutputStream);
        dataOutputStream.write(this.dateOfExpiryCheckDigit);
        a(this.optionalData1, dataOutputStream, 15);
        dataOutputStream.write(this.compositeCheckDigit);
    }

    public String bQS() {
        return this.documentNumber;
    }

    public String bRX() {
        return this.issuingState;
    }

    public String bRY() {
        return this.primaryIdentifier;
    }

    public String bRZ() {
        return this.secondaryIdentifier;
    }

    public String DX() {
        return this.nationality;
    }

    public String getPersonalNumber() {
        if (this.optionalData1.length() > 14) {
            return nB(this.optionalData1.substring(0, 14));
        }
        return nB(this.optionalData1);
    }

    public String toString() {
        try {
            String str = new String(getEncoded(), "UTF-8");
            int length = str.length();
            String str2 = "\n";
            StringBuilder stringBuilder;
            if (length == 88) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str.substring(0, 44));
                stringBuilder.append(str2);
                stringBuilder.append(str.substring(44, 88));
                stringBuilder.append(str2);
                return stringBuilder.toString();
            } else if (length != 90) {
                return str;
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str.substring(0, 30));
                stringBuilder.append(str2);
                stringBuilder.append(str.substring(30, 60));
                stringBuilder.append(str2);
                stringBuilder.append(str.substring(60, 90));
                stringBuilder.append(str2);
                return stringBuilder.toString();
            }
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    public int hashCode() {
        return (toString().hashCode() * 2) + 53;
    }

    /* JADX WARNING: Missing block: B:13:0x0027, code skipped:
            if (r1.equals(r4.documentCode) != false) goto L_0x0029;
     */
    /* JADX WARNING: Missing block: B:21:0x003b, code skipped:
            if (r1.equals(r4.issuingState) != false) goto L_0x003d;
     */
    /* JADX WARNING: Missing block: B:29:0x004f, code skipped:
            if (r1.equals(r4.primaryIdentifier) != false) goto L_0x0051;
     */
    /* JADX WARNING: Missing block: B:43:0x0075, code skipped:
            if (r1.equals(r4.nationality) != false) goto L_0x0077;
     */
    /* JADX WARNING: Missing block: B:51:0x0089, code skipped:
            if (r1.equals(r4.documentNumber) != false) goto L_0x008b;
     */
    /* JADX WARNING: Missing block: B:59:0x009d, code skipped:
            if (r1.equals(r4.optionalData1) != false) goto L_0x00ad;
     */
    /* JADX WARNING: Missing block: B:61:0x00ab, code skipped:
            if (getPersonalNumber().equals(r4.getPersonalNumber()) != false) goto L_0x00ad;
     */
    /* JADX WARNING: Missing block: B:69:0x00bf, code skipped:
            if (r1.equals(r4.dateOfBirth) != false) goto L_0x00c1;
     */
    /* JADX WARNING: Missing block: B:77:0x00d3, code skipped:
            if (r1.equals(r4.gender) != false) goto L_0x00d5;
     */
    /* JADX WARNING: Missing block: B:85:0x00e7, code skipped:
            if (r1.equals(r4.dateOfExpiry) != false) goto L_0x00e9;
     */
    /* JADX WARNING: Missing block: B:93:0x00fb, code skipped:
            if (bq(r1, r4.optionalData2) != false) goto L_0x00fd;
     */
    public boolean equals(java.lang.Object r4) {
        /*
        r3 = this;
        r0 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r4.getClass();
        r2 = r3.getClass();
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x0013;
    L_0x0012:
        return r0;
    L_0x0013:
        r4 = (org.jmrtd.lds.icao.MRZInfo) r4;
        r1 = r3.documentCode;
        if (r1 != 0) goto L_0x001d;
    L_0x0019:
        r1 = r4.documentCode;
        if (r1 == 0) goto L_0x0029;
    L_0x001d:
        r1 = r3.documentCode;
        if (r1 == 0) goto L_0x00fe;
    L_0x0021:
        r2 = r4.documentCode;
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x00fe;
    L_0x0029:
        r1 = r3.issuingState;
        if (r1 != 0) goto L_0x0031;
    L_0x002d:
        r1 = r4.issuingState;
        if (r1 == 0) goto L_0x003d;
    L_0x0031:
        r1 = r3.issuingState;
        if (r1 == 0) goto L_0x00fe;
    L_0x0035:
        r2 = r4.issuingState;
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x00fe;
    L_0x003d:
        r1 = r3.primaryIdentifier;
        if (r1 != 0) goto L_0x0045;
    L_0x0041:
        r1 = r4.primaryIdentifier;
        if (r1 == 0) goto L_0x0051;
    L_0x0045:
        r1 = r3.primaryIdentifier;
        if (r1 == 0) goto L_0x00fe;
    L_0x0049:
        r2 = r4.primaryIdentifier;
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x00fe;
    L_0x0051:
        r1 = r3.secondaryIdentifier;
        if (r1 != 0) goto L_0x0059;
    L_0x0055:
        r1 = r4.secondaryIdentifier;
        if (r1 == 0) goto L_0x0063;
    L_0x0059:
        r1 = r3.secondaryIdentifier;
        r2 = r4.secondaryIdentifier;
        r1 = bq(r1, r2);
        if (r1 == 0) goto L_0x00fe;
    L_0x0063:
        r1 = r3.nationality;
        if (r1 != 0) goto L_0x006b;
    L_0x0067:
        r1 = r4.nationality;
        if (r1 == 0) goto L_0x0077;
    L_0x006b:
        r1 = r3.nationality;
        if (r1 == 0) goto L_0x00fe;
    L_0x006f:
        r2 = r4.nationality;
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x00fe;
    L_0x0077:
        r1 = r3.documentNumber;
        if (r1 != 0) goto L_0x007f;
    L_0x007b:
        r1 = r4.documentNumber;
        if (r1 == 0) goto L_0x008b;
    L_0x007f:
        r1 = r3.documentNumber;
        if (r1 == 0) goto L_0x00fe;
    L_0x0083:
        r2 = r4.documentNumber;
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x00fe;
    L_0x008b:
        r1 = r3.optionalData1;
        if (r1 != 0) goto L_0x0093;
    L_0x008f:
        r1 = r4.optionalData1;
        if (r1 == 0) goto L_0x00ad;
    L_0x0093:
        r1 = r3.optionalData1;
        if (r1 == 0) goto L_0x009f;
    L_0x0097:
        r2 = r4.optionalData1;
        r1 = r1.equals(r2);
        if (r1 != 0) goto L_0x00ad;
    L_0x009f:
        r1 = r3.getPersonalNumber();
        r2 = r4.getPersonalNumber();
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x00fe;
    L_0x00ad:
        r1 = r3.dateOfBirth;
        if (r1 != 0) goto L_0x00b5;
    L_0x00b1:
        r1 = r4.dateOfBirth;
        if (r1 == 0) goto L_0x00c1;
    L_0x00b5:
        r1 = r3.dateOfBirth;
        if (r1 == 0) goto L_0x00fe;
    L_0x00b9:
        r2 = r4.dateOfBirth;
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x00fe;
    L_0x00c1:
        r1 = r3.gender;
        if (r1 != 0) goto L_0x00c9;
    L_0x00c5:
        r1 = r4.gender;
        if (r1 == 0) goto L_0x00d5;
    L_0x00c9:
        r1 = r3.gender;
        if (r1 == 0) goto L_0x00fe;
    L_0x00cd:
        r2 = r4.gender;
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x00fe;
    L_0x00d5:
        r1 = r3.dateOfExpiry;
        if (r1 != 0) goto L_0x00dd;
    L_0x00d9:
        r1 = r4.dateOfExpiry;
        if (r1 == 0) goto L_0x00e9;
    L_0x00dd:
        r1 = r3.dateOfExpiry;
        if (r1 == 0) goto L_0x00fe;
    L_0x00e1:
        r2 = r4.dateOfExpiry;
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x00fe;
    L_0x00e9:
        r1 = r3.optionalData2;
        if (r1 != 0) goto L_0x00f1;
    L_0x00ed:
        r1 = r4.optionalData2;
        if (r1 == 0) goto L_0x00fd;
    L_0x00f1:
        r1 = r3.optionalData2;
        if (r1 == 0) goto L_0x00fe;
    L_0x00f5:
        r4 = r4.optionalData2;
        r4 = bq(r1, r4);
        if (r4 == 0) goto L_0x00fe;
    L_0x00fd:
        r0 = 1;
    L_0x00fe:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.lds.icao.MRZInfo.equals(java.lang.Object):boolean");
    }

    public static char nx(String str) {
        return E(str, false);
    }

    private void ny(String str) {
        String str2 = "<<";
        int indexOf = str.indexOf(str2);
        if (indexOf < 0) {
            this.primaryIdentifier = nB(str);
            this.secondaryIdentifier = "";
            return;
        }
        this.primaryIdentifier = nB(str.substring(0, indexOf));
        nz(str.substring(str.indexOf(str2) + 2));
    }

    private void nz(String str) {
        this.secondaryIdentifier = str;
    }

    private void a(String str, DataOutputStream dataOutputStream, int i) {
        dataOutputStream.write(ab(str, i).getBytes("UTF-8"));
    }

    private void a(DataOutputStream dataOutputStream) {
        dataOutputStream.write(this.issuingState.getBytes("UTF-8"));
    }

    private void b(DataOutputStream dataOutputStream) {
        dataOutputStream.write(this.dateOfExpiry.getBytes("UTF-8"));
    }

    private void c(DataOutputStream dataOutputStream) {
        dataOutputStream.write(a(this.gender).getBytes("UTF-8"));
    }

    private void d(DataOutputStream dataOutputStream) {
        dataOutputStream.write(this.dateOfBirth.getBytes("UTF-8"));
    }

    private void e(DataOutputStream dataOutputStream) {
        dataOutputStream.write(this.nationality.getBytes("UTF-8"));
    }

    private void a(DataOutputStream dataOutputStream, int i) {
        dataOutputStream.write(d(this.primaryIdentifier, this.secondaryIdentifier, i).getBytes("UTF-8"));
    }

    private void f(DataOutputStream dataOutputStream) {
        a(this.documentCode, dataOutputStream, 2);
    }

    private static String a(Gender gender) {
        int i = AnonymousClass1.fFt[gender.ordinal()];
        if (i != 1) {
            return i != 2 ? "<" : "F";
        } else {
            return "M";
        }
    }

    private static String d(String str, String str2, int i) {
        String str3 = " |<";
        String[] split = str.split(str3);
        String[] split2 = (str2 == null || str2.trim().isEmpty()) ? new String[0] : str2.split(str3);
        StringBuilder stringBuilder = new StringBuilder();
        Object obj = 1;
        Object obj2 = 1;
        for (String str4 : split) {
            if (obj2 != null) {
                obj2 = null;
            } else {
                stringBuilder.append('<');
            }
            stringBuilder.append(str4);
        }
        if (!(str2 == null || str2.trim().isEmpty())) {
            stringBuilder.append("<<");
            for (String str5 : split2) {
                if (obj != null) {
                    obj = null;
                } else {
                    stringBuilder.append('<');
                }
                stringBuilder.append(str5);
            }
        }
        return ab(stringBuilder.toString(), i);
    }

    private String a(DataInputStream dataInputStream, int i) {
        return nB(b(dataInputStream, i));
    }

    private String a(DataInputStream dataInputStream) {
        return b(dataInputStream, 3);
    }

    private Gender b(DataInputStream dataInputStream) {
        String b = b(dataInputStream, 1);
        if ("M".equalsIgnoreCase(b)) {
            return Gender.MALE;
        }
        if ("F".equalsIgnoreCase(b)) {
            return Gender.FEMALE;
        }
        return Gender.UNKNOWN;
    }

    private String c(DataInputStream dataInputStream) {
        return b(dataInputStream, 6);
    }

    private String d(DataInputStream dataInputStream) {
        return b(dataInputStream, 6);
    }

    private String b(DataInputStream dataInputStream, int i) {
        byte[] bArr = new byte[i];
        dataInputStream.readFully(bArr);
        return new String(bArr).trim();
    }

    private static String ab(String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Attempting to MRZ format null");
        } else if (str.length() <= i) {
            str = str.toUpperCase().trim();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if ("<0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(charAt) == -1) {
                    stringBuilder.append('<');
                } else {
                    stringBuilder.append(charAt);
                }
            }
            while (stringBuilder.length() < i) {
                stringBuilder.append("<");
            }
            return stringBuilder.toString();
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Argument too wide (");
            stringBuilder2.append(str.length());
            stringBuilder2.append(" > ");
            stringBuilder2.append(i);
            stringBuilder2.append(")");
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
    }

    public static boolean bq(String str, String str2) {
        if (str == str2) {
            return true;
        }
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        if (str2 == null) {
            str2 = str3;
        }
        int max = Math.max(str.length(), str2.length());
        return ab(str, max).equals(ab(str2, max));
    }

    /* JADX WARNING: Missing block: B:20:0x003e, code skipped:
            return 1;
     */
    private static int nA(java.lang.String r3) {
        /*
        if (r3 == 0) goto L_0x003f;
    L_0x0002:
        r0 = r3.length();
        r1 = 1;
        if (r0 < r1) goto L_0x003f;
    L_0x0009:
        r0 = r3.length();
        r2 = 2;
        if (r0 > r2) goto L_0x003f;
    L_0x0010:
        r0 = "A";
        r0 = r3.startsWith(r0);
        if (r0 != 0) goto L_0x003e;
    L_0x0018:
        r0 = "C";
        r0 = r3.startsWith(r0);
        if (r0 != 0) goto L_0x003e;
    L_0x0020:
        r0 = "I";
        r0 = r3.startsWith(r0);
        if (r0 == 0) goto L_0x0029;
    L_0x0028:
        goto L_0x003e;
    L_0x0029:
        r0 = "V";
        r0 = r3.startsWith(r0);
        if (r0 == 0) goto L_0x0032;
    L_0x0031:
        return r1;
    L_0x0032:
        r0 = "P";
        r3 = r3.startsWith(r0);
        if (r3 == 0) goto L_0x003c;
    L_0x003a:
        r3 = 3;
        return r3;
    L_0x003c:
        r3 = 0;
        return r3;
    L_0x003e:
        return r1;
    L_0x003f:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Was expecting 1 or 2 digit document code, got ";
        r1.append(r2);
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.lds.icao.MRZInfo.nA(java.lang.String):int");
    }

    private static String nB(String str) {
        byte[] bytes = str.trim().getBytes();
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == (byte) 60) {
                bytes[i] = (byte) 32;
            }
        }
        return new String(bytes).trim();
    }

    private static char E(String str, boolean z) {
        byte[] bArr;
        String str2 = "UTF-8";
        String str3 = "Error in computing check digit";
        if (str == null) {
            try {
                bArr = new byte[0];
            } catch (NumberFormatException e) {
                throw new IllegalStateException(str3, e);
            } catch (UnsupportedEncodingException e2) {
                throw new IllegalStateException(str3, e2);
            } catch (Exception e3) {
                throw new IllegalArgumentException(str3, e3);
            }
        }
        bArr = str.getBytes(str2);
        int[] iArr = new int[]{7, 3, 1};
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i = (i + (iArr[i2 % 3] * d(bArr[i2]))) % 10;
        }
        str = Integer.toString(i);
        if (str.length() == 1) {
            char c = (char) str.getBytes(str2)[0];
            return (z && c == '0') ? '<' : c;
        } else {
            throw new IllegalStateException("Error in computing check digit.");
        }
    }

    /* JADX WARNING: Missing block: B:8:0x0038, code skipped:
            return 35;
     */
    /* JADX WARNING: Missing block: B:10:0x003b, code skipped:
            return 34;
     */
    /* JADX WARNING: Missing block: B:12:0x003e, code skipped:
            return 33;
     */
    /* JADX WARNING: Missing block: B:14:0x0041, code skipped:
            return 32;
     */
    /* JADX WARNING: Missing block: B:16:0x0044, code skipped:
            return 31;
     */
    /* JADX WARNING: Missing block: B:18:0x0047, code skipped:
            return 30;
     */
    /* JADX WARNING: Missing block: B:20:0x004a, code skipped:
            return 29;
     */
    /* JADX WARNING: Missing block: B:22:0x004d, code skipped:
            return 28;
     */
    /* JADX WARNING: Missing block: B:24:0x0050, code skipped:
            return 27;
     */
    /* JADX WARNING: Missing block: B:26:0x0053, code skipped:
            return 26;
     */
    /* JADX WARNING: Missing block: B:28:0x0056, code skipped:
            return 25;
     */
    /* JADX WARNING: Missing block: B:30:0x0059, code skipped:
            return 24;
     */
    /* JADX WARNING: Missing block: B:32:0x005c, code skipped:
            return 23;
     */
    /* JADX WARNING: Missing block: B:34:0x005f, code skipped:
            return 22;
     */
    /* JADX WARNING: Missing block: B:36:0x0062, code skipped:
            return 21;
     */
    /* JADX WARNING: Missing block: B:38:0x0065, code skipped:
            return 20;
     */
    /* JADX WARNING: Missing block: B:40:0x0068, code skipped:
            return 19;
     */
    /* JADX WARNING: Missing block: B:42:0x006b, code skipped:
            return 18;
     */
    /* JADX WARNING: Missing block: B:44:0x006e, code skipped:
            return 17;
     */
    /* JADX WARNING: Missing block: B:46:0x0071, code skipped:
            return 16;
     */
    /* JADX WARNING: Missing block: B:48:0x0074, code skipped:
            return 15;
     */
    /* JADX WARNING: Missing block: B:50:0x0077, code skipped:
            return 14;
     */
    /* JADX WARNING: Missing block: B:52:0x007a, code skipped:
            return 13;
     */
    /* JADX WARNING: Missing block: B:54:0x007d, code skipped:
            return 12;
     */
    /* JADX WARNING: Missing block: B:56:0x0080, code skipped:
            return 11;
     */
    /* JADX WARNING: Missing block: B:58:0x0083, code skipped:
            return 10;
     */
    private static int d(byte r3) {
        /*
        r0 = 60;
        if (r3 == r0) goto L_0x0098;
    L_0x0004:
        switch(r3) {
            case 48: goto L_0x0098;
            case 49: goto L_0x0096;
            case 50: goto L_0x0094;
            case 51: goto L_0x0092;
            case 52: goto L_0x0090;
            case 53: goto L_0x008e;
            case 54: goto L_0x008c;
            case 55: goto L_0x008a;
            case 56: goto L_0x0087;
            case 57: goto L_0x0084;
            default: goto L_0x0007;
        };
    L_0x0007:
        switch(r3) {
            case 65: goto L_0x0081;
            case 66: goto L_0x007e;
            case 67: goto L_0x007b;
            case 68: goto L_0x0078;
            case 69: goto L_0x0075;
            case 70: goto L_0x0072;
            case 71: goto L_0x006f;
            case 72: goto L_0x006c;
            case 73: goto L_0x0069;
            case 74: goto L_0x0066;
            case 75: goto L_0x0063;
            case 76: goto L_0x0060;
            case 77: goto L_0x005d;
            case 78: goto L_0x005a;
            case 79: goto L_0x0057;
            case 80: goto L_0x0054;
            case 81: goto L_0x0051;
            case 82: goto L_0x004e;
            case 83: goto L_0x004b;
            case 84: goto L_0x0048;
            case 85: goto L_0x0045;
            case 86: goto L_0x0042;
            case 87: goto L_0x003f;
            case 88: goto L_0x003c;
            case 89: goto L_0x0039;
            case 90: goto L_0x0036;
            default: goto L_0x000a;
        };
    L_0x000a:
        switch(r3) {
            case 97: goto L_0x0081;
            case 98: goto L_0x007e;
            case 99: goto L_0x007b;
            case 100: goto L_0x0078;
            case 101: goto L_0x0075;
            case 102: goto L_0x0072;
            case 103: goto L_0x006f;
            case 104: goto L_0x006c;
            case 105: goto L_0x0069;
            case 106: goto L_0x0066;
            case 107: goto L_0x0063;
            case 108: goto L_0x0060;
            case 109: goto L_0x005d;
            case 110: goto L_0x005a;
            case 111: goto L_0x0057;
            case 112: goto L_0x0054;
            case 113: goto L_0x0051;
            case 114: goto L_0x004e;
            case 115: goto L_0x004b;
            case 116: goto L_0x0048;
            case 117: goto L_0x0045;
            case 118: goto L_0x0042;
            case 119: goto L_0x003f;
            case 120: goto L_0x003c;
            case 121: goto L_0x0039;
            case 122: goto L_0x0036;
            default: goto L_0x000d;
        };
    L_0x000d:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Could not decode MRZ character ";
        r1.append(r2);
        r1.append(r3);
        r2 = " ('";
        r1.append(r2);
        r3 = (char) r3;
        r3 = java.lang.Character.toString(r3);
        r1.append(r3);
        r3 = "')";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
    L_0x0036:
        r3 = 35;
        return r3;
    L_0x0039:
        r3 = 34;
        return r3;
    L_0x003c:
        r3 = 33;
        return r3;
    L_0x003f:
        r3 = 32;
        return r3;
    L_0x0042:
        r3 = 31;
        return r3;
    L_0x0045:
        r3 = 30;
        return r3;
    L_0x0048:
        r3 = 29;
        return r3;
    L_0x004b:
        r3 = 28;
        return r3;
    L_0x004e:
        r3 = 27;
        return r3;
    L_0x0051:
        r3 = 26;
        return r3;
    L_0x0054:
        r3 = 25;
        return r3;
    L_0x0057:
        r3 = 24;
        return r3;
    L_0x005a:
        r3 = 23;
        return r3;
    L_0x005d:
        r3 = 22;
        return r3;
    L_0x0060:
        r3 = 21;
        return r3;
    L_0x0063:
        r3 = 20;
        return r3;
    L_0x0066:
        r3 = 19;
        return r3;
    L_0x0069:
        r3 = 18;
        return r3;
    L_0x006c:
        r3 = 17;
        return r3;
    L_0x006f:
        r3 = 16;
        return r3;
    L_0x0072:
        r3 = 15;
        return r3;
    L_0x0075:
        r3 = 14;
        return r3;
    L_0x0078:
        r3 = 13;
        return r3;
    L_0x007b:
        r3 = 12;
        return r3;
    L_0x007e:
        r3 = 11;
        return r3;
    L_0x0081:
        r3 = 10;
        return r3;
    L_0x0084:
        r3 = 9;
        return r3;
    L_0x0087:
        r3 = 8;
        return r3;
    L_0x008a:
        r3 = 7;
        return r3;
    L_0x008c:
        r3 = 6;
        return r3;
    L_0x008e:
        r3 = 5;
        return r3;
    L_0x0090:
        r3 = 4;
        return r3;
    L_0x0092:
        r3 = 3;
        return r3;
    L_0x0094:
        r3 = 2;
        return r3;
    L_0x0096:
        r3 = 1;
        return r3;
    L_0x0098:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.lds.icao.MRZInfo.d(byte):int");
    }

    @Nullable
    public String getMrzLine1() {
        return this.mrzLine1;
    }

    @Nullable
    public String getMrzLine2() {
        return this.mrzLine2;
    }

    @Nullable
    public String getMrzLine3() {
        return this.mrzLine3;
    }
}
