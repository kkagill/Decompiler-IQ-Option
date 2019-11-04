package com.google.android.gms.internal.measurement;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzee extends zzdm {
    private static final Logger logger = Logger.getLogger(zzee.class.getName());
    private static final boolean zzaec = zzhv.zzwt();
    zzei zzaed = this;

    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(String str) {
            str = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(str.length() != 0 ? str2.concat(str) : new String(str2));
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        zzb(String str, Throwable th) {
            str = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(str.length() != 0 ? str2.concat(str) : new String(str2), th);
        }
    }

    static class zza extends zzee {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zza(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if (((i | i2) | (bArr.length - i3)) >= 0) {
                    this.buffer = bArr;
                    this.offset = i;
                    this.position = i;
                    this.limit = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        public void flush() {
        }

        public final void zzb(int i, int i2) {
            zzbf((i << 3) | i2);
        }

        public final void zzc(int i, int i2) {
            zzb(i, 0);
            zzbe(i2);
        }

        public final void zzd(int i, int i2) {
            zzb(i, 0);
            zzbf(i2);
        }

        public final void zzf(int i, int i2) {
            zzb(i, 5);
            zzbh(i2);
        }

        public final void zza(int i, long j) {
            zzb(i, 0);
            zzbn(j);
        }

        public final void zzc(int i, long j) {
            zzb(i, 1);
            zzbp(j);
        }

        public final void zzb(int i, boolean z) {
            zzb(i, 0);
            zzc((byte) z);
        }

        public final void zzb(int i, String str) {
            zzb(i, 2);
            zzdr(str);
        }

        public final void zza(int i, zzdp zzdp) {
            zzb(i, 2);
            zza(zzdp);
        }

        public final void zza(zzdp zzdp) {
            zzbf(zzdp.size());
            zzdp.zza((zzdm) this);
        }

        public final void zze(byte[] bArr, int i, int i2) {
            zzbf(i2);
            write(bArr, 0, i2);
        }

        public final void zza(int i, zzgi zzgi) {
            zzb(i, 2);
            zzb(zzgi);
        }

        /* Access modifiers changed, original: final */
        public final void zza(int i, zzgi zzgi, zzgx zzgx) {
            zzb(i, 2);
            zzdf zzdf = (zzdf) zzgi;
            int zzrt = zzdf.zzrt();
            if (zzrt == -1) {
                zzrt = zzgx.zzt(zzdf);
                zzdf.zzam(zzrt);
            }
            zzbf(zzrt);
            zzgx.zza(zzgi, this.zzaed);
        }

        public final void zzb(int i, zzgi zzgi) {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzgi);
            zzb(1, 4);
        }

        public final void zzb(int i, zzdp zzdp) {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzdp);
            zzb(1, 4);
        }

        public final void zzb(zzgi zzgi) {
            zzbf(zzgi.zzuk());
            zzgi.zzb(this);
        }

        /* Access modifiers changed, original: final */
        public final void zza(zzgi zzgi, zzgx zzgx) {
            zzdf zzdf = (zzdf) zzgi;
            int zzrt = zzdf.zzrt();
            if (zzrt == -1) {
                zzrt = zzgx.zzt(zzdf);
                zzdf.zzam(zzrt);
            }
            zzbf(zzrt);
            zzgx.zza(zzgi, this.zzaed);
        }

        public final void zzc(byte b) {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
            }
        }

        public final void zzbe(int i) {
            if (i >= 0) {
                zzbf(i);
            } else {
                zzbn((long) i);
            }
        }

        public final void zzbf(int i) {
            byte[] bArr;
            int i2;
            if (!zzee.zzaec || zzdi.zzrv() || zztg() < 5) {
                while ((i & -128) != 0) {
                    bArr = this.buffer;
                    i2 = this.position;
                    this.position = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    bArr = this.buffer;
                    i2 = this.position;
                    this.position = i2 + 1;
                    bArr[i2] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
                }
            } else if ((i & -128) == 0) {
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                zzhv.zza(bArr, (long) i2, (byte) i);
            } else {
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                zzhv.zza(bArr, (long) i2, (byte) (i | 128));
                i >>>= 7;
                if ((i & -128) == 0) {
                    bArr = this.buffer;
                    i2 = this.position;
                    this.position = i2 + 1;
                    zzhv.zza(bArr, (long) i2, (byte) i);
                    return;
                }
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                zzhv.zza(bArr, (long) i2, (byte) (i | 128));
                i >>>= 7;
                if ((i & -128) == 0) {
                    bArr = this.buffer;
                    i2 = this.position;
                    this.position = i2 + 1;
                    zzhv.zza(bArr, (long) i2, (byte) i);
                    return;
                }
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                zzhv.zza(bArr, (long) i2, (byte) (i | 128));
                i >>>= 7;
                if ((i & -128) == 0) {
                    bArr = this.buffer;
                    i2 = this.position;
                    this.position = i2 + 1;
                    zzhv.zza(bArr, (long) i2, (byte) i);
                    return;
                }
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                zzhv.zza(bArr, (long) i2, (byte) (i | 128));
                i >>>= 7;
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                zzhv.zza(bArr, (long) i2, (byte) i);
            }
        }

        public final void zzbh(int i) {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) i;
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) (i >> 8);
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) (i >> 16);
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                bArr[i2] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
            }
        }

        public final void zzbn(long j) {
            byte[] bArr;
            int i;
            int i2;
            if (!zzee.zzaec || zztg() < 10) {
                while ((j & -128) != 0) {
                    bArr = this.buffer;
                    i = this.position;
                    this.position = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    bArr = this.buffer;
                    i2 = this.position;
                    this.position = i2 + 1;
                    bArr[i2] = (byte) ((int) j);
                    return;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
                }
            }
            while ((j & -128) != 0) {
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                zzhv.zza(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            bArr = this.buffer;
            i2 = this.position;
            this.position = i2 + 1;
            zzhv.zza(bArr, (long) i2, (byte) ((int) j));
        }

        public final void zzbp(long j) {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) j);
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 8));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 16));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 24));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 32));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 40));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 48));
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                bArr[i] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
            }
        }

        public final void write(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)}), e);
            }
        }

        public final void zza(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        public final void zzdr(String str) {
            int i = this.position;
            try {
                int zzbk = zzee.zzbk(str.length() * 3);
                int zzbk2 = zzee.zzbk(str.length());
                if (zzbk2 == zzbk) {
                    this.position = i + zzbk2;
                    zzbk = zzhy.zza(str, this.buffer, this.position, zztg());
                    this.position = i;
                    zzbf((zzbk - i) - zzbk2);
                    this.position = zzbk;
                    return;
                }
                zzbf(zzhy.zza(str));
                this.position = zzhy.zza(str, this.buffer, this.position, zztg());
            } catch (zzib e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        public final int zztg() {
            return this.limit - this.position;
        }

        public final int zztj() {
            return this.position - this.offset;
        }
    }

    static final class zzd extends zzee {
        private final ByteBuffer zzaeh;
        private final ByteBuffer zzaei;
        private final long zzaej;
        private final long zzaek;
        private final long zzael;
        private final long zzaem = (this.zzael - 10);
        private long zzaen = this.zzaek;

        zzd(ByteBuffer byteBuffer) {
            super();
            this.zzaeh = byteBuffer;
            this.zzaei = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.zzaej = zzhv.zzb(byteBuffer);
            this.zzaek = this.zzaej + ((long) byteBuffer.position());
            this.zzael = this.zzaej + ((long) byteBuffer.limit());
        }

        public final void zzb(int i, int i2) {
            zzbf((i << 3) | i2);
        }

        public final void zzc(int i, int i2) {
            zzb(i, 0);
            zzbe(i2);
        }

        public final void zzd(int i, int i2) {
            zzb(i, 0);
            zzbf(i2);
        }

        public final void zzf(int i, int i2) {
            zzb(i, 5);
            zzbh(i2);
        }

        public final void zza(int i, long j) {
            zzb(i, 0);
            zzbn(j);
        }

        public final void zzc(int i, long j) {
            zzb(i, 1);
            zzbp(j);
        }

        public final void zzb(int i, boolean z) {
            zzb(i, 0);
            zzc((byte) z);
        }

        public final void zzb(int i, String str) {
            zzb(i, 2);
            zzdr(str);
        }

        public final void zza(int i, zzdp zzdp) {
            zzb(i, 2);
            zza(zzdp);
        }

        public final void zza(int i, zzgi zzgi) {
            zzb(i, 2);
            zzb(zzgi);
        }

        /* Access modifiers changed, original: final */
        public final void zza(int i, zzgi zzgi, zzgx zzgx) {
            zzb(i, 2);
            zza(zzgi, zzgx);
        }

        public final void zzb(int i, zzgi zzgi) {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzgi);
            zzb(1, 4);
        }

        public final void zzb(int i, zzdp zzdp) {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzdp);
            zzb(1, 4);
        }

        public final void zzb(zzgi zzgi) {
            zzbf(zzgi.zzuk());
            zzgi.zzb(this);
        }

        /* Access modifiers changed, original: final */
        public final void zza(zzgi zzgi, zzgx zzgx) {
            zzdf zzdf = (zzdf) zzgi;
            int zzrt = zzdf.zzrt();
            if (zzrt == -1) {
                zzrt = zzgx.zzt(zzdf);
                zzdf.zzam(zzrt);
            }
            zzbf(zzrt);
            zzgx.zza(zzgi, this.zzaed);
        }

        public final void zzc(byte b) {
            long j = this.zzaen;
            if (j < this.zzael) {
                this.zzaen = 1 + j;
                zzhv.zza(j, b);
                return;
            }
            throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(this.zzael), Integer.valueOf(1)}));
        }

        public final void zza(zzdp zzdp) {
            zzbf(zzdp.size());
            zzdp.zza((zzdm) this);
        }

        public final void zze(byte[] bArr, int i, int i2) {
            zzbf(i2);
            write(bArr, 0, i2);
        }

        public final void zzbe(int i) {
            if (i >= 0) {
                zzbf(i);
            } else {
                zzbn((long) i);
            }
        }

        public final void zzbf(int i) {
            long j;
            if (this.zzaen <= this.zzaem) {
                while ((i & -128) != 0) {
                    j = this.zzaen;
                    this.zzaen = j + 1;
                    zzhv.zza(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                j = this.zzaen;
                this.zzaen = 1 + j;
                zzhv.zza(j, (byte) i);
                return;
            }
            while (true) {
                j = this.zzaen;
                if (j >= this.zzael) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(this.zzael), Integer.valueOf(1)}));
                } else if ((i & -128) == 0) {
                    this.zzaen = 1 + j;
                    zzhv.zza(j, (byte) i);
                    return;
                } else {
                    this.zzaen = j + 1;
                    zzhv.zza(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }

        public final void zzbh(int i) {
            this.zzaei.putInt((int) (this.zzaen - this.zzaej), i);
            this.zzaen += 4;
        }

        public final void zzbn(long j) {
            long j2;
            if (this.zzaen <= this.zzaem) {
                while ((j & -128) != 0) {
                    j2 = this.zzaen;
                    this.zzaen = j2 + 1;
                    zzhv.zza(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                j2 = this.zzaen;
                this.zzaen = 1 + j2;
                zzhv.zza(j2, (byte) ((int) j));
                return;
            }
            while (true) {
                j2 = this.zzaen;
                if (j2 >= this.zzael) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j2), Long.valueOf(this.zzael), Integer.valueOf(1)}));
                } else if ((j & -128) == 0) {
                    this.zzaen = 1 + j2;
                    zzhv.zza(j2, (byte) ((int) j));
                    return;
                } else {
                    this.zzaen = j2 + 1;
                    zzhv.zza(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        public final void zzbp(long j) {
            this.zzaei.putLong((int) (this.zzaen - this.zzaej), j);
            this.zzaen += 8;
        }

        public final void write(byte[] bArr, int i, int i2) {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                long j2 = this.zzael - j;
                long j3 = this.zzaen;
                if (j2 >= j3) {
                    zzhv.zza(bArr, (long) i, j3, j);
                    this.zzaen += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException(ConditionalUserProperty.VALUE);
            }
            throw new zzb(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.zzaen), Long.valueOf(this.zzael), Integer.valueOf(i2)}));
        }

        public final void zza(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        public final void zzdr(String str) {
            long j = this.zzaen;
            try {
                int zzbk = zzee.zzbk(str.length() * 3);
                int zzbk2 = zzee.zzbk(str.length());
                if (zzbk2 == zzbk) {
                    zzbk = ((int) (this.zzaen - this.zzaej)) + zzbk2;
                    this.zzaei.position(zzbk);
                    zzhy.zza(str, this.zzaei);
                    zzbk2 = this.zzaei.position() - zzbk;
                    zzbf(zzbk2);
                    this.zzaen += (long) zzbk2;
                    return;
                }
                zzbk = zzhy.zza(str);
                zzbf(zzbk);
                zzbw(this.zzaen);
                zzhy.zza(str, this.zzaei);
                this.zzaen += (long) zzbk;
            } catch (zzib e) {
                this.zzaen = j;
                zzbw(this.zzaen);
                zza(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzb(e2);
            } catch (IndexOutOfBoundsException e22) {
                throw new zzb(e22);
            }
        }

        public final void flush() {
            this.zzaeh.position((int) (this.zzaen - this.zzaej));
        }

        public final int zztg() {
            return (int) (this.zzael - this.zzaen);
        }

        private final void zzbw(long j) {
            this.zzaei.position((int) (j - this.zzaej));
        }
    }

    static final class zze extends zzee {
        private final int zzaeg;
        private final ByteBuffer zzaeh;
        private final ByteBuffer zzaei;

        zze(ByteBuffer byteBuffer) {
            super();
            this.zzaeh = byteBuffer;
            this.zzaei = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.zzaeg = byteBuffer.position();
        }

        public final void zzb(int i, int i2) {
            zzbf((i << 3) | i2);
        }

        public final void zzc(int i, int i2) {
            zzb(i, 0);
            zzbe(i2);
        }

        public final void zzd(int i, int i2) {
            zzb(i, 0);
            zzbf(i2);
        }

        public final void zzf(int i, int i2) {
            zzb(i, 5);
            zzbh(i2);
        }

        public final void zza(int i, long j) {
            zzb(i, 0);
            zzbn(j);
        }

        public final void zzc(int i, long j) {
            zzb(i, 1);
            zzbp(j);
        }

        public final void zzb(int i, boolean z) {
            zzb(i, 0);
            zzc((byte) z);
        }

        public final void zzb(int i, String str) {
            zzb(i, 2);
            zzdr(str);
        }

        public final void zza(int i, zzdp zzdp) {
            zzb(i, 2);
            zza(zzdp);
        }

        public final void zza(int i, zzgi zzgi) {
            zzb(i, 2);
            zzb(zzgi);
        }

        /* Access modifiers changed, original: final */
        public final void zza(int i, zzgi zzgi, zzgx zzgx) {
            zzb(i, 2);
            zza(zzgi, zzgx);
        }

        public final void zzb(int i, zzgi zzgi) {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzgi);
            zzb(1, 4);
        }

        public final void zzb(int i, zzdp zzdp) {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzdp);
            zzb(1, 4);
        }

        public final void zzb(zzgi zzgi) {
            zzbf(zzgi.zzuk());
            zzgi.zzb(this);
        }

        /* Access modifiers changed, original: final */
        public final void zza(zzgi zzgi, zzgx zzgx) {
            zzdf zzdf = (zzdf) zzgi;
            int zzrt = zzdf.zzrt();
            if (zzrt == -1) {
                zzrt = zzgx.zzt(zzdf);
                zzdf.zzam(zzrt);
            }
            zzbf(zzrt);
            zzgx.zza(zzgi, this.zzaed);
        }

        public final void zzc(byte b) {
            try {
                this.zzaei.put(b);
            } catch (BufferOverflowException e) {
                throw new zzb(e);
            }
        }

        public final void zza(zzdp zzdp) {
            zzbf(zzdp.size());
            zzdp.zza((zzdm) this);
        }

        public final void zze(byte[] bArr, int i, int i2) {
            zzbf(i2);
            write(bArr, 0, i2);
        }

        public final void zzbe(int i) {
            if (i >= 0) {
                zzbf(i);
            } else {
                zzbn((long) i);
            }
        }

        public final void zzbf(int i) {
            while ((i & -128) != 0) {
                this.zzaei.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.zzaei.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new zzb(e);
            }
        }

        public final void zzbh(int i) {
            try {
                this.zzaei.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzb(e);
            }
        }

        public final void zzbn(long j) {
            while ((-128 & j) != 0) {
                this.zzaei.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.zzaei.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new zzb(e);
            }
        }

        public final void zzbp(long j) {
            try {
                this.zzaei.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzb(e);
            }
        }

        public final void write(byte[] bArr, int i, int i2) {
            try {
                this.zzaei.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(e);
            } catch (BufferOverflowException e2) {
                throw new zzb(e2);
            }
        }

        public final void zza(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        public final void zzdr(String str) {
            int position = this.zzaei.position();
            try {
                int zzbk = zzee.zzbk(str.length() * 3);
                int zzbk2 = zzee.zzbk(str.length());
                if (zzbk2 == zzbk) {
                    zzbk = this.zzaei.position() + zzbk2;
                    this.zzaei.position(zzbk);
                    zzdt(str);
                    zzbk2 = this.zzaei.position();
                    this.zzaei.position(position);
                    zzbf(zzbk2 - zzbk);
                    this.zzaei.position(zzbk2);
                    return;
                }
                zzbf(zzhy.zza(str));
                zzdt(str);
            } catch (zzib e) {
                this.zzaei.position(position);
                zza(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzb(e2);
            }
        }

        public final void flush() {
            this.zzaeh.position(this.zzaei.position());
        }

        public final int zztg() {
            return this.zzaei.remaining();
        }

        private final void zzdt(String str) {
            try {
                zzhy.zza(str, this.zzaei);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(e);
            }
        }
    }

    static final class zzc extends zza {
        private final ByteBuffer zzaef;
        private int zzaeg;

        zzc(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.zzaef = byteBuffer;
            this.zzaeg = byteBuffer.position();
        }

        public final void flush() {
            this.zzaef.position(this.zzaeg + zztj());
        }
    }

    public static int zzb(float f) {
        return 4;
    }

    public static int zzbk(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    public static int zzbm(int i) {
        return 4;
    }

    public static int zzbn(int i) {
        return 4;
    }

    private static int zzbp(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int zzbr(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    public static int zzbt(long j) {
        return 8;
    }

    public static int zzbu(long j) {
        return 8;
    }

    private static long zzbv(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zze(double d) {
        return 8;
    }

    public static zzee zzf(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzr(boolean z) {
        return 1;
    }

    public abstract void flush();

    public abstract void write(byte[] bArr, int i, int i2);

    public abstract void zza(int i, long j);

    public abstract void zza(int i, zzdp zzdp);

    public abstract void zza(int i, zzgi zzgi);

    public abstract void zza(int i, zzgi zzgi, zzgx zzgx);

    public abstract void zza(zzdp zzdp);

    public abstract void zza(zzgi zzgi, zzgx zzgx);

    public abstract void zzb(int i, int i2);

    public abstract void zzb(int i, zzdp zzdp);

    public abstract void zzb(int i, zzgi zzgi);

    public abstract void zzb(int i, String str);

    public abstract void zzb(int i, boolean z);

    public abstract void zzb(zzgi zzgi);

    public abstract void zzbe(int i);

    public abstract void zzbf(int i);

    public abstract void zzbh(int i);

    public abstract void zzbn(long j);

    public abstract void zzbp(long j);

    public abstract void zzc(byte b);

    public abstract void zzc(int i, int i2);

    public abstract void zzc(int i, long j);

    public abstract void zzd(int i, int i2);

    public abstract void zzdr(String str);

    public abstract void zze(byte[] bArr, int i, int i2);

    public abstract void zzf(int i, int i2);

    public abstract int zztg();

    public static zzee zza(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new zzc(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (zzhv.zzwu()) {
            return new zzd(byteBuffer);
        } else {
            return new zze(byteBuffer);
        }
    }

    private zzee() {
    }

    public final void zze(int i, int i2) {
        zzd(i, zzbp(i2));
    }

    public final void zzb(int i, long j) {
        zza(i, zzbv(j));
    }

    public final void zza(int i, float f) {
        zzf(i, Float.floatToRawIntBits(f));
    }

    public final void zza(int i, double d) {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    public final void zzbg(int i) {
        zzbf(zzbp(i));
    }

    public final void zzbo(long j) {
        zzbn(zzbv(j));
    }

    public final void zza(float f) {
        zzbh(Float.floatToRawIntBits(f));
    }

    public final void zzd(double d) {
        zzbp(Double.doubleToRawLongBits(d));
    }

    public final void zzq(boolean z) {
        zzc((byte) z);
    }

    public static int zzg(int i, int i2) {
        return zzbi(i) + zzbj(i2);
    }

    public static int zzh(int i, int i2) {
        return zzbi(i) + zzbk(i2);
    }

    public static int zzi(int i, int i2) {
        return zzbi(i) + zzbk(zzbp(i2));
    }

    public static int zzj(int i, int i2) {
        return zzbi(i) + 4;
    }

    public static int zzk(int i, int i2) {
        return zzbi(i) + 4;
    }

    public static int zzd(int i, long j) {
        return zzbi(i) + zzbr(j);
    }

    public static int zze(int i, long j) {
        return zzbi(i) + zzbr(j);
    }

    public static int zzf(int i, long j) {
        return zzbi(i) + zzbr(zzbv(j));
    }

    public static int zzg(int i, long j) {
        return zzbi(i) + 8;
    }

    public static int zzh(int i, long j) {
        return zzbi(i) + 8;
    }

    public static int zzb(int i, float f) {
        return zzbi(i) + 4;
    }

    public static int zzb(int i, double d) {
        return zzbi(i) + 8;
    }

    public static int zzc(int i, boolean z) {
        return zzbi(i) + 1;
    }

    public static int zzl(int i, int i2) {
        return zzbi(i) + zzbj(i2);
    }

    public static int zzc(int i, String str) {
        return zzbi(i) + zzds(str);
    }

    public static int zzc(int i, zzdp zzdp) {
        i = zzbi(i);
        int size = zzdp.size();
        return i + (zzbk(size) + size);
    }

    public static int zza(int i, zzfn zzfn) {
        i = zzbi(i);
        int zzuk = zzfn.zzuk();
        return i + (zzbk(zzuk) + zzuk);
    }

    public static int zzc(int i, zzgi zzgi) {
        return zzbi(i) + zzc(zzgi);
    }

    static int zzb(int i, zzgi zzgi, zzgx zzgx) {
        return zzbi(i) + zzb(zzgi, zzgx);
    }

    public static int zzd(int i, zzgi zzgi) {
        return ((zzbi(1) << 1) + zzh(2, i)) + zzc(3, zzgi);
    }

    public static int zzd(int i, zzdp zzdp) {
        return ((zzbi(1) << 1) + zzh(2, i)) + zzc(3, zzdp);
    }

    public static int zzb(int i, zzfn zzfn) {
        return ((zzbi(1) << 1) + zzh(2, i)) + zza(3, zzfn);
    }

    public static int zzbi(int i) {
        return zzbk(i << 3);
    }

    public static int zzbj(int i) {
        return i >= 0 ? zzbk(i) : 10;
    }

    public static int zzbl(int i) {
        return zzbk(zzbp(i));
    }

    public static int zzbq(long j) {
        return zzbr(j);
    }

    public static int zzbs(long j) {
        return zzbr(zzbv(j));
    }

    public static int zzbo(int i) {
        return zzbj(i);
    }

    public static int zzds(String str) {
        int zza;
        try {
            zza = zzhy.zza(str);
        } catch (zzib unused) {
            zza = str.getBytes(zzez.UTF_8).length;
        }
        return zzbk(zza) + zza;
    }

    public static int zza(zzfn zzfn) {
        int zzuk = zzfn.zzuk();
        return zzbk(zzuk) + zzuk;
    }

    public static int zzb(zzdp zzdp) {
        int size = zzdp.size();
        return zzbk(size) + size;
    }

    public static int zzg(byte[] bArr) {
        int length = bArr.length;
        return zzbk(length) + length;
    }

    public static int zzc(zzgi zzgi) {
        int zzuk = zzgi.zzuk();
        return zzbk(zzuk) + zzuk;
    }

    static int zzb(zzgi zzgi, zzgx zzgx) {
        zzdf zzdf = (zzdf) zzgi;
        int zzrt = zzdf.zzrt();
        if (zzrt == -1) {
            zzrt = zzgx.zzt(zzdf);
            zzdf.zzam(zzrt);
        }
        return zzbk(zzrt) + zzrt;
    }

    public final void zzth() {
        if (zztg() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* Access modifiers changed, original: final */
    public final void zza(String str, zzib zzib) {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzib);
        byte[] bytes = str.getBytes(zzez.UTF_8);
        try {
            zzbf(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzb(e);
        } catch (zzb e2) {
            throw e2;
        }
    }

    @Deprecated
    static int zzc(int i, zzgi zzgi, zzgx zzgx) {
        i = zzbi(i) << 1;
        zzdf zzdf = (zzdf) zzgi;
        int zzrt = zzdf.zzrt();
        if (zzrt == -1) {
            zzrt = zzgx.zzt(zzdf);
            zzdf.zzam(zzrt);
        }
        return i + zzrt;
    }

    @Deprecated
    public static int zzd(zzgi zzgi) {
        return zzgi.zzuk();
    }

    @Deprecated
    public static int zzbq(int i) {
        return zzbk(i);
    }

    /* synthetic */ zzee(zzeg zzeg) {
        this();
    }
}
