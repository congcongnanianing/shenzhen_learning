package cn.itcast.string;

import java.io.File;

import cn.itcast.filter.FilterBySuffix;

public class FileterMethodTest2 {
	public static void main(String[] args) {
		/*
		 * ����ֻ��ȡָ��Ŀ¼�µ�.java�ļ�   list(FilenameFilter filter);
		 */ 
		File dir = new File("E:\\");
		//String[] names = dir.list(); //��E:\ �µ������ļ����������ʽ����
		String[] names = dir.list(new FilterBySuffix(".java"));
		for(String abc: names){  //foreach��������
			//if(abc.endsWith(".java")){ //���˳���  .java��β���ļ�
				System.out.println(abc);
			}
		}
		/*
		 * ���ֱ�����ȻҲ��ʵ�ֹ��ˣ�����ÿ�ι���������ȷ���������ж��Ƿ���.java��β��
		 * �����ж��ļ����ư��� demo�������˷�ʽ�����������̫ǿ��
		 * 
		 * ���ʱ����Ҫ�Թ��˷�ʽ�͹����������н��
		 * ʹ���ļ������˽ӿ� FilenameFilter
		 * 
		 */
		
		//����һ�����������󡣡���FilterBySuffix��
		//���������
		
		
	}


