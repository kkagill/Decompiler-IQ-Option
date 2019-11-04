package org.jmrtd.lds;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.cms.ContentInfo;
import org.spongycastle.asn1.cms.SignedData;
import org.spongycastle.asn1.icao.DataGroupHash;
import org.spongycastle.asn1.icao.LDSSecurityObject;

public class SODFile extends AbstractTaggedLDSFile {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -1081347374739311111L;
    private transient SignedData fEY;

    public SODFile(InputStream inputStream) {
        super(119, inputStream);
    }

    /* Access modifiers changed, original: protected */
    public void s(InputStream inputStream) {
        this.fEY = b.t(inputStream);
    }

    /* Access modifiers changed, original: protected */
    public void g(OutputStream outputStream) {
        b.a(this.fEY, outputStream);
    }

    public Map<Integer, byte[]> bRs() {
        DataGroupHash[] datagroupHash = a(this.fEY).getDatagroupHash();
        TreeMap treeMap = new TreeMap();
        for (DataGroupHash dataGroupHash : datagroupHash) {
            treeMap.put(Integer.valueOf(dataGroupHash.getDataGroupNumber()), dataGroupHash.getDataGroupHashValue().getOctets());
        }
        return treeMap;
    }

    public byte[] bRt() {
        return b.e(this.fEY);
    }

    public byte[] bRu() {
        return b.d(this.fEY);
    }

    public String getDigestAlgorithm() {
        return a(a(this.fEY));
    }

    private static String a(LDSSecurityObject lDSSecurityObject) {
        try {
            return b.no(lDSSecurityObject.getDigestAlgorithmIdentifier().getAlgorithm().getId());
        } catch (NoSuchAlgorithmException e) {
            eNz.log(Level.WARNING, "Exception", e);
            return null;
        }
    }

    public String bRv() {
        return b.b(this.fEY);
    }

    public String bRw() {
        return b.c(this.fEY);
    }

    public X509Certificate bRx() {
        return b.f(this.fEY);
    }

    public String toString() {
        try {
            X509Certificate bRx = bRx();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SODFile ");
            stringBuilder.append(bRx.getIssuerX500Principal());
            return stringBuilder.toString();
        } catch (Exception e) {
            eNz.log(Level.WARNING, "Unexpected exception", e);
            return "SODFile";
        }
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
        return Arrays.equals(getEncoded(), ((SODFile) obj).getEncoded());
    }

    public int hashCode() {
        return (Arrays.hashCode(getEncoded()) * 11) + 111;
    }

    private static LDSSecurityObject a(SignedData signedData) {
        String str = "2.23.136.1.1.1";
        ASN1InputStream aSN1InputStream;
        try {
            ContentInfo encapContentInfo = signedData.getEncapContentInfo();
            String id = encapContentInfo.getContentType().getId();
            DEROctetString dEROctetString = (DEROctetString) encapContentInfo.getContent();
            if (!(str.equals(id) || "1.2.528.1.1006.1.20.1".equals(id) || "1.3.27.1.1.1".equals(id))) {
                Logger logger = eNz;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SignedData does not appear to contain an LDS SOd. (content type is ");
                stringBuilder.append(id);
                stringBuilder.append(", was expecting ");
                stringBuilder.append(str);
                stringBuilder.append(")");
                logger.warning(stringBuilder.toString());
            }
            aSN1InputStream = new ASN1InputStream(new ByteArrayInputStream(dEROctetString.getOctets()));
            ASN1Primitive readObject = aSN1InputStream.readObject();
            if (readObject instanceof ASN1Sequence) {
                LDSSecurityObject instance = LDSSecurityObject.getInstance(readObject);
                if (aSN1InputStream.readObject() != null) {
                    eNz.warning("Ignoring extra object found after LDSSecurityObject...");
                }
                aSN1InputStream.close();
                return instance;
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Expected ASN1Sequence, found ");
            stringBuilder2.append(readObject.getClass().getSimpleName());
            throw new IllegalStateException(stringBuilder2.toString());
        } catch (IOException e) {
            throw new IllegalStateException("Could not read security object in signedData", e);
        } catch (Throwable th) {
            aSN1InputStream.close();
        }
    }
}
