package com.allen.common.baselib.lang;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串操作类
 * Copyright:   Copyright(C) 2016
 * Company:     HQYG.
 * author:      allen
 * Createdate:  2016年12月5日下午3:41:53
 */
public class Strings extends StringUtils{

	/**
	 * @description 如果字符串为null或“”,则返回true
	 * @param str
	 * @return
	 */
	public static boolean isEmpth(String str){
		return str == null || str.length()==0;
	}
	
	public static boolean isNotEmpth(String str){
		return !isEmpth(str);
	}
	
	/**
	 * @description 判断是否是null或者全为空白字符
	 * @param str
	 * @return
	 */
	public static boolean isBland(String str){
		if(str == null)
			return true;
		
		int length = str.length();
		for (int i = 0; i < length; i++) {
			if(!Character.isWhitespace(str.charAt(i)) ){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isNotBlank(String str){
		return !isBlank(str);
	}
	

	public static void main(String[] args) {
		String str = "";
		System.out.println(str.length());
		//char c = str.charAt(0);
		//System.out.println(c);
		System.out.println(isBland(str));

	}

}
