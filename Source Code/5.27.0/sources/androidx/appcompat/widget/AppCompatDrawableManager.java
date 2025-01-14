package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({Scope.LIBRARY_GROUP})
public final class AppCompatDrawableManager {
    private static final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
    private static final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
    private static final ColorFilterLruCache COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
    private static final boolean DEBUG = false;
    private static final Mode DEFAULT_MODE = Mode.SRC_IN;
    private static AppCompatDrawableManager INSTANCE = null;
    private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
    private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
    private static final String TAG = "AppCompatDrawableManag";
    private static final int[] TINT_CHECKABLE_BUTTON_LIST = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material};
    private static final int[] TINT_COLOR_CONTROL_NORMAL = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    private static final int[] TINT_COLOR_CONTROL_STATE_LIST = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
    private ArrayMap<String, InflateDelegate> mDelegates;
    private final WeakHashMap<Context, LongSparseArray<WeakReference<ConstantState>>> mDrawableCaches = new WeakHashMap(0);
    private boolean mHasCheckedVectorDrawableSetup;
    private SparseArrayCompat<String> mKnownDrawableIdTags;
    private WeakHashMap<Context, SparseArrayCompat<ColorStateList>> mTintLists;
    private TypedValue mTypedValue;

    private interface InflateDelegate {
        Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Theme theme);
    }

    @RequiresApi(11)
    static class AsldcInflateDelegate implements InflateDelegate {
        AsldcInflateDelegate() {
        }

        public Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Theme theme) {
            try {
                return AnimatedStateListDrawableCompat.createFromXmlInner(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    private static class AvdcInflateDelegate implements InflateDelegate {
        AvdcInflateDelegate() {
        }

        public Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Theme theme) {
            try {
                return AnimatedVectorDrawableCompat.createFromXmlInner(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    private static class ColorFilterLruCache extends LruCache<Integer, PorterDuffColorFilter> {
        public ColorFilterLruCache(int i) {
            super(i);
        }

        /* Access modifiers changed, original: 0000 */
        public PorterDuffColorFilter get(int i, Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(generateCacheKey(i, mode)));
        }

        /* Access modifiers changed, original: 0000 */
        public PorterDuffColorFilter put(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(generateCacheKey(i, mode)), porterDuffColorFilter);
        }

        private static int generateCacheKey(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    private static class VdcInflateDelegate implements InflateDelegate {
        VdcInflateDelegate() {
        }

        public Drawable createFromXmlInner(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Theme theme) {
            try {
                return VectorDrawableCompat.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    public static synchronized AppCompatDrawableManager get() {
        AppCompatDrawableManager appCompatDrawableManager;
        synchronized (AppCompatDrawableManager.class) {
            if (INSTANCE == null) {
                INSTANCE = new AppCompatDrawableManager();
                installDefaultInflateDelegates(INSTANCE);
            }
            appCompatDrawableManager = INSTANCE;
        }
        return appCompatDrawableManager;
    }

    private static void installDefaultInflateDelegates(@NonNull AppCompatDrawableManager appCompatDrawableManager) {
        if (VERSION.SDK_INT < 24) {
            appCompatDrawableManager.addDelegate("vector", new VdcInflateDelegate());
            appCompatDrawableManager.addDelegate("animated-vector", new AvdcInflateDelegate());
            appCompatDrawableManager.addDelegate("animated-selector", new AsldcInflateDelegate());
        }
    }

    public synchronized Drawable getDrawable(@NonNull Context context, @DrawableRes int i) {
        return getDrawable(context, i, false);
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized Drawable getDrawable(@NonNull Context context, @DrawableRes int i, boolean z) {
        Drawable loadDrawableFromDelegates;
        checkVectorDrawableSetup(context);
        loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = createDrawableIfNeeded(context, i);
        }
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = ContextCompat.getDrawable(context, i);
        }
        if (loadDrawableFromDelegates != null) {
            loadDrawableFromDelegates = tintDrawable(context, i, z, loadDrawableFromDelegates);
        }
        if (loadDrawableFromDelegates != null) {
            DrawableUtils.fixDrawable(loadDrawableFromDelegates);
        }
        return loadDrawableFromDelegates;
    }

    public synchronized void onConfigurationChanged(@NonNull Context context) {
        LongSparseArray longSparseArray = (LongSparseArray) this.mDrawableCaches.get(context);
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    private static long createCacheKey(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable createDrawableIfNeeded(@NonNull Context context, @DrawableRes int i) {
        if (this.mTypedValue == null) {
            this.mTypedValue = new TypedValue();
        }
        TypedValue typedValue = this.mTypedValue;
        context.getResources().getValue(i, typedValue, true);
        long createCacheKey = createCacheKey(typedValue);
        Drawable cachedDrawable = getCachedDrawable(context, createCacheKey);
        if (cachedDrawable != null) {
            return cachedDrawable;
        }
        if (i == R.drawable.abc_cab_background_top_material) {
            cachedDrawable = new LayerDrawable(new Drawable[]{getDrawable(context, R.drawable.abc_cab_background_internal_bg), getDrawable(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (cachedDrawable != null) {
            cachedDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            addDrawableToCache(context, createCacheKey, cachedDrawable);
        }
        return cachedDrawable;
    }

    private Drawable tintDrawable(@NonNull Context context, @DrawableRes int i, boolean z, @NonNull Drawable drawable) {
        ColorStateList tintList = getTintList(context, i);
        LayerDrawable layerDrawable;
        if (tintList != null) {
            if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = DrawableCompat.wrap(drawable);
            DrawableCompat.setTintList(drawable, tintList);
            Mode tintMode = getTintMode(i);
            if (tintMode == null) {
                return drawable;
            }
            DrawableCompat.setTintMode(drawable, tintMode);
            return drawable;
        } else if (i == R.drawable.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908288), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlNormal), DEFAULT_MODE);
            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908303), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlNormal), DEFAULT_MODE);
            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), DEFAULT_MODE);
            return drawable;
        } else if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
            layerDrawable = (LayerDrawable) drawable;
            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908288), ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorControlNormal), DEFAULT_MODE);
            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908303), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), DEFAULT_MODE);
            setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), DEFAULT_MODE);
            return drawable;
        } else if (tintDrawableUsingColorFilter(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c A:{Catch:{ Exception -> 0x00a4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075 A:{Catch:{ Exception -> 0x00a4 }} */
    private android.graphics.drawable.Drawable loadDrawableFromDelegates(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.DrawableRes int r12) {
        /*
        r10 = this;
        r0 = r10.mDelegates;
        r1 = 0;
        if (r0 == 0) goto L_0x00b4;
    L_0x0005:
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00b4;
    L_0x000b:
        r0 = r10.mKnownDrawableIdTags;
        r2 = "appcompat_skip_skip";
        if (r0 == 0) goto L_0x0028;
    L_0x0011:
        r0 = r0.get(r12);
        r0 = (java.lang.String) r0;
        r3 = r2.equals(r0);
        if (r3 != 0) goto L_0x0027;
    L_0x001d:
        if (r0 == 0) goto L_0x002f;
    L_0x001f:
        r3 = r10.mDelegates;
        r0 = r3.get(r0);
        if (r0 != 0) goto L_0x002f;
    L_0x0027:
        return r1;
    L_0x0028:
        r0 = new androidx.collection.SparseArrayCompat;
        r0.<init>();
        r10.mKnownDrawableIdTags = r0;
    L_0x002f:
        r0 = r10.mTypedValue;
        if (r0 != 0) goto L_0x003a;
    L_0x0033:
        r0 = new android.util.TypedValue;
        r0.<init>();
        r10.mTypedValue = r0;
    L_0x003a:
        r0 = r10.mTypedValue;
        r1 = r11.getResources();
        r3 = 1;
        r1.getValue(r12, r0, r3);
        r4 = createCacheKey(r0);
        r6 = r10.getCachedDrawable(r11, r4);
        if (r6 == 0) goto L_0x004f;
    L_0x004e:
        return r6;
    L_0x004f:
        r7 = r0.string;
        if (r7 == 0) goto L_0x00ac;
    L_0x0053:
        r7 = r0.string;
        r7 = r7.toString();
        r8 = ".xml";
        r7 = r7.endsWith(r8);
        if (r7 == 0) goto L_0x00ac;
    L_0x0061:
        r1 = r1.getXml(r12);	 Catch:{ Exception -> 0x00a4 }
        r7 = android.util.Xml.asAttributeSet(r1);	 Catch:{ Exception -> 0x00a4 }
    L_0x0069:
        r8 = r1.next();	 Catch:{ Exception -> 0x00a4 }
        r9 = 2;
        if (r8 == r9) goto L_0x0073;
    L_0x0070:
        if (r8 == r3) goto L_0x0073;
    L_0x0072:
        goto L_0x0069;
    L_0x0073:
        if (r8 != r9) goto L_0x009c;
    L_0x0075:
        r3 = r1.getName();	 Catch:{ Exception -> 0x00a4 }
        r8 = r10.mKnownDrawableIdTags;	 Catch:{ Exception -> 0x00a4 }
        r8.append(r12, r3);	 Catch:{ Exception -> 0x00a4 }
        r8 = r10.mDelegates;	 Catch:{ Exception -> 0x00a4 }
        r3 = r8.get(r3);	 Catch:{ Exception -> 0x00a4 }
        r3 = (androidx.appcompat.widget.AppCompatDrawableManager.InflateDelegate) r3;	 Catch:{ Exception -> 0x00a4 }
        if (r3 == 0) goto L_0x0091;
    L_0x0088:
        r8 = r11.getTheme();	 Catch:{ Exception -> 0x00a4 }
        r1 = r3.createFromXmlInner(r11, r1, r7, r8);	 Catch:{ Exception -> 0x00a4 }
        r6 = r1;
    L_0x0091:
        if (r6 == 0) goto L_0x00ac;
    L_0x0093:
        r0 = r0.changingConfigurations;	 Catch:{ Exception -> 0x00a4 }
        r6.setChangingConfigurations(r0);	 Catch:{ Exception -> 0x00a4 }
        r10.addDrawableToCache(r11, r4, r6);	 Catch:{ Exception -> 0x00a4 }
        goto L_0x00ac;
    L_0x009c:
        r11 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ Exception -> 0x00a4 }
        r0 = "No start tag found";
        r11.<init>(r0);	 Catch:{ Exception -> 0x00a4 }
        throw r11;	 Catch:{ Exception -> 0x00a4 }
    L_0x00a4:
        r11 = move-exception;
        r0 = "AppCompatDrawableManag";
        r1 = "Exception while inflating drawable";
        android.util.Log.e(r0, r1, r11);
    L_0x00ac:
        if (r6 != 0) goto L_0x00b3;
    L_0x00ae:
        r11 = r10.mKnownDrawableIdTags;
        r11.append(r12, r2);
    L_0x00b3:
        return r6;
    L_0x00b4:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.loadDrawableFromDelegates(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Missing block: B:18:0x002c, code skipped:
            return null;
     */
    private synchronized android.graphics.drawable.Drawable getCachedDrawable(@androidx.annotation.NonNull android.content.Context r4, long r5) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.mDrawableCaches;	 Catch:{ all -> 0x002d }
        r0 = r0.get(r4);	 Catch:{ all -> 0x002d }
        r0 = (androidx.collection.LongSparseArray) r0;	 Catch:{ all -> 0x002d }
        r1 = 0;
        if (r0 != 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r3);
        return r1;
    L_0x000e:
        r2 = r0.get(r5);	 Catch:{ all -> 0x002d }
        r2 = (java.lang.ref.WeakReference) r2;	 Catch:{ all -> 0x002d }
        if (r2 == 0) goto L_0x002b;
    L_0x0016:
        r2 = r2.get();	 Catch:{ all -> 0x002d }
        r2 = (android.graphics.drawable.Drawable.ConstantState) r2;	 Catch:{ all -> 0x002d }
        if (r2 == 0) goto L_0x0028;
    L_0x001e:
        r4 = r4.getResources();	 Catch:{ all -> 0x002d }
        r4 = r2.newDrawable(r4);	 Catch:{ all -> 0x002d }
        monitor-exit(r3);
        return r4;
    L_0x0028:
        r0.delete(r5);	 Catch:{ all -> 0x002d }
    L_0x002b:
        monitor-exit(r3);
        return r1;
    L_0x002d:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.getCachedDrawable(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    private synchronized boolean addDrawableToCache(@NonNull Context context, long j, @NonNull Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        LongSparseArray longSparseArray = (LongSparseArray) this.mDrawableCaches.get(context);
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray();
            this.mDrawableCaches.put(context, longSparseArray);
        }
        longSparseArray.put(j, new WeakReference(constantState));
        return true;
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized Drawable onDrawableLoadedFromResources(@NonNull Context context, @NonNull VectorEnabledTintResources vectorEnabledTintResources, @DrawableRes int i) {
        Drawable loadDrawableFromDelegates = loadDrawableFromDelegates(context, i);
        if (loadDrawableFromDelegates == null) {
            loadDrawableFromDelegates = vectorEnabledTintResources.superGetDrawable(i);
        }
        if (loadDrawableFromDelegates == null) {
            return null;
        }
        return tintDrawable(context, i, false, loadDrawableFromDelegates);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    static boolean tintDrawableUsingColorFilter(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.DrawableRes int r7, @androidx.annotation.NonNull android.graphics.drawable.Drawable r8) {
        /*
        r0 = DEFAULT_MODE;
        r1 = COLORFILTER_TINT_COLOR_CONTROL_NORMAL;
        r1 = arrayContains(r1, r7);
        r2 = 16842801; // 0x1010031 float:2.3693695E-38 double:8.3214494E-317;
        r3 = -1;
        r4 = 0;
        r5 = 1;
        if (r1 == 0) goto L_0x0015;
    L_0x0010:
        r2 = androidx.appcompat.R.attr.colorControlNormal;
    L_0x0012:
        r7 = 1;
        r1 = -1;
        goto L_0x0044;
    L_0x0015:
        r1 = COLORFILTER_COLOR_CONTROL_ACTIVATED;
        r1 = arrayContains(r1, r7);
        if (r1 == 0) goto L_0x0020;
    L_0x001d:
        r2 = androidx.appcompat.R.attr.colorControlActivated;
        goto L_0x0012;
    L_0x0020:
        r1 = COLORFILTER_COLOR_BACKGROUND_MULTIPLY;
        r1 = arrayContains(r1, r7);
        if (r1 == 0) goto L_0x002b;
    L_0x0028:
        r0 = android.graphics.PorterDuff.Mode.MULTIPLY;
        goto L_0x0012;
    L_0x002b:
        r1 = androidx.appcompat.R.drawable.abc_list_divider_mtrl_alpha;
        if (r7 != r1) goto L_0x003c;
    L_0x002f:
        r2 = 16842800; // 0x1010030 float:2.3693693E-38 double:8.321449E-317;
        r7 = 1109603123; // 0x42233333 float:40.8 double:5.482167836E-315;
        r7 = java.lang.Math.round(r7);
        r1 = r7;
        r7 = 1;
        goto L_0x0044;
    L_0x003c:
        r1 = androidx.appcompat.R.drawable.abc_dialog_material_background;
        if (r7 != r1) goto L_0x0041;
    L_0x0040:
        goto L_0x0012;
    L_0x0041:
        r7 = 0;
        r1 = -1;
        r2 = 0;
    L_0x0044:
        if (r7 == 0) goto L_0x0061;
    L_0x0046:
        r7 = androidx.appcompat.widget.DrawableUtils.canSafelyMutateDrawable(r8);
        if (r7 == 0) goto L_0x0050;
    L_0x004c:
        r8 = r8.mutate();
    L_0x0050:
        r6 = androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(r6, r2);
        r6 = getPorterDuffColorFilter(r6, r0);
        r8.setColorFilter(r6);
        if (r1 == r3) goto L_0x0060;
    L_0x005d:
        r8.setAlpha(r1);
    L_0x0060:
        return r5;
    L_0x0061:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    private void addDelegate(@NonNull String str, @NonNull InflateDelegate inflateDelegate) {
        if (this.mDelegates == null) {
            this.mDelegates = new ArrayMap();
        }
        this.mDelegates.put(str, inflateDelegate);
    }

    private void removeDelegate(@NonNull String str, @NonNull InflateDelegate inflateDelegate) {
        ArrayMap arrayMap = this.mDelegates;
        if (arrayMap != null && arrayMap.get(str) == inflateDelegate) {
            this.mDelegates.remove(str);
        }
    }

    private static boolean arrayContains(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    static Mode getTintMode(int i) {
        return i == R.drawable.abc_switch_thumb_material ? Mode.MULTIPLY : null;
    }

    /* Access modifiers changed, original: declared_synchronized */
    public synchronized ColorStateList getTintList(@NonNull Context context, @DrawableRes int i) {
        ColorStateList tintListFromCache;
        tintListFromCache = getTintListFromCache(context, i);
        if (tintListFromCache == null) {
            if (i == R.drawable.abc_edit_text_material) {
                tintListFromCache = AppCompatResources.getColorStateList(context, R.color.abc_tint_edittext);
            } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                tintListFromCache = AppCompatResources.getColorStateList(context, R.color.abc_tint_switch_track);
            } else if (i == R.drawable.abc_switch_thumb_material) {
                tintListFromCache = createSwitchThumbColorStateList(context);
            } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                tintListFromCache = createDefaultButtonColorStateList(context);
            } else if (i == R.drawable.abc_btn_borderless_material) {
                tintListFromCache = createBorderlessButtonColorStateList(context);
            } else if (i == R.drawable.abc_btn_colored_material) {
                tintListFromCache = createColoredButtonColorStateList(context);
            } else {
                if (i != R.drawable.abc_spinner_mtrl_am_alpha) {
                    if (i != R.drawable.abc_spinner_textfield_background_material) {
                        if (arrayContains(TINT_COLOR_CONTROL_NORMAL, i)) {
                            tintListFromCache = ThemeUtils.getThemeAttrColorStateList(context, R.attr.colorControlNormal);
                        } else if (arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i)) {
                            tintListFromCache = AppCompatResources.getColorStateList(context, R.color.abc_tint_default);
                        } else if (arrayContains(TINT_CHECKABLE_BUTTON_LIST, i)) {
                            tintListFromCache = AppCompatResources.getColorStateList(context, R.color.abc_tint_btn_checkable);
                        } else if (i == R.drawable.abc_seekbar_thumb_material) {
                            tintListFromCache = AppCompatResources.getColorStateList(context, R.color.abc_tint_seek_thumb);
                        }
                    }
                }
                tintListFromCache = AppCompatResources.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (tintListFromCache != null) {
                addTintListToCache(context, i, tintListFromCache);
            }
        }
        return tintListFromCache;
    }

    private ColorStateList getTintListFromCache(@NonNull Context context, @DrawableRes int i) {
        WeakHashMap weakHashMap = this.mTintLists;
        if (weakHashMap == null) {
            return null;
        }
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) weakHashMap.get(context);
        if (sparseArrayCompat != null) {
            return (ColorStateList) sparseArrayCompat.get(i);
        }
        return null;
    }

    private void addTintListToCache(@NonNull Context context, @DrawableRes int i, @NonNull ColorStateList colorStateList) {
        if (this.mTintLists == null) {
            this.mTintLists = new WeakHashMap();
        }
        SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) this.mTintLists.get(context);
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new SparseArrayCompat();
            this.mTintLists.put(context, sparseArrayCompat);
        }
        sparseArrayCompat.append(i, colorStateList);
    }

    private ColorStateList createDefaultButtonColorStateList(@NonNull Context context) {
        return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorButtonNormal));
    }

    private ColorStateList createBorderlessButtonColorStateList(@NonNull Context context) {
        return createButtonColorStateList(context, 0);
    }

    private ColorStateList createColoredButtonColorStateList(@NonNull Context context) {
        return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorAccent));
    }

    private ColorStateList createButtonColorStateList(@NonNull Context context, @ColorInt int i) {
        r1 = new int[4][];
        r0 = new int[4];
        int themeAttrColor = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlHighlight);
        int disabledThemeAttrColor = ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorButtonNormal);
        r1[0] = ThemeUtils.DISABLED_STATE_SET;
        r0[0] = disabledThemeAttrColor;
        r1[1] = ThemeUtils.PRESSED_STATE_SET;
        r0[1] = ColorUtils.compositeColors(themeAttrColor, i);
        r1[2] = ThemeUtils.FOCUSED_STATE_SET;
        r0[2] = ColorUtils.compositeColors(themeAttrColor, i);
        r1[3] = ThemeUtils.EMPTY_STATE_SET;
        r0[3] = i;
        return new ColorStateList(r1, r0);
    }

    private ColorStateList createSwitchThumbColorStateList(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, R.attr.colorSwitchThumbNormal);
        if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
            iArr[0] = ThemeUtils.DISABLED_STATE_SET;
            iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
            iArr2[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
            iArr2[2] = ThemeUtils.getThemeAttrColor(context, R.attr.colorSwitchThumbNormal);
        } else {
            iArr[0] = ThemeUtils.DISABLED_STATE_SET;
            iArr2[0] = themeAttrColorStateList.getColorForState(iArr[0], 0);
            iArr[1] = ThemeUtils.CHECKED_STATE_SET;
            iArr2[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
            iArr[2] = ThemeUtils.EMPTY_STATE_SET;
            iArr2[2] = themeAttrColorStateList.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        if (!DrawableUtils.canSafelyMutateDrawable(drawable) || drawable.mutate() == drawable) {
            if (tintInfo.mHasTintList || tintInfo.mHasTintMode) {
                drawable.setColorFilter(createTintFilter(tintInfo.mHasTintList ? tintInfo.mTintList : null, tintInfo.mHasTintMode ? tintInfo.mTintMode : DEFAULT_MODE, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d(TAG, "Mutated drawable is not the same instance as the input.");
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, Mode mode, int[] iArr) {
        return (colorStateList == null || mode == null) ? null : getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i, Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (AppCompatDrawableManager.class) {
            porterDuffColorFilter = COLOR_FILTER_CACHE.get(i, mode);
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                COLOR_FILTER_CACHE.put(i, mode, porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    private static void setPorterDuffColorFilter(Drawable drawable, int i, Mode mode) {
        if (DrawableUtils.canSafelyMutateDrawable(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = DEFAULT_MODE;
        }
        drawable.setColorFilter(getPorterDuffColorFilter(i, mode));
    }

    private void checkVectorDrawableSetup(@NonNull Context context) {
        if (!this.mHasCheckedVectorDrawableSetup) {
            this.mHasCheckedVectorDrawableSetup = true;
            Drawable drawable = getDrawable(context, R.drawable.abc_vector_test);
            if (drawable == null || !isVectorDrawable(drawable)) {
                this.mHasCheckedVectorDrawableSetup = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static boolean isVectorDrawable(@NonNull Drawable drawable) {
        if (!(drawable instanceof VectorDrawableCompat)) {
            if (!PLATFORM_VD_CLAZZ.equals(drawable.getClass().getName())) {
                return false;
            }
        }
        return true;
    }
}
