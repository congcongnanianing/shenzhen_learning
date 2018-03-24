package cn.itcast.string;

public class StringDemo2 {
	
	public static void main(String[] args) {
		
		/*
		 * 需求：求两个字符串的最大相同子串
		 * "sdfgcctvhkl"
		 * "zxcctvcxz"
		 * 
		 * 思路：
		 * 1、以短的字符串为主
		 *   到长的字符串中去判断是否存在，如果存在，则已找到
		 * 2、如果没找到，将短的字符串的长度递减获取子串到长串中
		 *   继续查找，直到找到结束
		 * 3、如果没有找到，说明没有相同的。
		 * 
		 */
		
		String s1 = "sdfgcctvhkl";
		String s2 = "zxcctvcxz";
		String maxSub = getMaxString(s1,s2);
		System.out.println("maxSub="+maxSub);
	}

	public static String getMaxString(String s1, String s2) {
		//确定字符串哪个是长的哪个是短的
		String longStr,shortStr;
		longStr = s1.length()>s2.length()?s1:s2;
		shortStr = s1.equals(longStr)?s2:s1;
		System.out.println("longStr="+longStr);
		System.out.println("shortStr="+shortStr);
		//对短串进行操作，从短串中取子串，到长串中去判断，是否存在
		for (int x= 0; x < shortStr.length(); x++) {
			for(int y=0,z=shortStr.length()-x;z<=shortStr.length();y++,z++){
				//根据y,z获取子串
				String temp = shortStr.substring(y,z);
				//System.out.println("temp="+temp);
				if(longStr.contains(temp)){
					return temp;
				}
			}
		}
		return null;
	}

}
