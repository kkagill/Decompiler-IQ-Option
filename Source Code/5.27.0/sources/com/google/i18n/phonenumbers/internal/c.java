package com.google.i18n.phonenumbers.internal;

import java.util.LinkedHashMap;
import java.util.regex.Pattern;

/* compiled from: RegexCache */
public class c {
    private a<String, Pattern> agg;

    /* compiled from: RegexCache */
    private static class a<K, V> {
        private LinkedHashMap<K, V> map;
        private int size;

        public a(int i) {
            this.size = i;
            this.map = new RegexCache$LRUCache$1(this, ((i * 4) / 3) + 1, 0.75f, true);
        }

        public synchronized V get(K k) {
            return this.map.get(k);
        }

        public synchronized void put(K k, V v) {
            this.map.put(k, v);
        }
    }

    public c(int i) {
        this.agg = new a(i);
    }

    public Pattern cR(String str) {
        Pattern pattern = (Pattern) this.agg.get(str);
        if (pattern != null) {
            return pattern;
        }
        pattern = Pattern.compile(str);
        this.agg.put(str, pattern);
        return pattern;
    }
}
