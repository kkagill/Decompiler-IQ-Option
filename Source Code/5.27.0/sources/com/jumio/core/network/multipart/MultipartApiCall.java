package com.jumio.core.network.multipart;

import android.content.Context;
import android.util.Pair;
import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogUtils;
import com.jumio.commons.utils.IOUtils;
import com.jumio.core.mvp.model.Subscriber;
import com.jumio.core.network.ApiCall;
import com.jumio.core.network.ApiCall.DynamicProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class MultipartApiCall<T> extends ApiCall<T> {
    private static final int TIMEOUT = 90000;
    private final String boundary;
    private final String lineEnd;
    private final String partEnd;
    private final String partHeader;
    private List<Pair<String[], Object>> parts;
    private final String twoHyphens;

    public abstract void prepareData();

    public MultipartApiCall(Context context, DynamicProvider dynamicProvider, Subscriber<T> subscriber) {
        super(context, dynamicProvider, subscriber);
        String str = "--";
        this.twoHyphens = str;
        String str2 = "\r\n";
        this.lineEnd = str2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("+++Android_JMSDK_mobile_");
        stringBuilder.append(System.currentTimeMillis());
        stringBuilder.append("+++");
        this.boundary = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(this.boundary);
        stringBuilder.append(str2);
        this.partHeader = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(this.boundary);
        stringBuilder.append(str);
        stringBuilder.append(str2);
        this.partEnd = stringBuilder.toString();
    }

    public MultipartApiCall(Context context, DynamicProvider dynamicProvider) {
        super(context, dynamicProvider);
        String str = "--";
        this.twoHyphens = str;
        String str2 = "\r\n";
        this.lineEnd = str2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("+++Android_JMSDK_mobile_");
        stringBuilder.append(System.currentTimeMillis());
        stringBuilder.append("+++");
        this.boundary = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(this.boundary);
        stringBuilder.append(str2);
        this.partHeader = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(this.boundary);
        stringBuilder.append(str);
        stringBuilder.append(str2);
        this.partEnd = stringBuilder.toString();
        this.ioTimeout = TIMEOUT;
    }

    /* Access modifiers changed, original: protected */
    public String getBoundary() {
        return this.boundary;
    }

    /* Access modifiers changed, original: protected */
    public int prepareRequest() {
        this.parts = new ArrayList();
        prepareData();
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for (Pair pair : this.parts) {
            String str;
            i += this.partHeader.length();
            stringBuilder.append(this.partHeader);
            String[] strArr = (String[]) pair.first;
            int length = strArr.length;
            int i2 = i;
            i = 0;
            while (true) {
                str = "\r\n";
                if (i >= length) {
                    break;
                }
                String str2 = strArr[i];
                i2 = (i2 + str2.length()) + 2;
                stringBuilder.append(str2);
                stringBuilder.append(str);
                i++;
            }
            i2 += 2;
            stringBuilder.append(str);
            if (pair.second instanceof InputStream) {
                try {
                    i2 += ((InputStream) pair.second).available();
                    stringBuilder.append("<InputStream>");
                } catch (IOException e) {
                    Log.e(this.TAG, e);
                }
            } else if (pair.second instanceof File) {
                i2 = (int) (((long) i2) + ((File) pair.second).length());
                stringBuilder.append("<File>");
            } else if (pair.second instanceof String) {
                i2 += ((String) pair.second).length();
                stringBuilder.append((String) pair.second);
            } else if (pair.second instanceof byte[]) {
                i2 += ((byte[]) pair.second).length;
                stringBuilder.append("<byte[]>");
            }
            i = i2 + 2;
            stringBuilder.append(str);
        }
        i += this.partEnd.length();
        stringBuilder.append(this.partEnd);
        LogUtils.logServerRequest(getClass().getSimpleName(), stringBuilder.toString());
        return i;
    }

    /* Access modifiers changed, original: protected */
    public void addPart(String[] strArr, Object obj) {
        this.parts.add(new Pair(strArr, obj));
    }

    /* Access modifiers changed, original: protected */
    public void fillRequest(OutputStream outputStream) {
        Iterator it = this.parts.iterator();
        while (true) {
            String str = "UTF-8";
            if (it.hasNext()) {
                String str2;
                Pair pair = (Pair) it.next();
                outputStream.write(this.partHeader.getBytes(str));
                String[] strArr = (String[]) pair.first;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    str2 = "\r\n";
                    if (i >= length) {
                        break;
                    }
                    outputStream.write(strArr[i].getBytes(str));
                    outputStream.write(str2.getBytes(str));
                    i++;
                }
                outputStream.write(str2.getBytes(str));
                if (pair.second instanceof InputStream) {
                    IOUtils.copy((InputStream) pair.second, outputStream);
                    IOUtils.closeQuietly((InputStream) pair.second);
                } else if (pair.second instanceof File) {
                    FileInputStream fileInputStream = new FileInputStream((File) pair.second);
                    IOUtils.copy(fileInputStream, outputStream);
                    IOUtils.closeQuietly(fileInputStream);
                } else if (pair.second instanceof String) {
                    outputStream.write(((String) pair.second).getBytes(str));
                } else if (pair.second instanceof byte[]) {
                    outputStream.write((byte[]) pair.second);
                }
                outputStream.write(str2.getBytes(str));
            } else {
                outputStream.write(this.partEnd.getBytes(str));
                return;
            }
        }
    }
}
