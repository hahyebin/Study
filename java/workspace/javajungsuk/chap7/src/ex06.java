package chap7;

public class ex06 {

	public static void main(String[] args) {
		// 6. 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유?
		// 조상에 정의된 인스턴스 변수들이 초기화되도록하기 위해서 .
		
		// 자손클래스의 인스턴스를 생성하면 조상으로부터 상속받은 iv 들도생성된다.
		// 이 상속받은 iv들도 적절하게 초기화해주는 것이 좋은데,
		// 자식이 하기보다는 상속받은 iv이기 때문에 조상의 생성자를 불러  초기화하는 것이 바람직하다. 
		
		
		//모든 생성자는 첫 줄에 반드시 다른 생성자를 호출..

	}

}
