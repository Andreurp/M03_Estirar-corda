package EstiraQueElmónAcaba;

import java.util.ArrayList;
import java.util.List;

import acm.graphics.GImage;

public class Equip {

	private static final int Nº_Jugadors = 6;
	
	List<Jugador>players=new ArrayList<Jugador>();
	GImage imatge; 
	
	public Equip(boolean dreta){
		String nomImatge="equip1.png";
		int inici=600;
		int modificador = -1;
		if(dreta==true){
			nomImatge="equip2.png";
			inici=830;
			modificador = 1;
		}
		for(int i=0; i<Nº_Jugadors; i++){
			imatge = new GImage(nomImatge, (i*50*modificador)+inici, 225);
			imatge.scale(0.2);
			Jugador temp = new Jugador(imatge);
			players.add(temp);
			
		}
	}
	public List<Jugador> getJugadors() {
		return players;
	}
	public int sumaForces(){
		int forsaEquip=0;
		for(Jugador j: players){
			forsaEquip=forsaEquip+j.canviarForsa();
		}
		return forsaEquip;
	}
	public void mouJugadors(int x, int y){
		for(Jugador j: players){
			j.moure(x, y);
		}
	}
}
