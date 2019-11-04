package com.iqoption.welcome;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, bng = {"Lcom/iqoption/welcome/AuthDone;", "", "(Ljava/lang/String;I)V", "LOGGED_IN", "REGISTERED", "RECOVERY_PASSWORD", "CHANGE_PASSWORD", "ANONYM_REGISTERED", "welcome_release"})
/* compiled from: WelcomeStateViewModel.kt */
public enum AuthDone {
    LOGGED_IN,
    REGISTERED,
    RECOVERY_PASSWORD,
    CHANGE_PASSWORD,
    ANONYM_REGISTERED
}
