package com.neovisionaries.ws.client;

import androidx.core.internal.view.SupportMenu;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* compiled from: WebSocketOutputStream */
class am extends FilterOutputStream {
    public am(OutputStream outputStream) {
        super(outputStream);
    }

    public void write(String str) {
        write(p.kx(str));
    }

    public void G(aj ajVar) {
        H(ajVar);
        I(ajVar);
        J(ajVar);
        byte[] iA = p.iA(4);
        write(iA);
        a(ajVar, iA);
    }

    private void H(aj ajVar) {
        int i = 0;
        int i2 = ((ajVar.bfV() ? 128 : 0) | (ajVar.bfW() ? 64 : 0)) | (ajVar.bfX() ? 32 : 0);
        if (ajVar.bfY()) {
            i = 16;
        }
        write((ajVar.bfZ() & 15) | (i2 | i));
    }

    private void I(aj ajVar) {
        int payloadLength = ajVar.getPayloadLength();
        payloadLength = payloadLength <= 125 ? payloadLength | 128 : payloadLength <= SupportMenu.USER_MASK ? 254 : 255;
        write(payloadLength);
    }

    private void J(aj ajVar) {
        int payloadLength = ajVar.getPayloadLength();
        if (payloadLength > 125) {
            if (payloadLength <= SupportMenu.USER_MASK) {
                write((payloadLength >> 8) & 255);
                write(payloadLength & 255);
                return;
            }
            write(0);
            write(0);
            write(0);
            write(0);
            write((payloadLength >> 24) & 255);
            write((payloadLength >> 16) & 255);
            write((payloadLength >> 8) & 255);
            write(payloadLength & 255);
        }
    }

    private void a(aj ajVar, byte[] bArr) {
        byte[] payload = ajVar.getPayload();
        if (payload != null) {
            for (int i = 0; i < payload.length; i++) {
                write((payload[i] ^ bArr[i % 4]) & 255);
            }
        }
    }
}
