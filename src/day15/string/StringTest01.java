package day15.string;

public class StringTest01 {

	public static void main(String[] args) {
		//�����ַ��������ַ�ʽ
		String str="ABCD";//������
		//ͨ�����췽������һ������
		String str1=new String("ABCD");
		String str2="ABC";
		//�ϲ��ַ���  ���з����ڴ�
		String str3=str2+"D";
		//
		String str4="AB"+"CD";
		
		//String ��Ҫ�����ڴ��������ط�  1.����  2.������
		//������  �洢���ǳ�����������ڱ����ʱ���Ѿ�����Щ���ݴ洢�ڳ�������
		//������new String������  ƴ���µ��ַ���
		
		//�ַ������бȽϵ�ʱ��  == �Ƚϵ������õ�ַ
		if(str==str4){
			System.out.println("���");
		}else{
			System.out.println("�����");
		}
	
		//equals �Ƚϵ�������ֵ�Ƿ����  �����ڴ�
		if(str.equals(str3)){
			System.out.println("�������");
		}
		
		//�ж�һ���ַ��Ƿ���ڳ�����һ��Ҫ�ó����ͱ������бȽ�
		String str5=null;
		//if(str5.equals("123")){}
		
		//�жϵ�ַ�Ƿ�Ϊ��
		if(str5==null){
			System.out.println("��ַΪ��");
		}
		//�ж������Ƿ�Ϊ��
		if("".equals(str5))
			System.out.println("����Ϊ��");
		else
			System.out.println("��Ϊ��");
		
		
		
		
		System.out.println(str);
		System.out.println(str1);

	}

}
