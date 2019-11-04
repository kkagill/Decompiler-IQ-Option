package org.jmrtd.lds.icao;

import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;
import net.sf.scuba.tlv.TLVUtil;
import net.sf.scuba.util.Hex;
import org.jmrtd.lds.DataGroup;

public class DG11File extends DataGroup {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = 8566312538928662937L;
    private String custodyInformation;
    private String fullDateOfBirth;
    private String nameOfHolder;
    private List<String> otherNames;
    private List<String> otherValidTDNumbers;
    private List<String> permanentAddress;
    private String personalNumber;
    private String personalSummary;
    private List<String> placeOfBirth;
    private String profession;
    private byte[] proofOfCitizenship;
    private List<Integer> tagPresenceList;
    private String telephone;
    private String title;

    public int getTag() {
        return 107;
    }

    public DG11File(InputStream inputStream) {
        super(107, inputStream);
    }

    public List<Integer> bRB() {
        List list = this.tagPresenceList;
        if (list != null) {
            return list;
        }
        this.tagPresenceList = new ArrayList(12);
        if (this.nameOfHolder != null) {
            this.tagPresenceList.add(Integer.valueOf(24334));
        }
        list = this.otherNames;
        if (!(list == null || list.isEmpty())) {
            this.tagPresenceList.add(Integer.valueOf(24335));
        }
        if (this.personalNumber != null) {
            this.tagPresenceList.add(Integer.valueOf(24336));
        }
        if (this.fullDateOfBirth != null) {
            this.tagPresenceList.add(Integer.valueOf(24363));
        }
        list = this.placeOfBirth;
        if (!(list == null || list.isEmpty())) {
            this.tagPresenceList.add(Integer.valueOf(24337));
        }
        list = this.permanentAddress;
        if (!(list == null || list.isEmpty())) {
            this.tagPresenceList.add(Integer.valueOf(24386));
        }
        if (this.telephone != null) {
            this.tagPresenceList.add(Integer.valueOf(24338));
        }
        if (this.profession != null) {
            this.tagPresenceList.add(Integer.valueOf(24339));
        }
        if (this.title != null) {
            this.tagPresenceList.add(Integer.valueOf(24340));
        }
        if (this.personalSummary != null) {
            this.tagPresenceList.add(Integer.valueOf(24341));
        }
        if (this.proofOfCitizenship != null) {
            this.tagPresenceList.add(Integer.valueOf(24342));
        }
        list = this.otherValidTDNumbers;
        if (!(list == null || list.isEmpty())) {
            this.tagPresenceList.add(Integer.valueOf(24343));
        }
        if (this.custodyInformation != null) {
            this.tagPresenceList.add(Integer.valueOf(24344));
        }
        return this.tagPresenceList;
    }

    public String bRC() {
        return this.nameOfHolder;
    }

    public List<String> bRD() {
        List list = this.otherNames;
        return list == null ? new ArrayList() : new ArrayList(list);
    }

    public String getPersonalNumber() {
        return this.personalNumber;
    }

    public String bRE() {
        return this.fullDateOfBirth;
    }

    public List<String> bRF() {
        return this.placeOfBirth;
    }

    public List<String> bRG() {
        return this.permanentAddress;
    }

    public String bRH() {
        return this.telephone;
    }

    public String bRI() {
        return this.profession;
    }

    public String getTitle() {
        return this.title;
    }

    public String bRJ() {
        return this.personalSummary;
    }

    public byte[] bRK() {
        return this.proofOfCitizenship;
    }

    public List<String> bRL() {
        return this.otherValidTDNumbers;
    }

