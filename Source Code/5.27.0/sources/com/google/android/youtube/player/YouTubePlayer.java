package com.google.android.youtube.player;

public interface YouTubePlayer {

    public enum ErrorReason {
        EMBEDDING_DISABLED,
        BLOCKED_FOR_APP,
        NOT_PLAYABLE,
        NETWORK_ERROR,
        UNAUTHORIZED_OVERLAY,
        PLAYER_VIEW_TOO_SMALL,
        PLAYER_VIEW_NOT_VISIBLE,
        EMPTY_PLAYLIST,
        AUTOPLAY_DISABLED,
        USER_DECLINED_RESTRICTED_CONTENT,
        USER_DECLINED_HIGH_BANDWIDTH,
        UNEXPECTED_SERVICE_DISCONNECTION,
        INTERNAL_ERROR,
        UNKNOWN
    }

    public interface a {
        void onFullscreen(boolean z);
    }

    public interface b {
        void a(e eVar, YouTubeInitializationResult youTubeInitializationResult);

        void a(e eVar, YouTubePlayer youTubePlayer, boolean z);
    }

    public interface c {
        void ag(boolean z);

        void bl(int i);

        void onPaused();

        void onStopped();

        void pt();
    }

    public interface d {
        void a(ErrorReason errorReason);

        void bL(String str);

        void pu();

        void pv();

        void pw();

        void px();
    }

    public interface e {
    }

    void a(a aVar);

    void a(c cVar);

    void a(d dVar);

    void bK(String str);

    void bk(int i);

    boolean isPlaying();

    void pause();

    void play();

    int pr();

    int ps();

    void setFullscreen(boolean z);
}
