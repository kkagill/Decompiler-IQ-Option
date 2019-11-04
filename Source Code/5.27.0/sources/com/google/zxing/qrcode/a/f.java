package com.google.zxing.qrcode.a;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.a;

/* compiled from: QRCode */
public final class f {
    private Mode aiE;
    private ErrorCorrectionLevel aiF;
    private a aiG;
    private int aiH = -1;
    private b aiI;

    public static boolean dk(int i) {
        return i >= 0 && i < 8;
    }

    public b zB() {
        return this.aiI;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(200);
        stringBuilder.append("<<\n");
        stringBuilder.append(" mode: ");
        stringBuilder.append(this.aiE);
        stringBuilder.append("\n ecLevel: ");
        stringBuilder.append(this.aiF);
        stringBuilder.append("\n version: ");
        stringBuilder.append(this.aiG);
        stringBuilder.append("\n maskPattern: ");
        stringBuilder.append(this.aiH);
        if (this.aiI == null) {
            stringBuilder.append("\n matrix: null\n");
        } else {
            stringBuilder.append("\n matrix:\n");
            stringBuilder.append(this.aiI);
        }
        stringBuilder.append(">>\n");
        return stringBuilder.toString();
    }

    public void a(Mode mode) {
        this.aiE = mode;
    }

    public void b(ErrorCorrectionLevel errorCorrectionLevel) {
        this.aiF = errorCorrectionLevel;
    }

    public void a(a aVar) {
        this.aiG = aVar;
    }

    public void dj(int i) {
        this.aiH = i;
    }

    public void j(b bVar) {
        this.aiI = bVar;
    }
}
