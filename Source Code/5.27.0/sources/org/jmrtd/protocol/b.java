package org.jmrtd.protocol;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKey;
import net.sf.scuba.smartcards.CardServiceException;
import org.jmrtd.BACKeySpec;
import org.jmrtd.d;
import org.jmrtd.e;

/* compiled from: BACProtocol */
public class b {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private d fEf;
    private Random random = new SecureRandom();

    public b(d dVar) {
        this.fEf = dVar;
    }

    public BACResult b(BACKeySpec bACKeySpec) {
        try {
            byte[] c = c(bACKeySpec);
            return new BACResult(bACKeySpec, a(e.i(c, 1), e.i(c, 2)));
        } catch (CardServiceException e) {
            eNz.log(Level.WARNING, "BAC failed", e);
            throw e;
        } catch (GeneralSecurityException e2) {
            throw new CardServiceException("Error during BAC", e2);
        }
    }

    private SecureMessagingWrapper a(SecretKey secretKey, SecretKey secretKey2) {
        byte[] bQW = this.fEf.bQW();
        byte[] bArr = new byte[8];
        this.random.nextBytes(bArr);
        byte[] bArr2 = new byte[16];
        this.random.nextBytes(bArr2);
        byte[] bArr3 = new byte[16];
        int i = 0;
        System.arraycopy(this.fEf.a(bArr, bQW, bArr2, secretKey, secretKey2), 16, bArr3, 0, 16);
        byte[] bArr4 = new byte[16];
        while (i < 16) {
            bArr4[i] = (byte) ((bArr2[i] & 255) ^ (bArr3[i] & 255));
            i++;
        }
        return new DESedeSecureMessagingWrapper(e.i(bArr4, 1), e.i(bArr4, 2), this.fEf.bQX(), this.fEf.bQY(), c(bQW, bArr));
    }

    public static byte[] c(BACKeySpec bACKeySpec) {
        String bQS = bACKeySpec.bQS();
        String bQT = bACKeySpec.bQT();
        String bQU = bACKeySpec.bQU();
        StringBuilder stringBuilder;
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
            return z(nC(bQS), bQT, bQU);
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Wrong document number. Found ");
            stringBuilder.append(bQS);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static long c(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 8 || bArr2 == null || bArr2.length != 8) {
            throw new IllegalStateException("Wrong length input");
        }
        int i = 4;
        long j = 0;
        for (int i2 = 4; i2 < 8; i2++) {
            j = (j << 8) + ((long) (bArr[i2] & 255));
        }
        while (i < 8) {
            i++;
            j = (j << 8) + ((long) (bArr2[i] & 255));
        }
        return j;
    }

    private static byte[] z(String str, String str2, String str3) {
        return e.a(str, str2, str3, "SHA-1", true);
    }

    private static String nC(String str) {
        StringBuilder stringBuilder = new StringBuilder(str == null ? "" : str.replace('<', ' ').trim().replace(' ', '<'));
        while (stringBuilder.length() < 9) {
            stringBuilder.append('<');
        }
        return stringBuilder.toString();
    }
}
