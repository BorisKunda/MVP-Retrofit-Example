package com.mobotechnology.bipinpandey.retrofit_handdirty.main_activity;

import android.util.Log;

import com.mobotechnology.bipinpandey.retrofit_handdirty.model.Notice;

import java.util.ArrayList;

/**
 * Created by bpn on 12/7/17.
 */

public class Presenter implements MainContract.presenterInterface, MainContract.GetNoticeIntractor.OnFinishedListener {

    private MainContract.MainView mainView;
    private MainContract.GetNoticeIntractor getNoticeIntractor;

    public Presenter(MainContract.MainView mainView, MainContract.GetNoticeIntractor getNoticeIntractor) {
        this.mainView = mainView;
        this.getNoticeIntractor = getNoticeIntractor;
    }

    @Override
    public void onDestroy() {

        mainView = null;

    }

    @Override
    public void onRefreshButtonClick() {

        if(mainView != null){
            mainView.showProgress();
        }
        getNoticeIntractor.getNoticeArrayList(this);

    }

    @Override
    public void requestDataFromServer() {
        getNoticeIntractor.getNoticeArrayList(this);
    }


    @Override
    public void onFinished(ArrayList<Notice> noticeArrayList) {
        Log.d("d","d" );
        if(mainView != null){
            mainView.setDataToRecyclerView(noticeArrayList);
            mainView.hideProgress();
        }
    }

    @Override
    public void onFailure(Throwable t) {
        if(mainView != null){
            mainView.onResponseFailure(t);
            mainView.hideProgress();
        }
    }
}
