package chap8;

public class oop_03 {

	public static void main(String[] args) {
		
	    /* 1. 두 갱부 객체를 생성하세요. */
	    Miner malon = new Miner("말런");
	    Miner gloria = new Miner("글로리아");
	    
	    /* 2. 코인을 채굴하세요. */
	    malon.mine();   //  mine()하나 부를때마다  코인 1증가 
	    malon.mine();
	    malon.mine();
	    gloria.mine();
	    gloria.mine();
	    
	    
	    /* 3. 객체 정보를 출력하세요. */
	    System.out.println(malon);   // toString()은 생략 가능
	    System.out.println(gloria);
	  }
	}

	class Miner {
	  // 필드(인스턴스 변수)
	  String name;
	  int coins;

	  // 생성자
	  public Miner(String str) {
	    name = str;
	    coins = 0;
	  }
	  
	  // 메소드(인스턴스 메소드) - 객체의 정보를 문자열로 반환
	  public String toString() {
	    return String.format("Miner { name: %s, coins: %d }", name, coins);
	  }
	  
	  // 메소드(인스턴스 메소드) - 코인 채굴
	  public void mine() {
	    coins += 1;
	  }
	}