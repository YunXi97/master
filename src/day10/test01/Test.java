package day10.test01;

/**
 * ����˵��:
               �Զ�����ͷ�����ʹ�ø�����Ϊ����ֵʵ�ִ�ӡ��ͬ������Ʒ�۸���
               ���ࣺGoods����Ʒ�ࣩ
               ���ࣺTVs�������ࣩ��Foods��ʳƷ�ࣩ
 * */

public class Test {
	
	//��������Ϊ����ֵ���ء�
	public static Goods getType(int type){
		if(type==1){
			//��ʼ��һ��Foods����
			Foods food=new Foods();
			food.setPrice(13);
			return food;
		}
		
		//����һ��TVS����
		TVs tv=new TVs();
		tv.setPrice(2353);
		return tv;
	}

	public static void main(String[] args) {
		getType(1).printPrice();
		getType(2).printPrice();
		
	}

}
