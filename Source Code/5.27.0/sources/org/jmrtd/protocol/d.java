package org.jmrtd.protocol;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVOutputStream;
import net.sf.scuba.tlv.TLVUtil;
import net.sf.scuba.util.Hex;
import org.jmrtd.AccessKeySpec;
import org.jmrtd.BACKeySpec;
import org.jmrtd.PACEKeySpec;
import org.jmrtd.PACESecretKeySpec;
import org.jmrtd.b;
import org.jmrtd.e;
import org.jmrtd.lds.PACEInfo;
import org.jmrtd.lds.PACEInfo.MappingType;
import org.jmrtd.lds.PACEInfo.a;
import org.spongycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PACEProtocol */
public class d {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final Provider fEh = e.bQZ();
    private static final byte[] fFA = new byte[]{(byte) -90, (byte) 104, (byte) -119, (byte) 42, (byte) 124, (byte) 65, (byte) -29, (byte) -54, (byte) 115, (byte) -97, (byte) 64, (byte) -80, (byte) 87, (byte) -40, (byte) 89, (byte) 4};
    private static final byte[] fFB = new byte[]{(byte) -92, (byte) -31, (byte) 54, (byte) -84, (byte) 114, (byte) 95, (byte) 115, (byte) -117, (byte) 1, (byte) -63, (byte) -10, (byte) 2, (byte) 23, (byte) -63, (byte) -120, (byte) -83};
    private static final byte[] fFC = new byte[]{(byte) -44, (byte) 99, (byte) -42, (byte) 82, (byte) 52, (byte) 18, (byte) 78, (byte) -9, (byte) -119, (byte) 112, (byte) 84, (byte) -104, (byte) 109, (byte) -54, (byte) 10, (byte) 23, (byte) 78, (byte) 40, (byte) -33, (byte) 117, (byte) -116, (byte) -70, (byte) -96, (byte) 63, (byte) 36, (byte) 6, (byte) 22, (byte) 65, (byte) 77, (byte) 90, (byte) 22, (byte) 118};
    private static final byte[] fFD = new byte[]{(byte) 84, (byte) -67, (byte) 114, (byte) 85, (byte) -16, (byte) -86, (byte) -8, (byte) 49, (byte) -66, (byte) -61, (byte) 66, (byte) 63, (byte) -49, (byte) 57, (byte) -42, (byte) -101, (byte) 108, (byte) -65, (byte) 6, (byte) 102, (byte) 119, (byte) -48, (byte) -6, (byte) -82, (byte) 90, (byte) -83, (byte) -39, (byte) -99, (byte) -8, (byte) -27, (byte) 53, (byte) 23};
    private static final byte[] fFz = new byte[]{(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1};
    private org.jmrtd.d fEf;
    private Random random = new SecureRandom();
    private SecureMessagingWrapper wrapper;

    /* compiled from: PACEProtocol */
    /* renamed from: org.jmrtd.protocol.d$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fFE = new int[MappingType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = org.jmrtd.lds.PACEInfo.MappingType.values();
            r0 = r0.length;
            r0 = new int[r0];
            fFE = r0;
            r0 = fFE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = org.jmrtd.lds.PACEInfo.MappingType.CAM;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = fFE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = org.jmrtd.lds.PACEInfo.MappingType.GM;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = fFE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = org.jmrtd.lds.PACEInfo.MappingType.IM;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.protocol.d$AnonymousClass1.<clinit>():void");
        }
    }

    public d(org.jmrtd.d dVar, SecureMessagingWrapper secureMessagingWrapper) {
        this.fEf = dVar;
        this.wrapper = secureMessagingWrapper;
    }

    public PACEResult a(AccessKeySpec accessKeySpec, String str, AlgorithmParameterSpec algorithmParameterSpec) {
        try {
            return a(accessKeySpec, a(accessKeySpec, str), str, algorithmParameterSpec);
        } catch (GeneralSecurityException e) {
            throw new b("PCD side error in key derivation step", e);
        }
    }

    private PACEResult a(AccessKeySpec accessKeySpec, SecretKey secretKey, String str, AlgorithmParameterSpec algorithmParameterSpec) {
        SecretKey secretKey2 = secretKey;
        MappingType ns = PACEInfo.ns(str);
        String nt = PACEInfo.nt(str);
        String nu = PACEInfo.nu(str);
        String nv = PACEInfo.nv(str);
        int nw = PACEInfo.nw(str);
        a(nt, nu, nv, nw, algorithmParameterSpec);
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(nu);
            stringBuilder.append("/CBC/NoPadding");
            Cipher instance = Cipher.getInstance(stringBuilder.toString());
            try {
                this.fEf.a(this.wrapper, str, secretKey2 instanceof PACESecretKeySpec ? ((PACESecretKeySpec) secretKey2).bQV() : 1, null);
                PACEMappingResult a = a(ns, nt, algorithmParameterSpec, a(secretKey2, instance), instance);
                AlgorithmParameterSpec bSn = a.bSn();
                KeyPair a2 = a(nt, bSn);
                PublicKey a3 = a(a2.getPublic(), bSn);
                byte[] a4 = a(nt, a2.getPrivate(), a3);
                try {
                    SecretKey a5 = e.a(a4, nu, nw, 1);
                    SecretKey a6 = e.a(a4, nu, nw, 2);
                    PublicKey publicKey = a3;
                    byte[] a7 = a(str, ns, a2, a3, a6);
                    try {
                        long bSl = this.wrapper == null ? 0 : this.wrapper.bSl();
                        if (nu.startsWith("DESede")) {
                            this.wrapper = new DESedeSecureMessagingWrapper(a5, a6, this.fEf.bQX(), this.fEf.bQY(), 0);
                        } else if (nu.startsWith("AES")) {
                            this.wrapper = new AESSecureMessagingWrapper(a5, a6, this.fEf.bQX(), this.fEf.bQY(), bSl);
                        } else {
                            Logger logger = eNz;
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Unsupported cipher algorithm ");
                            stringBuilder2.append(nu);
                            logger.warning(stringBuilder2.toString());
                        }
                        if (MappingType.CAM.equals(ns)) {
                            byte[] ag;
                            if (a7 == null) {
                                eNz.warning("Encrypted Chip Authentication data is null");
                            }
                            try {
                                Cipher instance2 = Cipher.getInstance("AES/CBC/NoPadding");
                                instance2.init(2, a5, new IvParameterSpec(fFz));
                                ag = e.ag(instance2.doFinal(a7));
                            } catch (GeneralSecurityException e) {
                                eNz.log(Level.WARNING, "Could not decrypt Chip Authentication data", e);
                                ag = null;
                            }
                            return new PACECAMResult(accessKeySpec, nt, nu, nv, nw, a, a2, publicKey, a7, ag, this.wrapper);
                        }
                        return new PACEResult(accessKeySpec, ns, nt, nu, nv, nw, a, a2, publicKey, this.wrapper);
                    } catch (GeneralSecurityException e2) {
                        throw new IllegalStateException("Security exception in secure messaging establishment", e2);
                    }
                } catch (GeneralSecurityException e22) {
                    throw new b("Security exception during secure messaging key derivation", e22);
                }
            } catch (CardServiceException e3) {
                throw new b("PICC side error in static PACE key derivation step", e3, e3.getSW());
            }
        } catch (GeneralSecurityException e222) {
            throw new b("PCD side error in static cipher construction during key derivation step", e222);
        }
    }

    public byte[] a(SecretKey secretKey, Cipher cipher) {
        try {
            byte[] unwrapDO = TLVUtil.unwrapDO(128, this.fEf.a(this.wrapper, new byte[0], false));
            cipher.init(2, secretKey, new IvParameterSpec(new byte[cipher.getBlockSize()]));
            return cipher.doFinal(unwrapDO);
        } catch (GeneralSecurityException e) {
            throw new b("PCD side exception in tranceiving nonce step", e);
        } catch (CardServiceException e2) {
            throw new b("PICC side exception in tranceiving nonce step", e2);
        }
    }

    public PACEMappingResult a(MappingType mappingType, String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, Cipher cipher) {
        int i = AnonymousClass1.fFE[mappingType.ordinal()];
        if (i == 1 || i == 2) {
            return a(str, algorithmParameterSpec, bArr);
        }
        if (i == 3) {
            return a(str, algorithmParameterSpec, bArr, cipher);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported mapping type ");
        stringBuilder.append(mappingType);
        throw new b(stringBuilder.toString());
    }

    public PACEGMMappingResult a(String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr) {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance(str, fEh);
            instance.initialize(algorithmParameterSpec);
            KeyPair generateKeyPair = instance.generateKeyPair();
            PublicKey publicKey = generateKeyPair.getPublic();
            PrivateKey privateKey = generateKeyPair.getPrivate();
            PublicKey a = a(TLVUtil.unwrapDO(130, this.fEf.a(this.wrapper, TLVUtil.wrapDO(129, e(publicKey)), false)), algorithmParameterSpec);
            if ("ECDH".equals(str)) {
                c cVar = new c();
                cVar.b(privateKey);
                ECPoint d = cVar.d(a);
                return new PACEGMWithECDHMappingResult(algorithmParameterSpec, bArr, a, generateKeyPair, d, a(bArr, d, (ECParameterSpec) algorithmParameterSpec));
            } else if ("DH".equals(str)) {
                KeyAgreement instance2 = KeyAgreement.getInstance(str);
                instance2.init(privateKey);
                instance2.doPhase(a, true);
                byte[] generateSecret = instance2.generateSecret();
                return new PACEGMWithDHMappingResult(algorithmParameterSpec, bArr, a, generateKeyPair, generateSecret, a(bArr, e.ah(generateSecret), (DHParameterSpec) algorithmParameterSpec));
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported parameters for mapping nonce, expected \"ECDH\" / ECParameterSpec or \"DH\" / DHParameterSpec, found \"");
                stringBuilder.append(str);
                stringBuilder.append("\" /");
                stringBuilder.append(algorithmParameterSpec.getClass().getCanonicalName());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        } catch (GeneralSecurityException e) {
            throw new b("PCD side error in mapping nonce step", e);
        } catch (CardServiceException e2) {
            throw new b("PICC side exception in mapping nonce step", e2);
        }
    }

    public PACEIMMappingResult a(String str, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, Cipher cipher) {
        try {
            byte[] bArr2 = new byte[bArr.length];
            this.random.nextBytes(bArr2);
            this.fEf.a(this.wrapper, TLVUtil.wrapDO(129, bArr2), false);
            if ("ECDH".equals(str)) {
                return new PACEIMMappingResult(algorithmParameterSpec, bArr, bArr2, a(bArr, bArr2, cipher.getAlgorithm(), (ECParameterSpec) algorithmParameterSpec));
            }
            if ("DH".equals(str)) {
                return new PACEIMMappingResult(algorithmParameterSpec, bArr, bArr2, a(bArr, bArr2, cipher.getAlgorithm(), (DHParameterSpec) algorithmParameterSpec));
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported parameters for mapping nonce, expected \"ECDH\" / ECParameterSpec or \"DH\" / DHParameterSpec, found \"");
            stringBuilder.append(str);
            stringBuilder.append("\" /");
            stringBuilder.append(algorithmParameterSpec.getClass().getCanonicalName());
            throw new IllegalArgumentException(stringBuilder.toString());
        } catch (GeneralSecurityException e) {
            throw new b("PCD side error in mapping nonce step", e);
        } catch (CardServiceException e2) {
            throw new b("PICC side exception in mapping nonce step", e2, e2.getSW());
        }
    }

    public KeyPair a(String str, AlgorithmParameterSpec algorithmParameterSpec) {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance(str, fEh);
            instance.initialize(algorithmParameterSpec);
            return instance.generateKeyPair();
        } catch (GeneralSecurityException e) {
            throw new b("PCD side error during generation of PCD key pair", e);
        }
    }

    public PublicKey a(PublicKey publicKey, AlgorithmParameterSpec algorithmParameterSpec) {
        String str = "PCD side exception in key agreement step";
        try {
            PublicKey a = a(TLVUtil.unwrapDO(132, this.fEf.a(this.wrapper, TLVUtil.wrapDO(131, e(publicKey)), false)), algorithmParameterSpec);
            if (!publicKey.equals(a)) {
                return a;
            }
            throw new b("PCD's public key and PICC's public key are the same in key agreement step!");
        } catch (IllegalStateException e) {
            throw new b(str, e);
        } catch (GeneralSecurityException e2) {
            throw new b(str, e2);
        } catch (CardServiceException e3) {
            throw new b("PICC side exception in key agreement step", e3, e3.getSW());
        }
    }

    public byte[] a(String str, PrivateKey privateKey, PublicKey publicKey) {
        try {
            KeyAgreement instance = KeyAgreement.getInstance(str, fEh);
            instance.init(privateKey);
            instance.doPhase(a(publicKey, privateKey), true);
            return instance.generateSecret();
        } catch (GeneralSecurityException e) {
            String str2 = "PCD side error during key agreement";
            eNz.log(Level.WARNING, str2, e);
            throw new b(str2);
        }
    }

    public byte[] a(String str, MappingType mappingType, KeyPair keyPair, PublicKey publicKey, SecretKey secretKey) {
        Throwable e;
        Level level;
        String str2 = "Exception closing stream";
        TLVInputStream tLVInputStream;
        try {
            tLVInputStream = new TLVInputStream(new ByteArrayInputStream(this.fEf.a(this.wrapper, TLVUtil.wrapDO(133, a(str, secretKey, publicKey)), true)));
            Logger logger;
            try {
                int readTag = tLVInputStream.readTag();
                if (readTag != 134) {
                    Logger logger2 = eNz;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Was expecting tag 0x86, found: ");
                    stringBuilder.append(Integer.toHexString(readTag));
                    logger2.warning(stringBuilder.toString());
                }
                tLVInputStream.readLength();
                byte[] readValue = tLVInputStream.readValue();
                byte[] a = a(str, secretKey, keyPair.getPublic());
                StringBuilder stringBuilder2;
                if (!Arrays.equals(a, readValue)) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("PICC authentication token mismatch, expectedPICCToken = ");
                    stringBuilder2.append(Hex.bytesToHexString(a));
                    stringBuilder2.append(", piccToken = ");
                    stringBuilder2.append(Hex.bytesToHexString(readValue));
                    throw new GeneralSecurityException(stringBuilder2.toString());
                } else if (mappingType == MappingType.CAM) {
                    int readTag2 = tLVInputStream.readTag();
                    if (readTag2 != 138) {
                        logger = eNz;
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Was expecting tag 0x8A, found: ");
                        stringBuilder2.append(Integer.toHexString(readTag2));
                        logger.warning(stringBuilder2.toString());
                    }
                    tLVInputStream.readLength();
                    a = tLVInputStream.readValue();
                    try {
                        tLVInputStream.close();
                    } catch (IOException e2) {
                        eNz.log(Level.FINE, str2, e2);
                    }
                    return a;
                } else {
                    try {
                        tLVInputStream.close();
                    } catch (IOException e3) {
                        e = e3;
                        logger = eNz;
                        level = Level.FINE;
                        logger.log(level, str2, e);
                        return null;
                    }
                    return null;
                }
            } catch (IOException e4) {
                eNz.log(Level.WARNING, "Could not parse step 4 response", e4);
                try {
                    tLVInputStream.close();
                } catch (IOException e5) {
                    e = e5;
                    logger = eNz;
                    level = Level.FINE;
                    logger.log(level, str2, e);
                    return null;
                }
            }
        } catch (GeneralSecurityException e6) {
            throw new b("PCD side exception in authentication token generation step", e6);
        } catch (CardServiceException e7) {
            throw new b("PICC side exception in authentication token generation step", e7, e7.getSW());
        } catch (Throwable th) {
            try {
                tLVInputStream.close();
            } catch (IOException e22) {
                eNz.log(Level.FINE, str2, e22);
            }
        }
    }

    public static SecretKey a(AccessKeySpec accessKeySpec, String str) {
        return e.a(a(accessKeySpec), PACEInfo.nu(str), PACEInfo.nw(str), null, 3, accessKeySpec instanceof PACEKeySpec ? ((PACEKeySpec) accessKeySpec).bQV() : (byte) 0);
    }

    public static byte[] a(AccessKeySpec accessKeySpec) {
        StringBuilder stringBuilder;
        if (accessKeySpec == null) {
            throw new IllegalArgumentException("Access key cannot be null");
        } else if (accessKeySpec instanceof BACKeySpec) {
            BACKeySpec bACKeySpec = (BACKeySpec) accessKeySpec;
            String bQS = bACKeySpec.bQS();
            String bQT = bACKeySpec.bQT();
            String bQU = bACKeySpec.bQU();
            if (bQT == null || bQT.length() != 6) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Wrong date format used for date of birth. Expected yyMMdd, found ");
                stringBuilder2.append(bQT);
                throw new IllegalArgumentException(stringBuilder2.toString());
            } else if (bQU == null || bQU.length() != 6) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Wrong date format used for date of expiry. Expected yyMMdd, found ");
                stringBuilder.append(bQU);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (bQS != null) {
                return A(nC(bQS), bQT, bQU);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Wrong document number. Found ");
                stringBuilder.append(bQS);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        } else if (accessKeySpec instanceof PACEKeySpec) {
            return ((PACEKeySpec) accessKeySpec).getKey();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported access key, was expecting BAC or CAN key specification, found ");
            stringBuilder.append(accessKeySpec.getClass().getSimpleName());
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static ECParameterSpec a(byte[] bArr, ECPoint eCPoint, ECParameterSpec eCParameterSpec) {
        ECPoint generator = eCParameterSpec.getGenerator();
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a = curve.getA();
        BigInteger b = curve.getB();
        BigInteger p = ((ECFieldFp) curve.getField()).getP();
        BigInteger order = eCParameterSpec.getOrder();
        int cofactor = eCParameterSpec.getCofactor();
        ECPoint a2 = e.a(e.a(e.ah(bArr), generator, eCParameterSpec), eCPoint, eCParameterSpec);
        if (!e.a(a2, eCParameterSpec).isValid()) {
            eNz.info("ephemeralGenerator is not a valid point");
        }
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(p), a, b), a2, order, cofactor);
    }

    public static DHParameterSpec a(byte[] bArr, BigInteger bigInteger, DHParameterSpec dHParameterSpec) {
        BigInteger p = dHParameterSpec.getP();
        return new DHParameterSpec(p, dHParameterSpec.getG().modPow(e.ah(bArr), p).multiply(bigInteger).mod(p), dHParameterSpec.getL());
    }

    public static AlgorithmParameterSpec a(byte[] bArr, byte[] bArr2, String str, ECParameterSpec eCParameterSpec) {
        BigInteger a = e.a((AlgorithmParameterSpec) eCParameterSpec);
        BigInteger order = eCParameterSpec.getOrder();
        int cofactor = eCParameterSpec.getCofactor();
        BigInteger a2 = eCParameterSpec.getCurve().getA();
        BigInteger b = eCParameterSpec.getCurve().getB();
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(a), a2, b), a(e.ah(a(bArr, bArr2, a, str)), eCParameterSpec), order, cofactor);
    }

    public static AlgorithmParameterSpec a(byte[] bArr, byte[] bArr2, String str, DHParameterSpec dHParameterSpec) {
        BigInteger g = dHParameterSpec.getG();
        if (g == null || g.equals(BigInteger.ONE)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid generator: ");
            stringBuilder.append(g);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        g = dHParameterSpec.getP();
        return new DHParameterSpec(g, e.ah(a(bArr, bArr2, g, str)).modPow(g.subtract(BigInteger.ONE).divide(dHParameterSpec instanceof a ? ((a) dHParameterSpec).getQ() : BigInteger.ONE), g), dHParameterSpec.getL());
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, BigInteger bigInteger, String str) {
        String str2 = "Could not close stream";
        if (bArr == null || bArr2 == null) {
            throw new IllegalArgumentException("Null nonce");
        }
        byte[] bArr3;
        byte[] bArr4;
        int length = bArr.length * 8;
        int length2 = bArr2.length * 8;
        if (length == 128) {
            bArr3 = fFA;
            bArr4 = fFB;
        } else if (length == 192 || length == 256) {
            bArr3 = fFC;
            bArr4 = fFD;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown length ");
            stringBuilder.append(length);
            stringBuilder.append(", was expecting 128, 192, or 256");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        String str3 = "/CBC/NoPadding";
        if (str.endsWith(str3)) {
            str3 = "";
        }
        stringBuilder2.append(str3);
        Cipher instance = Cipher.getInstance(stringBuilder2.toString());
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[instance.getBlockSize()]);
        instance.init(1, new SecretKeySpec(bArr2, str), ivParameterSpec);
        bArr = instance.doFinal(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr5 = bArr;
        int i = 0;
        while (i * length < bigInteger.bitLength() + 64) {
            try {
                instance.init(1, new SecretKeySpec(bArr5, 0, length2 / 8, str), ivParameterSpec);
                bArr5 = instance.doFinal(bArr3);
                byteArrayOutputStream.write(instance.doFinal(bArr4));
                i++;
            } catch (Exception e) {
                eNz.log(Level.WARNING, "Could not write to stream", e);
                bArr = e.a(e.ah(byteArrayOutputStream.toByteArray()).mod(bigInteger));
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e2) {
                    eNz.log(Level.FINE, str2, e2);
                }
                return bArr;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e22) {
                    eNz.log(Level.FINE, str2, e22);
                }
                throw th;
            }
        }
        bArr = e.a(e.ah(byteArrayOutputStream.toByteArray()).mod(bigInteger));
        try {
            byteArrayOutputStream.close();
        } catch (IOException e222) {
            eNz.log(Level.FINE, str2, e222);
        }
        return bArr;
    }

    public static ECPoint a(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        BigInteger a = e.a((AlgorithmParameterSpec) eCParameterSpec);
        int cofactor = eCParameterSpec.getCofactor();
        BigInteger a2 = eCParameterSpec.getCurve().getA();
        BigInteger b = eCParameterSpec.getCurve().getB();
        BigInteger mod = bigInteger.modPow(BigInteger.valueOf(2), a).negate().mod(a);
        BigInteger mod2 = mod.add(mod.modPow(BigInteger.valueOf(2), a)).mod(a);
        mod2 = b.negate().multiply(BigInteger.ONE.add(mod2)).multiply(a2.multiply(mod2).modPow(a.subtract(BigInteger.ONE).subtract(BigInteger.ONE), a)).mod(a);
        mod = mod.multiply(mod2).mod(a);
        a2 = mod2.modPow(BigInteger.valueOf(3), a).add(a2.multiply(mod2)).add(b).mod(a);
        bigInteger = bigInteger.modPow(BigInteger.valueOf(3), a).multiply(a2).mod(a);
        b = a2.modPow(a.subtract(BigInteger.ONE).subtract(a.add(BigInteger.ONE).multiply(BigInteger.valueOf(4).modInverse(a)).mod(a)), a);
        ECPoint eCPoint = b.modPow(BigInteger.valueOf(2), a).multiply(a2).mod(a).equals(BigInteger.ONE) ? new ECPoint(mod2, b.multiply(a2).mod(a)) : new ECPoint(mod, b.multiply(bigInteger).mod(a));
        if (cofactor == 1) {
            return e.b(eCPoint, eCParameterSpec);
        }
        org.spongycastle.math.ec.ECPoint a3 = e.a(eCPoint, eCParameterSpec);
        a3.multiply(BigInteger.valueOf((long) cofactor));
        return e.a(a3);
    }

    public static PublicKey a(PublicKey publicKey, PrivateKey privateKey) {
        if ((publicKey instanceof ECPublicKey) && (privateKey instanceof ECPrivateKey)) {
            return KeyFactory.getInstance("EC", fEh).generatePublic(new ECPublicKeySpec(((ECPublicKey) publicKey).getW(), ((ECPrivateKey) privateKey).getParams()));
        }
        throw new NoSuchAlgorithmException("Unsupported key type");
    }

    public static byte[] a(String str, SecretKey secretKey, PublicKey publicKey) {
        return a(str, e.a(nD(PACEInfo.nu(str)), (Key) secretKey), publicKey);
    }

    public static byte[] a(String str, PublicKey publicKey) {
        return a(str, publicKey, true);
    }

    public static byte[] a(String str, PublicKey publicKey, boolean z) {
        String str2 = str;
        PublicKey publicKey2 = publicKey;
        String str3 = "Error closing stream";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        TLVOutputStream tLVOutputStream = new TLVOutputStream(byteArrayOutputStream);
        try {
            tLVOutputStream.writeTag(32585);
            BigInteger p;
            if (publicKey2 instanceof DHPublicKey) {
                DHPublicKey dHPublicKey = (DHPublicKey) publicKey2;
                DHParameterSpec params = dHPublicKey.getParams();
                p = params.getP();
                int l = params.getL();
                BigInteger g = params.getG();
                BigInteger y = dHPublicKey.getY();
                tLVOutputStream.write(new ASN1ObjectIdentifier(str2).getEncoded());
                if (!z) {
                    tLVOutputStream.writeTag(129);
                    tLVOutputStream.writeValue(e.a(p));
                    tLVOutputStream.writeTag(130);
                    tLVOutputStream.writeValue(e.a(BigInteger.valueOf((long) l)));
                    tLVOutputStream.writeTag(131);
                    tLVOutputStream.writeValue(e.a(g));
                }
                tLVOutputStream.writeTag(132);
                tLVOutputStream.writeValue(e.a(y));
            } else if (publicKey2 instanceof ECPublicKey) {
                ECPublicKey eCPublicKey = (ECPublicKey) publicKey2;
                AlgorithmParameterSpec params2 = eCPublicKey.getParams();
                p = e.a(params2);
                EllipticCurve curve = params2.getCurve();
                BigInteger a = curve.getA();
                BigInteger b = curve.getB();
                ECPoint generator = params2.getGenerator();
                BigInteger order = params2.getOrder();
                int cofactor = params2.getCofactor();
                ECPoint w = eCPublicKey.getW();
                tLVOutputStream.write(new ASN1ObjectIdentifier(str2).getEncoded());
                if (!z) {
                    tLVOutputStream.writeTag(129);
                    tLVOutputStream.writeValue(e.a(p));
                    tLVOutputStream.writeTag(130);
                    tLVOutputStream.writeValue(e.a(a));
                    tLVOutputStream.writeTag(131);
                    tLVOutputStream.writeValue(e.a(b));
                    BigInteger affineX = generator.getAffineX();
                    BigInteger affineY = generator.getAffineY();
                    tLVOutputStream.writeTag(132);
                    tLVOutputStream.write(e.a(affineX));
                    tLVOutputStream.write(e.a(affineY));
                    tLVOutputStream.writeValueEnd();
                    tLVOutputStream.writeTag(133);
                    tLVOutputStream.writeValue(e.a(order));
                }
                tLVOutputStream.writeTag(134);
                tLVOutputStream.writeValue(e.a(w));
                if (!z) {
                    tLVOutputStream.writeTag(135);
                    tLVOutputStream.writeValue(e.a(BigInteger.valueOf((long) cofactor)));
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported public key: ");
                stringBuilder.append(publicKey.getClass().getCanonicalName());
                throw new InvalidKeyException(stringBuilder.toString());
            }
            tLVOutputStream.writeValueEnd();
            tLVOutputStream.flush();
            try {
                tLVOutputStream.close();
            } catch (IOException e) {
                eNz.log(Level.FINE, str3, e);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            eNz.log(Level.WARNING, "Exception", e2);
            throw new IllegalStateException("Error in encoding public key");
        } catch (Throwable e3) {
            Throwable th = e3;
            try {
                tLVOutputStream.close();
            } catch (IOException e32) {
                eNz.log(Level.FINE, str3, e32);
            }
        }
    }

    public static byte[] e(PublicKey publicKey) {
        if (publicKey == null) {
            throw new IllegalArgumentException("Cannot encode null public key");
        } else if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(e.a(eCPublicKey.getW()));
                byte[] toByteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return toByteArray;
            } catch (IOException e) {
                throw new IllegalStateException("Internal error writing to memory", e);
            }
        } else if (publicKey instanceof DHPublicKey) {
            return e.a(((DHPublicKey) publicKey).getY());
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported public key: ");
            stringBuilder.append(publicKey.getClass().getCanonicalName());
            throw new InvalidKeyException(stringBuilder.toString());
        }
    }

    public static PublicKey a(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec) {
        String str = "Exception";
        if (algorithmParameterSpec != null) {
            DataInputStream dataInputStream;
            try {
                if (algorithmParameterSpec instanceof ECParameterSpec) {
                    return e.a("EC", new ECPublicKeySpec(e.ai(bArr), (ECParameterSpec) algorithmParameterSpec));
                }
                if (algorithmParameterSpec instanceof DHParameterSpec) {
                    dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
                    if (dataInputStream.read() == 4) {
                        bArr = new byte[(bArr.length - 1)];
                        dataInputStream.readFully(bArr);
                        DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
                        PublicKey a = e.a("DH", new DHPublicKeySpec(e.ah(bArr), dHParameterSpec.getP(), dHParameterSpec.getG()));
                        dataInputStream.close();
                        return a;
                    }
                    throw new IllegalArgumentException("Expected encoded public key to start with 0x04");
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expected ECParameterSpec or DHParameterSpec, found ");
                stringBuilder.append(algorithmParameterSpec.getClass().getCanonicalName());
                throw new IllegalArgumentException(stringBuilder.toString());
            } catch (IOException e) {
                eNz.log(Level.WARNING, str, e);
                throw new IllegalArgumentException(e);
            } catch (GeneralSecurityException e2) {
                eNz.log(Level.WARNING, str, e2);
                throw new IllegalArgumentException(e2);
            } catch (Throwable th) {
                dataInputStream.close();
            }
        }
        throw new IllegalArgumentException("Params cannot be null");
    }

    private static byte[] a(String str, Mac mac, PublicKey publicKey) {
        byte[] doFinal = mac.doFinal(a(str, publicKey));
        byte[] bArr = new byte[8];
        System.arraycopy(doFinal, 0, bArr, 0, bArr.length);
        return bArr;
    }

    private static String nC(String str) {
        str = str.replace('<', ' ').trim().replace(' ', '<');
        while (str.length() < 9) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("<");
            str = stringBuilder.toString();
        }
        return str;
    }

    private static byte[] A(String str, String str2, String str3) {
        return e.a(str, str2, str3, "SHA-1", false);
    }

    private void a(String str, String str2, String str3, int i, AlgorithmParameterSpec algorithmParameterSpec) {
        if (str != null) {
            String str4 = "ECDH";
            String str5 = "DH";
            String str6 = "\"";
            StringBuilder stringBuilder;
            if (!str4.equalsIgnoreCase(str) && !str5.equalsIgnoreCase(str)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported agreement algorithm, expected ECDH or DH, found \"");
                stringBuilder.append(str);
                stringBuilder.append(str6);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (str2 != null) {
                String str7 = "Unsupported cipher algorithm, expected DESede or AES, found \"";
                StringBuilder stringBuilder2;
                if (!"DESede".equalsIgnoreCase(str2) && !"AES".equalsIgnoreCase(str2)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str7);
                    stringBuilder.append(str2);
                    stringBuilder.append(str6);
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (!"SHA-1".equalsIgnoreCase(str3) && !"SHA1".equalsIgnoreCase(str3) && !"SHA-256".equalsIgnoreCase(str3) && !"SHA256".equalsIgnoreCase(str3)) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str7);
                    stringBuilder2.append(str3);
                    stringBuilder2.append(str6);
                    throw new IllegalArgumentException(stringBuilder2.toString());
                } else if (i == 128 || i == 192 || i == 256) {
                    str3 = "\", found ";
                    StringBuilder stringBuilder3;
                    if (str4.equalsIgnoreCase(str) && !(algorithmParameterSpec instanceof ECParameterSpec)) {
                        stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("Expected ECParameterSpec for agreement algorithm \"");
                        stringBuilder3.append(str);
                        stringBuilder3.append(str3);
                        stringBuilder3.append(algorithmParameterSpec.getClass().getCanonicalName());
                        throw new IllegalArgumentException(stringBuilder3.toString());
                    } else if (str5.equalsIgnoreCase(str) && !(algorithmParameterSpec instanceof DHParameterSpec)) {
                        stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("Expected DHParameterSpec for agreement algorithm \"");
                        stringBuilder3.append(str);
                        stringBuilder3.append(str3);
                        stringBuilder3.append(algorithmParameterSpec.getClass().getCanonicalName());
                        throw new IllegalArgumentException(stringBuilder3.toString());
                    } else {
                        return;
                    }
                } else {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Unsupported key length, expected 128, 192, or 256, found ");
                    stringBuilder2.append(i);
                    throw new IllegalArgumentException(stringBuilder2.toString());
                }
            } else {
                throw new IllegalArgumentException("Unknown cipher algorithm");
            }
        }
        throw new IllegalArgumentException("Unknown agreement algorithm");
    }

    private static String nD(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot infer MAC algorithm from cipher algorithm null");
        } else if (str.startsWith("DESede")) {
            return "ISO9797ALG3WITHISO7816-4PADDING";
        } else {
            if (str.startsWith("AES")) {
                return "AESCMAC";
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot infer MAC algorithm from cipher algorithm \"");
            stringBuilder.append(str);
            stringBuilder.append("\"");
            throw new InvalidAlgorithmParameterException(stringBuilder.toString());
        }
    }
}
