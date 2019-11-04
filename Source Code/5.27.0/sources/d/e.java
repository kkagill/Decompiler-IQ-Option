package d;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: OSParser */
public class e {
    private final List<a> fNc;

    /* compiled from: OSParser */
    protected static class a {
        private final String fNj;
        private final String fNk;
        private final String fNl;
        private final String fNm;
        private final Pattern pattern;

        public a(Pattern pattern, String str, String str2, String str3, String str4) {
            this.pattern = pattern;
            this.fNj = str;
            this.fNk = str2;
            this.fNl = str3;
            this.fNm = str4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0098  */
        public d.d oa(java.lang.String r10) {
            /*
            r9 = this;
            r0 = r9.pattern;
            r10 = r0.matcher(r10);
            r0 = r10.find();
            r1 = 0;
            if (r0 != 0) goto L_0x000e;
        L_0x000d:
            return r1;
        L_0x000e:
            r0 = r10.groupCount();
            r2 = r9.fNj;
            r3 = 1;
            if (r2 == 0) goto L_0x0048;
        L_0x0017:
            if (r0 < r3) goto L_0x004e;
        L_0x0019:
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r4 = "(";
            r2.append(r4);
            r4 = "$1";
            r4 = java.util.regex.Pattern.quote(r4);
            r2.append(r4);
            r4 = ")";
            r2.append(r4);
            r2 = r2.toString();
            r2 = java.util.regex.Pattern.compile(r2);
            r4 = r9.fNj;
            r2 = r2.matcher(r4);
            r3 = r10.group(r3);
            r2 = r2.replaceAll(r3);
            goto L_0x004e;
        L_0x0048:
            if (r0 < r3) goto L_0x0050;
        L_0x004a:
            r2 = r10.group(r3);
        L_0x004e:
            r4 = r2;
            goto L_0x0051;
        L_0x0050:
            r4 = r1;
        L_0x0051:
            r2 = r9.fNk;
            if (r2 == 0) goto L_0x005b;
        L_0x0055:
            r2 = r9.a(r10, r2);
        L_0x0059:
            r5 = r2;
            goto L_0x0064;
        L_0x005b:
            r2 = 2;
            if (r0 < r2) goto L_0x0063;
        L_0x005e:
            r2 = r10.group(r2);
            goto L_0x0059;
        L_0x0063:
            r5 = r1;
        L_0x0064:
            r2 = r9.fNl;
            if (r2 == 0) goto L_0x006e;
        L_0x0068:
            r2 = r9.a(r10, r2);
        L_0x006c:
            r6 = r2;
            goto L_0x0077;
        L_0x006e:
            r2 = 3;
            if (r0 < r2) goto L_0x0076;
        L_0x0071:
            r2 = r10.group(r2);
            goto L_0x006c;
        L_0x0076:
            r6 = r1;
        L_0x0077:
            r2 = r9.fNm;
            if (r2 == 0) goto L_0x0081;
        L_0x007b:
            r2 = r9.a(r10, r2);
        L_0x007f:
            r7 = r2;
            goto L_0x008a;
        L_0x0081:
            r2 = 4;
            if (r0 < r2) goto L_0x0089;
        L_0x0084:
            r2 = r10.group(r2);
            goto L_0x007f;
        L_0x0089:
            r7 = r1;
        L_0x008a:
            r2 = 5;
            if (r0 < r2) goto L_0x0093;
        L_0x008d:
            r10 = r10.group(r2);
            r8 = r10;
            goto L_0x0094;
        L_0x0093:
            r8 = r1;
        L_0x0094:
            if (r4 != 0) goto L_0x0098;
        L_0x0096:
            r10 = r1;
            goto L_0x009e;
        L_0x0098:
            r10 = new d.d;
            r3 = r10;
            r3.<init>(r4, r5, r6, r7, r8);
        L_0x009e:
            return r10;
            */
            throw new UnsupportedOperationException("Method not decompiled: d.e$a.oa(java.lang.String):d.d");
        }

        private String a(Matcher matcher, String str) {
            return ob(str) ? matcher.group(oc(str)) : str;
        }

        private boolean ob(String str) {
            return str.startsWith("$");
        }

        private int oc(String str) {
            return Integer.valueOf(str.substring(1)).intValue();
        }
    }

    public e(List<a> list) {
        this.fNc = list;
    }

    public static e cu(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Map ac : list) {
            arrayList.add(ac(ac));
        }
        return new e(arrayList);
    }

    public d nZ(String str) {
        if (str == null) {
            return null;
        }
        for (a oa : this.fNc) {
            d oa2 = oa.oa(str);
            if (oa2 != null) {
                return oa2;
            }
        }
        return new d("Other", null, null, null, null);
    }

    protected static a ac(Map<String, String> map) {
        String str = (String) map.get("regex");
        if (str != null) {
            return new a(Pattern.compile(str), (String) map.get("os_replacement"), (String) map.get("os_v1_replacement"), (String) map.get("os_v2_replacement"), (String) map.get("os_v3_replacement"));
        }
        throw new IllegalArgumentException("OS is missing regex");
    }
}
