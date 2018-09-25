
public class PracticeMain {

	public static void main(String[] args) {
		
// working with intStack		
		
		//creating instance of intStack Obj.
		intStack stack = new intStack();
		
		//pushing values into intStack
		for(int i =0; i<5; i++){
			stack.push(i*3);
		}
		//reading back values
		stack.show();
		System.out.println();
		
		//popping values & showing stack after each iteration
		for(int j =0; j<5; j++){
			stack.pop();
			stack.show();
			System.out.println();
		}
		
		
// working with MotorcycleStack
		
		MotorcycleStack motoStack = new MotorcycleStack();
		Motorcycles moto1 = new Motorcycles("Suzuki", "dr650", 650);
		Motorcycles moto2 = new Motorcycles("Kawasaki", "klr650", 650);
		Motorcycles moto3 = new Motorcycles("Suzuki", "drz400", 400);
		
		motoStack.push(moto1);
		motoStack.display();
		motoStack.push(moto2);
		motoStack.display();
		motoStack.push(moto3);
		motoStack.display();
		
		if(!motoStack.isEmpty()){
			System.out.println(motoStack.pop());
			System.out.println(motoStack.pop());
		}


	}

}
