package day10_ClassVariable;

public class Ex05_Variable {
	public static int cnt= 777;
	//static은 객체가 만들어지지 않아도 미리 만들어 놓겠다
	//어디서든 써야할 때 static을 클래스 이름으로 접근 가능
	
	public static void func() {
		System.out.println("func"+cnt);
	}
	

}
