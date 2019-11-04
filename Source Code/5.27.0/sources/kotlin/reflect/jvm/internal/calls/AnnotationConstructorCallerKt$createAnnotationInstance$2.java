package kotlin.reflect.jvm.internal.calls;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, bng = {"equals", "", "T", "", "other", "invoke"})
/* compiled from: AnnotationConstructorCaller.kt */
final class AnnotationConstructorCallerKt$createAnnotationInstance$2 extends Lambda implements b<Object, Boolean> {
    final /* synthetic */ Class $annotationClass;
    final /* synthetic */ List $methods;
    final /* synthetic */ Map $values;

    AnnotationConstructorCallerKt$createAnnotationInstance$2(Class cls, List list, Map map) {
        this.$annotationClass = cls;
        this.$methods = list;
        this.$values = map;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(bP(obj));
    }

    public final boolean bP(Object obj) {
        Object obj2 = null;
        Annotation annotation = (Annotation) (!(obj instanceof Annotation) ? null : obj);
        if (annotation != null) {
            kotlin.reflect.b a = a.a(annotation);
            if (a != null) {
                obj2 = a.a(a);
            }
        }
        if (kotlin.jvm.internal.i.y(obj2, this.$annotationClass)) {
            Iterable<Method> iterable = this.$methods;
            if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
                for (Method method : iterable) {
                    boolean equals;
                    Object obj3 = this.$values.get(method.getName());
                    Object invoke = method.invoke(obj, new Object[0]);
                    if (obj3 instanceof boolean[]) {
                        boolean[] zArr = (boolean[]) obj3;
                        if (invoke != null) {
                            equals = Arrays.equals(zArr, (boolean[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.BooleanArray");
                        }
                    } else if (obj3 instanceof char[]) {
                        char[] cArr = (char[]) obj3;
                        if (invoke != null) {
                            equals = Arrays.equals(cArr, (char[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharArray");
                        }
                    } else if (obj3 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj3;
                        if (invoke != null) {
                            equals = Arrays.equals(bArr, (byte[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.ByteArray");
                        }
                    } else if (obj3 instanceof short[]) {
                        short[] sArr = (short[]) obj3;
                        if (invoke != null) {
                            equals = Arrays.equals(sArr, (short[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.ShortArray");
                        }
                    } else if (obj3 instanceof int[]) {
                        int[] iArr = (int[]) obj3;
                        if (invoke != null) {
                            equals = Arrays.equals(iArr, (int[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.IntArray");
                        }
                    } else if (obj3 instanceof float[]) {
                        float[] fArr = (float[]) obj3;
                        if (invoke != null) {
                            equals = Arrays.equals(fArr, (float[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.FloatArray");
                        }
                    } else if (obj3 instanceof long[]) {
                        long[] jArr = (long[]) obj3;
                        if (invoke != null) {
                            equals = Arrays.equals(jArr, (long[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.LongArray");
                        }
                    } else if (obj3 instanceof double[]) {
                        double[] dArr = (double[]) obj3;
                        if (invoke != null) {
                            equals = Arrays.equals(dArr, (double[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.DoubleArray");
                        }
                    } else if (obj3 instanceof Object[]) {
                        Object[] objArr = (Object[]) obj3;
                        if (invoke != null) {
                            equals = Arrays.equals(objArr, (Object[]) invoke);
                            continue;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
                        }
                    } else {
                        equals = kotlin.jvm.internal.i.y(obj3, invoke);
                        continue;
                    }
                    if (!equals) {
                        obj = null;
                        break;
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }
}
