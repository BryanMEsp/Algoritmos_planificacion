
public class Main {
	static String datos[];
	static String pp0,pp1,pp2,pp3,pp4,pp5,pp6,pp7,cv,xv,npv;
	
	
public static void main(String[] args)throws Exception{   
	Lector le = new Lector();
	datos = le.leerTxt();
    
	npv = datos[0];
	cv = datos[1];
	xv = datos[2];
	pp0 = datos[3];
	pp1 = datos[4];
	pp2 = datos[5];
	pp3 = datos[6];
	pp4 = datos[7];
	pp5 = datos[8];
	pp6 = datos[9];
	pp7 = datos[10];
	
	//mostrar la tabla de contenido 
	Tabla t = new Tabla();
	
	
	//Fifo
	System.out.println(">>>>FCFS");
	t.mostrar();
	FCFS fcfs = new FCFS();
    fcfs.FCFS_Start();
    
    //sjf
    System.out.println("\n\n");
	System.out.println(">>>>SJF Apropiativo");
    t.mostrar();
	SJF sjf= new SJF();
    sjf.SJF_Start();
    
    //rr
    System.out.println("\n\n");
	System.out.println(">>>>Round Robin");
    t.mostrar();
    RoundRobin rr = new RoundRobin();
    rr.start();
    
    //priority
    System.out.println("\n\n");
	System.out.println(">>>>Priority Apropiativo");
    t.mostrar();
    PriorityA pa = new PriorityA();
    pa.start();
}
}
