package org.jmrtd.lds.icao;

import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;
import net.sf.scuba.tlv.TLVUtil;
import net.sf.scuba.util.Hex;
import org.jmrtd.lds.DataGroup;

public class DG12File extends DataGroup {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -1979367459379125674L;
    private String dateAndTimeOfPersonalization;
    private String dateOfIssue;
    private String endorsementsAndObservations;
    private byte[] imageOfFront;
    private byte[] imageOfRear;
    private String issuingAuthority;
    private List<String> namesOfOtherPersons;
    private String personalizationSystemSerialNumber;
    private List<Integer> tagPresenceList;
    private String taxOrExitRequirements;

    public int getTag() {
        return 108;
    }

    public DG12File(InputStream inputStream) {
        super(108, inputStream);
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
        throw new IllegalArgumentException("Expected tag list in DG12");
    }

    public void g(OutputStream outputStream) {
        TLVOutputStream tLVOutputStream = outputStream instanceof TLVOutputStream ? (TLVOutputStream) outputStream : new TLVOutputStream(outputStream);
        tLVOutputStream.writeTag(92);
        List<Integer> bRB = bRB();
        DataOutputStream dataOutputStream = new DataOutputStream(tLVOutputStream);
        for (Integer intValue : bRB) {
            dataOutputStream.writeShort(intValue.intValue());
        }
        dataOutputStream.flush();
        tLVOutputStream.writeValueEnd();
        for (Integer intValue2 : bRB) {
            int intValue3 = intValue2.intValue();
            String str = "UTF-8";
            if (intValue3 == 24358) {
                tLVOutputStream.writeTag(intValue3);
                tLVOutputStream.writeValue(this.dateOfIssue.getBytes(str));
            } else if (intValue3 == 24405) {
                tLVOutputStream.writeTag(intValue3);
                tLVOutputStream.writeValue(this.dateAndTimeOfPersonalization.getBytes(str));
            } else if (intValue3 != 24406) {
                switch (intValue3) {
                    case 24345:
                        tLVOutputStream.writeTag(intValue3);
                        tLVOutputStream.writeValue(this.issuingAuthority.trim().getBytes(str));
                        break;
                    case 24346:
                        if (this.namesOfOtherPersons == null) {
                            this.namesOfOtherPersons = new ArrayList();
                        }
                        tLVOutputStream.writeTag(160);
                        tLVOutputStream.writeTag(2);
                        tLVOutputStream.write(this.namesOfOtherPersons.size());
                        tLVOutputStream.writeValueEnd();
                        for (String str2 : this.namesOfOtherPersons) {
                            tLVOutputStream.writeTag(24346);
                            tLVOutputStream.writeValue(str2.trim().getBytes(str));
                        }
                        tLVOutputStream.writeValueEnd();
                        break;
                    case 24347:
                        tLVOutputStream.writeTag(intValue3);
                        tLVOutputStream.writeValue(this.endorsementsAndObservations.trim().getBytes(str));
                        break;
                    case 24348:
                        tLVOutputStream.writeTag(intValue3);
                        tLVOutputStream.writeValue(this.taxOrExitRequirements.trim().getBytes(str));
                        break;
                    case 24349:
                        tLVOutputStream.writeTag(intValue3);
                        tLVOutputStream.writeValue(this.imageOfFront);
                        break;
                    case 24350:
                        tLVOutputStream.writeTag(intValue3);
                        tLVOutputStream.writeValue(this.imageOfRear);
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown field tag in DG12: ");
                        stringBuilder.append(Integer.toHexString(intValue3));
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            } else {
                tLVOutputStream.writeTag(intValue3);
                tLVOutputStream.writeValue(this.personalizationSystemSerialNumber.trim().getBytes(str));
            }
        }
    }

    public List<Integer> bRB() {
        List list = this.tagPresenceList;
        if (list != null) {
            return list;
        }
        this.tagPresenceList = new ArrayList(10);
        if (this.issuingAuthority != null) {
            this.tagPresenceList.add(Integer.valueOf(24345));
        }
        if (this.dateOfIssue != null) {
            this.tagPresenceList.add(Integer.valueOf(24358));
        }
        list = this.namesOfOtherPersons;
        if (!(list == null || list.isEmpty())) {
            this.tagPresenceList.add(Integer.valueOf(24346));
        }
        if (this.endorsementsAndObservations != null) {
            this.tagPresenceList.add(Integer.valueOf(24347));
        }
        if (this.taxOrExitRequirements != null) {
            this.tagPresenceList.add(Integer.valueOf(24348));
        }
        if (this.imageOfFront != null) {
            this.tagPresenceList.add(Integer.valueOf(24349));
        }
        if (this.imageOfRear != null) {
            this.tagPresenceList.add(Integer.valueOf(24350));
        }
        if (this.dateAndTimeOfPersonalization != null) {
            this.tagPresenceList.add(Integer.valueOf(24405));
        }
        if (this.personalizationSystemSerialNumber != null) {
            this.tagPresenceList.add(Integer.valueOf(24406));
        }
        return this.tagPresenceList;
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
                        if (readTag2 == 24346) {
                            tLVInputStream.readLength();
                            aC(tLVInputStream.readValue());
                            i2++;
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str);
                            stringBuilder.append(Integer.toHexString(24346));
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
            if (readTag == 24358) {
                aD(readValue);
            } else if (readTag == 24405) {
                ax(readValue);
            } else if (readTag != 24406) {
                switch (readTag) {
                    case 24345:
                        aE(readValue);
                        return;
                    case 24346:
                        aC(readValue);
                        return;
                    case 24347:
                        aB(readValue);
                        return;
                    case 24348:
                        aA(readValue);
                        return;
                    case 24349:
                        ay(readValue);
                        return;
                    case 24350:
                        az(readValue);
                        return;
                    default:
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown field tag in DG12: ");
                        stringBuilder.append(Integer.toHexString(readTag));
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            } else {
                aw(readValue);
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

    public String bRN() {
        return this.issuingAuthority;
    }

    public String bRO() {
        return this.dateOfIssue;
    }

    public List<String> bRP() {
        return this.namesOfOtherPersons;
    }

    public String bRQ() {
        return this.endorsementsAndObservations;
    }

    public byte[] bRR() {
        return this.imageOfFront;
    }

    public byte[] bRS() {
        return this.imageOfRear;
    }

    public String bRT() {
        return this.dateAndTimeOfPersonalization;
    }

    public String bRU() {
        return this.personalizationSystemSerialNumber;
    }

    public String toString() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("DG12File [");
        String str = this.issuingAuthority;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        stringBuilder2.append(str);
        str = ", ";
        stringBuilder2.append(str);
        String str3 = this.dateOfIssue;
        if (str3 == null) {
            str3 = str2;
        }
        stringBuilder2.append(str3);
        stringBuilder2.append(str);
        List list = this.namesOfOtherPersons;
        Object obj = (list == null || list.isEmpty()) ? str2 : this.namesOfOtherPersons;
        stringBuilder2.append(obj);
        stringBuilder2.append(str);
        str3 = this.endorsementsAndObservations;
        if (str3 == null) {
            str3 = str2;
        }
        stringBuilder2.append(str3);
        stringBuilder2.append(str);
        str3 = this.taxOrExitRequirements;
        if (str3 == null) {
            str3 = str2;
        }
        stringBuilder2.append(str3);
        stringBuilder2.append(str);
        String str4 = ")";
        String str5 = "image (";
        if (this.imageOfFront == null) {
            str3 = str2;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str5);
            stringBuilder.append(this.imageOfFront.length);
            stringBuilder.append(str4);
            str3 = stringBuilder.toString();
        }
        stringBuilder2.append(str3);
        stringBuilder2.append(str);
        if (this.imageOfRear == null) {
            str3 = str2;
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str5);
            stringBuilder.append(this.imageOfRear.length);
            stringBuilder.append(str4);
            str3 = stringBuilder.toString();
        }
        stringBuilder2.append(str3);
        stringBuilder2.append(str);
        str3 = this.dateAndTimeOfPersonalization;
        if (str3 == null) {
            str3 = str2;
        }
        stringBuilder2.append(str3);
        stringBuilder2.append(str);
        str = this.personalizationSystemSerialNumber;
        if (str == null) {
            str = str2;
        }
        stringBuilder2.append(str);
        stringBuilder2.append("]");
        return stringBuilder2.toString();
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
        return toString().equals(((DG12File) obj).toString());
    }

    public int hashCode() {
        return (toString().hashCode() * 13) + 112;
    }

    private void aw(byte[] bArr) {
        try {
            this.personalizationSystemSerialNumber = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
            this.personalizationSystemSerialNumber = new String(bArr).trim();
        }
    }

    private void ax(byte[] bArr) {
        try {
            this.dateAndTimeOfPersonalization = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
        }
    }

    private void ay(byte[] bArr) {
        this.imageOfFront = bArr;
    }

    private void az(byte[] bArr) {
        this.imageOfRear = bArr;
    }

    private void aA(byte[] bArr) {
        try {
            this.taxOrExitRequirements = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
            this.taxOrExitRequirements = new String(bArr).trim();
        }
    }

    private void aB(byte[] bArr) {
        try {
            this.endorsementsAndObservations = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
            this.endorsementsAndObservations = new String(bArr).trim();
        }
    }

    private synchronized void aC(byte[] bArr) {
        if (this.namesOfOtherPersons == null) {
            this.namesOfOtherPersons = new ArrayList();
        }
        try {
            this.namesOfOtherPersons.add(new String(bArr, "UTF-8").trim());
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
            this.namesOfOtherPersons.add(new String(bArr).trim());
        }
        return;
    }

    private void aD(byte[] bArr) {
        String str = "Wrong date format";
        if (bArr != null) {
            if (bArr.length == 8) {
                try {
                    this.dateOfIssue = new String(bArr, "UTF-8").trim();
                    return;
                } catch (UnsupportedEncodingException e) {
                    eNz.log(Level.WARNING, "Exception", e);
                }
            }
            eNz.warning("DG12 date of issue is not in expected ccyymmdd ASCII format");
            if (bArr.length == 4) {
                this.dateOfIssue = Hex.bytesToHexString(bArr).trim();
                return;
            }
            throw new IllegalArgumentException(str);
        }
        throw new IllegalArgumentException(str);
    }

    private void aE(byte[] bArr) {
        try {
            this.issuingAuthority = new String(bArr, "UTF-8").trim();
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
            this.issuingAuthority = new String(bArr).trim();
        }
    }
}
