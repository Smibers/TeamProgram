// Generated by view binder compiler. Do not edit!
package com.cps298.chaching.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cps298.chaching.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class NavControllerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final FragmentContainerView fragmentContainerView2;

  private NavControllerBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout container, @NonNull FragmentContainerView fragmentContainerView2) {
    this.rootView = rootView;
    this.container = container;
    this.fragmentContainerView2 = fragmentContainerView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static NavControllerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static NavControllerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.nav_controller, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static NavControllerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout container = (ConstraintLayout) rootView;

      id = R.id.fragmentContainerView2;
      FragmentContainerView fragmentContainerView2 = ViewBindings.findChildViewById(rootView, id);
      if (fragmentContainerView2 == null) {
        break missingId;
      }

      return new NavControllerBinding((ConstraintLayout) rootView, container,
          fragmentContainerView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
