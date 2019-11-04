package com.google.i18n.phonenumbers;

import androidx.recyclerview.widget.ItemTouchHelper.Callback;
import com.google.i18n.phonenumbers.NumberParseException.ErrorType;
import com.google.i18n.phonenumbers.Phonemetadata.NumberFormat;
import com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata;
import com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource;
import com.google.i18n.phonenumbers.internal.a;
import com.google.i18n.phonenumbers.internal.b;
import com.google.i18n.phonenumbers.internal.c;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberUtil {
    private static final Set<Integer> afA;
    private static final Map<Character, Character> afB;
    private static final Map<Character, Character> afC;
    private static final Map<Character, Character> afD;
    private static final Map<Character, Character> afE;
    private static final Pattern afF = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
    private static final String afG;
    static final Pattern afH = Pattern.compile("[+＋]+");
    private static final Pattern afI = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
    private static final Pattern afJ = Pattern.compile("(\\p{Nd})");
    private static final Pattern afK = Pattern.compile("[+＋\\p{Nd}]");
    static final Pattern afL = Pattern.compile("[\\\\/] *x");
    static final Pattern afM = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    private static final Pattern afN = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
    private static final String afO;
    private static final String afP;
    static final String afQ;
    private static final Pattern afR;
    private static final Pattern afS;
    static final Pattern afT = Pattern.compile("(\\D+)");
    private static final Pattern afU = Pattern.compile("(\\$\\d)");
    private static final Pattern afV = Pattern.compile("\\(?\\$1\\)?");
    private static PhoneNumberUtil afW = null;
    private static final Map<Integer, String> afy;
    private static final Set<Integer> afz;
    private static final Logger logger = Logger.getLogger(PhoneNumberUtil.class.getName());
    private final f afX;
    private final Map<Integer, List<String>> afY;
    private final a afZ = b.yy();
    private final c afo = new c(100);
    private final Set<String> aga = new HashSet(35);
    private final Set<String> agb = new HashSet(320);
    private final Set<Integer> agc = new HashSet();

    /* renamed from: com.google.i18n.phonenumbers.PhoneNumberUtil$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] agd = new int[CountryCodeSource.values().length];
        static final /* synthetic */ int[] age = new int[PhoneNumberFormat.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ca */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00d4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00de */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a3 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|45|46|47|48|50) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|(2:37|38)|39|41|42|43|44|45|46|47|48|50) */
        static {
            /*
            r0 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.values();
            r0 = r0.length;
            r0 = new int[r0];
            agf = r0;
            r0 = 1;
            r1 = agf;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PREMIUM_RATE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = agf;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.TOLL_FREE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = agf;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = agf;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = agf;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = 5;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r4 = agf;	 Catch:{ NoSuchFieldError -> 0x004b }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.SHARED_COST;	 Catch:{ NoSuchFieldError -> 0x004b }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r6 = 6;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r4 = agf;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.VOIP;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r6 = 7;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r4 = agf;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PERSONAL_NUMBER;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r6 = 8;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            r4 = agf;	 Catch:{ NoSuchFieldError -> 0x006e }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PAGER;	 Catch:{ NoSuchFieldError -> 0x006e }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x006e }
            r6 = 9;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x006e }
        L_0x006e:
            r4 = agf;	 Catch:{ NoSuchFieldError -> 0x007a }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UAN;	 Catch:{ NoSuchFieldError -> 0x007a }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
            r6 = 10;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            r4 = agf;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.VOICEMAIL;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0086 }
            r6 = 11;
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0086 }
        L_0x0086:
            r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.values();
            r4 = r4.length;
            r4 = new int[r4];
            age = r4;
            r4 = age;	 Catch:{ NoSuchFieldError -> 0x0099 }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164;	 Catch:{ NoSuchFieldError -> 0x0099 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0099 }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0099 }
        L_0x0099:
            r4 = age;	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL;	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r4[r5] = r1;	 Catch:{ NoSuchFieldError -> 0x00a3 }
        L_0x00a3:
            r4 = age;	 Catch:{ NoSuchFieldError -> 0x00ad }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.RFC3966;	 Catch:{ NoSuchFieldError -> 0x00ad }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x00ad }
            r4[r5] = r2;	 Catch:{ NoSuchFieldError -> 0x00ad }
        L_0x00ad:
            r4 = age;	 Catch:{ NoSuchFieldError -> 0x00b7 }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL;	 Catch:{ NoSuchFieldError -> 0x00b7 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b7 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x00b7 }
        L_0x00b7:
            r4 = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.values();
            r4 = r4.length;
            r4 = new int[r4];
            agd = r4;
            r4 = agd;	 Catch:{ NoSuchFieldError -> 0x00ca }
            r5 = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;	 Catch:{ NoSuchFieldError -> 0x00ca }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x00ca }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x00ca }
        L_0x00ca:
            r0 = agd;	 Catch:{ NoSuchFieldError -> 0x00d4 }
            r4 = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD;	 Catch:{ NoSuchFieldError -> 0x00d4 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x00d4 }
            r0[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x00d4 }
        L_0x00d4:
            r0 = agd;	 Catch:{ NoSuchFieldError -> 0x00de }
            r1 = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN;	 Catch:{ NoSuchFieldError -> 0x00de }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00de }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00de }
        L_0x00de:
            r0 = agd;	 Catch:{ NoSuchFieldError -> 0x00e8 }
            r1 = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;	 Catch:{ NoSuchFieldError -> 0x00e8 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00e8 }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x00e8 }
        L_0x00e8:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil$AnonymousClass1.<clinit>():void");
        }
    }

    public enum PhoneNumberFormat {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966
    }

    public enum PhoneNumberType {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    public enum ValidationResult {
        IS_POSSIBLE,
        IS_POSSIBLE_LOCAL_ONLY,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        INVALID_LENGTH,
        TOO_LONG
    }

    static {
        HashMap hashMap = new HashMap();
        Character valueOf = Character.valueOf('4');
        hashMap.put(Integer.valueOf(52), "1");
        Character valueOf2 = Character.valueOf('6');
        hashMap.put(Integer.valueOf(54), "9");
        afy = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(86));
        afz = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(Integer.valueOf(52));
        hashSet2.add(Integer.valueOf(54));
        Character valueOf3 = Character.valueOf('7');
        hashSet2.add(Integer.valueOf(55));
        hashSet2.add(Integer.valueOf(62));
        hashSet2.addAll(hashSet);
        afA = Collections.unmodifiableSet(hashSet2);
        hashMap = new HashMap();
        hashMap.put(Character.valueOf('0'), Character.valueOf('0'));
        hashMap.put(Character.valueOf('1'), Character.valueOf('1'));
        Character valueOf4 = Character.valueOf('2');
        hashMap.put(valueOf4, valueOf4);
        Character valueOf5 = Character.valueOf('3');
        hashMap.put(valueOf5, valueOf5);
        hashMap.put(valueOf, valueOf);
        Character valueOf6 = Character.valueOf('5');
        hashMap.put(valueOf6, valueOf6);
        hashMap.put(valueOf2, valueOf2);
        hashMap.put(valueOf3, valueOf3);
        hashMap.put(Character.valueOf('8'), Character.valueOf('8'));
        Character valueOf7 = Character.valueOf('9');
        hashMap.put(valueOf7, valueOf7);
        HashMap hashMap2 = new HashMap(40);
        hashMap2.put(Character.valueOf('A'), valueOf4);
        hashMap2.put(Character.valueOf('B'), valueOf4);
        hashMap2.put(Character.valueOf('C'), valueOf4);
        hashMap2.put(Character.valueOf('D'), valueOf5);
        hashMap2.put(Character.valueOf('E'), valueOf5);
        hashMap2.put(Character.valueOf('F'), valueOf5);
        hashMap2.put(Character.valueOf('G'), valueOf);
        hashMap2.put(Character.valueOf('H'), valueOf);
        hashMap2.put(Character.valueOf('I'), valueOf);
        hashMap2.put(Character.valueOf('J'), valueOf6);
        hashMap2.put(Character.valueOf('K'), valueOf6);
        hashMap2.put(Character.valueOf('L'), valueOf6);
        hashMap2.put(Character.valueOf('M'), valueOf2);
        hashMap2.put(Character.valueOf('N'), valueOf2);
        hashMap2.put(Character.valueOf('O'), valueOf2);
        hashMap2.put(Character.valueOf('P'), valueOf3);
        hashMap2.put(Character.valueOf('Q'), valueOf3);
        hashMap2.put(Character.valueOf('R'), valueOf3);
        hashMap2.put(Character.valueOf('S'), valueOf3);
        hashMap2.put(Character.valueOf('T'), Character.valueOf('8'));
        hashMap2.put(Character.valueOf('U'), Character.valueOf('8'));
        hashMap2.put(Character.valueOf('V'), Character.valueOf('8'));
        hashMap2.put(Character.valueOf('W'), valueOf7);
        hashMap2.put(Character.valueOf('X'), valueOf7);
        hashMap2.put(Character.valueOf('Y'), valueOf7);
        hashMap2.put(Character.valueOf('Z'), valueOf7);
        afC = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap(100);
        hashMap3.putAll(afC);
        hashMap3.putAll(hashMap);
        afD = Collections.unmodifiableMap(hashMap3);
        hashMap3 = new HashMap();
        hashMap3.putAll(hashMap);
        hashMap3.put(Character.valueOf('+'), Character.valueOf('+'));
        hashMap3.put(Character.valueOf('*'), Character.valueOf('*'));
        hashMap3.put(Character.valueOf('#'), Character.valueOf('#'));
        afB = Collections.unmodifiableMap(hashMap3);
        hashMap3 = new HashMap();
        for (Character valueOf32 : afC.keySet()) {
            char charValue = valueOf32.charValue();
            hashMap3.put(Character.valueOf(Character.toLowerCase(charValue)), Character.valueOf(charValue));
            hashMap3.put(Character.valueOf(charValue), Character.valueOf(charValue));
        }
        hashMap3.putAll(hashMap);
        hashMap3.put(Character.valueOf('-'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf(65293), Character.valueOf('-'));
        hashMap3.put(Character.valueOf(8208), Character.valueOf('-'));
        hashMap3.put(Character.valueOf(8209), Character.valueOf('-'));
        hashMap3.put(Character.valueOf(8210), Character.valueOf('-'));
        hashMap3.put(Character.valueOf(8211), Character.valueOf('-'));
        hashMap3.put(Character.valueOf(8212), Character.valueOf('-'));
        hashMap3.put(Character.valueOf(8213), Character.valueOf('-'));
        hashMap3.put(Character.valueOf(8722), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('/'), Character.valueOf('/'));
        hashMap3.put(Character.valueOf(65295), Character.valueOf('/'));
        hashMap3.put(Character.valueOf(' '), Character.valueOf(' '));
        hashMap3.put(Character.valueOf(12288), Character.valueOf(' '));
        hashMap3.put(Character.valueOf(8288), Character.valueOf(' '));
        hashMap3.put(Character.valueOf('.'), Character.valueOf('.'));
        hashMap3.put(Character.valueOf(65294), Character.valueOf('.'));
        afE = Collections.unmodifiableMap(hashMap3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Arrays.toString(afC.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        stringBuilder.append(Arrays.toString(afC.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        afG = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*");
        stringBuilder.append(afG);
        stringBuilder.append("\\p{Nd}");
        stringBuilder.append("]*");
        afO = stringBuilder.toString();
        String str = "xｘ#＃~～";
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(",;");
        stringBuilder2.append(str);
        afP = cu(stringBuilder2.toString());
        afQ = cu(str);
        stringBuilder = new StringBuilder();
        stringBuilder.append("(?:");
        stringBuilder.append(afP);
        stringBuilder.append(")$");
        afR = Pattern.compile(stringBuilder.toString(), 66);
        stringBuilder = new StringBuilder();
        stringBuilder.append(afO);
        stringBuilder.append("(?:");
        stringBuilder.append(afP);
        stringBuilder.append(")?");
        afS = Pattern.compile(stringBuilder.toString(), 66);
    }

    private static String cu(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[");
        stringBuilder.append(str);
        stringBuilder.append("]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*");
        stringBuilder.append("(\\p{Nd}{1,7})");
        stringBuilder.append("#?|[- ]+(");
        stringBuilder.append("\\p{Nd}");
        stringBuilder.append("{1,5})#");
        return stringBuilder.toString();
    }

    PhoneNumberUtil(f fVar, Map<Integer, List<String>> map) {
        String str;
        this.afX = fVar;
        this.afY = map;
        Iterator it = map.entrySet().iterator();
        while (true) {
            str = "001";
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            List list = (List) entry.getValue();
            if (list.size() == 1 && str.equals(list.get(0))) {
                this.agc.add(entry.getKey());
            } else {
                this.agb.addAll(list);
            }
        }
        if (this.agb.remove(str)) {
            logger.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.aga.addAll((Collection) map.get(Integer.valueOf(1)));
    }

    static CharSequence m(CharSequence charSequence) {
        Matcher matcher = afK.matcher(charSequence);
        if (!matcher.find()) {
            return "";
        }
        charSequence = charSequence.subSequence(matcher.start(), charSequence.length());
        matcher = afM.matcher(charSequence);
        if (matcher.find()) {
            charSequence = charSequence.subSequence(0, matcher.start());
        }
        matcher = afL.matcher(charSequence);
        if (matcher.find()) {
            charSequence = charSequence.subSequence(0, matcher.start());
        }
        return charSequence;
    }

    static boolean n(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return afS.matcher(charSequence).matches();
    }

    static StringBuilder j(StringBuilder stringBuilder) {
        if (afN.matcher(stringBuilder).matches()) {
            stringBuilder.replace(0, stringBuilder.length(), a((CharSequence) stringBuilder, afD, true));
        } else {
            stringBuilder.replace(0, stringBuilder.length(), o(stringBuilder));
        }
        return stringBuilder;
    }

    public static String o(CharSequence charSequence) {
        return a(charSequence, false).toString();
    }

    static StringBuilder a(CharSequence charSequence, boolean z) {
        StringBuilder stringBuilder = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            int digit = Character.digit(charAt, 10);
            if (digit != -1) {
                stringBuilder.append(digit);
            } else if (z) {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder;
    }

    private static String a(CharSequence charSequence, Map<Character, Character> map, boolean z) {
        StringBuilder stringBuilder = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(charAt)));
            if (ch != null) {
                stringBuilder.append(ch);
            } else if (!z) {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.toString();
    }

    static synchronized void a(PhoneNumberUtil phoneNumberUtil) {
        synchronized (PhoneNumberUtil.class) {
            afW = phoneNumberUtil;
        }
    }

    private static boolean a(PhoneNumberDesc phoneNumberDesc) {
        return (phoneNumberDesc.yc() == 1 && phoneNumberDesc.cG(0) == -1) ? false : true;
    }

    public static synchronized PhoneNumberUtil xt() {
        PhoneNumberUtil phoneNumberUtil;
        synchronized (PhoneNumberUtil.class) {
            if (afW == null) {
                a(a(e.afp));
            }
            phoneNumberUtil = afW;
        }
        return phoneNumberUtil;
    }

    public static PhoneNumberUtil a(d dVar) {
        if (dVar != null) {
            return a(new g(dVar));
        }
        throw new IllegalArgumentException("metadataLoader could not be null.");
    }

    private static PhoneNumberUtil a(f fVar) {
        if (fVar != null) {
            return new PhoneNumberUtil(fVar, c.xr());
        }
        throw new IllegalArgumentException("metadataSource could not be null.");
    }

    static boolean cv(String str) {
        return str.length() == 0 || afV.matcher(str).matches();
    }

    private boolean cw(String str) {
        return str != null && this.agb.contains(str);
    }

    private boolean cC(int i) {
        return this.afY.containsKey(Integer.valueOf(i));
    }

    public String a(PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat) {
        if (phoneNumber.yj() == 0 && phoneNumber.yq()) {
            String yr = phoneNumber.yr();
            if (yr.length() > 0) {
                return yr;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(20);
        a(phoneNumber, phoneNumberFormat, stringBuilder);
        return stringBuilder.toString();
    }

    public void a(PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat, StringBuilder stringBuilder) {
        stringBuilder.setLength(0);
        int xK = phoneNumber.xK();
        String a = a(phoneNumber);
        if (phoneNumberFormat == PhoneNumberFormat.E164) {
            stringBuilder.append(a);
            a(xK, PhoneNumberFormat.E164, stringBuilder);
        } else if (cC(xK)) {
            PhoneMetadata d = d(xK, cD(xK));
            stringBuilder.append(a(a, d, phoneNumberFormat));
            a(phoneNumber, d, phoneNumberFormat, stringBuilder);
            a(xK, phoneNumberFormat, stringBuilder);
        } else {
            stringBuilder.append(a);
        }
    }

    private PhoneMetadata d(int i, String str) {
        if ("001".equals(str)) {
            return cA(i);
        }
        return cp(str);
    }

    public String a(PhoneNumber phoneNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        if (phoneNumber.yn() && phoneNumber.yp() > 0) {
            char[] cArr = new char[phoneNumber.yp()];
            Arrays.fill(cArr, '0');
            stringBuilder.append(new String(cArr));
        }
        stringBuilder.append(phoneNumber.yj());
        return stringBuilder.toString();
    }

    private void a(int i, PhoneNumberFormat phoneNumberFormat, StringBuilder stringBuilder) {
        int i2 = AnonymousClass1.age[phoneNumberFormat.ordinal()];
        if (i2 == 1) {
            stringBuilder.insert(0, i).insert(0, '+');
        } else if (i2 == 2) {
            stringBuilder.insert(0, " ").insert(0, i).insert(0, '+');
        } else if (i2 == 3) {
            stringBuilder.insert(0, "-").insert(0, i).insert(0, '+').insert(0, "tel:");
        }
    }

    private String a(String str, PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat) {
        return a(str, phoneMetadata, phoneNumberFormat, null);
    }

    private String a(String str, PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat, CharSequence charSequence) {
        List xS;
        if (phoneMetadata.xU().size() == 0 || phoneNumberFormat == PhoneNumberFormat.NATIONAL) {
            xS = phoneMetadata.xS();
        } else {
            xS = phoneMetadata.xU();
        }
        NumberFormat a = a(xS, str);
        return a == null ? str : a(str, a, phoneNumberFormat, charSequence);
    }

    /* Access modifiers changed, original: 0000 */
    public NumberFormat a(List<NumberFormat> list, String str) {
        for (NumberFormat numberFormat : list) {
            int xu = numberFormat.xu();
            if ((xu == 0 || this.afo.cR(numberFormat.cE(xu - 1)).matcher(str).lookingAt()) && this.afo.cR(numberFormat.getPattern()).matcher(str).matches()) {
                return numberFormat;
            }
        }
        return null;
    }

    private String a(String str, NumberFormat numberFormat, PhoneNumberFormat phoneNumberFormat, CharSequence charSequence) {
        CharSequence replaceAll;
        String format = numberFormat.getFormat();
        Matcher matcher = this.afo.cR(numberFormat.getPattern()).matcher(str);
        if (phoneNumberFormat != PhoneNumberFormat.NATIONAL || charSequence == null || charSequence.length() <= 0 || numberFormat.xy().length() <= 0) {
            String xv = numberFormat.xv();
            if (phoneNumberFormat != PhoneNumberFormat.NATIONAL || xv == null || xv.length() <= 0) {
                replaceAll = matcher.replaceAll(format);
            } else {
                replaceAll = matcher.replaceAll(afU.matcher(format).replaceFirst(xv));
            }
        } else {
            replaceAll = matcher.replaceAll(afU.matcher(format).replaceFirst(numberFormat.xy().replace("$CC", charSequence)));
        }
        if (phoneNumberFormat != PhoneNumberFormat.RFC3966) {
            return replaceAll;
        }
        Matcher matcher2 = afI.matcher(replaceAll);
        if (matcher2.lookingAt()) {
            replaceAll = matcher2.replaceFirst("");
        }
        return matcher2.reset(replaceAll).replaceAll("-");
    }

    public PhoneNumber a(String str, PhoneNumberType phoneNumberType) {
        if (cw(str)) {
            PhoneNumberDesc a = a(cp(str), phoneNumberType);
            try {
                if (a.yf()) {
                    return b(a.yg(), str);
                }
            } catch (NumberParseException e) {
                logger.log(Level.SEVERE, e.toString());
            }
            return null;
        }
        Logger logger = logger;
        Level level = Level.WARNING;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid or unknown region code provided: ");
        stringBuilder.append(str);
        logger.log(level, stringBuilder.toString());
        return null;
    }

    private void a(PhoneNumber phoneNumber, PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat, StringBuilder stringBuilder) {
        if (phoneNumber.yk() && phoneNumber.yl().length() > 0) {
            if (phoneNumberFormat == PhoneNumberFormat.RFC3966) {
                stringBuilder.append(";ext=");
                stringBuilder.append(phoneNumber.yl());
            } else if (phoneMetadata.xM()) {
                stringBuilder.append(phoneMetadata.xN());
                stringBuilder.append(phoneNumber.yl());
            } else {
                stringBuilder.append(" ext. ");
                stringBuilder.append(phoneNumber.yl());
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public PhoneNumberDesc a(PhoneMetadata phoneMetadata, PhoneNumberType phoneNumberType) {
        switch (phoneNumberType) {
            case PREMIUM_RATE:
                return phoneMetadata.xD();
            case TOLL_FREE:
                return phoneMetadata.xC();
            case MOBILE:
                return phoneMetadata.xB();
            case FIXED_LINE:
            case FIXED_LINE_OR_MOBILE:
                return phoneMetadata.xA();
            case SHARED_COST:
                return phoneMetadata.xE();
            case VOIP:
                return phoneMetadata.xG();
            case PERSONAL_NUMBER:
                return phoneMetadata.xF();
            case PAGER:
                return phoneMetadata.xH();
            case UAN:
                return phoneMetadata.xI();
            case VOICEMAIL:
                return phoneMetadata.xJ();
            default:
                return phoneMetadata.xz();
        }
    }

    private PhoneNumberType a(String str, PhoneMetadata phoneMetadata) {
        if (!a(str, phoneMetadata.xz())) {
            return PhoneNumberType.UNKNOWN;
        }
        if (a(str, phoneMetadata.xD())) {
            return PhoneNumberType.PREMIUM_RATE;
        }
        if (a(str, phoneMetadata.xC())) {
            return PhoneNumberType.TOLL_FREE;
        }
        if (a(str, phoneMetadata.xE())) {
            return PhoneNumberType.SHARED_COST;
        }
        if (a(str, phoneMetadata.xG())) {
            return PhoneNumberType.VOIP;
        }
        if (a(str, phoneMetadata.xF())) {
            return PhoneNumberType.PERSONAL_NUMBER;
        }
        if (a(str, phoneMetadata.xH())) {
            return PhoneNumberType.PAGER;
        }
        if (a(str, phoneMetadata.xI())) {
            return PhoneNumberType.UAN;
        }
        if (a(str, phoneMetadata.xJ())) {
            return PhoneNumberType.VOICEMAIL;
        }
        if (a(str, phoneMetadata.xA())) {
            if (phoneMetadata.xR()) {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            if (a(str, phoneMetadata.xB())) {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            return PhoneNumberType.FIXED_LINE;
        } else if (phoneMetadata.xR() || !a(str, phoneMetadata.xB())) {
            return PhoneNumberType.UNKNOWN;
        } else {
            return PhoneNumberType.MOBILE;
        }
    }

    /* Access modifiers changed, original: 0000 */
    public PhoneMetadata cp(String str) {
        if (cw(str)) {
            return this.afX.cp(str);
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public PhoneMetadata cA(int i) {
        if (this.afY.containsKey(Integer.valueOf(i))) {
            return this.afX.cA(i);
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(String str, PhoneNumberDesc phoneNumberDesc) {
        int length = str.length();
        List yb = phoneNumberDesc.yb();
        if (yb.size() <= 0 || yb.contains(Integer.valueOf(length))) {
            return this.afZ.a(str, phoneNumberDesc, false);
        }
        return false;
    }

    public boolean b(PhoneNumber phoneNumber) {
        return a(phoneNumber, c(phoneNumber));
    }

    public boolean a(PhoneNumber phoneNumber, String str) {
        int xK = phoneNumber.xK();
        PhoneMetadata d = d(xK, str);
        if (d == null) {
            return false;
        }
        if (("001".equals(str) || xK == cy(str)) && a(a(phoneNumber), d) != PhoneNumberType.UNKNOWN) {
            return true;
        }
        return false;
    }

    public String c(PhoneNumber phoneNumber) {
        int xK = phoneNumber.xK();
        List list = (List) this.afY.get(Integer.valueOf(xK));
        if (list == null) {
            Logger logger = logger;
            Level level = Level.INFO;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Missing/invalid country_code (");
            stringBuilder.append(xK);
            stringBuilder.append(")");
            logger.log(level, stringBuilder.toString());
            return null;
        } else if (list.size() == 1) {
            return (String) list.get(0);
        } else {
            return a(phoneNumber, list);
        }
    }

    private String a(PhoneNumber phoneNumber, List<String> list) {
        String a = a(phoneNumber);
        for (String str : list) {
            PhoneMetadata cp = cp(str);
            if (cp.xW()) {
                if (this.afo.cR(cp.xX()).matcher(a).lookingAt()) {
                    return str;
                }
            } else if (a(a, cp) != PhoneNumberType.UNKNOWN) {
                return str;
            }
        }
        return null;
    }

    public String cD(int i) {
        List list = (List) this.afY.get(Integer.valueOf(i));
        if (list == null) {
            return "ZZ";
        }
        return (String) list.get(0);
    }

    public int cx(String str) {
        if (cw(str)) {
            return cy(str);
        }
        Logger logger = logger;
        Level level = Level.WARNING;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid or missing region code (");
        if (str == null) {
            str = "null";
        }
        stringBuilder.append(str);
        stringBuilder.append(") provided.");
        logger.log(level, stringBuilder.toString());
        return 0;
    }

    private int cy(String str) {
        PhoneMetadata cp = cp(str);
        if (cp != null) {
            return cp.xK();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid region code: ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private ValidationResult a(CharSequence charSequence, PhoneMetadata phoneMetadata) {
        return a(charSequence, phoneMetadata, PhoneNumberType.UNKNOWN);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f  */
    private com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult a(java.lang.CharSequence r4, com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata r5, com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType r6) {
        /*
        r3 = this;
        r0 = r3.a(r5, r6);
        r1 = r0.yb();
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0017;
    L_0x000e:
        r1 = r5.xz();
        r1 = r1.yb();
        goto L_0x001b;
    L_0x0017:
        r1 = r0.yb();
    L_0x001b:
        r0 = r0.yd();
        r2 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE;
        if (r6 != r2) goto L_0x0080;
    L_0x0023:
        r6 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE;
        r6 = r3.a(r5, r6);
        r6 = a(r6);
        if (r6 != 0) goto L_0x0036;
    L_0x002f:
        r6 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE;
        r4 = r3.a(r4, r5, r6);
        return r4;
    L_0x0036:
        r6 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE;
        r6 = r3.a(r5, r6);
        r2 = a(r6);
        if (r2 == 0) goto L_0x0080;
    L_0x0042:
        r2 = new java.util.ArrayList;
        r2.<init>(r1);
        r1 = r6.yb();
        r1 = r1.size();
        if (r1 != 0) goto L_0x005a;
    L_0x0051:
        r5 = r5.xz();
        r5 = r5.yb();
        goto L_0x005e;
    L_0x005a:
        r5 = r6.yb();
    L_0x005e:
        r2.addAll(r5);
        java.util.Collections.sort(r2);
        r5 = r0.isEmpty();
        if (r5 == 0) goto L_0x006f;
    L_0x006a:
        r0 = r6.yd();
        goto L_0x0081;
    L_0x006f:
        r5 = new java.util.ArrayList;
        r5.<init>(r0);
        r6 = r6.yd();
        r5.addAll(r6);
        java.util.Collections.sort(r5);
        r0 = r5;
        goto L_0x0081;
    L_0x0080:
        r2 = r1;
    L_0x0081:
        r5 = 0;
        r6 = r2.get(r5);
        r6 = (java.lang.Integer) r6;
        r6 = r6.intValue();
        r1 = -1;
        if (r6 != r1) goto L_0x0092;
    L_0x008f:
        r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.INVALID_LENGTH;
        return r4;
    L_0x0092:
        r4 = r4.length();
        r6 = java.lang.Integer.valueOf(r4);
        r6 = r0.contains(r6);
        if (r6 == 0) goto L_0x00a3;
    L_0x00a0:
        r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
        return r4;
    L_0x00a3:
        r5 = r2.get(r5);
        r5 = (java.lang.Integer) r5;
        r5 = r5.intValue();
        if (r5 != r4) goto L_0x00b2;
    L_0x00af:
        r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.IS_POSSIBLE;
        return r4;
    L_0x00b2:
        if (r5 <= r4) goto L_0x00b7;
    L_0x00b4:
        r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.TOO_SHORT;
        return r4;
    L_0x00b7:
        r5 = r2.size();
        r6 = 1;
        r5 = r5 - r6;
        r5 = r2.get(r5);
        r5 = (java.lang.Integer) r5;
        r5 = r5.intValue();
        if (r5 >= r4) goto L_0x00cc;
    L_0x00c9:
        r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.TOO_LONG;
        return r4;
    L_0x00cc:
        r5 = r2.size();
        r5 = r2.subList(r6, r5);
        r4 = java.lang.Integer.valueOf(r4);
        r4 = r5.contains(r4);
        if (r4 == 0) goto L_0x00e1;
    L_0x00de:
        r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.IS_POSSIBLE;
        goto L_0x00e3;
    L_0x00e1:
        r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.ValidationResult.INVALID_LENGTH;
    L_0x00e3:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil.a(java.lang.CharSequence, com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata, com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType):com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult");
    }

    public b cz(String str) {
        return new b(str);
    }

    /* Access modifiers changed, original: 0000 */
    public int a(StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        if (!(stringBuilder.length() == 0 || stringBuilder.charAt(0) == '0')) {
            int length = stringBuilder.length();
            int i = 1;
            while (i <= 3 && i <= length) {
                int parseInt = Integer.parseInt(stringBuilder.substring(0, i));
                if (this.afY.containsKey(Integer.valueOf(parseInt))) {
                    stringBuilder2.append(stringBuilder.substring(i));
                    return parseInt;
                }
                i++;
            }
        }
        return 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int a(CharSequence charSequence, PhoneMetadata phoneMetadata, StringBuilder stringBuilder, boolean z, PhoneNumber phoneNumber) {
        if (charSequence.length() == 0) {
            return 0;
        }
        CharSequence stringBuilder2 = new StringBuilder(charSequence);
        CountryCodeSource a = a((StringBuilder) stringBuilder2, phoneMetadata != null ? phoneMetadata.xL() : "NonMatch");
        if (z) {
            phoneNumber.a(a);
        }
        int xK;
        if (a == CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            if (phoneMetadata != null) {
                xK = phoneMetadata.xK();
                String valueOf = String.valueOf(xK);
                String stringBuilder3 = stringBuilder2.toString();
                if (stringBuilder3.startsWith(valueOf)) {
                    StringBuilder stringBuilder4 = new StringBuilder(stringBuilder3.substring(valueOf.length()));
                    PhoneNumberDesc xz = phoneMetadata.xz();
                    a(stringBuilder4, phoneMetadata, null);
                    if ((!this.afZ.a(stringBuilder2, xz, false) && this.afZ.a(stringBuilder4, xz, false)) || a(stringBuilder2, phoneMetadata) == ValidationResult.TOO_LONG) {
                        stringBuilder.append(stringBuilder4);
                        if (z) {
                            phoneNumber.a(CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                        }
                        phoneNumber.cH(xK);
                        return xK;
                    }
                }
            }
            phoneNumber.cH(0);
            return 0;
        } else if (stringBuilder2.length() > 2) {
            xK = a((StringBuilder) stringBuilder2, stringBuilder);
            if (xK != 0) {
                phoneNumber.cH(xK);
                return xK;
            }
            throw new NumberParseException(ErrorType.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
        } else {
            throw new NumberParseException(ErrorType.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
    }

    private boolean a(Pattern pattern, StringBuilder stringBuilder) {
        Matcher matcher = pattern.matcher(stringBuilder);
        if (!matcher.lookingAt()) {
            return false;
        }
        int end = matcher.end();
        Matcher matcher2 = afJ.matcher(stringBuilder.substring(end));
        if (matcher2.find() && o(matcher2.group(1)).equals("0")) {
            return false;
        }
        stringBuilder.delete(0, end);
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public CountryCodeSource a(StringBuilder stringBuilder, String str) {
        if (stringBuilder.length() == 0) {
            return CountryCodeSource.FROM_DEFAULT_COUNTRY;
        }
        Matcher matcher = afH.matcher(stringBuilder);
        if (matcher.lookingAt()) {
            stringBuilder.delete(0, matcher.end());
            j(stringBuilder);
            return CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        Pattern cR = this.afo.cR(str);
        j(stringBuilder);
        return a(cR, stringBuilder) ? CountryCodeSource.FROM_NUMBER_WITH_IDD : CountryCodeSource.FROM_DEFAULT_COUNTRY;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean a(StringBuilder stringBuilder, PhoneMetadata phoneMetadata, StringBuilder stringBuilder2) {
        int length = stringBuilder.length();
        String xP = phoneMetadata.xP();
        if (!(length == 0 || xP.length() == 0)) {
            Matcher matcher = this.afo.cR(xP).matcher(stringBuilder);
            if (matcher.lookingAt()) {
                PhoneNumberDesc xz = phoneMetadata.xz();
                boolean a = this.afZ.a(stringBuilder, xz, false);
                int groupCount = matcher.groupCount();
                String xQ = phoneMetadata.xQ();
                if (xQ != null && xQ.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder stringBuilder3 = new StringBuilder(stringBuilder);
                    stringBuilder3.replace(0, length, matcher.replaceFirst(xQ));
                    if (a && !this.afZ.a(stringBuilder3.toString(), xz, false)) {
                        return false;
                    }
                    if (stringBuilder2 != null && groupCount > 1) {
                        stringBuilder2.append(matcher.group(1));
                    }
                    stringBuilder.replace(0, stringBuilder.length(), stringBuilder3.toString());
                    return true;
                } else if (a && !this.afZ.a(stringBuilder.substring(matcher.end()), xz, false)) {
                    return false;
                } else {
                    if (!(stringBuilder2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        stringBuilder2.append(matcher.group(1));
                    }
                    stringBuilder.delete(0, matcher.end());
                    return true;
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public String k(StringBuilder stringBuilder) {
        Matcher matcher = afR.matcher(stringBuilder);
        if (matcher.find() && n(stringBuilder.substring(0, matcher.start()))) {
            int groupCount = matcher.groupCount();
            for (int i = 1; i <= groupCount; i++) {
                if (matcher.group(i) != null) {
                    String group = matcher.group(i);
                    stringBuilder.delete(matcher.start(), stringBuilder.length());
                    return group;
                }
            }
        }
        return "";
    }

    private boolean a(CharSequence charSequence, String str) {
        return cw(str) || !(charSequence == null || charSequence.length() == 0 || !afH.matcher(charSequence).lookingAt());
    }

    public PhoneNumber b(CharSequence charSequence, String str) {
        PhoneNumber phoneNumber = new PhoneNumber();
        a(charSequence, str, phoneNumber);
        return phoneNumber;
    }

    public void a(CharSequence charSequence, String str, PhoneNumber phoneNumber) {
        a(charSequence, str, false, true, phoneNumber);
    }

    static void a(CharSequence charSequence, PhoneNumber phoneNumber) {
        if (charSequence.length() > 1 && charSequence.charAt(0) == '0') {
            phoneNumber.as(true);
            int i = 1;
            while (i < charSequence.length() - 1 && charSequence.charAt(i) == '0') {
                i++;
            }
            if (i != 1) {
                phoneNumber.cI(i);
            }
        }
    }

    private void a(CharSequence charSequence, String str, boolean z, boolean z2, PhoneNumber phoneNumber) {
        int a;
        if (charSequence == null) {
            throw new NumberParseException(ErrorType.NOT_A_NUMBER, "The phone number supplied was null.");
        } else if (charSequence.length() <= Callback.DEFAULT_SWIPE_ANIMATION_DURATION) {
            CharSequence stringBuilder = new StringBuilder();
            String charSequence2 = charSequence.toString();
            a(charSequence2, (StringBuilder) stringBuilder);
            if (!n(stringBuilder)) {
                throw new NumberParseException(ErrorType.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
            } else if (!z2 || a(stringBuilder, str)) {
                String cD;
                if (z) {
                    phoneNumber.cP(charSequence2);
                }
                charSequence2 = k(stringBuilder);
                if (charSequence2.length() > 0) {
                    phoneNumber.cO(charSequence2);
                }
                PhoneMetadata cp = cp(str);
                CharSequence stringBuilder2 = new StringBuilder();
                try {
                    a = a(stringBuilder, cp, (StringBuilder) stringBuilder2, z, phoneNumber);
                } catch (NumberParseException e) {
                    Matcher matcher = afH.matcher(stringBuilder);
                    if (e.xs() == ErrorType.INVALID_COUNTRY_CODE && matcher.lookingAt()) {
                        a = a(stringBuilder.substring(matcher.end()), cp, (StringBuilder) stringBuilder2, z, phoneNumber);
                        if (a == 0) {
                            throw new NumberParseException(ErrorType.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
                        }
                    }
                    throw new NumberParseException(e.xs(), e.getMessage());
                }
                if (a != 0) {
                    cD = cD(a);
                    if (!cD.equals(str)) {
                        cp = d(a, cD);
                    }
                } else {
                    stringBuilder2.append(j(stringBuilder));
                    if (str != null) {
                        phoneNumber.cH(cp.xK());
                    } else if (z) {
                        phoneNumber.yu();
                    }
                }
                cD = "The string supplied is too short to be a phone number.";
                if (stringBuilder2.length() >= 2) {
                    if (cp != null) {
                        StringBuilder stringBuilder3 = new StringBuilder();
                        CharSequence stringBuilder4 = new StringBuilder(stringBuilder2);
                        a((StringBuilder) stringBuilder4, cp, stringBuilder3);
                        ValidationResult a2 = a(stringBuilder4, cp);
                        if (!(a2 == ValidationResult.TOO_SHORT || a2 == ValidationResult.IS_POSSIBLE_LOCAL_ONLY || a2 == ValidationResult.INVALID_LENGTH)) {
                            if (z && stringBuilder3.length() > 0) {
                                phoneNumber.cQ(stringBuilder3.toString());
                            }
                            stringBuilder2 = stringBuilder4;
                        }
                    }
                    int length = stringBuilder2.length();
                    if (length < 2) {
                        throw new NumberParseException(ErrorType.TOO_SHORT_NSN, cD);
                    } else if (length <= 17) {
                        a(stringBuilder2, phoneNumber);
                        phoneNumber.K(Long.parseLong(stringBuilder2.toString()));
                        return;
                    } else {
                        throw new NumberParseException(ErrorType.TOO_LONG, "The string supplied is too long to be a phone number.");
                    }
                }
                throw new NumberParseException(ErrorType.TOO_SHORT_NSN, cD);
            } else {
                throw new NumberParseException(ErrorType.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
            }
        } else {
            throw new NumberParseException(ErrorType.TOO_LONG, "The string supplied was too long to parse.");
        }
    }

    private void a(String str, StringBuilder stringBuilder) {
        int indexOf = str.indexOf(";phone-context=");
        if (indexOf >= 0) {
            int i = indexOf + 15;
            if (i < str.length() - 1 && str.charAt(i) == '+') {
                int indexOf2 = str.indexOf(59, i);
                if (indexOf2 > 0) {
                    stringBuilder.append(str.substring(i, indexOf2));
                } else {
                    stringBuilder.append(str.substring(i));
                }
            }
            i = str.indexOf("tel:");
            stringBuilder.append(str.substring(i >= 0 ? i + 4 : 0, indexOf));
        } else {
            stringBuilder.append(m(str));
        }
        int indexOf3 = stringBuilder.indexOf(";isub=");
        if (indexOf3 > 0) {
            stringBuilder.delete(indexOf3, stringBuilder.length());
        }
    }
}
