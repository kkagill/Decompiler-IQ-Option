package com.jumio.nv.liveness.eyetracking.a;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Message;
import android.view.WindowManager;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.analytics.Screen;
import com.jumio.analytics.UserAction;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogUtils;
import com.jumio.core.mvp.model.StaticModel;
import com.jumio.nv.enums.NVLivenessResult;
import com.jumio.nv.extraction.NVExtractionUpdateState;
import com.jumio.nv.liveness.extraction.LivenessClient;
import com.jumio.nv.liveness.extraction.LivenessClient.LivenessHandler;
import com.jumio.nv.liveness.extraction.LivenessDataModel;
import com.jumio.nv.liveness.extraction.LivenessExtractionUpdateState;
import com.jumio.nv.models.ServerSettingsModel;
import com.jumio.persistence.DataAccess;
import com.jumio.sdk.extraction.ExtractionClient.ExtractionUpdate;
import com.umoove.all.e;
import com.umoove.all.f;
import com.umoove.all.g;
import com.umoove.all.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONObject;

/* compiled from: EyeTrackingClient */
public class a extends LivenessClient implements h {
    private int a;
    private float b;
    private float c;
    private float d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;
    private g i;
    private int j;
    private int k;
    private int l;
    private int m;
    private ArrayList<com.jumio.nv.liveness.extraction.a> n;
    private ArrayList<com.jumio.nv.liveness.extraction.a> o;
    private ArrayList<ArrayList<com.jumio.nv.liveness.extraction.a>> p;
    private final Object q;
    private final Object r;
    private StringBuilder s;
    private StringBuilder t;
    private WindowManager u;

    public a(Context context) {
        super(context);
        this.q = new Object();
        this.r = new Object();
        this.handler = new LivenessHandler(this);
    }

    public void configure(StaticModel staticModel) {
        super.configure(staticModel);
        ServerSettingsModel serverSettingsModel = (ServerSettingsModel) DataAccess.load(this.mContext, ServerSettingsModel.class);
        if (serverSettingsModel != null) {
            this.a = serverSettingsModel.getEyeTrackingKey();
            this.b = serverSettingsModel.getEyeTrackingThresholdMax();
            this.d = serverSettingsModel.getEyeTrackingEarlyThresholdMin();
            this.c = serverSettingsModel.getEyeTrackingEarlyThresholdMax();
            this.e = serverSettingsModel.getEyeTrackingPositionsMin();
            this.f = serverSettingsModel.getEyeTrackingPositionsMax();
            this.g = serverSettingsModel.isEyeTrackingAnalyticsEnabled();
        }
    }

    /* Access modifiers changed, original: protected */
    public void init(PreviewProperties previewProperties, Rect rect) {
        super.init(previewProperties, rect);
        try {
            if (this.i != null) {
                this.i.b();
            }
            this.u = (WindowManager) this.mContext.getSystemService("window");
            this.i = g.a(this.mContext, this.u.getDefaultDisplay(), previewProperties.camera.width, previewProperties.camera.height, 40.0f, 60.0f, this, this.a);
            this.i.b(true);
            this.i.c(true);
            this.i.d(true);
            this.i.a(true);
            int i = previewProperties.sensorRotation;
            i = i != 0 ? i != 90 ? i != 180 ? 0 : 3 : 2 : 1;
            this.i.a(i);
            a(rect);
        } catch (Exception e) {
            Log.printStackTrace(e);
            this.i = null;
            publishUpdate(new ExtractionUpdate(b.b, Boolean.valueOf(true)));
        }
    }

    public void destroy() {
        g gVar = this.i;
        if (gVar != null) {
            gVar.c();
            this.i.bih().a(null, 0, 0);
            this.i.d();
            this.i = null;
        }
        super.destroy();
    }

    public void cancel() {
        super.cancel();
        g gVar = this.i;
        if (gVar != null) {
            gVar.c();
        }
    }

