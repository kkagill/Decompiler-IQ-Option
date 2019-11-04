package com.jumio.nv.view.fragment;

import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SearchView.OnCloseListener;
import androidx.appcompat.widget.SearchView.OnQueryTextListener;
import com.jumio.analytics.JumioAnalytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.analytics.Screen;
import com.jumio.analytics.UserAction;
import com.jumio.commons.utils.ScreenUtil;
import com.jumio.commons.view.CompatibilityLayer;
import com.jumio.core.mvp.presenter.RequiresPresenter;
import com.jumio.nv.R;
import com.jumio.nv.view.interactors.CountryListView;
import jumio.nv.core.u;
import jumio.nv.core.u.a;
import jumio.nv.core.z;

@RequiresPresenter(z.class)
public class CountryListFragment extends NVBaseFragment<z> implements OnItemClickListener, OnCloseListener, OnQueryTextListener, INetverifyActivityCallback, CountryListView {
    private ListView a;
    private TextView b;
    private u c;
    private SearchView d;

    public boolean onClose() {
        return true;
    }

    public void onError(Throwable th) {
    }

    public boolean onHomeButtonPressed() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((INetverifyFragmentCallback) this.callback).registerActivityCallback(this);
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.nv_fragment_countrylist, viewGroup, false);
        this.b = (TextView) inflate.findViewById(16908292);
        this.a = (ListView) inflate.findViewById(R.id.countryListView);
        this.d = (SearchView) layoutInflater.inflate(R.layout.nv_fragment_country_search_item, null);
        this.d.setFilterTouchesWhenObscured(true);
        this.d.setOnQueryTextListener(this);
        this.d.setOnCloseListener(this);
        this.d.setIconifiedByDefault(true);
        this.d.setFocusable(true);
        this.d.setIconified(false);
        this.d.setContentDescription(getActivity().getText(R.string.netverify_countrylist_title));
        this.d.setOnSearchClickListener(new OnClickListener() {
            public void onClick(View view) {
                JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.COUNTRY_LIST, UserAction.SEARCH_STARTED));
            }
        });
        TypedValue typedValue = new TypedValue();
        getActivity().getTheme().resolveAttribute(R.attr.colorControlNormal, typedValue, true);
        CompatibilityLayer.getDrawable(getResources(), R.drawable.nv_ic_search_alpha).setColorFilter(typedValue.data, Mode.SRC_ATOP);
        this.d.findViewById(androidx.appcompat.R.id.search_plate).getBackground().setColorFilter(typedValue.data, Mode.MULTIPLY);
        ((INetverifyFragmentCallback) this.callback).setUiAutomationId(R.string.netverify_automation_country_list);
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.c = new u(((z) getPresenter()).a());
        this.b.setText(R.string.netverify_countrylist_empty);
        this.a.setEmptyView(this.b);
        this.a.setAdapter(this.c);
        this.a.setOnItemClickListener(this);
        this.a.setFastScrollEnabled(true);
        this.a.setFilterTouchesWhenObscured(true);
        bundle = getArguments();
        if (bundle != null) {
            boolean z = false;
            if (bundle.getBoolean("selectionSkipped", false)) {
                if (((INetverifyFragmentCallback) this.callback).getRotationManager().isScreenPortrait() || ((INetverifyFragmentCallback) this.callback).getRotationManager().isTablet()) {
                    z = true;
                }
                handleOrientationChange(z, true);
                ((LinearLayout) getActivity().findViewById(R.id.toolbarSubtitleSubcontainer)).addView(this.d);
                return;
            }
        }
        ((INetverifyFragmentCallback) this.callback).animateActionbar(true, true, this.d, new Runnable() {
            public void run() {
                CountryListFragment countryListFragment = CountryListFragment.this;
                boolean z = ((INetverifyFragmentCallback) countryListFragment.callback).getRotationManager().isScreenPortrait() || ((INetverifyFragmentCallback) CountryListFragment.this.callback).getRotationManager().isTablet();
                countryListFragment.handleOrientationChange(z, true);
            }
        }, null);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.d.requestFocusFromTouch();
        JumioAnalytics.add(MobileEvents.pageView(JumioAnalytics.getSessionId(), Screen.COUNTRY_LIST, null));
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public boolean onQueryTextSubmit(String str) {
        u uVar = this.c;
        if (uVar != null) {
            uVar.a(str);
        }
        return false;
    }

    public boolean onQueryTextChange(String str) {
        u uVar = this.c;
        if (uVar != null) {
            uVar.a(str);
        }
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        a aVar = (a) view.getTag();
        JumioAnalytics.add(MobileEvents.userAction(JumioAnalytics.getSessionId(), Screen.COUNTRY_LIST, UserAction.COUNTRY_SELECTED, aVar.a.getIsoCode()));
        ((z) getPresenter()).a(aVar.a);
        a();
        finishFragment();
    }

    public void finishFragment() {
        ((INetverifyFragmentCallback) this.callback).animateActionbar(true, false, this.d, null, null);
        ((INetverifyFragmentCallback) this.callback).closeFragment(R.animator.nv_slide_up, R.animator.nv_slide_down);
    }

    public boolean onBackButtonPressed() {
        SearchView searchView = this.d;
        if (searchView != null) {
            searchView.setQuery("", false);
        }
        finishFragment();
        return true;
    }

    private void a() {
        InputMethodManager inputMethodManager = (InputMethodManager) getActivity().getSystemService("input_method");
        View currentFocus = getActivity().getCurrentFocus();
        if (currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public void handleOrientationChange(boolean z, boolean z2) {
        if (z2) {
            ((LayoutParams) getActivity().findViewById(R.id.country_container).getLayoutParams()).topMargin = ScreenUtil.dpToPx(getActivity(), z ? 156 : 74);
            if (z) {
                setActionbarTitle(0);
                setActionbarSubTitle(R.string.netverify_countrylist_title);
            } else {
                setActionbarTitle(R.string.netverify_countrylist_title);
                setActionbarSubTitle(0);
                a();
            }
        }
    }
}
