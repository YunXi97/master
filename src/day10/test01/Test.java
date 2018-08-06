package day10.test01;

/**
 * 需求说明:
               自定义类和方法，使用父类作为返回值实现打印不同类型商品价格功能
               父类：Goods（商品类）
               子类：TVs（电视类）、Foods（食品类）
 * */

public class Test {
	
	//将父类作为返回值返回、
	public static Goods getType(int type){
		if(type==1){
			//初始化一个Foods对象
			Foods food=new Foods();
			food.setPrice(13);
			return food;
		}
		
		//创建一个TVS对象
		TVs tv=new TVs();
		tv.setPrice(2353);
		return tv;
	}

	public static void main(String[] args) {
		getType(1).printPrice();
		getType(2).printPrice();
		
	}

}
