package com.google.common.io;

import com.google.common.base.i;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: LineReader */
public final class j {
    private final Readable YF;
    private final CharBuffer YG = e.uZ();
    private final Queue<String> YH = new LinkedList();
    private final h YI = new h() {
        /* Access modifiers changed, original: protected */
        public void M(String str, String str2) {
            j.this.YH.add(str);
        }
    };
    private final char[] buf = this.YG.array();
    private final Reader reader;

    public j(Readable readable) {
        this.YF = (Readable) i.checkNotNull(readable);
        this.reader = readable instanceof Reader ? (Reader) readable : null;
    }

    public String readLine() {
        while (this.YH.peek() == null) {
            int read;
            this.YG.clear();
            Reader reader = this.reader;
            if (reader != null) {
                char[] cArr = this.buf;
                read = reader.read(cArr, 0, cArr.length);
            } else {
                read = this.YF.read(this.YG);
            }
            if (read == -1) {
                this.YI.finish();
                break;
            }
            this.YI.b(this.buf, 0, read);
        }
        return (String) this.YH.poll();
    }
}