    public String bRM() {
        return this.custodyInformation;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DG11File [");
        String str = this.nameOfHolder;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        stringBuilder.append(str);
        str = ", ";
        stringBuilder.append(str);
        List list = this.otherNames;
        String str3 = "[]";
        Object obj = (list == null || list.isEmpty()) ? str3 : this.otherNames;
        stringBuilder.append(obj);
        stringBuilder.append(str);
        String str4 = this.personalNumber;
        if (str4 == null) {
            str4 = str2;
        }
        stringBuilder.append(str4);
        stringBuilder.append(str);
        str4 = this.fullDateOfBirth;
        if (str4 == null) {
            str4 = str2;
        }
        stringBuilder.append(str4);
        stringBuilder.append(str);
        list = this.placeOfBirth;
        str4 = (list == null || list.isEmpty()) ? str3 : this.placeOfBirth.toString();
        stringBuilder.append(str4);
        stringBuilder.append(str);
        list = this.permanentAddress;
        str4 = (list == null || list.isEmpty()) ? str3 : this.permanentAddress.toString();
        stringBuilder.append(str4);
        stringBuilder.append(str);
        str4 = this.telephone;
        if (str4 == null) {
            str4 = str2;
        }
        stringBuilder.append(str4);
        stringBuilder.append(str);
        str4 = this.profession;
        if (str4 == null) {
            str4 = str2;
        }
        stringBuilder.append(str4);
        stringBuilder.append(str);
        str4 = this.title;
        if (str4 == null) {
            str4 = str2;
        }
        stringBuilder.append(str4);
        stringBuilder.append(str);
        str4 = this.personalSummary;
        if (str4 == null) {
            str4 = str2;
        }
        stringBuilder.append(str4);
        stringBuilder.append(str);
        if (this.proofOfCitizenship == null) {
            str4 = str2;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("image (");
            stringBuilder2.append(this.proofOfCitizenship.length);
            stringBuilder2.append(")");
            str4 = stringBuilder2.toString();
        }
        stringBuilder.append(str4);
        stringBuilder.append(str);
        list = this.otherValidTDNumbers;
        if (!(list == null || list.isEmpty())) {
            str3 = this.otherValidTDNumbers.toString();
        }
        stringBuilder.append(str3);
        stringBuilder.append(str);
        str = this.custodyInformation;
        if (str == null) {
            str = str2;
        }
        stringBuilder.append(str);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        return toString().equals(((DG11File) obj).toString());
    }

    public int hashCode() {
        return (toString().hashCode() * 13) + 111;
    }

    public void s(InputStream inputStream) {
        TLVInputStream tLVInputStream = inputStream instanceof TLVInputStream ? (TLVInputStream) inputStream : new TLVInputStream(inputStream);
        if (tLVInputStream.readTag() == 92) {
            int readLength = tLVInputStream.readLength();
            int i = 0;
            int i2 = readLength / 2;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(tLVInputStream.readValue());
            ArrayList<Integer> arrayList = new ArrayList(i2 + 1);
            while (i < readLength) {
                i2 = new TLVInputStream(byteArrayInputStream).readTag();
                i += TLVUtil.getTagLength(i2);
                arrayList.add(Integer.valueOf(i2));
            }
            for (Integer intValue : arrayList) {
                a(intValue.intValue(), tLVInputStream);
            }
            return;
        }
        throw new IllegalArgumentException("Expected tag list in DG11");
    }

    public void g(OutputStream outputStream) {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        tLVOutputStream.writeTag(92);
        DataOutputStream dataOutputStream = new DataOutputStream(tLVOutputStream);
        List<Integer> bRB = bRB();
        for (Integer intValue : bRB) {
            dataOutputStream.writeShort(intValue.intValue());
        }
        dataOutputStream.flush();
        tLVOutputStream.writeValueEnd();
        for (Integer intValue2 : bRB) {
            int intValue3 = intValue2.intValue();
            String str = "UTF-8";
            if (intValue3 != 24363) {
                Object obj = 1;
                if (intValue3 != 24386) {
                    switch (intValue3) {
                        case 24334:
                            tLVOutputStream.writeTag(intValue3);
                            tLVOutputStream.writeValue(this.nameOfHolder.trim().getBytes(str));
                            break;
                        case 24335:
                            if (this.otherNames == null) {
                                this.otherNames = new ArrayList();
                            }
                            tLVOutputStream.writeTag(160);
                            tLVOutputStream.writeTag(2);
                            tLVOutputStream.write(this.otherNames.size());
                            tLVOutputStream.writeValueEnd();
                            for (String str2 : this.otherNames) {
                                tLVOutputStream.writeTag(24335);
                                tLVOutputStream.writeValue(str2.trim().getBytes(str));
                            }
                            tLVOutputStream.writeValueEnd();
                            break;
                        case 24336:
                            tLVOutputStream.writeTag(intValue3);
                            tLVOutputStream.writeValue(this.personalNumber.trim().getBytes(str));
                            break;
                        case 24337:
                            tLVOutputStream.writeTag(intValue3);
                            for (String str22 : this.placeOfBirth) {
                                if (str22 != null) {
                                    if (obj != null) {
                                        obj = null;
                                    } else {
                                        tLVOutputStream.write(60);
                                    }
                                    tLVOutputStream.write(str22.trim().getBytes(str));
                                }
                            }
                            tLVOutputStream.writeValueEnd();
                            break;
                        case 24338:
                            tLVOutputStream.writeTag(intValue3);
                            tLVOutputStream.writeValue(this.telephone.trim().replace(' ', '<').getBytes(str));
                            break;
                        case 24339:
                            tLVOutputStream.writeTag(intValue3);
                            tLVOutputStream.writeValue(this.profession.trim().replace(' ', '<').getBytes(str));
                            break;
                        case 24340:
                            tLVOutputStream.writeTag(intValue3);
                            tLVOutputStream.writeValue(this.title.trim().replace(' ', '<').getBytes(str));
                            break;
                        case 24341:
                            tLVOutputStream.writeTag(intValue3);
                            tLVOutputStream.writeValue(this.personalSummary.trim().replace(' ', '<').getBytes(str));
                            break;
                        case 24342:
                            tLVOutputStream.writeTag(intValue3);
                            tLVOutputStream.writeValue(this.proofOfCitizenship);
                            break;
                        case 24343:
                            tLVOutputStream.writeTag(intValue3);
                            for (String str3 : this.otherValidTDNumbers) {
                                if (str3 != null) {
                                    if (obj != null) {
                                        obj = null;
                                    } else {
                                        tLVOutputStream.write(60);
                                    }
                                    tLVOutputStream.write(str3.trim().replace(' ', '<').getBytes(str));
                                }
                            }
                            tLVOutputStream.writeValueEnd();
                            break;
                        case 24344:
                            tLVOutputStream.writeTag(intValue3);
                            tLVOutputStream.writeValue(this.custodyInformation.trim().replace(' ', '<').getBytes(str));
                            break;
                        default:
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Unknown tag in DG11: ");
                            stringBuilder.append(Integer.toHexString(intValue3));
                            throw new IllegalStateException(stringBuilder.toString());
                    }
                }
                tLVOutputStream.writeTag(intValue3);
                for (String str222 : this.permanentAddress) {
                    if (str222 != null) {
                        if (obj != null) {
                            obj = null;
                        } else {
                            tLVOutputStream.write(60);
                        }
                        tLVOutputStream.write(str222.trim().getBytes(str));
                    }
                }
                tLVOutputStream.writeValueEnd();
            } else {
                tLVOutputStream.writeTag(intValue3);
                tLVOutputStream.writeValue(this.fullDateOfBirth.getBytes(str));
            }
        }
    }

    private void aj(byte[] bArr) {
        try {
            this.custodyInformation = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
            this.custodyInformation = new String(bArr).trim();
        }
    }

    private void ak(byte[] bArr) {
        String trim = new String(bArr).trim();
        try {
            trim = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
        }
        this.otherValidTDNumbers = new ArrayList();
        StringTokenizer stringTokenizer = new StringTokenizer(trim, "<");
        while (stringTokenizer.hasMoreTokens()) {
            this.otherValidTDNumbers.add(stringTokenizer.nextToken().trim());
        }
    }

    private void al(byte[] bArr) {
        this.proofOfCitizenship = bArr;
    }

    private void am(byte[] bArr) {
        try {
            this.personalSummary = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
            this.personalSummary = new String(bArr).trim();
        }
    }

    private void an(byte[] bArr) {
        try {
            this.title = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
            this.title = new String(bArr).trim();
        }
    }

    private void ao(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
        }
        this.profession = str.trim();
    }

