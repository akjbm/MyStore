package com.a135.common.Base;

import android.os.Bundle;

import org.reactivestreams.Subscription;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by 135 on 2016/10/17.
 */

public class BaseActivity extends MonitoredActivity {

  private List<Subscription> subscriptions = new ArrayList<>();

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override protected void onStop() {
    super.onStop();
  }

  @Override protected void onDestroy() {
    super.onDestroy();
  }

  public void addSubscription(Subscription subscription) {
    subscriptions.add(subscription);
  }


}
