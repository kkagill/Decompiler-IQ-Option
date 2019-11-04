package androidx.paging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

final class PagedStorage<T> extends AbstractList<T> {
    private static final List PLACEHOLDER_LIST = new ArrayList();
    private int mLeadingNullCount;
    private int mLoadedCount;
    private int mNumberAppended;
    private int mNumberPrepended;
    private int mPageSize;
    private final ArrayList<List<T>> mPages;
    private int mPositionOffset;
    private int mStorageCount;
    private int mTrailingNullCount;

    interface Callback {
        void onEmptyAppend();

        void onEmptyPrepend();

        void onInitialized(int i);

        void onPageAppended(int i, int i2, int i3);

        void onPageInserted(int i, int i2);

        void onPagePlaceholderInserted(int i);

        void onPagePrepended(int i, int i2, int i3);

        void onPagesRemoved(int i, int i2);

        void onPagesSwappedToPlaceholder(int i, int i2);
    }

    PagedStorage() {
        this.mLeadingNullCount = 0;
        this.mPages = new ArrayList();
        this.mTrailingNullCount = 0;
        this.mPositionOffset = 0;
        this.mLoadedCount = 0;
        this.mStorageCount = 0;
        this.mPageSize = 1;
        this.mNumberPrepended = 0;
        this.mNumberAppended = 0;
    }

    PagedStorage(int i, List<T> list, int i2) {
        this();
        init(i, list, i2, 0);
    }

    private PagedStorage(PagedStorage<T> pagedStorage) {
        this.mLeadingNullCount = pagedStorage.mLeadingNullCount;
        this.mPages = new ArrayList(pagedStorage.mPages);
        this.mTrailingNullCount = pagedStorage.mTrailingNullCount;
        this.mPositionOffset = pagedStorage.mPositionOffset;
        this.mLoadedCount = pagedStorage.mLoadedCount;
        this.mStorageCount = pagedStorage.mStorageCount;
        this.mPageSize = pagedStorage.mPageSize;
        this.mNumberPrepended = pagedStorage.mNumberPrepended;
        this.mNumberAppended = pagedStorage.mNumberAppended;
    }

    /* Access modifiers changed, original: 0000 */
    public PagedStorage<T> snapshot() {
        return new PagedStorage(this);
    }

