package com.pro100svitlo.creditCardNfcReader.a;

import com.pro100svitlo.creditCardNfcReader.enums.CommandEnum;

/* compiled from: CommandApdu */
public class b {
    protected int eGY;
    protected int eGZ;
    protected int eHa;
    protected int eHb;
    protected int eHc;
    protected int eHd;
    protected boolean eHe;
    protected byte[] mData;

    public b(CommandEnum commandEnum, byte[] bArr, int i) {
        int i2 = 0;
        this.eGY = 0;
        this.eGZ = 0;
        this.eHa = 0;
        this.eHb = 0;
        this.eHc = 0;
        this.mData = new byte[0];
        this.eHd = 0;
        this.eHe = false;
        this.eGY = commandEnum.getCla();
        this.eGZ = commandEnum.getIns();
        this.eHa = commandEnum.getP1();
        this.eHb = commandEnum.getP2();
        if (bArr != null) {
            i2 = bArr.length;
        }
        this.eHc = i2;
        this.mData = bArr;
        this.eHd = i;
        this.eHe = true;
    }

    public b(CommandEnum commandEnum, int i, int i2, int i3) {
        this.eGY = 0;
        this.eGZ = 0;
        this.eHa = 0;
        this.eHb = 0;
        this.eHc = 0;
        this.mData = new byte[0];
        this.eHd = 0;
        this.eHe = false;
        this.eGY = commandEnum.getCla();
        this.eGZ = commandEnum.getIns();
        this.eHa = i;
        this.eHb = i2;
        this.eHd = i3;
        this.eHe = true;
    }

    public byte[] bhc() {
        byte[] bArr = this.mData;
        int i = 4;
        int length = (bArr == null || bArr.length == 0) ? 4 : bArr.length + 5;
        if (this.eHe) {
            length++;
        }
        bArr = new byte[length];
        bArr[0] = (byte) this.eGY;
        bArr[1] = (byte) this.eGZ;
        bArr[2] = (byte) this.eHa;
        bArr[3] = (byte) this.eHb;
        byte[] bArr2 = this.mData;
        if (!(bArr2 == null || bArr2.length == 0)) {
            bArr[4] = (byte) this.eHc;
            System.arraycopy(bArr2, 0, bArr, 5, bArr2.length);
            i = this.mData.length + 5;
        }
        if (this.eHe) {
            bArr[i] = (byte) (bArr[i] + ((byte) this.eHd));
        }
        return bArr;
    }
}
