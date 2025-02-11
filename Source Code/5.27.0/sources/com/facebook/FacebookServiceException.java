package com.facebook;

public class FacebookServiceException extends FacebookException {
    private static final long serialVersionUID = 1;
    private final FacebookRequestError error;

    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.error = facebookRequestError;
    }

    public final FacebookRequestError hh() {
        return this.error;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{FacebookServiceException: ");
        stringBuilder.append("httpResponseCode: ");
        stringBuilder.append(this.error.gL());
        stringBuilder.append(", facebookErrorCode: ");
        stringBuilder.append(this.error.getErrorCode());
        stringBuilder.append(", facebookErrorType: ");
        stringBuilder.append(this.error.gN());
        stringBuilder.append(", message: ");
        stringBuilder.append(this.error.getErrorMessage());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
