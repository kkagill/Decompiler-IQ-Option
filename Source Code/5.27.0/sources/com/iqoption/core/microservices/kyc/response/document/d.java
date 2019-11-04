package com.iqoption.core.microservices.kyc.response.document;

import com.iqoption.core.microservices.kyc.a;
import com.iqoption.core.util.TimeUtil;
import java.util.Date;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0003"}, bng = {"getFormattedDate", "", "input", "core_release"})
/* compiled from: KycDocumentHistory.kt */
public final class d {
    private static final String gL(String str) {
        CharSequence charSequence = str;
        Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        String str2 = null;
        if (obj != null) {
            return null;
        }
        Date parse;
        try {
            parse = a.bup.aes().parse(str);
        } catch (Exception unused) {
            parse = null;
        }
        if (parse != null) {
            str2 = TimeUtil.bRA.format(parse);
        }
        return str2;
    }
}
