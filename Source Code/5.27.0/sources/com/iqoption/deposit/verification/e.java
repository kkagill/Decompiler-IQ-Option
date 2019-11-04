package com.iqoption.deposit.verification;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00018\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, bng = {"Lcom/iqoption/deposit/verification/VerifyWarning;", "T", "", "data", "getData", "()Ljava/lang/Object;", "message", "", "getMessage", "()Ljava/lang/String;", "source", "Lcom/iqoption/deposit/verification/VerifySource;", "getSource", "()Lcom/iqoption/deposit/verification/VerifySource;", "verificationState", "Lcom/iqoption/deposit/verification/VerificationState;", "getVerificationState", "()Lcom/iqoption/deposit/verification/VerificationState;", "deposit_release"})
/* compiled from: VerifyWarning.kt */
public interface e<T> {
    VerifySource atg();

    VerificationState ath();

    T getData();

    String getMessage();
}
