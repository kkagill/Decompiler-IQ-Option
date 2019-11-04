package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;

/* compiled from: signatureEnhancement.kt */
final class SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2 extends Lambda implements m<T, T, T> {
    public static final SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2 flb = new SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2();

    SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2() {
        super(2);
    }

    public final <T> T w(T t, T t2) {
        if (t == null || t2 == null || i.y(t, t2)) {
            return t != null ? t : t2;
        } else {
            return null;
        }
    }
}
