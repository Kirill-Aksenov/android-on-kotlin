// Generated by view binder compiler. Do not edit!
package ru.geekbrains.lesson04.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ru.geekbrains.lesson04.R;

public final class FragmentMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton mainFragmentFAB;

  @NonNull
  public final FrameLayout mainFragmentLoadingLayout;

  @NonNull
  public final RecyclerView mainFragmentRecyclerView;

  @NonNull
  public final ConstraintLayout mainFragmentRootView;

  private FragmentMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton mainFragmentFAB, @NonNull FrameLayout mainFragmentLoadingLayout,
      @NonNull RecyclerView mainFragmentRecyclerView,
      @NonNull ConstraintLayout mainFragmentRootView) {
    this.rootView = rootView;
    this.mainFragmentFAB = mainFragmentFAB;
    this.mainFragmentLoadingLayout = mainFragmentLoadingLayout;
    this.mainFragmentRecyclerView = mainFragmentRecyclerView;
    this.mainFragmentRootView = mainFragmentRootView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mainFragmentFAB;
      FloatingActionButton mainFragmentFAB = rootView.findViewById(id);
      if (mainFragmentFAB == null) {
        break missingId;
      }

      id = R.id.mainFragmentLoadingLayout;
      FrameLayout mainFragmentLoadingLayout = rootView.findViewById(id);
      if (mainFragmentLoadingLayout == null) {
        break missingId;
      }

      id = R.id.mainFragmentRecyclerView;
      RecyclerView mainFragmentRecyclerView = rootView.findViewById(id);
      if (mainFragmentRecyclerView == null) {
        break missingId;
      }

      ConstraintLayout mainFragmentRootView = (ConstraintLayout) rootView;

      return new FragmentMainBinding((ConstraintLayout) rootView, mainFragmentFAB,
          mainFragmentLoadingLayout, mainFragmentRecyclerView, mainFragmentRootView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
