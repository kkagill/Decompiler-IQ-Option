package com.iqoption.core.util.b;

import android.content.Context;
import androidx.annotation.StringRes;
import com.iqoption.core.d;
import com.iqoption.core.data.d.e;
import com.iqoption.core.i.k;
import com.iqoption.core.util.TimeUtil;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a \u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u001e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e\u001a\u000e\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0011"}, bng = {"getAmlPolicyLink", "", "context", "Landroid/content/Context;", "getLocale", "getLocalizedLink", "linkResId", "", "endpoint", "getPrivacyPolicyLink", "getPrivacyPolicyLinkMobile", "getQuoteLink", "activeId", "data", "", "getTermsLink", "getTermsLinkRegulatedMobile", "core_release"})
/* compiled from: Links.kt */
public final class f {
    public static final String bn(Context context) {
        kotlin.jvm.internal.i.f(context, "context");
        boolean Er = e.bdq.Er();
        int i = k.terms_and_conditions_link_n1_n2_n3;
        String Vh = Er ? d.EE().Vh() : d.EE().Vi();
        String string = context.getString(i, new Object[]{Vh, bs(context), String.valueOf(Er)});
        kotlin.jvm.internal.i.e(string, "context.getString(linkRe…, isRegulated.toString())");
        return string;
    }

    public static final String bo(Context context) {
        String Vh;
        int i;
        kotlin.jvm.internal.i.f(context, "context");
        if (e.bdq.Er()) {
            Vh = d.EE().Vh();
            i = k.privacy_policy_link_regulated_n1_n2;
        } else {
            Vh = d.EE().Vi();
            i = k.privacy_policy_link_common_n1_n2;
        }
        String string = context.getString(i, new Object[]{Vh, bs(context)});
        kotlin.jvm.internal.i.e(string, "context.getString(linkRe…oint, getLocale(context))");
        return string;
    }

    public static final String bp(Context context) {
        kotlin.jvm.internal.i.f(context, "context");
        String string = context.getString(k.aml_policy_link_n1_n2_n3, new Object[]{d.EE().Vi(), bs(context), String.valueOf(e.bdq.Er())});
        kotlin.jvm.internal.i.e(string, "context.getString(R.stri…s.isRegulated.toString())");
        return string;
    }

    public static final String bq(Context context) {
        kotlin.jvm.internal.i.f(context, "context");
        String string = context.getString(k.terms_and_conditions_link_regulated_mobile_n1_n2, new Object[]{d.EE().Vi(), bs(context)});
        kotlin.jvm.internal.i.e(string, "context.getString(R.stri…bApi, getLocale(context))");
        return string;
    }

    public static final String br(Context context) {
        kotlin.jvm.internal.i.f(context, "context");
        String string = context.getString(k.privacy_policy_link_mobile_n1_n2, new Object[]{d.EE().Vi(), bs(context)});
        kotlin.jvm.internal.i.e(string, "context.getString(R.stri…bApi, getLocale(context))");
        return string;
    }

    public static final String a(Context context, @StringRes int i, String str) {
        kotlin.jvm.internal.i.f(context, "context");
        kotlin.jvm.internal.i.f(str, "endpoint");
        String string = context.getString(i, new Object[]{str, bs(context)});
        kotlin.jvm.internal.i.e(string, "context.getString(linkRe…oint, getLocale(context))");
        return string;
    }

    public static final String a(Context context, int i, long j) {
        kotlin.jvm.internal.i.f(context, "context");
        String format = TimeUtil.bRM.anM().format(Long.valueOf(j));
        String string = context.getString(k.quote_link_n1_n2_n3_n4, new Object[]{d.EE().Vi(), bs(context), String.valueOf(i), format});
        kotlin.jvm.internal.i.e(string, "context.getString(R.stri…d.toString(), formatData)");
        return string;
    }

    private static final String bs(Context context) {
        String string = context.getString(k.link_language_key);
        kotlin.jvm.internal.i.e(string, "locale");
        if ((((CharSequence) string).length() > 0 ? 1 : null) == null) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/");
        return stringBuilder.toString();
    }
}
