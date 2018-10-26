package com.qfedu.gz.common.utils;


import com.qfedu.gz.common.vo.R;

/**
 * 描述:
 * 通用的返回工具
 *
 * @author szp
 * @create 2018-10-23 14:37
 */
public class RUtils {

    public static R setOK(String msg){
        return new R(200,msg,null);
    }

    public static R setERROR(String msg){
        return new R(400,msg,null);
    }

    //插入修改获取返回值
    public static R getR(int count){
        if(count > 0) {
            return new R(200,"操作成功",null);
        }else{
            return new R(400,"操作失败",null);
        }
    }

    public static R getR(int code,String msg,Object obj){
        return new R(code,msg,obj);
    }

}
