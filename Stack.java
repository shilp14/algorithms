package test;

public class Stack {
	int top=-1;
	int[] stackArr=new int[3];
	public boolean push(int data) {
		if(top==stackArr.length-1) {
			System.out.println("Stack overflow");
			return false;
		}
		top++;
		stackArr[top]=data;
		return true;
	}
	
  public boolean pop() {
		if(top==-1) {
			System.out.println("Stack underflow");
			return false;
			
		}
		
	top--;
		return true;

	}
  
  public int peek() {
	  
	  if(top==-1) {
		  System.out.println("stack is empty");
	  }
		  
	  return stackArr[top];
	  
  }
	public static void main(String[] args) {
		Stack st=new Stack();
	st.push(1);
	st.push(2);
	st.push(4);
	st.push(5);
	System.out.println(st.peek());
	st.pop();
	System.out.println(st.peek());
	}
	
}
