package com.teach.teach1907.model;

import com.teach.frame.ApiConfig;
import com.teach.frame.ICommonModel;
import com.teach.frame.ICommonPresenter;
import com.teach.frame.NetManger;
import java.util.Map;



public class TestModel implements ICommonModel {
    NetManger mManger = NetManger.getInstance();

    @Override
    public void getData(final ICommonPresenter pPresenter, final int whichApi, Object[] params) {
        switch (whichApi) {
            case ApiConfig.TEST_GET:
                mManger.netWork(mManger.getService().getTestData((Map) params[1], (int) params[2]), pPresenter, whichApi, (int) params[0]);
                break;
        }
    }

}
