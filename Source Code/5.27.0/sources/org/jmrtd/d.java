package org.jmrtd;

import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.logging.Logger;
import javax.crypto.SecretKey;
import net.sf.scuba.smartcards.APDUWrapper;
import net.sf.scuba.smartcards.CardFileInputStream;
import net.sf.scuba.smartcards.CardService;
import org.jmrtd.protocol.AAResult;
import org.jmrtd.protocol.BACResult;
import org.jmrtd.protocol.PACEResult;
import org.jmrtd.protocol.SecureMessagingWrapper;
import org.jmrtd.protocol.a;
import org.jmrtd.protocol.b;

/* compiled from: PassportService */
public class d extends c {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private int fEn;
    private boolean fEo = false;
    private a fEp;
    private a fEq;
    private boolean isOpen = false;
    private int maxTranceiveLength;
    private boolean shouldCheckMAC;
    private SecureMessagingWrapper wrapper;

    public /* bridge */ /* synthetic */ byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, SecretKey secretKey, SecretKey secretKey2) {
        return super.a(bArr, bArr2, bArr3, secretKey, secretKey2);
    }

    public /* bridge */ /* synthetic */ byte[] b(APDUWrapper aPDUWrapper, byte[] bArr) {
        return super.b(aPDUWrapper, bArr);
    }

    public /* bridge */ /* synthetic */ byte[] bQW() {
        return super.bQW();
    }

    public d(CardService cardService, int i, int i2, boolean z, boolean z2) {
        super(cardService);
        this.maxTranceiveLength = i;
        this.fEn = i2;
        this.fEp = new a(this, z);
        this.fEq = new a(this, z);
        this.shouldCheckMAC = z2;
    }

    public void open() {
        if (!isOpen()) {
            synchronized (this) {
                super.open();
                this.isOpen = true;
            }
        }
    }

    public void hn(boolean z) {
        if (this.fEo) {
            eNz.info("Re-selecting ICAO applet");
        }
        if (z) {
            a(this.wrapper, fEi);
        } else {
            a(null, fEi);
        }
        this.fEo = true;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public synchronized BACResult b(BACKeySpec bACKeySpec) {
        BACResult b;
        b = new b(this).b(bACKeySpec);
        this.wrapper = b.bSm();
        return b;
    }

    public synchronized PACEResult a(AccessKeySpec accessKeySpec, String str, AlgorithmParameterSpec algorithmParameterSpec) {
        PACEResult a;
        a = new org.jmrtd.protocol.d(this, this.wrapper).a(accessKeySpec, str, algorithmParameterSpec);
        this.wrapper = a.bSm();
        return a;
    }

    public AAResult a(PublicKey publicKey, String str, String str2, byte[] bArr) {
        return new a(this, this.wrapper).a(publicKey, str, str2, bArr);
    }

    public int bQX() {
        return this.maxTranceiveLength;
    }

    public boolean bQY() {
        return this.shouldCheckMAC;
    }

    public synchronized CardFileInputStream e(short s) {
        CardFileInputStream cardFileInputStream;
        if (this.fEo) {
            synchronized (this.fEq) {
                this.fEq.d(s);
                cardFileInputStream = new CardFileInputStream(this.fEn, this.fEq);
            }
            return cardFileInputStream;
        }
        synchronized (this.fEp) {
            this.fEp.d(s);
            cardFileInputStream = new CardFileInputStream(this.fEn, this.fEp);
        }
        return cardFileInputStream;
    }
}
