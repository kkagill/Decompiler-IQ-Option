package org.jmrtd.protocol;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import org.jmrtd.e;

/* compiled from: PACEGMWithECDHAgreement */
public class c {
    private ECPrivateKey fFw;

    public void b(PrivateKey privateKey) {
        if (privateKey instanceof ECPrivateKey) {
            this.fFw = (ECPrivateKey) privateKey;
            return;
        }
        throw new InvalidKeyException("Not an ECPrivateKey");
    }

    public ECPoint d(PublicKey publicKey) {
        if (this.fFw == null) {
            throw new IllegalStateException("Not initialized!");
        } else if (publicKey instanceof ECPublicKey) {
            org.spongycastle.math.ec.ECPoint normalize = e.a((ECPublicKey) publicKey).getQ().multiply(e.a(this.fFw).getD()).normalize();
            if (!normalize.isInfinity()) {
                return e.a(normalize);
            }
            throw new IllegalStateException("Infinity");
        } else {
            throw new InvalidKeyException("Not an ECPublicKey");
        }
    }
}