    private void init(int i, List<T> list, int i2, int i3) {
        this.mLeadingNullCount = i;
        this.mPages.clear();
        this.mPages.add(list);
        this.mTrailingNullCount = i2;
        this.mPositionOffset = i3;
        this.mLoadedCount = list.size();
        this.mStorageCount = this.mLoadedCount;
        this.mPageSize = list.size();
        this.mNumberPrepended = 0;
        this.mNumberAppended = 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void init(int i, @NonNull List<T> list, int i2, int i3, @NonNull Callback callback) {
        init(i, list, i2, i3);
        callback.onInitialized(size());
    }

    public T get(int i) {
        if (i < 0 || i >= size()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Index: ");
            stringBuilder.append(i);
            stringBuilder.append(", Size: ");
            stringBuilder.append(size());
            throw new IndexOutOfBoundsException(stringBuilder.toString());
        }
        i -= this.mLeadingNullCount;
        if (i >= 0 && i < this.mStorageCount) {
            int i2;
            int i3;
            if (isTiled()) {
                i3 = this.mPageSize;
                i2 = i / i3;
                i %= i3;
            } else {
                i3 = this.mPages.size();
                i2 = 0;
                while (i2 < i3) {
                    int size = ((List) this.mPages.get(i2)).size();
                    if (size > i) {
                        break;
                    }
                    i -= size;
                    i2++;
                }
            }
            List list = (List) this.mPages.get(i2);
            if (!(list == null || list.size() == 0)) {
                return list.get(i);
            }
        }
        return null;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean isTiled() {
        return this.mPageSize > 0;
    }

    /* Access modifiers changed, original: 0000 */
    public int getLeadingNullCount() {
        return this.mLeadingNullCount;
    }

    /* Access modifiers changed, original: 0000 */
    public int getTrailingNullCount() {
        return this.mTrailingNullCount;
    }

    /* Access modifiers changed, original: 0000 */
    public int getStorageCount() {
        return this.mStorageCount;
    }

    /* Access modifiers changed, original: 0000 */
    public int getNumberAppended() {
        return this.mNumberAppended;
    }

    /* Access modifiers changed, original: 0000 */
    public int getNumberPrepended() {
        return this.mNumberPrepended;
    }

    /* Access modifiers changed, original: 0000 */
    public int getPageCount() {
        return this.mPages.size();
    }

    /* Access modifiers changed, original: 0000 */
    public int getLoadedCount() {
        return this.mLoadedCount;
    }

    /* Access modifiers changed, original: 0000 */
    public int getPositionOffset() {
        return this.mPositionOffset;
    }

    /* Access modifiers changed, original: 0000 */
    public int getMiddleOfLoadedRange() {
        return (this.mLeadingNullCount + this.mPositionOffset) + (this.mStorageCount / 2);
    }

    public int size() {
        return (this.mLeadingNullCount + this.mStorageCount) + this.mTrailingNullCount;
    }

    /* Access modifiers changed, original: 0000 */
    public int computeLeadingNulls() {
        int i = this.mLeadingNullCount;
        int size = this.mPages.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) this.mPages.get(i2);
            if (list != null && list != PLACEHOLDER_LIST) {
                break;
            }
            i += this.mPageSize;
        }
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public int computeTrailingNulls() {
        int i = this.mTrailingNullCount;
        for (int size = this.mPages.size() - 1; size >= 0; size--) {
            List list = (List) this.mPages.get(size);
            if (list != null && list != PLACEHOLDER_LIST) {
                break;
            }
            i += this.mPageSize;
        }
        return i;
    }

    private boolean needsTrim(int i, int i2, int i3) {
        List list = (List) this.mPages.get(i3);
        return list == null || (this.mLoadedCount > i && this.mPages.size() > 2 && list != PLACEHOLDER_LIST && this.mLoadedCount - list.size() >= i2);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean needsTrimFromFront(int i, int i2) {
        return needsTrim(i, i2, 0);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean needsTrimFromEnd(int i, int i2) {
        return needsTrim(i, i2, this.mPages.size() - 1);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean shouldPreTrimNewPage(int i, int i2, int i3) {
        if (this.mLoadedCount + i3 <= i || this.mPages.size() <= 1 || this.mLoadedCount < i2) {
            return false;
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean trimFromFront(boolean z, int i, int i2, @NonNull Callback callback) {
        int i3 = 0;
        while (needsTrimFromFront(i, i2)) {
            List list = (List) this.mPages.remove(0);
            int size = list == null ? this.mPageSize : list.size();
            i3 += size;
            this.mStorageCount -= size;
            this.mLoadedCount -= list == null ? 0 : list.size();
        }
        if (i3 > 0) {
            if (z) {
                int i4 = this.mLeadingNullCount;
                this.mLeadingNullCount = i4 + i3;
                callback.onPagesSwappedToPlaceholder(i4, i3);
            } else {
                this.mPositionOffset += i3;
                callback.onPagesRemoved(this.mLeadingNullCount, i3);
            }
        }
        if (i3 > 0) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public boolean trimFromEnd(boolean z, int i, int i2, @NonNull Callback callback) {
        int i3 = 0;
        while (needsTrimFromEnd(i, i2)) {
            ArrayList arrayList = this.mPages;
            List list = (List) arrayList.remove(arrayList.size() - 1);
            int size = list == null ? this.mPageSize : list.size();
            i3 += size;
            this.mStorageCount -= size;
            this.mLoadedCount -= list == null ? 0 : list.size();
        }
        if (i3 > 0) {
            i = this.mLeadingNullCount + this.mStorageCount;
            if (z) {
                this.mTrailingNullCount += i3;
                callback.onPagesSwappedToPlaceholder(i, i3);
            } else {
                callback.onPagesRemoved(i, i3);
            }
        }
        if (i3 > 0) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: 0000 */
    public T getFirstLoadedItem() {
        return ((List) this.mPages.get(0)).get(0);
    }

    /* Access modifiers changed, original: 0000 */
    public T getLastLoadedItem() {
        ArrayList arrayList = this.mPages;
        List list = (List) arrayList.get(arrayList.size() - 1);
        return list.get(list.size() - 1);
    }

    /* Access modifiers changed, original: 0000 */
    public void prependPage(@NonNull List<T> list, @NonNull Callback callback) {
        int size = list.size();
        if (size == 0) {
            callback.onEmptyPrepend();
            return;
        }
        int i = this.mPageSize;
        if (i > 0 && size != i) {
            if (this.mPages.size() != 1 || size <= this.mPageSize) {
                this.mPageSize = -1;
            } else {
                this.mPageSize = size;
            }
        }
        this.mPages.add(0, list);
        this.mLoadedCount += size;
        this.mStorageCount += size;
        int min = Math.min(this.mLeadingNullCount, size);
        i = size - min;
        if (min != 0) {
            this.mLeadingNullCount -= min;
        }
        this.mPositionOffset -= i;
        this.mNumberPrepended += size;
        callback.onPagePrepended(this.mLeadingNullCount, min, i);
    }

    /* Access modifiers changed, original: 0000 */
    public void appendPage(@NonNull List<T> list, @NonNull Callback callback) {
        int size = list.size();
        if (size == 0) {
            callback.onEmptyAppend();
            return;
        }
        int size2;
        if (this.mPageSize > 0) {
            ArrayList arrayList = this.mPages;
            size2 = ((List) arrayList.get(arrayList.size() - 1)).size();
            int i = this.mPageSize;
            if (size2 != i || size > i) {
                this.mPageSize = -1;
            }
        }
        this.mPages.add(list);
        this.mLoadedCount += size;
        this.mStorageCount += size;
        int min = Math.min(this.mTrailingNullCount, size);
        size2 = size - min;
        if (min != 0) {
            this.mTrailingNullCount -= min;
        }
        this.mNumberAppended += size;
        callback.onPageAppended((this.mLeadingNullCount + this.mStorageCount) - size, min, size2);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean pageWouldBeBoundary(int i, boolean z) {
        if (this.mPageSize < 1 || this.mPages.size() < 2) {
            throw new IllegalStateException("Trimming attempt before sufficient load");
        }
        int i2 = this.mLeadingNullCount;
        if (i < i2) {
            return z;
        }
        if (i >= this.mStorageCount + i2) {
            return z ^ 1;
        }
        i = (i - i2) / this.mPageSize;
        int i3;
        if (z) {
            for (i3 = 0; i3 < i; i3++) {
                if (this.mPages.get(i3) != null) {
                    return false;
                }
            }
        } else {
            for (i3 = this.mPages.size() - 1; i3 > i; i3--) {
                if (this.mPages.get(i3) != null) {
                    return false;
                }
            }
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void initAndSplit(int i, @NonNull List<T> list, int i2, int i3, int i4, @NonNull Callback callback) {
        int size = (list.size() + (i4 - 1)) / i4;
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 * i4;
            int i7 = i5 + 1;
            List subList = list.subList(i6, Math.min(list.size(), i7 * i4));
            if (i5 == 0) {
                init(i, subList, (list.size() + i2) - subList.size(), i3);
            } else {
                insertPage(i6 + i, subList, null);
            }
            i5 = i7;
        }
        callback.onInitialized(size());
    }

    /* Access modifiers changed, original: 0000 */
    public void tryInsertPageAndTrim(int i, @NonNull List<T> list, int i2, int i3, int i4, @NonNull Callback callback) {
        Object obj = i3 != Integer.MAX_VALUE ? 1 : null;
        boolean z = i2 > getMiddleOfLoadedRange();
        Object obj2 = (obj != null && shouldPreTrimNewPage(i3, i4, list.size()) && pageWouldBeBoundary(i, z)) ? null : 1;
        if (obj2 != null) {
            insertPage(i, list, callback);
        } else {
            this.mPages.set((i - this.mLeadingNullCount) / this.mPageSize, null);
            this.mStorageCount -= list.size();
            if (z) {
                this.mPages.remove(0);
                this.mLeadingNullCount += list.size();
            } else {
                ArrayList arrayList = this.mPages;
                arrayList.remove(arrayList.size() - 1);
                this.mTrailingNullCount += list.size();
            }
        }
        if (obj == null) {
            return;
        }
        if (z) {
            trimFromFront(true, i3, i4, callback);
        } else {
            trimFromEnd(true, i3, i4, callback);
        }
    }

    public void insertPage(int i, @NonNull List<T> list, @Nullable Callback callback) {
        int size;
        int size2 = list.size();
        if (size2 != this.mPageSize) {
            size = size();
            int i2 = this.mPageSize;
            Object obj = null;
            Object obj2 = (i != size - (size % i2) || size2 >= i2) ? null : 1;
            if (this.mTrailingNullCount == 0 && this.mPages.size() == 1 && size2 > this.mPageSize) {
                obj = 1;
            }
            if (obj == null && obj2 == null) {
                throw new IllegalArgumentException("page introduces incorrect tiling");
            } else if (obj != null) {
                this.mPageSize = size2;
            }
        }
        size = i / this.mPageSize;
        allocatePageRange(size, size);
        size -= this.mLeadingNullCount / this.mPageSize;
        List list2 = (List) this.mPages.get(size);
        if (list2 == null || list2 == PLACEHOLDER_LIST) {
            this.mPages.set(size, list);
            this.mLoadedCount += size2;
            if (callback != null) {
                callback.onPageInserted(i, size2);
                return;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid position ");
        stringBuilder.append(i);
        stringBuilder.append(": data already loaded");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: 0000 */
    public void allocatePageRange(int i, int i2) {
        int i3 = this.mLeadingNullCount / this.mPageSize;
        if (i < i3) {
            int i4;
            int i5 = 0;
            while (true) {
                i4 = i3 - i;
                if (i5 >= i4) {
                    break;
                }
                this.mPages.add(0, null);
                i5++;
            }
            i4 *= this.mPageSize;
            this.mStorageCount += i4;
            this.mLeadingNullCount -= i4;
        } else {
            i = i3;
        }
        if (i2 >= this.mPages.size() + i) {
            i3 = Math.min(this.mTrailingNullCount, ((i2 + 1) - (this.mPages.size() + i)) * this.mPageSize);
            for (int size = this.mPages.size(); size <= i2 - i; size++) {
                ArrayList arrayList = this.mPages;
                arrayList.add(arrayList.size(), null);
            }
            this.mStorageCount += i3;
            this.mTrailingNullCount -= i3;
        }
    }

    public void allocatePlaceholders(int i, int i2, int i3, Callback callback) {
        int i4 = this.mPageSize;
        if (i3 != i4) {
            if (i3 < i4) {
                throw new IllegalArgumentException("Page size cannot be reduced");
            } else if (this.mPages.size() == 1 && this.mTrailingNullCount == 0) {
                this.mPageSize = i3;
            } else {
                throw new IllegalArgumentException("Page size can change only if last page is only one present");
            }
        }
        i3 = size();
        i4 = this.mPageSize;
        i3 = ((i3 + i4) - 1) / i4;
        i4 = Math.max((i - i2) / i4, 0);
        i = Math.min((i + i2) / this.mPageSize, i3 - 1);
        allocatePageRange(i4, i);
        i2 = this.mLeadingNullCount / this.mPageSize;
        while (i4 <= i) {
            i3 = i4 - i2;
            if (this.mPages.get(i3) == null) {
                this.mPages.set(i3, PLACEHOLDER_LIST);
                callback.onPagePlaceholderInserted(i4);
            }
            i4++;
        }
    }

    public boolean hasPage(int i, int i2) {
        int i3 = this.mLeadingNullCount / i;
        if (i2 < i3 || i2 >= this.mPages.size() + i3) {
            return false;
        }
        List list = (List) this.mPages.get(i2 - i3);
        if (list == null || list == PLACEHOLDER_LIST) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("leading ");
        stringBuilder.append(this.mLeadingNullCount);
        stringBuilder.append(", storage ");
        stringBuilder.append(this.mStorageCount);
        stringBuilder.append(", trailing ");
        stringBuilder.append(getTrailingNullCount());
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.toString());
        for (int i = 0; i < this.mPages.size(); i++) {
            stringBuilder2.append(" ");
            stringBuilder2.append(this.mPages.get(i));
        }
        return stringBuilder2.toString();
    }
}
