package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.core.R;
import androidx.core.view.ViewCompat;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class ColorStateListInflaterCompat {
    private static final int DEFAULT_COLOR = -65536;

    private ColorStateListInflaterCompat() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    @androidx.annotation.NonNull
    public static android.content.res.ColorStateList createFromXml(@androidx.annotation.NonNull android.content.res.Resources r4, @androidx.annotation.NonNull org.xmlpull.v1.XmlPullParser r5, @androidx.annotation.Nullable android.content.res.Resources.Theme r6) {
        /*
        r0 = android.util.Xml.asAttributeSet(r5);
    L_0x0004:
        r1 = r5.next();
        r2 = 2;
        if (r1 == r2) goto L_0x000f;
    L_0x000b:
        r3 = 1;
        if (r1 == r3) goto L_0x000f;
    L_0x000e:
        goto L_0x0004;
    L_0x000f:
        if (r1 != r2) goto L_0x0016;
    L_0x0011:
        r4 = createFromXmlInner(r4, r5, r0, r6);
        return r4;
    L_0x0016:
        r4 = new org.xmlpull.v1.XmlPullParserException;
        r5 = "No start tag found";
        r4.<init>(r5);
        goto L_0x001f;
    L_0x001e:
        throw r4;
    L_0x001f:
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ColorStateListInflaterCompat.createFromXml(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    @NonNull
    public static ColorStateList createFromXmlInner(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return inflate(resources, xmlPullParser, attributeSet, theme);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(xmlPullParser.getPositionDescription());
        stringBuilder.append(": invalid color state list tag ");
        stringBuilder.append(name);
        throw new XmlPullParserException(stringBuilder.toString());
    }

    private static ColorStateList inflate(@NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Theme theme) {
        AttributeSet attributeSet2 = attributeSet;
        int i = 1;
        int depth = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[objArr.length];
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray obtainAttributes = obtainAttributes(resources, theme, attributeSet2, R.styleable.ColorStateListItem);
                int color = obtainAttributes.getColor(R.styleable.ColorStateListItem_android_color, -65281);
                float f = 1.0f;
                if (obtainAttributes.hasValue(R.styleable.ColorStateListItem_android_alpha)) {
                    f = obtainAttributes.getFloat(R.styleable.ColorStateListItem_android_alpha, 1.0f);
                } else if (obtainAttributes.hasValue(R.styleable.ColorStateListItem_alpha)) {
                    f = obtainAttributes.getFloat(R.styleable.ColorStateListItem_alpha, 1.0f);
                }
                obtainAttributes.recycle();
                next = attributeSet.getAttributeCount();
                int[] iArr2 = new int[next];
                int i3 = 0;
                for (int i4 = 0; i4 < next; i4++) {
                    int attributeNameResource = attributeSet2.getAttributeNameResource(i4);
                    if (!(attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == R.attr.alpha)) {
                        i = i3 + 1;
                        if (!attributeSet2.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i3] = attributeNameResource;
                        i3 = i;
                    }
                }
                Object trimStateSet = StateSet.trimStateSet(iArr2, i3);
                next = modulateColorAlpha(color, f);
                if (i2 != 0) {
                    color = trimStateSet.length;
                }
                iArr = GrowingArrayUtils.append(iArr, i2, next);
                objArr = (int[][]) GrowingArrayUtils.append(objArr, i2, trimStateSet);
                i2++;
            } else {
                Resources resources2 = resources;
                Theme theme2 = theme;
            }
            i = 1;
        }
        int[] iArr3 = new int[i2];
        int[][] iArr4 = new int[i2][];
        System.arraycopy(iArr, 0, iArr3, 0, i2);
        System.arraycopy(objArr, 0, iArr4, 0, i2);
        return new ColorStateList(iArr4, iArr3);
    }

    private static TypedArray obtainAttributes(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @ColorInt
    private static int modulateColorAlpha(@ColorInt int i, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (Math.round(((float) Color.alpha(i)) * f) << 24);
    }
}
