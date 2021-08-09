package day10_ClassVariable;
class User1{
	public Ex07_final user = new Ex07_final();
	public void func() {
		System.out.println("KOREA : " + user.KOREA);
	}
}

class User2{
	public Ex07_final user = new Ex07_final();
	public void func() {
		System.out.println("KOREA : " + user.KOREA);
	}
}

//이렇게 class가 붙으면 다 각각의 다른 class다
public class Ex07_MainClass {
	public static void main(String[] args) {
		User1 u1 = new User1();
		User2 u2 = new User2();
		u1.func(); u2.func();
		
	}

}
