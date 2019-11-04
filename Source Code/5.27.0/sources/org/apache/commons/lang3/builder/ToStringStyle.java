package org.apache.commons.lang3.builder;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.b;
import org.apache.commons.lang3.d;

public abstract class ToStringStyle implements Serializable {
    public static final ToStringStyle fDX = new DefaultToStringStyle();
    public static final ToStringStyle fDY = new MultiLineToStringStyle();
    public static final ToStringStyle fDZ = new NoFieldNameToStringStyle();
    public static final ToStringStyle fEa = new ShortPrefixToStringStyle();
    public static final ToStringStyle fEb = new SimpleToStringStyle();
    private static final ThreadLocal<WeakHashMap<Object, Object>> fEc = new ThreadLocal();
    private static final long serialVersionUID = -2587890625525655916L;
    private boolean arrayContentDetail;
    private String arrayEnd;
    private String arraySeparator;
    private String arrayStart;
    private String contentEnd = "]";
    private String contentStart = "[";
    private boolean defaultFullDetail;
    private String fieldNameValueSeparator = "=";
    private String fieldSeparator;
    private boolean fieldSeparatorAtEnd = false;
    private boolean fieldSeparatorAtStart = false;
    private String nullText;
    private String sizeEndText;
    private String sizeStartText;
    private String summaryObjectEndText;
    private String summaryObjectStartText;
    private boolean useClassName = true;
    private boolean useFieldNames = true;
    private boolean useIdentityHashCode = true;
    private boolean useShortClassName = false;

    private static final class DefaultToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        DefaultToStringStyle() {
        }

