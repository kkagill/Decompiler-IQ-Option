package org.yaml.snakeyaml.introspector;

/* compiled from: Property */
public abstract class e implements Comparable<e> {
    private final Class<?> acw;
    private final String name;

    public abstract Class<?>[] bUI();

    public boolean isWritable() {
        return true;
    }

    public abstract void set(Object obj, Object obj2);

    public e(String str, Class<?> cls) {
        this.name = str;
        this.acw = cls;
    }

    public Class<?> getType() {
        return this.acw;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getName());
        stringBuilder.append(" of ");
        stringBuilder.append(getType());
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public int compareTo(e eVar) {
        return getName().compareTo(eVar.getName());
    }

    public int hashCode() {
        return getName().hashCode() + getType().hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (getName().equals(eVar.getName()) && getType().equals(eVar.getType())) {
            return true;
        }
        return false;
    }
}