    private void ap(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
        }
        this.telephone = str.replace("<", " ").trim();
    }

    private void aq(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "<");
        this.permanentAddress = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            this.permanentAddress.add(stringTokenizer.nextToken().trim());
        }
    }

    private void ar(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "<");
        this.placeOfBirth = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            this.placeOfBirth.add(stringTokenizer.nextToken().trim());
        }
    }

    private void as(byte[] bArr) {
        String bytesToHexString;
        if (bArr.length == 4) {
            bytesToHexString = Hex.bytesToHexString(bArr);
        } else {
            String str = new String(bArr);
            try {
                bytesToHexString = new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                eNz.log(Level.WARNING, "Exception", e);
                bytesToHexString = str;
            }
        }
        this.fullDateOfBirth = bytesToHexString;
    }

    private synchronized void at(byte[] bArr) {
        if (this.otherNames == null) {
            this.otherNames = new ArrayList();
        }
        try {
            this.otherNames.add(new String(bArr, "UTF-8").trim());
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
            this.otherNames.add(new String(bArr).trim());
        }
        return;
    }

    private void au(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
        }
        this.personalNumber = str.trim();
    }

    private void av(byte[] bArr) {
        String str = new String(bArr);
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
        }
        this.nameOfHolder = str.trim();
    }

    private void a(int i, TLVInputStream tLVInputStream) {
        int readTag = tLVInputStream.readTag();
        String str = "Expected ";
        byte[] readValue;
        StringBuilder stringBuilder;
        if (readTag == 160) {
            tLVInputStream.readLength();
            i = tLVInputStream.readTag();
            String str2 = ", found ";
            if (i == 2) {
                i = tLVInputStream.readLength();
                StringBuilder stringBuilder2;
                if (i == 1) {
                    readValue = tLVInputStream.readValue();
                    if (readValue == null || readValue.length != 1) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Number of content specific fields should be encoded in single byte, found ");
                        stringBuilder2.append(Arrays.toString(readValue));
                        throw new IllegalArgumentException(stringBuilder2.toString());
                    }
                    int i2 = 0;
                    i = readValue[0] & 255;
                    while (i2 < i) {
                        int readTag2 = tLVInputStream.readTag();
                        if (readTag2 == 24335) {
                            tLVInputStream.readLength();
                            at(tLVInputStream.readValue());
                            i2++;
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str);
                            stringBuilder.append(Integer.toHexString(24335));
                            stringBuilder.append(str2);
                            stringBuilder.append(Integer.toHexString(readTag2));
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    return;
                }
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Expected length 1 count length, found ");
                stringBuilder2.append(i);
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(str);
            stringBuilder3.append(Integer.toHexString(2));
            stringBuilder3.append(str2);
            stringBuilder3.append(Integer.toHexString(i));
            throw new IllegalArgumentException(stringBuilder3.toString());
        } else if (readTag == i) {
            tLVInputStream.readLength();
            readValue = tLVInputStream.readValue();
            if (readTag == 24363) {
                as(readValue);
            } else if (readTag != 24386) {
                switch (readTag) {
                    case 24334:
                        av(readValue);
                        return;
                    case 24335:
                        at(readValue);
                        return;
                    case 24336:
                        au(readValue);
                        return;
                    case 24337:
                        ar(readValue);
                        return;
                    case 24338:
                        ap(readValue);
                        return;
                    case 24339:
                        ao(readValue);
                        return;
                    case 24340:
                        an(readValue);
                        return;
                    case 24341:
                        am(readValue);
                        return;
                    case 24342:
                        al(readValue);
                        return;
                    case 24343:
                        ak(readValue);
                        return;
                    case 24344:
                        aj(readValue);
                        return;
                    default:
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown field tag in DG11: ");
                        stringBuilder.append(Integer.toHexString(readTag));
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            } else {
                aq(readValue);
            }
        } else {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(str);
            stringBuilder4.append(Integer.toHexString(i));
            stringBuilder4.append(", but found ");
            stringBuilder4.append(Integer.toHexString(readTag));
            throw new IllegalArgumentException(stringBuilder4.toString());
        }
    }
}
