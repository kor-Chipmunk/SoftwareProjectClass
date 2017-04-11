public class TestCStyle {
	public static double distance(PointStruct point1, PointStruct point2) {
		return Math.sqrt(Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2));
	}
	
	public static double distanceWithAbsolutePoint(PointStruct point1, double absX, double absY) {
		PointStruct absPoint = new PointStruct();
		
		absPoint.x = absX;
		absPoint.y = absY;
		
		return distance(point1, absPoint);
	}
	
	public static void move(PointStruct point, double moveX, double moveY) {
		point.x += moveX;
		point.y += moveY;
	}
	
	public static void moveWithRelativePoint(PointStruct point, PointStruct relativePoint) {
		point.x += relativePoint.x;
		point.y += relativePoint.y;
	}
	
	public static void print(PointStruct point) {
		System.out.printf("���� X��ǥ : %f\t���� Y��ǥ : %f\n", point.x, point.y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PointStruct point1 = new PointStruct();
		PointStruct point2 = new PointStruct();
		
		point1.x = 0;
		point1.y = 0;
		
		point2.x = 2.1;
		point2.y = 2.0;
		
		try {
			// �ʱ� ��ġ üũ
			assert point1.x == 0 && point1.y == 0 : "Point1�� ��ġ (0, 0)�� �ƴմϴ�!";
			assert point2.x == 2.0 && point2.y == 2.0 : "Point1�� ��ġ (2.0, 2.0)�� �ƴմϴ�!";
			
			// �� �� ������ �Ÿ� ���
			System.out.printf("�� �� ������ �Ÿ� : %f\n", distance(point1, point2));
			// System.out.printf("�� �� ������ �Ÿ� : %f\n", distanceWithAbsolutePoint(point1, 2, 2));
			
			// �� �� ������ �Ÿ� üũ
			assert distance(point1, point2) == Math.sqrt(8.0) : "�� �� ������ �Ÿ��� Ʋ���ϴ�!";
			
			// ��1 Y��ǥ�� 2 �̵�
			move(point1, 0, 2);
			// PointStruct relativePoint = new PointStruct();
			// relativePoint.x = 0;
			// relativePoint.y = 2.0;
			// moveWithRelativePoint(point1, relativePoint);
			
			// ��1�� ��ǥ üũ
			assert point1.x == 0 && point1.y == 2 : "Point1�� ��ġ (0, 2.0)�� �ƴմϴ�!";
			
			// ��1�� ��ǥ ���
			print(point1);
			
			// �� �� ������ �Ÿ� ���
			System.out.printf("�� �� ������ �Ÿ� : %f\n", distance(point1, point2));
			
			// �� �� ������ �Ÿ� üũ
			assert distance(point1, point2) == Math.sqrt(4.0) : "�� �� ������ �Ÿ��� Ʋ���ϴ�!";
		}
		catch (AssertionError assertion) { System.out.println("[ AssertionError ] : " + assertion.getMessage()); }
	}

}