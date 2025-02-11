package org.jmrtd.lds.icao;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.StandardBiometricHeader;
import org.jmrtd.cbeff.a;
import org.jmrtd.cbeff.b;
import org.jmrtd.cbeff.c;
import org.jmrtd.cbeff.d;
import org.jmrtd.cbeff.e;
import org.jmrtd.cbeff.f;
import org.jmrtd.cbeff.g;
import org.jmrtd.lds.CBEFFDataGroup;
import org.jmrtd.lds.iso19794.FingerInfo;

public class DG3File extends CBEFFDataGroup<FingerInfo> {
    private static final e fFr = new e(new a<FingerInfo>() {
        /* renamed from: c */
        public FingerInfo a(InputStream inputStream, StandardBiometricHeader standardBiometricHeader, int i, int i2) {
            return new FingerInfo(standardBiometricHeader, inputStream);
        }
    });
    private static final f<FingerInfo> fFs = new f(new b<FingerInfo>() {
        public void a(FingerInfo fingerInfo, OutputStream outputStream) {
            fingerInfo.f(outputStream);
        }
    });
    private static final long serialVersionUID = -1037522331623814528L;
    private boolean shouldAddRandomDataIfEmpty;

    public DG3File(InputStream inputStream) {
        super(99, inputStream);
    }

    public void s(InputStream inputStream) {
        for (c cVar : fFr.o(inputStream).bRb()) {
            StringBuilder stringBuilder;
            if (cVar instanceof g) {
                BiometricDataBlock bRc = ((g) cVar).bRc();
                if (bRc instanceof FingerInfo) {
                    a((FingerInfo) bRc);
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Was expecting a FingerInfo, found ");
                    stringBuilder.append(bRc.getClass().getSimpleName());
                    throw new IOException(stringBuilder.toString());
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Was expecting a SimpleCBEFFInfo, found ");
            stringBuilder.append(cVar.getClass().getSimpleName());
            throw new IOException(stringBuilder.toString());
        }
    }

    public void g(OutputStream outputStream) {
        c dVar = new d();
        for (FingerInfo gVar : bRb()) {
            dVar.a(new g(gVar));
        }
        fFs.a(dVar, outputStream);
        if (this.shouldAddRandomDataIfEmpty) {
            h(outputStream);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DG3File [");
        stringBuilder.append(super.toString());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public int hashCode() {
        return (super.hashCode() * 31) + (this.shouldAddRandomDataIfEmpty ? 1231 : 1237);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        if (this.shouldAddRandomDataIfEmpty != ((DG3File) obj).shouldAddRandomDataIfEmpty) {
            z = false;
        }
        return z;
    }
}
