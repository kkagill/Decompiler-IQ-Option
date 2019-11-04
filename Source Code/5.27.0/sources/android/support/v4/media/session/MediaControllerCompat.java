package android.support.v4.media.session;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback.Stub;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import android.view.KeyEvent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.app.BundleCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class MediaControllerCompat {
    private final MediaControllerImpl aD;
    private final HashSet<Callback> aE = new HashSet();
    private final Token mToken;

    public static abstract class Callback implements DeathRecipient {
        final Object aF;
        MessageHandler aG;
        IMediaControllerCallback aH;

        private class MessageHandler extends Handler {
            boolean aI;
            final /* synthetic */ Callback aJ;

            public void handleMessage(Message message) {
                if (this.aI) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.d(data);
                            this.aJ.onSessionEvent((String) message.obj, data);
                            break;
                        case 2:
                            this.aJ.a((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            this.aJ.a((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            this.aJ.a((PlaybackInfo) message.obj);
                            break;
                        case 5:
                            this.aJ.onQueueChanged((List) message.obj);
                            break;
                        case 6:
                            this.aJ.onQueueTitleChanged((CharSequence) message.obj);
                            break;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.d(bundle);
                            this.aJ.onExtrasChanged(bundle);
                            break;
                        case 8:
                            this.aJ.onSessionDestroyed();
                            break;
                        case 9:
                            this.aJ.i(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            this.aJ.l(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            this.aJ.j(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            this.aJ.x();
                            break;
                    }
                }
            }
        }

        private static class StubApi21 implements android.support.v4.media.session.MediaControllerCompatApi21.Callback {
            private final WeakReference<Callback> aK;

            StubApi21(Callback callback) {
                this.aK = new WeakReference(callback);
            }

            public void onSessionDestroyed() {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.onSessionDestroyed();
                }
            }

            public void onSessionEvent(String str, Bundle bundle) {
                Callback callback = (Callback) this.aK.get();
                if (callback == null) {
                    return;
                }
                if (callback.aH == null || VERSION.SDK_INT >= 23) {
                    callback.onSessionEvent(str, bundle);
                }
            }

            public void s(Object obj) {
                Callback callback = (Callback) this.aK.get();
                if (callback != null && callback.aH == null) {
                    callback.a(PlaybackStateCompat.A(obj));
                }
            }

            public void t(Object obj) {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.a(MediaMetadataCompat.r(obj));
                }
            }

            public void onQueueChanged(List<?> list) {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.onQueueChanged(QueueItem.c(list));
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.onQueueTitleChanged(charSequence);
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.onExtrasChanged(bundle);
                }
            }

            public void a(int i, int i2, int i3, int i4, int i5) {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.a(new PlaybackInfo(i, i2, i3, i4, i5));
                }
            }
        }

        private static class StubCompat extends Stub {
            private final WeakReference<Callback> aK;

            public void k(boolean z) {
            }

            StubCompat(Callback callback) {
                this.aK = new WeakReference(callback);
            }

            public void a(String str, Bundle bundle) {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.a(1, str, bundle);
                }
            }

            public void onSessionDestroyed() {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.a(8, null, null);
                }
            }

            public void a(PlaybackStateCompat playbackStateCompat) {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.a(2, playbackStateCompat, null);
                }
            }

            public void a(MediaMetadataCompat mediaMetadataCompat) {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.a(3, mediaMetadataCompat, null);
                }
            }

            public void onQueueChanged(List<QueueItem> list) {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.a(5, list, null);
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.a(6, charSequence, null);
                }
            }

            public void l(boolean z) {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.a(11, Boolean.valueOf(z), null);
                }
            }

            public void i(int i) {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.a(9, Integer.valueOf(i), null);
                }
            }

            public void j(int i) {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.a(12, Integer.valueOf(i), null);
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.a(7, bundle, null);
                }
            }

            public void a(ParcelableVolumeInfo parcelableVolumeInfo) {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    Object obj;
                    if (parcelableVolumeInfo != null) {
                        PlaybackInfo playbackInfo = new PlaybackInfo(parcelableVolumeInfo.bc, parcelableVolumeInfo.bd, parcelableVolumeInfo.be, parcelableVolumeInfo.bf, parcelableVolumeInfo.bg);
                    } else {
                        obj = null;
                    }
                    callback.a(4, obj, null);
                }
            }

            public void x() {
                Callback callback = (Callback) this.aK.get();
                if (callback != null) {
                    callback.a(13, null, null);
                }
            }
        }

        public void a(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void a(PlaybackInfo playbackInfo) {
        }

        public void a(PlaybackStateCompat playbackStateCompat) {
        }

        public void i(int i) {
        }

        public void j(int i) {
        }

        public void l(boolean z) {
        }

        public void onExtrasChanged(Bundle bundle) {
        }

        public void onQueueChanged(List<QueueItem> list) {
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
        }

        public void onSessionDestroyed() {
        }

        public void onSessionEvent(String str, Bundle bundle) {
        }

        public void x() {
        }

        public Callback() {
            if (VERSION.SDK_INT >= 21) {
                this.aF = MediaControllerCompatApi21.a(new StubApi21(this));
                return;
            }
            StubCompat stubCompat = new StubCompat(this);
            this.aH = stubCompat;
            this.aF = stubCompat;
        }

        /* Access modifiers changed, original: 0000 */
        public void a(int i, Object obj, Bundle bundle) {
            MessageHandler messageHandler = this.aG;
            if (messageHandler != null) {
                Message obtainMessage = messageHandler.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }
    }

    interface MediaControllerImpl {
        boolean dispatchMediaButtonEvent(KeyEvent keyEvent);
    }

    public static final class PlaybackInfo {
        private final int aR;
        private final int aS;
        private final int aT;
        private final int mCurrentVolume;
        private final int mMaxVolume;

        PlaybackInfo(int i, int i2, int i3, int i4, int i5) {
            this.aR = i;
            this.aS = i2;
            this.aT = i3;
            this.mMaxVolume = i4;
            this.mCurrentVolume = i5;
        }
    }

    @RequiresApi(21)
    static class MediaControllerImplApi21 implements MediaControllerImpl {
        protected final Object aL;
        @GuardedBy("mLock")
        private final List<Callback> aM = new ArrayList();
        private HashMap<Callback, ExtraCallback> aN = new HashMap();
        final Token aO;
        final Object mLock = new Object();

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> aP;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.aP = new WeakReference(mediaControllerImplApi21);
            }

            /* Access modifiers changed, original: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.aP.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.mLock) {
                        mediaControllerImplApi21.aO.a(IMediaSession.Stub.b(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.aO.e(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                        mediaControllerImplApi21.J();
                    }
                }
            }
        }

        private static class ExtraCallback extends StubCompat {
            ExtraCallback(Callback callback) {
                super(callback);
            }

            public void onSessionDestroyed() {
                throw new AssertionError();
            }

            public void a(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            public void onQueueChanged(List<QueueItem> list) {
                throw new AssertionError();
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                throw new AssertionError();
            }

            public void onExtrasChanged(Bundle bundle) {
                throw new AssertionError();
            }

            public void a(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, Token token) {
            this.aO = token;
            this.aL = MediaControllerCompatApi21.a(context, this.aO.L());
            if (this.aL == null) {
                throw new RemoteException();
            } else if (this.aO.M() == null) {
                I();
            }
        }

        public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
            return MediaControllerCompatApi21.a(this.aL, keyEvent);
        }

        public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaControllerCompatApi21.a(this.aL, str, bundle, resultReceiver);
        }

        private void I() {
            sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        /* Access modifiers changed, original: 0000 */
        @GuardedBy("mLock")
        public void J() {
            if (this.aO.M() != null) {
                for (Callback callback : this.aM) {
                    IMediaControllerCallback extraCallback = new ExtraCallback(callback);
                    this.aN.put(callback, extraCallback);
                    callback.aH = extraCallback;
                    try {
                        this.aO.M().a(extraCallback);
                        callback.a(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.aM.clear();
            }
        }
    }

    static class MediaControllerImplBase implements MediaControllerImpl {
        private IMediaSession aQ;

        public MediaControllerImplBase(Token token) {
            this.aQ = IMediaSession.Stub.b((IBinder) token.L());
        }

        public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.aQ.a(keyEvent);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", e);
                }
                return false;
            }
            throw new IllegalArgumentException("event may not be null.");
        }
    }

    @RequiresApi(23)
    static class MediaControllerImplApi23 extends MediaControllerImplApi21 {
        public MediaControllerImplApi23(Context context, Token token) {
            super(context, token);
        }
    }

    @RequiresApi(24)
    static class MediaControllerImplApi24 extends MediaControllerImplApi23 {
        public MediaControllerImplApi24(Context context, Token token) {
            super(context, token);
        }
    }

    public MediaControllerCompat(Context context, @NonNull Token token) {
        if (token != null) {
            this.mToken = token;
            if (VERSION.SDK_INT >= 24) {
                this.aD = new MediaControllerImplApi24(context, token);
                return;
            } else if (VERSION.SDK_INT >= 23) {
                this.aD = new MediaControllerImplApi23(context, token);
                return;
            } else if (VERSION.SDK_INT >= 21) {
                this.aD = new MediaControllerImplApi21(context, token);
                return;
            } else {
                this.aD = new MediaControllerImplBase(token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.aD.dispatchMediaButtonEvent(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }
}
