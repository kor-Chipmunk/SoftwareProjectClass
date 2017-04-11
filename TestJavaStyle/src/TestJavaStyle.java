
public class TestJavaStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		
		for (int i = 0; i < 1000; i++) {
		long startTime = System.nanoTime();
		
		Point point1 = new Point(0, 0);
		Point point2 = new Point(2.0, 2.0);
		
		try {
			// 초기 위치 체크
			assert point1.getX() == 0 && point1.getY() == 0 : "Point1의 위치 (0, 0)이 아닙니다!";
			assert point2.getX() == 2.0 && point2.getY() == 2.0 : "Point1의 위치 (2.0, 2.0)이 아닙니다!";
			
			// 두 점 사이의 거리 출력
			System.out.println("두 점 사이의 거리 : " + point1.distance(point2));
			
			// 두 점 사이의 거리 체크
			assert Point.distance(point1, point2) == Math.sqrt(8.0) : "두 점 사이의 거리가 틀립니다!";
			
			// 점1 Y좌표로 2 이동
			if (point1.move(0, 2.0) == Setting.FAIL_MOVE) {
				throw new AssertionError("움직임 실패!",  null);
			}
			// point1.move(new Point(0, 2));
			
			// 점1의 좌표 체크
			assert point1.getX() == 0 && point1.getY() == 2 : "Point1의 위치 (0, 2.0)이 아닙니다!";
			
			// 점1의 좌표 출력
			point1.print();
			// System.out.println(point1.toString());
			
			// 두 점 사이의 거리 출력
			System.out.println("두 점 사이의 거리 : " + Point.distance(point1.getX(), point1.getY(), point2.getX(), point2.getY()));
			
			// 두 점 사이의 거리 체크
			assert point1.distance(point1, point2) == Math.sqrt(4.0) : "두 점 사이의 거리가 틀립니다!";
		}
		catch (AssertionError assertion) { System.out.println("[ AssertionError ] : " + assertion.getMessage()); }
		
		long endTime = System.nanoTime();
		
		System.out.println("time : " + (endTime - startTime));
		sum += (endTime - startTime) / 1000;
		}
		
		System.out.println(sum + " ns");
	}

}
