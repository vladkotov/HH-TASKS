/*
Даны N точек на плоскости (для простоты можно считать, 
что у всех точек целочисленные координаты). Назовём расстояние от точки A 
до ближайшей к ней точки B "радиусом" точки A. "Соседями" точки A будем называть 
все точки, лежащие в пределах двойного радиуса от неё включительно
(кроме самой точки A).
*/
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JPanel{

	Random rand = new Random();
	
	JLabel l1;
	JTextField t1;
	JButton b1;
	int n; //число пользователя
	int j; //индекс проверяемых точек
	double dist; //расстояние между точками
	int startRadius; //начальный радиус каждой точки
	double doubleRadius; // двойной радиус для поиска соседей
	int neighborsCount; //счетчик соседей точки
	
	public void setN(int n) {
		this.n = n;
	}
	
	public void drawing(){
		l1 = new JLabel("Введите в поле целое число N: ");
		t1 = new JTextField(10);
		b1 = new JButton("Нажми меня");
		add(l1);
		add(t1);
		add(b1);
	}
	
	public void paintComponent(Graphics g){ //вывод точек в фрейм
		Point [] point = new Point[n];
		
		for(int i = 0; i < n; i++){
			point[i] = new Point();
			point[i].setX((int)(100 + Math.random() * 800));
			point[i].setY((int)(100 + Math.random() * 600));
		}
		
		for(int i = 0; i < n; i++){
			startRadius = 1;
			int xO = point[i].getX();
			int yO = point[i].getY();
			
			do{
				for(int j = 0; j < n; j++){
					dist = Math.pow((xO-point[j].getX()), 2) + Math.pow((yO-point[j].getY()), 2);
					if(dist!=0){
						if(dist<=(Math.pow(startRadius, 2))){
							point[i].setRadius(Math.sqrt(dist));
							break;
						}
					}
				}
				if(point[i].getRadius()!=0){
					break;
				}
				startRadius++;
			}while(true);
			
			neighborsCount = 0;
			for(int j = 0; j < n; j++){
				double dist = Math.pow((xO-point[j].getX()), 2) + Math.pow((yO-point[j].getY()), 2);
				doubleRadius = point[i].getRadius() * 2;
				if(dist!=0){
					if (dist <= Math.pow(doubleRadius, 2)){
						neighborsCount++;
					}
				}
			}
			point[i].setNeighborsOfPoint(neighborsCount);
		}
		
		super.paintComponent(g);//здесь рисовать радиусы
		g.setColor(Color.BLUE);
		for (int i = 0; i < n; i++){
			g.fillOval(point[i].getX(),point[i].getY(), (int) point[i].getRadius()*2, (int) point[i].getRadius()*2);
		}
		g.setColor(Color.BLACK);
		for (int i = 0; i < n; i++){
			g.drawArc(point[i].getX(), point[i].getY(), (int) point[i].getRadius()*2, (int) point[i].getRadius()*2, 0, 360);
			System.out.println("Радиус точки №" + i + ": " + point[i].getRadius() + ". Координаты точки (" + point[i].getX() + ", " + point[i].getY() + ")" + ". Соседей: " + point[i].getNeighborsOfPoint());
		}
	}
}
