package day08;

public class WorkDemo {
	private int x;//横坐标
	private int y;//纵坐标
	private int r;//圆半径
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//构造方法    点的位置(x,y)  圆的半径r
	public WorkDemo(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public WorkDemo() {
	}
	
	
	//判断点与圆的位置关系
	public String relationshipFromPoint(){
		int x=this.getX();
		int y=this.getY();
		int r=this.getR();
		//判断关系
		if(x*x+y*y==r*r){
			return "点在圆上";
		}else if(x*x+y*y>r*r){
			return "点在圆外";
		}else
			return "点在圆内";
	}
	

	
	
}
