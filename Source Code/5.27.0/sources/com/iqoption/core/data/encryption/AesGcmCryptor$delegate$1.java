package com.iqoption.core.data.encryption;

import javax.crypto.Cipher;
import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, bng = {"<anonymous>", "Ljavax/crypto/Cipher;", "mode", "", "invoke"})
/* compiled from: AesGcmCryptor.kt */
final class AesGcmCryptor$delegate$1 extends Lambda implements b<Integer, Cipher> {
    final /* synthetic */ a this$0;

    AesGcmCryptor$delegate$1(a aVar) {
        this.this$0 = aVar;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return eH(((Number) obj).intValue());
    }

    public final Cipher eH(int i) {
        Cipher cipher = this.this$0.VF().getCipher();
        cipher.init(i, this.this$0.VF().VH(), this.this$0.VF().VI());
        return cipher;
    }
}
