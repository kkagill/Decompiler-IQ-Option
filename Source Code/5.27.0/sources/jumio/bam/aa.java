package jumio.bam;

import java.io.Serializable;

/* compiled from: CustomField */
public abstract class aa implements Serializable {
    protected String a;
    protected String b;

    public aa(String str, String str2) {
        String str3 = "";
        this.a = str3;
        this.b = str3;
        this.a = str;
        this.b = str2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}
