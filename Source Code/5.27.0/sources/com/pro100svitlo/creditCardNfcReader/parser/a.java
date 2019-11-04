package com.pro100svitlo.creditCardNfcReader.parser;

import com.pro100svitlo.creditCardNfcReader.a.d;
import com.pro100svitlo.creditCardNfcReader.a.e;
import com.pro100svitlo.creditCardNfcReader.a.f;
import com.pro100svitlo.creditCardNfcReader.enums.CommandEnum;
import com.pro100svitlo.creditCardNfcReader.enums.EmvCardScheme;
import com.pro100svitlo.creditCardNfcReader.enums.SwEnum;
import com.pro100svitlo.creditCardNfcReader.model.EmvCard;
import com.pro100svitlo.creditCardNfcReader.model.EmvTransactionRecord;
import com.pro100svitlo.creditCardNfcReader.model.enums.CurrencyEnum;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.b;
import org.slf4j.c;

/* compiled from: EmvParser */
public class a {
    private static final b eGN = c.ac(a.class);
    private static final byte[] eGO = "2PAY.SYS.DDF01".getBytes();
    private static final byte[] eGP = "1PAY.SYS.DDF01".getBytes();
    private b eGQ;
    private boolean eGR;
    private EmvCard eGS = new EmvCard();

    public a(b bVar, boolean z) {
        this.eGQ = bVar;
        this.eGR = z;
    }

    public EmvCard bgJ() {
        if (!bgM()) {
            bgN();
        }
        return this.eGS;
    }

    /* Access modifiers changed, original: protected */
    public byte[] bgK() {
        if (eGN.isDebugEnabled()) {
            b bVar = eGN;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Select ");
            stringBuilder.append(this.eGR ? "PPSE" : "PSE");
            stringBuilder.append(" Application");
            bVar.q(stringBuilder.toString());
        }
        return this.eGQ.transceive(new com.pro100svitlo.creditCardNfcReader.a.b(CommandEnum.SELECT, this.eGR ? eGO : eGP, 0).bhc());
    }

    /* Access modifiers changed, original: protected */
    public int bgL() {
        if (eGN.isDebugEnabled()) {
            eGN.q("Get Left PIN try");
        }
        byte[] transceive = this.eGQ.transceive(new com.pro100svitlo.creditCardNfcReader.a.b(CommandEnum.GET_DATA, 159, 23, 0).bhc());
        if (d.Q(transceive)) {
            transceive = e.b(transceive, com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eDM);
            if (transceive != null) {
                return b.a.a.b.T(transceive);
            }
        }
        return -1;
    }

    /* Access modifiers changed, original: protected */
    public byte[] G(byte[] bArr) {
        byte[] b = e.b(bArr, com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eCx);
        if (b != null) {
            int T = b.a.a.b.T(b);
            if (eGN.isDebugEnabled()) {
                b bVar = eGN;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SFI found:");
                stringBuilder.append(T);
                bVar.q(stringBuilder.toString());
            }
            int i = (T << 3) | 4;
            b = this.eGQ.transceive(new com.pro100svitlo.creditCardNfcReader.a.b(CommandEnum.READ_RECORD, T, i, 0).bhc());
            if (d.a(b, SwEnum.SW_6C)) {
                b = this.eGQ.transceive(new com.pro100svitlo.creditCardNfcReader.a.b(CommandEnum.READ_RECORD, T, i, b[b.length - 1]).bhc());
            }
            return b;
        }
        if (eGN.isDebugEnabled()) {
            eGN.q("(FCI) Issuer Discretionary Data is already present");
        }
        return bArr;
    }

    /* Access modifiers changed, original: protected */
    public String H(byte[] bArr) {
        if (eGN.isDebugEnabled()) {
            eGN.q("Extract Application label");
        }
        bArr = e.b(bArr, com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eCp);
        if (bArr != null) {
            return new String(bArr);
        }
        return null;
    }

