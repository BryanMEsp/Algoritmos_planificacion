
public class PriorityA extends Conversor{
	public void start() {
		int pid[] = {0,1,2,3,4,5,6,7};	//ids procesos
        int at[] = {p0[0],p1[0],p2[0],p3[0],p4[0],p5[0],p6[0],p7[0]};	//tiempos de llegada
        int bt[] = {p0[1],p1[1],p2[1],p3[1],p4[1],p5[1],p6[1],p7[1]};	//tiempos de ejecución
        int pr[] = {p0[2],p1[2],p2[2],p3[2],p4[2],p5[2],p6[2],p7[2]};	//prioridad
        int temp;
        int i;
        
        
      //clasificación según la prioridad
        for( i = 0 ; i <np; i++){
        	for(int  j=1;  j < np-(i+1) ; j++){
        		if( pr[j] > pr[j+1] ){
        				temp = pr[j];
            			pr[j] = pr[j+1];
            			pr[j+1] = temp;
	        			temp = at[j];
	        			at[j] = at[j+1];
	        			at[j+1] = temp;
	        			temp = bt[j];
	        			bt[j] = bt[j+1];
	        			bt[j+1] = temp;
	        			temp = pid[j];
	        			pid[j] = pid[j+1];
	        			pid[j+1] = temp;
        		}
        	}
        }
      
		System.out.print("|");
        for( i=0; i<np; i++) {
        	int pos = bt[i];
        	if(pid[i] == 0) {
        		if(bt[i]%c == 0) {
        			for(int j=0; j<pos; j++) {
        				System.out.print("p0|");
        			}
        		System.out.print("x|");
        		}else {
        			int eje = bt[i];
        			int cont = 0;
        			
        			while(eje%c !=0) {
        				eje++;
        				cont++;
        			}
        			eje = eje-cont;
        				for(int j=0; j<pos; j++) {
            				System.out.print("p0|");
        				}
        				for(int j=0; j<cont; j++) {
            				System.out.print("~|");
        				}
        				System.out.print("x|");
        		}
        		
        	}else if(pid[i] ==1) {
        		if(bt[i]%c == 0) {
        			for(int j=0; j<pos; j++) {
        				System.out.print("p1|");
        			}
        		System.out.print("x|");
        		}else {
        			int eje = bt[i];
        			int cont = 0;
        			
        			while(eje%c !=0) {
        				eje++;
        				cont++;
        			}eje = eje-cont;
        				for(int j=0; j<pos; j++) {
            				System.out.print("p1|");
        				}
        				for(int j=0; j<cont; j++) {
            				System.out.print("~|");
        				}
        				System.out.print("x|");
        		}
        	}else if(pid[i]==2) {
        		if(bt[i]%c == 0) {
        			for(int j=0; j<pos; j++) {
        				System.out.print("p2|");
        			}
        		System.out.print("x|");
        		}else {
        			int eje = bt[i];
        			int cont = 0;
        			
        			while(eje%c !=0) {
        				eje++;
        				cont++;
        			}
        			eje = eje-cont;
        				for(int j=0; j<pos; j++) {
            				System.out.print("p2|");
        				}
        				for(int j=0; j<cont; j++) {
            				System.out.print("~|");
        				}
        				System.out.print("x|");
        		}
        	}else if(pid[i]==3) {
        		if(bt[i]%c == 0) {
        			for(int j=0; j<pos; j++) {
        				System.out.print("p3|");
        			}
        		System.out.print("x|");
        		}else {
        			int eje = bt[i];
        			int cont = 0;
        			
        			while(eje%c !=0) {
        				eje++;
        				cont++;
        			}
        			eje = eje-cont;
        				for(int j=0; j<pos; j++) {
            				System.out.print("p3|");
        				}
        				for(int j=0; j<cont; j++) {
            				System.out.print("~|");
        				}
        				System.out.print("x|");
        		}
        	}else if(pid[i]==4) {
        		if(bt[i]%c == 0) {
        			for(int j=0; j<pos; j++) {
        				System.out.print("p4|");
        			}
        		System.out.print("x|");
        		}else {
        			int eje = bt[i];
        			int cont = 0;
        			
        			while(eje%c !=0) {
        				eje++;
        				cont++;
        			}
        			eje = eje-cont;
        				for(int j=0; j<pos; j++) {
            				System.out.print("p4|");
        				}
        				for(int j=0; j<cont; j++) {
            				System.out.print("~|");
        				}
        				System.out.print("x|");
        		}
        	}else if(pid[i]==5) {
        		if(bt[i]%c == 0) {
        			for(int j=0; j<pos; j++) {
        				System.out.print("p0|");
        			}
        		System.out.print("x|");
        		}else {
        			int eje = bt[i];
        			int cont = 0;
        			
        			while(eje%c !=0) {
        				eje++;
        				cont++;
        			}
        			eje = eje-cont;
        				for(int j=0; j<pos; j++) {
            				System.out.print("p5|");
        				}
        				for(int j=0; j<cont; j++) {
            				System.out.print("~|");
        				}
        				System.out.print("x|");
        		}
        	}else if(pid[i]==6) {
        		if(bt[i]%c == 0) {
        			for(int j=0; j<pos; j++) {
        				System.out.print("p6|");
        			}
        		System.out.print("x|");
        		}else {
        			int eje = bt[i];
        			int cont = 0;
        			
        			while(eje%c !=0) {
        				eje++;
        				cont++;
        			}
        			eje = eje-cont;
        				for(int j=0; j<pos; j++) {
            				System.out.print("p6|");
        				}
        				for(int j=0; j<cont; j++) {
            				System.out.print("~|");
        				}
        				System.out.print("x|");
        		}
        	}else if(pid[i]==7) {
        		if(bt[i]%c == 0) {
        			for(int j=0; j<pos; j++) {
        				System.out.print("p7|");
        			}
        		System.out.print("x|");
        		}else {
        			int eje = bt[i];
        			int cont = 0;
        			
        			while(eje%c !=0) {
        				eje++;
        				cont++;
        			}
        			eje = eje-cont;
        				for(int j=0; j<pos; j++) {
            				System.out.print("p7|");
        				}
        				for(int j=0; j<cont; j++) {
            				System.out.print("~|");
        				}
        				System.out.print("x|");
        		}
        	}
        }
        System.out.println();
	}
}
