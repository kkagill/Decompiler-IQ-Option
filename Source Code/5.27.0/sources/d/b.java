package d;

/* compiled from: Device */
public class b {
    public final String hn;

    public b(String str) {
        this.hn = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.hn;
        if ((str == null || !str.equals(bVar.hn)) && this.hn != bVar.hn) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.hn;
        return str == null ? 0 : str.hashCode();
    }

    public String toString() {
        String str;
        Object[] objArr = new Object[1];
        if (this.hn == null) {
            str = "\"\"";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('\"');
            stringBuilder.append(this.hn);
            stringBuilder.append('\"');
            str = stringBuilder.toString();
        }
        objArr[0] = str;
        return String.format("{\"family\": %s}", objArr);
    }
}
