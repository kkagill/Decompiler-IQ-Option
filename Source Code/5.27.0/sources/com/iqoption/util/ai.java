package com.iqoption.util;

import android.text.SpannableStringBuilder;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: Spanner */
public final class ai {
    private final Deque<a> Yx = new ArrayDeque();
    private final SpannableStringBuilder bRk = new SpannableStringBuilder();

    /* compiled from: Spanner */
    private static final class a {
        final Object bRl;
        final int start;

        public a(int i, Object obj) {
            this.start = i;
            this.bRl = obj;
        }
    }

    public ai jP(String str) {
        this.bRk.append(str);
        return this;
    }

    public ai O(CharSequence charSequence) {
        this.bRk.append(charSequence);
        return this;
    }

    public ai F(char c) {
        this.bRk.append(c);
        return this;
    }

    public ai cs(Object obj) {
        this.Yx.addLast(new a(this.bRk.length(), obj));
        return this;
    }

    public ai aWX() {
        a aVar = (a) this.Yx.removeLast();
        this.bRk.setSpan(aVar.bRl, aVar.start, this.bRk.length(), 17);
        return this;
    }

    public CharSequence anA() {
        while (!this.Yx.isEmpty()) {
            aWX();
        }
        return this.bRk;
    }
}
