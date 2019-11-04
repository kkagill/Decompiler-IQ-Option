package org.jmrtd.lds;

import com.iqoption.dto.entity.ActiveQuote;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jmrtd.e;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1Set;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.DLSequence;
import org.spongycastle.asn1.cms.Attribute;
import org.spongycastle.asn1.cms.SignedData;
import org.spongycastle.asn1.cms.SignerInfo;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.x509.Certificate;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;

/* compiled from: SignedDataUtil */
final class b {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");

    public static SignedData t(InputStream inputStream) {
        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(inputStream).readObject();
        StringBuilder stringBuilder;
        if (aSN1Sequence.size() == 2) {
            String id = ((ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0)).getId();
            if ("1.2.840.113549.1.7.2".equals(id)) {
                ASN1Primitive a = a(aSN1Sequence.getObjectAt(1));
                if (a instanceof ASN1Sequence) {
                    return SignedData.getInstance(a);
                }
                throw new IOException("Was expecting an ASN.1 sequence as content");
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Was expecting signed-data content type OID (1.2.840.113549.1.7.2), found ");
            stringBuilder.append(id);
            throw new IOException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Was expecting a DER sequence of length 2, found a DER sequence of length ");
        stringBuilder.append(aSN1Sequence.size());
        throw new IOException(stringBuilder.toString());
    }

    public static void a(SignedData signedData, OutputStream outputStream) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier("1.2.840.113549.1.7.2"));
        aSN1EncodableVector.add(new DERTaggedObject(0, signedData));
        outputStream.write(new DLSequence(aSN1EncodableVector).getEncoded("DER"));
    }

    public static ASN1Primitive a(ASN1Encodable aSN1Encodable) {
        StringBuilder stringBuilder;
        if (aSN1Encodable instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Encodable;
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                return aSN1TaggedObject.getObject();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Was expecting tag 0, found ");
            stringBuilder.append(Integer.toHexString(tagNo));
            throw new IOException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Was expecting an ASN1TaggedObject, found ");
        stringBuilder.append(aSN1Encodable.getClass().getCanonicalName());
        throw new IOException(stringBuilder.toString());
    }

    public static String b(SignedData signedData) {
        try {
            return no(h(signedData).getDigestAlgorithm().getAlgorithm().getId());
        } catch (NoSuchAlgorithmException e) {
            Logger logger = eNz;
            Level level = Level.WARNING;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No such algorithm");
            stringBuilder.append(e);
            logger.log(level, stringBuilder.toString());
            return null;
        }
    }

    public static String c(SignedData signedData) {
        try {
            String id = h(signedData).getDigestEncryptionAlgorithm().getAlgorithm().getId();
            if (id != null) {
                return no(id);
            }
            eNz.warning("Could not determine digest encryption algorithm OID");
            return null;
        } catch (NoSuchAlgorithmException e) {
            eNz.log(Level.WARNING, "No such algorithm", e);
            return null;
        }
    }

    public static byte[] d(SignedData signedData) {
        SignerInfo h = h(signedData);
        ASN1Set authenticatedAttributes = h.getAuthenticatedAttributes();
        byte[] octets = ((DEROctetString) signedData.getEncapContentInfo().getContent()).getOctets();
        if (authenticatedAttributes.size() == 0) {
            return octets;
        }
        byte[] bArr = null;
        String id = h.getDigestAlgorithm().getAlgorithm().getId();
        try {
            bArr = authenticatedAttributes.getEncoded("DER");
            a(a(authenticatedAttributes), id, octets);
        } catch (NoSuchAlgorithmException e) {
            Logger logger = eNz;
            Level level = Level.WARNING;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error checking signedAttributes in eContent! No such algorithm: \"");
            stringBuilder.append(id);
            logger.log(level, stringBuilder.toString(), e);
        } catch (IOException e2) {
            eNz.log(Level.WARNING, "Error getting signedAttributes", e2);
        }
        return bArr;
    }

    public static byte[] e(SignedData signedData) {
        return h(signedData).getEncryptedDigest().getOctets();
    }

    public static X509Certificate f(SignedData signedData) {
        List g = g(signedData);
        if (g == null || g.isEmpty()) {
            return null;
        }
        int size = g.size();
        if (size != 1) {
            Logger logger = eNz;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Found ");
            stringBuilder.append(size);
            stringBuilder.append(" certificates, interpreting last one as document signer certificate");
            logger.warning(stringBuilder.toString());
        }
        return (X509Certificate) g.get(size - 1);
    }

    public static List<X509Certificate> g(SignedData signedData) {
        int i;
        ASN1Set certificates = signedData.getCertificates();
        if (certificates == null) {
            i = 0;
        } else {
            i = certificates.size();
        }
        ArrayList arrayList = new ArrayList(i);
        if (i <= 0) {
            return arrayList;
        }
        for (int i2 = 0; i2 < i; i2++) {
            try {
                arrayList.add(a(Certificate.getInstance(certificates.getObjectAt(i2))));
            } catch (Exception e) {
                eNz.log(Level.WARNING, "Exception in decoding certificate", e);
            }
        }
        return arrayList;
    }

