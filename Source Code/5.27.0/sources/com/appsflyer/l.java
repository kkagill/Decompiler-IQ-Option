package com.appsflyer;

final class l {
    private boolean kH;
    private String kZ;
    private e mT;

    enum e {
        GOOGLE(0),
        AMAZON(1);
        
        /* renamed from: ˋ */
        private int f13;

        private e(int i) {
            this.f13 = i;
        }

        public final String toString() {
            return String.valueOf(this.f13);
        }
    }

    l(e eVar, String str, boolean z) {
        this.mT = eVar;
        this.kZ = str;
        this.kH = z;
    }

    /* Access modifiers changed, original: final */
    public final String dG() {
        return this.kZ;
    }

    /* Access modifiers changed, original: final */
    public final boolean dL() {
        return this.kH;
    }

    public final String toString() {
        return String.format("%s,%s", new Object[]{this.kZ, Boolean.valueOf(this.kH)});
    }
}
