package com.google.common.cache;

public enum RemovalCause {
    EXPLICIT {
        /* Access modifiers changed, original: 0000 */
        public boolean wasEvicted() {
            return false;
        }
    },
    REPLACED {
        /* Access modifiers changed, original: 0000 */
        public boolean wasEvicted() {
            return false;
        }
    },
    COLLECTED {
        /* Access modifiers changed, original: 0000 */
        public boolean wasEvicted() {
            return true;
        }
    },
    EXPIRED {
        /* Access modifiers changed, original: 0000 */
        public boolean wasEvicted() {
            return true;
        }
    },
    SIZE {
        /* Access modifiers changed, original: 0000 */
        public boolean wasEvicted() {
            return true;
        }
    };

    public abstract boolean wasEvicted();
}
