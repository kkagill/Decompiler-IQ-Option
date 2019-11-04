package org.jmrtd.protocol;

import java.io.Serializable;
import org.jmrtd.BACKeySpec;

public class BACResult implements Serializable {
    private static final long serialVersionUID = -7114911372181772099L;
    private BACKeySpec bacKey;
    private SecureMessagingWrapper wrapper;

    public BACResult(BACKeySpec bACKeySpec, SecureMessagingWrapper secureMessagingWrapper) {
        this.bacKey = bACKeySpec;
        this.wrapper = secureMessagingWrapper;
    }

    public SecureMessagingWrapper bSm() {
        return this.wrapper;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("BACResult [bacKey: ");
        Object obj = this.bacKey;
        if (obj == null) {
            obj = "-";
        }
        stringBuilder2.append(obj);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append(", wrapper: ");
        stringBuilder2.append(this.wrapper);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public int hashCode() {
        BACKeySpec bACKeySpec = this.bacKey;
        int i = 0;
        int hashCode = (1303377669 + (bACKeySpec == null ? 0 : bACKeySpec.hashCode())) * 1234567891;
        SecureMessagingWrapper secureMessagingWrapper = this.wrapper;
        if (secureMessagingWrapper != null) {
            i = secureMessagingWrapper.hashCode();
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BACResult bACResult = (BACResult) obj;
        BACKeySpec bACKeySpec = this.bacKey;
        if (bACKeySpec == null) {
            if (bACResult.bacKey != null) {
                return false;
            }
        } else if (!bACKeySpec.equals(bACResult.bacKey)) {
            return false;
        }
        SecureMessagingWrapper secureMessagingWrapper = this.wrapper;
        if (secureMessagingWrapper == null) {
            if (bACResult.wrapper != null) {
                return false;
            }
        } else if (!secureMessagingWrapper.equals(bACResult.wrapper)) {
            return false;
        }
        return true;
    }
}
