package day10_ClassVariable;

public class Ex03_Variable {
	public int variable01() {
		int var = 12345;
		System.out.println("01 var : " +var);
		//variable02(var);
		return var;
	}
	
	/*
	//지역변수는 그 지역안에서만 사용 가능하다
	public void variable02() {
		//var이 오류나는 이유는 역시 지역변수 때문이다 var은 01에서 만든 지역변수라 다른 지역이라 여기선 쓸 수 없다
		//그래서 여기에도 var 변수를 만들어줘야 오류가 나지 않음
		int var =12; 
		System.out.println("02 var : " +var);
	}
*/
	public void variable02(int var) {
		System.out.println("02 var : "+var);
}
}
