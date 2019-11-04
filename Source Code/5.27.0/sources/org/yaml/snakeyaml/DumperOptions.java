package org.yaml.snakeyaml;

import java.util.Map;
import java.util.TimeZone;
import org.yaml.snakeyaml.c.a;
import org.yaml.snakeyaml.c.b;
import org.yaml.snakeyaml.error.YAMLException;

public class DumperOptions {
    private boolean allowUnicode = true;
    private ScalarStyle fJB = ScalarStyle.PLAIN;
    private FlowStyle fJC = FlowStyle.AUTO;
    private boolean fJD = false;
    private boolean fJE = false;
    private int fJF = 2;
    private int fJG = 0;
    private int fJH = 80;
    private boolean fJI = true;
    private LineBreak fJJ = LineBreak.UNIX;
    private boolean fJK = false;
    private boolean fJL = false;
    private TimeZone fJM = null;
    private int fJN = 128;
    private Version fJO = null;
    private Boolean fJP = Boolean.valueOf(false);
    private a fJQ = new b(0);
    private Map<String, String> tags = null;

    public enum FlowStyle {
        FLOW(Boolean.TRUE),
        BLOCK(Boolean.FALSE),
        AUTO(null);
        
        private Boolean styleBoolean;

        private FlowStyle(Boolean bool) {
            this.styleBoolean = bool;
        }

        @Deprecated
        public static FlowStyle fromBoolean(Boolean bool) {
            if (bool == null) {
                return AUTO;
            }
            return bool.booleanValue() ? FLOW : BLOCK;
        }

        public Boolean getStyleBoolean() {
            return this.styleBoolean;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Flow style: '");
            stringBuilder.append(this.styleBoolean);
            stringBuilder.append("'");
            return stringBuilder.toString();
        }
    }

    public enum LineBreak {
        WIN("\r\n"),
        MAC("\r"),
        UNIX("\n");
        
        private String lineBreak;

        private LineBreak(String str) {
            this.lineBreak = str;
        }

        public String getString() {
            return this.lineBreak;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Line break: ");
            stringBuilder.append(name());
            return stringBuilder.toString();
        }

        public static LineBreak getPlatformLineBreak() {
            String property = System.getProperty("line.separator");
            for (LineBreak lineBreak : values()) {
                if (lineBreak.lineBreak.equals(property)) {
                    return lineBreak;
                }
            }
            return UNIX;
        }
    }

    public enum ScalarStyle {
        DOUBLE_QUOTED(Character.valueOf('\"')),
        SINGLE_QUOTED(Character.valueOf('\'')),
        LITERAL(Character.valueOf('|')),
        FOLDED(Character.valueOf('>')),
        PLAIN(null);
        
        private Character styleChar;

        private ScalarStyle(Character ch) {
            this.styleChar = ch;
        }

        public Character getChar() {
            return this.styleChar;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Scalar style: '");
            stringBuilder.append(this.styleChar);
            stringBuilder.append("'");
            return stringBuilder.toString();
        }

        public static ScalarStyle createStyle(Character ch) {
            if (ch == null) {
                return PLAIN;
            }
            char charValue = ch.charValue();
            if (charValue == '\"') {
                return DOUBLE_QUOTED;
            }
            if (charValue == '\'') {
                return SINGLE_QUOTED;
            }
            if (charValue == '>') {
                return FOLDED;
            }
            if (charValue == '|') {
                return LITERAL;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown scalar style character: ");
            stringBuilder.append(ch);
            throw new YAMLException(stringBuilder.toString());
        }
    }

    public enum Version {
        V1_0(r2),
        V1_1(new Integer[]{r4, r4});
        
        private Integer[] version;

        private Version(Integer[] numArr) {
            this.version = numArr;
        }

        public int major() {
            return this.version[0].intValue();
        }

        public int minor() {
            return this.version[1].intValue();
        }

        public String getRepresentation() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.version[0]);
            stringBuilder.append(".");
            stringBuilder.append(this.version[1]);
            return stringBuilder.toString();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Version: ");
            stringBuilder.append(getRepresentation());
            return stringBuilder.toString();
        }
    }

    public ScalarStyle bUe() {
        return this.fJB;
    }

    public void a(ScalarStyle scalarStyle) {
        if (scalarStyle != null) {
            this.fJB = scalarStyle;
            return;
        }
        throw new NullPointerException("Use ScalarStyle enum.");
    }

    public int bUf() {
        return this.fJF;
    }

    public int bUg() {
        return this.fJG;
    }

    public void a(FlowStyle flowStyle) {
        if (flowStyle != null) {
            this.fJC = flowStyle;
            return;
        }
        throw new NullPointerException("Use FlowStyle enum.");
    }

    public FlowStyle bUh() {
        return this.fJC;
    }

    public boolean bUi() {
        return this.fJE;
    }

    public void hr(boolean z) {
        this.fJE = z;
    }

    public TimeZone getTimeZone() {
        return this.fJM;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.fJM = timeZone;
    }
}
