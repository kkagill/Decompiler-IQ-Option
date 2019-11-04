package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.g.f;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, bng = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "getMatchResult", "()Ljava/util/regex/MatchResult;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"})
/* compiled from: Regex.kt */
final class j implements i {
    private final CharSequence fBE;
    private final g fBM = new b(this);
    private List<String> fBN;
    private final Matcher fBO;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, bng = {"kotlin/text/MatcherMatchResult$groupValues$1", "Lkotlin/collections/AbstractList;", "", "size", "", "getSize", "()I", "get", "index", "kotlin-stdlib"})
    /* compiled from: Regex.kt */
    public static final class a extends kotlin.collections.b<String> {
        final /* synthetic */ j fBP;

        a(j jVar) {
            this.fBP = jVar;
        }

        public final /* bridge */ boolean contains(Object obj) {
            return obj instanceof String ? contains((String) obj) : false;
        }

        public /* bridge */ boolean contains(String str) {
            return super.contains(str);
        }

        public final /* bridge */ int indexOf(Object obj) {
            return obj instanceof String ? indexOf((String) obj) : -1;
        }

        public /* bridge */ int indexOf(String str) {
            return super.indexOf(str);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            return obj instanceof String ? lastIndexOf((String) obj) : -1;
        }

        public /* bridge */ int lastIndexOf(String str) {
            return super.lastIndexOf(str);
        }

        public int getSize() {
            return this.fBP.bQI().groupCount() + 1;
        }

        public String get(int i) {
            String group = this.fBP.bQI().group(i);
            return group != null ? group : "";
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, bng = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "size", "", "getSize", "()I", "get", "index", "name", "", "isEmpty", "", "iterator", "", "kotlin-stdlib"})
    /* compiled from: Regex.kt */
    public static final class b extends kotlin.collections.a<f> implements h {
        final /* synthetic */ j fBP;

        public boolean isEmpty() {
            return false;
        }

        b(j jVar) {
            this.fBP = jVar;
        }

        public boolean a(f fVar) {
            return super.contains(fVar);
        }

        public final boolean contains(Object obj) {
            return obj != null ? obj instanceof f : true ? a((f) obj) : false;
        }

        public int getSize() {
            return this.fBP.bQI().groupCount() + 1;
        }

        public Iterator<f> iterator() {
            return n.f(u.Z(m.F(this)), new MatcherMatchResult$groups$1$iterator$1(this)).iterator();
        }

        public f mM(int i) {
            f b = k.a(this.fBP.bQI(), i);
            if (b.bnT().intValue() < 0) {
                return null;
            }
            String group = this.fBP.bQI().group(i);
            kotlin.jvm.internal.i.e(group, "matchResult.group(index)");
            return new f(group, b);
        }
    }

    public j(Matcher matcher, CharSequence charSequence) {
        kotlin.jvm.internal.i.f(matcher, "matcher");
        kotlin.jvm.internal.i.f(charSequence, "input");
        this.fBO = matcher;
        this.fBE = charSequence;
    }

    public kotlin.text.i.b bQG() {
        return kotlin.text.i.a.a(this);
    }

    private final MatchResult bQI() {
        return this.fBO;
    }

    public List<String> bQF() {
        if (this.fBN == null) {
            this.fBN = new a(this);
        }
        List list = this.fBN;
        if (list == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return list;
    }
}
