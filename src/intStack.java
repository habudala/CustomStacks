
public class intStack {
	// stack instance vars
	public int stack [];
	private int size;
	private int top;
	
	//constructorI. --> no size provided
	public intStack() {
		size = 50;
		stack = new int[size];
		top = -1;
	}
	//constructor II. --> size provided
	public intStack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	public int getTop(){
		return top;
	}
	//increment top & push item in stack after checking is stack full yet
	public void push(int sg){
		if (!isFull()){		
			stack[++top] = sg;
		}
	}
	//check is stack is full
	public boolean isFull(){
		return (top == (size-1));
	}
	// check if stack is empty
	public boolean isEmpty(){
		return (top == -1);
	}
	//remove topmost element & decrement top after checking is stack is not empty yet
	public int pop(){
		if(!isEmpty()){
			return stack[top--];
		}
		else {top = -1; return top;}
	}
	//print out current elements in stack == self-check
	public void show () {
		for( int i = 0; i<=top; i++){
			System.out.println("at the : " + (i + 1) + "th postition : " + stack[i]);
		}
	}
}


