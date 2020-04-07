import java.awt.Color;
import java.awt.Graphics;
import java.awt.color.*;
import java.awt.*;
public class drop {
	
	Rainbow bow = new Rainbow();
	
	double randomW = Math.random() * Main.width + 1;
	int x=(int)randomW;
	
	double randomH = Math.random() * Main.height + 1;
	int y=(int)randomH;
	
	double randomV = Math.random() * 5+2;
	int speed=(int)randomV;
	
	double randomX = Math.random() * 3+ -3;
	int wind=(int)randomX;
	
 
	//Color color=Rainbow.RGBstrobe();
	

	public void fall() {
		y+=randomV;
		x+=wind;
		
		if(y>Main.height) {
			y=0;
		}
		if(x>Main.width) {
			x=0;
		}else if(x<0) {
			x=Main.width;
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(bow.RGBfade());
		//g.setColor(color);
		g.drawLine(x, y, x+wind, y+11);

		
	}
	
	public void setWind(int wind) {
		this.wind=wind;
	}
	
	public void Drop() {
		
	}
}
