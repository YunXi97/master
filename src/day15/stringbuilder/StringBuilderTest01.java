package day15.stringbuilder;

/**
 * StringBuilder 
 *   1.�ɱ��ַ��������ݸı䣬���õ�ַ����
 *   2.StringBuilder�̲߳���ȫ����֧��ͬ������д�ٶȿ죬һ�㲻�����̰߳�ȫ������¾�����ʹ�ø���
 *   3.�����StringBuffer���ܷ���һ����Ψһ����StringBuffer�̰߳�ȫ��֧���߳�ͬ�������ܽϵ�
 * 
 * */
public class StringBuilderTest01 {

	public static void main(String[] args) {
		//��ʼ��һ��StringBuilder����   ���ַ�����
		StringBuilder str=new StringBuilder();
		//��β��׷���ַ�
		str.append(true);//��boolean����ת����String����  ���õ�ַ����
		System.out.println(str);
		str.append('��');//׷��char����
		System.out.println(str);
		str.append(3.4);
		System.out.println(str);
		str.append(new Object());//׷��һ������
		System.out.println(str);
		char[]c={'��','��','��','��'};
		str.append(c);
		System.out.println(str);
		str.append(c, 1, 3);//׷��һ������  �������±�λ�ÿ�ʼ--����
		System.out.println(str);
		str.append("ϲ����˵��",1,2);//��0��ʼ��ȡ�ַ�--�����±�[1,2)
		System.out.println(str);
		
		//ָ��λ�ò�������
		str.insert(1, 'f');
		System.out.println(str);
		str.insert(3,"����");
		System.out.println(str);
		
		//�滻  ��ָ��λ�ÿ�ʼ��ĳ��λ�ý���  �滻ָ���ַ��� [��ʼλ��,����λ��)
		str.replace(3, 5, "����");
		System.out.println(str);
		
		//��ѯ
		String s=str.substring(10);//���ַ������±�λ��һֱ��ȡ����󣬷���һ��String����
		System.out.println(s);
		s=str.substring(0, 3);//[0,3)
		System.out.println(s);
		//��ѯָ������λ�õ��ַ�
		char cc=str.charAt(0);
		System.out.println(cc);
		//��ѯָ���ַ�  �״γ��ֵ�����λ��
		int index=str.indexOf("����");
		System.out.println(index);
		//���һ�γ��ֵ�λ��
		index=str.lastIndexOf("����");
		System.out.println(index);
		
		//ɾ��ָ���ַ�
		str.delete(0, 5);//[0,5)
		System.out.println(str);
		str.deleteCharAt(1);//ɾ��ָ��λ�õ��ַ�
		System.out.println(str);
		
		//��ת�ַ�
		str.reverse();
		System.out.println(str);
		
		
		
		
		
		
		
		

	}

}
