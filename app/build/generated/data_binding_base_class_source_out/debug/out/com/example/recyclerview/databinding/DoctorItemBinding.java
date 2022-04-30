// Generated by view binder compiler. Do not edit!
package com.example.recyclerview.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.recyclerview.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DoctorItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton ibPhoneCall;

  @NonNull
  public final ImageView imgDoctor;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvRole;

  private DoctorItemBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton ibPhoneCall,
      @NonNull ImageView imgDoctor, @NonNull TextView tvName, @NonNull TextView tvRole) {
    this.rootView = rootView;
    this.ibPhoneCall = ibPhoneCall;
    this.imgDoctor = imgDoctor;
    this.tvName = tvName;
    this.tvRole = tvRole;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DoctorItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DoctorItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.doctor_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DoctorItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ib_phoneCall;
      ImageButton ibPhoneCall = ViewBindings.findChildViewById(rootView, id);
      if (ibPhoneCall == null) {
        break missingId;
      }

      id = R.id.img_doctor;
      ImageView imgDoctor = ViewBindings.findChildViewById(rootView, id);
      if (imgDoctor == null) {
        break missingId;
      }

      id = R.id.tv_name;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tv_role;
      TextView tvRole = ViewBindings.findChildViewById(rootView, id);
      if (tvRole == null) {
        break missingId;
      }

      return new DoctorItemBinding((ConstraintLayout) rootView, ibPhoneCall, imgDoctor, tvName,
          tvRole);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
