package org.jmrtd;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jmrtd.lds.PACEInfo.a;
import org.jmrtd.lds.SecurityInfo;
import org.jmrtd.lds.icao.MRZInfo;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.pkcs.DHParameter;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X962NamedCurves;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.jce.ECNamedCurveTable;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.spec.ECNamedCurveParameterSpec;
import org.spongycastle.jce.spec.ECNamedCurveSpec;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECCurve.Fp;

/* compiled from: Util */
public final class e {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final Provider fEh = new BouncyCastleProvider();

    public static Provider bQZ() {
        return fEh;
    }

    public static SecretKey i(byte[] bArr, int i) {
        return a(bArr, "DESede", 128, i);
    }

    public static SecretKey a(byte[] bArr, String str, int i, int i2) {
        return a(bArr, str, i, null, i2);
    }

    public static SecretKey a(byte[] bArr, String str, int i, byte[] bArr2, int i2) {
        return a(bArr, str, i, bArr2, i2, (byte) 0);
    }

    public static SecretKey a(byte[] bArr, String str, int i, byte[] bArr2, int i2, byte b) {
        MessageDigest nn = nn(aa(str, i));
        nn.reset();
        nn.update(bArr);
        if (bArr2 != null) {
            nn.update(bArr2);
        }
        nn.update(new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) i2});
        bArr = nn.digest();
        byte[] bArr3 = null;
        if (!"DESede".equalsIgnoreCase(str) && !"3DES".equalsIgnoreCase(str)) {
            String str2 = "AES";
            if (str2.equalsIgnoreCase(str) || str.startsWith(str2)) {
                if (i == 128) {
                    bArr3 = new byte[16];
                    System.arraycopy(bArr, 0, bArr3, 0, 16);
                } else if (i == 192) {
                    bArr3 = new byte[24];
                    System.arraycopy(bArr, 0, bArr3, 0, 24);
                } else if (i == 256) {
                    bArr3 = new byte[32];
                    System.arraycopy(bArr, 0, bArr3, 0, 32);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("KDF can only use AES with 128-bit, 192-bit key or 256-bit length, found: ");
                    stringBuilder.append(i);
                    stringBuilder.append("-bit key length");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        } else if (i == 112 || i == 128) {
            bArr3 = new byte[24];
            System.arraycopy(bArr, 0, bArr3, 0, 8);
            System.arraycopy(bArr, 8, bArr3, 8, 8);
            System.arraycopy(bArr, 0, bArr3, 16, 8);
        } else {
            throw new IllegalArgumentException("KDF can only use DESede with 128-bit key length");
        }
        if (b == (byte) 0) {
            return new SecretKeySpec(bArr3, str);
        }
        return new PACESecretKeySpec(bArr3, str, b);
    }

    public static byte[] a(String str, String str2, String str3, String str4, boolean z) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(MRZInfo.nx(str));
        stringBuilder.append(str2);
        stringBuilder.append(MRZInfo.nx(str2));
        stringBuilder.append(str3);
        stringBuilder.append(MRZInfo.nx(str3));
        return y(stringBuilder.toString(), str4, z);
    }

    public static byte[] y(String str, String str2, boolean z) {
        MessageDigest instance = MessageDigest.getInstance(str2);
        instance.update(getBytes(str));
        byte[] digest = instance.digest();
        if (!z) {
            return digest;
        }
        byte[] bArr = new byte[16];
        System.arraycopy(digest, 0, bArr, 0, 16);
        return bArr;
    }

    public static byte[] j(byte[] bArr, int i) {
        return c(bArr, 0, bArr.length, i);
    }

    public static byte[] c(byte[] bArr, int i, int i2, int i3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArr, i, i2);
        byteArrayOutputStream.write(-128);
        while (byteArrayOutputStream.size() % i3 != 0) {
            byteArrayOutputStream.write(0);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] ag(byte[] bArr) {
        int length = bArr.length - 1;
        while (length >= 0 && bArr[length] == (byte) 0) {
            length--;
        }
        if ((bArr[length] & 255) == 128) {
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected constant 0x80, found 0x");
        stringBuilder.append(Integer.toHexString(bArr[length] & 255));
        throw new BadPaddingException(stringBuilder.toString());
    }

    public static byte[] a(int i, byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            throw new IllegalArgumentException("Plaintext is too short to recover message");
        } else if (((bArr[bArr.length - 1] & 15) ^ 12) == 0) {
            int i2;
            if (((bArr[bArr.length - 1] & 255) ^ 188) == 0) {
                i2 = 1;
            } else if (((bArr[bArr.length - 1] & 255) ^ 204) == 0) {
                i2 = 2;
            } else {
                throw new NumberFormatException("Not an ISO 9796-2 scheme 2 signature trailer");
            }
            String str = "Could not get M1";
            if (((bArr[0] & 192) ^ 64) != 0) {
                throw new NumberFormatException(str);
            } else if ((bArr[0] & 32) != 0) {
                int i3 = 0;
                while (i3 < bArr.length && ((bArr[i3] & 15) ^ 10) != 0) {
                    i3++;
                }
                i3++;
                int length = ((bArr.length - i2) - i) - i3;
                if (length > 0) {
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, i3, bArr2, 0, length);
                    return bArr2;
                }
                throw new NumberFormatException(str);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not get M1, first byte indicates partial recovery not enabled: ");
                stringBuilder.append(Integer.toHexString(bArr[0]));
                throw new NumberFormatException(stringBuilder.toString());
            }
        } else {
            throw new NumberFormatException("Could not get M1, malformed trailer");
        }
    }

    public static byte[] a(BigInteger bigInteger, int i) {
        BigInteger valueOf = BigInteger.valueOf(256);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            BigInteger mod = bigInteger.mod(valueOf);
            bigInteger = bigInteger.divide(valueOf);
            bArr[(i - 1) - i2] = (byte) mod.intValue();
        }
        return bArr;
    }

    public static byte[] a(BigInteger bigInteger) {
        int length = bigInteger.toString(16).length();
        if (length % 2 != 0) {
            length++;
        }
        return a(bigInteger, length / 2);
    }

    public static BigInteger ah(byte[] bArr) {
        if (bArr != null) {
            return s(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException();
    }

    public static BigInteger s(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            BigInteger bigInteger = BigInteger.ZERO;
            BigInteger valueOf = BigInteger.valueOf(256);
            BigInteger bigInteger2 = bigInteger;
            for (int i3 = i; i3 < i + i2; i3++) {
                bigInteger2 = bigInteger2.multiply(valueOf).add(BigInteger.valueOf((long) (bArr[i3] & 255)));
            }
            return bigInteger2;
        }
        throw new IllegalArgumentException();
    }

    public static String nk(String str) {
        if (str != null) {
            String str2 = null;
            str = str.toUpperCase();
            String str3 = "WITH";
            if (str.contains(str3)) {
                str2 = str.split(str3)[0];
            }
            if ("SHA1".equalsIgnoreCase(str2)) {
                return "SHA-1";
            }
            if ("SHA224".equalsIgnoreCase(str2)) {
                return "SHA-224";
            }
            if ("SHA256".equalsIgnoreCase(str2)) {
                return "SHA-256";
            }
            if ("SHA384".equalsIgnoreCase(str2)) {
                return "SHA-384";
            }
            return "SHA512".equalsIgnoreCase(str2) ? "SHA-512" : str2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static String aa(String str, int i) {
        if (str != null) {
            String str2 = "SHA-1";
            if ("DESede".equals(str) || "AES-128".equals(str)) {
                return str2;
            }
            String str3 = "AES";
            if (str3.equals(str) && i == 128) {
                return str2;
            }
            String str4 = "SHA-256";
            if ("AES-256".equals(str) || "AES-192".equals(str)) {
                return str4;
            }
            if (str3.equals(str) && (i == 192 || i == 256)) {
                return str4;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported cipher algorithm or key length \"");
            stringBuilder.append(str);
            stringBuilder.append("\", ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException();
    }

    public static DHParameterSpec a(DHParameters dHParameters) {
        BigInteger p = dHParameters.getP();
        BigInteger g = dHParameters.getG();
        BigInteger q = dHParameters.getQ();
        int l = dHParameters.getL();
        if (q == null) {
            return new DHParameterSpec(p, g, l);
        }
        return new a(p, g, q);
    }

    public static String a(PublicKey publicKey) {
        if (publicKey == null) {
            return "null";
        }
        String algorithm = publicKey.getAlgorithm();
        String str = " [";
        StringBuilder stringBuilder;
        if (publicKey instanceof RSAPublicKey) {
            int bitLength = ((RSAPublicKey) publicKey).getModulus().bitLength();
            stringBuilder = new StringBuilder();
            stringBuilder.append(algorithm);
            stringBuilder.append(str);
            stringBuilder.append(bitLength);
            stringBuilder.append(" bit]");
            algorithm = stringBuilder.toString();
        } else {
            String str2 = "]";
            if (publicKey instanceof ECPublicKey) {
                String a = a(((ECPublicKey) publicKey).getParams());
                if (a != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(algorithm);
                    stringBuilder.append(str);
                    stringBuilder.append(a);
                    stringBuilder.append(str2);
                    algorithm = stringBuilder.toString();
                }
            } else if (publicKey instanceof DHPublicKey) {
                DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
                dHPublicKey.getY();
                DHParameterSpec params = dHPublicKey.getParams();
                BigInteger g = params.getG();
                int l = params.getL();
                BigInteger p = params.getP();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(algorithm);
                stringBuilder2.append(" [p.length = ");
                stringBuilder2.append(p.bitLength());
                stringBuilder2.append(", g.length = ");
                stringBuilder2.append(g.bitLength());
                stringBuilder2.append(", l = ");
                stringBuilder2.append(l);
                stringBuilder2.append(str2);
                algorithm = stringBuilder2.toString();
            }
        }
        return algorithm;
    }

    public static String a(PrivateKey privateKey) {
        if (privateKey == null) {
            return "null";
        }
        String algorithm = privateKey.getAlgorithm();
        String str = " [";
        StringBuilder stringBuilder;
        if (privateKey instanceof RSAPrivateKey) {
            int bitLength = ((RSAPrivateKey) privateKey).getModulus().bitLength();
            stringBuilder = new StringBuilder();
            stringBuilder.append(algorithm);
            stringBuilder.append(str);
            stringBuilder.append(bitLength);
            stringBuilder.append(" bit]");
            algorithm = stringBuilder.toString();
        } else if (privateKey instanceof ECPrivateKey) {
            String a = a(((ECPrivateKey) privateKey).getParams());
            if (a != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(algorithm);
                stringBuilder.append(str);
                stringBuilder.append(a);
                stringBuilder.append("]");
                algorithm = stringBuilder.toString();
            }
        }
        return algorithm;
    }

    public static String a(ECParameterSpec eCParameterSpec) {
        ECNamedCurveSpec c = c(eCParameterSpec);
        if (c == null) {
            return null;
        }
        return c.getName();
    }

    public static ECParameterSpec a(ECNamedCurveParameterSpec eCNamedCurveParameterSpec) {
        return b(b(eCNamedCurveParameterSpec));
    }

    public static ECParameterSpec b(ECParameterSpec eCParameterSpec) {
        String str = "Could not make named EC param spec explicit";
        try {
            ECPoint generator = eCParameterSpec.getGenerator();
            BigInteger order = eCParameterSpec.getOrder();
            int cofactor = eCParameterSpec.getCofactor();
            EllipticCurve curve = eCParameterSpec.getCurve();
            BigInteger a = curve.getA();
            BigInteger b = curve.getB();
            ECField field = curve.getField();
            if (field instanceof ECFieldFp) {
                return new ECParameterSpec(new EllipticCurve(new ECFieldFp(((ECFieldFp) field).getP()), a, b), generator, order, cofactor);
            }
            if (field instanceof ECFieldF2m) {
                return new ECParameterSpec(new EllipticCurve(new ECFieldF2m(((ECFieldF2m) field).getM()), a, b), generator, order, cofactor);
            }
            eNz.warning(str);
            return eCParameterSpec;
        } catch (Exception e) {
            eNz.log(Level.WARNING, str, e);
            return eCParameterSpec;
        }
    }

    private static ECNamedCurveSpec c(ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec == null) {
            return null;
        }
        if (eCParameterSpec instanceof ECNamedCurveSpec) {
            return (ECNamedCurveSpec) eCParameterSpec;
        }
        ArrayList<String> list = Collections.list(ECNamedCurveTable.getNames());
        ArrayList arrayList = new ArrayList();
        for (String parameterSpec : list) {
            ECNamedCurveSpec b = b(ECNamedCurveTable.getParameterSpec(parameterSpec));
            if (b.getCurve().equals(eCParameterSpec.getCurve()) && b.getGenerator().equals(eCParameterSpec.getGenerator()) && b.getOrder().equals(eCParameterSpec.getOrder()) && b.getCofactor() == eCParameterSpec.getCofactor()) {
                arrayList.add(b);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (ECNamedCurveSpec) arrayList.get(0);
        }
        return (ECNamedCurveSpec) arrayList.get(0);
    }

    public static ECNamedCurveSpec b(ECNamedCurveParameterSpec eCNamedCurveParameterSpec) {
        return new ECNamedCurveSpec(eCNamedCurveParameterSpec.getName(), eCNamedCurveParameterSpec.getCurve(), eCNamedCurveParameterSpec.getG(), eCNamedCurveParameterSpec.getN(), eCNamedCurveParameterSpec.getH(), eCNamedCurveParameterSpec.getSeed());
    }

    public static SubjectPublicKeyInfo b(PublicKey publicKey) {
        ASN1InputStream aSN1InputStream;
        try {
            StringBuilder stringBuilder;
            String algorithm = publicKey.getAlgorithm();
            if (!("EC".equals(algorithm) || "ECDH".equals(algorithm))) {
                if (!(publicKey instanceof ECPublicKey)) {
                    if (!"DH".equals(algorithm)) {
                        if (!(publicKey instanceof DHPublicKey)) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Unrecognized key type, found ");
                            stringBuilder.append(publicKey.getAlgorithm());
                            stringBuilder.append(", should be DH or ECDH");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    aSN1InputStream = new ASN1InputStream(publicKey.getEncoded());
                    AlgorithmIdentifier algorithm2 = SubjectPublicKeyInfo.getInstance(aSN1InputStream.readObject()).getAlgorithm();
                    DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
                    DHParameterSpec params = dHPublicKey.getParams();
                    SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo(new AlgorithmIdentifier(algorithm2.getAlgorithm(), new DHParameter(params.getP(), params.getG(), params.getL()).toASN1Primitive()), new ASN1Integer(dHPublicKey.getY()));
                    aSN1InputStream.close();
                    return subjectPublicKeyInfo;
                }
            }
            aSN1InputStream = new ASN1InputStream(publicKey.getEncoded());
            SubjectPublicKeyInfo instance = SubjectPublicKeyInfo.getInstance(aSN1InputStream.readObject());
            AlgorithmIdentifier algorithm3 = instance.getAlgorithm();
            String id = algorithm3.getAlgorithm().getId();
            if (SecurityInfo.fFo.equals(id)) {
                ASN1Primitive toASN1Primitive = algorithm3.getParameters().toASN1Primitive();
                if (toASN1Primitive instanceof ASN1ObjectIdentifier) {
                    ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) toASN1Primitive;
                    X9ECParameters byOID = X962NamedCurves.getByOID(aSN1ObjectIdentifier);
                    if (byOID != null) {
                        org.spongycastle.math.ec.ECPoint g = byOID.getG();
                        X9ECParameters x9ECParameters = new X9ECParameters(byOID.getCurve(), g.getCurve().createPoint(g.getAffineXCoord().toBigInteger(), g.getAffineYCoord().toBigInteger()), byOID.getN(), byOID.getH(), byOID.getSeed());
                        if (publicKey instanceof org.spongycastle.jce.interfaces.ECPublicKey) {
                            instance = new SubjectPublicKeyInfo(new AlgorithmIdentifier(instance.getAlgorithm().getAlgorithm(), x9ECParameters.toASN1Primitive()), ((org.spongycastle.jce.interfaces.ECPublicKey) publicKey).getQ().getEncoded(false));
                            aSN1InputStream.close();
                            return instance;
                        }
                        aSN1InputStream.close();
                        return instance;
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not find X9.62 named curve for OID ");
                    stringBuilder.append(aSN1ObjectIdentifier.getId());
                    throw new IllegalStateException(stringBuilder.toString());
                }
                aSN1InputStream.close();
                return instance;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Was expecting id-ecPublicKey (");
            stringBuilder.append(SecurityInfo.fFn);
            stringBuilder.append("), found ");
            stringBuilder.append(id);
            throw new IllegalStateException(stringBuilder.toString());
        } catch (Exception e) {
            eNz.log(Level.WARNING, "Exception", e);
            return null;
        } catch (Throwable th) {
            aSN1InputStream.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030 A:{ExcHandler: Exception (r6_9 'e' java.lang.Exception), Splitter:B:1:0x0003} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:10:0x0030, code skipped:
            r6 = move-exception;
     */
    /* JADX WARNING: Missing block: B:11:0x0031, code skipped:
            eNz.log(java.util.logging.Level.WARNING, r0, r6);
     */
    /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            return null;
     */
    /* JADX WARNING: Missing block: B:13:0x0039, code skipped:
            r6 = move-exception;
     */
    /* JADX WARNING: Missing block: B:14:0x003a, code skipped:
            eNz.log(java.util.logging.Level.WARNING, r0, r6);
     */
    /* JADX WARNING: Missing block: B:15:0x0041, code skipped:
            return null;
     */
    public static java.security.PublicKey a(org.spongycastle.asn1.x509.SubjectPublicKeyInfo r6) {
        /*
        r0 = "Exception";
        r1 = 0;
        r2 = "DER";
        r6 = r6.getEncoded(r2);	 Catch:{ GeneralSecurityException -> 0x0039, Exception -> 0x0030 }
        r2 = new java.security.spec.X509EncodedKeySpec;	 Catch:{ GeneralSecurityException -> 0x0039, Exception -> 0x0030 }
        r2.<init>(r6);	 Catch:{ GeneralSecurityException -> 0x0039, Exception -> 0x0030 }
        r6 = "DH";
        r6 = java.security.KeyFactory.getInstance(r6);	 Catch:{ GeneralSecurityException -> 0x0019, Exception -> 0x0030 }
        r6 = r6.generatePublic(r2);	 Catch:{ GeneralSecurityException -> 0x0019, Exception -> 0x0030 }
        return r6;
    L_0x0019:
        r6 = move-exception;
        r3 = eNz;	 Catch:{ GeneralSecurityException -> 0x0039, Exception -> 0x0030 }
        r4 = java.util.logging.Level.FINE;	 Catch:{ GeneralSecurityException -> 0x0039, Exception -> 0x0030 }
        r5 = "Not DH public key? Fine, let's try EC public key";
        r3.log(r4, r5, r6);	 Catch:{ GeneralSecurityException -> 0x0039, Exception -> 0x0030 }
        r6 = "EC";
        r3 = fEh;	 Catch:{ GeneralSecurityException -> 0x0039, Exception -> 0x0030 }
        r6 = java.security.KeyFactory.getInstance(r6, r3);	 Catch:{ GeneralSecurityException -> 0x0039, Exception -> 0x0030 }
        r6 = r6.generatePublic(r2);	 Catch:{ GeneralSecurityException -> 0x0039, Exception -> 0x0030 }
        return r6;
    L_0x0030:
        r6 = move-exception;
        r2 = eNz;
        r3 = java.util.logging.Level.WARNING;
        r2.log(r3, r0, r6);
        return r1;
    L_0x0039:
        r6 = move-exception;
        r2 = eNz;
        r3 = java.util.logging.Level.WARNING;
        r2.log(r3, r0, r6);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.e.a(org.spongycastle.asn1.x509.SubjectPublicKeyInfo):java.security.PublicKey");
    }

    public static PublicKey c(PublicKey publicKey) {
        if (!(publicKey instanceof ECPublicKey)) {
            return publicKey;
        }
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            publicKey = KeyFactory.getInstance("EC", fEh).generatePublic(new ECPublicKeySpec(eCPublicKey.getW(), b(eCPublicKey.getParams())));
            return publicKey;
        } catch (Exception e) {
            eNz.log(Level.WARNING, "Could not make public key param spec explicit", e);
            return publicKey;
        }
    }

    public static ECPoint ai(byte[] bArr) {
        String str = "Error closing stream";
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            if (dataInputStream.read() == 4) {
                int length = (bArr.length - 1) / 2;
                byte[] bArr2 = new byte[length];
                bArr = new byte[length];
                dataInputStream.readFully(bArr2);
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                ECPoint eCPoint = new ECPoint(ah(bArr2), ah(bArr));
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    eNz.log(Level.FINE, str, e);
                }
                return eCPoint;
            }
            throw new IllegalArgumentException("Expected encoded ECPoint to start with 0x04");
        } catch (IOException e2) {
            throw new IllegalArgumentException("Exception", e2);
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (IOException e3) {
                eNz.log(Level.FINE, str, e3);
            }
        }
    }

    public static byte[] a(ECPoint eCPoint) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        try {
            byteArrayOutputStream.write(4);
            byteArrayOutputStream.write(a(affineX));
            byteArrayOutputStream.write(a(affineY));
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException("Exception", e);
        }
    }

    public static ECPoint a(ECPoint eCPoint, ECPoint eCPoint2, ECParameterSpec eCParameterSpec) {
        return a(a(eCPoint, eCParameterSpec).add(a(eCPoint2, eCParameterSpec)));
    }

    public static ECPoint a(BigInteger bigInteger, ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        return a(a(eCPoint, eCParameterSpec).multiply(bigInteger));
    }

    public static byte[] getBytes(String str) {
        byte[] bytes = str.getBytes();
        try {
            bytes = str.getBytes("UTF-8");
            return bytes;
        } catch (UnsupportedEncodingException e) {
            eNz.log(Level.WARNING, "Exception", e);
            return bytes;
        }
    }

    public static BigInteger a(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec == null) {
            throw new IllegalArgumentException("Parameters null");
        } else if (algorithmParameterSpec instanceof DHParameterSpec) {
            return ((DHParameterSpec) algorithmParameterSpec).getP();
        } else {
            StringBuilder stringBuilder;
            if (algorithmParameterSpec instanceof ECParameterSpec) {
                ECField field = ((ECParameterSpec) algorithmParameterSpec).getCurve().getField();
                if (field instanceof ECFieldFp) {
                    return ((ECFieldFp) field).getP();
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Was expecting prime field of type ECFieldFp, found ");
                stringBuilder.append(field.getClass().getCanonicalName());
                throw new IllegalStateException(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported agreement algorithm, was expecting DHParameterSpec or ECParameterSpec, found ");
            stringBuilder.append(algorithmParameterSpec.getClass().getCanonicalName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static org.spongycastle.math.ec.ECPoint a(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        return d(eCParameterSpec).createPoint(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static ECPoint a(org.spongycastle.math.ec.ECPoint eCPoint) {
        eCPoint = eCPoint.normalize();
        if (!eCPoint.isValid()) {
            eNz.warning("point not valid");
        }
        return new ECPoint(eCPoint.getAffineXCoord().toBigInteger(), eCPoint.getAffineYCoord().toBigInteger());
    }

    public static ECPoint b(ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        return a(a(eCPoint, eCParameterSpec).normalize());
    }

    private static ECCurve d(ECParameterSpec eCParameterSpec) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECField field = curve.getField();
        if (field instanceof ECFieldFp) {
            int cofactor = eCParameterSpec.getCofactor();
            BigInteger order = eCParameterSpec.getOrder();
            return new Fp(a((AlgorithmParameterSpec) eCParameterSpec), curve.getA(), curve.getB(), order, BigInteger.valueOf((long) cofactor));
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Only prime field supported (for now), found ");
        stringBuilder.append(field.getClass().getCanonicalName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static ECPublicKeyParameters a(ECPublicKey eCPublicKey) {
        ECParameterSpec params = eCPublicKey.getParams();
        return new ECPublicKeyParameters(a(eCPublicKey.getW(), params), e(params));
    }

    public static ECPrivateKeyParameters a(ECPrivateKey eCPrivateKey) {
        return new ECPrivateKeyParameters(eCPrivateKey.getS(), e(eCPrivateKey.getParams()));
    }

    public static ECDomainParameters e(ECParameterSpec eCParameterSpec) {
        return new ECDomainParameters(d(eCParameterSpec), a(eCParameterSpec.getGenerator(), eCParameterSpec), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
    }

    public static Cipher nl(String str) {
        try {
            str = Cipher.getInstance(str);
            return str;
        } catch (Exception e) {
            eNz.log(Level.FINE, "Default provider could not provide this cipher, falling back to explicit BC", e);
            return Cipher.getInstance(str, fEh);
        }
    }

    public static Cipher a(String str, int i, Key key) {
        try {
            Cipher instance = Cipher.getInstance(str);
            instance.init(i, key);
            return instance;
        } catch (Exception e) {
            eNz.log(Level.FINE, "Default provider could not provide this Cipher, falling back to explicit BC", e);
            Cipher instance2 = Cipher.getInstance(str, fEh);
            instance2.init(i, key);
            return instance2;
        }
    }

    public static Mac nm(String str) {
        try {
            str = Mac.getInstance(str);
            return str;
        } catch (Exception e) {
            eNz.log(Level.FINE, "Default provider could not provide this Mac, falling back to explicit BC", e);
            return Mac.getInstance(str, fEh);
        }
    }

    public static Mac a(String str, Key key) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(key);
            return instance;
        } catch (Exception e) {
            eNz.log(Level.FINE, "Default provider could not provide this Mac, falling back to explicit BC", e);
            Mac instance2 = Mac.getInstance(str, fEh);
            instance2.init(key);
            return instance2;
        }
    }

    public static MessageDigest nn(String str) {
        try {
            str = MessageDigest.getInstance(str);
            return str;
        } catch (Exception e) {
            eNz.log(Level.FINE, "Default provider could not provide this Message Digest, falling back to explicit BC", e);
            return MessageDigest.getInstance(str, fEh);
        }
    }

    public static PublicKey a(String str, KeySpec keySpec) {
        try {
            str = KeyFactory.getInstance(str).generatePublic(keySpec);
            return str;
        } catch (Exception e) {
            eNz.log(Level.FINE, "Default provider could not provide this Key Factory or Public Key, falling back to explicit BC", e);
            return KeyFactory.getInstance(str, fEh).generatePublic(keySpec);
        }
    }
}
