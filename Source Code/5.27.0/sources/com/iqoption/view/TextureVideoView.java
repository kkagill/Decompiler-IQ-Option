package com.iqoption.view;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import java.io.IOException;
import java.util.Map;

public class TextureVideoView extends TextureView implements MediaPlayerControl {
    private int bNc;
    private boolean egA;
    private boolean egB;
    OnVideoSizeChangedListener egC;
    OnPreparedListener egD;
    private OnCompletionListener egE;
    private OnInfoListener egF;
    private OnErrorListener egG;
    private OnBufferingUpdateListener egH;
    SurfaceTextureListener egI;
    private int egl;
    private Surface egm;
    private MediaPlayer egn;
    private int ego;
    private int egp;
    private int egq;
    private MediaController egr;
    private OnCompletionListener egs;
    private OnPreparedListener egt;
    private int egu;
    private OnErrorListener egv;
    private OnInfoListener egw;
    private int egx;
    private boolean egy;
    private boolean egz;
    private Map<String, String> mHeaders;
    private Uri mUri;

    public TextureVideoView(Context context) {
        this(context, null);
    }

    public TextureVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextureVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.egl = 0;
        this.bNc = 0;
        this.egm = null;
        this.egn = null;
        this.egB = true;
        this.egC = new OnVideoSizeChangedListener() {
            public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                TextureVideoView.this.egp = mediaPlayer.getVideoWidth();
                TextureVideoView.this.egq = mediaPlayer.getVideoHeight();
                if (TextureVideoView.this.egp != 0 && TextureVideoView.this.egq != 0) {
                    TextureVideoView.this.getSurfaceTexture().setDefaultBufferSize(TextureVideoView.this.egp, TextureVideoView.this.egq);
                    TextureVideoView.this.requestLayout();
                }
            }
        };
        this.egD = new OnPreparedListener() {
            public void onPrepared(MediaPlayer mediaPlayer) {
                TextureVideoView.this.egl = 2;
                TextureVideoView textureVideoView = TextureVideoView.this;
                textureVideoView.egy = textureVideoView.egz = textureVideoView.egA = true;
                if (TextureVideoView.this.egt != null) {
                    TextureVideoView.this.egt.onPrepared(TextureVideoView.this.egn);
                }
                if (TextureVideoView.this.egr != null) {
                    TextureVideoView.this.egr.setEnabled(true);
                }
                TextureVideoView.this.egp = mediaPlayer.getVideoWidth();
                TextureVideoView.this.egq = mediaPlayer.getVideoHeight();
                int f = TextureVideoView.this.egx;
                if (f != 0) {
                    TextureVideoView.this.seekTo(f);
                }
                if (TextureVideoView.this.egp != 0 && TextureVideoView.this.egq != 0) {
                    TextureVideoView.this.getSurfaceTexture().setDefaultBufferSize(TextureVideoView.this.egp, TextureVideoView.this.egq);
                    if (TextureVideoView.this.bNc == 3) {
                        TextureVideoView.this.start();
                        if (TextureVideoView.this.egr != null) {
                            TextureVideoView.this.egr.show();
                        }
                    } else if (!TextureVideoView.this.isPlaying()) {
                        if ((f != 0 || TextureVideoView.this.getCurrentPosition() > 0) && TextureVideoView.this.egr != null) {
                            TextureVideoView.this.egr.show(0);
                        }
                    }
                } else if (TextureVideoView.this.bNc == 3) {
                    TextureVideoView.this.start();
                }
            }
        };
        this.egE = new OnCompletionListener() {
            public void onCompletion(MediaPlayer mediaPlayer) {
                TextureVideoView.this.egl = 5;
                TextureVideoView.this.bNc = 5;
                if (TextureVideoView.this.egr != null) {
                    TextureVideoView.this.egr.hide();
                }
                if (TextureVideoView.this.egs != null) {
                    TextureVideoView.this.egs.onCompletion(TextureVideoView.this.egn);
                }
            }
        };
        this.egF = new OnInfoListener() {
            public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                if (TextureVideoView.this.egw != null) {
                    TextureVideoView.this.egw.onInfo(mediaPlayer, i, i2);
                }
                return true;
            }
        };
        this.egG = new OnErrorListener() {
            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error: ");
                stringBuilder.append(i);
                stringBuilder.append(",");
                stringBuilder.append(i2);
                Log.d("TextureVideoView", stringBuilder.toString());
                TextureVideoView.this.egl = -1;
                TextureVideoView.this.bNc = -1;
                if (TextureVideoView.this.egr != null) {
                    TextureVideoView.this.egr.hide();
                }
                if ((TextureVideoView.this.egv == null || !TextureVideoView.this.egv.onError(TextureVideoView.this.egn, i, i2)) && TextureVideoView.this.getWindowToken() != null) {
                    TextureVideoView.this.getContext().getResources();
                    new Builder(TextureVideoView.this.getContext()).setMessage(i == 200 ? 17039381 : 17039377).setPositiveButton(17039376, new OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            if (TextureVideoView.this.egs != null) {
                                TextureVideoView.this.egs.onCompletion(TextureVideoView.this.egn);
                            }
                        }
                    }).setCancelable(false).show();
                }
                return true;
            }
        };
        this.egH = new OnBufferingUpdateListener() {
            public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
                TextureVideoView.this.egu = i;
            }
        };
        this.egI = new SurfaceTextureListener() {
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                Object obj = 1;
                Object obj2 = TextureVideoView.this.bNc == 3 ? 1 : null;
                if (i <= 0 || i2 <= 0) {
                    obj = null;
                }
                if (TextureVideoView.this.egn != null && obj2 != null && obj != null) {
                    if (TextureVideoView.this.egx != 0) {
                        TextureVideoView textureVideoView = TextureVideoView.this;
                        textureVideoView.seekTo(textureVideoView.egx);
                    }
                    TextureVideoView.this.start();
                }
            }

            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                TextureVideoView.this.egm = new Surface(surfaceTexture);
                TextureVideoView.this.aYr();
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                if (TextureVideoView.this.egm != null) {
                    TextureVideoView.this.egm.release();
                    TextureVideoView.this.egm = null;
                }
                if (TextureVideoView.this.egr != null) {
                    TextureVideoView.this.egr.hide();
                }
                TextureVideoView.this.fq(true);
                return true;
            }
        };
        this.egp = 0;
        this.egq = 0;
        setSurfaceTextureListener(this.egI);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.egl = 0;
        this.bNc = 0;
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(this.egp, i);
        int defaultSize2 = getDefaultSize(this.egq, i2);
        if (this.egp > 0 && this.egq > 0) {
            defaultSize = MeasureSpec.getMode(i);
            i = MeasureSpec.getSize(i);
            defaultSize2 = MeasureSpec.getMode(i2);
            i2 = MeasureSpec.getSize(i2);
            int i3;
            if (defaultSize == 1073741824 && defaultSize2 == 1073741824) {
                defaultSize = this.egp;
                defaultSize2 = defaultSize * i2;
                i3 = this.egq;
                if (defaultSize2 < i * i3) {
                    defaultSize = (defaultSize * i2) / i3;
                    defaultSize2 = i2;
                } else if (defaultSize * i2 > i * i3) {
                    defaultSize2 = (i3 * i) / defaultSize;
                    setMeasuredDimension(i, defaultSize2);
                }
            } else if (defaultSize == 1073741824) {
                defaultSize = (this.egq * i) / this.egp;
                if (defaultSize2 != Integer.MIN_VALUE || defaultSize <= i2) {
                    defaultSize2 = defaultSize;
                    setMeasuredDimension(i, defaultSize2);
                }
            } else if (defaultSize2 == 1073741824) {
                defaultSize2 = (this.egp * i2) / this.egq;
                if (defaultSize != Integer.MIN_VALUE || defaultSize2 <= i) {
                    i = defaultSize2;
                }
            } else {
                i3 = this.egp;
                int i4 = this.egq;
                if (defaultSize2 != Integer.MIN_VALUE || i4 <= i2) {
                    defaultSize2 = i4;
                } else {
                    i3 = (i3 * i2) / i4;
                    defaultSize2 = i2;
                }
                if (defaultSize != Integer.MIN_VALUE || i3 <= i) {
                    i = i3;
                } else {
                    defaultSize2 = (this.egq * i) / this.egp;
                }
                setMeasuredDimension(i, defaultSize2);
            }
            defaultSize2 = i2;
            setMeasuredDimension(i, defaultSize2);
        }
        i = defaultSize;
        setMeasuredDimension(i, defaultSize2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(TextureVideoView.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TextureVideoView.class.getName());
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        setVideoURI(uri, null);
    }

    public void setVideoURI(Uri uri, Map<String, String> map) {
        this.mUri = uri;
        this.mHeaders = map;
        this.egx = 0;
        aYr();
        requestLayout();
        invalidate();
    }

    private void aYr() {
        StringBuilder stringBuilder;
        String str = "Unable to open content: ";
        String str2 = "TextureVideoView";
        if (!(this.mUri == null || this.egm == null)) {
            fq(false);
            if (this.egB) {
                ((AudioManager) getContext().getApplicationContext().getSystemService("audio")).requestAudioFocus(null, 3, 1);
            }
            try {
                this.egn = new MediaPlayer();
                if (this.ego != 0) {
                    this.egn.setAudioSessionId(this.ego);
                } else {
                    this.ego = this.egn.getAudioSessionId();
                }
                this.egn.setOnPreparedListener(this.egD);
                this.egn.setOnVideoSizeChangedListener(this.egC);
                this.egn.setOnCompletionListener(this.egE);
                this.egn.setOnErrorListener(this.egG);
                this.egn.setOnInfoListener(this.egF);
                this.egn.setOnBufferingUpdateListener(this.egH);
                this.egu = 0;
                this.egn.setDataSource(getContext().getApplicationContext(), this.mUri, this.mHeaders);
                this.egn.setSurface(this.egm);
                this.egn.setAudioStreamType(3);
                this.egn.setScreenOnWhilePlaying(true);
                this.egn.prepareAsync();
                this.egl = 1;
                aYs();
            } catch (IOException e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(this.mUri);
                Log.w(str2, stringBuilder.toString(), e);
                this.egl = -1;
                this.bNc = -1;
                this.egG.onError(this.egn, 1, 0);
            } catch (IllegalArgumentException e2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(this.mUri);
                Log.w(str2, stringBuilder.toString(), e2);
                this.egl = -1;
                this.bNc = -1;
                this.egG.onError(this.egn, 1, 0);
            }
        }
    }

    public void setMediaController(MediaController mediaController) {
        MediaController mediaController2 = this.egr;
        if (mediaController2 != null) {
            mediaController2.hide();
        }
        this.egr = mediaController;
        aYs();
    }

    private void aYs() {
        if (this.egn != null) {
            MediaController mediaController = this.egr;
            if (mediaController != null) {
                mediaController.setMediaPlayer(this);
                this.egr.setAnchorView(getParent() instanceof View ? (View) getParent() : this);
                this.egr.setEnabled(aYu());
            }
        }
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.egt = onPreparedListener;
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        this.egs = onCompletionListener;
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.egv = onErrorListener;
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        this.egw = onInfoListener;
    }

    private void fq(boolean z) {
        MediaPlayer mediaPlayer = this.egn;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.egn.release();
            this.egn = null;
            this.egl = 0;
            if (z) {
                this.bNc = 0;
            }
            if (this.egB) {
                ((AudioManager) getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(null);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (aYu() && this.egr != null) {
            aYt();
        }
        return false;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (aYu() && this.egr != null) {
            aYt();
        }
        return false;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object obj = (i == 4 || i == 24 || i == 25 || i == 164 || i == 82 || i == 5 || i == 6) ? null : 1;
        if (!(!aYu() || obj == null || this.egr == null)) {
            if (i == 79 || i == 85) {
                if (this.egn.isPlaying()) {
                    pause();
                    this.egr.show();
                } else {
                    start();
                    this.egr.hide();
                }
                return true;
            } else if (i == 126) {
                if (!this.egn.isPlaying()) {
                    start();
                    this.egr.hide();
                }
                return true;
            } else if (i == 86 || i == 127) {
                if (this.egn.isPlaying()) {
                    pause();
                    this.egr.show();
                }
                return true;
            } else {
                aYt();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void aYt() {
        if (this.egr.isShowing()) {
            this.egr.hide();
        } else {
            this.egr.show();
        }
    }

    public void start() {
        if (aYu()) {
            this.egn.start();
            this.egl = 3;
        }
        this.bNc = 3;
    }

    public void pause() {
        if (aYu() && this.egn.isPlaying()) {
            this.egn.pause();
            this.egl = 4;
        }
        this.bNc = 4;
    }

    public int getDuration() {
        return aYu() ? this.egn.getDuration() : -1;
    }

    public int getCurrentPosition() {
        return aYu() ? this.egn.getCurrentPosition() : 0;
    }

    public void seekTo(int i) {
        if (aYu()) {
            this.egn.seekTo(i);
            this.egx = 0;
            return;
        }
        this.egx = i;
    }

    public boolean isPlaying() {
        return aYu() && this.egn.isPlaying();
    }

    public int getBufferPercentage() {
        return this.egn != null ? this.egu : 0;
    }

    private boolean aYu() {
        if (this.egn != null) {
            int i = this.egl;
            if (!(i == -1 || i == 0 || i == 1)) {
                return true;
            }
        }
        return false;
    }

    public boolean canPause() {
        return this.egy;
    }

    public boolean canSeekBackward() {
        return this.egz;
    }

    public boolean canSeekForward() {
        return this.egA;
    }

    public int getAudioSessionId() {
        if (this.ego == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.ego = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.ego;
    }

    public void setShouldRequestAudioFocus(boolean z) {
        this.egB = z;
    }
}
