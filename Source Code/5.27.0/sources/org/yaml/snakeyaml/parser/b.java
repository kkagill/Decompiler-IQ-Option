package org.yaml.snakeyaml.parser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.yaml.snakeyaml.DumperOptions.FlowStyle;
import org.yaml.snakeyaml.DumperOptions.ScalarStyle;
import org.yaml.snakeyaml.DumperOptions.Version;
import org.yaml.snakeyaml.error.Mark;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.events.Event;
import org.yaml.snakeyaml.tokens.Token;
import org.yaml.snakeyaml.tokens.Token.ID;

/* compiled from: ParserImpl */
public class b implements a {
    private static final Map<String, String> fLG = new HashMap();
    protected final org.yaml.snakeyaml.scanner.b fLH;
    private Event fLI;
    private final org.yaml.snakeyaml.d.a<c> fLJ;
    private final org.yaml.snakeyaml.d.a<Mark> fLK;
    private c fLL;
    private d fLM;

    /* compiled from: ParserImpl */
    private class a implements c {
        private a() {
        }

        public Event bUW() {
            b.this.fLK.push(b.this.fLH.bVf().bUC());
            return new b().bUW();
        }
    }

    /* compiled from: ParserImpl */
    private class b implements c {
        private b() {
        }

        public Event bUW() {
            Token bVf;
            if (b.this.fLH.a(ID.Key)) {
                bVf = b.this.fLH.bVf();
                if (b.this.fLH.a(ID.Key, ID.Value, ID.BlockEnd)) {
                    b bVar = b.this;
                    bVar.fLL = new c();
                    return b.this.b(bVf.bUD());
                }
                b.this.fLJ.push(new c());
                return b.this.bUV();
            }
            if (b.this.fLH.a(ID.BlockEnd)) {
                bVf = b.this.fLH.bVf();
                org.yaml.snakeyaml.events.g gVar = new org.yaml.snakeyaml.events.g(bVf.bUC(), bVf.bUD());
                b bVar2 = b.this;
                bVar2.fLL = (c) bVar2.fLJ.pop();
                b.this.fLK.pop();
                return gVar;
            }
            bVf = b.this.fLH.bVe();
            Mark mark = (Mark) b.this.fLK.pop();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected <block end>, but found '");
            stringBuilder.append(bVf.bVZ());
            stringBuilder.append("'");
            throw new ParserException("while parsing a block mapping", mark, stringBuilder.toString(), bVf.bUC());
        }
    }

    /* compiled from: ParserImpl */
    private class c implements c {
        private c() {
        }

        public Event bUW() {
            if (b.this.fLH.a(ID.Value)) {
                Token bVf = b.this.fLH.bVf();
                if (b.this.fLH.a(ID.Key, ID.Value, ID.BlockEnd)) {
                    b bVar = b.this;
                    bVar.fLL = new b();
                    return b.this.b(bVf.bUD());
                }
                b.this.fLJ.push(new b());
                return b.this.bUV();
            }
            b bVar2 = b.this;
            bVar2.fLL = new b();
            return b.this.b(b.this.fLH.bVe().bUC());
        }
    }

    /* compiled from: ParserImpl */
    private class d implements c {
        private d() {
        }

        public Event bUW() {
            return b.this.r(true, false);
        }
    }

    /* compiled from: ParserImpl */
    private class e implements c {
        private e() {
        }

        public Event bUW() {
            if (b.this.fLH.a(ID.BlockEntry)) {
                org.yaml.snakeyaml.tokens.d dVar = (org.yaml.snakeyaml.tokens.d) b.this.fLH.bVf();
                if (b.this.fLH.a(ID.BlockEntry, ID.BlockEnd)) {
                    b bVar = b.this;
                    bVar.fLL = new e();
                    return b.this.b(dVar.bUD());
                }
                b.this.fLJ.push(new e());
                return new d().bUW();
            }
            Token bVf;
            if (b.this.fLH.a(ID.BlockEnd)) {
                bVf = b.this.fLH.bVf();
                org.yaml.snakeyaml.events.k kVar = new org.yaml.snakeyaml.events.k(bVf.bUC(), bVf.bUD());
                b bVar2 = b.this;
                bVar2.fLL = (c) bVar2.fLJ.pop();
                b.this.fLK.pop();
                return kVar;
            }
            bVf = b.this.fLH.bVe();
            Mark mark = (Mark) b.this.fLK.pop();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected <block end>, but found '");
            stringBuilder.append(bVf.bVZ());
            stringBuilder.append("'");
            throw new ParserException("while parsing a block collection", mark, stringBuilder.toString(), bVf.bUC());
        }
    }

