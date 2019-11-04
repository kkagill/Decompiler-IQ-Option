package com.iqoption.fragment.leftmenu.content;

import com.iqoption.app.IQApp;
import com.iqoption.core.splash.SplashLogHelper;
import com.iqoption.gdpr.a;
import com.iqoption.x.R;

public enum SettingsMenu implements a {
    General {
        public int getNameToDisplay() {
            return R.string.trading;
        }

        public /* bridge */ /* synthetic */ Object getId() {
            return super.getId();
        }
    },
    Security {
        public int getNameToDisplay() {
            return R.string.security;
        }

        public /* bridge */ /* synthetic */ Object getId() {
            return super.getId();
        }
    },
    PushNotifications {
        public int getNameToDisplay() {
            return R.string.notification1;
        }

        public /* bridge */ /* synthetic */ Object getId() {
            return super.getId();
        }
    },
    NewsAndUpdates {
        public int getNameToDisplay() {
            return R.string.news_and_updates;
        }

        public /* bridge */ /* synthetic */ Object getId() {
            return super.getId();
        }

        public boolean isVisible() {
            return a.bz(IQApp.Eu());
        }
    },
    ActiveSessions {
        public int getNameToDisplay() {
            return R.string.active_sessions;
        }

        public /* bridge */ /* synthetic */ Object getId() {
            return super.getId();
        }
    },
    TechnicalLog {
        public int getNameToDisplay() {
            return R.string.technical_log;
        }

        public /* bridge */ /* synthetic */ Object getId() {
            return super.getId();
        }

        public boolean isVisible() {
            return SplashLogHelper.bGE.akR();
        }
    };
    
    private boolean isEnabled;
    private boolean isVisible;

    public String analyticsEventName() {
        return "";
    }

    public a getChild(int i) {
        return null;
    }

    public int getChildCount() {
        return 0;
    }

    public int getCollapseIcon() {
        return 0;
    }

    public int getExpandIcon() {
        return 0;
    }

    public int getIcon() {
        return 0;
    }

    public boolean isClickable() {
        return true;
    }

    public boolean isInProgress() {
        return false;
    }

    public int layoutResId() {
        return R.layout.left_menu_item_child;
    }

    public int menuPriority() {
        return 3;
    }

    public boolean setEnabled(boolean z) {
        if (this.isEnabled == z) {
            return false;
        }
        this.isEnabled = z;
        return true;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public boolean setVisible(boolean z) {
        if (this.isVisible == z) {
            return false;
        }
        this.isVisible = z;
        return true;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public int getSize() {
        return isVisible();
    }

    public String getId() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(":");
        stringBuilder.append(name());
        return stringBuilder.toString();
    }
}
