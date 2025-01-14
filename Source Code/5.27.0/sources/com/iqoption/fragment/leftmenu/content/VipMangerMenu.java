package com.iqoption.fragment.leftmenu.content;

import com.iqoption.x.R;

public enum VipMangerMenu implements a {
    about {
        public String analyticsEventName() {
            return "vip-manager_about";
        }

        public int getNameToDisplay() {
            return R.string.about;
        }

        public /* bridge */ /* synthetic */ Object getId() {
            return super.getId();
        }
    },
    request_call {
        public String analyticsEventName() {
            return "vip-manager_request-call";
        }

        public int getNameToDisplay() {
            return R.string.request_a_call;
        }

        public /* bridge */ /* synthetic */ Object getId() {
            return super.getId();
        }
    },
    education {
        public String analyticsEventName() {
            return "vip-manager_education";
        }

        public int getNameToDisplay() {
            return R.string.education;
        }

        public /* bridge */ /* synthetic */ Object getId() {
            return super.getId();
        }
    };
    
    private boolean isEnabled;
    private boolean isVisible;

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

    public boolean isEnabled() {
        return this.isEnabled;
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
