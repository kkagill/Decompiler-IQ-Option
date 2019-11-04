package org.apache.commons.lang3.builder;

/* compiled from: ToStringBuilder */
public class b {
    private static volatile ToStringStyle fDU = ToStringStyle.fDX;
    private final StringBuffer fDV;
    private final ToStringStyle fDW;
    private final Object object;

    public static ToStringStyle bQM() {
        return fDU;
    }

    public static String ef(Object obj) {
        return a.toString(obj);
    }

    public b(Object obj, ToStringStyle toStringStyle, StringBuffer stringBuffer) {
        if (toStringStyle == null) {
            toStringStyle = bQM();
        }
        if (stringBuffer == null) {
            stringBuffer = new StringBuffer(512);
        }
        this.fDV = stringBuffer;
        this.fDW = toStringStyle;
        this.object = obj;
        toStringStyle.b(stringBuffer, obj);
    }

    public b u(String str, Object obj) {
        this.fDW.a(this.fDV, str, obj, null);
        return this;
    }

    public Object getObject() {
        return this.object;
    }

    public StringBuffer bQN() {
        return this.fDV;
    }

    public ToStringStyle bQO() {
        return this.fDW;
    }

    public String toString() {
        if (getObject() == null) {
            bQN().append(bQO().bQR());
        } else {
            this.fDW.c(bQN(), getObject());
        }
        return bQN().toString();
    }
}
