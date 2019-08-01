package com.practice.develop.util;

import sun.applet.Main;

import java.security.MessageDigest;

/**
 * 类描述：MD5数据签名加密
 * Created by 李泽阳 on 2019/2/14
 */
public class MD5Util {

    //MD5-32位签名算法
    public static String MD5Code(String source) {
        String resultStr = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");//MessageDigest jdk 1.8数字签名
            if (!"".equals(source) && null != source)
                resultStr = byteArrayToHexString(md5.digest(source.getBytes())); //字符串报文
            else
                return "数据源不可为空!";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultStr;
    }

    // byte[]数组 转换String
    private static String byteArrayToHexString(byte[] bytes) {
        StringBuffer resultStrBuff = new StringBuffer();
        for (int i = 0; i < bytes.length; i++)
            resultStrBuff.append(byteToHexString(bytes[i]));

        return resultStrBuff.toString();
    }

    //byte 转换String
    private static String byteToHexString(byte bytes) {
        int n = bytes;
        if (n < 0)
            n += 256;
        int d1 = n / 16;//求整数
        int d2 = n % 16; //求余数
        return hexDigits[d1] + hexDigits[d2];
    }

    //hex 16进制取值(取下标数)
    private static final String hexDigits[] =
            {"0", "1", "2", "3", "4", "5", "6", "7", "a", "b", "c", "d", "e", "f", "g", "h"};


    //编写可逆加密
    public static String encryption(String source) {
        char[] a = source.toCharArray();
        for (int i = 0; i < a.length; i++)
            a[i] = (char) (a[i] ^ 's');
        String str = new String(a);
        return str;
    }

    // 加密后解密
    public static String JM(String source) {
        char[] a = source.toCharArray();
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (a[i] ^ 't');
        }
        String str = new String(a);
        return str;
    }

    //测试类
    public static void main(String[] args) {
        String s = MD5Util.MD5Code("lizyang");
        //String s = encryption("123456");
        System.out.print(s);
        System.out.println("-----------------------" + s.length());
    }


}
