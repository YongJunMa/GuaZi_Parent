package com.qfedu.gz.common.utils;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author xing
 * 基于HttpUrlConnection实现网络交换
 */
public class HttpUtils {

	public static String getLocation(String ip) {
		BufferedReader reader=null;
		HttpURLConnection huc=null;
		try {
			//创建请求的路径对象
			URL url=new URL(ip);
			//获取连接对象
			huc=(HttpURLConnection) url.openConnection();
			//连接
			huc.connect();
			//验证状态响应码
			if(huc.getResponseCode()==200) {
				//从响应字节流中获取内容
				StringBuffer buffer=new StringBuffer();
				reader=new BufferedReader(new InputStreamReader(huc.getInputStream(),"UTF-8"));
				String msg=null;
				while ((msg=reader.readLine())!=null) {
					buffer.append(msg);
				}
				
				return buffer.toString();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			huc.disconnect();
		}
		return null;
	}
	public static String pullData(String url){
		HttpClient client= HttpClientBuilder.create().build();
		return null;
	}



}
