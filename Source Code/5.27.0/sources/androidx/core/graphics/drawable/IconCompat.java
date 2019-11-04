package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {
    private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25f;
    private static final int AMBIENT_SHADOW_ALPHA = 30;
    private static final float BLUR_FACTOR = 0.010416667f;
    static final Mode DEFAULT_TINT_MODE = Mode.SRC_IN;
    private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666667f;
    private static final String EXTRA_INT1 = "int1";
    private static final String EXTRA_INT2 = "int2";
    private static final String EXTRA_OBJ = "obj";
    private static final String EXTRA_TINT_LIST = "tint_list";
    private static final String EXTRA_TINT_MODE = "tint_mode";
    private static final String EXTRA_TYPE = "type";
    private static final float ICON_DIAMETER_FACTOR = 0.9166667f;
    private static final int KEY_SHADOW_ALPHA = 61;
    private static final float KEY_SHADOW_OFFSET_FACTOR = 0.020833334f;
    private static final String TAG = "IconCompat";
    public static final int TYPE_UNKNOWN = -1;
    @RestrictTo({Scope.LIBRARY})
    public byte[] mData;
    @RestrictTo({Scope.LIBRARY})
    public int mInt1;
    @RestrictTo({Scope.LIBRARY})
    public int mInt2;
    Object mObj1;
    @RestrictTo({Scope.LIBRARY})
    public Parcelable mParcelable;
    @RestrictTo({Scope.LIBRARY})
    public ColorStateList mTintList = null;
    Mode mTintMode = DEFAULT_TINT_MODE;
    @RestrictTo({Scope.LIBRARY})
    public String mTintModeStr;
    @RestrictTo({Scope.LIBRARY})
    public int mType;

    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface IconType {
    }

    private static String typeToString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "BITMAP_MASKABLE" : "URI" : "DATA" : "RESOURCE" : "BITMAP";
    }

    public static IconCompat createWithResource(Context context, @DrawableRes int i) {
        if (context != null) {
            return createWithResource(context.getResources(), context.getPackageName(), i);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    @RestrictTo({Scope.LIBRARY})
    public static IconCompat createWithResource(Resources resources, String str, @DrawableRes int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.mInt1 = i;
            if (resources != null) {
                try {
                    iconCompat.mObj1 = resources.getResourceName(i);
                } catch (NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            }
            iconCompat.mObj1 = str;
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    public static IconCompat createWithBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.mObj1 = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat createWithAdaptiveBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(5);
            iconCompat.mObj1 = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat createWithData(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            IconCompat iconCompat = new IconCompat(3);
            iconCompat.mObj1 = bArr;
            iconCompat.mInt1 = i;
            iconCompat.mInt2 = i2;
            return iconCompat;
        }
        throw new IllegalArgumentException("Data must not be null.");
    }

    public static IconCompat createWithContentUri(String str) {
        if (str != null) {
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.mObj1 = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat createWithContentUri(Uri uri) {
        if (uri != null) {
            return createWithContentUri(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    private IconCompat(int i) {
        this.mType = i;
    }

    public int getType() {
        if (this.mType != -1 || VERSION.SDK_INT < 23) {
            return this.mType;
        }
        return getType((Icon) this.mObj1);
    }

    @NonNull
    public String getResPackage() {
        if (this.mType == -1 && VERSION.SDK_INT >= 23) {
            return getResPackage((Icon) this.mObj1);
        }
        if (this.mType == 2) {
            return ((String) this.mObj1).split(":", -1)[0];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("called getResPackage() on ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    @IdRes
    public int getResId() {
        if (this.mType == -1 && VERSION.SDK_INT >= 23) {
            return getResId((Icon) this.mObj1);
        }
        if (this.mType == 2) {
            return this.mInt1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("called getResId() on ");
        stringBuilder.append(this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    @NonNull
    public Uri getUri() {
        if (this.mType != -1 || VERSION.SDK_INT < 23) {
            return Uri.parse((String) this.mObj1);
        }
        return getUri((Icon) this.mObj1);
    }

    public IconCompat setTint(@ColorInt int i) {
        return setTintList(ColorStateList.valueOf(i));
    }

    public IconCompat setTintList(ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        return this;
    }

    public IconCompat setTintMode(Mode mode) {
        this.mTintMode = mode;
        return this;
    }

    @RequiresApi(23)
    public Icon toIcon() {
        int i = this.mType;
        if (i == -1) {
            return (Icon) this.mObj1;
        }
        Icon createWithBitmap;
        if (i == 1) {
            createWithBitmap = Icon.createWithBitmap((Bitmap) this.mObj1);
        } else if (i == 2) {
            createWithBitmap = Icon.createWithResource(getResPackage(), this.mInt1);
        } else if (i == 3) {
            createWithBitmap = Icon.createWithData((byte[]) this.mObj1, this.mInt1, this.mInt2);
        } else if (i == 4) {
            createWithBitmap = Icon.createWithContentUri((String) this.mObj1);
        } else if (i != 5) {
            throw new IllegalArgumentException("Unknown type");
        } else if (VERSION.SDK_INT >= 26) {
            createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.mObj1);
        } else {
            createWithBitmap = Icon.createWithBitmap(createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, false));
        }
        ColorStateList colorStateList = this.mTintList;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        Mode mode = this.mTintMode;
        if (mode != DEFAULT_TINT_MODE) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void checkResource(Context context) {
        if (this.mType == 2) {
            String str = (String) this.mObj1;
            String str2 = ":";
            if (str.contains(str2)) {
                String str3 = str.split(str2, -1)[1];
                String str4 = "/";
                String str5 = str3.split(str4, -1)[0];
                str3 = str3.split(str4, -1)[1];
                str = str.split(str2, -1)[0];
                int identifier = getResources(context, str).getIdentifier(str3, str5, str);
                if (this.mInt1 != identifier) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Id has changed for ");
                    stringBuilder.append(str);
                    stringBuilder.append(str4);
                    stringBuilder.append(str3);
                    Log.i(TAG, stringBuilder.toString());
                    this.mInt1 = identifier;
                }
            }
        }
    }

    public Drawable loadDrawable(Context context) {
        checkResource(context);
        if (VERSION.SDK_INT >= 23) {
            return toIcon().loadDrawable(context);
        }
        Drawable loadDrawableInner = loadDrawableInner(context);
        if (!(loadDrawableInner == null || (this.mTintList == null && this.mTintMode == DEFAULT_TINT_MODE))) {
            loadDrawableInner.mutate();
            DrawableCompat.setTintList(loadDrawableInner, this.mTintList);
            DrawableCompat.setTintMode(loadDrawableInner, this.mTintMode);
        }
        return loadDrawableInner;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
    private android.graphics.drawable.Drawable loadDrawableInner(android.content.Context r8) {
        /*
        r7 = this;
        r0 = r7.mType;
        r1 = 1;
        if (r0 == r1) goto L_0x00e9;
    L_0x0005:
        r2 = 0;
        r3 = 0;
        r4 = 2;
        r5 = "IconCompat";
        if (r0 == r4) goto L_0x00b3;
    L_0x000c:
        r1 = 3;
        if (r0 == r1) goto L_0x009b;
    L_0x000f:
        r1 = 4;
        if (r0 == r1) goto L_0x0029;
    L_0x0012:
        r1 = 5;
        if (r0 == r1) goto L_0x0017;
    L_0x0015:
        goto L_0x00e8;
    L_0x0017:
        r0 = new android.graphics.drawable.BitmapDrawable;
        r8 = r8.getResources();
        r1 = r7.mObj1;
        r1 = (android.graphics.Bitmap) r1;
        r1 = createLegacyIconFromAdaptiveIcon(r1, r2);
        r0.<init>(r8, r1);
        return r0;
    L_0x0029:
        r0 = r7.mObj1;
        r0 = (java.lang.String) r0;
        r0 = android.net.Uri.parse(r0);
        r1 = r0.getScheme();
        r2 = "content";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x006c;
    L_0x003d:
        r2 = "file";
        r1 = r2.equals(r1);
        if (r1 == 0) goto L_0x0046;
    L_0x0045:
        goto L_0x006c;
    L_0x0046:
        r1 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x0056 }
        r2 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x0056 }
        r4 = r7.mObj1;	 Catch:{ FileNotFoundException -> 0x0056 }
        r4 = (java.lang.String) r4;	 Catch:{ FileNotFoundException -> 0x0056 }
        r2.<init>(r4);	 Catch:{ FileNotFoundException -> 0x0056 }
        r1.<init>(r2);	 Catch:{ FileNotFoundException -> 0x0056 }
        r0 = r1;
        goto L_0x008b;
    L_0x0056:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = "Unable to load image from path: ";
        r2.append(r4);
        r2.append(r0);
        r0 = r2.toString();
        android.util.Log.w(r5, r0, r1);
        goto L_0x008a;
    L_0x006c:
        r1 = r8.getContentResolver();	 Catch:{ Exception -> 0x0075 }
        r0 = r1.openInputStream(r0);	 Catch:{ Exception -> 0x0075 }
        goto L_0x008b;
    L_0x0075:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = "Unable to load image from URI: ";
        r2.append(r4);
        r2.append(r0);
        r0 = r2.toString();
        android.util.Log.w(r5, r0, r1);
    L_0x008a:
        r0 = r3;
    L_0x008b:
        if (r0 == 0) goto L_0x00e8;
    L_0x008d:
        r1 = new android.graphics.drawable.BitmapDrawable;
        r8 = r8.getResources();
        r0 = android.graphics.BitmapFactory.decodeStream(r0);
        r1.<init>(r8, r0);
        return r1;
    L_0x009b:
        r0 = new android.graphics.drawable.BitmapDrawable;
        r8 = r8.getResources();
        r1 = r7.mObj1;
        r1 = (byte[]) r1;
        r1 = (byte[]) r1;
        r2 = r7.mInt1;
        r3 = r7.mInt2;
        r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r3);
        r0.<init>(r8, r1);
        return r0;
    L_0x00b3:
        r0 = r7.getResPackage();
        r6 = android.text.TextUtils.isEmpty(r0);
        if (r6 == 0) goto L_0x00c1;
    L_0x00bd:
        r0 = r8.getPackageName();
    L_0x00c1:
        r0 = getResources(r8, r0);
        r6 = r7.mInt1;	 Catch:{ RuntimeException -> 0x00d0 }
        r8 = r8.getTheme();	 Catch:{ RuntimeException -> 0x00d0 }
        r8 = androidx.core.content.res.ResourcesCompat.getDrawable(r0, r6, r8);	 Catch:{ RuntimeException -> 0x00d0 }
        return r8;
    L_0x00d0:
        r8 = move-exception;
        r0 = new java.lang.Object[r4];
        r4 = r7.mInt1;
        r4 = java.lang.Integer.valueOf(r4);
        r0[r2] = r4;
        r2 = r7.mObj1;
        r0[r1] = r2;
        r1 = "Unable to load resource 0x%08x from pkg=%s";
        r0 = java.lang.String.format(r1, r0);
        android.util.Log.e(r5, r0, r8);
    L_0x00e8:
        return r3;
    L_0x00e9:
        r0 = new android.graphics.drawable.BitmapDrawable;
        r8 = r8.getResources();
        r1 = r7.mObj1;
        r1 = (android.graphics.Bitmap) r1;
        r0.<init>(r8, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.loadDrawableInner(android.content.Context):android.graphics.drawable.Drawable");
    }

    private static Resources getResources(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (NameNotFoundException e) {
            Log.e(TAG, String.format("Unable to find pkg=%s for icon", new Object[]{str}), e);
            return null;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void addToShortcutIntent(@NonNull Intent intent, @Nullable Drawable drawable, @NonNull Context context) {
        Bitmap bitmap;
        checkResource(context);
        int i = this.mType;
        if (i == 1) {
            bitmap = (Bitmap) this.mObj1;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i == 2) {
            try {
                context = context.createPackageContext(getResPackage(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", ShortcutIconResource.fromContext(context, this.mInt1));
                    return;
                }
                Drawable drawable2 = ContextCompat.getDrawable(context, this.mInt1);
                if (drawable2.getIntrinsicWidth() > 0) {
                    if (drawable2.getIntrinsicHeight() > 0) {
                        bitmap = Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), Config.ARGB_8888);
                        drawable2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        drawable2.draw(new Canvas(bitmap));
                    }
                }
                int launcherLargeIconSize = ((ActivityManager) context.getSystemService("activity")).getLauncherLargeIconSize();
                bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Config.ARGB_8888);
                drawable2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                drawable2.draw(new Canvas(bitmap));
            } catch (NameNotFoundException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Can't find package ");
                stringBuilder.append(this.mObj1);
                throw new IllegalArgumentException(stringBuilder.toString(), e);
            }
        } else if (i == 5) {
            bitmap = createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, true);
        } else {
            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
        if (drawable != null) {
            i = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(i / 2, height / 2, i, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.mType;
        String str = EXTRA_OBJ;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        bundle.putByteArray(str, (byte[]) this.mObj1);
                    } else if (i != 4) {
                        if (i != 5) {
                            throw new IllegalArgumentException("Invalid icon");
                        }
                    }
                }
                bundle.putString(str, (String) this.mObj1);
            }
            bundle.putParcelable(str, (Bitmap) this.mObj1);
        } else {
            bundle.putParcelable(str, (Parcelable) this.mObj1);
        }
        bundle.putInt("type", this.mType);
        bundle.putInt(EXTRA_INT1, this.mInt1);
        bundle.putInt(EXTRA_INT2, this.mInt2);
        ColorStateList colorStateList = this.mTintList;
        if (colorStateList != null) {
            bundle.putParcelable(EXTRA_TINT_LIST, colorStateList);
        }
        Mode mode = this.mTintMode;
        if (mode != DEFAULT_TINT_MODE) {
            bundle.putString(EXTRA_TINT_MODE, mode.name());
        }
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARNING: Missing block: B:13:0x002b, code skipped:
            if (r1 != 5) goto L_0x009b;
     */
    public java.lang.String toString() {
        /*
        r4 = this;
        r0 = r4.mType;
        r1 = -1;
        if (r0 != r1) goto L_0x000c;
    L_0x0005:
        r0 = r4.mObj1;
        r0 = java.lang.String.valueOf(r0);
        return r0;
    L_0x000c:
        r0 = new java.lang.StringBuilder;
        r1 = "Icon(typ=";
        r0.<init>(r1);
        r1 = r4.mType;
        r1 = typeToString(r1);
        r0.append(r1);
        r1 = r4.mType;
        r2 = 1;
        if (r1 == r2) goto L_0x007a;
    L_0x0021:
        r3 = 2;
        if (r1 == r3) goto L_0x0052;
    L_0x0024:
        r2 = 3;
        if (r1 == r2) goto L_0x0039;
    L_0x0027:
        r2 = 4;
        if (r1 == r2) goto L_0x002e;
    L_0x002a:
        r2 = 5;
        if (r1 == r2) goto L_0x007a;
    L_0x002d:
        goto L_0x009b;
    L_0x002e:
        r1 = " uri=";
        r0.append(r1);
        r1 = r4.mObj1;
        r0.append(r1);
        goto L_0x009b;
    L_0x0039:
        r1 = " len=";
        r0.append(r1);
        r1 = r4.mInt1;
        r0.append(r1);
        r1 = r4.mInt2;
        if (r1 == 0) goto L_0x009b;
    L_0x0047:
        r1 = " off=";
        r0.append(r1);
        r1 = r4.mInt2;
        r0.append(r1);
        goto L_0x009b;
    L_0x0052:
        r1 = " pkg=";
        r0.append(r1);
        r1 = r4.getResPackage();
        r0.append(r1);
        r1 = " id=";
        r0.append(r1);
        r1 = new java.lang.Object[r2];
        r2 = 0;
        r3 = r4.getResId();
        r3 = java.lang.Integer.valueOf(r3);
        r1[r2] = r3;
        r2 = "0x%08x";
        r1 = java.lang.String.format(r2, r1);
        r0.append(r1);
        goto L_0x009b;
    L_0x007a:
        r1 = " size=";
        r0.append(r1);
        r1 = r4.mObj1;
        r1 = (android.graphics.Bitmap) r1;
        r1 = r1.getWidth();
        r0.append(r1);
        r1 = "x";
        r0.append(r1);
        r1 = r4.mObj1;
        r1 = (android.graphics.Bitmap) r1;
        r1 = r1.getHeight();
        r0.append(r1);
    L_0x009b:
        r1 = r4.mTintList;
        if (r1 == 0) goto L_0x00a9;
    L_0x009f:
        r1 = " tint=";
        r0.append(r1);
        r1 = r4.mTintList;
        r0.append(r1);
    L_0x00a9:
        r1 = r4.mTintMode;
        r2 = DEFAULT_TINT_MODE;
        if (r1 == r2) goto L_0x00b9;
    L_0x00af:
        r1 = " mode=";
        r0.append(r1);
        r1 = r4.mTintMode;
        r0.append(r1);
    L_0x00b9:
        r1 = ")";
        r0.append(r1);
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    public void onPreParceling(boolean z) {
        this.mTintModeStr = this.mTintMode.name();
        int i = this.mType;
        if (i != -1) {
            if (i != 1) {
                String str = "UTF-16";
                if (i == 2) {
                    this.mData = ((String) this.mObj1).getBytes(Charset.forName(str));
                    return;
                } else if (i == 3) {
                    this.mData = (byte[]) this.mObj1;
                    return;
                } else if (i == 4) {
                    this.mData = this.mObj1.toString().getBytes(Charset.forName(str));
                    return;
                } else if (i != 5) {
                    return;
                }
            }
            if (z) {
                Bitmap bitmap = (Bitmap) this.mObj1;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(CompressFormat.PNG, 90, byteArrayOutputStream);
                this.mData = byteArrayOutputStream.toByteArray();
                return;
            }
            this.mParcelable = (Parcelable) this.mObj1;
        } else if (z) {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        } else {
            this.mParcelable = (Parcelable) this.mObj1;
        }
    }

    public void onPostParceling() {
        this.mTintMode = Mode.valueOf(this.mTintModeStr);
        int i = this.mType;
        Parcelable parcelable;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.mObj1 = this.mData;
                        return;
                    } else if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    }
                }
                this.mObj1 = new String(this.mData, Charset.forName("UTF-16"));
                return;
            }
            parcelable = this.mParcelable;
            if (parcelable != null) {
                this.mObj1 = parcelable;
                return;
            }
            byte[] bArr = this.mData;
            this.mObj1 = bArr;
            this.mType = 3;
            this.mInt1 = 0;
            this.mInt2 = bArr.length;
            return;
        }
        parcelable = this.mParcelable;
        if (parcelable != null) {
            this.mObj1 = parcelable;
            return;
        }
        throw new IllegalArgumentException("Invalid icon");
    }

    @Nullable
    public static IconCompat createFromBundle(@NonNull Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.mInt1 = bundle.getInt(EXTRA_INT1);
        iconCompat.mInt2 = bundle.getInt(EXTRA_INT2);
        String str = EXTRA_TINT_LIST;
        if (bundle.containsKey(str)) {
            iconCompat.mTintList = (ColorStateList) bundle.getParcelable(str);
        }
        str = EXTRA_TINT_MODE;
        if (bundle.containsKey(str)) {
            iconCompat.mTintMode = Mode.valueOf(bundle.getString(str));
        }
        String str2 = EXTRA_OBJ;
        if (!(i == -1 || i == 1)) {
            if (i != 2) {
                if (i == 3) {
                    iconCompat.mObj1 = bundle.getByteArray(str2);
                    return iconCompat;
                } else if (i != 4) {
                    if (i != 5) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown type ");
                        stringBuilder.append(i);
                        Log.w(TAG, stringBuilder.toString());
                        return null;
                    }
                }
            }
            iconCompat.mObj1 = bundle.getString(str2);
            return iconCompat;
        }
        iconCompat.mObj1 = bundle.getParcelable(str2);
        return iconCompat;
    }

    @RequiresApi(23)
    @Nullable
    public static IconCompat createFromIcon(@NonNull Context context, @NonNull Icon icon) {
        Preconditions.checkNotNull(icon);
        int type = getType(icon);
        if (type == 2) {
            String resPackage = getResPackage(icon);
            try {
                return createWithResource(getResources(context, resPackage), resPackage, getResId(icon));
            } catch (NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else if (type == 4) {
            return createWithContentUri(getUri(icon));
        } else {
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.mObj1 = icon;
            return iconCompat;
        }
    }

    @RequiresApi(23)
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static IconCompat createFromIcon(@NonNull Icon icon) {
        Preconditions.checkNotNull(icon);
        int type = getType(icon);
        if (type == 2) {
            return createWithResource(null, getResPackage(icon), getResId(icon));
        }
        if (type == 4) {
            return createWithContentUri(getUri(icon));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.mObj1 = icon;
        return iconCompat;
    }

    @RequiresApi(23)
    private static int getType(@NonNull Icon icon) {
        StringBuilder stringBuilder;
        String str = "Unable to get icon type ";
        String str2 = TAG;
        if (VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        Object icon2;
        try {
            icon2 = ((Integer) icon2.getClass().getMethod("getType", new Class[0]).invoke(icon2, new Object[0])).intValue();
            return icon2;
        } catch (IllegalAccessException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(icon2);
            Log.e(str2, stringBuilder.toString(), e);
            return -1;
        } catch (InvocationTargetException e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(icon2);
            Log.e(str2, stringBuilder.toString(), e2);
            return -1;
        } catch (NoSuchMethodException e3) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(icon2);
            Log.e(str2, stringBuilder.toString(), e3);
            return -1;
        }
    }

    @RequiresApi(23)
    @Nullable
    private static String getResPackage(@NonNull Icon icon) {
        String str = "Unable to get icon package";
        String str2 = TAG;
        if (VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e(str2, str, e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e(str2, str, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e(str2, str, e3);
            return null;
        }
    }

    @RequiresApi(23)
    @IdRes
    @DrawableRes
    private static int getResId(@NonNull Icon icon) {
        String str = "Unable to get icon resource";
        String str2 = TAG;
        if (VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e(str2, str, e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e(str2, str, e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e(str2, str, e3);
            return 0;
        }
    }

    @RequiresApi(23)
    @Nullable
    private static Uri getUri(@NonNull Icon icon) {
        String str = "Unable to get icon uri";
        String str2 = TAG;
        if (VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e(str2, str, e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e(str2, str, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e(str2, str, e3);
            return null;
        }
    }

    @VisibleForTesting
    static Bitmap createLegacyIconFromAdaptiveIcon(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * DEFAULT_VIEW_PORT_SCALE);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = ICON_DIAMETER_FACTOR * f2;
        if (z) {
            float f4 = BLUR_FACTOR * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * KEY_SHADOW_OFFSET_FACTOR, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        BitmapShader bitmapShader = new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }
}
