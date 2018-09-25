
public class MotorcycleStack {
	Motorcycles stack [];
	int top;
	int size;
	
	// constructor I. no parameters provided
	public MotorcycleStack(){
		size = 100;
		top = -1;
		stack = new Motorcycles[size];
	}
	
	public MotorcycleStack(int size){
		this.size = size;
		top = -1;
		stack = new Motorcycles[size];
	}
	
	public boolean isFull(){
		return (top == (size-1));
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean push(Motorcycles moto){
		if (!isFull()){
			stack[++top] = moto;
			return true;
		}else{ return false;}
	}
	
	public Motorcycles pop(){
		return stack[top--];
	}
	
	public void display() {
		for(int i = 0; i <= top; i++){
			System.out.println("at " + i + " -->" + stack[i]);
		} 
	}
}
