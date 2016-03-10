package com.bp.datastructure;
/**
 * Stack 
 * ���� ���� ����!
 * �ݵ�� �Ｚ�� �÷��ֿ� �԰��Ҳ���!!
 * 
 * */
public class Stack {
	/**
	 * Stack 
	 * 
	 */
	final static int MAX_SIZE = 100;
	
	private int stack [];
	private int top;
	
	Stack(){
		stack = new int [MAX_SIZE];
		top = -1;
	}
	
	public int pop(){
	
		int out;
		
		if(top == -1){
			System.out.println("Empty Stack!!");
			return -1;
		}
		
		out = stack[top];
		stack[top--] = 0;
		
		return out;
	}
	
	public void push(int in){
		
		if(top == MAX_SIZE){
			System.out.println("Full Stack!! ");
			return;
		}
		
		stack[++top] = in;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		
		for( int i = 0 ; i < 10 ; i ++){
			s.push(i);
		}
		for( int i = 0 ; i < 10 ; i ++){
			System.out.print(s.pop()+ " ");
		}

	}

}
