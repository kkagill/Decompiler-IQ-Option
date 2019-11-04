package androidx.core.os;

import android.os.Build.VERSION;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.Size;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

@RestrictTo({Scope.LIBRARY_GROUP})
final class LocaleListHelper {
    private static final Locale EN_LATN = LocaleHelper.forLanguageTag("en-Latn");
    private static final Locale LOCALE_AR_XB = new Locale("ar", "XB");
    private static final Locale LOCALE_EN_XA = new Locale("en", "XA");
    private static final int NUM_PSEUDO_LOCALES = 2;
    private static final String STRING_AR_XB = "ar-XB";
    private static final String STRING_EN_XA = "en-XA";
    @GuardedBy("sLock")
    private static LocaleListHelper sDefaultAdjustedLocaleList = null;
    @GuardedBy("sLock")
    private static LocaleListHelper sDefaultLocaleList = null;
    private static final Locale[] sEmptyList = new Locale[0];
    private static final LocaleListHelper sEmptyLocaleList = new LocaleListHelper(new Locale[0]);
    @GuardedBy("sLock")
    private static Locale sLastDefaultLocale = null;
    @GuardedBy("sLock")
    private static LocaleListHelper sLastExplicitlySetLocaleList = null;
    private static final Object sLock = new Object();
    private final Locale[] mList;
    @NonNull
    private final String mStringRepresentation;

    /* Access modifiers changed, original: 0000 */
    @RestrictTo({Scope.LIBRARY_GROUP})
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.mList;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean isEmpty() {
        return this.mList.length == 0;
    }

    /* Access modifiers changed, original: 0000 */
    @IntRange(from = 0)
    @RestrictTo({Scope.LIBRARY_GROUP})
    public int size() {
        return this.mList.length;
    }

