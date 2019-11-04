package com.umoove.all;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PointF;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.Display;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressLint({"NewApi"})
/* compiled from: UmooveEngine */
public class g {
    private static boolean d = false;
    private static boolean eJg = false;
    private static c eJu = null;
    private static b eJw = null;
    private static g eJz = null;
    private static boolean q = false;
    private static int s = -1;
    private a eJA;
    private f eJB;
    private e eJC;
    private SharedPreferences eJt;
    private d eJv;
    private Context eJx;
    private h eJy;
    private int g = -1;
    private int h = -1;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private int x;
    private int y;

    /* compiled from: UmooveEngine */
    private class a extends AsyncTask<int[], Void, String> {
        /* Access modifiers changed, original: protected|varargs */
        /* renamed from: a */
        public String doInBackground(int[]... iArr) {
            return "";
        }

        /* Access modifiers changed, original: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
        }

        private a() {
        }
    }

    public static g a(Context context, Display display, int i, int i2, float f, float f2, h hVar, int i3) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        } else if (display == null) {
            throw new NullPointerException("Display cannot be null");
        } else if (hVar == null) {
            throw new NullPointerException("UmooveListener cannot be null");
        } else if (i < 1 || i2 < 1) {
            throw new IllegalArgumentException("Frame size value is Illegal");
        } else if (f < 1.0f || f2 < 1.0f) {
            throw new IllegalArgumentException("FOV value is Illegal");
        } else if (i3 >= 1000000) {
            if (eJz == null) {
                eJz = new g(context, display, i, i2, f, f2, hVar, i3);
                s = display.getRotation();
            }
            return eJz;
        } else {
            throw new IllegalArgumentException("Key value is Illegal");
        }
    }

    g(Context context, Display display, int i, int i2, float f, float f2, h hVar, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        Context context2 = context;
        Display display2 = display;
        int i8 = i;
        int i9 = i2;
        h hVar2 = hVar;
        int i10 = i3;
        if (context2 == null) {
            throw new NullPointerException("Context cannot be null");
        } else if (display2 == null) {
            throw new NullPointerException("Display cannot be null");
        } else if (hVar2 == null) {
            throw new NullPointerException("UmooveListener cannot be null");
        } else if (i8 < 1 || i9 < 1) {
            throw new IllegalArgumentException("Frame size value is Illegal");
        } else if (f < 1.0f || f2 < 1.0f) {
            throw new IllegalArgumentException("FOV value is Illegal");
        } else if (i10 >= 1000000) {
            this.eJx = context2;
            this.eJt = PreferenceManager.getDefaultSharedPreferences(context);
            this.x = i8;
            this.y = i9;
            if (!eJg) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                i4 = displayMetrics.widthPixels;
                i5 = displayMetrics.heightPixels;
                if (VERSION.SDK_INT >= 16) {
                    display2.getRealMetrics(displayMetrics);
                    i4 = displayMetrics.widthPixels;
                    i6 = displayMetrics.heightPixels;
                } else {
                    try {
                        Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                        i4 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(display2, new Object[0])).intValue();
                        i6 = ((Integer) method.invoke(display2, new Object[0])).intValue();
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e3) {
                        e3.printStackTrace();
                    } catch (NoSuchMethodException e4) {
                        e4.printStackTrace();
                    }
                }
                i7 = i6;
                i6 = i4;
                eJg = true;
                this.eJy = hVar2;
                a(display, i6, i7, i, i2, f, f2);
                f();
                e(i6, i7, i, i2, i3);
                iArr = new int[]{i6, i7, i8, i9, i10};
                new a().execute(new int[][]{iArr});
            }
            return;
        } else {
            throw new IllegalArgumentException("Key value is Illegal");
        }
        i6 = i4;
        i7 = i5;
        eJg = true;
        this.eJy = hVar2;
        a(display, i6, i7, i, i2, f, f2);
        f();
        e(i6, i7, i, i2, i3);
        iArr = new int[]{i6, i7, i8, i9, i10};
        new a().execute(new int[][]{iArr});
    }

    private void e(int i, int i2, int i3, int i4, int i5) {
        eJu.a(this, i3, i4);
        f(i, i2, i3, i4, i5);
        d = true;
        eJg = false;
        this.h = 0;
        this.g = 0;
    }

    private void f() {
        eJu = new c(80);
        eJu.start();
    }

    private void a(Display display, int i, int i2, int i3, int i4, float f, float f2) {
        eJw = new b(this.eJx, display, i, i2, i3, i4, f, f2);
        eJw.a();
    }

    public void a(int i) {
        eJw.a(i);
        if (i != 0) {
            c();
            b();
            this.h = 0;
            this.g = 0;
            s = (s + i) % 4;
        }
    }

    private void f(int i, int i2, int i3, int i4, int i5) {
        int i6 = i;
        int i7 = i2;
        d dVar = new d(0);
        dVar.a = i3;
        dVar.b = i4;
        if (i6 > i7) {
            dVar.c = i7;
            dVar.d = i6;
        } else {
            dVar.c = i6;
            dVar.d = i7;
        }
        dVar.g = eJw.f();
        dVar.h = eJw.g();
        dVar.o = eJw.bif();
        dVar.i = (s + eJw.c()) % 4;
        dVar.j = eJw.b();
        dVar.eJh = (double) eJw.bid();
        dVar.eJi = (double) eJw.bie();
        dVar.m = this.eJt.getFloat("driftFixX", 0.0f);
        dVar.n = this.eJt.getFloat("driftFixY", 0.0f);
        dVar.p = i5;
        UMNativeCore.InitNative(dVar.a, dVar.b, dVar.c, dVar.d, dVar.o, dVar.e, dVar.f, dVar.g, dVar.h, dVar.i, dVar.eJh, dVar.eJi, dVar.m, dVar.n, dVar.p);
    }

    public void a(byte[] bArr, int i, Long l) {
        if (bArr == null) {
            throw new NullPointerException("Data byte array cannot be null");
        } else if (bArr.length < this.x * this.y) {
            throw new ArrayIndexOutOfBoundsException("Data byte array out of bounds");
        } else if (i < 0 || i > 4) {
            throw new IllegalArgumentException("Orientation value is Illegal");
        } else {
            i = (i + eJw.c()) % 4;
            if (i != s) {
                c();
                b();
                this.h = 0;
                this.g = 0;
                this.eJy.a(3);
                s = i;
            }
            if (d) {
                eJu.a(bArr, i, l);
            }
        }
    }

    public c bih() {
        return eJu;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(float[] fArr, Long l) {
        this.h = (int) fArr[1];
        int i = this.h;
        if (i == 0) {
            int i2 = this.g;
            if (i2 == 2 || i2 == 3) {
                this.eJy.a(2);
            }
            if (this.g == 4) {
                this.eJy.a(3);
            }
        } else if (i == 2) {
            this.eJy.a(2);
        } else if (i == 4 && q) {
            e eVar;
            if (i != this.g) {
                this.eJy.a(1);
            }
            this.eJB = new f();
            this.eJC = new e();
            this.eJB.eJs = l.longValue();
            this.eJC.eJr = l.longValue();
            this.eJA = new a();
            this.eJA.eIY = new PointF(fArr[10], fArr[11]);
            this.eJA.eIZ = new PointF(fArr[13], fArr[14]);
            this.eJA.c = (int) fArr[12];
            this.eJC.l = (int) fArr[12];
            if (this.m) {
                this.eJB.eIY.x = fArr[20];
                this.eJB.eIY.y = fArr[21];
            }
            if (this.n) {
                this.eJB.eIZ.x = fArr[22];
                this.eJB.eIZ.y = fArr[23];
            }
            if (this.j) {
                this.eJC.eJo.x = fArr[32];
                this.eJC.eJo.y = fArr[33];
                this.eJC.eJp.x = fArr[34];
                this.eJC.eJp.y = fArr[35];
            }
            if (this.k) {
                this.eJC.eJm.x = fArr[24];
                this.eJC.eJm.y = fArr[25];
                this.eJC.eJn.x = fArr[26];
                this.eJC.eJn.y = fArr[27];
                eVar = this.eJC;
                eVar.g = fArr[55];
                eVar.a = (int) fArr[36];
                eVar.b = (int) fArr[37];
            }
            if (this.j || this.k) {
                this.eJC.eJk.x = fArr[56];
                this.eJC.eJk.y = fArr[57];
                this.eJC.eJl.x = fArr[58];
                this.eJC.eJl.y = fArr[59];
            }
            if (this.o) {
                eVar = this.eJC;
                eVar.j = (int) fArr[38];
                eVar.eJq.x = fArr[52];
                this.eJC.eJq.y = fArr[53];
            }
            if (this.l) {
                this.eJy.b((int) fArr[40]);
            }
            eVar = this.eJC;
            eVar.m = fArr[60];
            eVar.n = fArr[61];
            this.eJy.a(e(), this.eJB, this.eJC);
        }
        this.g = this.h;
    }

    public void a(boolean z) {
        this.l = z;
    }

    public void b(boolean z) {
        this.j = z;
        if (z) {
            this.eJv = new d(10);
            eJu.a(this.eJv);
        }
    }

    public void c(boolean z) {
        this.k = z;
        if (z) {
            this.eJv = new d(10);
            eJu.a(this.eJv);
        }
    }

    public void d(boolean z) {
        this.o = z;
        if (z) {
            this.eJv = new d(7);
            eJu.a(this.eJv);
        }
    }

    public void e(boolean z) {
        this.p = z;
        if (d) {
            this.eJv = new d(2);
            d dVar = this.eJv;
            dVar.q = this.p;
            eJu.a(dVar);
            this.g = 2;
            q = true;
        }
    }

    public void b() {
        this.eJv = new d(1);
        eJu.a(this.eJv);
    }

    public void c() {
        q = false;
        if (eJu != null) {
            this.eJv = new d(3);
            eJu.a(this.eJv);
        }
    }

    public void d() {
        d = false;
        this.eJx = null;
        eJu = null;
        eJw = null;
        eJz = null;
    }

    public int e() {
        if (!q && this.h == 4) {
            return 5;
        }
        int i = this.h;
        if (i == 3) {
            i = 2;
        }
        return i;
    }

    public void aR(int i, int i2) {
        if (i <= 0) {
            throw new IllegalArgumentException("displayWindowWidth value is Illegal");
        } else if (i2 > 0) {
            d dVar = new d(4);
            dVar.c = i;
            dVar.d = i2;
            eJu.a(dVar);
        } else {
            throw new IllegalArgumentException("displayWindowHeight value is Illegal");
        }
    }
}
