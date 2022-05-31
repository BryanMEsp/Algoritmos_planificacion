import javax.swing.JFrame;

public class Tabla extends Conversor {
	int pid[] = {0,1,2,3,4,5,6,7};	//ids procesos
    int at[] = {p0[0],p1[0],p2[0],p3[0],p4[0],p5[0],p6[0],p7[0]};	//tiempos de llegada
    int bt[] = {p0[1],p1[1],p2[1],p3[1],p4[1],p5[1],p6[1],p7[1]};	//tiempos de ejecución
    int pr[] = {p0[2],p1[2],p2[2],p3[2],p4[2],p5[2],p6[2],p7[2]};	//prioridad
    int rest[] = new int[np];
    
	public void mostrar() {
		
		System.out.println("c = " + c);
	    System.out.println("x = " +x);
	    System.out.println("pid  arrival required priority      processed  rest");
	    for(int i=0; i<np; i++) {
	 	   rest[i] = bt[i] - bt[i];
	    	System.out.println("p"+pid[i] + "\t" + at[i] + "\t" + bt[i] + "\t" + pr[i] + "\t\t" + bt[i] + "\t" + rest[i]);
	    }
	    System.out.println("\n|x| = cambio de contexto");
        System.out.println("|~| = tiempo perdido\n");
	}
}
