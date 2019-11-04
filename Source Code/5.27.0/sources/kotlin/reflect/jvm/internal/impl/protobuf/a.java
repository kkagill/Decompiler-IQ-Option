package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: AbstractMessageLite */
public abstract class a implements n {
    protected int memoizedHashCode = 0;

    /* compiled from: AbstractMessageLite */
    public static abstract class a<BuilderType extends a> implements kotlin.reflect.jvm.internal.impl.protobuf.n.a {

        /* compiled from: AbstractMessageLite */
        static final class a extends FilterInputStream {
            private int limit;

            a(InputStream inputStream, int i) {
                super(inputStream);
                this.limit = i;
            }

            public int available() {
                return Math.min(super.available(), this.limit);
            }

            public int read() {
                if (this.limit <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.limit--;
                }
                return read;
            }

            public int read(byte[] bArr, int i, int i2) {
                int i3 = this.limit;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.limit -= read;
                }
                return read;
            }

            public long skip(long j) {
                j = super.skip(Math.min(j, (long) this.limit));
                if (j >= 0) {
                    this.limit = (int) (((long) this.limit) - j);
                }
                return j;
            }
        }

        /* renamed from: bzF */
        public abstract BuilderType clone();

        /* renamed from: e */
        public abstract BuilderType f(e eVar, f fVar);

        protected static UninitializedMessageException a(n nVar) {
            return new UninitializedMessageException(nVar);
        }
    }

    public void d(OutputStream outputStream) {
        int bzk = bzk();
        CodedOutputStream b = CodedOutputStream.b(outputStream, CodedOutputStream.md(CodedOutputStream.L(bzk) + bzk));
        b.K(bzk);
        a(b);
        b.flush();
    }

    /* Access modifiers changed, original: 0000 */
    public UninitializedMessageException bKi() {
        return new UninitializedMessageException(this);
    }
}
