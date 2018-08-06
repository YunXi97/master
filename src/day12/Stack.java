package day12;

//ʹ������ģ��ջ
//ջ������ȳ�
public class Stack {
	//ʹ������洢���ݽṹ
	//ջ���Դ洢����������͵�Ԫ��
	Object[] elements;
	
	//ָ��ջ��Ԫ���Ϸ���֡
	int index;
	
	//ջĬ�ϵĳ�ʼ��������5
	//���췽��
	Stack(){
		this(5);
	}

	Stack(int max) {
		elements = new Object[max];
	}
	
	//ջӦ�ö����ṩһ��ѹջ�ķ���
	public void push(Object element)throws StackOperationException{
		/*
		 * elements[index]=element;
		 * index++;//�ȸ�ֵ�����1
		 * */
		if(index==elements.length){
			throw new StackOperationException("ջ������");
		}
		elements[index++]=element;
	}
	
	//ջӦ�ö����ṩһ����ջ�ķ���
	public Object pop()throws StackOperationException{//ջ����Ԫ�����ⵯ
		/*
		 * index--;
		 * return elements[index];
		 * */
		if(index==0){
			throw new StackOperationException("ջ�ѿգ�");
		}
		return elements[--index];//�ȼ�1
	}
	

}
