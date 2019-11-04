package org.yaml.snakeyaml.error;

import java.io.Serializable;
import org.yaml.snakeyaml.scanner.a;

public final class Mark implements Serializable {
    private int[] buffer;
    private int column;
    private int index;
    private int line;
    private String name;
    private int pointer;

    public Mark(String str, int i, int i2, int i3, int[] iArr, int i4) {
        this.name = str;
        this.index = i;
        this.line = i2;
        this.column = i3;
        this.buffer = iArr;
        this.pointer = i4;
    }

    private boolean nR(int i) {
        return a.fMs.nX(i);
    }

    public String bA(int i, int i2) {
        String str;
        String str2;
        int i3;
        String str3;
        String str4;
        float f = (float) ((i2 / 2) - 1);
        int i4 = this.pointer;
        do {
            str = " ... ";
            str2 = "";
            if (i4 <= 0 || nR(this.buffer[i4 - 1])) {
                i3 = i4;
                str3 = str2;
                break;
            }
            i4--;
        } while (((float) (this.pointer - i4)) <= f);
        i3 = i4 + 5;
        str3 = str;
        int i5 = this.pointer;
        do {
            int[] iArr = this.buffer;
            if (i5 >= iArr.length || nR(iArr[i5])) {
                str = str2;
                break;
            }
            i5++;
        } while (((float) (i5 - this.pointer)) <= f);
        i5 -= 5;
        StringBuilder stringBuilder = new StringBuilder();
        int i6 = 0;
        while (true) {
            str4 = " ";
            if (i6 >= i) {
                break;
            }
            stringBuilder.append(str4);
            i6++;
        }
        stringBuilder.append(str3);
        for (i6 = i3; i6 < i5; i6++) {
            stringBuilder.appendCodePoint(this.buffer[i6]);
        }
        stringBuilder.append(str);
        stringBuilder.append("\n");
        for (int i7 = 0; i7 < ((this.pointer + i) - i3) + str3.length(); i7++) {
            stringBuilder.append(str4);
        }
        stringBuilder.append("^");
        return stringBuilder.toString();
    }

    public String bUw() {
        return bA(4, 75);
    }

    public String toString() {
        String bUw = bUw();
        StringBuilder stringBuilder = new StringBuilder(" in ");
        stringBuilder.append(this.name);
        stringBuilder.append(", line ");
        stringBuilder.append(this.line + 1);
        stringBuilder.append(", column ");
        stringBuilder.append(this.column + 1);
        stringBuilder.append(":\n");
        stringBuilder.append(bUw);
        return stringBuilder.toString();
    }

    public String getName() {
        return this.name;
    }

    public int bUx() {
        return this.line;
    }

    public int bUy() {
        return this.column;
    }
}
