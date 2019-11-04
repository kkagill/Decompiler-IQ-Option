package com.iqoption.app.b;

/* compiled from: NetworkStateEvent */
public class d {
    public final boolean asB;

    public d(boolean z) {
        this.asB = z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NetworkStateEvent{isOnline=");
        stringBuilder.append(this.asB);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
