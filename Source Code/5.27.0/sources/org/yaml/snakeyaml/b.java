package org.yaml.snakeyaml;

import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.introspector.BeanAccess;
import org.yaml.snakeyaml.introspector.e;
import org.yaml.snakeyaml.introspector.f;
import org.yaml.snakeyaml.introspector.g;
import org.yaml.snakeyaml.nodes.d;
import org.yaml.snakeyaml.nodes.h;

/* compiled from: TypeDescription */
public class b {
    private static final Logger log = Logger.getLogger(b.class.getPackage().getName());
    private final Class<? extends Object> acw;
    private Class<?> fJT;
    private h fJU;
    private transient g fJV;
    private transient boolean fJW;
    private Map<String, f> fJX;
    protected Set<String> fJY;
    protected String[] fJZ;
    protected BeanAccess fKa;

    public boolean a(String str, d dVar) {
        return false;
    }

    public Object b(String str, d dVar) {
        return null;
    }

    public boolean b(Object obj, String str, Object obj2) {
        return false;
    }

    public Object eh(Object obj) {
        return obj;
    }

    public b(Class<? extends Object> cls, h hVar, Class<?> cls2) {
        this.fJX = Collections.emptyMap();
        this.fJY = Collections.emptySet();
        this.fJZ = null;
        this.acw = cls;
        this.fJU = hVar;
        this.fJT = cls2;
        this.fKa = null;
    }

    public b(Class<? extends Object> cls) {
        this(cls, (h) null, null);
    }

    public h bUl() {
        return this.fJU;
    }

    public Class<? extends Object> getType() {
        return this.acw;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TypeDescription for ");
        stringBuilder.append(getType());
        stringBuilder.append(" (tag='");
        stringBuilder.append(bUl());
        stringBuilder.append("')");
        return stringBuilder.toString();
    }

    private void bUm() {
        for (f fVar : this.fJX.values()) {
            try {
                fVar.b(nQ(fVar.getName()));
            } catch (YAMLException unused) {
            }
        }
        this.fJW = true;
    }

    private e nQ(String str) {
        g gVar = this.fJV;
        if (gVar == null) {
            return null;
        }
        BeanAccess beanAccess = this.fKa;
        if (beanAccess == null) {
            return gVar.f(this.acw, str);
        }
        return gVar.a(this.acw, str, beanAccess);
    }

    public e nR(String str) {
        if (!this.fJW) {
            bUm();
        }
        return this.fJX.containsKey(str) ? (e) this.fJX.get(str) : nQ(str);
    }

    public void a(g gVar) {
        this.fJV = gVar;
    }

    public Object a(d dVar) {
        Class cls = this.fJT;
        if (cls != null) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(new Object[0]);
            } catch (Exception e) {
                log.fine(e.getLocalizedMessage());
                this.fJT = null;
            }
        }
        return null;
    }
}
