package com.iqoption.kyc.document.jumio;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, bng = {"Lcom/iqoption/kyc/document/jumio/JumioException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "kyc_release"})
/* compiled from: JumioException.kt */
public class JumioException extends Exception {
    public JumioException(String str) {
        kotlin.jvm.internal.i.f(str, "message");
        super(str);
    }
}
