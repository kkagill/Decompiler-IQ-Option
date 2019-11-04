package org.yaml.snakeyaml.reader;

import androidx.core.view.InputDeviceCompat;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import org.yaml.snakeyaml.error.Mark;
import org.yaml.snakeyaml.error.YAMLException;

/* compiled from: StreamReader */
public class a {
    private char[] buffer;
    private int column = 0;
    private boolean eof;
    private final Reader fLO;
    private int[] fLP = new int[0];
    private int fLQ = 0;
    private int index = 0;
    private int line = 0;
    private String name = "'reader'";
    private int pointer = 0;

    public static boolean isPrintable(int i) {
        return (i >= 32 && i <= 126) || i == 9 || i == 10 || i == 13 || i == 133 || ((i >= 160 && i <= 55295) || ((i >= 57344 && i <= 65533) || (i >= 65536 && i <= 1114111)));
    }

    public a(Reader reader) {
        this.fLO = reader;
        this.eof = false;
        this.buffer = new char[InputDeviceCompat.SOURCE_GAMEPAD];
    }

    public Mark bUZ() {
        return new Mark(this.name, this.index, this.line, this.column, this.fLP, this.pointer);
    }

    public void bVa() {
        nS(1);
    }

    public void nS(int i) {
        for (int i2 = 0; i2 < i && bVb(); i2++) {
            int[] iArr = this.fLP;
            int i3 = this.pointer;
            this.pointer = i3 + 1;
            int i4 = iArr[i3];
            this.index++;
            if (org.yaml.snakeyaml.scanner.a.fMq.nX(i4) || (i4 == 13 && bVb() && this.fLP[this.pointer] != 10)) {
                this.line++;
                this.column = 0;
            } else if (i4 != 65279) {
                this.column++;
            }
        }
    }

    public int peek() {
        return bVb() ? this.fLP[this.pointer] : 0;
    }

    public int nT(int i) {
        return nW(i) ? this.fLP[this.pointer + i] : 0;
    }

    public String nU(int i) {
        if (i == 0) {
            return "";
        }
        if (nW(i)) {
            return new String(this.fLP, this.pointer, i);
        }
        int[] iArr = this.fLP;
        int i2 = this.pointer;
        return new String(iArr, i2, Math.min(i, this.fLQ - i2));
    }

    public String nV(int i) {
        String nU = nU(i);
        this.pointer += i;
        this.index += i;
        this.column += i;
        return nU;
    }

    private boolean bVb() {
        return nW(0);
    }

    private boolean nW(int i) {
        if (!this.eof && this.pointer + i >= this.fLQ) {
            update();
        }
        return this.pointer + i < this.fLQ;
    }

    private void update() {
        try {
            int read = this.fLO.read(this.buffer, 0, 1024);
            if (read > 0) {
                int i = this.fLQ - this.pointer;
                this.fLP = Arrays.copyOfRange(this.fLP, this.pointer, this.fLQ + read);
                if (Character.isHighSurrogate(this.buffer[read - 1])) {
                    if (this.fLO.read(this.buffer, read, 1) == -1) {
                        this.eof = true;
                    } else {
                        read++;
                    }
                }
                int i2 = i;
                i = 0;
                int i3 = 32;
                while (i < read) {
                    int codePointAt = Character.codePointAt(this.buffer, i);
                    this.fLP[i2] = codePointAt;
                    if (isPrintable(codePointAt)) {
                        i += Character.charCount(codePointAt);
                    } else {
                        i = read;
                        i3 = codePointAt;
                    }
                    i2++;
                }
                this.fLQ = i2;
                this.pointer = 0;
                if (i3 != 32) {
                    throw new ReaderException(this.name, i2 - 1, i3, "special characters are not allowed");
                }
                return;
            }
            this.eof = true;
        } catch (IOException e) {
            throw new YAMLException(e);
        }
    }

    public int bUy() {
        return this.column;
    }

    public int getIndex() {
        return this.index;
    }

    public int bUx() {
        return this.line;
    }
}