    public void process(byte[] bArr, PreviewProperties previewProperties, Rect rect) {
        super.process(bArr, previewProperties, rect);
        if (this.i != null && this.h) {
            int rotation = this.u.getDefaultDisplay().getRotation();
            if (rotation != this.m) {
                this.i.c();
                a(rect);
            }
            try {
                this.i.a(bArr, rotation, Long.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
            }
            setResult(false);
        }
    }

    /* Access modifiers changed, original: protected */
    public boolean shouldFeed() {
        return super.shouldFeed() || (this.i != null && this.h);
    }

    private void a(Rect rect) {
        this.m = this.u.getDefaultDisplay().getRotation();
        g gVar = this.i;
        if (gVar != null) {
            gVar.aR(rect.width(), rect.height());
        }
    }

    /* Access modifiers changed, original: protected */
    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message != null && message.what == 200) {
            a();
        }
    }

    /* Access modifiers changed, original: protected */
    public void automaticStartAttempt() {
        if (this.i == null) {
            super.automaticStartAttempt();
            return;
        }
        this.h = true;
        this.s = new StringBuilder();
        this.t = new StringBuilder();
        this.i.e(false);
    }

    /* Access modifiers changed, original: protected */
    public void resetValuesAndArrays() {
        super.resetValuesAndArrays();
        this.h = false;
        this.p = null;
        synchronized (this.r) {
            this.o = null;
        }
        synchronized (this.q) {
            this.n = null;
        }
        this.l = 0;
    }

    public void a(int i) {
        if (i == 1) {
            this.p = new ArrayList();
            synchronized (this.q) {
                this.n = new ArrayList();
            }
            a();
            publishUpdate(new ExtractionUpdate(b.onStartedCaptureLiveness, null));
            JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.SCAN, UserAction.EYE_TRACKING_STARTED));
        } else if ((i == 2 || i == 3) && this.h) {
            Object obj;
            this.livenessDataModel = new LivenessDataModel();
            this.livenessDataModel.setLivenessResult(NVLivenessResult.BO);
            synchronized (this.q) {
                if (this.n != null) {
                    if (this.n.size() != 0) {
                        obj = null;
                    }
                }
                obj = 1;
            }
            if (obj != null) {
                this.unsuccessfulAttempts++;
                publishUpdate(new ExtractionUpdate(LivenessExtractionUpdateState.faceAlignmentOutOfBounds, null));
                if (this.unsuccessfulAttempts <= 4) {
                    resetValuesAndArrays();
                    if (this.unsuccessfulAttempts == 2) {
                        publishUpdate(new ExtractionUpdate(NVExtractionUpdateState.showHelp, null));
                    } else {
                        resetFaceDetection();
                    }
                } else {
                    this.livenessDataModel.setLivenessValue(-1.0f);
                    JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.SCAN, UserAction.EYE_TRACKING_FACE_NOT_DETECTED));
                }
            } else {
                this.livenessDataModel.setLivenessValue(-3.0f);
                JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.SCAN, UserAction.EYE_TRACKING_OUT_OF_BOUNDS));
            }
            this.handler.sendEmptyMessage(105);
            this.handler.sendEmptyMessage(106);
            resetValuesAndArrays();
        }
    }

    public void a(int i, f fVar, e eVar) {
        try {
            String str = "NullMovement";
            int i2 = eVar.j;
            if (i2 == 1) {
                str = "Fixation";
            } else if (i2 == 2) {
                str = "SmoothPersuit";
            } else if (i2 == 3) {
                str = "Saccade";
            } else if (i2 == 4) {
                str = "Micro";
            }
            com.jumio.nv.liveness.extraction.a aVar = new com.jumio.nv.liveness.extraction.a();
            aVar.a = this.j;
            aVar.b = this.k;
            aVar.c = eVar.j;
            aVar.d = eVar.eJm.x;
            aVar.e = eVar.eJm.y;
            aVar.f = eVar.eJn.x;
            aVar.g = eVar.eJn.y;
            aVar.j = eVar.eJo.x;
            aVar.k = eVar.eJo.y;
            aVar.l = eVar.eJp.x;
            aVar.m = eVar.eJp.y;
            aVar.p = eVar.m;
            aVar.q = eVar.n;
            aVar.n = eVar.eJq.x;
            aVar.o = eVar.eJq.y;
            this.s.append(String.format("%d/%d;%d;%d;%s;%f;%f;%f;%f;%f;%f;%f;%f;%f;%f;%f;%f;%f;%f;\n", new Object[]{Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.j), Integer.valueOf(this.k), str, Float.valueOf(eVar.eJm.x), Float.valueOf(eVar.eJm.y), Float.valueOf(eVar.eJo.x), Float.valueOf(eVar.eJo.y), Float.valueOf(eVar.m), Float.valueOf(eVar.eJn.x), Float.valueOf(eVar.eJn.y), Float.valueOf(eVar.eJp.x), Float.valueOf(eVar.eJp.y), Float.valueOf(eVar.n), Float.valueOf(eVar.eJq.x), Float.valueOf(eVar.eJq.y), Float.valueOf(aVar.a()), Float.valueOf(aVar.b())}));
            synchronized (this.q) {
                if (this.n != null) {
                    this.n.add(aVar);
                }
            }
            synchronized (this.r) {
                if (this.o != null) {
                    this.o.add(aVar);
                }
            }
        } catch (Exception e) {
            Log.printStackTrace(e);
        }
    }

    public void b(int i) {
        if (i > 2) {
            this.l++;
        }
    }

    private void a() {
        try {
            if (this.h) {
                synchronized (this.r) {
                    if (this.o != null) {
                        this.p.add(this.o);
                    }
                    this.o = new ArrayList();
                }
                Random random = new Random();
                int nextInt = random.nextInt(2);
                int nextInt2 = random.nextInt(2);
                while (Math.abs(nextInt - this.j) + Math.abs(nextInt2 - this.k) == 0) {
                    nextInt = random.nextInt(2);
                    nextInt2 = random.nextInt(2);
                }
                this.j = nextInt;
                this.k = nextInt2;
                if (this.p.size() == 0) {
                    nextInt = -1;
                    nextInt2 = -1;
                }
                if (this.p.size() > this.e) {
                    float b = b();
                    if (b < this.d || b > this.c || this.p.size() >= this.f) {
                        this.h = false;
                    }
                    if (!this.h) {
                        this.livenessDataModel = new LivenessDataModel();
                        this.livenessDataModel.setLivenessValue(b);
                        this.livenessDataModel.setLivenessResult(b >= this.b ? NVLivenessResult.TRUE : NVLivenessResult.BO);
                        this.handler.sendEmptyMessage(105);
                        if (this.p.size() < this.f) {
                            this.handler.sendEmptyMessageDelayed(106, 1700);
                            nextInt = -2;
                            nextInt2 = -2;
                        } else {
                            this.handler.sendEmptyMessage(106);
                        }
                        synchronized (this.q) {
                            int size = this.n.size();
                            Iterator it = this.n.iterator();
                            float f = 0.0f;
                            float f2 = 0.0f;
                            float f3 = 0.0f;
                            float f4 = 0.0f;
                            float f5 = 0.0f;
                            while (it.hasNext()) {
                                int i = ((com.jumio.nv.liveness.extraction.a) it.next()).c;
                                if (i == 0) {
                                    f += 1.0f;
                                } else if (i == 1) {
                                    f4 += 1.0f;
                                } else if (i == 2) {
                                    f5 += 1.0f;
                                } else if (i == 3) {
                                    f3 += 1.0f;
                                } else if (i == 4) {
                                    f2 += 1.0f;
                                }
                            }
                            float f6 = (float) size;
                            f /= f6;
                            f2 /= f6;
                            f3 /= f6;
                            f4 /= f6;
                            f5 /= f6;
                            long currentTimeMillis = System.currentTimeMillis();
                            Log.d(this.t.toString(), LogUtils.getSubFolder(a.class.getSimpleName()), String.format("scoreCalc_%d.csv", new Object[]{Long.valueOf(currentTimeMillis)}));
                            Log.d(this.s.toString(), LogUtils.getSubFolder(a.class.getSimpleName()), String.format("scoreCalc_%d.csv", new Object[]{Long.valueOf(currentTimeMillis)}));
                            MetaInfo metaInfo = new MetaInfo();
                            metaInfo.put("nullMovement", Float.valueOf(f));
                            metaInfo.put("micro", Float.valueOf(f2));
                            metaInfo.put("saccade", Float.valueOf(f3));
                            metaInfo.put("fixation", Float.valueOf(f4));
                            metaInfo.put("smooth", Float.valueOf(f5));
                            metaInfo.put("blinks", Integer.valueOf(this.l));
                            metaInfo.put("totalFrames", Integer.valueOf(size));
                            metaInfo.put("completed", Boolean.valueOf(true));
                            metaInfo.put("score", Float.valueOf(b));
                            metaInfo.put("targetPositions", Integer.valueOf(this.p.size()));
                            this.livenessDataModel.setEyetrackingData(new JSONObject(metaInfo).toString());
                            if (this.g) {
                                JumioAnalytics.add(MobileEvents.liveness(JumioAnalytics.getSessionId(), this.livenessDataModel.getLivenessResult().name(), metaInfo));
                            }
                        }
                        if (this.i != null) {
                            this.i.c();
                        }
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putInt("x", nextInt);
                bundle.putInt("y", nextInt2);
                bundle.putInt("step", this.p.size());
                bundle.putInt("max_steps", this.f);
                publishUpdate(new ExtractionUpdate(b.a, bundle));
                if (this.h) {
                    this.handler.sendEmptyMessageDelayed(200, 1700);
                }
            }
        } catch (Exception e) {
            Log.printStackTrace(e);
        }
    }

    /* JADX WARNING: Missing block: B:84:0x032a, code skipped:
            if (((android.graphics.PointF) ((android.util.Pair) r0.get(r7)).second).y >= ((android.graphics.PointF) ((android.util.Pair) r0.get(r4)).second).y) goto L_0x0331;
     */
    private float b() {
        /*
        r26 = this;
        r1 = r26;
        r2 = r1.q;
        monitor-enter(r2);
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x04c7 }
        r3 = r1.n;	 Catch:{ all -> 0x04c7 }
        r0.<init>(r3);	 Catch:{ all -> 0x04c7 }
        monitor-exit(r2);	 Catch:{ all -> 0x04c7 }
        r2 = new com.jumio.nv.liveness.eyetracking.a.a$1;
        r2.<init>();
        java.util.Collections.sort(r0, r2);
        r2 = r0.size();
        r2 = (double) r2;
        r4 = 4587366580439587226; // 0x3fa999999999999a float:-1.5881868E-23 double:0.05;
        java.lang.Double.isNaN(r2);
        r2 = r2 * r4;
        r2 = java.lang.Math.floor(r2);
        r2 = (int) r2;
        r2 = r0.get(r2);
        r2 = (com.jumio.nv.liveness.extraction.a) r2;
        r2 = r2.a();
        r3 = r0.size();
        r6 = (double) r3;
        r8 = 4606732058837280358; // 0x3fee666666666666 float:2.720083E23 double:0.95;
        java.lang.Double.isNaN(r6);
        r6 = r6 * r8;
        r6 = java.lang.Math.floor(r6);
        r3 = (int) r6;
        r3 = r0.get(r3);
        r3 = (com.jumio.nv.liveness.extraction.a) r3;
        r3 = r3.a();
        r6 = new com.jumio.nv.liveness.eyetracking.a.a$2;
        r6.<init>();
        java.util.Collections.sort(r0, r6);
        r6 = r0.size();
        r6 = (double) r6;
        java.lang.Double.isNaN(r6);
        r6 = r6 * r4;
        r4 = java.lang.Math.floor(r6);
        r4 = (int) r4;
        r4 = r0.get(r4);
        r4 = (com.jumio.nv.liveness.extraction.a) r4;
        r4 = r4.b();
        r5 = r0.size();
        r5 = (double) r5;
        java.lang.Double.isNaN(r5);
        r5 = r5 * r8;
        r5 = java.lang.Math.floor(r5);
        r5 = (int) r5;
        r0 = r0.get(r5);
        r0 = (com.jumio.nv.liveness.extraction.a) r0;
        r0 = r0.b();
        r3 = r3 - r2;
        r3 = java.lang.Math.abs(r3);
        r0 = r0 - r4;
        r0 = java.lang.Math.abs(r0);
        r5 = new java.util.ArrayList;
        r6 = r1.p;
        r5.<init>(r6);
        r6 = r5.iterator();
    L_0x00a0:
        r7 = r6.hasNext();
        r8 = 0;
        if (r7 == 0) goto L_0x00f8;
    L_0x00a7:
        r7 = r6.next();
        r7 = (java.util.ArrayList) r7;
        r7 = r7.iterator();
    L_0x00b1:
        r9 = r7.hasNext();
        if (r9 == 0) goto L_0x00a0;
    L_0x00b7:
        r9 = r7.next();
        r9 = (com.jumio.nv.liveness.extraction.a) r9;
        r10 = r9.a();
        r11 = r9.b();
        r12 = java.lang.Math.abs(r2);
        r10 = r10 + r12;
        r10 = r10 / r3;
        r9.h = r10;
        r10 = java.lang.Math.abs(r4);
        r11 = r11 + r10;
        r11 = r11 / r0;
        r9.i = r11;
        r10 = r9.h;
        r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r10 >= 0) goto L_0x00dd;
    L_0x00db:
        r9.h = r8;
    L_0x00dd:
        r10 = r9.h;
        r11 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1));
        if (r10 <= 0) goto L_0x00e7;
    L_0x00e5:
        r9.h = r11;
    L_0x00e7:
        r10 = r9.i;
        r10 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1));
        if (r10 >= 0) goto L_0x00ef;
    L_0x00ed:
        r9.i = r8;
    L_0x00ef:
        r10 = r9.i;
        r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1));
        if (r10 <= 0) goto L_0x00b1;
    L_0x00f5:
        r9.i = r11;
        goto L_0x00b1;
    L_0x00f8:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r2 = r5.size();
        r3 = 0;
        if (r2 <= 0) goto L_0x0107;
    L_0x0104:
        r5.remove(r3);
    L_0x0107:
        r2 = r5.iterator();
    L_0x010b:
        r4 = r2.hasNext();
        r5 = 10;
        if (r4 == 0) goto L_0x0178;
    L_0x0113:
        r4 = r2.next();
        r4 = (java.util.ArrayList) r4;
        r6 = r4.size();
        if (r6 <= 0) goto L_0x010b;
    L_0x011f:
        r6 = r4.size();
        if (r6 <= r5) goto L_0x012e;
    L_0x0125:
        r6 = 0;
    L_0x0126:
        if (r6 >= r5) goto L_0x012e;
    L_0x0128:
        r4.remove(r3);
        r6 = r6 + 1;
        goto L_0x0126;
    L_0x012e:
        r5 = r4.iterator();
        r6 = 0;
        r7 = 0;
    L_0x0134:
        r9 = r5.hasNext();
        if (r9 == 0) goto L_0x0147;
    L_0x013a:
        r9 = r5.next();
        r9 = (com.jumio.nv.liveness.extraction.a) r9;
        r10 = r9.h;
        r6 = r6 + r10;
        r9 = r9.i;
        r7 = r7 + r9;
        goto L_0x0134;
    L_0x0147:
        r5 = r4.size();
        r5 = (float) r5;
        r6 = r6 / r5;
        r5 = r4.size();
        r5 = (float) r5;
        r7 = r7 / r5;
        r5 = new android.util.Pair;
        r9 = new android.graphics.PointF;
        r10 = r4.get(r3);
        r10 = (com.jumio.nv.liveness.extraction.a) r10;
        r10 = r10.a;
        r10 = (float) r10;
        r4 = r4.get(r3);
        r4 = (com.jumio.nv.liveness.extraction.a) r4;
        r4 = r4.b;
        r4 = (float) r4;
        r9.<init>(r10, r4);
        r4 = new android.graphics.PointF;
        r4.<init>(r6, r7);
        r5.<init>(r9, r4);
        r0.add(r5);
        goto L_0x010b;
    L_0x0178:
        r4 = 1;
        r6 = 0;
        r7 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
    L_0x0181:
        r15 = r0.size();
        if (r4 >= r15) goto L_0x024a;
    L_0x0187:
        r15 = r0.get(r4);
        r15 = (android.util.Pair) r15;
        r15 = r15.first;
        r15 = (android.graphics.PointF) r15;
        r15 = r15.x;
        r8 = r4 + -1;
        r17 = r0.get(r8);
        r2 = r17;
        r2 = (android.util.Pair) r2;
        r2 = r2.first;
        r2 = (android.graphics.PointF) r2;
        r2 = r2.x;
        r2 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x01c8;
    L_0x01a7:
        r2 = r0.get(r4);
        r2 = (android.util.Pair) r2;
        r2 = r2.second;
        r2 = (android.graphics.PointF) r2;
        r2 = r2.x;
        r15 = r0.get(r8);
        r15 = (android.util.Pair) r15;
        r15 = r15.second;
        r15 = (android.graphics.PointF) r15;
        r15 = r15.x;
        r2 = r2 - r15;
        r2 = java.lang.Math.abs(r2);
        r9 = r9 + r2;
        r10 = r10 + 1;
        goto L_0x01e8;
    L_0x01c8:
        r2 = r0.get(r4);
        r2 = (android.util.Pair) r2;
        r2 = r2.second;
        r2 = (android.graphics.PointF) r2;
        r2 = r2.x;
        r15 = r0.get(r8);
        r15 = (android.util.Pair) r15;
        r15 = r15.second;
        r15 = (android.graphics.PointF) r15;
        r15 = r15.x;
        r2 = r2 - r15;
        r2 = java.lang.Math.abs(r2);
        r6 = r6 + r2;
        r7 = r7 + 1;
    L_0x01e8:
        r2 = r0.get(r4);
        r2 = (android.util.Pair) r2;
        r2 = r2.first;
        r2 = (android.graphics.PointF) r2;
        r2 = r2.y;
        r15 = r0.get(r8);
        r15 = (android.util.Pair) r15;
        r15 = r15.first;
        r15 = (android.graphics.PointF) r15;
        r15 = r15.y;
        r2 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1));
        if (r2 == 0) goto L_0x0225;
    L_0x0204:
        r2 = r0.get(r4);
        r2 = (android.util.Pair) r2;
        r2 = r2.second;
        r2 = (android.graphics.PointF) r2;
        r2 = r2.y;
        r8 = r0.get(r8);
        r8 = (android.util.Pair) r8;
        r8 = r8.second;
        r8 = (android.graphics.PointF) r8;
        r8 = r8.y;
        r2 = r2 - r8;
        r2 = java.lang.Math.abs(r2);
        r13 = r13 + r2;
        r14 = r14 + 1;
        goto L_0x0245;
    L_0x0225:
        r2 = r0.get(r4);
        r2 = (android.util.Pair) r2;
        r2 = r2.second;
        r2 = (android.graphics.PointF) r2;
        r2 = r2.y;
        r8 = r0.get(r8);
        r8 = (android.util.Pair) r8;
        r8 = r8.second;
        r8 = (android.graphics.PointF) r8;
        r8 = r8.y;
        r2 = r2 - r8;
        r2 = java.lang.Math.abs(r2);
        r12 = r12 + r2;
        r11 = r11 + 1;
    L_0x0245:
        r4 = r4 + 1;
        r8 = 0;
        goto L_0x0181;
    L_0x024a:
        r2 = (float) r7;
        r8 = r6 / r2;
        if (r7 != 0) goto L_0x0250;
    L_0x024f:
        r8 = 0;
    L_0x0250:
        r2 = (float) r10;
        r9 = r9 / r2;
        if (r10 != 0) goto L_0x0255;
    L_0x0254:
        r8 = 0;
    L_0x0255:
        r2 = (float) r11;
        r2 = r12 / r2;
        if (r11 != 0) goto L_0x025b;
    L_0x025a:
        r2 = 0;
    L_0x025b:
        r4 = (float) r14;
        r13 = r13 / r4;
        if (r14 != 0) goto L_0x0262;
    L_0x025f:
        r16 = 0;
        goto L_0x0264;
    L_0x0262:
        r16 = r2;
    L_0x0264:
        r2 = r8 + r9;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 / r4;
        r6 = r16 + r13;
        r6 = r6 / r4;
        r7 = 1;
        r10 = 0;
        r11 = 0;
        r12 = 0;
    L_0x0270:
        r14 = r0.size();
        r17 = 5;
        r18 = 4;
        r19 = 3;
        r20 = 2;
        if (r7 >= r14) goto L_0x0471;
    L_0x027e:
        r14 = r0.get(r7);
        r14 = (android.util.Pair) r14;
        r14 = r14.first;
        r14 = (android.graphics.PointF) r14;
        r14 = r14.x;
        r14 = (int) r14;
        r4 = r7 + -1;
        r21 = r0.get(r4);
        r15 = r21;
        r15 = (android.util.Pair) r15;
        r15 = r15.first;
        r15 = (android.graphics.PointF) r15;
        r15 = r15.x;
        r15 = (int) r15;
        if (r14 == r15) goto L_0x02e4;
    L_0x029e:
        if (r14 >= r15) goto L_0x02c0;
    L_0x02a0:
        r21 = r0.get(r7);
        r3 = r21;
        r3 = (android.util.Pair) r3;
        r3 = r3.second;
        r3 = (android.graphics.PointF) r3;
        r3 = r3.x;
        r21 = r0.get(r4);
        r5 = r21;
        r5 = (android.util.Pair) r5;
        r5 = r5.second;
        r5 = (android.graphics.PointF) r5;
        r5 = r5.x;
        r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r3 < 0) goto L_0x02de;
    L_0x02c0:
        if (r14 <= r15) goto L_0x02e1;
    L_0x02c2:
        r3 = r0.get(r7);
        r3 = (android.util.Pair) r3;
        r3 = r3.second;
        r3 = (android.graphics.PointF) r3;
        r3 = r3.x;
        r5 = r0.get(r4);
        r5 = (android.util.Pair) r5;
        r5 = r5.second;
        r5 = (android.graphics.PointF) r5;
        r5 = r5.x;
        r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r3 <= 0) goto L_0x02e1;
    L_0x02de:
        r3 = "TRUE";
        goto L_0x02e6;
    L_0x02e1:
        r3 = "FALSE";
        goto L_0x02e6;
    L_0x02e4:
        r3 = "";
    L_0x02e6:
        r5 = r0.get(r7);
        r5 = (android.util.Pair) r5;
        r5 = r5.first;
        r5 = (android.graphics.PointF) r5;
        r5 = r5.y;
        r5 = (int) r5;
        r21 = r0.get(r4);
        r22 = r13;
        r13 = r21;
        r13 = (android.util.Pair) r13;
        r13 = r13.first;
        r13 = (android.graphics.PointF) r13;
        r13 = r13.y;
        r13 = (int) r13;
        if (r5 == r13) goto L_0x0355;
    L_0x0306:
        if (r5 >= r13) goto L_0x032d;
    L_0x0308:
        r21 = r0.get(r7);
        r23 = r9;
        r9 = r21;
        r9 = (android.util.Pair) r9;
        r9 = r9.second;
        r9 = (android.graphics.PointF) r9;
        r9 = r9.y;
        r21 = r0.get(r4);
        r24 = r8;
        r8 = r21;
        r8 = (android.util.Pair) r8;
        r8 = r8.second;
        r8 = (android.graphics.PointF) r8;
        r8 = r8.y;
        r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1));
        if (r8 < 0) goto L_0x034f;
    L_0x032c:
        goto L_0x0331;
    L_0x032d:
        r24 = r8;
        r23 = r9;
    L_0x0331:
        if (r5 <= r13) goto L_0x0352;
    L_0x0333:
        r8 = r0.get(r7);
        r8 = (android.util.Pair) r8;
        r8 = r8.second;
        r8 = (android.graphics.PointF) r8;
        r8 = r8.y;
        r9 = r0.get(r4);
        r9 = (android.util.Pair) r9;
        r9 = r9.second;
        r9 = (android.graphics.PointF) r9;
        r9 = r9.y;
        r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r8 <= 0) goto L_0x0352;
    L_0x034f:
        r8 = "TRUE";
        goto L_0x035b;
    L_0x0352:
        r8 = "FALSE";
        goto L_0x035b;
    L_0x0355:
        r24 = r8;
        r23 = r9;
        r8 = "";
    L_0x035b:
        r9 = "FALSE";
        r9 = r9.equals(r3);
        if (r9 != 0) goto L_0x036d;
    L_0x0363:
        r9 = "FALSE";
        r9 = r9.equals(r8);
        if (r9 != 0) goto L_0x036d;
    L_0x036b:
        r10 = r10 + 1;
    L_0x036d:
        r9 = r0.get(r7);
        r9 = (android.util.Pair) r9;
        r9 = r9.second;
        r9 = (android.graphics.PointF) r9;
        r9 = r9.x;
        r21 = r0.get(r4);
        r25 = r10;
        r10 = r21;
        r10 = (android.util.Pair) r10;
        r10 = r10.second;
        r10 = (android.graphics.PointF) r10;
        r10 = r10.x;
        r9 = r9 - r10;
        r9 = java.lang.Math.abs(r9);
        r10 = r0.get(r7);
        r10 = (android.util.Pair) r10;
        r10 = r10.second;
        r10 = (android.graphics.PointF) r10;
        r10 = r10.y;
        r4 = r0.get(r4);
        r4 = (android.util.Pair) r4;
        r4 = r4.second;
        r4 = (android.graphics.PointF) r4;
        r4 = r4.y;
        r10 = r10 - r4;
        r4 = java.lang.Math.abs(r10);
        if (r14 == r15) goto L_0x03b1;
    L_0x03ad:
        r10 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1));
        if (r10 > 0) goto L_0x03b7;
    L_0x03b1:
        if (r14 != r15) goto L_0x03bc;
    L_0x03b3:
        r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1));
        if (r9 >= 0) goto L_0x03bc;
    L_0x03b7:
        r11 = r11 + 1;
        r9 = "TRUE";
        goto L_0x03be;
    L_0x03bc:
        r9 = "FALSE";
    L_0x03be:
        if (r5 == r13) goto L_0x03c4;
    L_0x03c0:
        r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r10 > 0) goto L_0x03ca;
    L_0x03c4:
        if (r5 != r13) goto L_0x03cf;
    L_0x03c6:
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 >= 0) goto L_0x03cf;
    L_0x03ca:
        r12 = r12 + 1;
        r4 = "TRUE";
        goto L_0x03d1;
    L_0x03cf:
        r4 = "FALSE";
    L_0x03d1:
        r5 = r1.t;
        r13 = 10;
        r10 = new java.lang.Object[r13];
        r14 = r0.get(r7);
        r14 = (android.util.Pair) r14;
        r14 = r14.first;
        r14 = (android.graphics.PointF) r14;
        r14 = r14.x;
        r14 = (int) r14;
        r14 = java.lang.Integer.valueOf(r14);
        r15 = 0;
        r10[r15] = r14;
        r14 = r0.get(r7);
        r14 = (android.util.Pair) r14;
        r14 = r14.first;
        r14 = (android.graphics.PointF) r14;
        r14 = r14.y;
        r14 = (int) r14;
        r14 = java.lang.Integer.valueOf(r14);
        r15 = 1;
        r10[r15] = r14;
        r14 = r0.get(r7);
        r14 = (android.util.Pair) r14;
        r14 = r14.first;
        r14 = (android.graphics.PointF) r14;
        r14 = r14.x;
        r14 = (int) r14;
        r14 = java.lang.Integer.valueOf(r14);
        r10[r20] = r14;
        r14 = r0.get(r7);
        r14 = (android.util.Pair) r14;
        r14 = r14.first;
        r14 = (android.graphics.PointF) r14;
        r14 = r14.y;
        r14 = (int) r14;
        r14 = java.lang.Integer.valueOf(r14);
        r10[r19] = r14;
        r14 = r0.get(r7);
        r14 = (android.util.Pair) r14;
        r14 = r14.second;
        r14 = (android.graphics.PointF) r14;
        r14 = r14.x;
        r14 = java.lang.Float.valueOf(r14);
        r10[r18] = r14;
        r14 = r0.get(r7);
        r14 = (android.util.Pair) r14;
        r14 = r14.second;
        r14 = (android.graphics.PointF) r14;
        r14 = r14.y;
        r14 = java.lang.Float.valueOf(r14);
        r10[r17] = r14;
        r14 = 6;
        r10[r14] = r3;
        r3 = 7;
        r10[r3] = r8;
        r3 = 8;
        r10[r3] = r9;
        r3 = 9;
        r10[r3] = r4;
        r3 = "T%d/%d; %d; %d; %f;%f; %s; %s; %s; %s;\n";
        r3 = java.lang.String.format(r3, r10);
        r5.append(r3);
        r7 = r7 + 1;
        r13 = r22;
        r9 = r23;
        r8 = r24;
        r10 = r25;
        r3 = 0;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = 10;
        goto L_0x0270;
    L_0x0471:
        r24 = r8;
        r23 = r9;
        r22 = r13;
        r3 = (float) r10;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r3 * r4;
        r4 = (float) r11;
        r3 = r3 + r4;
        r4 = (float) r12;
        r3 = r3 + r4;
        r0 = r0.size();
        r4 = 1;
        r0 = r0 - r4;
        r0 = (float) r0;
        r5 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
        r0 = r0 * r5;
        r3 = r3 / r0;
        r0 = r1.t;
        r5 = 7;
        r5 = new java.lang.Object[r5];
        r7 = java.lang.Float.valueOf(r24);
        r8 = 0;
        r5[r8] = r7;
        r7 = java.lang.Float.valueOf(r16);
        r5[r4] = r7;
        r4 = java.lang.Float.valueOf(r23);
        r5[r20] = r4;
        r4 = java.lang.Float.valueOf(r22);
        r5[r19] = r4;
        r2 = java.lang.Float.valueOf(r2);
        r5[r18] = r2;
        r2 = java.lang.Float.valueOf(r6);
        r5[r17] = r2;
        r2 = java.lang.Float.valueOf(r3);
        r4 = 6;
        r5[r4] = r2;
        r2 = "%f;%f;%f;%f;%f;%f;%f;\n";
        r2 = java.lang.String.format(r2, r5);
        r0.append(r2);
        return r3;
    L_0x04c7:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x04c7 }
        goto L_0x04cb;
    L_0x04ca:
        throw r0;
    L_0x04cb:
        goto L_0x04ca;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.nv.liveness.eyetracking.a.a.b():float");
    }
}
