package org.yaml.snakeyaml.error;

public class MarkedYAMLException extends YAMLException {
    private static final long serialVersionUID = -9119388488683035101L;
    private String context;
    private Mark contextMark;
    private String note;
    private String problem;
    private Mark problemMark;

    protected MarkedYAMLException(String str, Mark mark, String str2, Mark mark2, String str3) {
        this(str, mark, str2, mark2, str3, null);
    }

    protected MarkedYAMLException(String str, Mark mark, String str2, Mark mark2, String str3, Throwable th) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        String str4 = "; ";
        stringBuilder.append(str4);
        stringBuilder.append(str2);
        stringBuilder.append(str4);
        stringBuilder.append(mark2);
        super(stringBuilder.toString(), th);
        this.context = str;
        this.contextMark = mark;
        this.problem = str2;
        this.problemMark = mark2;
        this.note = str3;
    }

    protected MarkedYAMLException(String str, Mark mark, String str2, Mark mark2) {
        this(str, mark, str2, mark2, null, null);
    }

    protected MarkedYAMLException(String str, Mark mark, String str2, Mark mark2, Throwable th) {
        this(str, mark, str2, mark2, null, th);
    }

    public String getMessage() {
        return toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String str = this.context;
        String str2 = "\n";
        if (str != null) {
            stringBuilder.append(str);
            stringBuilder.append(str2);
        }
        Mark mark = this.contextMark;
        if (mark != null && (this.problem == null || this.problemMark == null || mark.getName().equals(this.problemMark.getName()) || this.contextMark.bUx() != this.problemMark.bUx() || this.contextMark.bUy() != this.problemMark.bUy())) {
            stringBuilder.append(this.contextMark.toString());
            stringBuilder.append(str2);
        }
        str = this.problem;
        if (str != null) {
            stringBuilder.append(str);
            stringBuilder.append(str2);
        }
        mark = this.problemMark;
        if (mark != null) {
            stringBuilder.append(mark.toString());
            stringBuilder.append(str2);
        }
        str = this.note;
        if (str != null) {
            stringBuilder.append(str);
            stringBuilder.append(str2);
        }
        return stringBuilder.toString();
    }
}
