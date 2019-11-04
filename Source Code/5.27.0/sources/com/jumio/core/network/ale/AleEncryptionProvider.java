package com.jumio.core.network.ale;

import androidx.annotation.Nullable;
import com.jumio.alejwt.swig.ALECore;
import com.jumio.alejwt.swig.ALEHeader;
import com.jumio.alejwt.swig.ALEOutputStream;
import com.jumio.alejwt.swig.ALERequest;
import com.jumio.commons.log.Log;
import com.jumio.core.network.EncryptionProvider;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import javax.net.ssl.SSLException;

public class AleEncryptionProvider implements EncryptionProvider {
    static final String TAG = "AleEncryptionProvider";
    private ALERequest aleRequest;
    private ALECore mAleCore;
    private final String mCredentials;

    public AleEncryptionProvider(ALECore aLECore, String str) {
        this.mCredentials = str;
        this.mAleCore = aLECore;
    }

    public OutputStream createRequest(OutputStream outputStream, int i, @Nullable String str) {
        try {
            this.aleRequest = this.mAleCore.createRequest();
            Log.d(TAG, "encrypting plaintext");
            ALEHeader aLEHeader = new ALEHeader();
            String str2 = "Content-Type";
            if (str != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("multipart/form-data; boundary=");
                stringBuilder.append(str);
                aLEHeader.add(str2, stringBuilder.toString());
            } else {
                aLEHeader.add(str2, "application/json");
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Basic ");
            stringBuilder2.append(this.mCredentials);
            aLEHeader.add("Authorization", stringBuilder2.toString());
            return new ALEOutputStream(new BufferedOutputStream(outputStream), this.aleRequest, aLEHeader, i);
        } catch (Exception e) {
            throw new SSLException(e.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bf A:{Catch:{ all -> 0x00d9 }} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008b A:{Catch:{ all -> 0x00d9 }} */
    public java.lang.String getResponse(java.io.InputStream r6) {
        /*
        r5 = this;
        r0 = "Network/ALE";
        r1 = "AleEncryptionProvider";
        r2 = "decrypting response stream";
        com.jumio.commons.log.Log.d(r1, r2);
        r1 = new com.jumio.alejwt.swig.ALEInputStream;
        r2 = new java.io.BufferedInputStream;
        r2.<init>(r6);
        r6 = r5.aleRequest;
        r1.<init>(r2, r6);
        r6 = 0;
        r2 = r5.readPlainInput(r1);	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r3.<init>();	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r4 = "Response ";
        r3.append(r4);	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r4 = r5.aleRequest;	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r4 = r4.isVerified();	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        if (r4 == 0) goto L_0x002f;
    L_0x002c:
        r4 = "valid";
        goto L_0x0031;
    L_0x002f:
        r4 = "invalid";
    L_0x0031:
        r3.append(r4);	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r3 = r3.toString();	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        com.jumio.commons.log.Log.v(r0, r3);	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r3.<init>();	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r4 = "Errorcode ";
        r3.append(r4);	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r4 = r5.aleRequest;	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r4 = r4.getErrorCode();	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r3.append(r4);	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r3 = r3.toString();	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        com.jumio.commons.log.Log.v(r0, r3);	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r3.<init>();	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r4 = "KeyUpdate ";
        r3.append(r4);	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r4 = r5.aleRequest;	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r4 = r4.isKeyUpdate();	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        if (r4 == 0) goto L_0x006a;
    L_0x0067:
        r4 = "true";
        goto L_0x006c;
    L_0x006a:
        r4 = "false";
    L_0x006c:
        r3.append(r4);	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        r3 = r3.toString();	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        com.jumio.commons.log.Log.v(r0, r3);	 Catch:{ IOException -> 0x007f, all -> 0x007a }
        com.jumio.commons.utils.IOUtils.closeQuietly(r1);
        goto L_0x0083;
    L_0x007a:
        r6 = move-exception;
        com.jumio.commons.utils.IOUtils.closeQuietly(r1);
        throw r6;
    L_0x007f:
        com.jumio.commons.utils.IOUtils.closeQuietly(r1);
        r2 = r6;
    L_0x0083:
        r0 = r5.aleRequest;	 Catch:{ all -> 0x00d9 }
        r0 = r0.isVerified();	 Catch:{ all -> 0x00d9 }
        if (r0 != 0) goto L_0x00bf;
    L_0x008b:
        r0 = r5.aleRequest;	 Catch:{ all -> 0x00d9 }
        r0 = r0.getErrorCode();	 Catch:{ all -> 0x00d9 }
        if (r0 == 0) goto L_0x00b6;
    L_0x0093:
        r0 = new com.jumio.commons.remote.exception.UnexpectedResponseException;	 Catch:{ all -> 0x00d9 }
        r1 = r5.aleRequest;	 Catch:{ all -> 0x00d9 }
        r1 = r1.getErrorCode();	 Catch:{ all -> 0x00d9 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d9 }
        r2.<init>();	 Catch:{ all -> 0x00d9 }
        r3 = "Response returned ";
        r2.append(r3);	 Catch:{ all -> 0x00d9 }
        r3 = r5.aleRequest;	 Catch:{ all -> 0x00d9 }
        r3 = r3.getErrorCode();	 Catch:{ all -> 0x00d9 }
        r2.append(r3);	 Catch:{ all -> 0x00d9 }
        r2 = r2.toString();	 Catch:{ all -> 0x00d9 }
        r0.<init>(r1, r2);	 Catch:{ all -> 0x00d9 }
        throw r0;	 Catch:{ all -> 0x00d9 }
    L_0x00b6:
        r0 = new com.jumio.commons.remote.exception.UnexpectedResponseException;	 Catch:{ all -> 0x00d9 }
        r1 = 0;
        r2 = "Response not verified";
        r0.<init>(r1, r2);	 Catch:{ all -> 0x00d9 }
        throw r0;	 Catch:{ all -> 0x00d9 }
    L_0x00bf:
        r0 = r5.aleRequest;	 Catch:{ all -> 0x00d9 }
        r0 = r0.isKeyUpdate();	 Catch:{ all -> 0x00d9 }
        if (r0 != 0) goto L_0x00d1;
    L_0x00c7:
        r0 = r5.mAleCore;
        r1 = r5.aleRequest;
        r0.destroyRequest(r1);
        r5.aleRequest = r6;
        return r2;
    L_0x00d1:
        r0 = new com.jumio.core.network.ale.AleKeyUpdateException;	 Catch:{ all -> 0x00d9 }
        r1 = "keyupdate - re-execute call!";
        r0.<init>(r1);	 Catch:{ all -> 0x00d9 }
        throw r0;	 Catch:{ all -> 0x00d9 }
    L_0x00d9:
        r0 = move-exception;
        r1 = r5.mAleCore;
        r2 = r5.aleRequest;
        r1.destroyRequest(r2);
        r5.aleRequest = r6;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jumio.core.network.ale.AleEncryptionProvider.getResponse(java.io.InputStream):java.lang.String");
    }

    /* Access modifiers changed, original: protected */
    public String readPlainInput(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        Object stringWriter = new StringWriter();
        char[] cArr = new char[1024];
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read == -1) {
                    break;
                }
                stringWriter.write(cArr, 0, read);
            }
            return stringWriter.toString();
        } finally {
            inputStream.close();
        }
    }
}
