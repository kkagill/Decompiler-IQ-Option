package com.iqoption.core.microservices.billing.response.extraparams;

import android.os.Parcelable;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\tJ\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H&¨\u0006\n"}, bng = {"Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty;", "Landroid/os/Parcelable;", "getHint", "", "getTitle", "getType", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty$PropertyType;", "getTypeName", "validationErrorMessage", "PropertyType", "core_release"})
/* compiled from: ExtraParamProperty.kt */
public interface ExtraParamProperty extends Parcelable {

    @i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamProperty$PropertyType;", "", "(Ljava/lang/String;I)V", "enumType", "stringType", "integerType", "selectType", "core_release"})
    /* compiled from: ExtraParamProperty.kt */
    public enum PropertyType {
        enumType,
        stringType,
        integerType,
        selectType
    }

    PropertyType aaK();

    String aaL();

    String getHint();

    String getTitle();
}
