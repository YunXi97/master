package day10;

/**
 * 需求说明:
            宠物饿了，主人需要为宠物喂食，使用多态实现该过程
            不同宠物吃的东西不一样
            不同宠物吃完东西后恢复健康值不一样
             健康值达到100时，不需要继续喂食
 * 
 * */
public class Master {
	public void eat(Pet p){
		 if(p instanceof Dog){
			 //强制类型转换
			 Dog dog =(Dog)p;
			 dog.doEat();
		}else if(p instanceof Penguin){
			//强制类型转换 
			Penguin p1=(Penguin)p; 
			//执行子类特有特性
			p1.doEat();
		}
}
	

	public static void main(String[] args) {
		Master m=new Master();
		Dog dog=new Dog(100);
		Pet p1=dog;
		m.eat(p1);
		
		Penguin pen=new Penguin(30);
		Pet p2=pen;
		m.eat(p2);

	}

}
