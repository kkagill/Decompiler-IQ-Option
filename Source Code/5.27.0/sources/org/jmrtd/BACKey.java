package org.jmrtd;

import com.jumio.analytics.MobileEvents;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BACKey implements BACKeySpec {
    private static final long serialVersionUID = -1059774581180524710L;
    private String dateOfBirth;
    private String dateOfExpiry;
    private String documentNumber;

    protected BACKey() {
    }

    public BACKey(String str, Date date, Date date2) {
        this(str, h(date), h(date2));
    }

    public BACKey(String str, String str2, String str3) {
        if (str != null) {
            String str4 = "Illegal date: ";
            if (str2 == null || str2.length() != 6) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str4);
                stringBuilder.append(str2);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (str3 == null || str3.length() != 6) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str4);
                stringBuilder2.append(str3);
                throw new IllegalArgumentException(stringBuilder2.toString());
            } else {
                StringBuilder stringBuilder3 = new StringBuilder(str);
                while (stringBuilder3.length() < 9) {
                    stringBuilder3.append('<');
                }
                this.documentNumber = stringBuilder3.toString().trim();
                this.dateOfBirth = str2;
                this.dateOfExpiry = str3;
                return;
            }
        }
        throw new IllegalArgumentException("Illegal document number");
    }

    public String bQS() {
        return this.documentNumber;
    }

    public String bQT() {
        return this.dateOfBirth;
    }

    public String bQU() {
        return this.dateOfExpiry;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.documentNumber);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(this.dateOfBirth);
        stringBuilder.append(str);
        stringBuilder.append(this.dateOfExpiry);
        return stringBuilder.toString();
    }

    public int hashCode() {
        String str = this.documentNumber;
        int i = 0;
        int hashCode = (MobileEvents.EVENTTYPE_EXCEPTION + (str == null ? 0 : str.hashCode())) * 61;
        str = this.dateOfBirth;
        hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 61;
        str = this.dateOfExpiry;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        BACKey bACKey = (BACKey) obj;
        if (this.documentNumber.equals(bACKey.documentNumber) && this.dateOfBirth.equals(bACKey.dateOfBirth) && this.dateOfExpiry.equals(bACKey.dateOfExpiry)) {
            z = true;
        }
        return z;
    }

    private static synchronized String h(Date date) {
        String format;
        synchronized (BACKey.class) {
            format = new SimpleDateFormat("yyMMdd").format(date);
        }
        return format;
    }
}
