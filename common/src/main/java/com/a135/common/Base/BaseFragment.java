package com.a135.common.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.reactivestreams.Subscription;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 135 on 2016/11/7.
 */

public class BaseFragment extends Fragment {

  private List<Subscription> subscriptions = new ArrayList<>();

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    return super.onCreateView(inflater, container, savedInstanceState);
  }

  @Override public void onDestroyView() {
    super.onDestroyView();
  }

  public void addSubscription(Subscription subscription) {
    subscriptions.add(subscription);
  }
}
