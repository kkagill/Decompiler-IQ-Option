package org.yaml.snakeyaml.b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.yaml.snakeyaml.nodes.NodeId;
import org.yaml.snakeyaml.nodes.h;

/* compiled from: Resolver */
public class a {
    public static final Pattern fMf = Pattern.compile("^(?:yes|Yes|YES|no|No|NO|true|True|TRUE|false|False|FALSE|on|On|ON|off|Off|OFF)$");
    public static final Pattern fMg = Pattern.compile("^([-+]?(\\.[0-9]+|[0-9_]+(\\.[0-9_]*)?)([eE][-+]?[0-9]+)?|[-+]?[0-9][0-9_]*(?::[0-5]?[0-9])+\\.[0-9_]*|[-+]?\\.(?:inf|Inf|INF)|\\.(?:nan|NaN|NAN))$");
    public static final Pattern fMh = Pattern.compile("^(?:[-+]?0b[0-1_]+|[-+]?0[0-7_]+|[-+]?(?:0|[1-9][0-9_]*)|[-+]?0x[0-9a-fA-F_]+|[-+]?[1-9][0-9_]*(?::[0-5]?[0-9])+)$");
    public static final Pattern fMi = Pattern.compile("^(?:<<)$");
    public static final Pattern fMj = Pattern.compile("^(?:~|null|Null|NULL| )$");
    public static final Pattern fMk = Pattern.compile("^$");
    public static final Pattern fMl = Pattern.compile("^(?:[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]|[0-9][0-9][0-9][0-9]-[0-9][0-9]?-[0-9][0-9]?(?:[Tt]|[ \t]+)[0-9][0-9]?:[0-9][0-9]:[0-9][0-9](?:\\.[0-9]*)?(?:[ \t]*(?:Z|[-+][0-9][0-9]?(?::[0-9][0-9])?))?)$");
    public static final Pattern fMm = Pattern.compile("^(?:=)$");
    public static final Pattern fMn = Pattern.compile("^(?:!|&|\\*)$");
    protected Map<Character, List<b>> fMo = new HashMap();

    /* compiled from: Resolver */
    /* renamed from: org.yaml.snakeyaml.b.a$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fKC = new int[NodeId.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = org.yaml.snakeyaml.nodes.NodeId.values();
            r0 = r0.length;
            r0 = new int[r0];
            fKC = r0;
            r0 = fKC;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = org.yaml.snakeyaml.nodes.NodeId.scalar;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = fKC;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = org.yaml.snakeyaml.nodes.NodeId.sequence;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.yaml.snakeyaml.b.a$AnonymousClass1.<clinit>():void");
        }
    }

    /* Access modifiers changed, original: protected */
    public void bVc() {
        a(h.fLz, fMf, "yYnNtTfFoO");
        a(h.fLw, fMh, "-+0123456789");
        a(h.fLx, fMg, "-+0123456789.");
        a(h.fLr, fMi, "<");
        a(h.fLA, fMj, "~nN\u0000");
        a(h.fLA, fMk, null);
        a(h.fLy, fMl, "0123456789");
        a(h.fLq, fMn, "!&*");
    }

    public a() {
        bVc();
    }

    public void a(h hVar, Pattern pattern, String str) {
        if (str == null) {
            List list = (List) this.fMo.get(null);
            if (list == null) {
                list = new ArrayList();
                this.fMo.put(null, list);
            }
            list.add(new b(hVar, pattern));
            return;
        }
        for (char valueOf : str.toCharArray()) {
            Object valueOf2 = Character.valueOf(valueOf);
            if (valueOf2.charValue() == 0) {
                valueOf2 = null;
            }
            List list2 = (List) this.fMo.get(valueOf2);
            if (list2 == null) {
                list2 = new ArrayList();
                this.fMo.put(valueOf2, list2);
            }
            list2.add(new b(hVar, pattern));
        }
    }

    public h a(NodeId nodeId, String str, boolean z) {
        if (nodeId == NodeId.scalar && z) {
            h bUl;
            List list;
            if (str.length() == 0) {
                list = (List) this.fMo.get(Character.valueOf(0));
            } else {
                list = (List) this.fMo.get(Character.valueOf(str.charAt(0)));
            }
            if (list != null) {
                for (b bVar : list) {
                    bUl = bVar.bUl();
                    if (bVar.bVd().matcher(str).matches()) {
                        return bUl;
                    }
                }
            }
            if (this.fMo.containsKey(null)) {
                for (b bVar2 : (List) this.fMo.get(null)) {
                    bUl = bVar2.bUl();
                    if (bVar2.bVd().matcher(str).matches()) {
                        return bUl;
                    }
                }
            }
        }
        int i = AnonymousClass1.fKC[nodeId.ordinal()];
        if (i == 1) {
            return h.fLB;
        }
        if (i != 2) {
            return h.fLD;
        }
        return h.fLC;
    }
}