        private Object readResolve() {
            return ToStringStyle.fDX;
        }
    }

    private static final class MultiLineToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        MultiLineToStringStyle() {
            ng("[");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(d.fBV);
            stringBuilder.append("  ");
            ni(stringBuilder.toString());
            hm(true);
            stringBuilder = new StringBuilder();
            stringBuilder.append(d.fBV);
            stringBuilder.append("]");
            nh(stringBuilder.toString());
        }

        private Object readResolve() {
            return ToStringStyle.fDY;
        }
    }

    private static final class NoFieldNameToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        NoFieldNameToStringStyle() {
            hl(false);
        }

        private Object readResolve() {
            return ToStringStyle.fDZ;
        }
    }

    private static final class ShortPrefixToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        ShortPrefixToStringStyle() {
            hj(true);
            hk(false);
        }

        private Object readResolve() {
            return ToStringStyle.fEa;
        }
    }

    private static final class SimpleToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1;

        SimpleToStringStyle() {
            hi(false);
            hk(false);
            hl(false);
            String str = "";
            ng(str);
            nh(str);
        }

        private Object readResolve() {
            return ToStringStyle.fEb;
        }
    }

    static Map<Object, Object> bQP() {
        return (Map) fEc.get();
    }

    static boolean eg(Object obj) {
        Map bQP = bQP();
        return bQP != null && bQP.containsKey(obj);
    }

    static void bb(Object obj) {
        if (obj != null) {
            if (bQP() == null) {
                fEc.set(new WeakHashMap());
            }
            bQP().put(obj, null);
        }
    }

    static void bc(Object obj) {
        if (obj != null) {
            Map bQP = bQP();
            if (bQP != null) {
                bQP.remove(obj);
                if (bQP.isEmpty()) {
                    fEc.remove();
                }
            }
        }
    }

    protected ToStringStyle() {
        String str = ",";
        this.fieldSeparator = str;
        this.arrayStart = "{";
        this.arraySeparator = str;
        this.arrayContentDetail = true;
        this.arrayEnd = "}";
        this.defaultFullDetail = true;
        this.nullText = "<null>";
        this.sizeStartText = "<size=";
        String str2 = ">";
        this.sizeEndText = str2;
        this.summaryObjectStartText = "<";
        this.summaryObjectEndText = str2;
    }

    public void b(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            d(stringBuffer, obj);
            e(stringBuffer, obj);
            b(stringBuffer);
            if (this.fieldSeparatorAtStart) {
                d(stringBuffer);
            }
        }
    }

    public void c(StringBuffer stringBuffer, Object obj) {
        if (!this.fieldSeparatorAtEnd) {
            a(stringBuffer);
        }
        c(stringBuffer);
        bc(obj);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer) {
        int length = stringBuffer.length();
        int length2 = this.fieldSeparator.length();
        if (length > 0 && length2 > 0 && length >= length2) {
            Object obj = null;
            for (int i = 0; i < length2; i++) {
                if (stringBuffer.charAt((length - 1) - i) != this.fieldSeparator.charAt((length2 - 1) - i)) {
                    break;
                }
            }
            obj = 1;
            if (obj != null) {
                stringBuffer.setLength(length - length2);
            }
        }
    }

    public void a(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
        b(stringBuffer, str);
        if (obj == null) {
            a(stringBuffer, str);
        } else {
            a(stringBuffer, str, obj, z(bool));
        }
        c(stringBuffer, str);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, Object obj, boolean z) {
        if (!eg(obj) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Character)) {
            bb(obj);
            try {
                if (obj instanceof Collection) {
                    if (z) {
                        a(stringBuffer, str, (Collection) obj);
                    } else {
                        b(stringBuffer, str, ((Collection) obj).size());
                    }
                } else if (obj instanceof Map) {
                    if (z) {
                        a(stringBuffer, str, (Map) obj);
                    } else {
                        b(stringBuffer, str, ((Map) obj).size());
                    }
                } else if (obj instanceof long[]) {
                    if (z) {
                        a(stringBuffer, str, (long[]) obj);
                    } else {
                        b(stringBuffer, str, (long[]) obj);
                    }
                } else if (obj instanceof int[]) {
                    if (z) {
                        a(stringBuffer, str, (int[]) obj);
                    } else {
                        b(stringBuffer, str, (int[]) obj);
                    }
                } else if (obj instanceof short[]) {
                    if (z) {
                        a(stringBuffer, str, (short[]) obj);
                    } else {
                        b(stringBuffer, str, (short[]) obj);
                    }
                } else if (obj instanceof byte[]) {
                    if (z) {
                        a(stringBuffer, str, (byte[]) obj);
                    } else {
                        b(stringBuffer, str, (byte[]) obj);
                    }
                } else if (obj instanceof char[]) {
                    if (z) {
                        a(stringBuffer, str, (char[]) obj);
                    } else {
                        b(stringBuffer, str, (char[]) obj);
                    }
                } else if (obj instanceof double[]) {
                    if (z) {
                        a(stringBuffer, str, (double[]) obj);
                    } else {
                        b(stringBuffer, str, (double[]) obj);
                    }
                } else if (obj instanceof float[]) {
                    if (z) {
                        a(stringBuffer, str, (float[]) obj);
                    } else {
                        b(stringBuffer, str, (float[]) obj);
                    }
                } else if (obj instanceof boolean[]) {
                    if (z) {
                        a(stringBuffer, str, (boolean[]) obj);
                    } else {
                        b(stringBuffer, str, (boolean[]) obj);
                    }
                } else if (obj.getClass().isArray()) {
                    if (z) {
                        a(stringBuffer, str, (Object[]) obj);
                    } else {
                        b(stringBuffer, str, (Object[]) obj);
                    }
                } else if (z) {
                    b(stringBuffer, str, obj);
                } else {
                    c(stringBuffer, str, obj);
                }
                bc(obj);
            } catch (Throwable th) {
                bc(obj);
            }
        } else {
            a(stringBuffer, str, obj);
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, Object obj) {
        ObjectUtils.a(stringBuffer, obj);
    }

    /* Access modifiers changed, original: protected */
    public void b(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, Collection<?> collection) {
        stringBuffer.append(collection);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, Map<?, ?> map) {
        stringBuffer.append(map);
    }

    /* Access modifiers changed, original: protected */
    public void c(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.summaryObjectStartText);
        stringBuffer.append(Z(obj.getClass()));
        stringBuffer.append(this.summaryObjectEndText);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, long j) {
        stringBuffer.append(j);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(i);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, short s) {
        stringBuffer.append(s);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, byte b) {
        stringBuffer.append(b);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, char c) {
        stringBuffer.append(c);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, double d) {
        stringBuffer.append(d);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, float f) {
        stringBuffer.append(f);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, boolean z) {
        stringBuffer.append(z);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, Object[] objArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            if (obj == null) {
                a(stringBuffer, str);
            } else {
                a(stringBuffer, str, obj, this.arrayContentDetail);
            }
        }
        stringBuffer.append(this.arrayEnd);
    }

    /* Access modifiers changed, original: protected */
    public void d(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.arrayStart);
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            Object obj2 = Array.get(obj, i);
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            if (obj2 == null) {
                a(stringBuffer, str);
            } else {
                a(stringBuffer, str, obj2, this.arrayContentDetail);
            }
        }
        stringBuffer.append(this.arrayEnd);
    }

    /* Access modifiers changed, original: protected */
    public void b(StringBuffer stringBuffer, String str, Object[] objArr) {
        b(stringBuffer, str, objArr.length);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, long[] jArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < jArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            a(stringBuffer, str, jArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    /* Access modifiers changed, original: protected */
    public void b(StringBuffer stringBuffer, String str, long[] jArr) {
        b(stringBuffer, str, jArr.length);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, int[] iArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            a(stringBuffer, str, iArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    /* Access modifiers changed, original: protected */
    public void b(StringBuffer stringBuffer, String str, int[] iArr) {
        b(stringBuffer, str, iArr.length);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, short[] sArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < sArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            a(stringBuffer, str, sArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    /* Access modifiers changed, original: protected */
    public void b(StringBuffer stringBuffer, String str, short[] sArr) {
        b(stringBuffer, str, sArr.length);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, byte[] bArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < bArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            a(stringBuffer, str, bArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    /* Access modifiers changed, original: protected */
    public void b(StringBuffer stringBuffer, String str, byte[] bArr) {
        b(stringBuffer, str, bArr.length);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, char[] cArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < cArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            a(stringBuffer, str, cArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    /* Access modifiers changed, original: protected */
    public void b(StringBuffer stringBuffer, String str, char[] cArr) {
        b(stringBuffer, str, cArr.length);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, double[] dArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < dArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            a(stringBuffer, str, dArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    /* Access modifiers changed, original: protected */
    public void b(StringBuffer stringBuffer, String str, double[] dArr) {
        b(stringBuffer, str, dArr.length);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, float[] fArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < fArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            a(stringBuffer, str, fArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    /* Access modifiers changed, original: protected */
    public void b(StringBuffer stringBuffer, String str, float[] fArr) {
        b(stringBuffer, str, fArr.length);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str, boolean[] zArr) {
        stringBuffer.append(this.arrayStart);
        for (int i = 0; i < zArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(this.arraySeparator);
            }
            a(stringBuffer, str, zArr[i]);
        }
        stringBuffer.append(this.arrayEnd);
    }

    /* Access modifiers changed, original: protected */
    public void b(StringBuffer stringBuffer, String str, boolean[] zArr) {
        b(stringBuffer, str, zArr.length);
    }

    /* Access modifiers changed, original: protected */
    public void d(StringBuffer stringBuffer, Object obj) {
        if (this.useClassName && obj != null) {
            bb(obj);
            if (this.useShortClassName) {
                stringBuffer.append(Z(obj.getClass()));
            } else {
                stringBuffer.append(obj.getClass().getName());
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void e(StringBuffer stringBuffer, Object obj) {
        if (bQQ() && obj != null) {
            bb(obj);
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* Access modifiers changed, original: protected */
    public void b(StringBuffer stringBuffer) {
        stringBuffer.append(this.contentStart);
    }

    /* Access modifiers changed, original: protected */
    public void c(StringBuffer stringBuffer) {
        stringBuffer.append(this.contentEnd);
    }

    /* Access modifiers changed, original: protected */
    public void a(StringBuffer stringBuffer, String str) {
        stringBuffer.append(this.nullText);
    }

    /* Access modifiers changed, original: protected */
    public void d(StringBuffer stringBuffer) {
        stringBuffer.append(this.fieldSeparator);
    }

    /* Access modifiers changed, original: protected */
    public void b(StringBuffer stringBuffer, String str) {
        if (this.useFieldNames && str != null) {
            stringBuffer.append(str);
            stringBuffer.append(this.fieldNameValueSeparator);
        }
    }

    /* Access modifiers changed, original: protected */
    public void c(StringBuffer stringBuffer, String str) {
        d(stringBuffer);
    }

    /* Access modifiers changed, original: protected */
    public void b(StringBuffer stringBuffer, String str, int i) {
        stringBuffer.append(this.sizeStartText);
        stringBuffer.append(i);
        stringBuffer.append(this.sizeEndText);
    }

    /* Access modifiers changed, original: protected */
    public boolean z(Boolean bool) {
        if (bool == null) {
            return this.defaultFullDetail;
        }
        return bool.booleanValue();
    }

    /* Access modifiers changed, original: protected */
    public String Z(Class<?> cls) {
        return b.Z(cls);
    }

    /* Access modifiers changed, original: protected */
    public void hi(boolean z) {
        this.useClassName = z;
    }

    /* Access modifiers changed, original: protected */
    public void hj(boolean z) {
        this.useShortClassName = z;
    }

    /* Access modifiers changed, original: protected */
    public boolean bQQ() {
        return this.useIdentityHashCode;
    }

    /* Access modifiers changed, original: protected */
    public void hk(boolean z) {
        this.useIdentityHashCode = z;
    }

    /* Access modifiers changed, original: protected */
    public void hl(boolean z) {
        this.useFieldNames = z;
    }

    /* Access modifiers changed, original: protected */
    public void ng(String str) {
        if (str == null) {
            str = "";
        }
        this.contentStart = str;
    }

    /* Access modifiers changed, original: protected */
    public void nh(String str) {
        if (str == null) {
            str = "";
        }
        this.contentEnd = str;
    }

    /* Access modifiers changed, original: protected */
    public void ni(String str) {
        if (str == null) {
            str = "";
        }
        this.fieldSeparator = str;
    }

    /* Access modifiers changed, original: protected */
    public void hm(boolean z) {
        this.fieldSeparatorAtStart = z;
    }

    /* Access modifiers changed, original: protected */
    public String bQR() {
        return this.nullText;
    }
}