    /* Access modifiers changed, original: protected */
    public boolean bgM() {
        if (eGN.isDebugEnabled()) {
            eGN.q("Try to read card with Payment System Environment");
        }
        byte[] bgK = bgK();
        boolean z = false;
        if (d.Q(bgK)) {
            bgK = G(bgK);
            if (d.Q(bgK)) {
                for (byte[] a : I(bgK)) {
                    z = a(a, H(bgK));
                    if (z) {
                        break;
                    }
                }
                if (!z) {
                    this.eGS.fY(true);
                }
            }
        } else if (eGN.isDebugEnabled()) {
            b bVar = eGN;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.eGR ? "PPSE" : "PSE");
            stringBuilder.append(" not found -> Use kown AID");
            bVar.q(stringBuilder.toString());
        }
        return z;
    }

    /* Access modifiers changed, original: protected */
    public List<byte[]> I(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        for (com.pro100svitlo.creditCardNfcReader.iso7816emv.d dVar : e.a(bArr, com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eCo, com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eEM)) {
            if (dVar.bgy() != com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eEM || arrayList.size() == 0) {
                arrayList.add(dVar.bgz());
            } else {
                arrayList.add(org.apache.commons.lang3.a.b((byte[]) arrayList.get(arrayList.size() - 1), dVar.bgz()));
            }
        }
        return arrayList;
    }

    /* Access modifiers changed, original: protected */
    public void bgN() {
        if (eGN.isDebugEnabled()) {
            eGN.q("Try to read card with AID");
        }
        for (EmvCardScheme emvCardScheme : EmvCardScheme.values()) {
            byte[][] aidByte = emvCardScheme.getAidByte();
            int length = aidByte.length;
            int i = 0;
            while (i < length) {
                if (!a(aidByte[i], emvCardScheme.getName())) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public byte[] J(byte[] bArr) {
        if (eGN.isDebugEnabled()) {
            b bVar = eGN;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Select AID: ");
            stringBuilder.append(b.a.a.b.P(bArr));
            bVar.q(stringBuilder.toString());
        }
        return this.eGQ.transceive(new com.pro100svitlo.creditCardNfcReader.a.b(CommandEnum.SELECT, bArr, 0).bhc());
    }

    /* Access modifiers changed, original: protected */
    public boolean a(byte[] bArr, String str) {
        bArr = J(bArr);
        if (!d.Q(bArr)) {
            return false;
        }
        boolean a = a(bArr, this.eGQ);
        if (!a) {
            return a;
        }
        String U = b.a.a.b.U(e.b(bArr, com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eCw));
        if (eGN.isDebugEnabled()) {
            b bVar = eGN;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Application label:");
            stringBuilder.append(str);
            stringBuilder.append(" with Aid:");
            stringBuilder.append(U);
            bVar.q(stringBuilder.toString());
        }
        this.eGS.kR(U);
        EmvCard emvCard = this.eGS;
        emvCard.a(aQ(U, emvCard.getCardNumber()));
        this.eGS.kW(str);
        this.eGS.iH(bgL());
        return a;
    }

    /* Access modifiers changed, original: protected */
    public EmvCardScheme aQ(String str, String str2) {
        EmvCardScheme cardTypeByAid = EmvCardScheme.getCardTypeByAid(str);
        if (cardTypeByAid == EmvCardScheme.CB) {
            cardTypeByAid = EmvCardScheme.getCardTypeByCardNumber(str2);
            if (cardTypeByAid != null) {
                b bVar = eGN;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Real type:");
                stringBuilder.append(cardTypeByAid.getName());
                bVar.q(stringBuilder.toString());
            }
        }
        return cardTypeByAid;
    }

    /* Access modifiers changed, original: protected */
    public byte[] K(byte[] bArr) {
        return e.b(bArr, com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eEC, com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eEG);
    }

    /* Access modifiers changed, original: protected */
    public boolean a(byte[] bArr, b bVar) {
        byte[] K = K(bArr);
        boolean z = true;
        bArr = b(e.b(bArr, com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eEj), bVar);
        if (!d.Q(bArr)) {
            bArr = b(null, bVar);
            if (!d.Q(bArr)) {
                return false;
            }
        }
        if (L(bArr)) {
            this.eGS.bK(M(K));
        } else {
            z = false;
        }
        return z;
    }

    /* Access modifiers changed, original: protected */
    public boolean L(byte[] bArr) {
        boolean z;
        byte[] b = e.b(bArr, com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eCG);
        if (b != null) {
            b = org.apache.commons.lang3.a.r(b, 2, b.length);
            z = false;
        } else {
            z = f.a(this.eGS, bArr);
            if (z) {
                O(bArr);
            } else {
                b = e.b(bArr, com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eCW);
            }
        }
        if (b != null) {
            for (com.pro100svitlo.creditCardNfcReader.model.a aVar : N(b)) {
                for (int bgD = aVar.bgD(); bgD <= aVar.bgE(); bgD++) {
                    byte[] transceive = this.eGQ.transceive(new com.pro100svitlo.creditCardNfcReader.a.b(CommandEnum.READ_RECORD, bgD, (aVar.bgC() << 3) | 4, 0).bhc());
                    if (d.a(transceive, SwEnum.SW_6C)) {
                        transceive = this.eGQ.transceive(new com.pro100svitlo.creditCardNfcReader.a.b(CommandEnum.READ_RECORD, bgD, (aVar.bgC() << 3) | 4, transceive[transceive.length - 1]).bhc());
                    }
                    if (d.Q(transceive)) {
                        O(transceive);
                        if (f.a(this.eGS, transceive)) {
                            return true;
                        }
                    }
                }
            }
        }
        return z;
    }

    /* Access modifiers changed, original: protected */
    public List<com.pro100svitlo.creditCardNfcReader.iso7816emv.e> bgO() {
        List<com.pro100svitlo.creditCardNfcReader.iso7816emv.e> arrayList = new ArrayList();
        if (eGN.isDebugEnabled()) {
            eGN.q("GET log format");
        }
        byte[] transceive = this.eGQ.transceive(new com.pro100svitlo.creditCardNfcReader.a.b(CommandEnum.GET_DATA, 159, 79, 0).bhc());
        if (!d.Q(transceive)) {
            return arrayList;
        }
        return e.S(e.b(transceive, com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eEE));
    }

    /* Access modifiers changed, original: protected */
    public List<EmvTransactionRecord> M(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (bArr != null) {
            List bgO = bgO();
            for (byte b = (byte) 1; b <= bArr[1]; b++) {
                byte[] transceive = this.eGQ.transceive(new com.pro100svitlo.creditCardNfcReader.a.b(CommandEnum.READ_RECORD, b, (bArr[0] << 3) | 4, 0).bhc());
                if (!d.Q(transceive)) {
                    break;
                }
                EmvTransactionRecord emvTransactionRecord = new EmvTransactionRecord();
                emvTransactionRecord.a(transceive, bgO);
                if (emvTransactionRecord.bgH().floatValue() >= 1.5E9f) {
                    emvTransactionRecord.b(Float.valueOf(emvTransactionRecord.bgH().floatValue() - 1.5E9f));
                }
                if (!(emvTransactionRecord.bgH() == null || emvTransactionRecord.bgH().floatValue() == 0.0f)) {
                    if (emvTransactionRecord.bgI() == null) {
                        emvTransactionRecord.a(CurrencyEnum.XXX);
                    }
                    arrayList.add(emvTransactionRecord);
                }
            }
        }
        return arrayList;
    }

    /* Access modifiers changed, original: protected */
    public List<com.pro100svitlo.creditCardNfcReader.model.a> N(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        while (byteArrayInputStream.available() >= 4) {
            com.pro100svitlo.creditCardNfcReader.model.a aVar = new com.pro100svitlo.creditCardNfcReader.model.a();
            aVar.iE(byteArrayInputStream.read() >> 3);
            aVar.iF(byteArrayInputStream.read());
            aVar.iG(byteArrayInputStream.read());
            boolean z = true;
            if (byteArrayInputStream.read() != 1) {
                z = false;
            }
            aVar.fX(z);
            arrayList.add(aVar);
        }
        return arrayList;
    }

    /* Access modifiers changed, original: protected */
    public void O(byte[] bArr) {
        bArr = e.b(bArr, com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eDf);
        if (bArr != null) {
            String[] split = org.apache.commons.lang3.c.split(new String(bArr).trim(), "/");
            if (split != null && split.length == 2) {
                this.eGS.kT(org.apache.commons.lang3.c.nb(split[0]));
                this.eGS.kS(org.apache.commons.lang3.c.nb(split[1]));
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public byte[] b(byte[] bArr, b bVar) {
        List<com.pro100svitlo.creditCardNfcReader.iso7816emv.e> S = e.S(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(com.pro100svitlo.creditCardNfcReader.iso7816emv.b.eCJ.bgx());
            byteArrayOutputStream.write(e.bM(S));
            if (S != null) {
                for (com.pro100svitlo.creditCardNfcReader.iso7816emv.e a : S) {
                    byteArrayOutputStream.write(com.pro100svitlo.creditCardNfcReader.iso7816emv.c.a(a));
                }
            }
        } catch (IOException e) {
            b bVar2 = eGN;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Construct GPO Command:");
            stringBuilder.append(e.getMessage());
            bVar2.g(stringBuilder.toString(), e);
        }
        return bVar.transceive(new com.pro100svitlo.creditCardNfcReader.a.b(CommandEnum.GPO, byteArrayOutputStream.toByteArray(), 0).bhc());
    }
}