    /* Access modifiers changed, original: 0000 */
    @IntRange(from = -1)
    @RestrictTo({Scope.LIBRARY_GROUP})
    public int indexOf(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i >= localeArr.length) {
                return -1;
            }
            if (localeArr[i].equals(locale)) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocaleListHelper)) {
            return false;
        }
        Locale[] localeArr = ((LocaleListHelper) obj).mList;
        if (this.mList.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.mList;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i < localeArr.length) {
                stringBuilder.append(localeArr[i]);
                if (i < this.mList.length - 1) {
                    stringBuilder.append(',');
                }
                i++;
            } else {
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    public String toLanguageTags() {
        return this.mStringRepresentation;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    LocaleListHelper(@NonNull Locale... localeArr) {
        if (localeArr.length == 0) {
            this.mList = sEmptyList;
            this.mStringRepresentation = "";
            return;
        }
        Locale[] localeArr2 = new Locale[localeArr.length];
        HashSet hashSet = new HashSet();
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < localeArr.length) {
            Object obj = localeArr[i];
            String str = "list[";
            StringBuilder stringBuilder2;
            if (obj == null) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str);
                stringBuilder2.append(i);
                stringBuilder2.append("] is null");
                throw new NullPointerException(stringBuilder2.toString());
            } else if (hashSet.contains(obj)) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str);
                stringBuilder2.append(i);
                stringBuilder2.append("] is a repetition");
                throw new IllegalArgumentException(stringBuilder2.toString());
            } else {
                Locale locale = (Locale) obj.clone();
                localeArr2[i] = locale;
                stringBuilder.append(LocaleHelper.toLanguageTag(locale));
                if (i < localeArr.length - 1) {
                    stringBuilder.append(',');
                }
                hashSet.add(locale);
                i++;
            }
        }
        this.mList = localeArr2;
        this.mStringRepresentation = stringBuilder.toString();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    LocaleListHelper(@NonNull Locale locale, LocaleListHelper localeListHelper) {
        if (locale != null) {
            int i;
            int i2 = 0;
            if (localeListHelper == null) {
                i = 0;
            } else {
                i = localeListHelper.mList.length;
            }
            int i3 = 0;
            while (i3 < i) {
                if (locale.equals(localeListHelper.mList[i3])) {
                    break;
                }
                i3++;
            }
            i3 = -1;
            int i4 = (i3 == -1 ? 1 : 0) + i;
            Locale[] localeArr = new Locale[i4];
            localeArr[0] = (Locale) locale.clone();
            int i5;
            if (i3 == -1) {
                i5 = 0;
                while (i5 < i) {
                    i3 = i5 + 1;
                    localeArr[i3] = (Locale) localeListHelper.mList[i5].clone();
                    i5 = i3;
                }
            } else {
                i5 = 0;
                while (i5 < i3) {
                    int i6 = i5 + 1;
                    localeArr[i6] = (Locale) localeListHelper.mList[i5].clone();
                    i5 = i6;
                }
                for (i3++; i3 < i; i3++) {
                    localeArr[i3] = (Locale) localeListHelper.mList[i3].clone();
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            while (i2 < i4) {
                stringBuilder.append(LocaleHelper.toLanguageTag(localeArr[i2]));
                if (i2 < i4 - 1) {
                    stringBuilder.append(',');
                }
                i2++;
            }
            this.mList = localeArr;
            this.mStringRepresentation = stringBuilder.toString();
            return;
        }
        throw new NullPointerException("topLocale is null");
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    static LocaleListHelper getEmptyLocaleList() {
        return sEmptyLocaleList;
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    static LocaleListHelper forLanguageTags(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return getEmptyLocaleList();
        }
        String[] split = str.split(",", -1);
        Locale[] localeArr = new Locale[split.length];
        for (int i = 0; i < localeArr.length; i++) {
            localeArr[i] = LocaleHelper.forLanguageTag(split[i]);
        }
        return new LocaleListHelper(localeArr);
    }

    private static String getLikelyScript(Locale locale) {
        String str = "";
        if (VERSION.SDK_INT >= 21) {
            String script = locale.getScript();
            if (!script.isEmpty()) {
                return script;
            }
        }
        return str;
    }

    private static boolean isPseudoLocale(String str) {
        return STRING_EN_XA.equals(str) || STRING_AR_XB.equals(str);
    }

    private static boolean isPseudoLocale(Locale locale) {
        return LOCALE_EN_XA.equals(locale) || LOCALE_AR_XB.equals(locale);
    }

    @IntRange(from = 0, to = 1)
    private static int matchScore(Locale locale, Locale locale2) {
        int i = 1;
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || isPseudoLocale(locale) || isPseudoLocale(locale2)) {
            return 0;
        }
        String likelyScript = getLikelyScript(locale);
        if (!likelyScript.isEmpty()) {
            return likelyScript.equals(getLikelyScript(locale2));
        }
        String country = locale.getCountry();
        if (!(country.isEmpty() || country.equals(locale2.getCountry()))) {
            i = 0;
        }
        return i;
    }

    private int findFirstMatchIndex(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (matchScore(locale, localeArr[i]) > 0) {
                return i;
            }
            i++;
        }
    }

    /* JADX WARNING: Missing block: B:12:0x001b, code skipped:
            if (r6 < Integer.MAX_VALUE) goto L_0x0021;
     */
    private int computeFirstMatchIndex(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
        r4 = this;
        r0 = r4.mList;
        r1 = r0.length;
        r2 = 0;
        r3 = 1;
        if (r1 != r3) goto L_0x0008;
    L_0x0007:
        return r2;
    L_0x0008:
        r0 = r0.length;
        if (r0 != 0) goto L_0x000d;
    L_0x000b:
        r5 = -1;
        return r5;
    L_0x000d:
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r6 == 0) goto L_0x001e;
    L_0x0012:
        r6 = EN_LATN;
        r6 = r4.findFirstMatchIndex(r6);
        if (r6 != 0) goto L_0x001b;
    L_0x001a:
        return r2;
    L_0x001b:
        if (r6 >= r0) goto L_0x001e;
    L_0x001d:
        goto L_0x0021;
    L_0x001e:
        r6 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
    L_0x0021:
        r5 = r5.iterator();
    L_0x0025:
        r1 = r5.hasNext();
        if (r1 == 0) goto L_0x0040;
    L_0x002b:
        r1 = r5.next();
        r1 = (java.lang.String) r1;
        r1 = androidx.core.os.LocaleHelper.forLanguageTag(r1);
        r1 = r4.findFirstMatchIndex(r1);
        if (r1 != 0) goto L_0x003c;
    L_0x003b:
        return r2;
    L_0x003c:
        if (r1 >= r6) goto L_0x0025;
    L_0x003e:
        r6 = r1;
        goto L_0x0025;
    L_0x0040:
        if (r6 != r0) goto L_0x0043;
    L_0x0042:
        return r2;
    L_0x0043:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.os.LocaleListHelper.computeFirstMatchIndex(java.util.Collection, boolean):int");
    }

    private Locale computeFirstMatch(Collection<String> collection, boolean z) {
        int computeFirstMatchIndex = computeFirstMatchIndex(collection, z);
        if (computeFirstMatchIndex == -1) {
            return null;
        }
        return this.mList[computeFirstMatchIndex];
    }

    /* Access modifiers changed, original: 0000 */
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP})
    public Locale getFirstMatch(String[] strArr) {
        return computeFirstMatch(Arrays.asList(strArr), false);
    }

    /* Access modifiers changed, original: 0000 */
    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getFirstMatchIndex(String[] strArr) {
        return computeFirstMatchIndex(Arrays.asList(strArr), false);
    }

    /* Access modifiers changed, original: 0000 */
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP})
    public Locale getFirstMatchWithEnglishSupported(String[] strArr) {
        return computeFirstMatch(Arrays.asList(strArr), true);
    }

    /* Access modifiers changed, original: 0000 */
    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getFirstMatchIndexWithEnglishSupported(Collection<String> collection) {
        return computeFirstMatchIndex(collection, true);
    }

    /* Access modifiers changed, original: 0000 */
    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getFirstMatchIndexWithEnglishSupported(String[] strArr) {
        return getFirstMatchIndexWithEnglishSupported(Arrays.asList(strArr));
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    static boolean isPseudoLocalesOnly(@Nullable String[] strArr) {
        if (strArr == null) {
            return true;
        }
        if (strArr.length > 3) {
            return false;
        }
        for (String str : strArr) {
            if (!str.isEmpty() && !isPseudoLocale(str)) {
                return false;
            }
        }
        return true;
    }

    @Size(min = 1)
    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    static LocaleListHelper getDefault() {
        Locale locale = Locale.getDefault();
        synchronized (sLock) {
            LocaleListHelper localeListHelper;
            if (!locale.equals(sLastDefaultLocale)) {
                sLastDefaultLocale = locale;
                if (sDefaultLocaleList == null || !locale.equals(sDefaultLocaleList.get(0))) {
                    sDefaultLocaleList = new LocaleListHelper(locale, sLastExplicitlySetLocaleList);
                    sDefaultAdjustedLocaleList = sDefaultLocaleList;
                } else {
                    localeListHelper = sDefaultLocaleList;
                    return localeListHelper;
                }
            }
            localeListHelper = sDefaultLocaleList;
            return localeListHelper;
        }
    }

    @Size(min = 1)
    @NonNull
    static LocaleListHelper getAdjustedDefault() {
        LocaleListHelper localeListHelper;
        getDefault();
        synchronized (sLock) {
            localeListHelper = sDefaultAdjustedLocaleList;
        }
        return localeListHelper;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    static void setDefault(@Size(min = 1) @NonNull LocaleListHelper localeListHelper) {
        setDefault(localeListHelper, 0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    static void setDefault(@Size(min = 1) @NonNull LocaleListHelper localeListHelper, int i) {
        if (localeListHelper == null) {
            throw new NullPointerException("locales is null");
        } else if (localeListHelper.isEmpty()) {
            throw new IllegalArgumentException("locales is empty");
        } else {
            synchronized (sLock) {
                sLastDefaultLocale = localeListHelper.get(i);
                Locale.setDefault(sLastDefaultLocale);
                sLastExplicitlySetLocaleList = localeListHelper;
                sDefaultLocaleList = localeListHelper;
                if (i == 0) {
                    sDefaultAdjustedLocaleList = sDefaultLocaleList;
                } else {
                    sDefaultAdjustedLocaleList = new LocaleListHelper(sLastDefaultLocale, sDefaultLocaleList);
                }
            }
        }
    }
}
