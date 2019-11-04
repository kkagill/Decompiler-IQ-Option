package io.card.payment.i18n;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: I18nManager */
public class a<E extends Enum<?>> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "a";
    private static final Map<String, String> eLr = new HashMap();
    private static final Set<String> eLs = new HashSet();
    private Map<String, c<E>> eLt = new LinkedHashMap();
    private c<E> eLu;
    private Class<E> eLv;

    static {
        eLr.put("zh_CN", "zh-Hans");
        eLr.put("zh_TW", "zh-Hant_TW");
        eLr.put("zh_HK", "zh-Hant");
        String str = "en_GB";
        eLr.put("en_UK", str);
        eLr.put("en_IE", str);
        str = "he";
        eLr.put("iw_IL", str);
        eLr.put("no", "nb");
        eLs.add(str);
        eLs.add("ar");
    }

    public a(Class<E> cls, List<c<E>> list) {
        this.eLv = cls;
        for (c a : list) {
            a(a);
        }
        setLanguage(null);
    }

    private void lf(String str) {
        for (String i : lg(str)) {
            Log.i(TAG, i);
        }
    }

    private List<String> lg(String str) {
        c cVar = (c) this.eLt.get(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Enum[]) this.eLv.getEnumConstants()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(str);
            stringBuilder.append(",");
            stringBuilder.append(obj);
            stringBuilder.append("]");
            String stringBuilder2 = stringBuilder.toString();
            if (cVar.a(obj, null) == null) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Missing ");
                stringBuilder3.append(stringBuilder2);
                arrayList.add(stringBuilder3.toString());
            }
        }
        return arrayList;
    }

    public void setLanguage(String str) {
        this.eLu = null;
        this.eLu = lh(str);
        str = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setting locale to:");
        stringBuilder.append(this.eLu.getName());
        Log.d(str, stringBuilder.toString());
    }

    public c<E> lh(String str) {
        c<E> li = str != null ? li(str) : null;
        if (li == null) {
            String locale = Locale.getDefault().toString();
            String str2 = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" not found.  Attempting to look for ");
            stringBuilder.append(locale);
            Log.d(str2, stringBuilder.toString());
            li = li(locale);
        }
        if (li != null) {
            return li;
        }
        Log.d(TAG, "defaulting to english");
        return (c) this.eLt.get("en");
    }

    private c<E> li(String str) {
        c<E> cVar = null;
        if (str == null || str.length() < 2) {
            return null;
        }
        String str2;
        if (eLr.containsKey(str)) {
            str2 = (String) eLr.get(str);
            c<E> cVar2 = (c) this.eLt.get(str2);
            String str3 = TAG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Overriding locale specifier ");
            stringBuilder.append(str);
            stringBuilder.append(" with ");
            stringBuilder.append(str2);
            Log.d(str3, stringBuilder.toString());
            cVar = cVar2;
        }
        if (cVar == null) {
            Object obj;
            str2 = "_";
            if (str.contains(str2)) {
                obj = str;
            } else {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str);
                stringBuilder2.append(str2);
                stringBuilder2.append(Locale.getDefault().getCountry());
                obj = stringBuilder2.toString();
            }
            cVar = (c) this.eLt.get(obj);
        }
        if (cVar == null) {
            cVar = (c) this.eLt.get(str);
        }
        if (cVar != null) {
            return cVar;
        }
        return (c) this.eLt.get(str.substring(0, 2));
    }

    public String a(E e) {
        return a(e, this.eLu);
    }

    public String a(E e, c<E> cVar) {
        String toUpperCase = Locale.getDefault().getCountry().toUpperCase(Locale.US);
        String a = cVar.a(e, toUpperCase);
        if (a == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Missing localized string for [");
            stringBuilder.append(this.eLu.getName());
            stringBuilder.append(",Key.");
            stringBuilder.append(e.toString());
            stringBuilder.append("]");
            Log.i(TAG, stringBuilder.toString());
            a = ((c) this.eLt.get("en")).a(e, toUpperCase);
        }
        if (a != null) {
            return a;
        }
        a = TAG;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Missing localized string for [en,Key.");
        stringBuilder2.append(e.toString());
        stringBuilder2.append("], so defaulting to keyname");
        Log.i(a, stringBuilder2.toString());
        return e.toString();
    }

    private void a(c<E> cVar) {
        String name = cVar.getName();
        if (name == null) {
            throw new RuntimeException("Null localeName");
        } else if (this.eLt.containsKey(name)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Locale ");
            stringBuilder.append(name);
            stringBuilder.append(" already added");
            throw new RuntimeException(stringBuilder.toString());
        } else {
            this.eLt.put(name, cVar);
            lf(name);
        }
    }
}
