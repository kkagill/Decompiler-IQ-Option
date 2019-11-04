package org.slf4j.helpers;

/* compiled from: SubstituteLogger */
public class b implements org.slf4j.b {
    private volatile org.slf4j.b fFM;
    private final String name;

    public b(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public boolean isDebugEnabled() {
        return bSC().isDebugEnabled();
    }

    public void q(String str) {
        bSC().q(str);
    }

    public void error(String str) {
        bSC().error(str);
    }

    public void g(String str, Throwable th) {
        bSC().g(str, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.name.equals(((b) obj).name);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    /* Access modifiers changed, original: 0000 */
    public org.slf4j.b bSC() {
        return this.fFM != null ? this.fFM : NOPLogger.fFL;
    }

    public void a(org.slf4j.b bVar) {
        this.fFM = bVar;
    }
}
