package com.iqoption.kyc.steps;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, bng = {"Lcom/iqoption/kyc/steps/ProgressPosition;", "", "(Ljava/lang/String;I)V", "FIRST", "MIDDLE", "LAST", "kyc_release"})
/* compiled from: StepProgressView.kt */
public enum ProgressPosition {
    FIRST,
    MIDDLE,
    LAST
}