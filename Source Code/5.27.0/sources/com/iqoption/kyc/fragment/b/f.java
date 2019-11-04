package com.iqoption.kyc.fragment.b;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import com.google.common.util.concurrent.p;
import com.iqoption.core.microservices.kyc.response.VerificationType;
import com.iqoption.core.microservices.kyc.response.document.e;
import com.iqoption.e.js;
import com.iqoption.kyc.a.d;
import com.iqoption.kyc.g;
import com.iqoption.kyc.s;
import com.iqoption.util.t;
import com.iqoption.util.v;
import com.iqoption.util.y;
import com.iqoption.x.R;

/* compiled from: KycDocumentsUploadFragment */
public class f extends Fragment implements com.iqoption.kyc.a.b {
    public static final String TAG = "com.iqoption.kyc.fragment.b.f";
    private boolean aZy;
    private y dxL;
    private com.iqoption.util.y.a dxN = new com.iqoption.util.y.a() {
        public void onKeyboardVisibilityChanged(boolean z) {
            if (z && f.this.isAdded() && t.a(f.this.getFragmentManager(), f.TAG)) {
                y.j(f.this.getActivity());
            }
        }
    };
    private OnBackStackChangedListener dxW;
    private a dyA;
    private js dyB;
    private boolean dyC;
    private boolean dyD;
    @Nullable
    private volatile e dym;
    private boolean dyn;
    private boolean isInProgress;

    /* compiled from: KycDocumentsUploadFragment */
    public interface a {
        com.google.common.util.concurrent.t<?> aJV();

        com.google.common.util.concurrent.t<?> aJW();

        com.google.common.util.concurrent.t<?> aJX();

        com.google.common.util.concurrent.t<?> aJY();

        com.google.common.util.concurrent.t<?> aJZ();

        com.google.common.util.concurrent.t<?> aKa();

        void aKb();
    }

    /* compiled from: KycDocumentsUploadFragment */
    private static class b extends com.iqoption.system.c.b<f, Object> {
        private final Boolean dyH;

        public b(f fVar) {
            this(fVar, false);
        }

        public b(f fVar, boolean z) {
            super(fVar, Object.class);
            e(t.ebc);
            this.dyH = Boolean.valueOf(z);
        }

        /* renamed from: a */
        public void v(@NonNull f fVar, Object obj) {
            super.v(fVar, obj);
            Boolean bool = this.dyH;
            if (bool == null) {
                fVar.ev(false);
            } else {
                fVar.d(false, bool.booleanValue());
            }
        }

        /* renamed from: a */
        public void c(@NonNull f fVar, Throwable th) {
            super.c(fVar, th);
            Boolean bool = this.dyH;
            if (bool == null) {
                fVar.ev(false);
            } else {
                fVar.d(false, bool.booleanValue());
            }
        }
    }

    @NonNull
    public String aKn() {
        return "IdentityProving";
    }

    @NonNull
    public String aKo() {
        return "DocumentsUploading";
    }

