package day10_ClassVariable;

public class Ex04_MainClass {
	public static void main(String[] args) {
		//인스턴스 변수
		Ex04_Variable ex = new Ex04_Variable();
		ex.cnt = 12345; //10에 저장되잇었더라도 값을 변경했기 때무에 변경값으로 출력됌
		ex.func01();
		ex.func02();
		
	}

}
