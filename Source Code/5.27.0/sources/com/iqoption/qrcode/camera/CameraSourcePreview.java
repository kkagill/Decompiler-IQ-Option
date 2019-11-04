package com.iqoption.qrcode.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.images.Size;
import java.io.IOException;

public class CameraSourcePreview extends ViewGroup {
    private a dQQ;
    private SurfaceView dRv;
    private boolean dRw = false;
    private boolean dRx = false;
    private b dRy;
    private Context mContext;

    private class a implements Callback {
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        private a() {
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            CameraSourcePreview.this.dRx = true;
            try {
                CameraSourcePreview.this.aTk();
            } catch (SecurityException e) {
                Log.e("CameraSourcePreview", "Do not have permission to start the camera", e);
            } catch (IOException unused) {
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            CameraSourcePreview.this.dRx = false;
        }
    }

    public CameraSourcePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        this.dRv = new SurfaceView(context);
        this.dRv.setLayoutParams(new LayoutParams(-1, -1));
        this.dRv.getHolder().addCallback(new a());
        addView(this.dRv);
    }

    @RequiresPermission("android.permission.CAMERA")
    public void g(a aVar) {
        if (aVar == null) {
            stop();
        }
        this.dQQ = aVar;
        if (this.dQQ != null) {
            this.dRw = true;
            aTk();
        }
    }

    @RequiresPermission("android.permission.CAMERA")
    public void a(a aVar, b bVar) {
        this.dRy = bVar;
        g(aVar);
    }

    public void stop() {
        a aVar = this.dQQ;
        if (aVar != null) {
            aVar.stop();
        }
    }

    public void release() {
        a aVar = this.dQQ;
        if (aVar != null) {
            aVar.release();
            this.dQQ = null;
        }
    }

    @RequiresPermission("android.permission.CAMERA")
    private void aTk() {
        if (this.dRw && this.dRx) {
            this.dQQ.a(this.dRv.getHolder());
            if (this.dRy != null) {
                Size previewSize = this.dQQ.getPreviewSize();
                int min = Math.min(previewSize.getWidth(), previewSize.getHeight());
                int max = Math.max(previewSize.getWidth(), previewSize.getHeight());
                if (aTl()) {
                    this.dRy.s(min, max, this.dQQ.getCameraFacing());
                } else {
                    this.dRy.s(max, min, this.dQQ.getCameraFacing());
                }
                this.dRy.clear();
            }
            this.dRw = false;
        }
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048 A:{LOOP_END, LOOP:0: B:13:0x0042->B:15:0x0048} */
    public void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
        r6 = this;
        r7 = r6.dQQ;
        if (r7 == 0) goto L_0x0013;
    L_0x0004:
        r7 = r7.getPreviewSize();
        if (r7 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r7.getWidth();
        r7 = r7.getHeight();
        goto L_0x0017;
    L_0x0013:
        r0 = 320; // 0x140 float:4.48E-43 double:1.58E-321;
        r7 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
    L_0x0017:
        r1 = r6.aTl();
        if (r1 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0021;
    L_0x001e:
        r5 = r0;
        r0 = r7;
        r7 = r5;
    L_0x0021:
        r10 = r10 - r8;
        r11 = r11 - r9;
        r8 = (float) r10;
        r7 = (float) r7;
        r8 = r8 / r7;
        r9 = (float) r11;
        r0 = (float) r0;
        r9 = r9 / r0;
        r1 = 0;
        r2 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r2 <= 0) goto L_0x003a;
    L_0x002e:
        r0 = r0 * r8;
        r7 = (int) r0;
        r8 = r7 - r11;
        r8 = r8 / 2;
        r11 = r7;
        r9 = r8;
        r7 = r10;
        r8 = 0;
        goto L_0x0042;
    L_0x003a:
        r7 = r7 * r9;
        r7 = (int) r7;
        r8 = r7 - r10;
        r8 = r8 / 2;
        r9 = 0;
    L_0x0042:
        r10 = r6.getChildCount();
        if (r1 >= r10) goto L_0x005a;
    L_0x0048:
        r10 = r6.getChildAt(r1);
        r0 = r8 * -1;
        r2 = r9 * -1;
        r3 = r7 - r8;
        r4 = r11 - r9;
        r10.layout(r0, r2, r3, r4);
        r1 = r1 + 1;
        goto L_0x0042;
    L_0x005a:
        r6.aTk();	 Catch:{ IOException | SecurityException -> 0x005d, IOException | SecurityException -> 0x005d }
    L_0x005d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.qrcode.camera.CameraSourcePreview.onLayout(boolean, int, int, int, int):void");
    }

    private boolean aTl() {
        int i = this.mContext.getResources().getConfiguration().orientation;
        return i != 2 && i == 1;
    }
}
