package org.jmrtd;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import net.sf.scuba.smartcards.APDUEvent;
import net.sf.scuba.smartcards.APDUWrapper;
import net.sf.scuba.smartcards.CardService;
import net.sf.scuba.smartcards.CardServiceException;
import net.sf.scuba.smartcards.CommandAPDU;
import net.sf.scuba.smartcards.ResponseAPDU;
import net.sf.scuba.tlv.TLVInputStream;
import net.sf.scuba.tlv.TLVUtil;
import net.sf.scuba.util.Hex;
import org.spongycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: PassportAPDUService */
class c extends CardService {
    private static final Logger eNz = Logger.getLogger("org.jmrtd");
    private static final Provider fEh = e.bQZ();
    protected static final byte[] fEi = new byte[]{(byte) -96, (byte) 0, (byte) 0, (byte) 2, (byte) 71, (byte) 16, (byte) 1};
    private static final IvParameterSpec fEj = new IvParameterSpec(new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0});
    private Cipher bcE;
    private CardService fEk;
    private byte[] fEl;
    private int fEm;
    private Mac mac;

    public c(CardService cardService) {
        if (cardService != null) {
            this.fEk = cardService;
            this.fEm = 0;
            try {
                this.mac = Mac.getInstance("ISO9797Alg3Mac", fEh);
                this.bcE = e.nl("DESede/CBC/NoPadding");
                return;
            } catch (GeneralSecurityException e) {
                throw new CardServiceException("Unexpected security exception during initialization", e);
            }
        }
        throw new IllegalArgumentException("Card service cannot be null");
    }

    public void open() {
        if (!this.fEk.isOpen()) {
            this.fEk.open();
        }
        this.fEl = this.fEk.getATR();
    }

    public synchronized boolean isOpen() {
        return this.fEk.isOpen();
    }

    public synchronized ResponseAPDU a(CommandAPDU commandAPDU) {
        ResponseAPDU transmit;
        transmit = this.fEk.transmit(commandAPDU);
        int i = this.fEm + 1;
        this.fEm = i;
        notifyExchangedAPDU(new APDUEvent(this, "PLAIN", i, commandAPDU, transmit));
        return transmit;
    }

    public ResponseAPDU a(APDUWrapper aPDUWrapper, CommandAPDU commandAPDU) {
        String str = "Exception during transmission of wrapped APDU, C=";
        CommandAPDU wrap = aPDUWrapper != null ? aPDUWrapper.wrap(commandAPDU) : commandAPDU;
        ResponseAPDU transmit = this.fEk.transmit(wrap);
        short sw = (short) transmit.getSW();
        int i;
        if (aPDUWrapper == null) {
            i = this.fEm + 1;
            this.fEm = i;
            notifyExchangedAPDU(new APDUEvent(this, "PLAIN", i, wrap, transmit));
            return transmit;
        }
        String type;
        try {
            if (transmit.getBytes().length > 2) {
                ResponseAPDU unwrap = aPDUWrapper.unwrap(transmit);
                type = aPDUWrapper.getType();
                i = this.fEm + 1;
                this.fEm = i;
                notifyExchangedAPDU(new f(this, type, i, commandAPDU, unwrap, wrap, transmit));
                return unwrap;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(Hex.bytesToHexString(commandAPDU.getBytes()));
            throw new CardServiceException(stringBuilder.toString(), sw);
        } catch (CardServiceException e) {
            throw e;
        } catch (Exception e2) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append(Hex.bytesToHexString(commandAPDU.getBytes()));
            throw new CardServiceException(stringBuilder2.toString(), e2, sw);
        } catch (Throwable th) {
            type = aPDUWrapper.getType();
            i = this.fEm + 1;
            this.fEm = i;
            notifyExchangedAPDU(new f(this, type, i, commandAPDU, transmit, wrap, transmit));
        }
    }

    public synchronized void a(APDUWrapper aPDUWrapper, byte[] bArr) {
        if (bArr != null) {
            CommandAPDU commandAPDU = new CommandAPDU(0, -92, 4, 12, bArr);
            a(commandAPDU, a(aPDUWrapper, commandAPDU));
        } else {
            throw new IllegalArgumentException("AID cannot be null");
        }
    }

    public synchronized byte[] bQW() {
        return a(null);
    }

    public synchronized byte[] a(APDUWrapper aPDUWrapper) {
        return a(aPDUWrapper, new CommandAPDU(0, -124, 0, 0, 8)).getData();
    }

    public synchronized byte[] b(APDUWrapper aPDUWrapper, byte[] bArr) {
        if (bArr != null) {
            if (bArr.length == 8) {
            }
        }
        throw new IllegalArgumentException("rndIFD wrong length");
        return a(aPDUWrapper, new CommandAPDU(0, -120, 0, 0, bArr, 256)).getData();
    }

    public synchronized byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, SecretKey secretKey, SecretKey secretKey2) {
        byte[] doFinal;
        Object obj = bArr;
        Object obj2 = bArr2;
        Object obj3 = bArr3;
        SecretKey secretKey3 = secretKey;
        SecretKey secretKey4 = secretKey2;
        synchronized (this) {
            if (obj != null) {
                try {
                    if (obj.length == 8) {
                        if (obj2 == null || obj2.length != 8) {
                            obj2 = new byte[8];
                        }
                        if (obj3 == null || obj3.length != 16) {
                            throw new IllegalArgumentException("kIFD wrong length");
                        } else if (secretKey3 == null) {
                            throw new IllegalArgumentException("kEnc == null");
                        } else if (secretKey4 != null) {
                            this.bcE.init(1, secretKey3, fEj);
                            byte[] bArr4 = new byte[32];
                            System.arraycopy(obj, 0, bArr4, 0, 8);
                            System.arraycopy(obj2, 0, bArr4, 8, 8);
                            System.arraycopy(obj3, 0, bArr4, 16, 16);
                            doFinal = this.bcE.doFinal(bArr4);
                            StringBuilder stringBuilder;
                            if (doFinal.length == 32) {
                                this.mac.init(secretKey4);
                                byte[] doFinal2 = this.mac.doFinal(e.j(doFinal, 8));
                                if (doFinal2.length == 8) {
                                    byte[] bArr5 = new byte[40];
                                    System.arraycopy(doFinal, 0, bArr5, 0, 32);
                                    System.arraycopy(doFinal2, 0, bArr5, 32, 8);
                                    ResponseAPDU a = a(new CommandAPDU(0, -126, 0, 0, bArr5, 40));
                                    if (a != null) {
                                        doFinal2 = a.getBytes();
                                        int sw = (short) a.getSW();
                                        if (doFinal2 != null) {
                                            if (sw != -28672) {
                                                a = a(new CommandAPDU(0, -126, 0, 0, bArr5, 0));
                                                doFinal2 = a.getBytes();
                                                sw = (short) a.getSW();
                                            }
                                            if (doFinal2.length == 42) {
                                                this.bcE.init(2, secretKey3, fEj);
                                                doFinal = this.bcE.doFinal(doFinal2, 0, (doFinal2.length - 8) - 2);
                                                if (doFinal.length == 32) {
                                                } else {
                                                    stringBuilder = new StringBuilder();
                                                    stringBuilder.append("Cryptogram wrong length ");
                                                    stringBuilder.append(doFinal.length);
                                                    throw new IllegalStateException(stringBuilder.toString());
                                                }
                                            }
                                            StringBuilder stringBuilder2 = new StringBuilder();
                                            stringBuilder2.append("Mutual authentication failed: expected length: 40 + 2, actual length: ");
                                            stringBuilder2.append(doFinal2.length);
                                            throw new CardServiceException(stringBuilder2.toString(), sw);
                                        }
                                        throw new CardServiceException("Mutual authentication failed, received empty data in response APDU", sw);
                                    }
                                    throw new CardServiceException("Mutual authentication failed, received null response APDU");
                                }
                                throw new IllegalStateException("MAC wrong length");
                            }
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Cryptogram wrong length ");
                            stringBuilder.append(doFinal.length);
                            throw new IllegalStateException(stringBuilder.toString());
                        } else {
                            throw new IllegalArgumentException("kMac == null");
                        }
                    }
                } catch (GeneralSecurityException e) {
                    throw new CardServiceException("Security exception during mutual auth", e);
                }
            }
            throw new IllegalArgumentException("rndIFD wrong length");
        }
        return doFinal;
    }

    public synchronized void a(APDUWrapper aPDUWrapper, String str, int i, byte[] bArr) {
        if (str != null) {
            try {
                byte[] nj = nj(str);
                if (!(i == 1 || i == 2 || i == 3)) {
                    if (i != 4) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unsupported key type reference (MRZ, CAN, etc), found ");
                        stringBuilder.append(i);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                byte[] wrapDO = TLVUtil.wrapDO(131, new byte[]{(byte) i});
                if (bArr != null) {
                    bArr = TLVUtil.wrapDO(132, bArr);
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(nj);
                byteArrayOutputStream.write(wrapDO);
                if (bArr != null) {
                    byteArrayOutputStream.write(bArr);
                }
                short sw = (short) a(aPDUWrapper, new CommandAPDU(0, 34, 193, 164, byteArrayOutputStream.toByteArray())).getSW();
                if (sw != (short) -28672) {
                    throw new CardServiceException("Sending MSE AT failed", sw);
                }
            } catch (IOException e) {
                eNz.log(Level.WARNING, "Error while copying data", e);
                throw new IllegalStateException("Error while copying data");
            } catch (Throwable th) {
            }
        } else {
            throw new IllegalArgumentException("OID cannot be null");
        }
    }

    public synchronized byte[] a(APDUWrapper aPDUWrapper, byte[] bArr, boolean z) {
        ResponseAPDU a;
        a = a(aPDUWrapper, new CommandAPDU(z ? 0 : 16, -122, 0, 0, TLVUtil.wrapDO(124, bArr), 256));
        short sw = (short) a.getSW();
        if (sw != (short) -28672) {
            throw new CardServiceException("Sending general authenticate failed", sw);
        }
        return TLVUtil.unwrapDO(124, a.getData());
    }

    private byte[] nj(String str) {
        TLVInputStream tLVInputStream;
        try {
            tLVInputStream = new TLVInputStream(new ByteArrayInputStream(new ASN1ObjectIdentifier(str).getEncoded()));
            tLVInputStream.readTag();
            tLVInputStream.readLength();
            byte[] readValue = tLVInputStream.readValue();
            tLVInputStream.close();
            return TLVUtil.wrapDO(128, readValue);
        } catch (IOException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal OID: \"");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        } catch (Throwable th) {
            tLVInputStream.close();
        }
    }

    private static void a(CommandAPDU commandAPDU, ResponseAPDU responseAPDU) {
        short sw = (short) responseAPDU.getSW();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CAPDU = ");
        stringBuilder.append(Hex.bytesToHexString(commandAPDU.getBytes()));
        stringBuilder.append(", RAPDU = ");
        stringBuilder.append(Hex.bytesToHexString(responseAPDU.getBytes()));
        String stringBuilder2 = stringBuilder.toString();
        if (sw != (short) -28672) {
            if (sw != (short) 27010) {
                if (sw == (short) 27266) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("File not found, ");
                    stringBuilder.append(stringBuilder2);
                    throw new CardServiceException(stringBuilder.toString(), sw);
                } else if (!(sw == (short) 27013 || sw == (short) 27014)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Error occured, ");
                    stringBuilder.append(stringBuilder2);
                    throw new CardServiceException(stringBuilder.toString(), sw);
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Access to file denied, ");
            stringBuilder.append(stringBuilder2);
            throw new CardServiceException(stringBuilder.toString(), sw);
        }
    }
}
