package com.hj.sort.refType;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 新闻条目的实体类
 * @author Administrator
 *
 */
public class NewsItem implements java.lang.Comparable<NewsItem>{

	//新闻条目
	private String title;
	//点击量
	private int hite;
	//时间
	private Date pubTime;
	
	//时间降序+点击率升序+标题升序
	@Override
	public int compareTo(NewsItem o) {

		int result = 0;
		//比较时间
		result = -this.pubTime.compareTo(pubTime);
		if(result==0){//时间相同
			//点击量
			result=this.hite-o.hite;//升序
			if(0==result){//点击量相同
				//标题
				result = -this.title.compareTo(o.title);
				return result;
			}
		}
		return result;
	}
	
	public NewsItem() {
		super();
	}
	
	
	public NewsItem(String title, int hite, Date pubTime) {
		super();
		this.title = title;
		this.hite = hite;
		this.pubTime = pubTime;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHite() {
		return hite;
	}
	public void setHite(int hite) {
		this.hite = hite;
	}
	public Date getPubTime() {
		return pubTime;
	}
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("标题|").append(this.title);
		sb.append(",时间").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.pubTime));
		sb.append(",点击量").append(this.hite).append("\n");
		
		return sb.toString();
	}

	
	
	
	
	
	
}
