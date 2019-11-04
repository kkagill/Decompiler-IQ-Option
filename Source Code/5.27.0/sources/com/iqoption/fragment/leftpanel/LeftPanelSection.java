package com.iqoption.fragment.leftpanel;

import com.iqoption.core.d;
import com.iqoption.x.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, bng = {"Lcom/iqoption/fragment/leftpanel/LeftPanelSection;", "", "icon", "", "title", "", "eventName", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "getIcon", "()I", "getTitle", "PORTFOIO", "MARKET_ANALYSIS", "PRICE_MOVEMENTS", "VIDEO_EDUCATION", "CHATS", "OTN", "ASSET_INFO", "MORE", "app_optionXRelease"})
/* compiled from: LeftPanelSection.kt */
public enum LeftPanelSection {
    PORTFOIO(R.drawable.ic_portfolio, d.getString(R.string.portfolio), "left-bar_portfolio"),
    MARKET_ANALYSIS(R.drawable.ic_calendar, d.getString(R.string.market_analysis), "left-bar_market-analysis"),
    PRICE_MOVEMENTS(R.drawable.ic_signals, d.getString(R.string.signals_untranslatable), "left-bar_signals"),
    VIDEO_EDUCATION(R.drawable.ic_video_education, d.getString(R.string.video_education), "left-bar_video-tutorials"),
    CHATS(R.drawable.ic_chat, d.getString(R.string.chats), "left-bar_chat"),
    OTN(R.drawable.ic_otn, d.getString(R.string.otn_token), "left-bar_otn"),
    ASSET_INFO(0, "", "left-bar_asset_info"),
    MORE(R.drawable.ic_more_btn, "", "left-bar_more");
    
    private final String eventName;
    private final int icon;
    private final String title;

    private LeftPanelSection(int i, String str, String str2) {
        this.icon = i;
        this.title = str;
        this.eventName = str2;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getEventName() {
        return this.eventName;
    }
}
