package day10_ClassVariable;

public class Ex03_MainClass {
	public static void main(String[] args) {
		/*
		 Ŭ���� ����
		 - ���α׷� ���۽� ����(�޸𸮿� �ö� ��)
		 - ��� ������ ��밡���ϴ�
		 
		 �ν��Ͻ�(��ü) ����
		 - �ν��Ͻ��� ������ ��(new ������ ��)
		 
		 ��������
		 - Ư�� �������� ������ �� 
		 - �ش� ���������� ��밡���ϴ�
		 - �Ǵ� �ش� ������ ���ӵǾ� �ִ� ������ ��� ����
		 -��, ���� �����ȿ��� ���� �͵��� ū ������ �� �� ����, �� ���������� ���� ����
		 */
		
		/*
		int cnt = 0;
		if(cnt ==0) {
			int test = 1000;
			System.out.println(cnt);
			System.out.println(test);
		}
		//if�� �ٱ��� test�� ����ϸ� �����߻��Ѵ�.�̰� �ٷ� ��������
		System.out.println(test);
	*/
	
		
		//Ex03_Variable ex = new Ex03_Variable();
		//ex.variable01();
		
		
		Ex03_Variable ex = new Ex03_Variable();
		int a= ex.variable01();
		ex.variable02(a);
		
		}
	}


