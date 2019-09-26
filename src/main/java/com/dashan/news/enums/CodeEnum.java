package com.dashan.news.enums;

public enum CodeEnum {

    CODE_200("200","请求成功"),
    CODE_201("201","请求已实现"),
    CODE_202("202","全部"),
    CODE_400("400","接口实现错误"),
    CODE_401("401","无权限"),
    CODE_403("403","拒绝执行"),
    CODE_404("404","无法找到"),
    CODE_500("500","服务内部错误"),
    CODE_501("501","无法识别请求"),
    CODE_9000("9000","该设备已绑定"),
    CODE_9001("9001","你的账号绑定过多"),
    CODE_9999("9999","token异常");

    private String code;
    private String name;


    CodeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getNameByCode(String code) {
        if (code == null) {
            return null;
        }
        for (CodeEnum e : CodeEnum.values()) {
            if (code.equalsIgnoreCase(e.code)) {
                return e.name;
            }
        }
        return null;
    }
}
