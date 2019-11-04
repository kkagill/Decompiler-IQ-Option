package d;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: DeviceParser */
public class c {
    List<a> fNc;

    /* compiled from: DeviceParser */
    protected static class a {
        private static final Pattern fNd = Pattern.compile("\\$\\d");
        private final String fNe;
        private final Pattern pattern;

        public a(Pattern pattern, String str) {
            this.pattern = pattern;
            this.fNe = str;
        }

        public String nX(String str) {
            Matcher matcher = this.pattern.matcher(str);
            String str2 = null;
            if (!matcher.find()) {
                return null;
            }
            String str3 = this.fNe;
            if (str3 != null) {
                if (str3.contains("$")) {
                    str3 = this.fNe;
                    for (String str4 : nY(str3)) {
                        int intValue = Integer.valueOf(str4.substring(1)).intValue();
                        String quoteReplacement = (matcher.groupCount() < intValue || matcher.group(intValue) == null) ? "" : Matcher.quoteReplacement(matcher.group(intValue));
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("\\");
                        stringBuilder.append(str4);
                        str3 = str3.replaceFirst(stringBuilder.toString(), quoteReplacement);
                    }
                    str2 = str3.trim();
                } else {
                    str2 = this.fNe;
                }
            } else if (matcher.groupCount() >= 1) {
                str2 = matcher.group(1);
            }
            return str2;
        }

        private List<String> nY(String str) {
            Matcher matcher = fNd.matcher(str);
            ArrayList arrayList = new ArrayList();
            while (matcher.find()) {
                arrayList.add(matcher.group());
            }
            return arrayList;
        }
    }

    public c(List<a> list) {
        this.fNc = list;
    }

    public b nW(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        for (a nX : this.fNc) {
            str2 = nX.nX(str);
            if (str2 != null) {
                break;
            }
        }
        if (str2 == null) {
            str2 = "Other";
        }
        return new b(str2);
    }

    public static c ct(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Map ab : list) {
            arrayList.add(ab(ab));
        }
        return new c(arrayList);
    }

    protected static a ab(Map<String, String> map) {
        String str = (String) map.get("regex");
        if (str != null) {
            return new a("i".equals(map.get("regex_flag")) ? Pattern.compile(str, 2) : Pattern.compile(str), (String) map.get("device_replacement"));
        }
        throw new IllegalArgumentException("Device is missing regex");
    }
}
