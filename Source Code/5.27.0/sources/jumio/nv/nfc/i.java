package jumio.nv.nfc;

import android.nfc.tech.IsoDep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.jumio.commons.utils.IOUtils;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import javax.crypto.Cipher;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.util.Hex;
import org.jmrtd.BACKey;
import org.jmrtd.PACEKeySpec;
import org.jmrtd.d;
import org.jmrtd.e;
import org.jmrtd.lds.ActiveAuthenticationInfo;
import org.jmrtd.lds.CardAccessFile;
import org.jmrtd.lds.PACEInfo;
import org.jmrtd.lds.SODFile;
import org.jmrtd.lds.SecurityInfo;
import org.jmrtd.lds.a;
import org.jmrtd.lds.icao.DG15File;
import org.jmrtd.lds.icao.DG1File;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.DERSequence;

/* compiled from: NfcPassportReader */
public class i implements k {
    static final /* synthetic */ boolean a = (i.class.desiredAssertionStatus() ^ 1);
    private final String b;
    private final BACKey c;
    private final d d;
    private final SecureRandom e = new SecureRandom();
    private c f;
    private Collection<Integer> g;
    private boolean h = false;
    private IsoDep i;
    private boolean j = false;

    public i(d dVar, String str, Date date, Date date2, String str2) {
        this.b = str2;
        this.c = new BACKey(str, date, date2);
        this.d = dVar;
        this.g = new TreeSet();
    }

    @NonNull
    public o a() {
        o oVar = new o(p.INIT);
        String str = "PassportReader";
        f.a(str, "passport service created");
        this.d.open();
        this.j = false;
        try {
            Collection bRo = new CardAccessFile(this.d.e((short) 284)).bRo();
            if (bRo == null || bRo.size() <= 0) {
                this.j = false;
                f.a(str, "passport service opened");
                this.d.hn(this.j);
                f.a(str, "select applet done");
                oVar.a(q.SUCCESSFUL);
                this.h = true;
                return oVar;
            }
            while (bRo.iterator().hasNext()) {
                SecurityInfo securityInfo = (SecurityInfo) bRo.iterator().next();
                if (securityInfo instanceof PACEInfo) {
                    this.d.a(PACEKeySpec.a(this.c), securityInfo.bRk(), PACEInfo.b(((PACEInfo) securityInfo).bRr()));
                    break;
                }
            }
            this.j = true;
            f.a(str, "passport service opened");
            this.d.hn(this.j);
            f.a(str, "select applet done");
            oVar.a(q.SUCCESSFUL);
            this.h = true;
            return oVar;
        } catch (Exception e) {
            f.c(str, e.getMessage());
        }
    }

    @NonNull
    public o b() {
        f.a("PassportReader", "performing BAC");
        o oVar = new o(p.BAC_CHECK);
        if (this.j) {
            oVar.a(q.SUCCESSFUL);
            return oVar;
        }
        int timeout = this.i.getTimeout();
        this.i.setTimeout(10000);
        if (this.d.isOpen()) {
            try {
                this.d.b(this.c);
                oVar.a(q.SUCCESSFUL);
            } catch (CardServiceException e) {
                oVar.a(q.ERROR, e);
            }
        }
        if (timeout < 1000) {
            timeout = 1000;
        }
        this.i.setTimeout(timeout);
        return oVar;
    }

