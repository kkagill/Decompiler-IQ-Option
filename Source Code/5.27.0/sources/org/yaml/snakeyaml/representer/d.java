package org.yaml.snakeyaml.representer;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: SafeRepresenter */
class d extends a {
    public static Pattern fMd = Pattern.compile("\n|| | ");
    protected TimeZone fJM;
    protected Map<Class<? extends Object>, org.yaml.snakeyaml.nodes.h> fMc;

    /* compiled from: SafeRepresenter */
    protected class a implements b {
        protected a() {
        }
    }

    /* compiled from: SafeRepresenter */
    protected class b implements b {
        protected b() {
        }
    }

    /* compiled from: SafeRepresenter */
    protected class c implements b {
        protected c() {
        }
    }

    /* compiled from: SafeRepresenter */
    protected class d implements b {
        protected d() {
        }
    }

    /* compiled from: SafeRepresenter */
    protected class e implements b {
        protected e() {
        }
    }

    /* compiled from: SafeRepresenter */
    protected class f implements b {
        protected f() {
        }
    }

    /* compiled from: SafeRepresenter */
    protected class g implements b {
        protected g() {
        }
    }

    /* compiled from: SafeRepresenter */
    protected class h implements b {
        protected h() {
        }
    }

    /* compiled from: SafeRepresenter */
    protected class i implements b {
        protected i() {
        }
    }

    /* compiled from: SafeRepresenter */
    protected class j implements b {
        protected j() {
        }
    }

    /* compiled from: SafeRepresenter */
    protected class k implements b {
        protected k() {
        }
    }

    /* compiled from: SafeRepresenter */
    protected class l implements b {
        protected l() {
        }
    }

    /* compiled from: SafeRepresenter */
    protected class m implements b {
        protected m() {
        }
    }

    /* compiled from: SafeRepresenter */
    protected class n implements b {
        protected n() {
        }
    }

    public d() {
        this.fJM = null;
        this.fLX = new i();
        this.fLW.put(String.class, new m());
        this.fLW.put(Boolean.class, new b());
        this.fLW.put(Character.class, new m());
        this.fLW.put(UUID.class, new n());
        this.fLW.put(byte[].class, new c());
        k kVar = new k();
        this.fLW.put(short[].class, kVar);
        this.fLW.put(int[].class, kVar);
        this.fLW.put(long[].class, kVar);
        this.fLW.put(float[].class, kVar);
        this.fLW.put(double[].class, kVar);
        this.fLW.put(char[].class, kVar);
        this.fLW.put(boolean[].class, kVar);
        this.fLY.put(Number.class, new j());
        this.fLY.put(List.class, new g());
        this.fLY.put(Map.class, new h());
        this.fLY.put(Set.class, new l());
        this.fLY.put(Iterator.class, new f());
        this.fLY.put(new Object[0].getClass(), new a());
        this.fLY.put(Date.class, new d());
        this.fLY.put(Enum.class, new e());
        this.fLY.put(Calendar.class, new d());
        this.fMc = new HashMap();
    }

    public TimeZone getTimeZone() {
        return this.fJM;
    }

    public void setTimeZone(TimeZone timeZone) {
        this.fJM = timeZone;
    }
}
