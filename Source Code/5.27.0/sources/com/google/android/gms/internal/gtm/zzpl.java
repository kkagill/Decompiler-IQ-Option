package com.google.android.gms.internal.gtm;

import java.io.IOException;

public abstract class zzpl<MessageType extends zzpl<MessageType, BuilderType>, BuilderType extends zzpm<MessageType, BuilderType>> implements zzsk {
    private static boolean zzavq = false;
    protected int zzavp = 0;

    public final zzps zzmv() {
        try {
            zzqa zzam = zzps.zzam(zzpe());
            zzb(zzam.zznh());
            return zzam.zzng();
        } catch (IOException e) {
            String str = "ByteString";
            String name = getClass().getName();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 62) + str.length());
            stringBuilder.append("Serializing ");
            stringBuilder.append(name);
            stringBuilder.append(" to a ");
            stringBuilder.append(str);
            stringBuilder.append(" threw an IOException (should never happen).");
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    /* Access modifiers changed, original: 0000 */
    public int zzmw() {
        throw new UnsupportedOperationException();
    }

    /* Access modifiers changed, original: 0000 */
    public void zzag(int i) {
        throw new UnsupportedOperationException();
    }
}
