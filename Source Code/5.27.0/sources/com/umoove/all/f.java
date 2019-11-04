package com.umoove.all;

import android.graphics.PointF;

/* compiled from: UMHeadData */
public class f {
    public PointF eIY = new PointF();
    public PointF eIZ = new PointF();
    public long eJs = -1;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append("Head Position [");
        stringBuilder.append(this.eIY.x);
        String str = ",";
        stringBuilder.append(str);
        stringBuilder.append(this.eIY.y);
        String str2 = "]\r\n";
        stringBuilder.append(str2);
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("Head Movements [");
        stringBuilder3.append(this.eIZ.x);
        stringBuilder3.append(str);
        stringBuilder3.append(this.eIZ.y);
        stringBuilder3.append(str2);
        return stringBuilder3.toString();
    }
}