    /* compiled from: ParserImpl */
    private class f implements c {
        private f() {
        }

        public Event bUW() {
            b.this.fLK.push(b.this.fLH.bVf().bUC());
            return new e().bUW();
        }
    }

    /* compiled from: ParserImpl */
    private class g implements c {
        private g() {
        }

        public Event bUW() {
            if (!b.this.fLH.a(ID.Directive, ID.DocumentStart, ID.DocumentEnd, ID.StreamEnd)) {
                return new d().bUW();
            }
            b bVar = b.this;
            Event a = bVar.b(bVar.fLH.bVe().bUC());
            b bVar2 = b.this;
            bVar2.fLL = (c) bVar2.fLJ.pop();
            return a;
        }
    }

    /* compiled from: ParserImpl */
    private class h implements c {
        private h() {
        }

        public Event bUW() {
            Mark bUD;
            Mark bUC = b.this.fLH.bVe().bUC();
            boolean z = true;
            if (b.this.fLH.a(ID.DocumentEnd)) {
                bUD = b.this.fLH.bVf().bUD();
            } else {
                bUD = bUC;
                z = false;
            }
            org.yaml.snakeyaml.events.d dVar = new org.yaml.snakeyaml.events.d(bUC, bUD, z);
            b bVar = b.this;
            bVar.fLL = new i();
            return dVar;
        }
    }

    /* compiled from: ParserImpl */
    private class i implements c {
        private i() {
        }

        public Event bUW() {
            while (true) {
                if (!b.this.fLH.a(ID.DocumentEnd)) {
                    break;
                }
                b.this.fLH.bVf();
            }
            StringBuilder stringBuilder;
            if (b.this.fLH.a(ID.StreamEnd)) {
                org.yaml.snakeyaml.tokens.q qVar = (org.yaml.snakeyaml.tokens.q) b.this.fLH.bVf();
                org.yaml.snakeyaml.events.m mVar = new org.yaml.snakeyaml.events.m(qVar.bUC(), qVar.bUD());
                if (!b.this.fLJ.isEmpty()) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected end of stream. States left: ");
                    stringBuilder.append(b.this.fLJ);
                    throw new YAMLException(stringBuilder.toString());
                } else if (b.this.fLK.isEmpty()) {
                    b.this.fLL = null;
                    return mVar;
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected end of stream. Marks left: ");
                    stringBuilder.append(b.this.fLK);
                    throw new YAMLException(stringBuilder.toString());
                }
            }
            Mark bUC = b.this.fLH.bVe().bUC();
            d b = b.this.bUT();
            if (b.this.fLH.a(ID.DocumentStart)) {
                Event eVar = new org.yaml.snakeyaml.events.e(bUC, b.this.fLH.bVf().bUD(), true, b.bUX(), b.bUY());
                b.this.fLJ.push(new h());
                b bVar = b.this;
                bVar.fLL = new g();
                return eVar;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("expected '<document start>', but found '");
            stringBuilder.append(b.this.fLH.bVe().bVZ());
            stringBuilder.append("'");
            throw new ParserException(null, null, stringBuilder.toString(), b.this.fLH.bVe().bUC());
        }
    }

    /* compiled from: ParserImpl */
    private class j implements c {
        private j() {
        }

        public Event bUW() {
            b bVar = b.this;
            bVar.fLL = new l(false);
            bVar = b.this;
            return bVar.b(bVar.fLH.bVe().bUC());
        }
    }

    /* compiled from: ParserImpl */
    private class k implements c {
        private k() {
        }

        public Event bUW() {
            b.this.fLK.push(b.this.fLH.bVf().bUC());
            return new l(true).bUW();
        }
    }

    /* compiled from: ParserImpl */
    private class l implements c {
        private boolean eNE = false;

        public l(boolean z) {
            this.eNE = z;
        }

