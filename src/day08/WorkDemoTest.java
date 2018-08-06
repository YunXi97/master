package day08;

public class WorkDemoTest {

	public static void main(String[] args) {

		//（3，4）点在圆外  以原点为中心，2为半径创建一个圆
		WorkDemo wd=new WorkDemo(3,4,2);
		String msg=wd.relationshipFromPoint();
		System.out.println(msg);
		
		//（3，4）点在圆内  以原点为中心，6为半径创建一个圆
		WorkDemo wd1=new WorkDemo(3,4,6);
		String msg1=wd1.relationshipFromPoint();
		System.out.println(msg1);
		
		//（3，4）点在圆上  以原点为中心，5为半径创建一个圆
		WorkDemo wd2=new WorkDemo(3,4,5);
		String msg2=wd2.relationshipFromPoint();
		System.out.println(msg2);
	}

}
