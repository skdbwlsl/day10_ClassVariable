package day10_ClassVariable;

public class Ex03_MainClass {
	public static void main(String[] args) {
		/*
		 클래스 변수
		 - 프로그램 동작시 생성(메모리에 올라갈 때)
		 - 모든 곳에서 사용가능하다
		 
		 인스턴스(객체) 변수
		 - 인스턴스가 생성될 때(new 만났을 때)
		 
		 지역변수
		 - 특정 범위에서 생성될 때 
		 - 해당 범위에서만 사용가능하다
		 - 또는 해당 범위에 종속되어 있는 곳까지 사용 가능
		 -즉, 작은 변수안에서 만든 것들은 큰 범위에 쓸 수 없음, 그 지역에서만 쓸수 있음
		 */
		
		/*
		int cnt = 0;
		if(cnt ==0) {
			int test = 1000;
			System.out.println(cnt);
			System.out.println(test);
		}
		//if문 바깥에 test를 출력하면 에러발생한다.이게 바로 지역변수
		System.out.println(test);
	*/
	
		
		//Ex03_Variable ex = new Ex03_Variable();
		//ex.variable01();
		
		
		Ex03_Variable ex = new Ex03_Variable();
		int a= ex.variable01();
		ex.variable02(a);
		
		}
	}