    public static f a(e eVar, boolean z, boolean z2) {
        f fVar = new f();
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY_PROOF_DOCS", eVar);
        bundle.putBoolean("KEY_IS_SHOW_CONTINUE_LATER", z);
        bundle.putBoolean("KEY_IS_REGULATED", z2);
        fVar.setArguments(bundle);
        return fVar;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null) {
            this.dym = (e) bundle.getParcelable("KEY_PROOF_DOCS");
            this.dyC = bundle.getBoolean("KEY_IS_SHOW_CONTINUE_LATER");
            this.aZy = bundle.getBoolean("KEY_IS_REGULATED", true);
            return;
        }
        this.aZy = true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        this.dyB = (js) DataBindingUtil.inflate(layoutInflater, R.layout.fragment_kyc_documents_upload, viewGroup, false);
        this.dyD = ((Integer) com.iqoption.app.b.aK(getContext()).ase.getValue()).intValue() == 0;
        setHasOptionsMenu(this.dyC);
        this.dyB.cgt.setVisibility(this.dyD ? 8 : 0);
        this.dyB.cgv.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                if (!f.this.isInProgress) {
                    Object obj = (view.getTag(R.id.isDeclined) == null || !((Boolean) view.getTag(R.id.isDeclined)).booleanValue()) ? null : 1;
                    f.this.dyn = true;
                    if (obj != null) {
                        f.this.d(true, true);
                        p.a(f.this.dyA.aJX(), new b(f.this, true), com.iqoption.core.c.a.biN);
                        return;
                    }
                    f.this.d(true, true);
                    p.a(f.this.dyA.aJV(), new b(f.this, true), com.iqoption.core.c.a.biN);
                }
            }
        });
        this.dyB.cgq.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                if (!f.this.isInProgress) {
                    f.this.dyn = true;
                    Object obj = (view.getTag(R.id.isDeclined) == null || !((Boolean) view.getTag(R.id.isDeclined)).booleanValue()) ? null : 1;
                    if (obj != null) {
                        f.this.d(true, false);
                        p.a(f.this.dyA.aJY(), new b(f.this, false), com.iqoption.core.c.a.biN);
                        return;
                    }
                    f.this.d(true, false);
                    p.a(f.this.dyA.aJW(), new b(f.this, false), com.iqoption.core.c.a.biN);
                }
            }
        });
        LinearLayout linearLayout = this.dyB.cgq;
        if (!this.aZy) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        this.dyB.cgt.setOnClickListener(new com.iqoption.view.d.b() {
            public void M(View view) {
                f.this.dyn = false;
                com.iqoption.kyc.a.a.m(f.this.aKn(), f.this.aKo(), true);
                p.a(f.this.dyA.aKa(), new b(f.this), com.iqoption.core.c.a.biN);
            }
        });
        ImageSpan imageSpan = new ImageSpan(getContext(), R.drawable.ic_kyc_account_verification_info);
        ImageSpan imageSpan2 = new ImageSpan(getContext(), R.drawable.ic_kyc_account_verification_info_selected);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.dyB.cgz.getText().toString());
        stringBuilder.append("   ");
        String stringBuilder2 = stringBuilder.toString();
        final SpannableString spannableString = new SpannableString(stringBuilder2);
        final SpannableString spannableString2 = new SpannableString(stringBuilder2);
        spannableString.setSpan(imageSpan, stringBuilder2.length() - 1, stringBuilder2.length(), 17);
        spannableString2.setSpan(imageSpan2, stringBuilder2.length() - 1, stringBuilder2.length(), 17);
        this.dyB.cgz.setText(spannableString);
        this.dyB.cgz.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (!f.this.isInProgress) {
                        f.this.dyB.cgz.setText(spannableString2);
                        f.this.dyB.cgz.setSelected(true);
                    }
                    return true;
                } else if (action != 1 && action != 3) {
                    return false;
                } else {
                    if (!f.this.isInProgress) {
                        f.this.dyB.cgz.setText(spannableString);
                        f.this.dyB.cgz.setSelected(false);
                        f.this.dyA.aKb();
                    }
                    return true;
                }
            }
        });
        Lb();
        this.dxW = new d(com.iqoption.kyc.a.a.aKm(), getFragmentManager(), new g(getContext()).Er(), aKn(), aKo(), TAG) {
            /* Access modifiers changed, original: protected */
            public void aKr() {
                super.aKr();
                f.this.dyn = false;
                f.this.Lb();
                if (f.this.dym != null) {
                    f fVar = f.this;
                    fVar.d(fVar.dym);
                }
            }
        };
        getFragmentManager().addOnBackStackChangedListener(this.dxW);
        this.dxL = new y(getActivity());
        if (this.dym != null) {
            d(this.dym);
        } else {
            ev(true);
        }
        return this.dyB.getRoot();
    }

    public boolean aKp() {
        return this.dyn;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.kyc_continue_later_documents_menu, menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!t.a(getFragmentManager(), TAG) || menuItem.getItemId() != R.id.action_continue_later_documents) {
            return super.onOptionsItemSelected(menuItem);
        }
        com.iqoption.kyc.a.a.m(aKn(), aKo(), true);
        ev(true);
        v.a(this.dyA.aJZ(), new b(this));
        return true;
    }

    public void onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        MenuItem findItem = menu.findItem(R.id.action_continue_later_documents);
        if (findItem != null) {
            findItem.setEnabled(this.isInProgress ^ 1);
            findItem.setVisible(t.a(getFragmentManager(), TAG));
        }
    }

    private void Lb() {
        s.a((AppCompatActivity) getActivity(), this.dyB.cfS.toolbar);
        if (getActivity() != null) {
            getActivity().invalidateOptionsMenu();
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.dyA = (a) context;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.toString());
        stringBuilder.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(stringBuilder.toString());
    }

    public void onStart() {
        super.onStart();
        y.a(this.dxN);
    }

    public void onStop() {
        super.onStop();
        y.b(this.dxN);
    }

    public void onDetach() {
        super.onDetach();
        this.dyA = null;
    }

    public void onDestroyView() {
        getFragmentManager().removeOnBackStackChangedListener(this.dxW);
        super.onDestroyView();
    }

    public void d(boolean z, boolean z2) {
        this.isInProgress = z;
        View view = z2 ? this.dyB.cgw : this.dyB.cgr;
        View view2 = z2 ? this.dyB.cgv : this.dyB.cgq;
        View view3 = z2 ? this.dyB.cgq : this.dyB.cgv;
        if (z) {
            view3.setEnabled(false);
            this.dyB.cgt.setEnabled(false);
            view.setVisibility(0);
            view.setAlpha(1.0f);
            view2.animate().alpha(0.2f).setInterpolator(new DecelerateInterpolator());
        } else {
            view3.setEnabled(true);
            this.dyB.cgt.setEnabled(true);
            view.animate().alpha(0.0f).setInterpolator(new DecelerateInterpolator()).setListener(new com.iqoption.view.a.a.b(view));
            view2.animate().alpha(1.0f).setInterpolator(new AccelerateInterpolator());
        }
        if (getActivity() != null) {
            getActivity().invalidateOptionsMenu();
        }
    }

    public void ev(boolean z) {
        this.isInProgress = z;
        if (z) {
            this.dyB.cgt.setEnabled(false);
            this.dyB.cgw.setVisibility(0);
            this.dyB.cgw.setAlpha(1.0f);
            this.dyB.cgr.setVisibility(0);
            this.dyB.cgr.setAlpha(1.0f);
            this.dyB.cgv.animate().alpha(0.2f).setInterpolator(new DecelerateInterpolator());
            this.dyB.cgq.animate().alpha(0.2f).setInterpolator(new DecelerateInterpolator());
        } else {
            this.dyB.cgt.setEnabled(true);
            this.dyB.cgw.animate().alpha(0.0f).setInterpolator(new DecelerateInterpolator()).setListener(new com.iqoption.view.a.a.b(this.dyB.cgw));
            this.dyB.cgr.animate().alpha(0.0f).setInterpolator(new DecelerateInterpolator()).setListener(new com.iqoption.view.a.a.b(this.dyB.cgr));
            this.dyB.cgv.animate().alpha(1.0f).setInterpolator(new AccelerateInterpolator());
            this.dyB.cgq.animate().alpha(1.0f).setInterpolator(new AccelerateInterpolator());
        }
        if (getActivity() != null) {
            getActivity().invalidateOptionsMenu();
        }
    }

    public void d(e eVar) {
        this.dym = eVar;
        this.dyB.cgp.setVisibility(0);
        a(eVar, this.dyB.cgv, this.dyB.cgx, VerificationType.POI);
        a(eVar, this.dyB.cgq, this.dyB.cgs, VerificationType.POA);
        if (this.dyD) {
            this.dyB.cgt.setVisibility(8);
        } else {
            this.dyB.cgt.setVisibility(0);
        }
    }

    private void a(e eVar, View view, TextView textView, VerificationType verificationType) {
        boolean d = eVar.d(verificationType);
        Boolean valueOf = Boolean.valueOf(false);
        if (d) {
            textView.setText(R.string.kyc_doc_verified);
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_kyc_document_success, 0, 0, 0);
            textView.setVisibility(0);
            view.setEnabled(false);
            view.setTag(R.id.isDeclined, valueOf);
            if (verificationType == VerificationType.POA) {
                this.dyB.cgp.setVisibility(8);
            }
        } else if (eVar.e(verificationType)) {
            textView.setText(R.string.kyc_doc_under_review);
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_kyc_time, 0, 0, 0);
            textView.setVisibility(0);
            view.setEnabled(false);
            view.setTag(R.id.isDeclined, valueOf);
            if (verificationType == VerificationType.POA) {
                this.dyB.cgp.setVisibility(8);
            }
        } else if (eVar.f(verificationType)) {
            textView.setText(R.string.declined);
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_kyc_document_error, 0, 0, 0);
            textView.setVisibility(0);
            view.setEnabled(true);
            view.setTag(R.id.isDeclined, Boolean.valueOf(true));
        } else {
            textView.setVisibility(8);
            view.setEnabled(true);
            view.setTag(R.id.isDeclined, valueOf);
        }
    }
}
