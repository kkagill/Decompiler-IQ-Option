package com.pro100svitlo.creditCardNfcReader.parser.apdu.a;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: Data */
public @interface c {
    String bgX() default "yyyyMMdd";

    int bgY() default 0;

    int bgZ();

    boolean bha() default false;

    String bhb();

    int size();
}
