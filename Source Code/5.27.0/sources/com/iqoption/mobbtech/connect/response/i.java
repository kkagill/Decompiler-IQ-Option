package com.iqoption.mobbtech.connect.response;

import com.google.common.base.e;
import com.google.gson.annotations.SerializedName;

/* compiled from: RegulationResponse */
public class i extends j {
    @SerializedName("result")
    public a dJa;

    /* compiled from: RegulationResponse */
    public static class a {
        @SerializedName("cysec")
        public Boolean dJb;

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Result{cysec=");
            stringBuilder.append(this.dJb);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public static i eW(boolean z) {
        i iVar = new i();
        iVar.dJa = new a();
        iVar.dJa.dJb = Boolean.valueOf(z);
        return iVar;
    }

    public String toString() {
        return e.aj(this).d("super", super.toString()).d("result", this.dJa).toString();
    }
}
