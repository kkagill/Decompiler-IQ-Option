package org.yaml.snakeyaml.composer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.yaml.snakeyaml.events.Event.ID;
import org.yaml.snakeyaml.events.i;
import org.yaml.snakeyaml.events.j;
import org.yaml.snakeyaml.events.l;
import org.yaml.snakeyaml.nodes.NodeId;
import org.yaml.snakeyaml.nodes.c;
import org.yaml.snakeyaml.nodes.d;
import org.yaml.snakeyaml.nodes.e;
import org.yaml.snakeyaml.nodes.f;
import org.yaml.snakeyaml.nodes.g;
import org.yaml.snakeyaml.nodes.h;

/* compiled from: Composer */
public class a {
    private final org.yaml.snakeyaml.b.a fKb;
    protected final org.yaml.snakeyaml.parser.a fKg;
    private final Map<String, d> fKh = new HashMap();
    private final Set<d> fKi = new HashSet();

    public a(org.yaml.snakeyaml.parser.a aVar, org.yaml.snakeyaml.b.a aVar2) {
        this.fKg = aVar;
        this.fKb = aVar2;
    }

    public d bUn() {
        this.fKg.bUS();
        d b = b(null);
        this.fKg.bUS();
        this.fKh.clear();
        this.fKi.clear();
        return b;
    }

    public d bUo() {
        this.fKg.bUS();
        d bUn = !this.fKg.b(ID.StreamEnd) ? bUn() : null;
        if (this.fKg.b(ID.StreamEnd)) {
            this.fKg.bUS();
            return bUn;
        }
        throw new ComposerException("expected a single document in the stream", bUn.bUC(), "but found another document", this.fKg.bUS().bUC());
    }

    private d b(d dVar) {
        d dVar2;
        if (dVar != null) {
            this.fKi.add(dVar);
        }
        if (this.fKg.b(ID.Alias)) {
            org.yaml.snakeyaml.events.a aVar = (org.yaml.snakeyaml.events.a) this.fKg.bUS();
            String bUF = aVar.bUF();
            if (this.fKh.containsKey(bUF)) {
                dVar2 = (d) this.fKh.get(bUF);
                if (this.fKi.remove(dVar2)) {
                    dVar2.hv(true);
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("found undefined alias ");
                stringBuilder.append(bUF);
                throw new ComposerException(null, null, stringBuilder.toString(), aVar.bUC());
            }
        }
        String bUF2 = ((i) this.fKg.bUR()).bUF();
        dVar2 = this.fKg.b(ID.Scalar) ? nS(bUF2) : this.fKg.b(ID.SequenceStart) ? nT(bUF2) : nU(bUF2);
        this.fKi.remove(dVar);
        return dVar2;
    }

    /* Access modifiers changed, original: protected */
    public d nS(String str) {
        h a;
        boolean z;
        j jVar = (j) this.fKg.bUS();
        String tag = jVar.getTag();
        if (tag == null || tag.equals("!")) {
            a = this.fKb.a(NodeId.scalar, jVar.getValue(), jVar.bUH().bUE());
            z = true;
        } else {
            a = new h(tag);
            z = false;
        }
        f fVar = new f(a, z, jVar.getValue(), jVar.bUC(), jVar.bUD(), jVar.bUG());
        if (str != null) {
            this.fKh.put(str, fVar);
        }
        return fVar;
    }

    /* Access modifiers changed, original: protected */
    public d nT(String str) {
        h a;
        boolean z;
        l lVar = (l) this.fKg.bUS();
        String tag = lVar.getTag();
        if (tag == null || tag.equals("!")) {
            a = this.fKb.a(NodeId.sequence, null, lVar.bUz());
            z = true;
        } else {
            a = new h(tag);
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        d gVar = new g(a, z, arrayList, lVar.bUC(), null, lVar.bUA());
        if (str != null) {
            this.fKh.put(str, gVar);
        }
        while (!this.fKg.b(ID.SequenceEnd)) {
            arrayList.add(b(gVar));
        }
        gVar.a(this.fKg.bUS().bUD());
        return gVar;
    }

    /* Access modifiers changed, original: protected */
    public d nU(String str) {
        h a;
        boolean z;
        org.yaml.snakeyaml.events.h hVar = (org.yaml.snakeyaml.events.h) this.fKg.bUS();
        String tag = hVar.getTag();
        if (tag == null || tag.equals("!")) {
            a = this.fKb.a(NodeId.mapping, null, hVar.bUz());
            z = true;
        } else {
            a = new h(tag);
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        c cVar = new c(a, z, arrayList, hVar.bUC(), null, hVar.bUA());
        if (str != null) {
            this.fKh.put(str, cVar);
        }
        while (!this.fKg.b(ID.MappingEnd)) {
            a(arrayList, cVar);
        }
        cVar.a(this.fKg.bUS().bUD());
        return cVar;
    }

    /* Access modifiers changed, original: protected */
    public void a(List<e> list, c cVar) {
        d a = a(cVar);
        if (a.bUl().equals(h.fLr)) {
            cVar.hu(true);
        }
        list.add(new e(a, b(cVar)));
    }

    /* Access modifiers changed, original: protected */
    public d a(c cVar) {
        return b((d) cVar);
    }

    /* Access modifiers changed, original: protected */
    public d b(c cVar) {
        return b((d) cVar);
    }
}
