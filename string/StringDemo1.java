package cn.itcast.string;

public class StringDemo1 {
	public static void main(String[] args) {
		String  str = "abcd";
		str = "qwer";
		String str1 = new String("abcd");  
		System.out.println(str == str1);  //false
		System.out.println(str1.equals(str1));
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2); //true
	}

}
