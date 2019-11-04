package com.neovisionaries.ws.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: WebSocketFrame */
public class aj {
    private boolean eBr;
    private boolean eBs;
    private boolean eBt;
    private boolean eBu;
    private int eBv;
    private boolean eBw;
    private byte[] eBx;

    public boolean bfV() {
        return this.eBr;
    }

    public aj fO(boolean z) {
        this.eBr = z;
        return this;
    }

    public boolean bfW() {
        return this.eBs;
    }

    public aj fP(boolean z) {
        this.eBs = z;
        return this;
    }

    public boolean bfX() {
        return this.eBt;
    }

    public aj fQ(boolean z) {
        this.eBt = z;
        return this;
    }

    public boolean bfY() {
        return this.eBu;
    }

    public aj fR(boolean z) {
        this.eBu = z;
        return this;
    }

    public int bfZ() {
        return this.eBv;
    }

    public aj iD(int i) {
        this.eBv = i;
        return this;
    }

    public boolean bga() {
        return this.eBv == 0;
    }

    public boolean bgb() {
        return this.eBv == 1;
    }

    public boolean bgc() {
        return this.eBv == 2;
    }

    public boolean bgd() {
        return this.eBv == 8;
    }

    public boolean bge() {
        return this.eBv == 9;
    }

    public boolean bgf() {
        return this.eBv == 10;
    }

