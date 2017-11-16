package test.mypac;

public class Computer {
	//������(Constructor) ��ü�� �����Ҷ� ȣ��Ǵ� �κ�
	//������ ��ü�� ���� Ÿ���� ������� ����(void)
	//class ��� ����.
	//boolean a=true; string s="abcd"; string s2=new string("abcd") �� ����.
	
	/*
	 * [�ʵ�(�����) �����ϱ�]
	 * 
	 * 1. ���� ������ ? public �����ڴ� ����
	 * public ������ ����Ʈ����������(������Ű���ȿ��������ٰ���)
	 * �ڹٿ��� 4������ ���� �����ڰ� �ִ�.
	 * 2. static or not static ? static�� Ŭ������ �ϳ��� �޼ҵ常 ������.
	 * static �Ⱥ��̸� �������� ��ü
	 * 3. ������ Type? int.byte......�� �⺻ Ÿ�ԕ��� ���Ѵ�� ���� �� �ִ�.
	 * 4. �ʵ� name? ������� �̸��� ������ ������ ���������ϵ��� ���� 
	 * 5. �ʱⰪ ? int�� 0�̶� �־���ϰ� String�� null�̶� �־�� �Ѵ�. 
	 * 
	 */
	
	// �ʵ忡 ��� ��¥�� ��� �ʹ�.
	public String productionDate=null;
	
	//�ʵ忡 Cpu ��ü�� �������� ��� �ʹ�.
	//Cpu Ÿ�Կ� cpu�ʵ���� ����
	public Cpu cpu=null; 
	/*
	 * [Constructor(������) �����ϱ�]
	 * 
	 * 1. ���� ������? �����ڴ� Ŭ������� ����. 
	 * 2. �����ڿ� ���� �޴� ������ ������ ������ type ?
	 * 3. �����ڸ� � ���� ����?
	 * 
	 */
	
	//������ �ۼ�(������ �������ǵǾ��ִ°�-�����ε��Ǿ��ִٰ� ǥ����)
	public Computer() {
		System.out.println("Computer() ȣ���");
	}
	public Computer(int num) {
		System.out.println("Computer() ȣ���");
	}
	public Computer(int num, String name) {
		System.out.println("Computer() ȣ���");
	}
	
	// ���ڷ� String type �� ���� �޴� ������
	public Computer(String productionDate) {
		System.out.println("Compuer(String..)ȣ���");
		this.productionDate=productionDate;
	}
	
	public Computer(Cpu cpu) {
		this.cpu=cpu;
	}
	//���ڷ� String type �� cpu type �� ���� �޴� ������
	public Computer(String productionDate, Cpu cpu) {
		this.productionDate=productionDate;
		
	}
	//�޼ҵ� �ۼ�
	
	/*
	 * [Method(���) �����ϱ�]
	 * 
	 * 1. ���� ������?
	 * 2. static or non static ?
	 * 3. ���� ������ type? void
	 * 4. Method ��? doGame
	 * 5. Method �� ���� �޴� ������ ������ ������ type? doGame()��ȣ�� �ƹ��͵� �������� 0 
	 * 
	 */
	
	public void doGame() {
		System.out.println("������ �ؿ�!");
		
	}
}








