package day10_ClassVariable;

public class Ex02_Random {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			//random ������ ��(0.0 ~ 0.9���̰��� �̾��ش�)
			//int�� ����ȯ(0 ~ 2������ ���ڷ� ����)
			int ran  = (int)(Math.random()*3) +10;
			System.out.println( (int)(Math.random()*3)+10) ;
			//�̷��� �ϸ� 10 ~ 12 ���� ������ ���� �� �ִ�
		}
	}

}
