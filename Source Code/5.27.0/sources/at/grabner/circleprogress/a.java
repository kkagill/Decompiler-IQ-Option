package at.grabner.circleprogress;

import android.animation.TimeInterpolator;
import android.os.Handler;
import android.os.Message;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.lang.ref.WeakReference;

/* compiled from: AnimationHandler */
public class a extends Handler {
    private long bA;
    private TimeInterpolator bB = new DecelerateInterpolator();
    private double bC;
    private final WeakReference<c> bx;
    private float by;
    private long bz;
    private TimeInterpolator mInterpolator = new AccelerateDecelerateInterpolator();

    /* compiled from: AnimationHandler */
    /* renamed from: at.grabner.circleprogress.a$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[jumio.nv.nfc.a.values().length];
        static final /* synthetic */ int[] b = new int[AnimationState.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        static {
            /*
            r0 = at.grabner.circleprogress.AnimationState.values();
            r0 = r0.length;
            r0 = new int[r0];
            b = r0;
            r0 = 1;
            r1 = b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = at.grabner.circleprogress.AnimationState.IDLE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = at.grabner.circleprogress.AnimationState.SPINNING;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = at.grabner.circleprogress.AnimationState.END_SPINNING;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = at.grabner.circleprogress.AnimationState.END_SPINNING_START_ANIMATING;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = 5;
            r5 = b;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = at.grabner.circleprogress.AnimationState.ANIMATING;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5[r6] = r4;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r5 = jumio.nv.nfc.a.values();
            r5 = r5.length;
            r5 = new int[r5];
            a = r5;
            r5 = a;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r6 = jumio.nv.nfc.a.START_SPINNING;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r6 = r6.ordinal();	 Catch:{ NoSuchFieldError -> 0x0053 }
            r5[r6] = r0;	 Catch:{ NoSuchFieldError -> 0x0053 }
        L_0x0053:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x005d }
            r5 = jumio.nv.nfc.a.STOP_SPINNING;	 Catch:{ NoSuchFieldError -> 0x005d }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x005d }
            r0[r5] = r1;	 Catch:{ NoSuchFieldError -> 0x005d }
        L_0x005d:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0067 }
            r1 = jumio.nv.nfc.a.SET_VALUE;	 Catch:{ NoSuchFieldError -> 0x0067 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0067 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0067 }
        L_0x0067:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0071 }
            r1 = jumio.nv.nfc.a.SET_VALUE_ANIMATED;	 Catch:{ NoSuchFieldError -> 0x0071 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0071 }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x0071 }
        L_0x0071:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x007b }
            r1 = jumio.nv.nfc.a.TICK;	 Catch:{ NoSuchFieldError -> 0x007b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007b }
            r0[r1] = r4;	 Catch:{ NoSuchFieldError -> 0x007b }
        L_0x007b:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: at.grabner.circleprogress.a$AnonymousClass1.<clinit>():void");
        }
    }

    a(c cVar) {
        super(cVar.getContext().getMainLooper());
        this.bx = new WeakReference(cVar);
    }

    public void handleMessage(Message message) {
        c cVar = (c) this.bx.get();
        if (cVar != null) {
            jumio.nv.nfc.a aVar = jumio.nv.nfc.a.values()[message.what];
            if (aVar == jumio.nv.nfc.a.TICK) {
                removeMessages(jumio.nv.nfc.a.TICK.ordinal());
            }
            int i = AnonymousClass1.b[cVar.cv.ordinal()];
            int i2;
            float f;
            double currentTimeMillis;
            double d;
            if (i == 1) {
                i2 = AnonymousClass1.a[aVar.ordinal()];
                if (i2 == 1) {
                    c(cVar);
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        b(message, cVar);
                    } else if (i2 == 4) {
                        a(message, cVar);
                    } else if (i2 == 5) {
                        removeMessages(jumio.nv.nfc.a.TICK.ordinal());
                    }
                }
            } else if (i == 2) {
                i2 = AnonymousClass1.a[aVar.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        a(cVar);
                    } else if (i2 == 3) {
                        b(message, cVar);
                    } else if (i2 == 4) {
                        a(cVar, message);
                    } else if (i2 == 5) {
                        f = cVar.bG - cVar.bH;
                        currentTimeMillis = (double) (System.currentTimeMillis() - this.bA);
                        d = this.bC;
                        Double.isNaN(currentTimeMillis);
                        float f2 = (float) (currentTimeMillis / d);
                        if (f2 > 1.0f) {
                            f2 = 1.0f;
                        }
                        f2 = this.bB.getInterpolation(f2);
                        if (Math.abs(f) < 1.0f) {
                            cVar.bG = cVar.bH;
                        } else if (cVar.bG < cVar.bH) {
                            cVar.bG = this.by + ((cVar.bH - this.by) * f2);
                        } else {
                            f = this.by;
                            cVar.bG = f - ((f - cVar.bH) * f2);
                        }
                        cVar.bI += cVar.cq;
                        if (cVar.bI > 360.0f) {
                            cVar.bI = 0.0f;
                        }
                        sendEmptyMessageDelayed(jumio.nv.nfc.a.TICK.ordinal(), (long) cVar.cs);
                        cVar.invalidate();
                    }
                }
            } else if (i == 3) {
                i2 = AnonymousClass1.a[aVar.ordinal()];
                if (i2 == 1) {
                    cVar.cv = AnimationState.SPINNING;
                    if (cVar.cH != null) {
                        cVar.cH.a(cVar.cv);
                    }
                    sendEmptyMessageDelayed(jumio.nv.nfc.a.TICK.ordinal(), (long) cVar.cs);
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        b(message, cVar);
                    } else if (i2 == 4) {
                        a(cVar, message);
                    } else if (i2 == 5) {
                        currentTimeMillis = (double) (System.currentTimeMillis() - this.bA);
                        d = this.bC;
                        Double.isNaN(currentTimeMillis);
                        f = (float) (currentTimeMillis / d);
                        if (f > 1.0f) {
                            f = 1.0f;
                        }
                        cVar.bG = this.by * (1.0f - this.bB.getInterpolation(f));
                        cVar.bI += cVar.cq;
                        if (cVar.bG < 0.01f) {
                            cVar.cv = AnimationState.IDLE;
                            if (cVar.cH != null) {
                                cVar.cH.a(cVar.cv);
                            }
                        }
                        sendEmptyMessageDelayed(jumio.nv.nfc.a.TICK.ordinal(), (long) cVar.cs);
                        cVar.invalidate();
                    }
                }
            } else if (i == 4) {
                i2 = AnonymousClass1.a[aVar.ordinal()];
                if (i2 == 1) {
                    cVar.ct = false;
                    c(cVar);
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        cVar.ct = false;
                        b(message, cVar);
                    } else if (i2 == 4) {
                        cVar.bF = 0.0f;
                        cVar.bE = ((float[]) message.obj)[1];
                        sendEmptyMessageDelayed(jumio.nv.nfc.a.TICK.ordinal(), (long) cVar.cs);
                    } else if (i2 == 5) {
                        double d2;
                        if (cVar.bG > cVar.bH && !cVar.ct) {
                            d = (double) (System.currentTimeMillis() - this.bA);
                            d2 = this.bC;
                            Double.isNaN(d);
                            f = (float) (d / d2);
                            if (f > 1.0f) {
                                f = 1.0f;
                            }
                            cVar.bG = this.by * (1.0f - this.bB.getInterpolation(f));
                        }
                        cVar.bI += cVar.cq;
                        if (cVar.bI > 360.0f && !cVar.ct) {
                            this.bz = System.currentTimeMillis();
                            cVar.ct = true;
                            b(cVar);
                            if (cVar.cH != null) {
                                cVar.cH.a(AnimationState.START_ANIMATING_AFTER_SPINNING);
                            }
                        }
                        if (cVar.ct) {
                            cVar.bI = 360.0f;
                            cVar.bG -= cVar.cq;
                            d(cVar);
                            d = (double) (System.currentTimeMillis() - this.bA);
                            d2 = this.bC;
                            Double.isNaN(d);
                            f = (float) (d / d2);
                            if (f > 1.0f) {
                                f = 1.0f;
                            }
                            cVar.bG = this.by * (1.0f - this.bB.getInterpolation(f));
                        }
                        if (((double) cVar.bG) < 0.1d) {
                            cVar.cv = AnimationState.ANIMATING;
                            if (cVar.cH != null) {
                                cVar.cH.a(cVar.cv);
                            }
                            cVar.invalidate();
                            cVar.ct = false;
                            cVar.bG = cVar.bH;
                        } else {
                            cVar.invalidate();
                        }
                        sendEmptyMessageDelayed(jumio.nv.nfc.a.TICK.ordinal(), (long) cVar.cs);
                    }
                }
            } else if (i == 5) {
                i2 = AnonymousClass1.a[aVar.ordinal()];
                if (i2 == 1) {
                    c(cVar);
                } else if (i2 != 2) {
                    if (i2 == 3) {
                        b(message, cVar);
                    } else if (i2 == 4) {
                        this.bz = System.currentTimeMillis();
                        cVar.bF = cVar.bD;
                        cVar.bE = ((float[]) message.obj)[1];
                    } else if (i2 == 5) {
                        if (d(cVar)) {
                            cVar.cv = AnimationState.IDLE;
                            if (cVar.cH != null) {
                                cVar.cH.a(cVar.cv);
                            }
                            cVar.bD = cVar.bE;
                        }
                        sendEmptyMessageDelayed(jumio.nv.nfc.a.TICK.ordinal(), (long) cVar.cs);
                        cVar.invalidate();
                    }
                }
            }
        }
    }

    private void a(Message message, c cVar) {
        cVar.bF = ((float[]) message.obj)[0];
        cVar.bE = ((float[]) message.obj)[1];
        this.bz = System.currentTimeMillis();
        cVar.cv = AnimationState.ANIMATING;
        if (cVar.cH != null) {
            cVar.cH.a(cVar.cv);
        }
        sendEmptyMessageDelayed(jumio.nv.nfc.a.TICK.ordinal(), (long) cVar.cs);
    }

    private void a(c cVar, Message message) {
        cVar.cv = AnimationState.END_SPINNING_START_ANIMATING;
        if (cVar.cH != null) {
            cVar.cH.a(cVar.cv);
        }
        cVar.bF = 0.0f;
        cVar.bE = ((float[]) message.obj)[1];
        this.bA = System.currentTimeMillis();
        this.by = cVar.bG;
        sendEmptyMessageDelayed(jumio.nv.nfc.a.TICK.ordinal(), (long) cVar.cs);
    }

    private void a(c cVar) {
        cVar.cv = AnimationState.END_SPINNING;
        b(cVar);
        if (cVar.cH != null) {
            cVar.cH.a(cVar.cv);
        }
        sendEmptyMessageDelayed(jumio.nv.nfc.a.TICK.ordinal(), (long) cVar.cs);
    }

    private void b(c cVar) {
        this.bC = (double) (((cVar.bG / cVar.cq) * ((float) cVar.cs)) * 2.0f);
        this.bA = System.currentTimeMillis();
        this.by = cVar.bG;
    }

    private void c(c cVar) {
        cVar.cv = AnimationState.SPINNING;
        if (cVar.cH != null) {
            cVar.cH.a(cVar.cv);
        }
        cVar.bG = (360.0f / cVar.mMaxValue) * cVar.bD;
        cVar.bI = (360.0f / cVar.mMaxValue) * cVar.bD;
        this.bA = System.currentTimeMillis();
        this.by = cVar.bG;
        this.bC = (double) (((cVar.bH / cVar.cq) * ((float) cVar.cs)) * 2.0f);
        sendEmptyMessageDelayed(jumio.nv.nfc.a.TICK.ordinal(), (long) cVar.cs);
    }

    private boolean d(c cVar) {
        double currentTimeMillis = (double) (System.currentTimeMillis() - this.bz);
        double d = cVar.cr;
        Double.isNaN(currentTimeMillis);
        float f = (float) (currentTimeMillis / d);
        if (f > 1.0f) {
            f = 1.0f;
        }
        cVar.bD = cVar.bF + ((cVar.bE - cVar.bF) * this.mInterpolator.getInterpolation(f));
        return f >= 1.0f;
    }

    private void b(Message message, c cVar) {
        cVar.bF = cVar.bE;
        float f = ((float[]) message.obj)[0];
        cVar.bE = f;
        cVar.bD = f;
        cVar.cv = AnimationState.IDLE;
        if (cVar.cH != null) {
            cVar.cH.a(cVar.cv);
        }
        cVar.invalidate();
    }
}
