package org.jmrtd.lds;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Set;

public class CardAccessFile implements Serializable {
    private static final long serialVersionUID = -3536507558193769951L;
    private Set<SecurityInfo> securityInfos;

    public CardAccessFile(InputStream inputStream) {
        s(inputStream);
    }

    /* Access modifiers changed, original: protected */
    public void s(InputStream inputStream) {
        this.securityInfos = new HashSet();
        ASN1Set aSN1Set = (ASN1Set) new ASN1InputStream(inputStream).readObject();
        for (int i = 0; i < aSN1Set.size(); i++) {
            SecurityInfo a = SecurityInfo.a(aSN1Set.getObjectAt(i).toASN1Primitive());
            if (a != null) {
                this.securityInfos.add(a);
            }
        }
    }

    public Collection<SecurityInfo> bRo() {
        return this.securityInfos;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CardAccessFile [");
        stringBuilder.append(this.securityInfos.toString());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        CardAccessFile cardAccessFile = (CardAccessFile) obj;
        Set set = this.securityInfos;
        if (set == null) {
            if (cardAccessFile.securityInfos == null) {
                z = true;
            }
            return z;
        }
        Set set2 = cardAccessFile.securityInfos;
        if (set2 != null) {
            return set.equals(set2);
        }
        if (set == null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return (this.securityInfos.hashCode() * 7) + 61;
    }
}