    @NonNull
    public List<o> c() {
        i();
        Map bRs = this.f.b().bRs();
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : bRs.keySet()) {
            int intValue2 = intValue.intValue();
            o a = a(intValue2);
            a.a(Integer.valueOf(intValue2));
            arrayList.add(a);
        }
        return arrayList;
    }

    @NonNull
    public o a(d dVar, boolean z) {
        o a = dVar.a(this.d, this.g, z);
        this.f = (c) a.g();
        return new o(p.READ_LDS, a.b());
    }

    @NonNull
    public o a(boolean z) {
        return a(new b(), z);
    }

    @NonNull
    public o d() {
        i();
        o oVar = new o(p.PASSIVE_AUTH_DSC_CHECK);
        try {
            SODFile b = this.f.b();
            if (b == null) {
                return new o(p.PASSIVE_AUTH_DSC_CHECK, q.FAILED);
            }
            Certificate bRx = b.bRx();
            bRx.checkValidity();
            if (a(b, bRx)) {
                oVar.a(q.SUCCESSFUL);
            } else {
                oVar.a(q.FAILED);
            }
            return oVar;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("#### error in Passive Authentication: ");
            stringBuilder.append(e);
            f.a("PassportReader", stringBuilder.toString());
            oVar.a(q.ERROR, e);
        }
    }

    private boolean a(SODFile sODFile, Certificate certificate) {
        String bRw;
        byte[] bRu = sODFile.bRu();
        byte[] bRt = sODFile.bRt();
        try {
            bRw = sODFile.bRw();
        } catch (Exception unused) {
            bRw = null;
        }
        String bRv;
        if (bRw == null) {
            MessageDigest instance;
            bRv = sODFile.bRv();
            try {
                instance = MessageDigest.getInstance(bRv);
            } catch (Exception unused2) {
                instance = MessageDigest.getInstance(bRv, e.bQZ());
            }
            instance.update(bRu);
            return Arrays.equals(instance.digest(), bRt);
        }
        Signature instance2;
        String str = "";
        String str2 = "-";
        if ("SSAwithRSA/PSS".equals(bRw)) {
            bRw = sODFile.bRv();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(bRw.replace(str2, str));
            stringBuilder.append("withRSA/PSS");
            bRw = stringBuilder.toString();
        }
        if ("RSA".equals(bRw)) {
            bRv = sODFile.bRv();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(bRv.replace(str2, str));
            stringBuilder2.append("withRSA");
            bRw = stringBuilder2.toString();
        }
        try {
            instance2 = Signature.getInstance(bRw);
        } catch (Exception unused3) {
            instance2 = Signature.getInstance(bRw, e.bQZ());
        }
        instance2.initVerify(certificate);
        instance2.update(bRu);
        return instance2.verify(bRt);
    }

    @NonNull
    public o a(h hVar) {
        o oVar = new o(p.PASSIVE_AUTH_ROOT_CERT_CHECK);
        oVar.a(q.NOT_AVAILABLE);
        for (X509Certificate x509Certificate : hVar.b(this.b)) {
            o a = a(x509Certificate);
            if (a.d()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SN=");
                stringBuilder.append(x509Certificate.getSerialNumber());
                a.a(stringBuilder.toString());
                return a;
            }
            oVar = a;
        }
        return oVar;
    }

    @NonNull
    public o e() {
        i();
        try {
            return new o(p.ACTIVE_AUTH_CHECK, this.f.b().bRs().keySet().contains(Integer.valueOf(15)) ? q.SUCCESSFUL : q.NOT_AVAILABLE);
        } catch (IOException e) {
            e.printStackTrace();
            return new o(p.ACTIVE_AUTH_CHECK, q.FAILED);
        }
    }

    @NonNull
    public o f() {
        StringBuilder stringBuilder;
        i();
        String str = "PassportReader";
        f.a(str, "perform active auth");
        o oVar = new o(p.ACTIVE_AUTH_CHECK);
        try {
            DG15File g = this.f.g();
            if (g == null) {
                f.a(str, "active auth not available, DG15 not present");
                return new o(p.ACTIVE_AUTH_CHECK, q.NOT_AVAILABLE);
            }
            String str2;
            String str3;
            byte[] bArr;
            StringBuilder stringBuilder2;
            byte[] bSk;
            int i;
            new DG15File(this.d.e((short) 271)).getEncoded();
            PublicKey publicKey = g.getPublicKey();
            String algorithm = publicKey.getAlgorithm();
            String str4 = "SHA1";
            String str5 = "SHA1WithRSA/ISO9796-2";
            if (!"EC".equals(algorithm)) {
                if (!"ECDSA".equals(algorithm)) {
                    str2 = str4;
                    str3 = str5;
                    bArr = new byte[8];
                    this.e.nextBytes(bArr);
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("AA challenge: ");
                    stringBuilder2.append(Hex.bytesToHexString(bArr));
                    f.a(str, stringBuilder2.toString());
                    bSk = this.d.a(publicKey, str2, str3, bArr).bSk();
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("AA response: ");
                    stringBuilder2.append(Hex.bytesToHexString(bSk));
                    f.a(str, stringBuilder2.toString());
                    return a(publicKey, str2, str3, bArr, bSk);
                }
            }
            List bRV = this.f.f().bRV();
            if (bRV == null) {
                i = 0;
            } else {
                i = bRV.size();
            }
            if (i < 1) {
                algorithm = "Found no active authentication info in EF.DG14";
                f.a(str, algorithm);
                return new o(p.ACTIVE_AUTH_CHECK, q.NOT_AVAILABLE, new Throwable(algorithm));
            }
            if (i > 1) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Found ");
                stringBuilder3.append(i);
                stringBuilder3.append(" in EF.DG14, expected 1.");
                f.a(str, stringBuilder3.toString());
            }
            algorithm = ActiveAuthenticationInfo.no(((ActiveAuthenticationInfo) bRV.get(0)).bRl());
            str3 = algorithm;
            str2 = e.nk(algorithm);
            bArr = new byte[8];
            this.e.nextBytes(bArr);
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("AA challenge: ");
            stringBuilder2.append(Hex.bytesToHexString(bArr));
            f.a(str, stringBuilder2.toString());
            bSk = this.d.a(publicKey, str2, str3, bArr).bSk();
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("AA response: ");
            stringBuilder2.append(Hex.bytesToHexString(bSk));
            f.a(str, stringBuilder2.toString());
            return a(publicKey, str2, str3, bArr, bSk);
        } catch (IOException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("#### error reading DG15 ");
            stringBuilder.append(e);
            f.a(str, stringBuilder.toString());
            oVar.a(q.ERROR, e);
            return oVar;
        } catch (NoSuchAlgorithmException e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("#### algorithm not found: ");
            stringBuilder.append(e2);
            f.a(str, stringBuilder.toString());
            oVar.a(q.ERROR, e2);
            return oVar;
        } catch (CardServiceException e3) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("### card service error: ");
            stringBuilder.append(e3);
            f.a(str, stringBuilder.toString());
            oVar.a(q.ERROR, e3);
            return oVar;
        }
    }

    @NonNull
    public o g() {
        String str = "PassportReader";
        f.a(str, "read passport details");
        o oVar = new o(p.ADDITIONAL_DATA);
        Object nVar = new n();
        try {
            DG1File c = this.f.c();
            if (c != null) {
                nVar.a(c.bRW());
            }
            int[] bRA = this.f.a().bRA();
            ArrayList arrayList = new ArrayList();
            for (int mV : bRA) {
                arrayList.add(Integer.valueOf(a.mV(mV)));
            }
            if (arrayList.contains(Integer.valueOf(11))) {
                f.a(str, "read DG11 - personal details");
                nVar.a(new m(this.f.d()));
            }
            if (arrayList.contains(Integer.valueOf(12))) {
                f.a(str, "read DG12 - document details");
                nVar.a(new l(this.f.e()));
            }
            oVar.a(q.SUCCESSFUL);
            oVar.a(nVar);
        } catch (Exception e) {
            oVar.a(q.ERROR, e);
        }
        return oVar;
    }

    @Nullable
    public String h() {
        i();
        try {
            return this.f.c().bRW().toString();
        } catch (IOException e) {
            f.b("PassportReader", "error reading DG1", e);
            return null;
        }
    }

    private o a(int i) {
        String str = "\"";
        String str2 = "PassportReader";
        i();
        short mU = a.mU(a.mW(i));
        try {
            SODFile b = this.f.b();
            byte[] bArr = (byte[]) b.bRs().get(Integer.valueOf(i));
            String digestAlgorithm = b.getDigestAlgorithm();
            StringBuilder stringBuilder;
            try {
                str = a(digestAlgorithm);
                String str3 = "Skipping DG";
                StringBuilder stringBuilder2;
                if (mU == (short) 259 || mU == (short) 260) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str3);
                    stringBuilder2.append(i);
                    stringBuilder2.append(" during HT verification because EAC not yet implemented.");
                    return new o(p.PASSIVE_AUTH_HASH_CHECK, q.NOT_AVAILABLE, new Throwable(stringBuilder2.toString()));
                }
                try {
                    InputStream c;
                    int a = this.f.a(mU);
                    byte[] bArr2 = null;
                    if (a > 0) {
                        bArr2 = new byte[a];
                        c = this.f.c(mU);
                        DataInputStream dataInputStream = new DataInputStream(c);
                        dataInputStream.readFully(bArr2);
                        IOUtils.closeQuietly(dataInputStream);
                    } else {
                        c = null;
                    }
                    if (c == null) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(str3);
                        stringBuilder2.append(i);
                        stringBuilder2.append(" during HT verification because file could not be read.");
                        str = stringBuilder2.toString();
                        f.a(str2, str);
                        return new o(p.PASSIVE_AUTH_HASH_CHECK, q.NOT_AVAILABLE, new Throwable(str));
                    }
                    try {
                        boolean equals = Arrays.equals(bArr, str.digest(bArr2));
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("hash check for DG");
                        stringBuilder.append(i);
                        stringBuilder.append(": ");
                        stringBuilder.append(equals ? " -- MATCH -- " : " -- MISMATCH -- ");
                        f.a(str2, stringBuilder.toString());
                        return new o(p.PASSIVE_AUTH_HASH_CHECK, equals ? q.SUCCESSFUL : q.FAILED);
                    } catch (Exception e) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("exception computing hash ");
                        stringBuilder2.append(e);
                        f.a(str2, stringBuilder2.toString());
                        return new o(p.PASSIVE_AUTH_HASH_CHECK, q.ERROR, e);
                    }
                } catch (Exception e2) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("#### error reading DG");
                    stringBuilder.append(i);
                    stringBuilder.append(" hash: ");
                    stringBuilder.append(e2.getMessage());
                    f.a(str2, stringBuilder.toString());
                    return new o(p.PASSIVE_AUTH_HASH_CHECK, q.ERROR, e2);
                }
            } catch (NoSuchAlgorithmException e3) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported algorithm \"");
                stringBuilder.append(digestAlgorithm);
                stringBuilder.append(str);
                f.a(str2, stringBuilder.toString());
                return new o(p.PASSIVE_AUTH_HASH_CHECK, q.FAILED, e3);
            } catch (NoSuchProviderException e32) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported provider for algorithm \"");
                stringBuilder.append(digestAlgorithm);
                stringBuilder.append(str);
                f.a(str2, stringBuilder.toString());
                return new o(p.PASSIVE_AUTH_HASH_CHECK, q.FAILED, e32);
            }
        } catch (Exception e4) {
            p pVar = p.PASSIVE_AUTH_HASH_CHECK;
            q qVar = q.ERROR;
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("DG");
            stringBuilder3.append(i);
            stringBuilder3.append(" failed, could not get stored hash");
            stringBuilder3.append(e4.getMessage());
            return new o(pVar, qVar, new Throwable(stringBuilder3.toString()));
        }
    }

    private o a(X509Certificate x509Certificate) {
        i();
        o oVar = new o(p.PASSIVE_AUTH_ROOT_CERT_CHECK);
        try {
            this.f.b().bRx().verify(x509Certificate.getPublicKey());
            oVar.a(q.SUCCESSFUL);
        } catch (Exception e) {
            oVar.a(q.FAILED, e);
        }
        return oVar;
    }

    private MessageDigest a(String str) {
        if (Security.getAlgorithms("MessageDigest").contains(str)) {
            return MessageDigest.getInstance(str);
        }
        return MessageDigest.getInstance(str, e.bQZ());
    }

    private o a(PublicKey publicKey, String str, String str2, byte[] bArr, byte[] bArr2) {
        try {
            String algorithm = publicKey.getAlgorithm();
            int digestLength;
            if ("RSA".equals(algorithm)) {
                MessageDigest instance = MessageDigest.getInstance(str);
                Signature instance2 = Signature.getInstance(str2, e.bQZ());
                Cipher instance3 = Cipher.getInstance("RSA/NONE/NoPadding");
                RSAPublicKey rSAPublicKey = (RSAPublicKey) publicKey;
                instance3.init(2, rSAPublicKey);
                instance2.initVerify(rSAPublicKey);
                digestLength = instance.getDigestLength();
                if (!a) {
                    if (digestLength != 20) {
                        throw new AssertionError();
                    }
                }
                instance2.update(e.a(digestLength, instance3.doFinal(bArr2)));
                instance2.update(bArr);
                return new o(p.ACTIVE_AUTH_CHECK, instance2.verify(bArr2) ? q.SUCCESSFUL : q.FAILED);
            }
            String str3 = "PassportReader";
            if (!"EC".equals(algorithm)) {
                if (!"ECDSA".equals(algorithm)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported AA public key type ");
                    stringBuilder.append(publicKey.getClass().getSimpleName());
                    String stringBuilder2 = stringBuilder.toString();
                    f.a(str3, stringBuilder2);
                    return new o(p.ACTIVE_AUTH_CHECK, q.FAILED, new Throwable(stringBuilder2));
                }
            }
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            Signature instance4 = Signature.getInstance("SHA256withECDSA", e.bQZ());
            MessageDigest instance5 = MessageDigest.getInstance("SHA-256");
            if (instance4 == null || !(str2 == null || str2.equals(instance4.getAlgorithm()))) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Re-initializing ecdsaAASignature with signature algorithm ");
                stringBuilder3.append(str2);
                f.a(str3, stringBuilder3.toString());
                instance4 = Signature.getInstance(str2);
            }
            if (instance5 == null || !(str == null || str.equals(instance5.getAlgorithm()))) {
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("Re-initializing ecdsaAADigest with digest algorithm ");
                stringBuilder4.append(str);
                f.a(str3, stringBuilder4.toString());
                MessageDigest.getInstance(str);
            }
            instance4.initVerify(eCPublicKey);
            if (bArr2.length % 2 != 0) {
                f.a(str3, "Active Authentication response is not of even length");
            }
            digestLength = bArr2.length / 2;
            BigInteger s = e.s(bArr2, 0, digestLength);
            BigInteger s2 = e.s(bArr2, digestLength, digestLength);
            instance4.update(bArr);
            try {
                return new o(p.ACTIVE_AUTH_CHECK, instance4.verify(new DERSequence(new ASN1Encodable[]{new ASN1Integer(s), new ASN1Integer(s2)}).getEncoded()) ? q.SUCCESSFUL : q.FAILED);
            } catch (IOException e) {
                f.a(str3, "Unexpected exception during AA signature verification with ECDSA");
                e.printStackTrace();
                return new o(p.ACTIVE_AUTH_CHECK, q.ERROR, e);
            }
        } catch (IllegalArgumentException | GeneralSecurityException e2) {
            throw new CardServiceException(e2.toString());
        }
    }

    private void i() {
        if (!this.h || this.f == null || this.g.isEmpty()) {
            throw new IllegalStateException("call open() and readLDS() before performing any other operations!");
        }
    }

    public void a(IsoDep isoDep) {
        this.i = isoDep;
    }
}
