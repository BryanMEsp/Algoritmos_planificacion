public class RoundRobin extends Conversor{
	
	
	public void start() {
		
		int i, count = 0, temp, sq=0, qt;
		int bt[] = {p0[1],p1[1],p2[1],p3[1],p4[1],p5[1],p6[1],p7[1]};
        //int at[] = {p0[0],p1[0],p2[0],p3[0],p4[0],p5[0],p6[0],p7[0]};
        //int pr[] = {p0[2],p1[2],p2[2],p3[2],p4[2],p5[2],p6[2],p7[2]};
		int pid[] = {0,1,2,3,4,5,6,7};
		int tat[] = new int[np];
		int rem_bt[] = new int[np];
		
		for(i=0; i<np; i++) {
			rem_bt[i] = bt[i];
		}
		
		qt = c;
		
		while(true){
			for(i=0,count=0; i < np; i++) {
				temp = qt;
				if(rem_bt[i]==0) {
					count++;
					continue;
				}
				if(rem_bt[i]>qt){
					rem_bt[i] = rem_bt[i] - qt;
				}else if(rem_bt[i] >= 0) {
					temp = rem_bt[i];
					rem_bt[i] = 0;
				}
				sq = sq +temp;
				tat[i] = sq;
			}
			if(np == count){
				break;
			}
			
		}
		
        System.out.print("|");
		
        for(i=0; i <tat.length; i++) {
     	   int sus = bt[i];
     	   
     		   if(pid[i]==0) {
     			   if(bt[i]%c == 0) {
     				   for(int j=0; j<sus; j++){
     				   System.out.print("p0|");
     				   }
     				   
             		   System.out.print("x|");	
     			   }else{
     				   int bob, carl=0;
     				   bob = bt[i];
     				   
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
     			   if(bt[i]%c == 0) {
     				   for(int j=0; j<sus; j++){
     				   System.out.print("p1|");
     				   }
     				   
             		   System.out.print("x|");	
     			   }else{
     				   int bob, carl=0;
     				   bob = bt[i];
     				   
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
     			   if(bt[i]%c == 0) {
     				   for(int j=0; j<sus; j++){
     				   System.out.print("p2|");
     				   }
     				   
             		   System.out.print("x|");	
     			   }else{
     				   int bob, carl=0;
     				   bob = bt[i];
     				   
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
     			   if(bt[i]%c == 0) {
     				   for(int j=0; j<sus; j++){
     				   System.out.print("p3|");
     				   }
     				   
             		   System.out.print("x|");	
     			   }else{
     				   int bob, carl=0;
     				   bob = bt[i];
     				   
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
     			   if(bt[i]%c == 0) {
     				   for(int j=0; j<sus; j++){
     				   System.out.print("p4|");
     				   }
     				   
             		   System.out.print("x|");	
     			   }else{
     				   int bob, carl=0;
     				   bob = bt[i];
     				   
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
     			   if(bt[i]%c == 0) {
     				   for(int j=0; j<sus; j++){
     				   System.out.print("p5|");
     				   }
     				   
             		   System.out.print("x|");	
     			   }else{
     				   int bob, carl=0;
     				   bob = bt[i];
     				   
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
     			   if(bt[i]%c == 0) {
     				   for(int j=0; j<sus; j++){
     				   System.out.print("p6|");
     				   }
     				   
             		   System.out.print("x|");	
     			   }else{
     				   int bob, carl=0;
     				   bob = bt[i];
     				   
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
     			   if(bt[i]%c == 0) {
     				   for(int j=0; j<sus; j++){
     				   System.out.print("p7|");
     				   }
     				   
             		   System.out.print("x|");	
     			   }else{
     				   int bob, carl=0;
     				   bob = bt[i];
     				   
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
