package io.card.payment.i18n;

import android.content.Intent;
import io.card.payment.CardIOActivity;
import io.card.payment.i18n.a.o;

/* compiled from: LocalizedStrings */
public final class b {
    private static final a<StringKey> eLw = new a(StringKey.class, o.eLz);

    public static String a(StringKey stringKey) {
        return eLw.a((Enum) stringKey);
    }

    public static String a(StringKey stringKey, String str) {
        a aVar = eLw;
        return aVar.a(stringKey, aVar.lh(str));
    }

    public static void x(Intent intent) {
        eLw.setLanguage(intent.getStringExtra(CardIOActivity.EXTRA_LANGUAGE_OR_LOCALE));
    }
}
