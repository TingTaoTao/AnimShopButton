package com.shoplibrary;

/**
 * Created by jiatao on 2017/1/19.
 * 加减View的接口
 */

public interface IOnAddDelListener {
    enum FailType {
        COUNT_MAX, COUNT_MIN
    }

    void onAddSuccess(int count);

    void onAddFailed(int count, FailType failType);

    void onDelSuccess(int count);

    void onDelFaild(int count, FailType failType);
}
