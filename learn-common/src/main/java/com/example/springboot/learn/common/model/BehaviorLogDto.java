package com.example.springboot.learn.common.model;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 *
 * @author: xiaoTaoShi
 * @date: 2019/6/13 15:12
 * @version 1.0.0
 * @copyright (C) 2013 WonHigh Information Technology Co.,Ltd 
 *  All Rights Reserved. 
 *
 * The software for the WonHigh technology development, without the 
 * company's written consent, and any other individuals and 
 * organizations shall not be used, Copying, Modify or distribute 
 * the software.
 */

public class BehaviorLogDto implements Serializable {
	
	private static final long serialVersionUID = -1187240330650459604L;
	
	private String app;
	
	private String type;
	
	private String key;
	
	private String code;
	
	private String tag;
	
	private String time;
	
	private Map<String, Object> param;
	
	private String note;
	
	public String getApp() {
		return app;
	}
	
	public void setApp(String app) {
		this.app = app;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getTag() {
		return tag;
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
	
	public Map<String, Object> getParam() {
		return param;
	}
	
	public void setParam(Map<String, Object> param) {
		this.param = param;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public String toString() {
		return "BehaviorLogDto{" +
				"app='" + app + '\'' +
				", type='" + type + '\'' +
				", key='" + key + '\'' +
				", code='" + code + '\'' +
				", tag='" + tag + '\'' +
				", time='" + time + '\'' +
				", param=" + param +
				", note='" + note + '\'' +
				'}';
	}
	
	public static void main(String[] args) {
		
		String str = "\"app\":\"retail_pos\",\"type\":\"行为分析\",\"key\":\"18059464\",\"code\":\"登录\",\"tag\":\"app登录\",\"time\":\"2019-06-13\",\"param\":{\"total\":1000,\"time\":\"2019-06-06\"},\"note\":\"数量大于1000\"";
		String ss = "{\"app\":\"retail_pos\",\"type\":\"行为分析\",\"key\":\"18059464\",\"code\":\"登录\",\"tag\":\"app登录\",\"time\":\"2019-06-13\",\"param\":{\"total\":1000,\"time\":\"2019-06-06\"},\"note\":\"数量大于1000\"}";
		
		BehaviorLogDto behaviorLogDto = new BehaviorLogDto();
		behaviorLogDto.setApp("retail_pos");
		behaviorLogDto.setType("行为分析");
		behaviorLogDto.setKey("18059464");
		behaviorLogDto.setCode("登录");
		behaviorLogDto.setTag("app登录");
		behaviorLogDto.setTime(LocalDate.now().toString());
		Map<String, Object> param = new HashMap<>();
		LocalDate date = LocalDate.of(2019, 06, 06);
		String format = date.format(DateTimeFormatter.ISO_DATE);
		param.put("time", format);
		param.put("total", 1000);
		behaviorLogDto.setParam(param);
		behaviorLogDto.setNote("数量大于1000");
		String string = JSON.toJSONString(behaviorLogDto);
		System.out.println("behaviorLogDto:" + string);
	}
	
}
