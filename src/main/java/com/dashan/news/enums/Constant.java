package com.dashan.news.enums;

public class Constant {
    /**
     * =============================== json响应体状态码 开始
     * ===============================
     */
    // 成功返回
    public static final Boolean RETURN_CODE_SUCCESS = true;

    // 异常返回
    public static final Boolean RETURN_CODE_FAIL = false;

    // 手机号码正则表达式
    public static final String TEL_TEGULAR_EXPRESSION = "^1[34578]\\d{9}$";
    // 身份证号码正则表达式
    public static final String ID_CARD_TEGULAR_EXPRESSION = "(^[1-9]\\d{5}(18|19|([23]\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)|(^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{2}[0-9Xx]$)";
    // 8-16个字符，至少1个大写字母，1个小写字母和1个数字，其他可以是任意字符：
    public static final String PASSWORD_TEGULAR_EXPRESSION = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z0-9_.]{6,16}$";
    // 验证邮箱正则表达式
    public static final String MAIL_TEGULAR_EXPRESSION_OLD = "\\w+@\\w+\\.[a-z]+(\\.[a-z]+)?";
    // 邮箱验证
    public static final String MAIL_TEGULAR_EXPRESSION = "^[A-Za-z\\d]+([-_.][A-Za-z\\d]+)*@([A-Za-z\\d]+[-.])+[A-Za-z\\d]{2,4}$";

}
