package com.reactnativenavigation.mocks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

import com.reactnativenavigation.interfaces.ScrollEventListener;
import com.reactnativenavigation.viewcontrollers.IReactView;

public class TestReactView extends FrameLayout implements IReactView {

    public TestReactView(@NonNull Context context) {
        super(context);
    }

    @Override
    public boolean isReady() {
        return false;
    }

    @Override
    public View asView() {
        return this;
    }

    @Override
    public void destroy() {

    }

    @Override
    public void sendComponentStart() {

    }

    @Override
    public void sendComponentStop() {

    }

    @Override
    public void sendOnNavigationButtonPressed(String buttonId) {

    }

    @Override
    public ScrollEventListener getScrollEventListener() {
        return null;
    }

    @Override
    public void dispatchTouchEventToJs(MotionEvent event) {

    }
}
