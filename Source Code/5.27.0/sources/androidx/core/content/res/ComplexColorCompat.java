package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Shader;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class ComplexColorCompat {
    private static final String LOG_TAG = "ComplexColorCompat";
    private int mColor;
    private final ColorStateList mColorStateList;
    private final Shader mShader;

    private ComplexColorCompat(Shader shader, ColorStateList colorStateList, @ColorInt int i) {
        this.mShader = shader;
        this.mColorStateList = colorStateList;
        this.mColor = i;
    }

    static ComplexColorCompat from(@NonNull Shader shader) {
        return new ComplexColorCompat(shader, null, 0);
    }

    static ComplexColorCompat from(@NonNull ColorStateList colorStateList) {
        return new ComplexColorCompat(null, colorStateList, colorStateList.getDefaultColor());
    }

    static ComplexColorCompat from(@ColorInt int i) {
        return new ComplexColorCompat(null, null, i);
    }

    @Nullable
    public Shader getShader() {
        return this.mShader;
    }

    @ColorInt
    public int getColor() {
        return this.mColor;
    }

    public void setColor(@ColorInt int i) {
        this.mColor = i;
    }

    public boolean isGradient() {
        return this.mShader != null;
    }

    public boolean isStateful() {
        if (this.mShader == null) {
            ColorStateList colorStateList = this.mColorStateList;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }

    public boolean onStateChanged(int[] iArr) {
        if (isStateful()) {
            ColorStateList colorStateList = this.mColorStateList;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.mColor) {
                this.mColor = colorForState;
                return true;
            }
        }
        return false;
    }

    public boolean willDraw() {
        return isGradient() || this.mColor != 0;
    }

    @Nullable
    public static ComplexColorCompat inflate(@NonNull Resources resources, @ColorRes int i, @Nullable Theme theme) {
        try {
            return createFromXml(resources, i, theme);
        } catch (Exception e) {
            Log.e(LOG_TAG, "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    @androidx.annotation.NonNull
    private static androidx.core.content.res.ComplexColorCompat createFromXml(@androidx.annotation.NonNull android.content.res.Resources r6, @androidx.annotation.ColorRes int r7, @androidx.annotation.Nullable android.content.res.Resources.Theme r8) {
        /*
        r7 = r6.getXml(r7);
        r0 = android.util.Xml.asAttributeSet(r7);
    L_0x0008:
        r1 = r7.next();
        r2 = 2;
        r3 = 1;
        if (r1 == r2) goto L_0x0013;
    L_0x0010:
        if (r1 == r3) goto L_0x0013;
    L_0x0012:
        goto L_0x0008;
    L_0x0013:
        if (r1 != r2) goto L_0x0070;
    L_0x0015:
        r1 = r7.getName();
        r2 = -1;
        r4 = r1.hashCode();
        r5 = 89650992; // 0x557f730 float:1.01546526E-35 double:4.42934753E-316;
        if (r4 == r5) goto L_0x0033;
    L_0x0023:
        r5 = 1191572447; // 0x4705f3df float:34291.87 double:5.887150106E-315;
        if (r4 == r5) goto L_0x0029;
    L_0x0028:
        goto L_0x003c;
    L_0x0029:
        r4 = "selector";
        r4 = r1.equals(r4);
        if (r4 == 0) goto L_0x003c;
    L_0x0031:
        r2 = 0;
        goto L_0x003c;
    L_0x0033:
        r4 = "gradient";
        r4 = r1.equals(r4);
        if (r4 == 0) goto L_0x003c;
    L_0x003b:
        r2 = 1;
    L_0x003c:
        if (r2 == 0) goto L_0x0067;
    L_0x003e:
        if (r2 != r3) goto L_0x0049;
    L_0x0040:
        r6 = androidx.core.content.res.GradientColorInflaterCompat.createFromXmlInner(r6, r7, r0, r8);
        r6 = from(r6);
        return r6;
    L_0x0049:
        r6 = new org.xmlpull.v1.XmlPullParserException;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r7 = r7.getPositionDescription();
        r8.append(r7);
        r7 = ": unsupported complex color tag ";
        r8.append(r7);
        r8.append(r1);
        r7 = r8.toString();
        r6.<init>(r7);
        throw r6;
    L_0x0067:
        r6 = androidx.core.content.res.ColorStateListInflaterCompat.createFromXmlInner(r6, r7, r0, r8);
        r6 = from(r6);
        return r6;
    L_0x0070:
        r6 = new org.xmlpull.v1.XmlPullParserException;
        r7 = "No start tag found";
        r6.<init>(r7);
        goto L_0x0079;
    L_0x0078:
        throw r6;
    L_0x0079:
        goto L_0x0078;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ComplexColorCompat.createFromXml(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.core.content.res.ComplexColorCompat");
    }
}
