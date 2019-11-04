package d;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.yaml.snakeyaml.c;
import org.yaml.snakeyaml.constructor.e;

/* compiled from: Parser */
public class f {
    private h fNn;
    private e fNo;
    private c fNp;

    public f() {
        this(f.class.getResourceAsStream("/ua_parser/regexes.yaml"));
    }

    public f(InputStream inputStream) {
        x(inputStream);
    }

    public a od(String str) {
        return new a(oe(str), of(str), this.fNp.nW(str));
    }

    public g oe(String str) {
        return this.fNn.og(str);
    }

    public d of(String str) {
        return this.fNo.nZ(str);
    }

    private void x(InputStream inputStream) {
        Map map = (Map) new c(new e()).w(inputStream);
        List list = (List) map.get("user_agent_parsers");
        if (list != null) {
            this.fNn = h.cv(list);
            list = (List) map.get("os_parsers");
            if (list != null) {
                this.fNo = e.cu(list);
                List list2 = (List) map.get("device_parsers");
                if (list2 != null) {
                    this.fNp = c.ct(list2);
                    return;
                }
                throw new IllegalArgumentException("device_parsers is missing from yaml");
            }
            throw new IllegalArgumentException("os_parsers is missing from yaml");
        }
        throw new IllegalArgumentException("user_agent_parsers is missing from yaml");
    }
}
