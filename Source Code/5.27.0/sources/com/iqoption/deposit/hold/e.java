package com.iqoption.deposit.hold;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.iqoption.core.microservices.billing.verification.response.c;
import java.util.Arrays;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.n;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J,\u0010\f\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\u000f"}, bng = {"Lcom/iqoption/deposit/hold/CardVerificationUtils;", "", "()V", "isCardTheSame", "", "pan", "", "month", "", "yearInput", "card", "Lcom/iqoption/core/microservices/billing/verification/response/VerifyCard;", "isCardVerified", "cards", "", "deposit_release"})
/* compiled from: CardVerificationUtils.kt */
public final class e {
    public static final e cDV = new e();

    private e() {
    }

    public final boolean a(List<c> list, String str, int i, int i2) {
        kotlin.jvm.internal.i.f(list, "cards");
        kotlin.jvm.internal.i.f(str, "pan");
        for (Object next : n.b(u.Z(list), (b) CardVerificationUtils$isCardVerified$1.cDW)) {
            if (cDV.a(str, i, i2, (c) next)) {
                break;
            }
        }
        Object next2 = null;
        return next2 != null;
    }

    private final boolean a(String str, int i, int i2, c cVar) {
        n nVar = n.eWf;
        Object[] objArr = new Object[1];
        int i3 = 0;
        objArr[0] = Integer.valueOf(i);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = "%02d";
        String format = String.format(str2, copyOf);
        String str3 = "java.lang.String.format(format, *args)";
        kotlin.jvm.internal.i.e(format, str3);
        if (i2 > CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE) {
            i2 -= 2000;
        }
        n nVar2 = n.eWf;
        Object[] objArr2 = new Object[]{Integer.valueOf(i2)};
        String format2 = String.format(str2, Arrays.copyOf(objArr2, objArr2.length));
        kotlin.jvm.internal.i.e(format2, str3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(format);
        stringBuilder.append('/');
        stringBuilder.append(format2);
        if ((kotlin.jvm.internal.i.y(stringBuilder.toString(), cVar.aba()) ^ 1) != 0) {
            return false;
        }
        format = cVar.getNumber();
        CharSequence charSequence = format;
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < length) {
            if ((Character.isDigit(charSequence.charAt(i4)) ^ 1) != 0) {
                break;
            }
            i4++;
        }
        i4 = -1;
        if (i4 < 0) {
            return kotlin.jvm.internal.i.y(str, format);
        }
        String str4 = "null cannot be cast to non-null type java.lang.String";
        if (str != null) {
            String substring = str.substring(0, i4);
            String str5 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            kotlin.jvm.internal.i.e(substring, str5);
            if (format != null) {
                str2 = format.substring(0, i4);
                kotlin.jvm.internal.i.e(str2, str5);
                if ((kotlin.jvm.internal.i.y(substring, str2) ^ 1) != 0) {
                    return false;
                }
                if (format != null) {
                    charSequence = x.ah(charSequence).toString();
                    i4 = charSequence.length();
                    while (i3 < i4) {
                        if ((Character.isDigit(charSequence.charAt(i3)) ^ 1) != 0) {
                            break;
                        }
                        i3++;
                    }
                    i3 = -1;
                    if (i3 >= 0) {
                        i2 = str.length() - i3;
                        if (str != null) {
                            str = str.substring(i2);
                            format2 = "(this as java.lang.String).substring(startIndex)";
                            kotlin.jvm.internal.i.e(str, format2);
                            int length2 = format.length() - i3;
                            if (format != null) {
                                format = format.substring(length2);
                                kotlin.jvm.internal.i.e(format, format2);
                                return kotlin.jvm.internal.i.y(str, format);
                            }
                            throw new TypeCastException(str4);
                        }
                        throw new TypeCastException(str4);
                    }
                    throw new IllegalStateException("Last start index must not be negative");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            throw new TypeCastException(str4);
        }
        throw new TypeCastException(str4);
    }
}
