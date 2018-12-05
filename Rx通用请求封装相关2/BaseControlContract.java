package com.x.finance.controller;

import java.util.HashMap;
import java.util.List;

/*
*@Description: 服务+视图层的纽带
*@Author: hl
*@Time: 2018/11/21 13:55
*/
public interface BaseControlContract {
    /**
     * 负责设置界面
     */
    interface View extends BaseView{
        <T> void onSucess(T t);
        void onFailed(Class _dataModelclass, String _message);
    }

    interface WithPicView extends BasePicView{
        <T> void onSucess(T t);
        void onFailed(Class _dataModelclass, String _message);
    }

    interface RefreshView extends BaseViewByRefresh{
        <T> void onSucess(List<T> listT);
    }

    /**
     * 负责请求网络获取数据
     */
    interface Presenter extends BasePresenter{
        /**
         * 请求数据【对象】
         * @param _dataModelclass - 实体类类型
         * @param _paramList
         */
        void requestData(Class _dataModelclass, HashMap<String, String> _paramList, boolean _bShowDialog);
        /**
         * 请求数据【对象】
         * @param _dataModelclass - 实体类类型
         * @param _paramList
         */
        void postData(Class _dataModelclass, HashMap<String, String> _paramList, boolean _bShowDialog);
        /**
         * 请求数据【对象】列表
         * @param _dataModelclass - 实体类类型
         * @param _pageNum
         * @param _bIsRefresh
         */
        void requestDataList(Class _dataModelclass, int _pageNum, boolean _bIsRefresh);
        /**
         * 请求数据【对象】列表
         * @param _dataModelclass - 实体类类型
         * @param _paramList
         * @param _bIsRefresh
         */
        void requestDataList(Class _dataModelclass, int _pageNum, HashMap<String, String> _paramList, boolean _bIsRefresh);
        /**
         * 请求数据【对象】列表
         * @param _dataModelclass - 实体类类型
         * @param _pageNum
         * @param _bIsRefresh
         */
        void postDataList(Class _dataModelclass, int _pageNum, boolean _bIsRefresh);
        /**
         * 请求数据【对象】列表
         * @param _dataModelclass - 实体类类型
         * @param _paramList
         * @param _bIsRefresh
         */
        void postDataList(Class _dataModelclass, int _pageNum, HashMap<String, String> _paramList, boolean _bIsRefresh);
    }
}
