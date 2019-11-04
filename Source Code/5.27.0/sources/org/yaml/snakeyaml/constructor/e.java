package org.yaml.snakeyaml.constructor;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.yaml.snakeyaml.error.Mark;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.nodes.NodeId;

/* compiled from: SafeConstructor */
public class e extends b {
    private static final Pattern fKA = Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)(?:(?:[Tt]|[ \t]+)([0-9][0-9]?):([0-9][0-9]):([0-9][0-9])(?:\\.([0-9]*))?(?:[ \t]*(?:Z|([-+][0-9][0-9]?)(?::([0-9][0-9])?)?))?)?$");
    private static final Pattern fKB = Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)$");
    public static final a fKy = new a();
    private static final Map<String, Boolean> fKz = new HashMap();

    /* compiled from: SafeConstructor */
    /* renamed from: org.yaml.snakeyaml.constructor.e$1 */
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
            r1 = org.yaml.snakeyaml.nodes.NodeId.mapping;	 Catch:{ NoSuchFieldError -> 0x0014 }
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
            throw new UnsupportedOperationException("Method not decompiled: org.yaml.snakeyaml.constructor.e$AnonymousClass1.<clinit>():void");
        }
    }

    /* compiled from: SafeConstructor */
    public class f implements c {
        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            org.yaml.snakeyaml.nodes.c cVar = (org.yaml.snakeyaml.nodes.c) dVar;
            if (dVar.bUM()) {
                return e.this.nQ(cVar.bUK().size());
            }
            return e.this.e(cVar);
        }

        public void a(org.yaml.snakeyaml.nodes.d dVar, Object obj) {
            if (dVar.bUM()) {
                e.this.a((org.yaml.snakeyaml.nodes.c) dVar, (Map) obj);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected recursive mapping structure. Node: ");
            stringBuilder.append(dVar);
            throw new YAMLException(stringBuilder.toString());
        }
    }

    /* compiled from: SafeConstructor */
    public class j implements c {
        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            org.yaml.snakeyaml.nodes.g gVar = (org.yaml.snakeyaml.nodes.g) dVar;
            if (dVar.bUM()) {
                return e.this.a(gVar);
            }
            return e.this.b(gVar);
        }

        public void a(org.yaml.snakeyaml.nodes.d dVar, Object obj) {
            if (dVar.bUM()) {
                e.this.a((org.yaml.snakeyaml.nodes.g) dVar, (Collection) (List) obj);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected recursive sequence structure. Node: ");
            stringBuilder.append(dVar);
            throw new YAMLException(stringBuilder.toString());
        }
    }

    /* compiled from: SafeConstructor */
    public class k implements c {
        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            if (!dVar.bUM()) {
                return e.this.d((org.yaml.snakeyaml.nodes.c) dVar);
            }
            return e.this.fKn.containsKey(dVar) ? e.this.fKn.get(dVar) : e.this.nP(((org.yaml.snakeyaml.nodes.c) dVar).bUK().size());
        }

        public void a(org.yaml.snakeyaml.nodes.d dVar, Object obj) {
            if (dVar.bUM()) {
                e.this.a((org.yaml.snakeyaml.nodes.c) dVar, (Set) obj);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected recursive set structure. Node: ");
            stringBuilder.append(dVar);
            throw new YAMLException(stringBuilder.toString());
        }
    }

    /* compiled from: SafeConstructor */
    public static final class a extends a {
        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("could not determine a constructor for the tag ");
            stringBuilder.append(dVar.bUl());
            throw new ConstructorException(null, null, stringBuilder.toString(), dVar.bUC());
        }
    }

    /* compiled from: SafeConstructor */
    public class b extends a {
        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            return org.yaml.snakeyaml.a.a.a.a.e(e.this.a((org.yaml.snakeyaml.nodes.f) dVar).toString().replaceAll("\\s", "").toCharArray());
        }
    }

    /* compiled from: SafeConstructor */
    public class c extends a {
        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            return e.fKz.get(e.this.a((org.yaml.snakeyaml.nodes.f) dVar).toLowerCase());
        }
    }

    /* compiled from: SafeConstructor */
    public class d extends a {
        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            int i;
            String replaceAll = e.this.a((org.yaml.snakeyaml.nodes.f) dVar).toString().replaceAll("_", "");
            int i2 = 0;
            char charAt = replaceAll.charAt(0);
            if (charAt == '-') {
                replaceAll = replaceAll.substring(1);
                i = -1;
            } else {
                if (charAt == '+') {
                    replaceAll = replaceAll.substring(1);
                }
                i = 1;
            }
            String toLowerCase = replaceAll.toLowerCase();
            if (".inf".equals(toLowerCase)) {
                return Double.valueOf(i == -1 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            } else if (".nan".equals(toLowerCase)) {
                return Double.valueOf(Double.NaN);
            } else {
                double d;
                if (replaceAll.indexOf(58) != -1) {
                    String[] split = replaceAll.split(":");
                    double d2 = 0.0d;
                    int length = split.length;
                    int i3 = 1;
                    while (i2 < length) {
                        double parseDouble = Double.parseDouble(split[(length - i2) - 1]);
                        double d3 = (double) i3;
                        Double.isNaN(d3);
                        d2 += parseDouble * d3;
                        i3 *= 60;
                        i2++;
                    }
                    d = (double) i;
                    Double.isNaN(d);
                    return Double.valueOf(d * d2);
                }
                double doubleValue = Double.valueOf(replaceAll).doubleValue();
                d = (double) i;
                Double.isNaN(d);
                return Double.valueOf(doubleValue * d);
            }
        }
    }

    /* compiled from: SafeConstructor */
    public class e extends a {
        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            int i;
            String replaceAll = e.this.a((org.yaml.snakeyaml.nodes.f) dVar).toString().replaceAll("_", "");
            int i2 = 0;
            char charAt = replaceAll.charAt(0);
            if (charAt == '-') {
                replaceAll = replaceAll.substring(1);
                i = -1;
            } else {
                if (charAt == '+') {
                    replaceAll = replaceAll.substring(1);
                }
                i = 1;
            }
            String str = "0";
            if (str.equals(replaceAll)) {
                return Integer.valueOf(0);
            }
            int i3 = 2;
            if (replaceAll.startsWith("0b")) {
                replaceAll = replaceAll.substring(2);
            } else if (replaceAll.startsWith("0x")) {
                replaceAll = replaceAll.substring(2);
                i3 = 16;
            } else if (replaceAll.startsWith(str)) {
                replaceAll = replaceAll.substring(1);
                i3 = 8;
            } else if (replaceAll.indexOf(58) == -1) {
                return e.this.a(i, replaceAll, 10);
            } else {
                String[] split = replaceAll.split(":");
                int length = split.length;
                int i4 = 0;
                i3 = 1;
                while (i2 < length) {
                    i4 = (int) (((long) i4) + (Long.parseLong(split[(length - i2) - 1]) * ((long) i3)));
                    i3 *= 60;
                    i2++;
                }
                return e.this.a(i, String.valueOf(i4), 10);
            }
            return e.this.a(i, replaceAll, i3);
        }
    }

    /* compiled from: SafeConstructor */
    public class g extends a {
        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            if (dVar != null) {
                e.this.a((org.yaml.snakeyaml.nodes.f) dVar);
            }
            return null;
        }
    }

    /* compiled from: SafeConstructor */
    public class h extends a {
        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = "while constructing an ordered map";
            if (dVar instanceof org.yaml.snakeyaml.nodes.g) {
                for (org.yaml.snakeyaml.nodes.d dVar2 : ((org.yaml.snakeyaml.nodes.g) dVar).bUK()) {
                    Mark bUC;
                    StringBuilder stringBuilder;
                    if (dVar2 instanceof org.yaml.snakeyaml.nodes.c) {
                        org.yaml.snakeyaml.nodes.c cVar = (org.yaml.snakeyaml.nodes.c) dVar2;
                        if (cVar.bUK().size() == 1) {
                            linkedHashMap.put(e.this.d(((org.yaml.snakeyaml.nodes.e) cVar.bUK().get(0)).bUO()), e.this.d(((org.yaml.snakeyaml.nodes.e) cVar.bUK().get(0)).bUP()));
                        } else {
                            bUC = dVar.bUC();
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("expected a single mapping item, but found ");
                            stringBuilder.append(cVar.bUK().size());
                            stringBuilder.append(" items");
                            throw new ConstructorException(str, bUC, stringBuilder.toString(), cVar.bUC());
                        }
                    }
                    bUC = dVar.bUC();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("expected a mapping of length 1, but found ");
                    stringBuilder.append(dVar2.bUJ());
                    throw new ConstructorException(str, bUC, stringBuilder.toString(), dVar2.bUC());
                }
                return linkedHashMap;
            }
            Mark bUC2 = dVar.bUC();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("expected a sequence, but found ");
            stringBuilder2.append(dVar.bUJ());
            throw new ConstructorException(str, bUC2, stringBuilder2.toString(), dVar.bUC());
        }
    }

    /* compiled from: SafeConstructor */
    public class i extends a {
        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            String str = "while constructing pairs";
            if (dVar instanceof org.yaml.snakeyaml.nodes.g) {
                org.yaml.snakeyaml.nodes.g gVar = (org.yaml.snakeyaml.nodes.g) dVar;
                ArrayList arrayList = new ArrayList(gVar.bUK().size());
                for (org.yaml.snakeyaml.nodes.d dVar2 : gVar.bUK()) {
                    org.yaml.snakeyaml.nodes.d dVar22;
                    Mark bUC;
                    if (dVar22 instanceof org.yaml.snakeyaml.nodes.c) {
                        org.yaml.snakeyaml.nodes.c cVar = (org.yaml.snakeyaml.nodes.c) dVar22;
                        if (cVar.bUK().size() == 1) {
                            org.yaml.snakeyaml.nodes.d bUO = ((org.yaml.snakeyaml.nodes.e) cVar.bUK().get(0)).bUO();
                            dVar22 = ((org.yaml.snakeyaml.nodes.e) cVar.bUK().get(0)).bUP();
                            Object d = e.this.d(bUO);
                            Object d2 = e.this.d(dVar22);
                            arrayList.add(new Object[]{d, d2});
                        } else {
                            bUC = dVar.bUC();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("expected a single mapping item, but found ");
                            stringBuilder.append(cVar.bUK().size());
                            stringBuilder.append(" items");
                            throw new ConstructorException(str, bUC, stringBuilder.toString(), cVar.bUC());
                        }
                    }
                    bUC = dVar.bUC();
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("expected a mapping of length 1, but found ");
                    stringBuilder2.append(dVar22.bUJ());
                    throw new ConstructorException("while constructingpairs", bUC, stringBuilder2.toString(), dVar22.bUC());
                }
                return arrayList;
            }
            Mark bUC2 = dVar.bUC();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("expected a sequence, but found ");
            stringBuilder3.append(dVar.bUJ());
            throw new ConstructorException(str, bUC2, stringBuilder3.toString(), dVar.bUC());
        }
    }

    /* compiled from: SafeConstructor */
    public class l extends a {
        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            return e.this.a((org.yaml.snakeyaml.nodes.f) dVar);
        }
    }

    /* compiled from: SafeConstructor */
    public static class m extends a {
        private Calendar calendar;

        public Calendar getCalendar() {
            return this.calendar;
        }

        public Object g(org.yaml.snakeyaml.nodes.d dVar) {
            String value = ((org.yaml.snakeyaml.nodes.f) dVar).getValue();
            Matcher matcher = e.fKB.matcher(value);
            String str = "UTC";
            String group;
            String group2;
            if (matcher.matches()) {
                value = matcher.group(1);
                group = matcher.group(2);
                group2 = matcher.group(3);
                this.calendar = Calendar.getInstance(TimeZone.getTimeZone(str));
                this.calendar.clear();
                this.calendar.set(1, Integer.parseInt(value));
                this.calendar.set(2, Integer.parseInt(group) - 1);
                this.calendar.set(5, Integer.parseInt(group2));
                return this.calendar.getTime();
            }
            matcher = e.fKA.matcher(value);
            if (matcher.matches()) {
                TimeZone timeZone;
                value = matcher.group(1);
                group = matcher.group(2);
                String group3 = matcher.group(3);
                String group4 = matcher.group(4);
                String group5 = matcher.group(5);
                String group6 = matcher.group(6);
                String group7 = matcher.group(7);
                if (group7 != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(group6);
                    stringBuilder.append(".");
                    stringBuilder.append(group7);
                    group6 = stringBuilder.toString();
                }
                double parseDouble = Double.parseDouble(group6);
                int round = (int) Math.round(Math.floor(parseDouble));
                double d = (double) round;
                Double.isNaN(d);
                int round2 = (int) Math.round((parseDouble - d) * 1000.0d);
                String group8 = matcher.group(8);
                group2 = matcher.group(9);
                if (group8 != null) {
                    StringBuilder stringBuilder2;
                    if (group2 != null) {
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(":");
                        stringBuilder2.append(group2);
                        group2 = stringBuilder2.toString();
                    } else {
                        group2 = "00";
                    }
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("GMT");
                    stringBuilder2.append(group8);
                    stringBuilder2.append(group2);
                    timeZone = TimeZone.getTimeZone(stringBuilder2.toString());
                } else {
                    timeZone = TimeZone.getTimeZone(str);
                }
                this.calendar = Calendar.getInstance(timeZone);
                this.calendar.set(1, Integer.parseInt(value));
                this.calendar.set(2, Integer.parseInt(group) - 1);
                this.calendar.set(5, Integer.parseInt(group3));
                this.calendar.set(11, Integer.parseInt(group4));
                this.calendar.set(12, Integer.parseInt(group5));
                this.calendar.set(13, round);
                this.calendar.set(14, round2);
                return this.calendar.getTime();
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Unexpected timestamp: ");
            stringBuilder3.append(value);
            throw new YAMLException(stringBuilder3.toString());
        }
    }

    static {
        fKz.put("yes", Boolean.TRUE);
        fKz.put("no", Boolean.FALSE);
        fKz.put("true", Boolean.TRUE);
        fKz.put("false", Boolean.FALSE);
        fKz.put("on", Boolean.TRUE);
        fKz.put("off", Boolean.FALSE);
    }

    public e() {
        this.fKk.put(org.yaml.snakeyaml.nodes.h.fLA, new g());
        this.fKk.put(org.yaml.snakeyaml.nodes.h.fLz, new c());
        this.fKk.put(org.yaml.snakeyaml.nodes.h.fLw, new e());
        this.fKk.put(org.yaml.snakeyaml.nodes.h.fLx, new d());
        this.fKk.put(org.yaml.snakeyaml.nodes.h.fLv, new b());
        this.fKk.put(org.yaml.snakeyaml.nodes.h.fLy, new m());
        this.fKk.put(org.yaml.snakeyaml.nodes.h.fLu, new h());
        this.fKk.put(org.yaml.snakeyaml.nodes.h.fLt, new i());
        this.fKk.put(org.yaml.snakeyaml.nodes.h.fLs, new k());
        this.fKk.put(org.yaml.snakeyaml.nodes.h.fLB, new l());
        this.fKk.put(org.yaml.snakeyaml.nodes.h.fLC, new j());
        this.fKk.put(org.yaml.snakeyaml.nodes.h.fLD, new f());
        this.fKk.put(null, fKy);
        this.fKj.put(NodeId.scalar, fKy);
        this.fKj.put(NodeId.sequence, fKy);
        this.fKj.put(NodeId.mapping, fKy);
    }

    /* Access modifiers changed, original: protected */
    public void f(org.yaml.snakeyaml.nodes.c cVar) {
        g(cVar);
        if (cVar.bUL()) {
            cVar.cs(a(cVar, true, new HashMap(), new ArrayList()));
        }
    }

    /* Access modifiers changed, original: protected */
    public void g(org.yaml.snakeyaml.nodes.c cVar) {
        List<org.yaml.snakeyaml.nodes.e> bUK = cVar.bUK();
        HashMap hashMap = new HashMap(bUK.size());
        TreeSet treeSet = new TreeSet();
        int i = 0;
        for (org.yaml.snakeyaml.nodes.e eVar : bUK) {
            org.yaml.snakeyaml.nodes.d bUO = eVar.bUO();
            if (!bUO.bUl().equals(org.yaml.snakeyaml.nodes.h.fLr)) {
                Object d = d(bUO);
                if (d != null) {
                    try {
                        d.hashCode();
                    } catch (Exception e) {
                        Mark bUC = cVar.bUC();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("found unacceptable key ");
                        stringBuilder.append(d);
                        throw new ConstructorException("while constructing a mapping", bUC, stringBuilder.toString(), eVar.bUO().bUC(), e);
                    }
                }
                Integer num = (Integer) hashMap.put(d, Integer.valueOf(i));
                if (num == null) {
                    continue;
                } else if (bUj()) {
                    treeSet.add(num);
                } else {
                    throw new DuplicateKeyException(cVar.bUC(), d, eVar.bUO().bUC());
                }
            }
            i++;
        }
        Iterator descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            bUK.remove(((Integer) descendingIterator.next()).intValue());
        }
    }

    private List<org.yaml.snakeyaml.nodes.e> a(org.yaml.snakeyaml.nodes.c cVar, boolean z, Map<Object, Integer> map, List<org.yaml.snakeyaml.nodes.e> list) {
        Iterator it = cVar.bUK().iterator();
        while (it.hasNext()) {
            org.yaml.snakeyaml.nodes.e eVar = (org.yaml.snakeyaml.nodes.e) it.next();
            org.yaml.snakeyaml.nodes.d bUO = eVar.bUO();
            org.yaml.snakeyaml.nodes.d bUP = eVar.bUP();
            if (bUO.bUl().equals(org.yaml.snakeyaml.nodes.h.fLr)) {
                it.remove();
                int i = AnonymousClass1.fKC[bUP.bUJ().ordinal()];
                if (i != 1) {
                    String str = "while constructing a mapping";
                    Mark bUC;
                    StringBuilder stringBuilder;
                    if (i == 2) {
                        for (org.yaml.snakeyaml.nodes.d bUP2 : ((org.yaml.snakeyaml.nodes.g) bUP2).bUK()) {
                            if (bUP2 instanceof org.yaml.snakeyaml.nodes.c) {
                                a((org.yaml.snakeyaml.nodes.c) bUP2, false, (Map) map, (List) list);
                            } else {
                                bUC = cVar.bUC();
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("expected a mapping for merging, but found ");
                                stringBuilder.append(bUP2.bUJ());
                                throw new ConstructorException(str, bUC, stringBuilder.toString(), bUP2.bUC());
                            }
                        }
                        continue;
                    } else {
                        bUC = cVar.bUC();
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("expected a mapping or list of mappings for merging, but found ");
                        stringBuilder.append(bUP2.bUJ());
                        throw new ConstructorException(str, bUC, stringBuilder.toString(), bUP2.bUC());
                    }
                }
                a((org.yaml.snakeyaml.nodes.c) bUP2, false, (Map) map, (List) list);
            } else {
                Object d = d(bUO);
                if (!map.containsKey(d)) {
                    list.add(eVar);
                    map.put(d, Integer.valueOf(list.size() - 1));
                } else if (z) {
                    list.set(((Integer) map.get(d)).intValue(), eVar);
                }
            }
        }
        return list;
    }

    /* Access modifiers changed, original: protected */
    public void a(org.yaml.snakeyaml.nodes.c cVar, Map<Object, Object> map) {
        f(cVar);
        super.a(cVar, (Map) map);
    }

    /* Access modifiers changed, original: protected */
    public void a(org.yaml.snakeyaml.nodes.c cVar, Set<Object> set) {
        f(cVar);
        super.a(cVar, (Set) set);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0018 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:9:?, code skipped:
            return java.lang.Integer.valueOf(r3, r4);
     */
    private java.lang.Number a(int r2, java.lang.String r3, int r4) {
        /*
        r1 = this;
        if (r2 >= 0) goto L_0x0013;
    L_0x0002:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = "-";
        r2.append(r0);
        r2.append(r3);
        r3 = r2.toString();
    L_0x0013:
        r2 = java.lang.Integer.valueOf(r3, r4);	 Catch:{ NumberFormatException -> 0x0018 }
        goto L_0x0022;
    L_0x0018:
        r2 = java.lang.Long.valueOf(r3, r4);	 Catch:{ NumberFormatException -> 0x001d }
        goto L_0x0022;
    L_0x001d:
        r2 = new java.math.BigInteger;
        r2.<init>(r3, r4);
    L_0x0022:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.yaml.snakeyaml.constructor.e.a(int, java.lang.String, int):java.lang.Number");
    }
}
