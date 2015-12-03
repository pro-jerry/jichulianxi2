package com.hj.sort.refType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.hj.sort.innerType.Utils;

public class NewsItemApp {

	public static void main(String[] args) {
		
		List<NewsItem> news = new ArrayList<NewsItem>();
		news.add(new NewsItem("中国登上钓鱼岛", 100, new Date()));
		news.add(new NewsItem("凤凰网，在播出", 50, new Date(System.currentTimeMillis()-1000*60*60)));
		news.add(new NewsItem("成都雾霾",60, new Date(System.currentTimeMillis()-1000*60*60)));
		
		System.out.println("排序前"+news);
		
		//排序
//		Collections.sort(news);
		Utils.sort3(news);
		
		System.out.println("排序后"+news);
	}
}
