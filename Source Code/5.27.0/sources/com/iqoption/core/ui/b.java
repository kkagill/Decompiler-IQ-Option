package com.iqoption.core.ui;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.databinding.BindingConversion;
import com.iqoption.core.d;
import com.iqoption.core.ext.a;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, bng = {"convertAlphaArray", "", "typedArray", "Landroid/content/res/TypedArray;", "convertColorsArray", "convertFontNameToFont", "Landroid/graphics/Typeface;", "fontName", "", "convertToFloatArray", "", "convertToSpecsArray", "", "spec", "(Ljava/lang/String;)[[I", "core_release"})
/* compiled from: BindingConversions.kt */
public final class b {
    /* JADX WARNING: Missing block: B:30:0x00ac, code skipped:
            r6[r8] = r10 * r9;
            r8 = r8 + 1;
     */
    /* JADX WARNING: Missing block: B:31:0x00b3, code skipped:
            r0 = new java.lang.StringBuilder();
            r0.append("Unknown state: ");
            r0.append(r9);
     */
    /* JADX WARNING: Missing block: B:32:0x00cb, code skipped:
            throw new java.lang.IllegalArgumentException(r0.toString());
     */
    @androidx.databinding.BindingConversion
    public static final int[][] hf(java.lang.String r12) {
        /*
        r0 = "spec";
        kotlin.jvm.internal.i.f(r12, r0);
        r1 = r12;
        r1 = (java.lang.CharSequence) r1;
        r12 = 1;
        r2 = new char[r12];
        r0 = 0;
        r3 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r2[r0] = r3;
        r3 = 0;
        r4 = 0;
        r5 = 6;
        r6 = 0;
        r1 = kotlin.text.v.b(r1, r2, r3, r4, r5, r6);
        r2 = r1.size();
        r2 = new int[r2][];
        r3 = r2.length;
        r4 = 0;
    L_0x0020:
        if (r4 >= r3) goto L_0x00d4;
    L_0x0022:
        r5 = r1.size();
        r5 = r5 - r12;
        if (r4 == r5) goto L_0x00cc;
    L_0x0029:
        r5 = r1.get(r4);
        r6 = r5;
        r6 = (java.lang.CharSequence) r6;
        r7 = new char[r12];
        r5 = 44;
        r7[r0] = r5;
        r8 = 0;
        r9 = 0;
        r10 = 6;
        r11 = 0;
        r5 = kotlin.text.v.b(r6, r7, r8, r9, r10, r11);
        r6 = r5.size();
        r6 = new int[r6];
        r7 = r6.length;
        r8 = 0;
    L_0x0046:
        if (r8 >= r7) goto L_0x00ce;
    L_0x0048:
        r9 = r5.get(r8);
        r9 = (java.lang.String) r9;
        r10 = r9.charAt(r0);
        r11 = 33;
        if (r10 != r11) goto L_0x005c;
    L_0x0056:
        r10 = -1;
        r9 = kotlin.text.x.X(r9, r12);
        goto L_0x005d;
    L_0x005c:
        r10 = 1;
    L_0x005d:
        r11 = r9.hashCode();
        switch(r11) {
            case -1609594047: goto L_0x00a1;
            case -691041417: goto L_0x0095;
            case -318264286: goto L_0x0089;
            case 204392913: goto L_0x007d;
            case 742313895: goto L_0x0071;
            case 1191572123: goto L_0x0065;
            default: goto L_0x0064;
        };
    L_0x0064:
        goto L_0x00b3;
    L_0x0065:
        r11 = "selected";
        r11 = r9.equals(r11);
        if (r11 == 0) goto L_0x00b3;
    L_0x006d:
        r9 = 16842913; // 0x10100a1 float:2.369401E-38 double:8.3215047E-317;
        goto L_0x00ac;
    L_0x0071:
        r11 = "checked";
        r11 = r9.equals(r11);
        if (r11 == 0) goto L_0x00b3;
    L_0x0079:
        r9 = 16842912; // 0x10100a0 float:2.3694006E-38 double:8.321504E-317;
        goto L_0x00ac;
    L_0x007d:
        r11 = "activated";
        r11 = r9.equals(r11);
        if (r11 == 0) goto L_0x00b3;
    L_0x0085:
        r9 = 16843518; // 0x10102fe float:2.3695705E-38 double:8.3218036E-317;
        goto L_0x00ac;
    L_0x0089:
        r11 = "pressed";
        r11 = r9.equals(r11);
        if (r11 == 0) goto L_0x00b3;
    L_0x0091:
        r9 = 16842919; // 0x10100a7 float:2.3694026E-38 double:8.3215077E-317;
        goto L_0x00ac;
    L_0x0095:
        r11 = "focused";
        r11 = r9.equals(r11);
        if (r11 == 0) goto L_0x00b3;
    L_0x009d:
        r9 = 16842908; // 0x101009c float:2.3693995E-38 double:8.321502E-317;
        goto L_0x00ac;
    L_0x00a1:
        r11 = "enabled";
        r11 = r9.equals(r11);
        if (r11 == 0) goto L_0x00b3;
    L_0x00a9:
        r9 = 16842910; // 0x101009e float:2.3694E-38 double:8.321503E-317;
    L_0x00ac:
        r10 = r10 * r9;
        r6[r8] = r10;
        r8 = r8 + 1;
        goto L_0x0046;
    L_0x00b3:
        r12 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Unknown state: ";
        r0.append(r1);
        r0.append(r9);
        r0 = r0.toString();
        r12.<init>(r0);
        r12 = (java.lang.Throwable) r12;
        throw r12;
    L_0x00cc:
        r6 = com.iqoption.core.ext.c.bgU;
    L_0x00ce:
        r2[r4] = r6;
        r4 = r4 + 1;
        goto L_0x0020;
    L_0x00d4:
        r2 = (int[][]) r2;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ui.b.hf(java.lang.String):int[][]");
    }

    public static final int[] b(TypedArray typedArray) {
        kotlin.jvm.internal.i.f(typedArray, "typedArray");
        int[] iArr = new int[typedArray.length()];
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = typedArray.getColor(i, 0);
        }
        return iArr;
    }

    @BindingConversion
    public static final Typeface hg(String str) {
        kotlin.jvm.internal.i.f(str, "fontName");
        return a.getFont(d.Uo(), d.Uo().getResources().getIdentifier(str, "font", d.Uo().getPackageName()));
    }
}
