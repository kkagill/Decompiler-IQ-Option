package com.jumio.persistence;

import androidx.annotation.Nullable;

public interface PersistenceTarget {
    boolean delete();

    @Nullable
    byte[] readBlob();

    long storeBlob(byte[] bArr);
}
