package d;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: UserAgentParser */
public class h {
    private final List<a> fNc;

    /* compiled from: UserAgentParser */
    protected static class a {
        private final String fNk;
        private final String fNl;
        private final String fNq;
        private final Pattern pattern;

        public a(Pattern pattern, String str, String str2, String str3) {
            this.pattern = pattern;
            this.fNq = str;
            this.fNk = str2;
            this.fNl = str3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
        public d.g oh(java.lang.String r7) {
            /*
            r6 = this;
            r0 = r6.pattern;
            r7 = r0.matcher(r7);
            r0 = r7.find();
            r1 = 0;
            if (r0 != 0) goto L_0x000e;
        L_0x000d:
            return r1;
        L_0x000e:
            r0 = r7.groupCount();
            r2 = r6.fNq;
            r3 = 1;
            if (r2 == 0) goto L_0x003b;
        L_0x0017:
            r4 = "$1";
            r2 = r2.contains(r4);
            if (r2 == 0) goto L_0x0038;
        L_0x001f:
            if (r0 < r3) goto L_0x0038;
        L_0x0021:
            r2 = r7.group(r3);
            if (r2 == 0) goto L_0x0038;
        L_0x0027:
            r2 = r6.fNq;
            r3 = r7.group(r3);
            r3 = java.util.regex.Matcher.quoteReplacement(r3);
            r4 = "\\$1";
            r2 = r2.replaceFirst(r4, r3);
            goto L_0x0043;
        L_0x0038:
            r2 = r6.fNq;
            goto L_0x0043;
        L_0x003b:
            if (r0 < r3) goto L_0x0042;
        L_0x003d:
            r2 = r7.group(r3);
            goto L_0x0043;
        L_0x0042:
            r2 = r1;
        L_0x0043:
            r3 = r6.fNk;
            if (r3 == 0) goto L_0x0048;
        L_0x0047:
            goto L_0x0051;
        L_0x0048:
            r3 = 2;
            if (r0 < r3) goto L_0x0050;
        L_0x004b:
            r3 = r7.group(r3);
            goto L_0x0051;
        L_0x0050:
            r3 = r1;
        L_0x0051:
            r4 = r6.fNl;
            if (r4 == 0) goto L_0x0057;
        L_0x0055:
            r7 = r1;
            goto L_0x0068;
        L_0x0057:
            r4 = 3;
            if (r0 < r4) goto L_0x0066;
        L_0x005a:
            r4 = r7.group(r4);
            r5 = 4;
            if (r0 < r5) goto L_0x0055;
        L_0x0061:
            r7 = r7.group(r5);
            goto L_0x0068;
        L_0x0066:
            r7 = r1;
            r4 = r7;
        L_0x0068:
            if (r2 != 0) goto L_0x006b;
        L_0x006a:
            goto L_0x0070;
        L_0x006b:
            r1 = new d.g;
            r1.<init>(r2, r3, r4, r7);
        L_0x0070:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: d.h$a.oh(java.lang.String):d.g");
        }
    }

    public h(List<a> list) {
        this.fNc = list;
    }

    public static h cv(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Map ad : list) {
            arrayList.add(ad(ad));
        }
        return new h(arrayList);
    }

    public g og(String str) {
        if (str == null) {
            return null;
        }
        for (a oh : this.fNc) {
            g oh2 = oh.oh(str);
            if (oh2 != null) {
                return oh2;
            }
        }
        return new g("Other", null, null, null);
    }

    protected static a ad(Map<String, String> map) {
        String str = (String) map.get("regex");
        if (str != null) {
            return new a(Pattern.compile(str), (String) map.get("family_replacement"), (String) map.get("v1_replacement"), (String) map.get("v2_replacement"));
        }
        throw new IllegalArgumentException("User agent is missing regex");
    }
}
