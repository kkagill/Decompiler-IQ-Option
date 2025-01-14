package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;

public interface Downloader {

    public static class Response {
        final Bitmap bitmap;
        final boolean cached;
        final long contentLength;
        final InputStream stream;

        @Deprecated
        public Response(@NonNull Bitmap bitmap, boolean z) {
            if (bitmap != null) {
                this.stream = null;
                this.bitmap = bitmap;
                this.cached = z;
                this.contentLength = -1;
                return;
            }
            throw new IllegalArgumentException("Bitmap may not be null.");
        }

        @Deprecated
        public Response(@NonNull InputStream inputStream, boolean z) {
            this(inputStream, z, -1);
        }

        @Deprecated
        public Response(@NonNull Bitmap bitmap, boolean z, long j) {
            this(bitmap, z);
        }

        public Response(@NonNull InputStream inputStream, boolean z, long j) {
            if (inputStream != null) {
                this.stream = inputStream;
                this.bitmap = null;
                this.cached = z;
                this.contentLength = j;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }

        @Nullable
        public InputStream getInputStream() {
            return this.stream;
        }

        @Deprecated
        @Nullable
        public Bitmap getBitmap() {
            return this.bitmap;
        }

        public long getContentLength() {
            return this.contentLength;
        }
    }

    public static class ResponseException extends IOException {
        final boolean localCacheOnly;
        final int responseCode;

        public ResponseException(String str, int i, int i2) {
            super(str);
            this.localCacheOnly = NetworkPolicy.isOfflineOnly(i);
            this.responseCode = i2;
        }
    }

    @Nullable
    Response load(@NonNull Uri uri, int i);

    void shutdown();
}
