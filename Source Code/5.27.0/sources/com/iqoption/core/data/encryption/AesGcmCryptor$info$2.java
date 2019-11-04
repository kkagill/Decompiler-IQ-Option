package com.iqoption.core.data.encryption;

import android.os.Build.VERSION;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "Lcom/iqoption/core/data/encryption/CipherInfo;", "invoke"})
/* compiled from: AesGcmCryptor.kt */
final class AesGcmCryptor$info$2 extends Lambda implements a<c> {
    final /* synthetic */ a this$0;

    AesGcmCryptor$info$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    /* renamed from: VG */
    public final c invoke() {
        AlgorithmParameterSpec gCMParameterSpec;
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        byte[] a = this.this$0.key;
        int length = a.length % 16;
        if (length != 0) {
            byte[] bArr = new byte[(a.length + length)];
            System.arraycopy(a, 0, bArr, 0, a.length);
            a = bArr;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(a, "AES");
        if (VERSION.SDK_INT >= 24) {
            gCMParameterSpec = new GCMParameterSpec(128, this.this$0.iv);
        } else {
            gCMParameterSpec = new IvParameterSpec(this.this$0.iv);
        }
        kotlin.jvm.internal.i.e(instance, "cipher");
        return new c(instance, secretKeySpec, gCMParameterSpec);
    }
}
