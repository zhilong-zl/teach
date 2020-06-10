package com.teach.frame;

import com.google.gson.JsonObject;
import com.teach.data.BaseInfo;
import com.teach.data.CourseListInfo;
import com.teach.data.DataGroupListEntity;
import com.teach.data.IndexCommondEntity;
import com.teach.data.LoginInfo;
import com.teach.data.MainAdEntity;
import com.teach.data.PersonHeader;
import com.teach.data.SpecialtyChooseEntity;
import com.teach.data.TestInfo;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;


public interface IService {
    @GET
    Observable<BaseInfo<MainAdEntity>> getAdvert(@Url String url,@QueryMap Map<String,Object> pMap);

    @GET("/")
    Observable<TestInfo> getTestData(@QueryMap Map<String, Object> params, @Query("page_id") int pageId);

    @GET
    Observable<BaseInfo<List<SpecialtyChooseEntity>>> getSubjectList(@Url String url);

    @GET("loginByMobileCode")
    Observable<BaseInfo<String>> getLoginVerify(@Query("mobile") String mobile);

    @GET("loginByMobileCode")
    Observable<BaseInfo<LoginInfo>> loginByVerify(@QueryMap Map<String, Object> params);

    @POST
    @FormUrlEncoded
    Observable<BaseInfo<PersonHeader>> getHeaderInfo(@Url String url,@FieldMap Map<String,Object> params);

    @GET
    Observable<BaseInfo<List<IndexCommondEntity>>> getCommonList(@Url String url,@QueryMap Map<String,Object> params);

    @GET
    Observable<JsonObject> getBannerLive(@Url String url,@QueryMap Map<String,Object> params);

    @GET
    Observable<BaseInfo<CourseListInfo>> getCourseChildData(@Url String url, @QueryMap Map<String,Object> params);

    @GET
    Observable<BaseInfo<List<DataGroupListEntity>>> getGroupList(@Url String url, @QueryMap Map<String,Object> params);

    @POST
    @FormUrlEncoded
    Observable<BaseInfo> removeFocus(@Url String url, @FieldMap Map<String,Object> params);

    @POST
    @FormUrlEncoded
    Observable<BaseInfo> focus(@Url String url, @FieldMap Map<String,Object> params);
}
