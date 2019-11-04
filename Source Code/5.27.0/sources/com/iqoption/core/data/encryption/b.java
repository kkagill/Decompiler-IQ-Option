package com.iqoption.core.data.encryption;

import javax.crypto.Cipher;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R)\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, bng = {"Lcom/iqoption/core/data/encryption/CipherCryptor;", "Lcom/iqoption/core/data/encryption/Cryptor;", "getCipher", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "mode", "Ljavax/crypto/Cipher;", "(Lkotlin/jvm/functions/Function1;)V", "decrypt", "", "input", "encrypt", "core_release"})
/* compiled from: CipherCryptor.kt */
public final class b {
    private final kotlin.jvm.a.b<Integer, Cipher> bcD;

    public b(kotlin.jvm.a.b<? super Integer, ? extends Cipher> bVar) {
        kotlin.jvm.internal.i.f(bVar, "getCipher");
        this.bcD = bVar;
    }

    public byte[] m(byte[] bArr) {
        kotlin.jvm.internal.i.f(bArr, "input");
        bArr = ((Cipher) this.bcD.invoke(Integer.valueOf(2))).doFinal(bArr);
        kotlin.jvm.internal.i.e(bArr, "getCipher(Cipher.DECRYPT_MODE).doFinal(input)");
        return bArr;
    }
}
