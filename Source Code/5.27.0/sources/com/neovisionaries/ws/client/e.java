package com.neovisionaries.ws.client;

import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: DeflateCompressor */
class e {
    public static byte[] p(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater beQ = beQ();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, beQ);
        deflaterOutputStream.write(bArr, 0, bArr.length);
        deflaterOutputStream.close();
        beQ.end();
        return byteArrayOutputStream.toByteArray();
    }

    private static Deflater beQ() {
        return new Deflater(-1, true);
    }
}
