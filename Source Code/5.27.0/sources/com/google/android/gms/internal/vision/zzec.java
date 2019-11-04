package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzec<MessageType extends zzec<MessageType, BuilderType>, BuilderType extends zzed<MessageType, BuilderType>> implements zzhf {
    private static boolean zzrj = false;
    protected int zzri = 0;

    public final zzeo zzce() {
        try {
            zzev zzaj = zzeo.zzaj(zzeq());
            zzb(zzaj.zzdp());
            return zzaj.zzdo();
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

    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzeq()];
            zzfe zzg = zzfe.zzg(bArr);
            zzb(zzg);
            zzg.zzea();
            return bArr;
        } catch (IOException e) {
            String str = "byte array";
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
    public int zzcf() {
        throw new UnsupportedOperationException();
    }

    /* Access modifiers changed, original: 0000 */
    public void zzy(int i) {
        throw new UnsupportedOperationException();
    }

    protected static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzga.checkNotNull(iterable);
        String str = " is null.";
        String str2 = "Element at index ";
        int size;
        StringBuilder stringBuilder;
        String stringBuilder2;
        int size2;
        if (iterable instanceof zzgo) {
            List zzft = ((zzgo) iterable).zzft();
            zzgo zzgo = (zzgo) list;
            int size3 = list.size();
            for (Object next : zzft) {
                if (next == null) {
                    size = zzgo.size() - size3;
                    stringBuilder = new StringBuilder(37);
                    stringBuilder.append(str2);
                    stringBuilder.append(size);
                    stringBuilder.append(str);
                    stringBuilder2 = stringBuilder.toString();
                    for (size2 = zzgo.size() - 1; size2 >= size3; size2--) {
                        zzgo.remove(size2);
                    }
                    throw new NullPointerException(stringBuilder2);
                } else if (next instanceof zzeo) {
                    zzgo.zzc((zzeo) next);
                } else {
                    zzgo.add((String) next);
                }
            }
        } else if (iterable instanceof zzhr) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    size = list.size() - size4;
                    stringBuilder = new StringBuilder(37);
                    stringBuilder.append(str2);
                    stringBuilder.append(size);
                    stringBuilder.append(str);
                    stringBuilder2 = stringBuilder.toString();
                    for (size2 = list.size() - 1; size2 >= size4; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(stringBuilder2);
                }
                list.add(next2);
            }
        }
    }
}
