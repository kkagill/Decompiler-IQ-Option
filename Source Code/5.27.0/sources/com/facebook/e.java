package com.facebook;

/* compiled from: FacebookCallback */
public interface e<RESULT> {
    void b(FacebookException facebookException);

    void onCancel();

    void onSuccess(RESULT result);
}
