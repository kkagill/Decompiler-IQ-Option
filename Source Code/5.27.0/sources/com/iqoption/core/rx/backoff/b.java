package com.iqoption.core.rx.backoff;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/rx/backoff/BackoffStrategy;", "", "()V", "getInterval", "", "attempt", "", "Constant", "Exponential", "Fibonacci", "Linear", "Lcom/iqoption/core/rx/backoff/BackoffStrategy$Linear;", "Lcom/iqoption/core/rx/backoff/BackoffStrategy$Fibonacci;", "Lcom/iqoption/core/rx/backoff/BackoffStrategy$Exponential;", "Lcom/iqoption/core/rx/backoff/BackoffStrategy$Constant;", "core_release"})
/* compiled from: BackoffStrategy.kt */
public abstract class b {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/rx/backoff/BackoffStrategy$Fibonacci;", "Lcom/iqoption/core/rx/backoff/BackoffStrategy;", "delay", "", "(J)V", "nextAttempt", "", "prevDelay", "calculateNext", "getInterval", "attempt", "core_release"})
    /* compiled from: BackoffStrategy.kt */
    public static final class a extends b {
        private int bFA;
        private long bFz;
        private long delay;

        public a() {
            this(0, 1, null);
        }

        public a(long j) {
            super();
            this.delay = j;
            this.bFA = 1;
        }

        public /* synthetic */ a(long j, int i, f fVar) {
            if ((i & 1) != 0) {
                j = e.bFC.get();
            }
            this(j);
        }

        public long fc(int i) {
            if (i != this.bFA) {
                this.bFA = 0;
                while (this.bFA != i) {
                    akm();
                }
            }
            return akm();
        }

        private final long akm() {
            this.bFA++;
            int i = this.bFA;
            long j = this.delay;
            long j2 = this.bFz + j;
            this.bFz = j;
            this.delay = j2;
            return j2;
        }
    }

    public abstract long fc(int i);

    private b() {
    }

    public /* synthetic */ b(f fVar) {
        this();
    }
}
