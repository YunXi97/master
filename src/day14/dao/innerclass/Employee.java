package day14.dao.innerclass;

public class Employee {
	//����
	private int restday;//��Ϣ��


	public int getRestday() {
		return restday;
	}


	public void setRestday(int restday) {
		this.restday = restday;
	}

	//�ж��Ƿ�����Ϣ��
	public void weekend(){
		switch(this.restday){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("��Ƶ�����");
			break;
		case 7:
			System.out.println("ˬ��");
			default:
				System.out.println("������1-7��");
		}
	}


	//���
	public static void main(String[] args) {
		//��ʼ��һ��Ա������
		Employee em=new Employee();
		//�����ϰ�����
		em.setRestday(0);
		em.weekend();





	}

}
