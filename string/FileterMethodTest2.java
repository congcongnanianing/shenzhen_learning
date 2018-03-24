package cn.itcast.string;

import java.io.File;

import cn.itcast.filter.FilterBySuffix;

public class FileterMethodTest2 {
	public static void main(String[] args) {
		/*
		 * 需求：只获取指定目录下的.java文件   list(FilenameFilter filter);
		 */ 
		File dir = new File("E:\\");
		//String[] names = dir.list(); //将E:\ 下的所有文件以数组的形式保存
		String[] names = dir.list(new FilterBySuffix(".java"));
		for(String abc: names){  //foreach遍历数组
			//if(abc.endsWith(".java")){ //过滤出以  .java结尾的文件
				System.out.println(abc);
			}
		}
		/*
		 * 这种遍历虽然也能实现过滤，但是每次过滤条件不确定（或是判断是否以.java结尾，
		 * 或是判断文件名称包含 demo）。过滤方式和条件耦合性太强。
		 * 
		 * 这个时候需要对过滤方式和过滤条件进行解耦。
		 * 使用文件名过滤接口 FilenameFilter
		 * 
		 */
		
		//创建一个过滤器对象。。见FilterBySuffix类
		//传入过滤器
		
		
	}


