package chap7;

public class ex29 {

	public static void main(String[] args) {
		// 29.   지역 클래스에서 외부 클래스의 인스턴스 멤버와 static멤버에 모두 접근할 수 있지만, 
		// 지역변수는 final이 붙은 상수만 접근할 수 있는 이유 무엇인가?
		
		// 메서드가 수행을 마쳐서 지역변수가 소멸된 시점에도, 지역 클래스는 남아 있을 수도 있다. 
		// 이때 지역클래스에서 수행을 마친 메서드의 지역변수를 사용하려고 하면 없기 변수는 없어졌기 때문에 오류가 난다.
		// final이 붙은 상수는 일반 변수와 다르게 constant pool이라는 곳에서 따로 보관하고 있기 때문에 남아있고, 사용위해 final상수에만 접근할수있게 하였다. 
		

	}

}
