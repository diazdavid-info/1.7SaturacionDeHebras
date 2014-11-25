package david;

class MiHebra extends Thread{
	public void run(){
		while(true);
	}
}

public class SaturacionDeHebras {

	public static void main(String[] args) {
		int numHebras = 0;
		
		if(args.length > 0){
			try {
				numHebras = Integer.parseInt(args[0]);
				System.out.println("Creamos "+numHebras+" hebras.");
			} catch (NumberFormatException e) {
				System.out.println("Parametro invalido. Se asume 0");
			}
		}
		
		int i = 0;
		while((numHebras == 0) || (i < numHebras)){
			System.out.println("Creamos hebra número: "+i);
			MiHebra mh = new MiHebra();
			mh.start();
			i++;
		}
		
		System.out.println("Todas creadas. Esperamos...");
		while(true);

	}

}
