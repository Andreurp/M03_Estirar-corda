package EstiraQueElmónAcaba;

import java.awt.Color;

import acm.graphics.GRect;

public class Corda {
	GRect corda;
	public GRect CrearCorda() {
		corda = new GRect(375,270,760,5);
		corda.getFillColor();
		corda.setFilled(true);
        corda.setFillColor(Color.BLUE);		
		return corda;
	}
	public void moure(int x,int y){
		corda.move(x, y);
	}

}
