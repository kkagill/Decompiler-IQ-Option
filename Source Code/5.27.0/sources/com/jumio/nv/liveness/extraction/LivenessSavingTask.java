package com.jumio.nv.liveness.extraction;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Rect;
import com.google.android.gms.vision.Frame;
import com.jumio.commons.camera.CameraUtils;
import com.jumio.commons.camera.PreviewProperties;
import com.jumio.commons.log.Log;
import com.jumio.core.environment.Environment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class LivenessSavingTask extends Thread {
    private boolean active;
    private LinkedList<String> cache = new LinkedList();
    private int counter;
    private Rect extractionArea;
    private File folder;
    private boolean isPortrait;
    private int maxFrames;
    private int numberOfFrames;
    private PreviewProperties previewProperties;
    private Queue<Frame> queue = new ConcurrentLinkedQueue();
    private long timestamp;

    public LivenessSavingTask(Context context, int i, int i2) {
        this.folder = Environment.getDataDirectory(context);
        this.numberOfFrames = i;
        this.maxFrames = i2;
        reset();
    }

    public void init(PreviewProperties previewProperties, Rect rect, boolean z) {
        this.previewProperties = previewProperties;
        this.extractionArea = rect;
        this.isPortrait = z;
    }

    public void reset() {
        this.queue.clear();
        this.cache.clear();
        System.gc();
        this.counter = 0;
    }

    public void add(Frame frame) {
        try {
            if (!(this.numberOfFrames == 0 || this.previewProperties == null)) {
                if (this.extractionArea != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!isInterrupted() && currentTimeMillis - this.timestamp >= 500) {
                        if (isActive()) {
                            this.timestamp = currentTimeMillis;
                            this.queue.add(frame);
                        }
                    }
                }
            }
        } catch (OutOfMemoryError e) {
            this.queue.clear();
            Log.printStackTrace(e);
            System.gc();
        }
    }

    public void addSync(Frame frame) {
        try {
            if (!(this.numberOfFrames == 0 || this.previewProperties == null)) {
                if (this.extractionArea != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!isInterrupted() && currentTimeMillis - this.timestamp >= 500) {
                        if (isActive()) {
                            this.timestamp = currentTimeMillis;
                            dump(frame);
                        }
                    }
                }
            }
        } catch (OutOfMemoryError e) {
            Log.printStackTrace(e);
            System.gc();
        }
    }

    public String[] finish() {
        int i = 0;
        setActive(false);
        int size = this.cache.size();
        int i2 = this.numberOfFrames;
        String[] strArr;
        if (size <= i2) {
            strArr = new String[this.cache.size()];
            while (i < this.cache.size()) {
                strArr[(this.cache.size() - 1) - i] = (String) this.cache.get(i);
                i++;
            }
            return strArr;
        }
        int i3;
        strArr = new String[i2];
        int i4 = i2 / 2;
        int i5 = i2 - 1;
        i2 = 0;
        while (i2 < i4) {
            i3 = i5 - 1;
            strArr[i5] = (String) this.cache.get(i2);
            i2++;
            i5 = i3;
        }
        i2 = this.numberOfFrames;
        i4 = (i2 / 2) + (i2 % 2);
        i2 = ((this.cache.size() - 1) - i4) / i4;
        i5 = this.cache.size() - 1;
        while (i5 >= i4 && i < i4) {
            i3 = i + 1;
            strArr[i] = (String) this.cache.get(i5);
            i5 -= i2;
            i = i3;
        }
        return strArr;
    }

    public void run() {
        while (!isInterrupted()) {
            dump((Frame) this.queue.poll());
        }
        reset();
    }

    private void dump(Frame frame) {
        if (frame != null) {
            try {
                Object[] objArr = new Object[1];
                int i = this.counter;
                this.counter = i + 1;
                objArr[0] = Integer.valueOf(i);
                String format = String.format("tmp_%04d", objArr);
                dumpBitmap(CameraUtils.yuv2bitmap(frame.getGrayscaleImageData().array(), this.isPortrait, this.previewProperties, this.extractionArea, 640), this.folder, format, CompressFormat.JPEG, 70);
                LinkedList linkedList = this.cache;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.folder.getAbsolutePath());
                stringBuilder.append("/");
                stringBuilder.append(format);
                linkedList.addFirst(stringBuilder.toString());
                if (this.cache.size() > this.maxFrames) {
                    new File(this.folder, (String) this.cache.removeLast()).delete();
                }
                System.gc();
            } catch (Exception | OutOfMemoryError e) {
                Log.printStackTrace(e);
            }
        }
    }

    private void dumpBitmap(Bitmap bitmap, File file, String str, CompressFormat compressFormat, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i, byteArrayOutputStream);
        dumpRawBuffer(byteArrayOutputStream.toByteArray(), file, str, false);
    }

    private void dumpRawBuffer(byte[] bArr, File file, String str, boolean z) {
        FileOutputStream fileOutputStream;
        try {
            File file2 = new File(file, str);
            if (!file2.exists()) {
                file2.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file2, z);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            Log.printStackTrace(e);
        } catch (IOException e2) {
            Log.printStackTrace(e2);
        } catch (Throwable th) {
            fileOutputStream.close();
        }
    }

    public synchronized boolean isActive() {
        return this.active;
    }

    public synchronized void setActive(boolean z) {
        this.active = z;
    }
}
