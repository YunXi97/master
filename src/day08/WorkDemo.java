package day08;

public class WorkDemo {
	private int x;//������
	private int y;//������
	private int r;//Բ�뾶
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
	
	//���췽��    ���λ��(x,y)  Բ�İ뾶r
	public WorkDemo(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public WorkDemo() {
	}
	
	
	//�жϵ���Բ��λ�ù�ϵ
	public String relationshipFromPoint(){
		int x=this.getX();
		int y=this.getY();
		int r=this.getR();
		//�жϹ�ϵ
		if(x*x+y*y==r*r){
			return "����Բ��";
		}else if(x*x+y*y>r*r){
			return "����Բ��";
		}else
			return "����Բ��";
	}
	

	
	
}
