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
import org.jmrtd.lds.iso19794.IrisInfo;

public class DG4File extends CBEFFDataGroup<IrisInfo> {
    private static final e fFr = new e(new a<IrisInfo>() {
        /* renamed from: d */
        public IrisInfo a(InputStream inputStream, StandardBiometricHeader standardBiometricHeader, int i, int i2) {
            return new IrisInfo(standardBiometricHeader, inputStream);
        }
    });
    private static final f<IrisInfo> fFs = new f(new b<IrisInfo>() {
        public void a(IrisInfo irisInfo, OutputStream outputStream) {
            irisInfo.f(outputStream);
        }
    });
    private static final long serialVersionUID = -1290365855823447586L;
    private boolean shouldAddRandomDataIfEmpty;

    public DG4File(InputStream inputStream) {
        super(118, inputStream);
    }

    public void s(InputStream inputStream) {
        for (c cVar : fFr.o(inputStream).bRb()) {
            StringBuilder stringBuilder;
            if (cVar instanceof g) {
                BiometricDataBlock bRc = ((g) cVar).bRc();
                if (bRc instanceof IrisInfo) {
                    a((IrisInfo) bRc);
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Was expecting an IrisInfo, found ");
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
        for (IrisInfo gVar : bRb()) {
            dVar.a(new g(gVar));
        }
        fFs.a(dVar, outputStream);
        if (this.shouldAddRandomDataIfEmpty) {
            h(outputStream);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DG4File [");
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
        if (this.shouldAddRandomDataIfEmpty != ((DG4File) obj).shouldAddRandomDataIfEmpty) {
            z = false;
        }
        return z;
    }
}
