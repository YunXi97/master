package day10.test01;

public class Foods extends Goods {
	
	//重写父类方法
	@Override
	public void printPrice() {
		System.out.println("食品的价格为："+this.getPrice());
	}

}
