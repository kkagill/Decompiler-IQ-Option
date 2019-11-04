package org.slf4j.helpers;

public class NOPLogger extends MarkerIgnoringBase {
    public static final NOPLogger fFL = new NOPLogger();
    private static final long serialVersionUID = -517220405410904473L;

    public final void error(String str) {
    }

    public final void g(String str, Throwable th) {
    }

    public String getName() {
        return "NOP";
    }

    public final boolean isDebugEnabled() {
        return false;
    }

    public final void q(String str) {
    }

    protected NOPLogger() {
    }
}
