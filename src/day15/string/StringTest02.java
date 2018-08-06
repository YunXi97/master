package day15.string;

import java.io.UnsupportedEncodingException;

public class StringTest02 {

	public static void main(String[] args) throws UnsupportedEncodingException{
		// ����һ���ַ���    ͨ�����췽��
		String str=new String();//����һ�����ַ���
		System.out.println(str.isEmpty());//�ж��ַ����Ƿ�Ϊ�մ�""
		System.out.println(str.length());//��ȡ�ַ�������
		
		byte[]b={1,2,3,4};
		str=new String(b);
		System.out.println(str);
		str=new String(b,"GBK");
		System.out.println(str);
		char[]c={'a','b','c','d','e'};
		str=new String(c,1,4);//������c���±�1��ʼ��ȡ����4ת����String����
		System.out.println(str);
		
		char cr=str.charAt(0);//��ȡָ��������char�ַ�
		System.out.println(cr);
		
		//����һ������ ��ʾ�ַ���С����һ���ַ�����  ����0��ȣ����ڷ���1
		int result=str.compareTo("abcd");
		result=str.compareToIgnoreCase("BCDE");
		System.out.println(result);
		
		//�ж��ַ����Ƿ����ĳ���ַ���
		System.out.println(str.contains("bc"));
		System.out.println(str.equalsIgnoreCase("BcDe"));//�����ִ�Сд
		System.out.println(str.equals("Bcde"));//�Ƚ��ַ������ִ�Сд
		
		//��̬����  ��char����ת����String
		str=String.copyValueOf(c);
		System.out.println(str);
		
		//�ж��Ƿ���ĳ���ַ�����׺
		System.out.println(str.endsWith("e"));
		//ǰ׺
		System.out.println(str.startsWith("ab"));
		
		//�ַ�����ѯ indexOf()��ѯ�ַ������ַ�����һ�γ��ֵ�����
		System.out.println(str.indexOf('b'));
		System.out.println(str.indexOf("cd"));//�ַ����״γ��ֵ�λ��
		//���һ�γ��ֵ�λ��
		System.out.println(str.lastIndexOf('b'));
		System.out.println(str.lastIndexOf("de"));
		
		//�ַ���  Сдת��д   ��дתСд
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//��ȡ�ַ���
		System.out.println(str.substring(2));//���±�2��ʼ��ȡ�Ӵ�
		System.out.println(str.substring(1, 3));//���±�1��ʼ��ȡ��С��3����[1,3)
		
		//�ָ��ַ���  ����һ������
		str="����������ˣ�����������������һ�һ�����䲻����һƬ�Ʋ�";
		String list[]=str.split("��");
		for(String string:list){
			System.out.println(string);
		}
		
		//�滻
		System.out.println(str.replace("����", "ŤŤ"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
