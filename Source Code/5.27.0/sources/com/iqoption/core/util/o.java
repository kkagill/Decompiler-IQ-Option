package com.iqoption.core.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.i;

@Target({ElementType.TYPE})
@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, bng = {"Lcom/iqoption/core/util/GsonNullCheck;", "", "core_release"})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: KotlinGsonAdapterFactory.kt */
public @interface o {
}
