package chapter14;


@FunctionalInterface
interface MyFunction {
	void run();  //public abstract void run();
}

class LambdaEx1 { 
	static void execute(MyFunction f) { //매개변수의 타입이 MyFunction인 메서
		f.run();
	}
	static MyFunction getMyFunction() {
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}

	public static void main(String[] args) {
	//람다식으로 MyFunction run() 구현 
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		MyFunction f2 = new MyFunction() {
			public void run()  {
		
		     System.out.println("f2.run()");
    	}
			
	};
	MyFunction f3 = getMyFunction();
	
	f1.run();
	f2.run();
	f3.run();
	
	execute(f1);
	execute( () -> System.out.println("run()"));
}}
