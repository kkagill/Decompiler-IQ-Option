package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.i;

/* compiled from: DescriptorRenderer.kt */
public enum RenderingFormat {
    ;

    /* compiled from: DescriptorRenderer.kt */
    static final class HTML extends RenderingFormat {
        HTML(String str, int i) {
            super(str, i, null);
        }

        public String escape(String str) {
            i.f(str, "string");
            return u.a(u.a(str, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    static final class PLAIN extends RenderingFormat {
        public String escape(String str) {
            i.f(str, "string");
            return str;
        }

        PLAIN(String str, int i) {
            super(str, i, null);
        }
    }

    public abstract String escape(String str);
}
