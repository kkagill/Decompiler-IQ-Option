package org.jmrtd.lds;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jmrtd.e;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.eac.EACObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;

public abstract class SecurityInfo extends AbstractLDSInfo {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    public static final String fEZ = EACObjectIdentifiers.id_PK_DH.getId();
    public static final String fFa = EACObjectIdentifiers.id_PK_ECDH.getId();
    public static final String fFb = EACObjectIdentifiers.id_CA_DH_3DES_CBC_CBC.getId();
    public static final String fFc = EACObjectIdentifiers.id_CA_ECDH_3DES_CBC_CBC.getId();
    public static final String fFd = EACObjectIdentifiers.id_TA.getId();
    public static final String fFe = EACObjectIdentifiers.id_TA_RSA.getId();
    public static final String fFf = EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1.getId();
    public static final String fFg = EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256.getId();
    public static final String fFh = EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1.getId();
    public static final String fFi = EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256.getId();
    public static final String fFj = EACObjectIdentifiers.id_TA_ECDSA.getId();
    public static final String fFk = EACObjectIdentifiers.id_TA_ECDSA_SHA_1.getId();
    public static final String fFl = EACObjectIdentifiers.id_TA_ECDSA_SHA_224.getId();
    public static final String fFm = EACObjectIdentifiers.id_TA_ECDSA_SHA_256.getId();
    public static final String fFn = X9ObjectIdentifiers.id_publicKeyType.getId();
    public static final String fFo = X9ObjectIdentifiers.id_ecPublicKey.getId();
    private static final long serialVersionUID = -7919854443619069808L;

    @Deprecated
    public abstract ASN1Primitive bRj();

    public abstract String bRk();

    public void f(OutputStream outputStream) {
        ASN1Primitive bRj = bRj();
        String str = "Could not decode from DER.";
        if (bRj != null) {
            byte[] encoded = bRj.getEncoded("DER");
            if (encoded != null) {
                outputStream.write(encoded);
                return;
            }
            throw new IOException(str);
        }
        throw new IOException(str);
    }

    public static SecurityInfo a(ASN1Primitive aSN1Primitive) {
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1Primitive;
            String id = ((ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0)).getId();
            ASN1Primitive toASN1Primitive = aSN1Sequence.getObjectAt(1).toASN1Primitive();
            aSN1Primitive = aSN1Sequence.size() == 3 ? aSN1Sequence.getObjectAt(2).toASN1Primitive() : null;
            int intValue;
            if (ActiveAuthenticationInfo.np(id)) {
                intValue = ((ASN1Integer) toASN1Primitive).getValue().intValue();
                if (aSN1Primitive == null) {
                    return new ActiveAuthenticationInfo(id, intValue, null);
                }
                return new ActiveAuthenticationInfo(id, intValue, ((ASN1ObjectIdentifier) aSN1Primitive).getId());
            } else if (ChipAuthenticationPublicKeyInfo.np(id)) {
                SubjectPublicKeyInfo instance = SubjectPublicKeyInfo.getInstance(toASN1Primitive);
                if (aSN1Primitive == null) {
                    return new ChipAuthenticationPublicKeyInfo(id, e.a(instance));
                }
                return new ChipAuthenticationPublicKeyInfo(id, e.a(instance), ((ASN1Integer) aSN1Primitive).getValue());
            } else if (ChipAuthenticationInfo.np(id)) {
                intValue = ((ASN1Integer) toASN1Primitive).getValue().intValue();
                if (aSN1Primitive == null) {
                    return new ChipAuthenticationInfo(id, intValue);
                }
                return new ChipAuthenticationInfo(id, intValue, ((ASN1Integer) aSN1Primitive).getValue());
            } else if (TerminalAuthenticationInfo.np(id)) {
                intValue = ((ASN1Integer) toASN1Primitive).getValue().intValue();
                if (aSN1Primitive == null) {
                    return new TerminalAuthenticationInfo(id, intValue);
                }
                return new TerminalAuthenticationInfo(id, intValue, (ASN1Sequence) aSN1Primitive);
            } else if (PACEInfo.np(id)) {
                intValue = ((ASN1Integer) toASN1Primitive).getValue().intValue();
                int i = -1;
                if (aSN1Primitive != null) {
                    i = ((ASN1Integer) aSN1Primitive).getValue().intValue();
                }
                return new PACEInfo(id, intValue, i);
            } else if (PACEDomainParameterInfo.np(id)) {
                AlgorithmIdentifier instance2 = AlgorithmIdentifier.getInstance(toASN1Primitive);
                if (aSN1Primitive != null) {
                    return new PACEDomainParameterInfo(id, instance2, ((ASN1Integer) aSN1Primitive).getValue());
                }
                return new PACEDomainParameterInfo(id, instance2);
            } else {
                Logger logger = eNz;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported SecurityInfo, oid = ");
                stringBuilder.append(id);
                logger.warning(stringBuilder.toString());
                return null;
            }
        } catch (Exception e) {
            eNz.log(Level.WARNING, "Unexpected exception", e);
            throw new IllegalArgumentException("Malformed input stream.");
        }
    }
}
