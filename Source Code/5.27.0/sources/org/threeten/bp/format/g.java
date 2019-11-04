package org.threeten.bp.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.IsoFields;
import org.threeten.bp.temporal.e;

/* compiled from: SimpleDateTimeTextProvider */
final class g extends e {
    private static final Comparator<Entry<String, Long>> COMPARATOR = new Comparator<Entry<String, Long>>() {
        /* renamed from: a */
        public int compare(Entry<String, Long> entry, Entry<String, Long> entry2) {
            return ((String) entry2.getKey()).length() - ((String) entry.getKey()).length();
        }
    };
    private final ConcurrentMap<Entry<e, Locale>, Object> fwE = new ConcurrentHashMap(16, 0.75f, 2);

    /* compiled from: SimpleDateTimeTextProvider */
    static final class a {
        private final Map<TextStyle, Map<Long, String>> fIW;
        private final Map<TextStyle, List<Entry<String, Long>>> fIX;

        a(Map<TextStyle, Map<Long, String>> map) {
            this.fIW = map;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (TextStyle textStyle : map.keySet()) {
                HashMap hashMap2 = new HashMap();
                for (Entry entry : ((Map) map.get(textStyle)).entrySet()) {
                    Object put = hashMap2.put(entry.getValue(), g.E(entry.getValue(), entry.getKey()));
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.values());
                Collections.sort(arrayList2, g.COMPARATOR);
                hashMap.put(textStyle, arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put(null, arrayList);
            }
            Collections.sort(arrayList, g.COMPARATOR);
            this.fIX = hashMap;
        }

        /* Access modifiers changed, original: 0000 */
        public String a(long j, TextStyle textStyle) {
            Map map = (Map) this.fIW.get(textStyle);
            return map != null ? (String) map.get(Long.valueOf(j)) : null;
        }
    }

    g() {
    }

    public String a(e eVar, long j, TextStyle textStyle, Locale locale) {
        Object a = a(eVar, locale);
        return a instanceof a ? ((a) a).a(j, textStyle) : null;
    }

    private Object a(e eVar, Locale locale) {
        Entry E = E(eVar, locale);
        Object obj = this.fwE.get(E);
        if (obj != null) {
            return obj;
        }
        this.fwE.putIfAbsent(E, b(eVar, locale));
        return this.fwE.get(E);
    }

