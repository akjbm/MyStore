package com.a135.common.Base;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import org.reactivestreams.Subscription;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by 135 on 2016/11/7.
 */

public class BaseDialog extends Dialog {

  private List<Subscription> subscriptions = new ArrayList<>();

  public BaseDialog(Context context) {
    super(context);
  }

  public BaseDialog(Context context, int themeResId) {
    super(context, themeResId);
  }

  protected BaseDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
    super(context, cancelable, cancelListener);
  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
  }

  public void addSubscription(Subscription subscription) {
    subscriptions.add(subscription);
  }
}