    public static X509Certificate a(Certificate certificate) {
        return (X509Certificate) CertificateFactory.getInstance("X.509", e.bQZ()).generateCertificate(new ByteArrayInputStream(certificate.getEncoded("DER")));
    }

    public static String no(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals(X509ObjectIdentifiers.organization.getId())) {
            return "O";
        }
        if (str.equals(X509ObjectIdentifiers.organizationalUnitName.getId())) {
            return "OU";
        }
        if (str.equals(X509ObjectIdentifiers.commonName.getId())) {
            return "CN";
        }
        if (str.equals(X509ObjectIdentifiers.countryName.getId())) {
            return ActiveQuote.PHASE_CLOSED;
        }
        if (str.equals(X509ObjectIdentifiers.stateOrProvinceName.getId())) {
            return "ST";
        }
        if (str.equals(X509ObjectIdentifiers.localityName.getId())) {
            return "L";
        }
        String str2 = "SHA-1";
        if (str.equals(X509ObjectIdentifiers.id_SHA1.getId())) {
            return str2;
        }
        if (str.equals(NISTObjectIdentifiers.id_sha224.getId())) {
            return "SHA-224";
        }
        if (str.equals(NISTObjectIdentifiers.id_sha256.getId())) {
            return "SHA-256";
        }
        if (str.equals(NISTObjectIdentifiers.id_sha384.getId())) {
            return "SHA-384";
        }
        if (str.equals(NISTObjectIdentifiers.id_sha512.getId())) {
            return "SHA-512";
        }
        if (str.equals("1.2.840.10045.4.1")) {
            return "SHA1withECDSA";
        }
        if (str.equals("1.2.840.10045.4.3.1")) {
            return "SHA224withECDSA";
        }
        if (str.equals("1.2.840.10045.4.3.2")) {
            return "SHA256withECDSA";
        }
        if (str.equals("1.2.840.10045.4.3.3")) {
            return "SHA384withECDSA";
        }
        if (str.equals("1.2.840.10045.4.3.4")) {
            return "SHA512withECDSA";
        }
        if (str.equals("1.2.840.113549.1.1.1")) {
            return "RSA";
        }
        if (str.equals("1.2.840.113549.1.1.2")) {
            return "MD2withRSA";
        }
        if (str.equals("1.2.840.113549.1.1.3")) {
            return "MD4withRSA";
        }
        if (str.equals("1.2.840.113549.1.1.4")) {
            return "MD5withRSA";
        }
        if (str.equals("1.2.840.113549.1.1.5")) {
            return "SHA1withRSA";
        }
        if (str.equals("1.2.840.113549.1.1.11")) {
            return "SHA256withRSA";
        }
        if (str.equals("1.2.840.113549.1.1.12")) {
            return "SHA384withRSA";
        }
        if (str.equals("1.2.840.113549.1.1.13")) {
            return "SHA512withRSA";
        }
        if (str.equals("1.2.840.113549.1.1.14")) {
            return "SHA224withRSA";
        }
        if (str.equals("1.3.14.3.2.26")) {
            return str2;
        }
        if (str.equals("1.2.840.113549.1.1.10")) {
            return "SSAwithRSA/PSS";
        }
        if (str.equals("1.2.840.113549.1.1.8")) {
            return "MGF1";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown OID ");
        stringBuilder.append(str);
        throw new NoSuchAlgorithmException(stringBuilder.toString());
    }

    private static void a(Collection<Attribute> collection, String str, byte[] bArr) {
        for (Attribute attribute : collection) {
            if ("1.2.840.113549.1.9.4".equals(attribute.getAttrType().getId())) {
                ASN1Set attrValues = attribute.getAttrValues();
                if (attrValues.size() != 1) {
                    eNz.warning("Expected only one attribute value in signedAttribute message digest in eContent!");
                }
                byte[] octets = ((DEROctetString) attrValues.getObjectAt(0)).getOctets();
                if (octets == null) {
                    eNz.warning("Error extracting signedAttribute message digest in eContent!");
                }
                if (!Arrays.equals(octets, MessageDigest.getInstance(str).digest(bArr))) {
                    throw new SignatureException("Error checking signedAttribute message digest in eContent!");
                }
            }
        }
    }

    private static List<Attribute> a(ASN1Set aSN1Set) {
        ArrayList<ASN1Sequence> list = Collections.list(aSN1Set.getObjects());
        ArrayList arrayList = new ArrayList(list.size());
        for (ASN1Sequence instance : list) {
            arrayList.add(Attribute.getInstance(instance));
        }
        return arrayList;
    }

    private static SignerInfo h(SignedData signedData) {
        ASN1Set signerInfos = signedData.getSignerInfos();
        if (signerInfos == null || signerInfos.size() <= 0) {
            throw new IllegalArgumentException("No signer info in signed data");
        }
        if (signerInfos.size() > 1) {
            Logger logger = eNz;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Found ");
            stringBuilder.append(signerInfos.size());
            stringBuilder.append(" signerInfos");
            logger.warning(stringBuilder.toString());
        }
        return SignerInfo.getInstance(signerInfos.getObjectAt(0));
    }
}
