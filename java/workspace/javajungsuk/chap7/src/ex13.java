package chap7;
// Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?
public class ex13 {

	public static void main(String[] args) {
		
		//Math클래스의 모든 메서드가 static메서드이고 인스턴스변수가 존재하지 않기 때문에
		//객체를 생성할 필요가 없기 때문
		
		//공부하기 
		// 연산 방법은 미리 정해져있기 때문에 모든 메서드를 static에 고정해둔다. 
		// 바꿀 필요가 없기 때문에 인스턴스(새 객체)를 만들필요가 없기 때문에 private이다. 
		
		//싱글톤은 새 객체 생성하고, 그 객체를 고정
		// Math의 객체는 정적 메소드들 뿐이라 첨부터 새 객체 생성못하게 만들어짐
		
	    Math m = new Math();
	}

}
