package day10_ClassVariable;

public class Ex01_Class {
	//첫번째랑 3번째 식보면 변수명은 같아도 다른 매소드로 인식을 한다 자료형이 다르기 때문에
	public int sumFunc(int n1,int n2) {
		return n1+n2;
	}
	public int multiSumFunc(int n1,int n2,int n3) {
		return n1+n2+n3;

}
	//자료형이 달라서 sumFunc을 맞출수가없다 이럴때 오버로딩
	public double sumFunc(int n1,double n2) {
		return n1+n2;
}
	public String sumFunc(String n1, String n2) {
		return n1+n2;
}
}