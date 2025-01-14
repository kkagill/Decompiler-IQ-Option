package androidx.databinding.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.databinding.ObservableList;
import androidx.databinding.ObservableList.OnListChangedCallback;
import java.util.List;

@RestrictTo({Scope.LIBRARY})
class ObservableListAdapter<T> extends BaseAdapter {
    private final Context mContext;
    private final int mDropDownResourceId;
    private final LayoutInflater mLayoutInflater;
    private List<T> mList;
    private OnListChangedCallback mListChangedCallback;
    private final int mResourceId;
    private final int mTextViewResourceId;

    public long getItemId(int i) {
        return (long) i;
    }

    public ObservableListAdapter(Context context, List<T> list, int i, int i2, int i3) {
        LayoutInflater layoutInflater;
        this.mContext = context;
        this.mResourceId = i;
        this.mDropDownResourceId = i2;
        this.mTextViewResourceId = i3;
        if (i == 0) {
            layoutInflater = null;
        } else {
            layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        }
        this.mLayoutInflater = layoutInflater;
        setList(list);
    }

    public void setList(List<T> list) {
        List<T> list2 = this.mList;
        if (list2 != list) {
            if (list2 instanceof ObservableList) {
                ((ObservableList) list2).removeOnListChangedCallback(this.mListChangedCallback);
            }
            this.mList = list;
            if (this.mList instanceof ObservableList) {
                if (this.mListChangedCallback == null) {
                    this.mListChangedCallback = new OnListChangedCallback() {
                        public void onChanged(ObservableList observableList) {
                            ObservableListAdapter.this.notifyDataSetChanged();
                        }

                        public void onItemRangeChanged(ObservableList observableList, int i, int i2) {
                            ObservableListAdapter.this.notifyDataSetChanged();
                        }

                        public void onItemRangeInserted(ObservableList observableList, int i, int i2) {
                            ObservableListAdapter.this.notifyDataSetChanged();
                        }

                        public void onItemRangeMoved(ObservableList observableList, int i, int i2, int i3) {
                            ObservableListAdapter.this.notifyDataSetChanged();
                        }

                        public void onItemRangeRemoved(ObservableList observableList, int i, int i2) {
                            ObservableListAdapter.this.notifyDataSetChanged();
                        }
                    };
                }
                ((ObservableList) this.mList).addOnListChangedCallback(this.mListChangedCallback);
            }
            notifyDataSetChanged();
        }
    }

    public int getCount() {
        return this.mList.size();
    }

    public Object getItem(int i) {
        return this.mList.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return getViewForResource(this.mResourceId, i, view, viewGroup);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return getViewForResource(this.mDropDownResourceId, i, view, viewGroup);
    }

    public View getViewForResource(int i, int i2, View view, ViewGroup viewGroup) {
        View view2;
        CharSequence charSequence;
        if (view == null) {
            if (i == 0) {
                view = new TextView(this.mContext);
            } else {
                view = this.mLayoutInflater.inflate(i, viewGroup, false);
            }
        }
        i = this.mTextViewResourceId;
        if (i == 0) {
            view2 = view;
        } else {
            view2 = view.findViewById(i);
        }
        TextView textView = (TextView) view2;
        Object obj = this.mList.get(i2);
        if (obj instanceof CharSequence) {
            charSequence = (CharSequence) obj;
        } else {
            charSequence = String.valueOf(obj);
        }
        textView.setText(charSequence);
        return view;
    }
}
