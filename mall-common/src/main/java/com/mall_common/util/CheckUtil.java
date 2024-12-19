package com.mall_common.util;


public class CheckUtil {
    public static boolean checkPhone(String phone){
        if(phone==null) return false;
        return phone.matches("^1[3-9]\\d{9}$");
    }

    public static boolean checkPasswordLength(String password) {
        if(password==null) return false;
        return password.length() >= 6 && password.length() <= 13;
    }
}
