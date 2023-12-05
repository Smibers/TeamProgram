// Generated by view binder compiler. Do not edit!
package com.cps298.chaching.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cps298.chaching.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MainFragment2Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button addButton;

  @NonNull
  public final Button ascButton;

  @NonNull
  public final EditText cardBrand;

  @NonNull
  public final EditText cardName;

  @NonNull
  public final TextView contactID;

  @NonNull
  public final RecyclerView contactRecycler;

  @NonNull
  public final Button deleteButton;

  @NonNull
  public final Button descButton;

  @NonNull
  public final EditText expiration;

  @NonNull
  public final EditText fee;

  @NonNull
  public final Button findButton;

  @NonNull
  public final LinearLayout main;

  @NonNull
  public final EditText perk;

  @NonNull
  public final Button switchFragment;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextView textView4;

  @NonNull
  public final EditText useCategory;

  private MainFragment2Binding(@NonNull LinearLayout rootView, @NonNull Button addButton,
      @NonNull Button ascButton, @NonNull EditText cardBrand, @NonNull EditText cardName,
      @NonNull TextView contactID, @NonNull RecyclerView contactRecycler,
      @NonNull Button deleteButton, @NonNull Button descButton, @NonNull EditText expiration,
      @NonNull EditText fee, @NonNull Button findButton, @NonNull LinearLayout main,
      @NonNull EditText perk, @NonNull Button switchFragment, @NonNull TextView textView,
      @NonNull TextView textView3, @NonNull TextView textView4, @NonNull EditText useCategory) {
    this.rootView = rootView;
    this.addButton = addButton;
    this.ascButton = ascButton;
    this.cardBrand = cardBrand;
    this.cardName = cardName;
    this.contactID = contactID;
    this.contactRecycler = contactRecycler;
    this.deleteButton = deleteButton;
    this.descButton = descButton;
    this.expiration = expiration;
    this.fee = fee;
    this.findButton = findButton;
    this.main = main;
    this.perk = perk;
    this.switchFragment = switchFragment;
    this.textView = textView;
    this.textView3 = textView3;
    this.textView4 = textView4;
    this.useCategory = useCategory;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MainFragment2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MainFragment2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.main_fragment2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MainFragment2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addButton;
      Button addButton = ViewBindings.findChildViewById(rootView, id);
      if (addButton == null) {
        break missingId;
      }

      id = R.id.ascButton;
      Button ascButton = ViewBindings.findChildViewById(rootView, id);
      if (ascButton == null) {
        break missingId;
      }

      id = R.id.cardBrand;
      EditText cardBrand = ViewBindings.findChildViewById(rootView, id);
      if (cardBrand == null) {
        break missingId;
      }

      id = R.id.cardName;
      EditText cardName = ViewBindings.findChildViewById(rootView, id);
      if (cardName == null) {
        break missingId;
      }

      id = R.id.contactID;
      TextView contactID = ViewBindings.findChildViewById(rootView, id);
      if (contactID == null) {
        break missingId;
      }

      id = R.id.contact_recycler;
      RecyclerView contactRecycler = ViewBindings.findChildViewById(rootView, id);
      if (contactRecycler == null) {
        break missingId;
      }

      id = R.id.deleteButton;
      Button deleteButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteButton == null) {
        break missingId;
      }

      id = R.id.descButton;
      Button descButton = ViewBindings.findChildViewById(rootView, id);
      if (descButton == null) {
        break missingId;
      }

      id = R.id.expiration;
      EditText expiration = ViewBindings.findChildViewById(rootView, id);
      if (expiration == null) {
        break missingId;
      }

      id = R.id.fee;
      EditText fee = ViewBindings.findChildViewById(rootView, id);
      if (fee == null) {
        break missingId;
      }

      id = R.id.findButton;
      Button findButton = ViewBindings.findChildViewById(rootView, id);
      if (findButton == null) {
        break missingId;
      }

      LinearLayout main = (LinearLayout) rootView;

      id = R.id.perk;
      EditText perk = ViewBindings.findChildViewById(rootView, id);
      if (perk == null) {
        break missingId;
      }

      id = R.id.switchFragment;
      Button switchFragment = ViewBindings.findChildViewById(rootView, id);
      if (switchFragment == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.textView4;
      TextView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.useCategory;
      EditText useCategory = ViewBindings.findChildViewById(rootView, id);
      if (useCategory == null) {
        break missingId;
      }

      return new MainFragment2Binding((LinearLayout) rootView, addButton, ascButton, cardBrand,
          cardName, contactID, contactRecycler, deleteButton, descButton, expiration, fee,
          findButton, main, perk, switchFragment, textView, textView3, textView4, useCategory);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}