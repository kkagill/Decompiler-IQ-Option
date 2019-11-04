package com.crashlytics.android.core;

import android.os.Process;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CLSUUID */
class e {
    private static final AtomicLong pn = new AtomicLong(0);
    private static String po;

    public e(IdManager idManager) {
        r0 = new byte[10];
        b(r0);
        c(r0);
        d(r0);
        String ll = CommonUtils.ll(idManager.bjA());
        String V = CommonUtils.V(r0);
        po = String.format(Locale.US, "%s-%s-%s-%s", new Object[]{V.substring(0, 12), V.substring(12, 16), V.subSequence(16, 20), ll.substring(0, 12)}).toUpperCase(Locale.US);
    }

    private void b(byte[] bArr) {
        long time = new Date().getTime();
        long j = time / 1000;
        time %= 1000;
        byte[] h = h(j);
        bArr[0] = h[0];
        bArr[1] = h[1];
        bArr[2] = h[2];
        bArr[3] = h[3];
        byte[] i = i(time);
        bArr[4] = i[0];
        bArr[5] = i[1];
    }

    private void c(byte[] bArr) {
        byte[] i = i(pn.incrementAndGet());
        bArr[6] = i[0];
        bArr[7] = i[1];
    }

    private void d(byte[] bArr) {
        byte[] i = i((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = i[0];
        bArr[9] = i[1];
    }

    private static byte[] h(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private static byte[] i(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public String toString() {
        return po;
    }
}
