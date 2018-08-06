package day12;

//使用数组模拟栈
//栈：后进先出
public class Stack {
	//使用数组存储数据结构
	//栈可以存储多个引用类型的元素
	Object[] elements;
	
	//指向栈顶元素上方的帧
	int index;
	
	//栈默认的初始化容量是5
	//构造方法
	Stack(){
		this(5);
	}

	Stack(int max) {
		elements = new Object[max];
	}
	
	//栈应该对外提供一个压栈的方法
	public void push(Object element)throws StackOperationException{
		/*
		 * elements[index]=element;
		 * index++;//先赋值，后加1
		 * */
		if(index==elements.length){
			throw new StackOperationException("栈已满！");
		}
		elements[index++]=element;
	}
	
	//栈应该对外提供一个弹栈的方法
	public Object pop()throws StackOperationException{//栈顶的元素往外弹
		/*
		 * index--;
		 * return elements[index];
		 * */
		if(index==0){
			throw new StackOperationException("栈已空！");
		}
		return elements[--index];//先减1
	}
	

}
