package org.yaml.snakeyaml.reader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;

/* compiled from: UnicodeReader */
public class b extends Reader {
    private static final Charset fLR = Charset.forName("UTF-8");
    private static final Charset fLS = Charset.forName("UTF-16BE");
    private static final Charset fLT = Charset.forName("UTF-16LE");
    PushbackInputStream fLU;
    InputStreamReader fLV = null;

    public b(InputStream inputStream) {
        this.fLU = new PushbackInputStream(inputStream, 3);
    }

    /* Access modifiers changed, original: protected */
    public void init() {
        if (this.fLV == null) {
            Charset charset;
            int i;
            byte[] bArr = new byte[3];
            int read = this.fLU.read(bArr, 0, bArr.length);
            if (bArr[0] == (byte) -17 && bArr[1] == (byte) -69 && bArr[2] == (byte) -65) {
                charset = fLR;
                i = read - 3;
            } else {
                if (bArr[0] == (byte) -2 && bArr[1] == (byte) -1) {
                    charset = fLS;
                } else if (bArr[0] == (byte) -1 && bArr[1] == (byte) -2) {
                    charset = fLT;
                } else {
                    charset = fLR;
                    i = read;
                }
                i = read - 2;
            }
            if (i > 0) {
                this.fLU.unread(bArr, read - i, i);
            }
            this.fLV = new InputStreamReader(this.fLU, charset.newDecoder().onUnmappableCharacter(CodingErrorAction.REPORT));
        }
    }

    public void close() {
        init();
        this.fLV.close();
    }

    public int read(char[] cArr, int i, int i2) {
        init();
        return this.fLV.read(cArr, i, i2);
    }
}
