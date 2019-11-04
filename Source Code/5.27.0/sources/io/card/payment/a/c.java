package io.card.payment.a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: ViewUtil */
public class c {
    private static final Map<String, Integer> eLV = biT();
    static Pattern eLW = Pattern.compile("^\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$");
    static HashMap<String, Float> eLX = new HashMap();

    @TargetApi(16)
    public static void setBackground(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    static Map<String, Integer> biT() {
        HashMap hashMap = new HashMap();
        hashMap.put("px", Integer.valueOf(0));
        Integer valueOf = Integer.valueOf(1);
        hashMap.put("dip", valueOf);
        hashMap.put("dp", valueOf);
        hashMap.put("sp", Integer.valueOf(2));
        hashMap.put("pt", Integer.valueOf(3));
        hashMap.put("in", Integer.valueOf(4));
        hashMap.put("mm", Integer.valueOf(5));
        return Collections.unmodifiableMap(hashMap);
    }

    public static int d(String str, Context context) {
        return str == null ? 0 : (int) e(str, context);
    }

    @SuppressLint({"DefaultLocale"})
    public static float e(String str, Context context) {
        if (str == null) {
            return 0.0f;
        }
        str = str.toLowerCase();
        if (eLX.containsKey(str)) {
            return ((Float) eLX.get(str)).floatValue();
        }
        Matcher matcher = eLW.matcher(str);
        if (matcher.matches()) {
            float parseFloat = Float.parseFloat(matcher.group(1));
            Integer num = (Integer) eLV.get(matcher.group(3).toLowerCase());
            if (num == null) {
                num = Integer.valueOf(1);
            }
            float applyDimension = TypedValue.applyDimension(num.intValue(), parseFloat, context.getResources().getDisplayMetrics());
            eLX.put(str, Float.valueOf(applyDimension));
            return applyDimension;
        }
        throw new NumberFormatException();
    }

    public static void a(View view, String str, String str2, String str3, String str4) {
        Context context = view.getContext();
        view.setPadding(d(str, context), d(str2, context), d(str3, context), d(str4, context));
    }

    public static void b(View view, String str, String str2, String str3, String str4) {
        Context context = view.getContext();
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            ((MarginLayoutParams) layoutParams).setMargins(d(str, context), d(str2, context), d(str3, context), d(str4, context));
        }
    }

    public static void j(View view, int i, int i2) {
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
    }

    public static void a(Button button, boolean z, Context context, boolean z2) {
        j(button, -1, -2);
        button.setFocusable(true);
        String str = "0dip";
        String str2 = "10dip";
        a(button, str2, str, str2, str);
        if (!z2) {
            Drawable bV;
            if (z) {
                bV = b.bV(context);
            } else {
                bV = b.bZ(context);
            }
            setBackground(button, bV);
            button.setGravity(17);
            button.setMinimumHeight(d("54dip", context));
            button.setTextColor(-1);
            button.setTextSize(20.0f);
            button.setTypeface(b.eLU);
        }
    }
}
