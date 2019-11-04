package com.noveogroup.android.log;

import com.noveogroup.android.log.Logger.Level;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Pattern */
public abstract class d {
    private final int count;
    private final int length;

    /* compiled from: Pattern */
    public static class b {
        private String eBI;
        private List<c> eBJ;
        private final Pattern eBK = Pattern.compile("%%");
        private final Pattern eBL = Pattern.compile("%n");
        private final Pattern eBM = Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?level");
        private final Pattern eBN = Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?logger(\\{([+-]?\\d+)?(\\.([+-]?\\d+))?\\})?");
        private final Pattern eBO = Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?caller(\\{([+-]?\\d+)?(\\.([+-]?\\d+))?\\})?");
        private final Pattern eBP = Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?source");
        private final Pattern eBQ = Pattern.compile("%date(\\{(.*?)\\})?");
        private final Pattern eBR = Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?\\(");
        private final Pattern eBS = Pattern.compile("%d(\\{(.*?)\\})?");
        private final Pattern eBT = Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?p");
        private final Pattern eBU = Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?c(\\{([+-]?\\d+)?(\\.([+-]?\\d+))?\\})?");
        private final Pattern eBV = Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?C(\\{([+-]?\\d+)?(\\.([+-]?\\d+))?\\})?");
        private final Pattern eBW = Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?s");
        private final Pattern eBX = Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?thread");
        private final Pattern eBY = Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?t");
        private int position;

        public d kQ(String str) {
            if (str == null) {
                return null;
            }
            this.position = 0;
            this.eBI = str;
            this.eBJ = new ArrayList();
            this.eBJ.add(new c(0, 0, new ArrayList()));
            while (true) {
                int length = str.length();
                int i = this.position;
                if (length <= i) {
                    break;
                }
                length = str.indexOf("%", i);
                i = str.indexOf(")", this.position);
                if (this.eBJ.size() > 1 && i < length) {
                    List list = this.eBJ;
                    ((c) list.get(list.size() - 1)).a(new g(0, 0, str.substring(this.position, i)));
                    list = this.eBJ;
                    c cVar = (c) list.get(list.size() - 2);
                    List list2 = this.eBJ;
                    cVar.a((d) list2.remove(list2.size() - 1));
                    this.position = i + 1;
                }
                if (length == -1) {
                    List list3 = this.eBJ;
                    ((c) list3.get(list3.size() - 1)).a(new g(0, 0, str.substring(this.position)));
                    break;
                }
                List list4 = this.eBJ;
                ((c) list4.get(list4.size() - 1)).a(new g(0, 0, str.substring(this.position, length)));
                this.position = length;
                bgt();
            }
            return (d) this.eBJ.get(0);
        }

        private void bgt() {
            Matcher a = a(this.eBK);
            List list;
            if (a != null) {
                list = this.eBJ;
                ((c) list.get(list.size() - 1)).a(new g(0, 0, "%"));
                this.position = a.end();
                return;
            }
            a = a(this.eBL);
            if (a != null) {
                list = this.eBJ;
                ((c) list.get(list.size() - 1)).a(new g(0, 0, "\n"));
                this.position = a.end();
                return;
            }
            int parseInt;
            int parseInt2;
            List list2;
            a = a(this.eBM);
            String str = "0";
            if (a == null) {
                a = a(this.eBT);
                if (a == null) {
                    int parseInt3;
                    int parseInt4;
                    List list3;
                    a = a(this.eBO);
                    if (a == null) {
                        a = a(this.eBV);
                        if (a == null) {
                            a = a(this.eBP);
                            if (a == null) {
                                a = a(this.eBW);
                                if (a == null) {
                                    a = a(this.eBN);
                                    if (a == null) {
                                        a = a(this.eBU);
                                        if (a == null) {
                                            a = a(this.eBQ);
                                            if (a == null) {
                                                a = a(this.eBS);
                                                if (a == null) {
                                                    a = a(this.eBX);
                                                    if (a == null) {
                                                        a = a(this.eBY);
                                                        if (a == null) {
                                                            a = a(this.eBR);
                                                            if (a != null) {
                                                                parseInt = Integer.parseInt(a.group(1) == null ? str : a.group(1));
                                                                if (a.group(3) != null) {
                                                                    str = a.group(3);
                                                                }
                                                                this.eBJ.add(new c(parseInt, Integer.parseInt(str), new ArrayList()));
                                                                this.position = a.end();
                                                                return;
                                                            }
                                                            throw new IllegalArgumentException();
                                                        }
                                                    }
                                                    parseInt = Integer.parseInt(a.group(1) == null ? str : a.group(1));
                                                    if (a.group(3) != null) {
                                                        str = a.group(3);
                                                    }
                                                    parseInt2 = Integer.parseInt(str);
                                                    list2 = this.eBJ;
                                                    ((c) list2.get(list2.size() - 1)).a(new i(parseInt, parseInt2));
                                                    this.position = a.end();
                                                    return;
                                                }
                                            }
                                            String group = a.group(2);
                                            list2 = this.eBJ;
                                            ((c) list2.get(list2.size() - 1)).a(new d(0, 0, group));
                                            this.position = a.end();
                                            return;
                                        }
                                    }
                                    parseInt = Integer.parseInt(a.group(1) == null ? str : a.group(1));
                                    parseInt2 = Integer.parseInt(a.group(3) == null ? str : a.group(3));
                                    parseInt3 = Integer.parseInt(a.group(5) == null ? str : a.group(5));
                                    if (a.group(7) != null) {
                                        str = a.group(7);
                                    }
                                    parseInt4 = Integer.parseInt(str);
                                    list3 = this.eBJ;
                                    ((c) list3.get(list3.size() - 1)).a(new f(parseInt, parseInt2, parseInt3, parseInt4));
                                    this.position = a.end();
                                    return;
                                }
                            }
                            parseInt = Integer.parseInt(a.group(1) == null ? str : a.group(1));
                            if (a.group(3) != null) {
                                str = a.group(3);
                            }
                            parseInt2 = Integer.parseInt(str);
                            list2 = this.eBJ;
                            ((c) list2.get(list2.size() - 1)).a(new h(parseInt, parseInt2));
                            this.position = a.end();
                            return;
                        }
                    }
                    parseInt = Integer.parseInt(a.group(1) == null ? str : a.group(1));
                    parseInt2 = Integer.parseInt(a.group(3) == null ? str : a.group(3));
                    parseInt3 = Integer.parseInt(a.group(5) == null ? str : a.group(5));
                    if (a.group(7) != null) {
                        str = a.group(7);
                    }
                    parseInt4 = Integer.parseInt(str);
                    list3 = this.eBJ;
                    ((c) list3.get(list3.size() - 1)).a(new a(parseInt, parseInt2, parseInt3, parseInt4));
                    this.position = a.end();
                    return;
                }
            }
            parseInt = Integer.parseInt(a.group(1) == null ? str : a.group(1));
            if (a.group(3) != null) {
                str = a.group(3);
            }
            parseInt2 = Integer.parseInt(str);
            list2 = this.eBJ;
            ((c) list2.get(list2.size() - 1)).a(new e(parseInt, parseInt2));
            this.position = a.end();
        }

        private Matcher a(Pattern pattern) {
            Matcher matcher = pattern.matcher(this.eBI);
            return (matcher.find(this.position) && matcher.start() == this.position) ? matcher : null;
        }
    }

