package com.iqoption.chat.fragment;

import java.text.SimpleDateFormat;
import kotlin.i;
import kotlin.jvm.a.m;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"formatSubTitle", "", "sender", "date", "", "invoke"})
/* compiled from: RoomFragment.kt */
final class RoomFragment$onViewCreated$8$6 extends Lambda implements m<String, Long, String> {
    final /* synthetic */ SimpleDateFormat $dateFormatter;

    RoomFragment$onViewCreated$8$6(SimpleDateFormat simpleDateFormat) {
        this.$dateFormatter = simpleDateFormat;
        super(2);
    }

    public /* synthetic */ Object w(Object obj, Object obj2) {
        return f((String) obj, ((Number) obj2).longValue());
    }

    public final String f(String str, long j) {
        kotlin.jvm.internal.i.f(str, "sender");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(", ");
        stringBuilder.append(this.$dateFormatter.format(Long.valueOf(j)));
        return stringBuilder.toString();
    }
}