        public Event bUW() {
            Token bVe;
            if (!b.this.fLH.a(ID.FlowMappingEnd)) {
                if (!this.eNE) {
                    if (b.this.fLH.a(ID.FlowEntry)) {
                        b.this.fLH.bVf();
                    } else {
                        bVe = b.this.fLH.bVe();
                        Mark mark = (Mark) b.this.fLK.pop();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("expected ',' or '}', but got ");
                        stringBuilder.append(bVe.bVZ());
                        throw new ParserException("while parsing a flow mapping", mark, stringBuilder.toString(), bVe.bUC());
                    }
                }
                if (b.this.fLH.a(ID.Key)) {
                    bVe = b.this.fLH.bVf();
                    if (b.this.fLH.a(ID.Value, ID.FlowEntry, ID.FlowMappingEnd)) {
                        b bVar = b.this;
                        bVar.fLL = new m();
                        return b.this.b(bVe.bUD());
                    }
                    b.this.fLJ.push(new m());
                    return b.this.bUU();
                }
                if (!b.this.fLH.a(ID.FlowMappingEnd)) {
                    b.this.fLJ.push(new j());
                    return b.this.bUU();
                }
            }
            bVe = b.this.fLH.bVf();
            org.yaml.snakeyaml.events.g gVar = new org.yaml.snakeyaml.events.g(bVe.bUC(), bVe.bUD());
            b bVar2 = b.this;
            bVar2.fLL = (c) bVar2.fLJ.pop();
            b.this.fLK.pop();
            return gVar;
        }
    }

    /* compiled from: ParserImpl */
    private class m implements c {
        private m() {
        }

        public Event bUW() {
            if (b.this.fLH.a(ID.Value)) {
                Token bVf = b.this.fLH.bVf();
                if (b.this.fLH.a(ID.FlowEntry, ID.FlowMappingEnd)) {
                    b bVar = b.this;
                    bVar.fLL = new l(false);
                    return b.this.b(bVf.bUD());
                }
                b.this.fLJ.push(new l(false));
                return b.this.bUU();
            }
            b bVar2 = b.this;
            bVar2.fLL = new l(false);
            return b.this.b(b.this.fLH.bVe().bUC());
        }
    }

    /* compiled from: ParserImpl */
    private class n implements c {
        private boolean eNE = false;

        public n(boolean z) {
            this.eNE = z;
        }

        public Event bUW() {
            Token bVe;
            b bVar;
            if (!b.this.fLH.a(ID.FlowSequenceEnd)) {
                if (!this.eNE) {
                    if (b.this.fLH.a(ID.FlowEntry)) {
                        b.this.fLH.bVf();
                    } else {
                        bVe = b.this.fLH.bVe();
                        Mark mark = (Mark) b.this.fLK.pop();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("expected ',' or ']', but got ");
                        stringBuilder.append(bVe.bVZ());
                        throw new ParserException("while parsing a flow sequence", mark, stringBuilder.toString(), bVe.bUC());
                    }
                }
                if (b.this.fLH.a(ID.Key)) {
                    bVe = b.this.fLH.bVe();
                    org.yaml.snakeyaml.events.h hVar = new org.yaml.snakeyaml.events.h(null, null, true, bVe.bUC(), bVe.bUD(), FlowStyle.FLOW);
                    bVar = b.this;
                    bVar.fLL = new p();
                    return hVar;
                }
                if (!b.this.fLH.a(ID.FlowSequenceEnd)) {
                    b.this.fLJ.push(new n(false));
                    return b.this.bUU();
                }
            }
            bVe = b.this.fLH.bVf();
            org.yaml.snakeyaml.events.k kVar = new org.yaml.snakeyaml.events.k(bVe.bUC(), bVe.bUD());
            bVar = b.this;
            bVar.fLL = (c) bVar.fLJ.pop();
            b.this.fLK.pop();
            return kVar;
        }
    }

    /* compiled from: ParserImpl */
    private class o implements c {
        private o() {
        }

        public Event bUW() {
            b bVar = b.this;
            bVar.fLL = new n(false);
            Token bVe = b.this.fLH.bVe();
            return new org.yaml.snakeyaml.events.g(bVe.bUC(), bVe.bUD());
        }
    }

