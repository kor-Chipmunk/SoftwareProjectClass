
public class Point implements IPoint {
	
	private double mX = 0.0;
	private double mY = 0.0;
	private final PointValidation validation = new PointValidation();
	
	Point() { }
	Point(double X, double Y) {
		try {
			setX(X);
			setY(Y);
		}
		catch (Exception ex) { System.out.println(ex.getMessage()); }
	}
	
	public double getX() { return mX; }
	public void setX(double X) throws PointRangeException {
		if (validation.validationX(X)) { mX = X; }
		else { throw new PointRangeException("X�� ������ -100.0 ~ 100.0 ���̿��� �մϴ�!"); }
	}
	
	public double getY() { return mY; }
	public void setY(double Y) throws PointRangeException {
		if (validation.validationY(Y)) { mY = Y; }
		else { throw new PointRangeException("Y�� ������ -100.0 ~ 100.0 ���̿��� �մϴ�!"); }
	}
	
	public static double distance(double srcX, double srcY, double destX, double destY) {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(destX - srcX, 2) + Math.pow(destY - srcY, 2));
	}
	
	public static double distance(Point srcPoint, Point destPoint) {
		return distance(srcPoint.getX(), srcPoint.getY(), destPoint.getX(), destPoint.getY());
	}
	
	@Override
	public double distance(Point destPoint) {
		return distance(getX(), getY(), destPoint.getX(), destPoint.getY());
	}
	
	@Override
	public int move(double moveRelatedX, double moveRelatedY) {
		// TODO Auto-generated method stub
		try {
			setX( getX() + moveRelatedX );
			setY( getY() + moveRelatedY );
			return Setting.SUCCESS_MOVE;
		}
		catch (Exception ex) { return Setting.FAIL_MOVE; }
	}
	
	public int move(Point moveRelatedPoint) {
		return move(moveRelatedPoint.getX(), moveRelatedPoint.getY());
	}
	
	public int moveAbsPoint(Point moveAbsolutePoint) {
		return move(moveAbsolutePoint.getX() - getX(), moveAbsolutePoint.getY() - getY());
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("< Point ��ü ��� >");
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "���� X��ǥ : " + getX() + "\t���� Y��ǥ : " + getY();
	}
}
