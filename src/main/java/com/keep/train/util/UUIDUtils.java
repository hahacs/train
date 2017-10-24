package com.keep.train.util;

import java.util.UUID;

import org.apache.commons.lang.StringUtils;


public abstract class UUIDUtils {

    public static String randomUUID(){
        String uuid = UUID.randomUUID().toString();
        return StringUtils.remove(uuid,"-");
    }
    
    /**
     * 生产64位UUID
     * @create 2015年1月30日 下午4:59:47
     * @return
     * @description
     */
    public static String generateUUID64(){
    	return (randomUUID()+randomUUID());
    }

    public static void main(String[] args) {
        System.out.println(UUIDUtils.generateUUID64());

    }
}
