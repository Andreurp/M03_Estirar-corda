package EstiraQueElmónAcaba;

import java.util.Random;

import acm.graphics.GImage;
import acm.graphics.GRectangle;

public class Jugador {
	
	private static final int Forsa_minima = 10;
	private static final int Forsa_maxima = 10;
	
	private int forsa;
	private GImage imatge;
	private Random r;
	private int maximForsa;
	
	public Jugador(GImage imatge) {
		this.imatge=imatge;
		r = new Random();
		maximForsa=Forsa_minima+r.nextInt(Forsa_maxima);
		this.canviarForsa();
	}
	public int getForsa() {
		return forsa;
	}
	public int canviarForsa() {
		forsa = r.nextInt(maximForsa);
		return forsa;
	}
	public GImage getImatge() {
		return imatge;
	}
	public void moure(int x,int y){
		imatge.move(x, y);
	}
	public GRectangle getPosicio(){
		return imatge.getBounds();
	}
	

}
