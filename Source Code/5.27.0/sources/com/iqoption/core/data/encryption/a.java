package com.iqoption.core.data.encryption;

import kotlin.d;
import kotlin.i;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.k;
import kotlin.reflect.j;

@i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, bng = {"Lcom/iqoption/core/data/encryption/AesGcmCryptor;", "Lcom/iqoption/core/data/encryption/Cryptor;", "key", "", "iv", "([B[B)V", "delegate", "Lcom/iqoption/core/data/encryption/CipherCryptor;", "info", "Lcom/iqoption/core/data/encryption/CipherInfo;", "getInfo", "()Lcom/iqoption/core/data/encryption/CipherInfo;", "info$delegate", "Lkotlin/Lazy;", "decrypt", "input", "encrypt", "core_release"})
/* compiled from: AesGcmCryptor.kt */
public final class a {
    static final /* synthetic */ j[] anY = new j[]{k.a(new PropertyReference1Impl(k.G(a.class), "info", "getInfo()Lcom/iqoption/core/data/encryption/CipherInfo;"))};
    private final d bcB = g.c(new AesGcmCryptor$info$2(this));
    private final b bcC = new b(new AesGcmCryptor$delegate$1(this));
    private final byte[] iv;
    private final byte[] key;

    private final c VF() {
        d dVar = this.bcB;
        j jVar = anY[0];
        return (c) dVar.getValue();
    }

    public a(byte[] bArr, byte[] bArr2) {
        kotlin.jvm.internal.i.f(bArr, "key");
        kotlin.jvm.internal.i.f(bArr2, "iv");
        this.key = bArr;
        this.iv = bArr2;
    }

    public byte[] m(byte[] bArr) {
        kotlin.jvm.internal.i.f(bArr, "input");
        return this.bcC.m(bArr);
    }
}
