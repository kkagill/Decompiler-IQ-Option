package org.jmrtd.protocol;

import java.security.PublicKey;
import net.sf.scuba.smartcards.CardServiceException;
import org.jmrtd.d;

/* compiled from: AAProtocol */
public class a {
    private d fEf;
    private SecureMessagingWrapper wrapper;

    public a(d dVar, SecureMessagingWrapper secureMessagingWrapper) {
        this.fEf = dVar;
        this.wrapper = secureMessagingWrapper;
    }

    public AAResult a(PublicKey publicKey, String str, String str2, byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length == 8) {
                    return new AAResult(publicKey, str, str2, bArr, this.fEf.b(this.wrapper, bArr));
                }
            } catch (IllegalArgumentException e) {
                throw new CardServiceException("Exception", e);
            }
        }
        throw new IllegalArgumentException("AA failed: bad challenge");
    }
}
