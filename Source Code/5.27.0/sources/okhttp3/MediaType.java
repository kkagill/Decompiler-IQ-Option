package okhttp3;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MediaType {
    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private final String charset;
    private final String mediaType;
    private final String subtype;
    private final String type;

    private MediaType(String str, String str2, String str3, String str4) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.charset = str4;
    }

    public static MediaType get(String str) {
        Matcher matcher = TYPE_SUBTYPE.matcher(str);
        if (matcher.lookingAt()) {
            String toLowerCase = matcher.group(1).toLowerCase(Locale.US);
            String toLowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            String str2 = null;
            Matcher matcher2 = PARAMETER.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                String str3 = "\" for: \"";
                StringBuilder stringBuilder;
                if (matcher2.lookingAt()) {
                    String group = matcher2.group(1);
                    if (group != null && group.equalsIgnoreCase("charset")) {
                        group = matcher2.group(2);
                        if (group != null) {
                            String str4 = "'";
                            if (group.startsWith(str4) && group.endsWith(str4) && group.length() > 2) {
                                group = group.substring(1, group.length() - 1);
                            }
                        } else {
                            group = matcher2.group(3);
                        }
                        if (str2 == null || group.equalsIgnoreCase(str2)) {
                            str2 = group;
                        } else {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Multiple charsets defined: \"");
                            stringBuilder.append(str2);
                            stringBuilder.append("\" and: \"");
                            stringBuilder.append(group);
                            stringBuilder.append(str3);
                            stringBuilder.append(str);
                            stringBuilder.append('\"');
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                    end = matcher2.end();
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Parameter is not formatted correctly: \"");
                    stringBuilder.append(str.substring(end));
                    stringBuilder.append(str3);
                    stringBuilder.append(str);
                    stringBuilder.append('\"');
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            return new MediaType(str, toLowerCase, toLowerCase2, str2);
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("No subtype found for: \"");
        stringBuilder2.append(str);
        stringBuilder2.append('\"');
        throw new IllegalArgumentException(stringBuilder2.toString());
    }

    public static MediaType parse(String str) {
        try {
            return get(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String type() {
        return this.type;
    }

    public String subtype() {
        return this.subtype;
    }

    public Charset charset() {
        return charset(null);
    }

    public Charset charset(Charset charset) {
        try {
            return this.charset != null ? Charset.forName(this.charset) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public String toString() {
        return this.mediaType;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && ((MediaType) obj).mediaType.equals(this.mediaType);
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }
}
