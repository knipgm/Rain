import java.awt.Color;
public class Rainbow {
	static float red=randomRGB();
	static float green=randomRGB();
	static float blue=randomRGB();
	
	static int randomRGB() {
		double rand = Math.random() * 255;
		return (int)rand;
	}
	
	
	static Color RGBstrobe() {
		final Color randomColor=new Color(randomRGB(),randomRGB(),randomRGB());
		return randomColor;
		
	}
	
	static double rate= .001;
	
	Color RGBfade() {
		if(red<254) {
			red+=rate;
		}else red=0;
		
		if(green<255) {
			green+=.005;
		}else green=0;
		
		if(blue<255) {
			blue+=.002;
		}else blue=0;
		
		
		
		final Color color=new Color((int)red,(int)green,(int)blue);
		return color;
	}

	Rainbow(){
		
	}


	
	
	
	
}
