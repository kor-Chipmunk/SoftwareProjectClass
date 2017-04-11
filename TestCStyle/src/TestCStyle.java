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
		System.out.printf("현재 X좌표 : %f\t현재 Y좌표 : %f\n", point.x, point.y);
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
			// 초기 위치 체크
			assert point1.x == 0 && point1.y == 0 : "Point1의 위치 (0, 0)이 아닙니다!";
			assert point2.x == 2.0 && point2.y == 2.0 : "Point1의 위치 (2.0, 2.0)이 아닙니다!";
			
			// 두 점 사이의 거리 출력
			System.out.printf("두 점 사이의 거리 : %f\n", distance(point1, point2));
			// System.out.printf("두 점 사이의 거리 : %f\n", distanceWithAbsolutePoint(point1, 2, 2));
			
			// 두 점 사이의 거리 체크
			assert distance(point1, point2) == Math.sqrt(8.0) : "두 점 사이의 거리가 틀립니다!";
			
			// 점1 Y좌표로 2 이동
			move(point1, 0, 2);
			// PointStruct relativePoint = new PointStruct();
			// relativePoint.x = 0;
			// relativePoint.y = 2.0;
			// moveWithRelativePoint(point1, relativePoint);
			
			// 점1의 좌표 체크
			assert point1.x == 0 && point1.y == 2 : "Point1의 위치 (0, 2.0)이 아닙니다!";
			
			// 점1의 좌표 출력
			print(point1);
			
			// 두 점 사이의 거리 출력
			System.out.printf("두 점 사이의 거리 : %f\n", distance(point1, point2));
			
			// 두 점 사이의 거리 체크
			assert distance(point1, point2) == Math.sqrt(4.0) : "두 점 사이의 거리가 틀립니다!";
		}
		catch (AssertionError assertion) { System.out.println("[ AssertionError ] : " + assertion.getMessage()); }
	}

}