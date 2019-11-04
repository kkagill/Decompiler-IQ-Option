package com.iqoption.microservice.authorization;

import androidx.annotation.Nullable;

public class AuthException extends Exception {
    @Nullable
    public String email;
    @Nullable
    public String errorMessage;
    public boolean isTwoStepAuthScreen;
    @Nullable
    public String password;
    @Nullable
    public String phoneMask;
    public int status;

    public AuthException(int i) {
        this.status = i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AuthException{errorMessage='");
        stringBuilder.append(this.errorMessage);
        stringBuilder.append('\'');
        stringBuilder.append(", status=");
        stringBuilder.append(this.status);
        stringBuilder.append(", phoneMask='");
        stringBuilder.append(this.phoneMask);
        stringBuilder.append('\'');
        stringBuilder.append(", isTwoStepAuthScreen=");
        stringBuilder.append(this.isTwoStepAuthScreen);
        stringBuilder.append(", ");
        stringBuilder.append(this.email);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
