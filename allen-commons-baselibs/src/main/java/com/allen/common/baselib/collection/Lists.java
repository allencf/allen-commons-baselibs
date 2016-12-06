package com.allen.common.baselib.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public abstract class Lists{
	
	
	/**
	 * 创建一个集合对象
	 * @return
	 */
	public static <E> List<E> newList(){
		return new ArrayList<>();
	}
	
	
	/**
	 * 判断集合为空
	 * @param list
	 * @return
	 */
	public static <E> boolean  isEmpty(Collection<E> list){
		return list == null || list.size() == 0;
	}
	
	
	/**
	 * 判断集合不为空
	 * @param list
	 * @return
	 */
	public static <E> boolean isNotEmpty(Collection<E> list){
		return !isEmpty(list);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
