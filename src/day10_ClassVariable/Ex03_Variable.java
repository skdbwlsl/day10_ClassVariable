package day10_ClassVariable;

public class Ex03_Variable {
	public int variable01() {
		int var = 12345;
		System.out.println("01 var : " +var);
		//variable02(var);
		return var;
	}
	
	/*
	//���������� �� �����ȿ����� ��� �����ϴ�
	public void variable02() {
		//var�� �������� ������ ���� �������� �����̴� var�� 01���� ���� ���������� �ٸ� �����̶� ���⼱ �� �� ����
		//�׷��� ���⿡�� var ������ �������� ������ ���� ����
		int var =12; 
		System.out.println("02 var : " +var);
	}
*/
	public void variable02(int var) {
		System.out.println("02 var : "+var);
}
}