    /* compiled from: ParserImpl */
    private class p implements c {
        private p() {
        }

        public Event bUW() {
            Token bVf = b.this.fLH.bVf();
            if (b.this.fLH.a(ID.Value, ID.FlowEntry, ID.FlowSequenceEnd)) {
                b bVar = b.this;
                bVar.fLL = new q();
                return b.this.b(bVf.bUD());
            }
            b.this.fLJ.push(new q());
            return b.this.bUU();
        }
    }

    /* compiled from: ParserImpl */
    private class q implements c {
        private q() {
        }

        public Event bUW() {
            if (b.this.fLH.a(ID.Value)) {
                Token bVf = b.this.fLH.bVf();
                if (b.this.fLH.a(ID.FlowEntry, ID.FlowSequenceEnd)) {
                    b bVar = b.this;
                    bVar.fLL = new o();
                    return b.this.b(bVf.bUD());
                }
                b.this.fLJ.push(new o());
                return b.this.bUU();
            }
            b bVar2 = b.this;
            bVar2.fLL = new o();
            return b.this.b(b.this.fLH.bVe().bUC());
        }
    }

    /* compiled from: ParserImpl */
    private class r implements c {
        private r() {
        }

        public Event bUW() {
            b.this.fLK.push(b.this.fLH.bVf().bUC());
            return new n(true).bUW();
        }
    }

    /* compiled from: ParserImpl */
    private class s implements c {
        private s() {
        }

        public Event bUW() {
            if (b.this.fLH.a(ID.Directive, ID.DocumentStart, ID.StreamEnd)) {
                return new i().bUW();
            }
            b.this.fLM = new d(null, b.fLG);
            Mark bUC = b.this.fLH.bVe().bUC();
            org.yaml.snakeyaml.events.e eVar = new org.yaml.snakeyaml.events.e(bUC, bUC, false, null, null);
            b.this.fLJ.push(new h());
            b bVar = b.this;
            bVar.fLL = new d();
            return eVar;
        }
    }

    /* compiled from: ParserImpl */
    private class t implements c {
        private t() {
        }

        public Event bUW() {
            Token bVf;
            if (b.this.fLH.a(ID.BlockEntry)) {
                bVf = b.this.fLH.bVf();
                if (b.this.fLH.a(ID.BlockEntry, ID.Key, ID.Value, ID.BlockEnd)) {
                    b bVar = b.this;
                    bVar.fLL = new t();
                    return b.this.b(bVf.bUD());
                }
                b.this.fLJ.push(new t());
                return new d().bUW();
            }
            bVf = b.this.fLH.bVe();
            org.yaml.snakeyaml.events.k kVar = new org.yaml.snakeyaml.events.k(bVf.bUC(), bVf.bUD());
            b bVar2 = b.this;
            bVar2.fLL = (c) bVar2.fLJ.pop();
            return kVar;
        }
    }

    /* compiled from: ParserImpl */
    private class u implements c {
        private u() {
        }

        public Event bUW() {
            org.yaml.snakeyaml.tokens.r rVar = (org.yaml.snakeyaml.tokens.r) b.this.fLH.bVf();
            org.yaml.snakeyaml.events.n nVar = new org.yaml.snakeyaml.events.n(rVar.bUC(), rVar.bUD());
            b bVar = b.this;
            bVar.fLL = new s();
            return nVar;
        }
    }

    static {
        String str = "!";
        fLG.put(str, str);
        fLG.put("!!", "tag:yaml.org,2002:");
    }

    public b(org.yaml.snakeyaml.reader.a aVar) {
        this(new org.yaml.snakeyaml.scanner.c(aVar));
    }

    public b(org.yaml.snakeyaml.scanner.b bVar) {
        this.fLH = bVar;
        this.fLI = null;
        this.fLM = new d(null, new HashMap(fLG));
        this.fLJ = new org.yaml.snakeyaml.d.a(100);
        this.fLK = new org.yaml.snakeyaml.d.a(10);
        this.fLL = new u();
    }

    public boolean b(Event.ID id) {
        bUR();
        Event event = this.fLI;
        return event != null && event.a(id);
    }

    public Event bUR() {
        if (this.fLI == null) {
            c cVar = this.fLL;
            if (cVar != null) {
                this.fLI = cVar.bUW();
            }
        }
        return this.fLI;
    }

