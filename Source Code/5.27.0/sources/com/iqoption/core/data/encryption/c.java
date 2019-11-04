package com.iqoption.core.data.encryption;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/data/encryption/CipherInfo;", "", "cipher", "Ljavax/crypto/Cipher;", "key", "Ljavax/crypto/SecretKey;", "iv", "Ljava/security/spec/AlgorithmParameterSpec;", "(Ljavax/crypto/Cipher;Ljavax/crypto/SecretKey;Ljava/security/spec/AlgorithmParameterSpec;)V", "getCipher", "()Ljavax/crypto/Cipher;", "getIv", "()Ljava/security/spec/AlgorithmParameterSpec;", "getKey", "()Ljavax/crypto/SecretKey;", "core_release"})
/* compiled from: CipherInfo.kt */
public final class c {
    private final Cipher bcE;
    private final SecretKey bcF;
    private final AlgorithmParameterSpec bcG;

    public c(Cipher cipher, SecretKey secretKey, AlgorithmParameterSpec algorithmParameterSpec) {
        kotlin.jvm.internal.i.f(cipher, "cipher");
        kotlin.jvm.internal.i.f(secretKey, "key");
        kotlin.jvm.internal.i.f(algorithmParameterSpec, "iv");
        this.bcE = cipher;
        this.bcF = secretKey;
        this.bcG = algorithmParameterSpec;
    }

    public final SecretKey VH() {
        return this.bcF;
    }

    public final AlgorithmParameterSpec VI() {
        return this.bcG;
    }

    public final Cipher getCipher() {
        return this.bcE;
    }
}
