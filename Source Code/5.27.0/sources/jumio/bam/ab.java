package jumio.bam;

import java.util.regex.Pattern;

/* compiled from: CustomFieldManualInput */
public class ab extends aa {
    protected int c = -1;
    protected Pattern d = null;

    public ab(String str, String str2, int i, Pattern pattern) {
        super(str, str2);
        this.c = i;
        this.d = pattern;
    }

    public int c() {
        return this.c;
    }

    public Pattern d() {
        return this.d;
    }
}
