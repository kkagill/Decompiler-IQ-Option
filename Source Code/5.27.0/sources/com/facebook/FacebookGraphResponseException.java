package com.facebook;

public class FacebookGraphResponseException extends FacebookException {
    private final j graphResponse;

    public FacebookGraphResponseException(j jVar, String str) {
        super(str);
        this.graphResponse = jVar;
    }

    public final String toString() {
        j jVar = this.graphResponse;
        FacebookRequestError hG = jVar != null ? jVar.hG() : null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            stringBuilder.append(message);
            stringBuilder.append(" ");
        }
        if (hG != null) {
            stringBuilder.append("httpResponseCode: ");
            stringBuilder.append(hG.gL());
            stringBuilder.append(", facebookErrorCode: ");
            stringBuilder.append(hG.getErrorCode());
            stringBuilder.append(", facebookErrorType: ");
            stringBuilder.append(hG.gN());
            stringBuilder.append(", message: ");
            stringBuilder.append(hG.getErrorMessage());
            stringBuilder.append("}");
        }
        return stringBuilder.toString();
    }
}
