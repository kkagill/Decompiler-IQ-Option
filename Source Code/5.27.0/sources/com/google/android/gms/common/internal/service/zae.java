package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;

final class zae extends zah {
    zae(zad zad, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void doExecute(AnyClient anyClient) {
        ((zal) ((zai) anyClient).getService()).zaa(new zaf(this));
    }
}
