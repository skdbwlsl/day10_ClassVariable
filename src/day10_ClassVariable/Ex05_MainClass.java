package day10_ClassVariable;

public class Ex05_MainClass {
	public static void main(String[] args) {
		//class변수
		
		//이러면 오류난다 .해당 객체가 만들어지지 ㅇㄶ아서
		//Ex05_Variable.cnt = 888;
		
		Ex05_Variable.cnt = 888;
		System.out.println(Ex05_Variable.cnt);
		
		Ex05_Variable.func();
		
		//Ex05_Variable ex = new Ex05_Variable();
		//ex.cnt =888;

	
	}

}
