package com.crashlytics.android.answers;

/* compiled from: PredefinedEvent */
public abstract class t<T extends t> extends d<T> {
    final c oE;

    public abstract String ed();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{type:\"");
        stringBuilder.append(ed());
        stringBuilder.append('\"');
        stringBuilder.append(", predefinedAttributes:");
        stringBuilder.append(this.oE);
        stringBuilder.append(", customAttributes:");
        stringBuilder.append(this.nO);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
