import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Roadblock2 extends Car {

	public Roadblock2(int number, int x, int y) {
		this.x = x;
		this.y = y;
		this.number = number;
		setWidth(50);
		setHeight(50);
		
	}

	@Override
	public void drawCar(Graphics g) {
		System.out.println("x:" + x + "y:" + y + "width:" + width + "height:" + height);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.green);
		g2.fillRect(x, y, width, height);
		g2.setColor(Color.black);
		g2.drawRect(x, y, width, height);
		
	}

}
