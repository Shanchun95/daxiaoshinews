package com.dashan.news.common;




import com.alibaba.fastjson.JSON;
import com.dashan.news.enums.CodeEnum;
import com.dashan.news.enums.Constant;
import java.util.HashMap;

public class ResponseMap extends HashMap {
    public static final String MESSAGE = "message";        //操作信息
    public static final String CODE = "code";              //状态编号
    public static final String SUCCESS = "success";        //操作状态
    public static final Object DATA = "data";              //方法传递的参数
    public static final String  TIMESTAMP = "timestamp";   //时间标识

    public static ResponseMap newMap() {
        return new ResponseMap();
    }
    public ResponseMap setMessage(String message) {
        this.put(MESSAGE, message);
        return this;
    }
    public ResponseMap setSuccess(Boolean code){
        this.put(SUCCESS,code);
        return this;
    }
    public ResponseMap setTimestamp(){
        this.put(TIMESTAMP,System.currentTimeMillis());
        return this;
    }
    public ResponseMap setData(Object data){
        this.put(DATA,data);
        return this;
    }
    public ResponseMap setData(String dataField, Object data){
        this.put(dataField,data);
        return this;
    }
    public ResponseMap setCode(String code){
        this.put(CODE,code);
        return this;
    }
    public String toJSONString(){
        return JSON.toJSONString(this);
    }
    public ResponseMap newMap(String code){
        ResponseMap map = new ResponseMap();
        map.put(MESSAGE,"");
        map.put(SUCCESS, code);
        map.put(TIMESTAMP, System.currentTimeMillis());
        return map;
    }
    public ResponseMap newMap(String code, String message){
        ResponseMap map = new ResponseMap();
        map.put(MESSAGE, message);
        map.put(SUCCESS, code);
        map.put(TIMESTAMP, System.currentTimeMillis());
        return map;
    }
    public static ResponseMap success(){
        ResponseMap map = new ResponseMap();
        map.put(MESSAGE, "操作成功");
        map.put(SUCCESS, Constant.RETURN_CODE_SUCCESS);
        map.put(TIMESTAMP, System.currentTimeMillis());
        map.put(CODE, CodeEnum.CODE_200.getCode());
        return map;
    }
    public static ResponseMap success(Object data){
        ResponseMap map = new ResponseMap();
        map.put(MESSAGE, "操作成功");
        map.put(SUCCESS, Constant.RETURN_CODE_SUCCESS);
        map.put(TIMESTAMP, System.currentTimeMillis());
        map.put(CODE, CodeEnum.CODE_200.getCode());
        map.put(DATA, data);
        return map;
    }
    public static ResponseMap success(String message){
        ResponseMap map = new ResponseMap();
        map.put(MESSAGE, message);
        map.put(SUCCESS, Constant.RETURN_CODE_SUCCESS);
        map.put(TIMESTAMP, System.currentTimeMillis());
        map.put(CODE, CodeEnum.CODE_200.getCode());
        return map;
    }
    public static ResponseMap success(String message,Object data){
        ResponseMap map = new ResponseMap();
        map.put(MESSAGE, message);
        map.put(SUCCESS, Constant.RETURN_CODE_SUCCESS);
        map.put(TIMESTAMP, System.currentTimeMillis());
        map.put(CODE, CodeEnum.CODE_200.getCode());
        map.put(DATA, data);
        return map;
    }
    public static ResponseMap fail(){
        ResponseMap map = new ResponseMap();
        map.put(MESSAGE, "系统错误");
        map.put(SUCCESS, Constant.RETURN_CODE_FAIL);
        map.put(TIMESTAMP, System.currentTimeMillis());
        return map;
    }
    public static ResponseMap fail(String message){
        ResponseMap map = new ResponseMap();
        map.put(MESSAGE, message);
        map.put(SUCCESS, Constant.RETURN_CODE_FAIL);
        map.put(TIMESTAMP, System.currentTimeMillis());
        map.put(CODE, CodeEnum.CODE_400.getCode());
        return map;
    }

}
