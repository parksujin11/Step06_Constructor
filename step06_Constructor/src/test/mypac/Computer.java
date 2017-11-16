package test.mypac;

public class Computer {
	//생성자(Constructor) 객체를 생성할때 호출되는 부분
	//생성자 객체는 리턴 타입이 선언되지 않음(void)
	//class 명과 같다.
	//boolean a=true; string s="abcd"; string s2=new string("abcd") 다 같음.
	
	/*
	 * [필드(저장소) 정의하기]
	 * 
	 * 1. 접근 지정자 ? public 지정자는 공개
	 * public 없으면 디폴트접근지정자(같은패키지안에서만접근가능)
	 * 자바에는 4가지의 접근 지정자가 있다.
	 * 2. static or not static ? static은 클래스의 하나의 메소드만 가진다.
	 * static 안붙이면 여러개의 객체
	 * 3. 데이터 Type? int.byte......등 기본 타입뺴고 무한대로 만들 수 있다.
	 * 4. 필드 name? 저장소의 이름은 변수명 짓듯이 예측가능하도록 지어 
	 * 5. 초기값 ? int는 0이라도 넣어야하고 String은 null이라도 넣어야 한다. 
	 * 
	 */
	
	// 필드에 출고 날짜를 담고 싶다.
	public String productionDate=null;
	
	//필드에 Cpu 객체의 참조값을 담고 싶다.
	//Cpu 타입에 cpu필드명을 가진
	public Cpu cpu=null; 
	/*
	 * [Constructor(생성자) 정의하기]
	 * 
	 * 1. 접근 지정자? 생성자는 클래스명과 같다. 
	 * 2. 생성자에 전달 받는 인자의 갯수와 데이터 type ?
	 * 3. 생성자를 몇개 정의 할지?
	 * 
	 */
	
	//생성자 작성(생성자 다중정의되어있는것-오버로딩되어있다고 표현함)
	public Computer() {
		System.out.println("Computer() 호출됨");
	}
	public Computer(int num) {
		System.out.println("Computer() 호출됨");
	}
	public Computer(int num, String name) {
		System.out.println("Computer() 호출됨");
	}
	
	// 인자로 String type 을 전달 받는 생성자
	public Computer(String productionDate) {
		System.out.println("Compuer(String..)호출됨");
		this.productionDate=productionDate;
	}
	
	public Computer(Cpu cpu) {
		this.cpu=cpu;
	}
	//인자로 String type 과 cpu type 을 전달 받는 생성자
	public Computer(String productionDate, Cpu cpu) {
		this.productionDate=productionDate;
		
	}
	//메소드 작성
	
	/*
	 * [Method(기능) 정의하기]
	 * 
	 * 1. 접근 지정자?
	 * 2. static or non static ?
	 * 3. 리턴 데이터 type? void
	 * 4. Method 명? doGame
	 * 5. Method 에 전달 받는 인자의 갯수와 데이터 type? doGame()괄호에 아무것도 안적으면 0 
	 * 
	 */
	
	public void doGame() {
		System.out.println("게임을 해요!");
		
	}
}








