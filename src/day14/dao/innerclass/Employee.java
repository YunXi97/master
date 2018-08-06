package day14.dao.innerclass;

public class Employee {
	//属性
	private int restday;//休息日


	public int getRestday() {
		return restday;
	}


	public void setRestday(int restday) {
		this.restday = restday;
	}

	//判断是否是休息日
	public void weekend(){
		switch(this.restday){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("苦逼的生活");
			break;
		case 7:
			System.out.println("爽啊");
			default:
				System.out.println("请输入1-7：");
		}
	}


	//入口
	public static void main(String[] args) {
		//初始化一个员工对象
		Employee em=new Employee();
		//设置上班日期
		em.setRestday(0);
		em.weekend();





	}

}
