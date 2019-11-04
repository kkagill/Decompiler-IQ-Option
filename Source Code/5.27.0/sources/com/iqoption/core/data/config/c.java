package com.iqoption.core.data.config;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.d;
import com.iqoption.dto.entity.position.Position;
import io.reactivex.p;
import io.reactivex.t;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.i;
import okhttp3.Request.Builder;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, bng = {"Lcom/iqoption/core/data/config/ApiConfigHosts;", "", "hosts", "", "", "(Ljava/util/List;)V", "current", "", "get", "next", "", "Companion", "core_release"})
/* compiled from: ApiConfigHosts.kt */
public final class c {
    private static final byte[] bbu;
    private static final byte[] bbv;
    private static final String[] bbw = d.Un().Dm();
    private static final Random bbx = new Random();
    public static final a bby = new a();
    private final List<String> aEN;
    private int current;

    @i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0002J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0014\u0010\u001a\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001e"}, bng = {"Lcom/iqoption/core/data/config/ApiConfigHosts$Companion;", "", "()V", "IV", "", "KEY", "RANDOM", "Ljava/util/Random;", "URLS", "", "", "[Ljava/lang/String;", "clearS3", "", "getRandomUrlIndex", "", "exclude", "", "loadDefault", "Lio/reactivex/Single;", "Lcom/iqoption/core/data/config/ApiConfigHosts;", "default", "Lcom/iqoption/core/data/config/ApiConfigData;", "loadFirebase", "Lio/reactivex/Maybe;", "loadS3", "onRecoveryHostsUpdated", "hosts", "", "Message", "core_release"})
    /* compiled from: ApiConfigHosts.kt */
    public static final class a {

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/core/data/config/ApiConfigHosts$Companion$Message;", "", "hosts", "", "", "(Ljava/util/List;)V", "getHosts", "()Ljava/util/List;", "core_release"})
        /* compiled from: ApiConfigHosts.kt */
        public static final class a {
            @SerializedName("addresses")
            private final List<String> aEN;

            public final List<String> MJ() {
                return this.aEN;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/data/config/ApiConfigHosts;", "call"})
        /* compiled from: ApiConfigHosts.kt */
        static final class b<V> implements Callable<T> {
            final /* synthetic */ a bbz;

            b(a aVar) {
                this.bbz = aVar;
            }

            /* renamed from: Vw */
            public final c call() {
                List VD;
                a aVar = this.bbz;
                if (aVar instanceof h) {
                    VD = h.bcs.VD();
                } else {
                    VD = l.listOf(aVar.Va());
                }
                return new c(VD);
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/data/config/ApiConfigHosts;", "call"})
        /* compiled from: ApiConfigHosts.kt */
        static final class c<V> implements Callable<T> {
            public static final c bbA = new c();

            c() {
            }

            /* renamed from: Vw */
            public final c call() {
                List We = com.iqoption.core.data.d.a.bdi.We();
                return (((Collection) We).isEmpty() ^ 1) != 0 ? new c(We) : null;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, bng = {"<anonymous>", "Lcom/iqoption/core/data/config/ApiConfigHosts;", "kotlin.jvm.PlatformType", "call"})
        /* compiled from: ApiConfigHosts.kt */
        static final class d<V> implements Callable<T> {
            public static final d bbB = new d();

            d() {
            }

            /* renamed from: Vw */
            public final c call() {
                List Wf = com.iqoption.core.data.d.a.bdi.Wf();
                return (((Collection) Wf).isEmpty() ^ 1) != 0 ? new c(Wf) : null;
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"com/iqoption/core/data/config/ApiConfigHosts$Companion$loadS3$loadFromS3$1", "Ljava/util/concurrent/Callable;", "", "exclude", "", "", "call", "core_release"})
        /* compiled from: ApiConfigHosts.kt */
        public static final class e implements Callable<String> {
            private Set<Integer> bbC = new LinkedHashSet();

            e() {
            }

            /* renamed from: iH */
            public synchronized String call() {
                int a;
                a = c.bby.j(this.bbC);
                this.bbC.add(Integer.valueOf(a));
                return c.bbw[a];
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, bng = {"<anonymous>", "Lio/reactivex/Single;", "Lcom/iqoption/core/data/config/ApiConfigHosts;", "kotlin.jvm.PlatformType", "url", "", "apply"})
        /* compiled from: ApiConfigHosts.kt */
        static final class f<T, R> implements io.reactivex.b.g<T, t<? extends R>> {
            public static final f bbD = new f();

            f() {
            }

            /* renamed from: fE */
            public final p<c> apply(String str) {
                kotlin.jvm.internal.i.f(str, "url");
                com.iqoption.core.connect.http.c cVar = com.iqoption.core.connect.http.c.baF;
                Builder builder = new Builder().url(str).get();
                kotlin.jvm.internal.i.e(builder, "Request.Builder().url(url).get()");
                return com.iqoption.core.connect.http.c.a(cVar, builder, com.iqoption.core.connect.http.c.baF.UG(), ApiConfigHosts$Companion$loadS3$loadFromS3$2$1.bbE, null, null, 24, null).w(new com.iqoption.core.rx.backoff.a(2, null, 0, null, null, "load-s3-file", 30, null));
            }
        }

        @i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "hosts", "Lcom/iqoption/core/data/config/ApiConfigHosts;", "kotlin.jvm.PlatformType", "accept"})
        /* compiled from: ApiConfigHosts.kt */
        static final class g<T> implements io.reactivex.b.f<c> {
            public static final g bbF = new g();

            g() {
            }

            /* renamed from: b */
            public final void accept(c cVar) {
                com.iqoption.core.data.d.a.bdi.aq(cVar.aEN);
            }
        }

        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        private final int j(Set<Integer> set) {
            int nextInt = c.bbx.nextInt(c.bbw.length);
            while (set.contains(Integer.valueOf(nextInt))) {
                nextInt--;
                if (nextInt < 0) {
                    nextInt = c.bbw.length - 1;
                }
            }
            return nextInt;
        }

        public final void an(List<String> list) {
            kotlin.jvm.internal.i.f(list, "hosts");
            com.iqoption.core.data.d.a.bdi.ap(list);
        }

        public final p<c> a(a aVar) {
            kotlin.jvm.internal.i.f(aVar, Position.CLOSE_REASON_DEFAULT);
            p j = p.j(new b(aVar));
            kotlin.jvm.internal.i.e(j, "Single\n                 … })\n                    }");
            return j;
        }

        public final io.reactivex.i<c> Vt() {
            io.reactivex.i g = io.reactivex.i.g(c.bbA);
            kotlin.jvm.internal.i.e(g, "Maybe\n                  …  }\n                    }");
            return g;
        }

        public final p<c> Vu() {
            io.reactivex.i g = io.reactivex.i.g(d.bbB);
            kotlin.jvm.internal.i.e(g, "Maybe\n                  …  }\n                    }");
            p h = p.j(new e()).q(f.bbD).w(new com.iqoption.core.rx.backoff.a(c.bbw.length, null, 0, null, null, "next-s3-url", 30, null)).h((io.reactivex.b.f) g.bbF);
            kotlin.jvm.internal.i.e(h, "Single\n                 …sts\n                    }");
            p b = g.b((t) h);
            kotlin.jvm.internal.i.e(b, "loadFromCache\n          …switchIfEmpty(loadFromS3)");
            return b;
        }

        public final void Vv() {
            com.iqoption.core.data.d.a.bdi.aq(m.emptyList());
        }
    }

    public c(List<String> list) {
        kotlin.jvm.internal.i.f(list, "hosts");
        this.aEN = list;
        if (this.aEN.isEmpty()) {
            throw new IllegalArgumentException("Hosts is empty");
        }
    }

    public final String Vo() {
        return (String) this.aEN.get(this.current);
    }

    public final boolean next() {
        if (this.current >= this.aEN.size() - 1) {
            return false;
        }
        this.current++;
        int i = this.current;
        return true;
    }

    static {
        String Dj = d.Un().Dj();
        Charset charset = kotlin.text.d.UTF_8;
        String str = "null cannot be cast to non-null type java.lang.String";
        if (Dj != null) {
            byte[] bytes = Dj.getBytes(charset);
            kotlin.jvm.internal.i.e(bytes, "(this as java.lang.String).getBytes(charset)");
            bbu = bytes;
            Dj = d.Un().Dk();
            byte[] bArr = new byte[(Dj.length() / 2)];
            int length = bArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = (i2 + 1) + 1;
                if (Dj != null) {
                    String substring = Dj.substring(i2, i3);
                    kotlin.jvm.internal.i.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    bArr[i] = (byte) Integer.parseInt(substring, b.mL(16));
                    i++;
                    i2 = i3;
                } else {
                    throw new TypeCastException(str);
                }
            }
            bbv = bArr;
            return;
        }
        throw new TypeCastException(str);
    }
}
