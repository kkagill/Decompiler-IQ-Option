package org.yaml.snakeyaml.nodes;

import org.yaml.snakeyaml.error.Mark;

/* compiled from: Node */
public abstract class d {
    private Class<? extends Object> acw = Object.class;
    private h fJU;
    private Mark fKH;
    protected Mark fKI;
    private boolean fLl = false;
    protected boolean fLm = true;
    protected Boolean fLn = null;

    public abstract NodeId bUJ();

    public d(h hVar, Mark mark, Mark mark2) {
        a(hVar);
        this.fKH = mark;
        this.fKI = mark2;
    }

    public h bUl() {
        return this.fJU;
    }

    public Mark bUD() {
        return this.fKI;
    }

    public Mark bUC() {
        return this.fKH;
    }

    public void a(h hVar) {
        if (hVar != null) {
            this.fJU = hVar;
            return;
        }
        throw new NullPointerException("tag in a Node is required.");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Class<? extends Object> getType() {
        return this.acw;
    }

    public void ah(Class<? extends Object> cls) {
        if (!cls.isAssignableFrom(this.acw)) {
            this.acw = cls;
        }
    }

    public void hv(boolean z) {
        this.fLl = z;
    }

    public boolean bUM() {
        return this.fLl;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public boolean bUN() {
        Boolean bool = this.fLn;
        if (bool != null) {
            return bool.booleanValue();
        }
        if ((this.fJU.bUQ() || !this.fLm || Object.class.equals(this.acw) || this.fJU.equals(h.fLA)) && !this.fJU.aj(getType())) {
            return false;
        }
        return true;
    }

    public void A(Boolean bool) {
        this.fLn = bool;
    }
}
