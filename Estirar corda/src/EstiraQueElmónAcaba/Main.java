package EstiraQueElmónAcaba;

import java.util.List;

import acm.program.GraphicsProgram;

public class Main extends GraphicsProgram{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void run() {
	
		setSize(1500,500);
				
		Camp joc = new Camp();
		add(joc.CrearLinea());
		
		Corda corda = new Corda();
		add(corda.CrearCorda());
		
		
		List<Jugador>players=joc.getJugadorsDreta();
		for(Jugador j: players){
			add(j.getImatge());
		}
		List<Jugador>players2=joc.getJugadorsEsquerra();
		for(Jugador j: players2){
			add(j.getImatge());
		}
		while(joc.gameOver()==false){
			int estirada=joc.estirada();
			corda.moure(estirada, 0);
			joc.mouEquips(estirada, 0);
			pause(230);
		}
	}
}
