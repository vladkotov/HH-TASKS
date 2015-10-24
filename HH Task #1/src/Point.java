
public class Point {

	private int x; //координата x
	private int y; //координата y
	private double radius; //радиус точки
	private int neighborsOfPoint; //количество точек соседей
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getNeighborsOfPoint() {
		return neighborsOfPoint;
	}
	public void setNeighborsOfPoint(int neighborsOfPoint) {
		this.neighborsOfPoint = neighborsOfPoint;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
