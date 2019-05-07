package com.zhao.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.ui.Model;

public class JSONResult {

    public static JSONObject success(Object object , int code) {
        JSONObject jsonObject = new JSONObject(true);
        jsonObject.put("result",JSON.toJSON(object));
        jsonObject.put("msg","OK");
        jsonObject.put("code",code);
        return jsonObject;
    }

    public static JSONObject success() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",0);
        jsonObject.put("msg","OK");
        return jsonObject;
    }

    public static JSONObject success(String message , int code) {
        JSONObject jsonObject = new JSONObject(true);
        jsonObject.put("code",code);
        jsonObject.put("msg","OK");
        jsonObject.put("result",message);
        return jsonObject;
    }

    public static JSONObject success(JSONObject jsonObject) {
        return success((JSON)jsonObject,0);
    }

    public static JSONObject success(JSON json) {
        return success(json,0);
    }

    public static JSONObject success(Object object) {
        return success(object,0);
    }

    public static JSONObject fail(int code, String msg) {
        JSONObject jsonObject = new JSONObject(true);
        jsonObject.put("code",code);
        jsonObject.put("msg",msg);
        return  jsonObject;
    }

    public static JSONObject fail(String msg) {
        return fail(1,msg);
    }

    public static JSONObject fail() {
        return fail("error") ;
    }



}
