
public class TestJavaStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		
		for (int i = 0; i < 1000; i++) {
		long startTime = System.nanoTime();
		
		Point point1 = new Point(0, 0);
		Point point2 = new Point(2.0, 2.0);
		
		try {
			// �ʱ� ��ġ üũ
			assert point1.getX() == 0 && point1.getY() == 0 : "Point1�� ��ġ (0, 0)�� �ƴմϴ�!";
			assert point2.getX() == 2.0 && point2.getY() == 2.0 : "Point1�� ��ġ (2.0, 2.0)�� �ƴմϴ�!";
			
			// �� �� ������ �Ÿ� ���
			System.out.println("�� �� ������ �Ÿ� : " + point1.distance(point2));
			
			// �� �� ������ �Ÿ� üũ
			assert Point.distance(point1, point2) == Math.sqrt(8.0) : "�� �� ������ �Ÿ��� Ʋ���ϴ�!";
			
			// ��1 Y��ǥ�� 2 �̵�
			if (point1.move(0, 2.0) == Setting.FAIL_MOVE) {
				throw new AssertionError("������ ����!",  null);
			}
			// point1.move(new Point(0, 2));
			
			// ��1�� ��ǥ üũ
			assert point1.getX() == 0 && point1.getY() == 2 : "Point1�� ��ġ (0, 2.0)�� �ƴմϴ�!";
			
			// ��1�� ��ǥ ���
			point1.print();
			// System.out.println(point1.toString());
			
			// �� �� ������ �Ÿ� ���
			System.out.println("�� �� ������ �Ÿ� : " + Point.distance(point1.getX(), point1.getY(), point2.getX(), point2.getY()));
			
			// �� �� ������ �Ÿ� üũ
			assert point1.distance(point1, point2) == Math.sqrt(4.0) : "�� �� ������ �Ÿ��� Ʋ���ϴ�!";
		}
		catch (AssertionError assertion) { System.out.println("[ AssertionError ] : " + assertion.getMessage()); }
		
		long endTime = System.nanoTime();
		
		System.out.println("time : " + (endTime - startTime));
		sum += (endTime - startTime) / 1000;
		}
		
		System.out.println(sum + " ns");
	}

}
