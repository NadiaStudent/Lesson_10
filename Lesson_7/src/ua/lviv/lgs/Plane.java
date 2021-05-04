package ua.lviv.lgs;

public abstract class Plane {

	private int length;
	private int height;
	private int weight;

	private PlaneControl planeControl = new PlaneControl();

	public Plane(int length, int height, int weight) {
		this.length = length;
		this.height = height;
		this.weight = weight;
	}

	public void startEngines() {
		int countdown = 20 + (int) (Math.random() * (68 + 1));
		System.out.println("�������� �������. ���� ��������  ����� " + countdown + " ���");
	}

	public void takeoffPlane() {
		double distance = (Math.random() * 1000);
		System.out.println("������� ���. ˳���  � ������� ������ ��������� " + distance + " ��");
	}

	public void landingPlane() {
		System.out.println("ѳ���.������� �������� ");
	}

	public void moveUp() {
		planeControl.moveUp();
	}

	public void moveDown() {
		planeControl.moveDown();
	}

	public void moveLeft() {
		planeControl.moveLeft();
	}

	public void moveRight() {
		planeControl.moveRight();
	}
}