    public boolean bgg() {
        int i = this.eBv;
        return 8 <= i && i <= 15;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean bgh() {
        return this.eBw;
    }

    /* Access modifiers changed, original: 0000 */
    public aj fS(boolean z) {
        this.eBw = z;
        return this;
    }

    public int getPayloadLength() {
        byte[] bArr = this.eBx;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public byte[] getPayload() {
        return this.eBx;
    }

    public String bgi() {
        byte[] bArr = this.eBx;
        if (bArr == null) {
            return null;
        }
        return p.s(bArr);
    }

    public aj y(byte[] bArr) {
        if (bArr != null && bArr.length == 0) {
            bArr = null;
        }
        this.eBx = bArr;
        return this;
    }

    public aj kL(String str) {
        if (str == null || str.length() == 0) {
            return y((byte[]) null);
        }
        return y(p.kx(str));
    }

    public aj f(int i, String str) {
        byte[] bArr = new byte[]{(byte) ((i >> 8) & 255), (byte) (i & 255)};
        if (str == null || str.length() == 0) {
            return y(bArr);
        }
        byte[] kx = p.kx(str);
        byte[] bArr2 = new byte[(kx.length + 2)];
        System.arraycopy(bArr, 0, bArr2, 0, 2);
        System.arraycopy(kx, 0, bArr2, 2, kx.length);
        return y(bArr2);
    }

    public int bgj() {
        byte[] bArr = this.eBx;
        if (bArr == null || bArr.length < 2) {
            return 1005;
        }
        return (bArr[1] & 255) | ((bArr[0] & 255) << 8);
    }

    public String getCloseReason() {
        byte[] bArr = this.eBx;
        return (bArr == null || bArr.length < 3) ? null : p.h(bArr, 2, bArr.length - 2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("WebSocketFrame(FIN=");
        String str = "1";
        String str2 = "0";
        stringBuilder.append(this.eBr ? str : str2);
        stringBuilder.append(",RSV1=");
        stringBuilder.append(this.eBs ? str : str2);
        stringBuilder.append(",RSV2=");
        stringBuilder.append(this.eBt ? str : str2);
        stringBuilder.append(",RSV3=");
        if (!this.eBu) {
            str = str2;
        }
        stringBuilder.append(str);
        stringBuilder.append(",Opcode=");
        stringBuilder.append(p.iB(this.eBv));
        stringBuilder.append(",Length=");
        stringBuilder.append(getPayloadLength());
        int i = this.eBv;
        if (i == 1) {
            o(stringBuilder);
        } else if (i == 2) {
            q(stringBuilder);
        } else if (i == 8) {
            p(stringBuilder);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private boolean n(StringBuilder stringBuilder) {
        stringBuilder.append(",Payload=");
        if (this.eBx == null) {
            stringBuilder.append("null");
            return true;
        } else if (!this.eBs) {
            return false;
        } else {
            stringBuilder.append("compressed");
            return true;
        }
    }

    private void o(StringBuilder stringBuilder) {
        if (!n(stringBuilder)) {
            String str = "\"";
            stringBuilder.append(str);
            stringBuilder.append(bgi());
            stringBuilder.append(str);
        }
    }

    private void p(StringBuilder stringBuilder) {
        stringBuilder.append(",CloseCode=");
        stringBuilder.append(bgj());
        stringBuilder.append(",Reason=");
        String closeReason = getCloseReason();
        if (closeReason == null) {
            stringBuilder.append("null");
            return;
        }
        String str = "\"";
        stringBuilder.append(str);
        stringBuilder.append(closeReason);
        stringBuilder.append(str);
    }

    private void q(StringBuilder stringBuilder) {
        if (!n(stringBuilder)) {
            byte[] bArr;
            int i = 0;
            while (true) {
                bArr = this.eBx;
                if (i >= bArr.length) {
                    break;
                }
                stringBuilder.append(String.format("%02X ", new Object[]{Integer.valueOf(bArr[i] & 255)}));
                i++;
            }
            if (bArr.length != 0) {
                stringBuilder.setLength(stringBuilder.length() - 1);
            }
        }
    }

    public static aj bgk() {
        return new aj().iD(0);
    }

    public static aj z(byte[] bArr) {
        return bgk().y(bArr);
    }

    public static aj kM(String str) {
        return new aj().fO(true).iD(1).kL(str);
    }

    public static aj bgl() {
        return new aj().fO(true).iD(8);
    }

    public static aj g(int i, String str) {
        return bgl().f(i, str);
    }

    public static aj bgm() {
        return new aj().fO(true).iD(9);
    }

    public static aj A(byte[] bArr) {
        return bgm().y(bArr);
    }

    public static aj bgn() {
        return new aj().fO(true).iD(10);
    }

    public static aj B(byte[] bArr) {
        return bgn().y(bArr);
    }

    static byte[] a(byte[] bArr, byte[] bArr2) {
        if (!(bArr == null || bArr.length < 4 || bArr2 == null)) {
            for (int i = 0; i < bArr2.length; i++) {
                bArr2[i] = (byte) (bArr2[i] ^ bArr[i % 4]);
            }
        }
        return bArr2;
    }

    static aj a(aj ajVar, s sVar) {
        if (sVar == null) {
            return ajVar;
        }
        if ((!ajVar.bgb() && !ajVar.bgc()) || !ajVar.bfV() || ajVar.bfW()) {
            return ajVar;
        }
        byte[] payload = ajVar.getPayload();
        if (!(payload == null || payload.length == 0)) {
            byte[] a = a(payload, sVar);
            if (payload.length <= a.length) {
                return ajVar;
            }
            ajVar.y(a);
            ajVar.fP(true);
        }
        return ajVar;
    }

    private static byte[] a(byte[] bArr, s sVar) {
        try {
            bArr = sVar.p(bArr);
            return bArr;
        } catch (WebSocketException unused) {
            return bArr;
        }
    }

    static List<aj> a(aj ajVar, int i, s sVar) {
        if (i == 0 || ajVar.getPayloadLength() <= i) {
            return null;
        }
        if (ajVar.bgc() || ajVar.bgb()) {
            ajVar = a(ajVar, sVar);
            if (ajVar.getPayloadLength() <= i) {
                return null;
            }
        } else if (!ajVar.bga()) {
            return null;
        }
        return a(ajVar, i);
    }

    private static List<aj> a(aj ajVar, int i) {
        byte[] payload = ajVar.getPayload();
        boolean bfV = ajVar.bfV();
        ArrayList arrayList = new ArrayList();
        ajVar.fO(false).y(Arrays.copyOf(payload, i));
        arrayList.add(ajVar);
        int i2 = i;
        while (i2 < payload.length) {
            int i3 = i2 + i;
            arrayList.add(z(Arrays.copyOfRange(payload, i2, Math.min(i3, payload.length))));
            i2 = i3;
        }
        if (bfV) {
            ((aj) arrayList.get(arrayList.size() - 1)).fO(true);
        }
        return arrayList;
    }
}