    /* compiled from: Pattern */
    public static class a extends d {
        private int eBG;
        private int eBH;

        /* Access modifiers changed, original: protected */
        public boolean isCallerNeeded() {
            return true;
        }

        public a(int i, int i2, int i3, int i4) {
            super(i, i2);
            this.eBG = i3;
            this.eBH = i4;
        }

        /* Access modifiers changed, original: protected */
        public String b(StackTraceElement stackTraceElement, String str, Level level) {
            if (stackTraceElement != null) {
                String format;
                if (stackTraceElement.getLineNumber() < 0) {
                    format = String.format("%s#%s", new Object[]{stackTraceElement.getClassName(), stackTraceElement.getMethodName()});
                } else {
                    format = String.format("%s#%s:%d", new Object[]{stackTraceElement.getClassName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())});
                }
                return g.f(format, this.eBG, this.eBH);
            }
            throw new IllegalArgumentException("Caller not found");
        }
    }

    /* compiled from: Pattern */
    public static class c extends d {
        private final List<d> eBZ;

        public c(int i, int i2, List<d> list) {
            super(i, i2);
            this.eBZ = new ArrayList(list);
        }

        public void a(d dVar) {
            this.eBZ.add(dVar);
        }

        /* Access modifiers changed, original: protected */
        public String b(StackTraceElement stackTraceElement, String str, Level level) {
            StringBuilder stringBuilder = new StringBuilder();
            for (d a : this.eBZ) {
                stringBuilder.append(a.a(stackTraceElement, str, level));
            }
            return stringBuilder.toString();
        }

