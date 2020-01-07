import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class PlayerCar extends Car {

	public PlayerCar(int number, int x, int y) {
		this.x = x;
		this.y = y;
		this.number = number;
		setWidth(30);
		setHeight(50);
		speed = 20;
	}

	@Override
	public void drawCar(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.red);
		g2.fillRect(x, y, width, height);
		g2.setColor(Color.black);
		g2.drawRect(x, y, width, height);
		
	}
}
