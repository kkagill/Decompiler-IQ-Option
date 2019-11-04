package org.yaml.snakeyaml;

import java.io.InputStream;
import org.yaml.snakeyaml.b.a;
import org.yaml.snakeyaml.constructor.b;
import org.yaml.snakeyaml.constructor.d;
import org.yaml.snakeyaml.error.YAMLException;

/* compiled from: Yaml */
public class c {
    protected final a fKb;
    protected b fKc;
    protected org.yaml.snakeyaml.representer.c fKd;
    protected DumperOptions fKe;
    protected a fKf;
    private String name;

    public c() {
        this(new d(), new org.yaml.snakeyaml.representer.c(), new DumperOptions(), new a(), new a());
    }

    public c(b bVar) {
        this(bVar, new org.yaml.snakeyaml.representer.c());
    }

    public c(b bVar, org.yaml.snakeyaml.representer.c cVar) {
        this(bVar, cVar, a(cVar));
    }

    private static DumperOptions a(org.yaml.snakeyaml.representer.c cVar) {
        DumperOptions dumperOptions = new DumperOptions();
        dumperOptions.a(cVar.bUh());
        dumperOptions.a(cVar.bUe());
        dumperOptions.hr(cVar.bUq().bUi());
        dumperOptions.setTimeZone(cVar.getTimeZone());
        return dumperOptions;
    }

    public c(b bVar, org.yaml.snakeyaml.representer.c cVar, DumperOptions dumperOptions) {
        this(bVar, cVar, dumperOptions, new a(), new a());
    }

    public c(b bVar, org.yaml.snakeyaml.representer.c cVar, DumperOptions dumperOptions, a aVar, a aVar2) {
        if (!bVar.bUr()) {
            bVar.a(cVar.bUq());
        } else if (!cVar.bUr()) {
            cVar.a(bVar.bUq());
        }
        this.fKc = bVar;
        this.fKc.hs(aVar.bUj());
        this.fKc.ht(aVar.bUk());
        if (dumperOptions.bUf() > dumperOptions.bUg()) {
            cVar.a(dumperOptions.bUh());
            cVar.a(dumperOptions.bUe());
            cVar.bUq().hr(dumperOptions.bUi());
            cVar.setTimeZone(dumperOptions.getTimeZone());
            this.fKd = cVar;
            this.fKe = dumperOptions;
            this.fKf = aVar;
            this.fKb = aVar2;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Yaml:");
            stringBuilder.append(System.identityHashCode(this));
            this.name = stringBuilder.toString();
            return;
        }
        throw new YAMLException("Indicator indent must be smaller then indent.");
    }

    public <T> T w(InputStream inputStream) {
        return a(new org.yaml.snakeyaml.reader.a(new org.yaml.snakeyaml.reader.b(inputStream)), Object.class);
    }

    private Object a(org.yaml.snakeyaml.reader.a aVar, Class<?> cls) {
        this.fKc.a(new org.yaml.snakeyaml.composer.a(new org.yaml.snakeyaml.parser.b(aVar), this.fKb));
        return this.fKc.ad(cls);
    }

    public String toString() {
        return this.name;
    }
}
