package cn.itcast.string;

public class StringDemo2 {
	
	public static void main(String[] args) {
		
		/*
		 * �����������ַ����������ͬ�Ӵ�
		 * "sdfgcctvhkl"
		 * "zxcctvcxz"
		 * 
		 * ˼·��
		 * 1���Զ̵��ַ���Ϊ��
		 *   �������ַ�����ȥ�ж��Ƿ���ڣ�������ڣ������ҵ�
		 * 2�����û�ҵ������̵��ַ����ĳ��ȵݼ���ȡ�Ӵ���������
		 *   �������ң�ֱ���ҵ�����
		 * 3�����û���ҵ���˵��û����ͬ�ġ�
		 * 
		 */
		
		String s1 = "sdfgcctvhkl";
		String s2 = "zxcctvcxz";
		String maxSub = getMaxString(s1,s2);
		System.out.println("maxSub="+maxSub);
	}

	public static String getMaxString(String s1, String s2) {
		//ȷ���ַ����ĸ��ǳ����ĸ��Ƕ̵�
		String longStr,shortStr;
		longStr = s1.length()>s2.length()?s1:s2;
		shortStr = s1.equals(longStr)?s2:s1;
		System.out.println("longStr="+longStr);
		System.out.println("shortStr="+shortStr);
		//�Զ̴����в������Ӷ̴���ȡ�Ӵ�����������ȥ�жϣ��Ƿ����
		for (int x= 0; x < shortStr.length(); x++) {
			for(int y=0,z=shortStr.length()-x;z<=shortStr.length();y++,z++){
				//����y,z��ȡ�Ӵ�
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
