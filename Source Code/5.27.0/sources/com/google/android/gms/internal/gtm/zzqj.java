package com.google.android.gms.internal.gtm;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzqj extends zzpr {
    private static final Logger logger = Logger.getLogger(zzqj.class.getName());
    private static final boolean zzawt = zztx.zzrm();
    zzql zzawu = this;

    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzc(String str) {
            str = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(str.length() != 0 ? str2.concat(str) : new String(str2));
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        zzc(String str, Throwable th) {
            str = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(str.length() != 0 ? str2.concat(str) : new String(str2), th);
        }
    }

    static class zza extends zzqj {
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

        public final void zzd(int i, int i2) {
            zzay((i << 3) | i2);
        }

        public final void zze(int i, int i2) {
            zzd(i, 0);
            zzax(i2);
        }

        public final void zzf(int i, int i2) {
            zzd(i, 0);
            zzay(i2);
        }

        public final void zzh(int i, int i2) {
            zzd(i, 5);
            zzba(i2);
        }

        public final void zza(int i, long j) {
            zzd(i, 0);
            zzp(j);
        }

        public final void zzc(int i, long j) {
            zzd(i, 1);
            zzr(j);
        }

        public final void zzb(int i, boolean z) {
            zzd(i, 0);
            zzc((byte) z);
        }

        public final void zza(int i, String str) {
            zzd(i, 2);
            zzcz(str);
        }

        public final void zza(int i, zzps zzps) {
            zzd(i, 2);
            zza(zzps);
        }

        public final void zza(zzps zzps) {
            zzay(zzps.size());
            zzps.zza((zzpr) this);
        }

        public final void zze(byte[] bArr, int i, int i2) {
            zzay(i2);
            write(bArr, 0, i2);
        }

        public final void zza(int i, zzsk zzsk) {
            zzd(i, 2);
            zzb(zzsk);
        }

        /* Access modifiers changed, original: final */
        public final void zza(int i, zzsk zzsk, zzsz zzsz) {
            zzd(i, 2);
            zzpl zzpl = (zzpl) zzsk;
            int zzmw = zzpl.zzmw();
            if (zzmw == -1) {
                zzmw = zzsz.zzad(zzpl);
                zzpl.zzag(zzmw);
            }
            zzay(zzmw);
            zzsz.zza(zzsk, this.zzawu);
        }

        public final void zzb(int i, zzsk zzsk) {
            zzd(1, 3);
            zzf(2, i);
            zza(3, zzsk);
            zzd(1, 4);
        }

        public final void zzb(int i, zzps zzps) {
            zzd(1, 3);
            zzf(2, i);
            zza(3, zzps);
            zzd(1, 4);
        }

        public final void zzb(zzsk zzsk) {
            zzay(zzsk.zzpe());
            zzsk.zzb(this);
        }

        /* Access modifiers changed, original: final */
        public final void zza(zzsk zzsk, zzsz zzsz) {
            zzpl zzpl = (zzpl) zzsk;
            int zzmw = zzpl.zzmw();
            if (zzmw == -1) {
                zzmw = zzsz.zzad(zzpl);
                zzpl.zzag(zzmw);
            }
            zzay(zzmw);
            zzsz.zza(zzsk, this.zzawu);
        }

        public final void zzc(byte b) {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
            }
        }

        public final void zzax(int i) {
            if (i >= 0) {
                zzay(i);
            } else {
                zzp((long) i);
            }
        }

        public final void zzay(int i) {
            byte[] bArr;
            int i2;
            if (!zzqj.zzawt || zzpp.zzna() || zzoi() < 5) {
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
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
                }
            } else if ((i & -128) == 0) {
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                zztx.zza(bArr, (long) i2, (byte) i);
            } else {
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                zztx.zza(bArr, (long) i2, (byte) (i | 128));
                i >>>= 7;
                if ((i & -128) == 0) {
                    bArr = this.buffer;
                    i2 = this.position;
                    this.position = i2 + 1;
                    zztx.zza(bArr, (long) i2, (byte) i);
                    return;
                }
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                zztx.zza(bArr, (long) i2, (byte) (i | 128));
                i >>>= 7;
                if ((i & -128) == 0) {
                    bArr = this.buffer;
                    i2 = this.position;
                    this.position = i2 + 1;
                    zztx.zza(bArr, (long) i2, (byte) i);
                    return;
                }
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                zztx.zza(bArr, (long) i2, (byte) (i | 128));
                i >>>= 7;
                if ((i & -128) == 0) {
                    bArr = this.buffer;
                    i2 = this.position;
                    this.position = i2 + 1;
                    zztx.zza(bArr, (long) i2, (byte) i);
                    return;
                }
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                zztx.zza(bArr, (long) i2, (byte) (i | 128));
                i >>>= 7;
                bArr = this.buffer;
                i2 = this.position;
                this.position = i2 + 1;
                zztx.zza(bArr, (long) i2, (byte) i);
            }
        }

        public final void zzba(int i) {
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
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
            }
        }

        public final void zzp(long j) {
            byte[] bArr;
            int i;
            int i2;
            if (!zzqj.zzawt || zzoi() < 10) {
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
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
                }
            }
            while ((j & -128) != 0) {
                bArr = this.buffer;
                i = this.position;
                this.position = i + 1;
                zztx.zza(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            bArr = this.buffer;
            i2 = this.position;
            this.position = i2 + 1;
            zztx.zza(bArr, (long) i2, (byte) ((int) j));
        }

        public final void zzr(long j) {
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
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(1)}), e);
            }
        }

        public final void write(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)}), e);
            }
        }

        public final void zza(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        public final void zzcz(String str) {
            int i = this.position;
            try {
                int zzbd = zzqj.zzbd(str.length() * 3);
                int zzbd2 = zzqj.zzbd(str.length());
                if (zzbd2 == zzbd) {
                    this.position = i + zzbd2;
                    zzbd = zztz.zza(str, this.buffer, this.position, zzoi());
                    this.position = i;
                    zzay((zzbd - i) - zzbd2);
                    this.position = zzbd;
                    return;
                }
                zzay(zztz.zza(str));
                this.position = zztz.zza(str, this.buffer, this.position, zzoi());
            } catch (zzud e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(e2);
            }
        }

        public final int zzoi() {
            return this.limit - this.position;
        }

        public final int zzok() {
            return this.position - this.offset;
        }
    }

    static final class zzd extends zzqj {
        private final int zzaww;
        private final ByteBuffer zzawx;
        private final ByteBuffer zzawy;

        zzd(ByteBuffer byteBuffer) {
            super();
            this.zzawx = byteBuffer;
            this.zzawy = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.zzaww = byteBuffer.position();
        }

        public final void zzd(int i, int i2) {
            zzay((i << 3) | i2);
        }

        public final void zze(int i, int i2) {
            zzd(i, 0);
            zzax(i2);
        }

        public final void zzf(int i, int i2) {
            zzd(i, 0);
            zzay(i2);
        }

        public final void zzh(int i, int i2) {
            zzd(i, 5);
            zzba(i2);
        }

        public final void zza(int i, long j) {
            zzd(i, 0);
            zzp(j);
        }

        public final void zzc(int i, long j) {
            zzd(i, 1);
            zzr(j);
        }

        public final void zzb(int i, boolean z) {
            zzd(i, 0);
            zzc((byte) z);
        }

        public final void zza(int i, String str) {
            zzd(i, 2);
            zzcz(str);
        }

        public final void zza(int i, zzps zzps) {
            zzd(i, 2);
            zza(zzps);
        }

        public final void zza(int i, zzsk zzsk) {
            zzd(i, 2);
            zzb(zzsk);
        }

        /* Access modifiers changed, original: final */
        public final void zza(int i, zzsk zzsk, zzsz zzsz) {
            zzd(i, 2);
            zza(zzsk, zzsz);
        }

        public final void zzb(int i, zzsk zzsk) {
            zzd(1, 3);
            zzf(2, i);
            zza(3, zzsk);
            zzd(1, 4);
        }

        public final void zzb(int i, zzps zzps) {
            zzd(1, 3);
            zzf(2, i);
            zza(3, zzps);
            zzd(1, 4);
        }

        public final void zzb(zzsk zzsk) {
            zzay(zzsk.zzpe());
            zzsk.zzb(this);
        }

        /* Access modifiers changed, original: final */
        public final void zza(zzsk zzsk, zzsz zzsz) {
            zzpl zzpl = (zzpl) zzsk;
            int zzmw = zzpl.zzmw();
            if (zzmw == -1) {
                zzmw = zzsz.zzad(zzpl);
                zzpl.zzag(zzmw);
            }
            zzay(zzmw);
            zzsz.zza(zzsk, this.zzawu);
        }

        public final void zzc(byte b) {
            try {
                this.zzawy.put(b);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        public final void zza(zzps zzps) {
            zzay(zzps.size());
            zzps.zza((zzpr) this);
        }

        public final void zze(byte[] bArr, int i, int i2) {
            zzay(i2);
            write(bArr, 0, i2);
        }

        public final void zzax(int i) {
            if (i >= 0) {
                zzay(i);
            } else {
                zzp((long) i);
            }
        }

        public final void zzay(int i) {
            while ((i & -128) != 0) {
                this.zzawy.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.zzawy.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        public final void zzba(int i) {
            try {
                this.zzawy.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        public final void zzp(long j) {
            while ((-128 & j) != 0) {
                this.zzawy.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.zzawy.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        public final void zzr(long j) {
            try {
                this.zzawy.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        public final void write(byte[] bArr, int i, int i2) {
            try {
                this.zzawy.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(e);
            } catch (BufferOverflowException e2) {
                throw new zzc(e2);
            }
        }

        public final void zza(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        public final void zzcz(String str) {
            int position = this.zzawy.position();
            try {
                int zzbd = zzqj.zzbd(str.length() * 3);
                int zzbd2 = zzqj.zzbd(str.length());
                if (zzbd2 == zzbd) {
                    zzbd = this.zzawy.position() + zzbd2;
                    this.zzawy.position(zzbd);
                    zzdb(str);
                    zzbd2 = this.zzawy.position();
                    this.zzawy.position(position);
                    zzay(zzbd2 - zzbd);
                    this.zzawy.position(zzbd2);
                    return;
                }
                zzay(zztz.zza(str));
                zzdb(str);
            } catch (zzud e) {
                this.zzawy.position(position);
                zza(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc(e2);
            }
        }

        public final void flush() {
            this.zzawx.position(this.zzawy.position());
        }

        public final int zzoi() {
            return this.zzawy.remaining();
        }

        private final void zzdb(String str) {
            try {
                zztz.zza(str, this.zzawy);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(e);
            }
        }
    }

    static final class zze extends zzqj {
        private final ByteBuffer zzawx;
        private final ByteBuffer zzawy;
        private final long zzawz;
        private final long zzaxa;
        private final long zzaxb;
        private final long zzaxc = (this.zzaxb - 10);
        private long zzaxd = this.zzaxa;

        zze(ByteBuffer byteBuffer) {
            super();
            this.zzawx = byteBuffer;
            this.zzawy = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.zzawz = zztx.zzb(byteBuffer);
            this.zzaxa = this.zzawz + ((long) byteBuffer.position());
            this.zzaxb = this.zzawz + ((long) byteBuffer.limit());
        }

        public final void zzd(int i, int i2) {
            zzay((i << 3) | i2);
        }

        public final void zze(int i, int i2) {
            zzd(i, 0);
            zzax(i2);
        }

        public final void zzf(int i, int i2) {
            zzd(i, 0);
            zzay(i2);
        }

        public final void zzh(int i, int i2) {
            zzd(i, 5);
            zzba(i2);
        }

        public final void zza(int i, long j) {
            zzd(i, 0);
            zzp(j);
        }

        public final void zzc(int i, long j) {
            zzd(i, 1);
            zzr(j);
        }

        public final void zzb(int i, boolean z) {
            zzd(i, 0);
            zzc((byte) z);
        }

        public final void zza(int i, String str) {
            zzd(i, 2);
            zzcz(str);
        }

        public final void zza(int i, zzps zzps) {
            zzd(i, 2);
            zza(zzps);
        }

        public final void zza(int i, zzsk zzsk) {
            zzd(i, 2);
            zzb(zzsk);
        }

        /* Access modifiers changed, original: final */
        public final void zza(int i, zzsk zzsk, zzsz zzsz) {
            zzd(i, 2);
            zza(zzsk, zzsz);
        }

        public final void zzb(int i, zzsk zzsk) {
            zzd(1, 3);
            zzf(2, i);
            zza(3, zzsk);
            zzd(1, 4);
        }

        public final void zzb(int i, zzps zzps) {
            zzd(1, 3);
            zzf(2, i);
            zza(3, zzps);
            zzd(1, 4);
        }

        public final void zzb(zzsk zzsk) {
            zzay(zzsk.zzpe());
            zzsk.zzb(this);
        }

        /* Access modifiers changed, original: final */
        public final void zza(zzsk zzsk, zzsz zzsz) {
            zzpl zzpl = (zzpl) zzsk;
            int zzmw = zzpl.zzmw();
            if (zzmw == -1) {
                zzmw = zzsz.zzad(zzpl);
                zzpl.zzag(zzmw);
            }
            zzay(zzmw);
            zzsz.zza(zzsk, this.zzawu);
        }

        public final void zzc(byte b) {
            long j = this.zzaxd;
            if (j < this.zzaxb) {
                this.zzaxd = 1 + j;
                zztx.zza(j, b);
                return;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(this.zzaxb), Integer.valueOf(1)}));
        }

        public final void zza(zzps zzps) {
            zzay(zzps.size());
            zzps.zza((zzpr) this);
        }

        public final void zze(byte[] bArr, int i, int i2) {
            zzay(i2);
            write(bArr, 0, i2);
        }

        public final void zzax(int i) {
            if (i >= 0) {
                zzay(i);
            } else {
                zzp((long) i);
            }
        }

        public final void zzay(int i) {
            long j;
            if (this.zzaxd <= this.zzaxc) {
                while ((i & -128) != 0) {
                    j = this.zzaxd;
                    this.zzaxd = j + 1;
                    zztx.zza(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                j = this.zzaxd;
                this.zzaxd = 1 + j;
                zztx.zza(j, (byte) i);
                return;
            }
            while (true) {
                j = this.zzaxd;
                if (j >= this.zzaxb) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(this.zzaxb), Integer.valueOf(1)}));
                } else if ((i & -128) == 0) {
                    this.zzaxd = 1 + j;
                    zztx.zza(j, (byte) i);
                    return;
                } else {
                    this.zzaxd = j + 1;
                    zztx.zza(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }

        public final void zzba(int i) {
            this.zzawy.putInt((int) (this.zzaxd - this.zzawz), i);
            this.zzaxd += 4;
        }

        public final void zzp(long j) {
            long j2;
            if (this.zzaxd <= this.zzaxc) {
                while ((j & -128) != 0) {
                    j2 = this.zzaxd;
                    this.zzaxd = j2 + 1;
                    zztx.zza(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                j2 = this.zzaxd;
                this.zzaxd = 1 + j2;
                zztx.zza(j2, (byte) ((int) j));
                return;
            }
            while (true) {
                j2 = this.zzaxd;
                if (j2 >= this.zzaxb) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j2), Long.valueOf(this.zzaxb), Integer.valueOf(1)}));
                } else if ((j & -128) == 0) {
                    this.zzaxd = 1 + j2;
                    zztx.zza(j2, (byte) ((int) j));
                    return;
                } else {
                    this.zzaxd = j2 + 1;
                    zztx.zza(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        public final void zzr(long j) {
            this.zzawy.putLong((int) (this.zzaxd - this.zzawz), j);
            this.zzaxd += 8;
        }

        public final void write(byte[] bArr, int i, int i2) {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                long j2 = this.zzaxb - j;
                long j3 = this.zzaxd;
                if (j2 >= j3) {
                    zztx.zza(bArr, (long) i, j3, j);
                    this.zzaxd += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException(ConditionalUserProperty.VALUE);
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.zzaxd), Long.valueOf(this.zzaxb), Integer.valueOf(i2)}));
        }

        public final void zza(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        public final void zzcz(String str) {
            long j = this.zzaxd;
            try {
                int zzbd = zzqj.zzbd(str.length() * 3);
                int zzbd2 = zzqj.zzbd(str.length());
                if (zzbd2 == zzbd) {
                    zzbd = ((int) (this.zzaxd - this.zzawz)) + zzbd2;
                    this.zzawy.position(zzbd);
                    zztz.zza(str, this.zzawy);
                    zzbd2 = this.zzawy.position() - zzbd;
                    zzay(zzbd2);
                    this.zzaxd += (long) zzbd2;
                    return;
                }
                zzbd = zztz.zza(str);
                zzay(zzbd);
                zzy(this.zzaxd);
                zztz.zza(str, this.zzawy);
                this.zzaxd += (long) zzbd;
            } catch (zzud e) {
                this.zzaxd = j;
                zzy(this.zzaxd);
                zza(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc(e2);
            } catch (IndexOutOfBoundsException e22) {
                throw new zzc(e22);
            }
        }

        public final void flush() {
            this.zzawx.position((int) (this.zzaxd - this.zzawz));
        }

        public final int zzoi() {
            return (int) (this.zzaxb - this.zzaxd);
        }

        private final void zzy(long j) {
            this.zzawy.position((int) (j - this.zzawz));
        }
    }

    static final class zzb extends zza {
        private final ByteBuffer zzawv;
        private int zzaww;

        zzb(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.zzawv = byteBuffer;
            this.zzaww = byteBuffer.position();
        }

        public final void flush() {
            this.zzawv.position(this.zzaww + zzok());
        }
    }

    public static int zzb(float f) {
        return 4;
    }

    public static int zzbd(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    public static int zzbf(int i) {
        return 4;
    }

    public static int zzbg(int i) {
        return 4;
    }

    private static int zzbi(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int zzc(double d) {
        return 8;
    }

    public static zzqj zzg(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzj(boolean z) {
        return 1;
    }

    public static int zzt(long j) {
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

    public static int zzv(long j) {
        return 8;
    }

    public static int zzw(long j) {
        return 8;
    }

    private static long zzx(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public abstract void flush();

    public abstract void write(byte[] bArr, int i, int i2);

    public abstract void zza(int i, long j);

    public abstract void zza(int i, zzps zzps);

    public abstract void zza(int i, zzsk zzsk);

    public abstract void zza(int i, zzsk zzsk, zzsz zzsz);

    public abstract void zza(int i, String str);

    public abstract void zza(zzps zzps);

    public abstract void zza(zzsk zzsk, zzsz zzsz);

    public abstract void zzax(int i);

    public abstract void zzay(int i);

    public abstract void zzb(int i, zzps zzps);

    public abstract void zzb(int i, zzsk zzsk);

    public abstract void zzb(int i, boolean z);

    public abstract void zzb(zzsk zzsk);

    public abstract void zzba(int i);

    public abstract void zzc(byte b);

    public abstract void zzc(int i, long j);

    public abstract void zzcz(String str);

    public abstract void zzd(int i, int i2);

    public abstract void zze(int i, int i2);

    public abstract void zze(byte[] bArr, int i, int i2);

    public abstract void zzf(int i, int i2);

    public abstract void zzh(int i, int i2);

    public abstract int zzoi();

    public abstract void zzp(long j);

    public abstract void zzr(long j);

    public static zzqj zza(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new zzb(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (zztx.zzrn()) {
            return new zze(byteBuffer);
        } else {
            return new zzd(byteBuffer);
        }
    }

    private zzqj() {
    }

    public final void zzg(int i, int i2) {
        zzf(i, zzbi(i2));
    }

    public final void zzb(int i, long j) {
        zza(i, zzx(j));
    }

    public final void zza(int i, float f) {
        zzh(i, Float.floatToRawIntBits(f));
    }

    public final void zza(int i, double d) {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    public final void zzaz(int i) {
        zzay(zzbi(i));
    }

    public final void zzq(long j) {
        zzp(zzx(j));
    }

    public final void zza(float f) {
        zzba(Float.floatToRawIntBits(f));
    }

    public final void zzb(double d) {
        zzr(Double.doubleToRawLongBits(d));
    }

    public final void zzi(boolean z) {
        zzc((byte) z);
    }

    public static int zzi(int i, int i2) {
        return zzbb(i) + zzbc(i2);
    }

    public static int zzj(int i, int i2) {
        return zzbb(i) + zzbd(i2);
    }

    public static int zzk(int i, int i2) {
        return zzbb(i) + zzbd(zzbi(i2));
    }

    public static int zzl(int i, int i2) {
        return zzbb(i) + 4;
    }

    public static int zzm(int i, int i2) {
        return zzbb(i) + 4;
    }

    public static int zzd(int i, long j) {
        return zzbb(i) + zzt(j);
    }

    public static int zze(int i, long j) {
        return zzbb(i) + zzt(j);
    }

    public static int zzf(int i, long j) {
        return zzbb(i) + zzt(zzx(j));
    }

    public static int zzg(int i, long j) {
        return zzbb(i) + 8;
    }

    public static int zzh(int i, long j) {
        return zzbb(i) + 8;
    }

    public static int zzb(int i, float f) {
        return zzbb(i) + 4;
    }

    public static int zzb(int i, double d) {
        return zzbb(i) + 8;
    }

    public static int zzc(int i, boolean z) {
        return zzbb(i) + 1;
    }

    public static int zzn(int i, int i2) {
        return zzbb(i) + zzbc(i2);
    }

    public static int zzb(int i, String str) {
        return zzbb(i) + zzda(str);
    }

    public static int zzc(int i, zzps zzps) {
        i = zzbb(i);
        int size = zzps.size();
        return i + (zzbd(size) + size);
    }

    public static int zza(int i, zzrr zzrr) {
        i = zzbb(i);
        int zzpe = zzrr.zzpe();
        return i + (zzbd(zzpe) + zzpe);
    }

    public static int zzc(int i, zzsk zzsk) {
        return zzbb(i) + zzc(zzsk);
    }

    static int zzb(int i, zzsk zzsk, zzsz zzsz) {
        return zzbb(i) + zzb(zzsk, zzsz);
    }

    public static int zzd(int i, zzsk zzsk) {
        return ((zzbb(1) << 1) + zzj(2, i)) + zzc(3, zzsk);
    }

    public static int zzd(int i, zzps zzps) {
        return ((zzbb(1) << 1) + zzj(2, i)) + zzc(3, zzps);
    }

    public static int zzb(int i, zzrr zzrr) {
        return ((zzbb(1) << 1) + zzj(2, i)) + zza(3, zzrr);
    }

    public static int zzbb(int i) {
        return zzbd(i << 3);
    }

    public static int zzbc(int i) {
        return i >= 0 ? zzbd(i) : 10;
    }

    public static int zzbe(int i) {
        return zzbd(zzbi(i));
    }

    public static int zzs(long j) {
        return zzt(j);
    }

    public static int zzu(long j) {
        return zzt(zzx(j));
    }

    public static int zzbh(int i) {
        return zzbc(i);
    }

    public static int zzda(String str) {
        int zza;
        try {
            zza = zztz.zza(str);
        } catch (zzud unused) {
            zza = str.getBytes(zzre.UTF_8).length;
        }
        return zzbd(zza) + zza;
    }

    public static int zza(zzrr zzrr) {
        int zzpe = zzrr.zzpe();
        return zzbd(zzpe) + zzpe;
    }

    public static int zzb(zzps zzps) {
        int size = zzps.size();
        return zzbd(size) + size;
    }

    public static int zzh(byte[] bArr) {
        int length = bArr.length;
        return zzbd(length) + length;
    }

    public static int zzc(zzsk zzsk) {
        int zzpe = zzsk.zzpe();
        return zzbd(zzpe) + zzpe;
    }

    static int zzb(zzsk zzsk, zzsz zzsz) {
        zzpl zzpl = (zzpl) zzsk;
        int zzmw = zzpl.zzmw();
        if (zzmw == -1) {
            zzmw = zzsz.zzad(zzpl);
            zzpl.zzag(zzmw);
        }
        return zzbd(zzmw) + zzmw;
    }

    /* Access modifiers changed, original: final */
    public final void zza(String str, zzud zzud) {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzud);
        byte[] bytes = str.getBytes(zzre.UTF_8);
        try {
            zzay(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzc(e);
        } catch (zzc e2) {
            throw e2;
        }
    }

    @Deprecated
    static int zzc(int i, zzsk zzsk, zzsz zzsz) {
        i = zzbb(i) << 1;
        zzpl zzpl = (zzpl) zzsk;
        int zzmw = zzpl.zzmw();
        if (zzmw == -1) {
            zzmw = zzsz.zzad(zzpl);
            zzpl.zzag(zzmw);
        }
        return i + zzmw;
    }

    @Deprecated
    public static int zzd(zzsk zzsk) {
        return zzsk.zzpe();
    }

    @Deprecated
    public static int zzbj(int i) {
        return zzbd(i);
    }

    /* synthetic */ zzqj(zzqk zzqk) {
        this();
    }
}
