package com.iqoption.mobbtech.connect.response;

import com.google.common.base.e;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* compiled from: SimpleResponseArrayMessage */
public class j extends k {
    @SerializedName("message")
    public List<String> message;

    public String toString() {
        return e.aj(this).d("super", super.toString()).d("message", getMessage()).toString();
    }

    public String getMessage() {
        List list = this.message;
        return (list == null || list.isEmpty()) ? null : (String) this.message.get(0);
    }
}