        /* Access modifiers changed, original: protected */
        public boolean isCallerNeeded() {
            for (d isCallerNeeded : this.eBZ) {
                if (isCallerNeeded.isCallerNeeded()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: Pattern */
    public static class d extends d {
        private final SimpleDateFormat dateFormat;

        public d(int i, int i2, String str) {
            super(i, i2);
            if (str != null) {
                this.dateFormat = new SimpleDateFormat(str);
            } else {
                this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            }
        }

        /* Access modifiers changed, original: protected */
        public String b(StackTraceElement stackTraceElement, String str, Level level) {
            return this.dateFormat.format(new Date());
        }
    }

    /* compiled from: Pattern */
    public static class e extends d {
        public e(int i, int i2) {
            super(i, i2);
        }

        /* Access modifiers changed, original: protected */
        public String b(StackTraceElement stackTraceElement, String str, Level level) {
            return level.toString();
        }
    }

    /* compiled from: Pattern */
    public static class f extends d {
        private int eCa;
        private int eCb;

        public f(int i, int i2, int i3, int i4) {
            super(i, i2);
            this.eCa = i3;
            this.eCb = i4;
        }

        /* Access modifiers changed, original: protected */
        public String b(StackTraceElement stackTraceElement, String str, Level level) {
            return g.f(str, this.eCa, this.eCb);
        }
    }

    /* compiled from: Pattern */
    public static class g extends d {
        private final String string;

        public g(int i, int i2, String str) {
            super(i, i2);
            this.string = str;
        }

        /* Access modifiers changed, original: protected */
        public String b(StackTraceElement stackTraceElement, String str, Level level) {
            return this.string;
        }
    }

    /* compiled from: Pattern */
    public static class h extends d {
        /* Access modifiers changed, original: protected */
        public boolean isCallerNeeded() {
            return true;
        }

        public h(int i, int i2) {
            super(i, i2);
        }

        /* Access modifiers changed, original: protected */
        public String b(StackTraceElement stackTraceElement, String str, Level level) {
            if (stackTraceElement != null) {
                StringBuilder stringBuilder = new StringBuilder();
                if (stackTraceElement.isNativeMethod()) {
                    stringBuilder.append("(native)");
                } else if (stackTraceElement.getFileName() == null) {
                    stringBuilder.append("(unknown)");
                } else if (stackTraceElement.getLineNumber() >= 0) {
                    stringBuilder.append(String.format("(%s:%d)", new Object[]{stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber())}));
                } else {
                    stringBuilder.append(String.format("(%s)", new Object[]{stackTraceElement.getFileName()}));
                }
                return stringBuilder.toString();
            }
            throw new IllegalArgumentException("Caller not found");
        }
    }

    /* compiled from: Pattern */
    public static class i extends d {
        public i(int i, int i2) {
            super(i, i2);
        }

        /* Access modifiers changed, original: protected */
        public String b(StackTraceElement stackTraceElement, String str, Level level) {
            return Thread.currentThread().getName();
        }
    }

    public abstract String b(StackTraceElement stackTraceElement, String str, Level level);

    /* Access modifiers changed, original: protected */
    public boolean isCallerNeeded() {
        return false;
    }

    private d(int i, int i2) {
        this.count = i;
        this.length = i2;
    }

    public final String a(StackTraceElement stackTraceElement, String str, Level level) {
        return g.e(b(stackTraceElement, str, level), this.count, this.length);
    }

    public static d kQ(String str) {
        d dVar;
        if (str == null) {
            dVar = null;
        } else {
            try {
                str = new b().kQ(str);
            } catch (Exception e) {
                c.kP("ROOT").a(e, "cannot parse pattern: '%s'", str);
                return new g(0, 0, str);
            }
        }
        return dVar;
    }
}
