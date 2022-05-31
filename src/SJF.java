public class SJF extends Conversor{
	
     
	public void SJF_Start() {
           int pid[] = new int[np];
           int at[] = {p0[0],p1[0],p2[0],p3[0],p4[0],p5[0],p6[0],p7[0]};
           int bt[] = {p0[1],p1[1],p2[1],p3[1],p4[1],p5[1],p6[1],p7[1]};
           //int pr[] = {p0[2],p1[2],p2[2],p3[2],p4[2],p5[2],p6[2],p7[2]};
           int ct[] = new int[np];
           int ta[] = new int[np];
           int wt[] = new int[np];
           int f[] = new int[np];
           int k[] = new int[np];
           int aux;
           
           int i, st=0, tot=0;
           
           for(i=0;i<np;i++) {
        	   pid[i] = i;
        	   k[i] = bt[i];
        	   f[i] = 0;
           }
           
           while(true){
        	int min = 99, c=np;   
        	if(tot == np) {
        		break;
        	}
        	
        	for(i=0; i<np; i++) {
        		if((at[i]<=st) && (f[i]==0) && (bt[i]<min)){
        			min = bt[i];
        			c=i;
        	}
        	}
        	
        	if(c==np) {
        		st++;
        	}else {
        		bt[c]--;
        		st++;
        		if(bt[c]==0) {
        			ct[c] = st;
        			f[c] = 1;
        			tot++;
        	}
        	}
           }
           
           for(i=0; i<np; i++) {
        	   ta[i] = ct[i] - at[i];
        	   wt[i] = ta[i] - k[i];
           }
           
           System.out.print("|");
           
           for(i=0; i<ct.length; i++) {
        	   for(int j=0; j < ct.length-1; j++) {
        		   if(ct[j] > ct[j+1]){
        		   aux = ct[j];
        		   ct[j] = ct[j+1];
        		   ct[j+1] = aux;
        		   
        		   aux = pid[j];
        		   pid[j] = pid[j+1];
        		   pid[j+1] = aux;
        		   
        		   aux = k[j];
        		   k[j] = k[j+1];
        		   k[j+1] = aux;
        		   }
        	   }
           }

           for(i=0; i <ct.length; i++) {
        	   int sus = k[i];
        	   
        		   if(pid[i]==0) {
        			   if(k[i]%c == 0) {
        				   for(int j=0; j<sus; j++){
        				   System.out.print("p0|");
        				   }
        				   
                		   System.out.print("x|");	
        			   }else{
        				   int bob, carl=0;
        				   bob = k[i];
        				   
        				   while(bob%c != 0) {
        					   bob++;
        					   carl++;
        				   }
        				   bob -= carl;
        				   
        				   for(int k1=0; k1<bob; k1++) {
        					   System.out.print("p0|");
        				   }
        				   for(int k1=0; k1<carl; k1++) {
        					   System.out.print("-|");
        				   }
        				   
                		   System.out.print("x|");	
        			   }
        		   }else if(pid[i]==1) {
        			   if(k[i]%c == 0) {
        				   for(int j=0; j<sus; j++){
        				   System.out.print("p1|");
        				   }
        				   
                		   System.out.print("x|");	
        			   }else{
        				   int bob, carl=0;
        				   bob = k[i];
        				   
        				   while(bob%c != 0) {
        					   bob++;
        					   carl++;
        				   }
        				   bob -= carl;
        				   
        				   for(int k1=0; k1<bob; k1++) {
        					   System.out.print("p1|");
        				   }
        				   for(int k1=0; k1<carl; k1++) {
        					   System.out.print("-|");
        				   }
        				   
                		   System.out.print("x|");	
        			   }
        		   }else if(pid[i]==2) {
        			   if(k[i]%c == 0) {
        				   for(int j=0; j<sus; j++){
        				   System.out.print("p2|");
        				   }
        				   
                		   System.out.print("x|");	
        			   }else{
        				   int bob, carl=0;
        				   bob = k[i];
        				   
        				   while(bob%c != 0) {
        					   bob++;
        					   carl++;
        				   }
        				   bob -= carl;
        				   
        				   for(int k1=0; k1<bob; k1++) {
        					   System.out.print("p2|");
        				   }
        				   for(int k1=0; k1<carl; k1++) {
        					   System.out.print("-|");
        				   }
        				   
                		   System.out.print("x|");	
        			   }
        		   }else if(pid[i]==3) {
        			   if(k[i]%c == 0) {
        				   for(int j=0; j<sus; j++){
        				   System.out.print("p3|");
        				   }
        				   
                		   System.out.print("x|");	
        			   }else{
        				   int bob, carl=0;
        				   bob = k[i];
        				   
        				   while(bob%c != 0) {
        					   bob++;
        					   carl++;
        				   }
        				   bob -= carl;
        				   
        				   for(int k1=0; k1<bob; k1++) {
        					   System.out.print("p3|");
        				   }
        				   for(int k1=0; k1<carl; k1++) {
        					   System.out.print("-|");
        				   }
        				   
                		   System.out.print("x|");	
        			   }
        		   }else if(pid[i]==4) {
        			   if(k[i]%c == 0) {
        				   for(int j=0; j<sus; j++){
        				   System.out.print("p4|");
        				   }
        				   
                		   System.out.print("x|");	
        			   }else{
        				   int bob, carl=0;
        				   bob = k[i];
        				   
        				   while(bob%c != 0) {
        					   bob++;
        					   carl++;
        				   }
        				   bob -= carl;
        				   
        				   for(int k1=0; k1<bob; k1++) {
        					   System.out.print("p4|");
        				   }
        				   for(int k1=0; k1<carl; k1++) {
        					   System.out.print("-|");
        				   }
        				   
                		   System.out.print("x|");	
        			   }

        		   }else if(pid[i]==5) {
        			   if(k[i]%c == 0) {
        				   for(int j=0; j<sus; j++){
        				   System.out.print("p5|");
        				   }
        				   
                		   System.out.print("x|");	
        			   }else{
        				   int bob, carl=0;
        				   bob = k[i];
        				   
        				   while(bob%c != 0) {
        					   bob++;
        					   carl++;
        				   }
        				   bob -= carl;
        				   
        				   for(int k1=0; k1<bob; k1++) {
        					   System.out.print("p5|");
        				   }
        				   for(int k1=0; k1<carl; k1++) {
        					   System.out.print("-|");
        				   }
        				   
                		   System.out.print("x|");	
        			   }
        		   }else if(pid[i]==6) {
        			   if(k[i]%c == 0) {
        				   for(int j=0; j<sus; j++){
        				   System.out.print("p6|");
        				   }
        				   
                		   System.out.print("x|");	
        			   }else{
        				   int bob, carl=0;
        				   bob = k[i];
        				   
        				   while(bob%c != 0) {
        					   bob++;
        					   carl++;
        				   }
        				   bob -= carl;
        				   
        				   for(int k1=0; k1<bob; k1++) {
        					   System.out.print("p6|");
        				   }
        				   for(int k1=0; k1<carl; k1++) {
        					   System.out.print("-|");
        				   }
        				   
                		   System.out.print("x|");	
        			   }
        		   }else if(pid[i]==7) {
        			   if(k[i]%c == 0) {
        				   for(int j=0; j<sus; j++){
        				   System.out.print("p7|");
        				   }
        				   
                		   System.out.print("x|");	
        			   }else{
        				   int bob, carl=0;
        				   bob = k[i];
        				   
        				   while(bob%c != 0) {
        					   bob++;
        					   carl++;
        				   }
        				   bob -= carl;
        				   
        				   for(int k1=0; k1<bob; k1++) {
        					   System.out.print("p7|");
        				   }
        				   for(int k1=0; k1<carl; k1++) {
        					   System.out.print("-|");
        				   }
        				   
                		   System.out.print("x|");	
        			   }
        	   }
           }
	}
}
