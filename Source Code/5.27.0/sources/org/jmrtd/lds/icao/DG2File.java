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
import org.jmrtd.lds.iso19794.FaceInfo;

public class DG2File extends CBEFFDataGroup<FaceInfo> {
    private static final e fFr = new e(new a<FaceInfo>() {
        /* renamed from: b */
        public FaceInfo a(InputStream inputStream, StandardBiometricHeader standardBiometricHeader, int i, int i2) {
            return new FaceInfo(standardBiometricHeader, inputStream);
        }
    });
    private static final f<FaceInfo> fFs = new f(new b<FaceInfo>() {
        public void a(FaceInfo faceInfo, OutputStream outputStream) {
            faceInfo.f(outputStream);
        }
    });
    private static final long serialVersionUID = 414300652684010416L;

    public DG2File(InputStream inputStream) {
        super(117, inputStream);
    }

    public void s(InputStream inputStream) {
        for (c cVar : fFr.o(inputStream).bRb()) {
            StringBuilder stringBuilder;
            if (cVar instanceof g) {
                BiometricDataBlock bRc = ((g) cVar).bRc();
                if (bRc instanceof FaceInfo) {
                    a((FaceInfo) bRc);
                } else {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Was expecting a FaceInfo, found ");
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
        for (FaceInfo gVar : bRb()) {
            dVar.a(new g(gVar));
        }
        fFs.a(dVar, outputStream);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DG2File [");
        stringBuilder.append(super.toString());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
