package com.google.common.cache;

/* compiled from: AbstractCache */
public abstract class a<K, V> implements b<K, V> {

    /* compiled from: AbstractCache */
    public interface b {
        void bp(int i);

        void bq(int i);

        void qo();

        void v(long j);

        void w(long j);
    }

    /* compiled from: AbstractCache */
    public static final class a implements b {
        private final f SF = LongAddables.rB();
        private final f SQ = LongAddables.rB();
        private final f Sw = LongAddables.rB();
        private final f Sx = LongAddables.rB();
        private final f Sy = LongAddables.rB();
        private final f Sz = LongAddables.rB();

        public void bp(int i) {
            this.Sw.add((long) i);
        }

        public void bq(int i) {
            this.Sx.add((long) i);
        }

        public void v(long j) {
            this.Sy.increment();
            this.SF.add(j);
        }

        public void w(long j) {
            this.Sz.increment();
            this.SF.add(j);
        }

        public void qo() {
            this.SQ.increment();
        }
    }
}
