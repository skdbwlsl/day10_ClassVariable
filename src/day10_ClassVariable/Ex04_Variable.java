package day10_ClassVariable;

public class Ex04_Variable {
	//class내부에 만드는 변수를 인스턴스 변수
	public int cnt =10;
	//class에서 만든 변수는 인스턴스 변수라고하고, 그런 cnt라 종속돼있는 애들이 cnt++가 실ㄹ행이 되는것
	//인스턴스는 모든곳에서 사용가능
	public void func01() {
		cnt++; System.out.println("01 cnt : " + cnt);
	}
	public void func02() {
		cnt++; System.out.println("02 cnt : " + cnt);
//공통적으로 만드는 애들은 인스턴스 변수로 만드는게 더 편함
		
}
}