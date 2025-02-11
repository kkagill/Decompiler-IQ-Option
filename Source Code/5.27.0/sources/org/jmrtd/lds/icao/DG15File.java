package org.jmrtd.lds.icao;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jmrtd.e;
import org.jmrtd.lds.DataGroup;

public class DG15File extends DataGroup {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final String[] fFq = new String[]{"RSA", "EC"};
    private static final long serialVersionUID = 3834304239673755744L;
    private PublicKey publicKey;

    public DG15File(InputStream inputStream) {
        super(111, inputStream);
    }

    public void s(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        try {
            byte[] bArr = new byte[getLength()];
            dataInputStream.readFully(bArr);
            this.publicKey = aF(bArr);
        } catch (GeneralSecurityException e) {
            eNz.log(Level.WARNING, "Unexpected exception while reading DG15 content", e);
        }
    }

    private static PublicKey aF(byte[] bArr) {
        KeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArr);
        String[] strArr = fFq;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            try {
                strArr = e.a(strArr[i], x509EncodedKeySpec);
                return strArr;
            } catch (InvalidKeySpecException e) {
                eNz.log(Level.FINE, "Ignore, try next algorithm", e);
                i++;
            }
        }
        throw new InvalidAlgorithmParameterException();
    }

    public void g(OutputStream outputStream) {
        outputStream.write(this.publicKey.getEncoded());
    }

    public PublicKey getPublicKey() {
        return this.publicKey;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.publicKey.equals(((DG15File) obj).publicKey);
    }

    public int hashCode() {
        return (this.publicKey.hashCode() * 5) + 61;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DG15File [");
        stringBuilder.append(e.a(this.publicKey));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
