package com.teach.teach1907.model;

import com.teach.frame.ApiConfig;
import com.teach.frame.FrameApplication;
import com.teach.frame.Host;
import com.teach.frame.ICommonModel;
import com.teach.frame.ICommonPresenter;
import com.teach.frame.NetManger;
import com.teach.frame.constants.Constants;
import com.teach.frame.utils.ParamHashMap;
import com.teach.teach1907.constants.Method;


public class CourseModel implements ICommonModel {
    private String subjectId = FrameApplication.getFrameApplication().getSelectedInfo().getSpecialty_id();
    @Override
    public void getData(ICommonPresenter pPresenter, int whichApi, Object[] params) {
        switch (whichApi){
            case ApiConfig.COURSE_CHILD:
                ParamHashMap add = new ParamHashMap().add("specialty_id", subjectId).add("page", params[2]).add("limit", Constants.LIMIT_NUM).add("course_type", params[1]);
                NetManger.getInstance().netWork(NetManger.mService.getCourseChildData(Host.EDU_OPENAPI+ Method.GETLESSONLISTFORAPI,add),pPresenter,whichApi,params[0]);
                break;
        }
    }
}