    private Object b(e eVar, Locale locale) {
        e eVar2 = eVar;
        e eVar3 = ChronoField.MONTH_OF_YEAR;
        Long valueOf = Long.valueOf(4);
        Long valueOf2 = Long.valueOf(3);
        Long valueOf3 = Long.valueOf(2);
        Long valueOf4 = Long.valueOf(1);
        DateFormatSymbols instance;
        HashMap hashMap;
        Long valueOf5;
        Long valueOf6;
        HashMap hashMap2;
        String[] shortMonths;
        if (eVar2 == eVar3) {
            instance = DateFormatSymbols.getInstance(locale);
            hashMap = new HashMap();
            Long valueOf7 = Long.valueOf(5);
            Long valueOf8 = Long.valueOf(6);
            valueOf5 = Long.valueOf(7);
            valueOf6 = Long.valueOf(8);
            Long valueOf9 = Long.valueOf(9);
            Long valueOf10 = Long.valueOf(10);
            Long valueOf11 = Long.valueOf(11);
            Long valueOf12 = Long.valueOf(12);
            String[] months = instance.getMonths();
            HashMap hashMap3 = new HashMap();
            DateFormatSymbols dateFormatSymbols = instance;
            hashMap3.put(valueOf4, months[0]);
            hashMap3.put(valueOf3, months[1]);
            hashMap3.put(valueOf2, months[2]);
            hashMap3.put(valueOf, months[3]);
            hashMap3.put(valueOf7, months[4]);
            hashMap3.put(valueOf8, months[5]);
            hashMap3.put(valueOf5, months[6]);
            hashMap3.put(valueOf6, months[7]);
            hashMap3.put(valueOf9, months[8]);
            hashMap3.put(valueOf10, months[9]);
            hashMap3.put(valueOf11, months[10]);
            hashMap3.put(valueOf12, months[11]);
            hashMap.put(TextStyle.FULL, hashMap3);
            hashMap2 = new HashMap();
            HashMap hashMap4 = hashMap;
            hashMap2.put(valueOf4, months[0].substring(0, 1));
            hashMap2.put(valueOf3, months[1].substring(0, 1));
            Long l = valueOf3;
            hashMap2.put(valueOf2, months[2].substring(0, 1));
            hashMap2.put(valueOf, months[3].substring(0, 1));
            hashMap2.put(valueOf7, months[4].substring(0, 1));
            hashMap2.put(valueOf8, months[5].substring(0, 1));
            hashMap2.put(valueOf5, months[6].substring(0, 1));
            hashMap2.put(valueOf6, months[7].substring(0, 1));
            hashMap2.put(valueOf9, months[8].substring(0, 1));
            hashMap2.put(valueOf10, months[9].substring(0, 1));
            hashMap2.put(valueOf11, months[10].substring(0, 1));
            hashMap2.put(valueOf12, months[11].substring(0, 1));
            HashMap hashMap5 = hashMap4;
            hashMap5.put(TextStyle.NARROW, hashMap2);
            shortMonths = dateFormatSymbols.getShortMonths();
            HashMap hashMap6 = new HashMap();
            hashMap6.put(valueOf4, shortMonths[0]);
            hashMap6.put(l, shortMonths[1]);
            hashMap6.put(valueOf2, shortMonths[2]);
            hashMap6.put(valueOf, shortMonths[3]);
            hashMap6.put(valueOf7, shortMonths[4]);
            hashMap6.put(valueOf8, shortMonths[5]);
            hashMap6.put(valueOf5, shortMonths[6]);
            hashMap6.put(valueOf6, shortMonths[7]);
            hashMap6.put(valueOf9, shortMonths[8]);
            hashMap6.put(valueOf10, shortMonths[9]);
            hashMap6.put(valueOf11, shortMonths[10]);
            hashMap6.put(valueOf12, shortMonths[11]);
            hashMap5.put(TextStyle.SHORT, hashMap6);
            return aa(hashMap5);
        }
        Long l2 = valueOf3;
        HashMap hashMap7;
        if (eVar2 == ChronoField.DAY_OF_WEEK) {
            instance = DateFormatSymbols.getInstance(locale);
            hashMap = new HashMap();
            valueOf3 = Long.valueOf(5);
            valueOf5 = Long.valueOf(6);
            valueOf6 = Long.valueOf(7);
            String[] weekdays = instance.getWeekdays();
            HashMap hashMap8 = new HashMap();
            hashMap8.put(valueOf4, weekdays[2]);
            hashMap8.put(l2, weekdays[3]);
            hashMap8.put(valueOf2, weekdays[4]);
            hashMap8.put(valueOf, weekdays[5]);
            hashMap8.put(valueOf3, weekdays[6]);
            hashMap8.put(valueOf5, weekdays[7]);
            hashMap8.put(valueOf6, weekdays[1]);
            hashMap.put(TextStyle.FULL, hashMap8);
            hashMap8 = new HashMap();
            hashMap8.put(valueOf4, weekdays[2].substring(0, 1));
            hashMap8.put(l2, weekdays[3].substring(0, 1));
            hashMap8.put(valueOf2, weekdays[4].substring(0, 1));
            hashMap8.put(valueOf, weekdays[5].substring(0, 1));
            hashMap8.put(valueOf3, weekdays[6].substring(0, 1));
            hashMap8.put(valueOf5, weekdays[7].substring(0, 1));
            hashMap8.put(valueOf6, weekdays[1].substring(0, 1));
            hashMap.put(TextStyle.NARROW, hashMap8);
            shortMonths = instance.getShortWeekdays();
            HashMap hashMap9 = new HashMap();
            hashMap9.put(valueOf4, shortMonths[2]);
            hashMap9.put(l2, shortMonths[3]);
            hashMap9.put(valueOf2, shortMonths[4]);
            hashMap9.put(valueOf, shortMonths[5]);
            hashMap9.put(valueOf3, shortMonths[6]);
            hashMap9.put(valueOf5, shortMonths[7]);
            hashMap9.put(valueOf6, shortMonths[1]);
            hashMap.put(TextStyle.SHORT, hashMap9);
            return aa(hashMap);
        } else if (eVar2 == ChronoField.AMPM_OF_DAY) {
            instance = DateFormatSymbols.getInstance(locale);
            hashMap = new HashMap();
            shortMonths = instance.getAmPmStrings();
            hashMap7 = new HashMap();
            hashMap7.put(Long.valueOf(0), shortMonths[0]);
            hashMap7.put(valueOf4, shortMonths[1]);
            hashMap.put(TextStyle.FULL, hashMap7);
            hashMap.put(TextStyle.SHORT, hashMap7);
            return aa(hashMap);
        } else if (eVar2 == ChronoField.ERA) {
            instance = DateFormatSymbols.getInstance(locale);
            hashMap = new HashMap();
            shortMonths = instance.getEras();
            hashMap7 = new HashMap();
            hashMap7.put(Long.valueOf(0), shortMonths[0]);
            hashMap7.put(valueOf4, shortMonths[1]);
            hashMap.put(TextStyle.SHORT, hashMap7);
            if (locale.getLanguage().equals(Locale.ENGLISH.getLanguage())) {
                hashMap7 = new HashMap();
                hashMap7.put(Long.valueOf(0), "Before Christ");
                hashMap7.put(valueOf4, "Anno Domini");
                hashMap.put(TextStyle.FULL, hashMap7);
            } else {
                hashMap.put(TextStyle.FULL, hashMap7);
            }
            hashMap7 = new HashMap();
            hashMap7.put(Long.valueOf(0), shortMonths[0].substring(0, 1));
            hashMap7.put(valueOf4, shortMonths[1].substring(0, 1));
            hashMap.put(TextStyle.NARROW, hashMap7);
            return aa(hashMap);
        } else if (eVar2 != IsoFields.fIZ) {
            return "";
        } else {
            hashMap2 = new HashMap();
            hashMap = new HashMap();
            hashMap.put(valueOf4, "Q1");
            hashMap.put(l2, "Q2");
            hashMap.put(valueOf2, "Q3");
            hashMap.put(valueOf, "Q4");
            hashMap2.put(TextStyle.SHORT, hashMap);
            hashMap = new HashMap();
            hashMap.put(valueOf4, "1st quarter");
            hashMap.put(l2, "2nd quarter");
            hashMap.put(valueOf2, "3rd quarter");
            hashMap.put(valueOf, "4th quarter");
            hashMap2.put(TextStyle.FULL, hashMap);
            return aa(hashMap2);
        }
    }

    private static <A, B> Entry<A, B> E(A a, B b) {
        return new SimpleImmutableEntry(a, b);
    }

    private static a aa(Map<TextStyle, Map<Long, String>> map) {
        map.put(TextStyle.FULL_STANDALONE, map.get(TextStyle.FULL));
        map.put(TextStyle.SHORT_STANDALONE, map.get(TextStyle.SHORT));
        if (map.containsKey(TextStyle.NARROW) && !map.containsKey(TextStyle.NARROW_STANDALONE)) {
            map.put(TextStyle.NARROW_STANDALONE, map.get(TextStyle.NARROW));
        }
        return new a(map);
    }
}
