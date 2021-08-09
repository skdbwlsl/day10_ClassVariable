package day10_ClassVariable;

public class Ex02_Random {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			//random 무작위 값(0.0 ~ 0.9사이값을 뽑아준다)
			//int로 형변환(0 ~ 2까지의 숫자로 나옴)
			int ran  = (int)(Math.random()*3) +10;
			System.out.println( (int)(Math.random()*3)+10) ;
			//이렇게 하면 10 ~ 12 까지 범위를 구할 수 있다
		}
	}

}
