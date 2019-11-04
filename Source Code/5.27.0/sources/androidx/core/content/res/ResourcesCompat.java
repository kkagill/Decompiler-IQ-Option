package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.core.util.Preconditions;

public final class ResourcesCompat {
    private static final String TAG = "ResourcesCompat";

    public static abstract class FontCallback {
        public abstract void onFontRetrievalFailed(int i);

        public abstract void onFontRetrieved(@NonNull Typeface typeface);

        @RestrictTo({Scope.LIBRARY_GROUP})
        public final void callbackSuccessAsync(final Typeface typeface, @Nullable Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    FontCallback.this.onFontRetrieved(typeface);
                }
            });
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        public final void callbackFailAsync(final int i, @Nullable Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    FontCallback.this.onFontRetrievalFailed(i);
                }
            });
        }
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Resources resources, @DrawableRes int i, @Nullable Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    @Nullable
    public static Drawable getDrawableForDensity(@NonNull Resources resources, @DrawableRes int i, int i2, @Nullable Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
        if (VERSION.SDK_INT >= 15) {
            return resources.getDrawableForDensity(i, i2);
        }
        return resources.getDrawable(i);
    }

    @ColorInt
    public static int getColor(@NonNull Resources resources, @ColorRes int i, @Nullable Theme theme) {
        if (VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Resources resources, @ColorRes int i, @Nullable Theme theme) {
        if (VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i, theme);
        }
        return resources.getColorStateList(i);
    }

    @Nullable
    public static Typeface getFont(@NonNull Context context, @FontRes int i) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new TypedValue(), 0, null, null, false);
    }

    public static void getFont(@NonNull Context context, @FontRes int i, @NonNull FontCallback fontCallback, @Nullable Handler handler) {
        Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
            return;
        }
        loadFont(context, i, new TypedValue(), 0, fontCallback, handler, false);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public static Typeface getFont(@NonNull Context context, @FontRes int i, TypedValue typedValue, int i2, @Nullable FontCallback fontCallback) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, typedValue, i2, fontCallback, null, true);
    }

    private static Typeface loadFont(@NonNull Context context, int i, TypedValue typedValue, int i2, @Nullable FontCallback fontCallback, @Nullable Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface loadFont = loadFont(context, resources, typedValue, i, i2, fontCallback, handler, z);
        if (loadFont != null || fontCallback != null) {
            return loadFont;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Font resource ID #0x");
        stringBuilder.append(Integer.toHexString(i));
        stringBuilder.append(" could not be retrieved.");
        throw new NotFoundException(stringBuilder.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    private static android.graphics.Typeface loadFont(@androidx.annotation.NonNull android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, @androidx.annotation.Nullable androidx.core.content.res.ResourcesCompat.FontCallback r20, @androidx.annotation.Nullable android.os.Handler r21, boolean r22) {
        /*
        r0 = r16;
        r1 = r17;
        r4 = r18;
        r5 = r19;
        r9 = r20;
        r10 = r21;
        r11 = "ResourcesCompat";
        r2 = r1.string;
        if (r2 == 0) goto L_0x00a9;
    L_0x0012:
        r1 = r1.string;
        r12 = r1.toString();
        r1 = "res/";
        r1 = r12.startsWith(r1);
        r13 = 0;
        r14 = -3;
        if (r1 != 0) goto L_0x0028;
    L_0x0022:
        if (r9 == 0) goto L_0x0027;
    L_0x0024:
        r9.callbackFailAsync(r14, r10);
    L_0x0027:
        return r13;
    L_0x0028:
        r1 = androidx.core.graphics.TypefaceCompat.findFromCache(r0, r4, r5);
        if (r1 == 0) goto L_0x0034;
    L_0x002e:
        if (r9 == 0) goto L_0x0033;
    L_0x0030:
        r9.callbackSuccessAsync(r1, r10);
    L_0x0033:
        return r1;
    L_0x0034:
        r1 = r12.toLowerCase();	 Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
        r2 = ".xml";
        r1 = r1.endsWith(r2);	 Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
        if (r1 == 0) goto L_0x0067;
    L_0x0040:
        r1 = r0.getXml(r4);	 Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
        r2 = androidx.core.content.res.FontResourcesParserCompat.parse(r1, r0);	 Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
        if (r2 != 0) goto L_0x0055;
    L_0x004a:
        r0 = "Failed to find font-family tag";
        android.util.Log.e(r11, r0);	 Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
        if (r9 == 0) goto L_0x0054;
    L_0x0051:
        r9.callbackFailAsync(r14, r10);	 Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
    L_0x0054:
        return r13;
    L_0x0055:
        r1 = r15;
        r3 = r16;
        r4 = r18;
        r5 = r19;
        r6 = r20;
        r7 = r21;
        r8 = r22;
        r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFamilyXml(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
        return r0;
    L_0x0067:
        r1 = r15;
        r0 = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(r15, r0, r4, r12, r5);	 Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
        if (r9 == 0) goto L_0x0077;
    L_0x006e:
        if (r0 == 0) goto L_0x0074;
    L_0x0070:
        r9.callbackSuccessAsync(r0, r10);	 Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
        goto L_0x0077;
    L_0x0074:
        r9.callbackFailAsync(r14, r10);	 Catch:{ XmlPullParserException -> 0x008e, IOException -> 0x0078 }
    L_0x0077:
        return r0;
    L_0x0078:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Failed to read xml resource ";
        r1.append(r2);
        r1.append(r12);
        r1 = r1.toString();
        android.util.Log.e(r11, r1, r0);
        goto L_0x00a3;
    L_0x008e:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Failed to parse xml resource ";
        r1.append(r2);
        r1.append(r12);
        r1 = r1.toString();
        android.util.Log.e(r11, r1, r0);
    L_0x00a3:
        if (r9 == 0) goto L_0x00a8;
    L_0x00a5:
        r9.callbackFailAsync(r14, r10);
    L_0x00a8:
        return r13;
    L_0x00a9:
        r2 = new android.content.res.Resources$NotFoundException;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r5 = "Resource \"";
        r3.append(r5);
        r0 = r0.getResourceName(r4);
        r3.append(r0);
        r0 = "\" (";
        r3.append(r0);
        r0 = java.lang.Integer.toHexString(r18);
        r3.append(r0);
        r0 = ") is not a Font: ";
        r3.append(r0);
        r3.append(r1);
        r0 = r3.toString();
        r2.<init>(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.ResourcesCompat.loadFont(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.ResourcesCompat$FontCallback, android.os.Handler, boolean):android.graphics.Typeface");
    }

    private ResourcesCompat() {
    }
}
