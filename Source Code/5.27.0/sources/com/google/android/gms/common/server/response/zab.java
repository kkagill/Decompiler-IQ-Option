package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

final class zab implements zaa<Long> {
    zab() {
    }

    public final /* synthetic */ Object zah(FastParser fastParser, BufferedReader bufferedReader) {
        return Long.valueOf(fastParser.zae(bufferedReader));
    }
}