    public Event bUS() {
        bUR();
        Event event = this.fLI;
        this.fLI = null;
        return event;
    }

    private d bUT() {
        HashMap hashMap = new HashMap();
        Version version = null;
        while (true) {
            if (this.fLH.a(ID.Directive)) {
                org.yaml.snakeyaml.tokens.g gVar = (org.yaml.snakeyaml.tokens.g) this.fLH.bVf();
                if (gVar.getName().equals("YAML")) {
                    if (version == null) {
                        List bUK = gVar.bUK();
                        if (((Integer) bUK.get(0)).intValue() != 1) {
                            throw new ParserException(null, null, "found incompatible YAML document (version 1.* is required)", gVar.bUC());
                        } else if (((Integer) bUK.get(1)).intValue() != 0) {
                            version = Version.V1_1;
                        } else {
                            version = Version.V1_0;
                        }
                    } else {
                        throw new ParserException(null, null, "found duplicate YAML directive", gVar.bUC());
                    }
                } else if (gVar.getName().equals("TAG")) {
                    List bUK2 = gVar.bUK();
                    String str = (String) bUK2.get(0);
                    String str2 = (String) bUK2.get(1);
                    if (hashMap.containsKey(str)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("duplicate tag handle ");
                        stringBuilder.append(str);
                        throw new ParserException(null, null, stringBuilder.toString(), gVar.bUC());
                    }
                    hashMap.put(str, str2);
                } else {
                    continue;
                }
            } else {
                if (!(version == null && hashMap.isEmpty())) {
                    for (String str3 : fLG.keySet()) {
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, fLG.get(str3));
                        }
                    }
                    this.fLM = new d(version, hashMap);
                }
                return this.fLM;
            }
        }
    }

    private Event bUU() {
        return r(false, false);
    }

    private Event bUV() {
        return r(true, true);
    }

    private Event r(boolean z, boolean z2) {
        if (this.fLH.a(ID.Alias)) {
            org.yaml.snakeyaml.tokens.a aVar = (org.yaml.snakeyaml.tokens.a) this.fLH.bVf();
            org.yaml.snakeyaml.events.a aVar2 = new org.yaml.snakeyaml.events.a(aVar.getValue(), aVar.bUC(), aVar.bUD());
            this.fLL = (c) this.fLJ.pop();
            return aVar2;
        }
        Mark bUC;
        Mark bUD;
        String value;
        Mark bUC2;
        String str;
        org.yaml.snakeyaml.tokens.t tVar;
        String str2;
        Mark bUC3;
        Mark mark;
        Event lVar;
        if (this.fLH.a(ID.Anchor)) {
            Mark bUD2;
            org.yaml.snakeyaml.tokens.t bWc;
            org.yaml.snakeyaml.tokens.b bVar = (org.yaml.snakeyaml.tokens.b) this.fLH.bVf();
            bUC = bVar.bUC();
            bUD = bVar.bUD();
            value = bVar.getValue();
            if (this.fLH.a(ID.Tag)) {
                org.yaml.snakeyaml.tokens.s sVar = (org.yaml.snakeyaml.tokens.s) this.fLH.bVf();
                bUC2 = sVar.bUC();
                bUD2 = sVar.bUD();
                bWc = sVar.bWc();
            } else {
                bUC2 = null;
                bUD2 = bUD;
                bWc = bUC2;
            }
            str = value;
            tVar = bWc;
            bUD = bUD2;
        } else {
            if (this.fLH.a(ID.Tag)) {
                org.yaml.snakeyaml.tokens.s sVar2 = (org.yaml.snakeyaml.tokens.s) this.fLH.bVf();
                bUC = sVar2.bUC();
                bUD = sVar2.bUD();
                tVar = sVar2.bWc();
                if (this.fLH.a(ID.Anchor)) {
                    org.yaml.snakeyaml.tokens.b bVar2 = (org.yaml.snakeyaml.tokens.b) this.fLH.bVf();
                    bUC2 = bVar2.bUD();
                    str = bVar2.getValue();
                    bUD = bUC2;
                } else {
                    str = null;
                }
                bUC2 = bUC;
            } else {
                tVar = null;
                bUC = tVar;
                bUD = bUC;
                bUC2 = bUD;
                str = bUC2;
            }
        }
        if (tVar != null) {
            String bWd = tVar.bWd();
            value = tVar.bWe();
            if (bWd != null) {
                if (this.fLM.bUY().containsKey(bWd)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String) this.fLM.bUY().get(bWd));
                    stringBuilder.append(value);
                    value = stringBuilder.toString();
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("found undefined tag handle ");
                    stringBuilder2.append(bWd);
                    throw new ParserException("while parsing a node", bUC, stringBuilder2.toString(), bUC2);
                }
            }
            str2 = value;
        } else {
            str2 = null;
        }
        if (bUC == null) {
            bUC3 = this.fLH.bVe().bUC();
            mark = bUC3;
        } else {
            bUC3 = bUC;
            mark = bUD;
        }
        value = "!";
        boolean z3 = str2 == null || str2.equals(value);
        if (z2) {
            if (this.fLH.a(ID.BlockEntry)) {
                lVar = new org.yaml.snakeyaml.events.l(str, str2, z3, bUC3, this.fLH.bVe().bUD(), FlowStyle.BLOCK);
                this.fLL = new t();
                return lVar;
            }
        }
        if (this.fLH.a(ID.Scalar)) {
            org.yaml.snakeyaml.events.f fVar;
            org.yaml.snakeyaml.tokens.p pVar = (org.yaml.snakeyaml.tokens.p) this.fLH.bVf();
            mark = pVar.bUD();
            if ((pVar.bWa() && str2 == null) || value.equals(str2)) {
                fVar = new org.yaml.snakeyaml.events.f(true, false);
            } else if (str2 == null) {
                fVar = new org.yaml.snakeyaml.events.f(false, true);
            } else {
                fVar = new org.yaml.snakeyaml.events.f(false, false);
            }
            lVar = new org.yaml.snakeyaml.events.j(str, str2, fVar, pVar.getValue(), bUC3, mark, pVar.bWb());
            this.fLL = (c) this.fLJ.pop();
        } else {
            if (this.fLH.a(ID.FlowSequenceStart)) {
                lVar = new org.yaml.snakeyaml.events.l(str, str2, z3, bUC3, this.fLH.bVe().bUD(), FlowStyle.FLOW);
                this.fLL = new r();
                return lVar;
            }
            if (this.fLH.a(ID.FlowMappingStart)) {
                lVar = new org.yaml.snakeyaml.events.h(str, str2, z3, bUC3, this.fLH.bVe().bUD(), FlowStyle.FLOW);
                this.fLL = new k();
                return lVar;
            }
            if (z) {
                if (this.fLH.a(ID.BlockSequenceStart)) {
                    lVar = new org.yaml.snakeyaml.events.l(str, str2, z3, bUC3, this.fLH.bVe().bUC(), FlowStyle.BLOCK);
                    this.fLL = new f();
                    return lVar;
                }
            }
            if (z) {
                if (this.fLH.a(ID.BlockMappingStart)) {
                    lVar = new org.yaml.snakeyaml.events.h(str, str2, z3, bUC3, this.fLH.bVe().bUC(), FlowStyle.BLOCK);
                    this.fLL = new a();
                    return lVar;
                }
            }
            if (str == null && str2 == null) {
                value = z ? "block" : "flow";
                Token bVe = this.fLH.bVe();
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("while parsing a ");
                stringBuilder3.append(value);
                stringBuilder3.append(" node");
                value = stringBuilder3.toString();
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append("expected the node content, but found '");
                stringBuilder3.append(bVe.bVZ());
                stringBuilder3.append("'");
                throw new ParserException(value, bUC3, stringBuilder3.toString(), bVe.bUC());
            }
            lVar = new org.yaml.snakeyaml.events.j(str, str2, new org.yaml.snakeyaml.events.f(z3, false), "", bUC3, mark, ScalarStyle.PLAIN);
            this.fLL = (c) this.fLJ.pop();
        }
        return r1;
    }

    private Event b(Mark mark) {
        return new org.yaml.snakeyaml.events.j(null, null, new org.yaml.snakeyaml.events.f(true, false), "", mark, mark, ScalarStyle.PLAIN);
    }
}
