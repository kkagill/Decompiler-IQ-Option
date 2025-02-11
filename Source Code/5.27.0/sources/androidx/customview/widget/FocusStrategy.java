package androidx.customview.widget;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class FocusStrategy {

    public interface BoundsAdapter<T> {
        void obtainBounds(T t, Rect rect);
    }

    public interface CollectionAdapter<T, V> {
        V get(T t, int i);

        int size(T t);
    }

    private static class SequentialComparator<T> implements Comparator<T> {
        private final BoundsAdapter<T> mAdapter;
        private final boolean mIsLayoutRtl;
        private final Rect mTemp1 = new Rect();
        private final Rect mTemp2 = new Rect();

        SequentialComparator(boolean z, BoundsAdapter<T> boundsAdapter) {
            this.mIsLayoutRtl = z;
            this.mAdapter = boundsAdapter;
        }

        public int compare(T t, T t2) {
            Rect rect = this.mTemp1;
            Rect rect2 = this.mTemp2;
            this.mAdapter.obtainBounds(t, rect);
            this.mAdapter.obtainBounds(t2, rect2);
            int i = -1;
            if (rect.top < rect2.top) {
                return -1;
            }
            if (rect.top > rect2.top) {
                return 1;
            }
            if (rect.left < rect2.left) {
                if (this.mIsLayoutRtl) {
                    i = 1;
                }
                return i;
            } else if (rect.left > rect2.left) {
                if (!this.mIsLayoutRtl) {
                    i = 1;
                }
                return i;
            } else if (rect.bottom < rect2.bottom) {
                return -1;
            } else {
                if (rect.bottom > rect2.bottom) {
                    return 1;
                }
                if (rect.right < rect2.right) {
                    if (this.mIsLayoutRtl) {
                        i = 1;
                    }
                    return i;
                } else if (rect.right <= rect2.right) {
                    return 0;
                } else {
                    if (!this.mIsLayoutRtl) {
                        i = 1;
                    }
                    return i;
                }
            }
        }
    }

    private static int getWeightedDistanceFor(int i, int i2) {
        return ((i * 13) * i) + (i2 * i2);
    }

    public static <L, T> T findNextFocusInRelativeDirection(@NonNull L l, @NonNull CollectionAdapter<L, T> collectionAdapter, @NonNull BoundsAdapter<T> boundsAdapter, @Nullable T t, int i, boolean z, boolean z2) {
        int size = collectionAdapter.size(l);
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(collectionAdapter.get(l, i2));
        }
        Collections.sort(arrayList, new SequentialComparator(z, boundsAdapter));
        if (i == 1) {
            return getPreviousFocusable(t, arrayList, z2);
        }
        if (i == 2) {
            return getNextFocusable(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static <T> T getNextFocusable(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = -1;
        } else {
            i = arrayList.lastIndexOf(t);
        }
        i++;
        if (i < size) {
            return arrayList.get(i);
        }
        return (!z || size <= 0) ? null : arrayList.get(0);
    }

    private static <T> T getPreviousFocusable(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = size;
        } else {
            i = arrayList.indexOf(t);
        }
        i--;
        if (i >= 0) {
            return arrayList.get(i);
        }
        return (!z || size <= 0) ? null : arrayList.get(size - 1);
    }

    public static <L, T> T findNextFocusInAbsoluteDirection(@NonNull L l, @NonNull CollectionAdapter<L, T> collectionAdapter, @NonNull BoundsAdapter<T> boundsAdapter, @Nullable T t, @NonNull Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        int i2 = 0;
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t2 = null;
        int size = collectionAdapter.size(l);
        Rect rect3 = new Rect();
        while (i2 < size) {
            T t3 = collectionAdapter.get(l, i2);
            if (t3 != t) {
                boundsAdapter.obtainBounds(t3, rect3);
                if (isBetterCandidate(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = t3;
                }
            }
            i2++;
        }
        return t2;
    }

    private static boolean isBetterCandidate(int i, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        boolean z = false;
        if (!isCandidate(rect, rect2, i)) {
            return false;
        }
        if (!isCandidate(rect, rect3, i) || beamBeats(i, rect, rect2, rect3)) {
            return true;
        }
        if (beamBeats(i, rect, rect3, rect2)) {
            return false;
        }
        if (getWeightedDistanceFor(majorAxisDistance(i, rect, rect2), minorAxisDistance(i, rect, rect2)) < getWeightedDistanceFor(majorAxisDistance(i, rect, rect3), minorAxisDistance(i, rect, rect3))) {
            z = true;
        }
        return z;
    }

    private static boolean beamBeats(int i, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        boolean beamsOverlap = beamsOverlap(i, rect, rect2);
        if (beamsOverlap(i, rect, rect3) || !beamsOverlap) {
            return false;
        }
        boolean z = true;
        if (!isToDirectionOf(i, rect, rect3)) {
            return true;
        }
        if (!(i == 17 || i == 66 || majorAxisDistance(i, rect, rect2) < majorAxisDistanceToFarEdge(i, rect, rect3))) {
            z = false;
        }
        return z;
    }

    private static boolean isCandidate(@NonNull Rect rect, @NonNull Rect rect2, int i) {
        boolean z = true;
        if (i == 17) {
            if ((rect.right <= rect2.right && rect.left < rect2.right) || rect.left <= rect2.left) {
                z = false;
            }
            return z;
        } else if (i == 33) {
            if ((rect.bottom <= rect2.bottom && rect.top < rect2.bottom) || rect.top <= rect2.top) {
                z = false;
            }
            return z;
        } else if (i == 66) {
            if ((rect.left >= rect2.left && rect.right > rect2.left) || rect.right >= rect2.right) {
                z = false;
            }
            return z;
        } else if (i == 130) {
            if ((rect.top >= rect2.top && rect.bottom > rect2.top) || rect.bottom >= rect2.bottom) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    private static boolean beamsOverlap(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        boolean z = true;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                z = false;
            }
            return z;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            z = false;
        }
        return z;
    }

    private static boolean isToDirectionOf(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        boolean z = true;
        if (i == 17) {
            if (rect.left < rect2.right) {
                z = false;
            }
            return z;
        } else if (i == 33) {
            if (rect.top < rect2.bottom) {
                z = false;
            }
            return z;
        } else if (i == 66) {
            if (rect.right > rect2.left) {
                z = false;
            }
            return z;
        } else if (i == 130) {
            if (rect.bottom > rect2.top) {
                z = false;
            }
            return z;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    private static int majorAxisDistance(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(0, majorAxisDistanceRaw(i, rect, rect2));
    }

    private static int majorAxisDistanceRaw(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        int i2;
        if (i == 17) {
            i = rect.left;
            i2 = rect2.right;
        } else if (i == 33) {
            i = rect.top;
            i2 = rect2.bottom;
        } else if (i == 66) {
            i = rect2.left;
            i2 = rect.right;
        } else if (i == 130) {
            i = rect2.top;
            i2 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i - i2;
    }

    private static int majorAxisDistanceToFarEdge(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(1, majorAxisDistanceToFarEdgeRaw(i, rect, rect2));
    }

    private static int majorAxisDistanceToFarEdgeRaw(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        int i2;
        if (i == 17) {
            i = rect.left;
            i2 = rect2.left;
        } else if (i == 33) {
            i = rect.top;
            i2 = rect2.top;
        } else if (i == 66) {
            i = rect2.right;
            i2 = rect.right;
        } else if (i == 130) {
            i = rect2.bottom;
            i2 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i - i2;
    }

    private static int minorAxisDistance(int i, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    private FocusStrategy() {
    }
}
