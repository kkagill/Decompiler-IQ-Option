package com.iqoption.dto.entity;

import com.google.gson.annotations.SerializedName;
import com.iqoption.config.Platform;
import com.iqoption.core.d;

public class Version {
    @SerializedName("android")
    private Data android;
    @SerializedName("androidx")
    private Data androidx;
    @SerializedName("8x.android")
    private Data xxtrade;

    /* renamed from: com.iqoption.dto.entity.Version$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$iqoption$config$Platform = new int[Platform.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.iqoption.config.Platform.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$iqoption$config$Platform = r0;
            r0 = $SwitchMap$com$iqoption$config$Platform;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.iqoption.config.Platform.ANDROID_X;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$iqoption$config$Platform;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.iqoption.config.Platform.ANDROID_8X_TRADE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iqoption.dto.entity.Version$AnonymousClass1.<clinit>():void");
        }
    }

    public class Data {
        @SerializedName("current")
        private Integer current;
        @SerializedName("min")
        private Integer min;
        @SerializedName("update_link")
        private String path;

        public Integer getCurrent() {
            Integer num = this.current;
            return Integer.valueOf(num == null ? -1 : num.intValue());
        }

        public void setCurrent(Integer num) {
            this.current = num;
        }

        public Integer getMin() {
            Integer num = this.min;
            return Integer.valueOf(num == null ? -1 : num.intValue());
        }

        public void setMin(Integer num) {
            this.min = num;
        }

        public String getPath() {
            return this.path;
        }

        public void setPath(String str) {
            this.path = str;
        }
    }

    public Data getData() {
        int i = AnonymousClass1.$SwitchMap$com$iqoption$config$Platform[d.Un().Dx().ordinal()];
        if (i == 1) {
            return this.androidx;
        }
        if (i != 2) {
            return this.android;
        }
        return this.xxtrade;
    }
}
