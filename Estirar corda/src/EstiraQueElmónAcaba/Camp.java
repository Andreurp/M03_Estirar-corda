package EstiraQueElmónAcaba;

import java.util.List;

import acm.graphics.GLine;

public class Camp {
	
	private Equip equipDreta;
	private Equip equipEsquerra;
	private GLine linea;
	
	public Camp(){
		equipDreta = new Equip(true);
		equipEsquerra = new Equip(false);
	}
	
	public GLine CrearLinea() {
		linea= new GLine(750,0,750,500);	
		return linea;
	}
	public List<Jugador> getJugadorsEsquerra(){
		return equipEsquerra.getJugadors();
	}
	public List<Jugador> getJugadorsDreta(){
		return equipDreta.getJugadors();
	}
	public int estirada(){
		return equipDreta.sumaForces()-equipEsquerra.sumaForces();
	}
	public void mouEquips(int x, int y){
		equipDreta.mouJugadors(x, y);
		equipEsquerra.mouJugadors(x, y);
	}
	public boolean gameOver(){
		boolean xoca = false;
		int i=0;
		while(i<getJugadorsEsquerra().size()&&xoca==false){
			Jugador e = getJugadorsEsquerra().get(i);
			Jugador d = getJugadorsDreta().get(i);
			if(e.getPosicio().intersects(linea.getBounds())){
				xoca = true;
			}
			if(d.getPosicio().intersects(linea.getBounds())){
				xoca = true;
			}
			i++;
		}
		return xoca;
	}
}
