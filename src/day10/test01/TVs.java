package day10.test01;

public class TVs extends Goods {
	//重写父类的print()方法
	@Override
	public void printPrice(){
		System.out.println("电视的价格为："+this.getPrice());
	}

}
