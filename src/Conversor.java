public class Conversor extends Main {
	//Pasar los string a arreglo y separarlos
	 String[] p0_ = pp0.split(",");
	 String[] p1_ = pp1.split(",");
	 String[] p2_ = pp2.split(",");
	 String[] p3_ = pp3.split(",");
	 String[] p4_ = pp4.split(",");
	 String[] p5_ = pp5.split(",");
	 String[] p6_ = pp6.split(",");
	 String[] p7_ = pp7.split(",");
	 String[] np_ = npv.split("\\s*");
	 String[] x_ = xv.split("\\s*");
	 String[] c_ = cv.split("\\s*");
	 
	 //quitar las letras y dejar solo los numeros
	 String npp = np_[5];
	 String xx = x_[4]+x_[5]+x_[6]; 
	 String cc = c_[4];
	 String[] p00 = {p0_[1],p0_[2],p0_[3]};
	 String[] p11 = {p1_[1],p1_[2],p1_[3]};
	 String[] p22 = {p2_[1],p2_[2],p2_[3]};
	 String[] p33 = {p3_[1],p3_[2],p3_[3]};
	 String[] p44 = {p4_[1],p4_[2],p4_[3]};
	 String[] p55 = {p5_[1],p5_[2],p5_[3]};
	 String[] p66 = {p6_[1],p6_[2],p6_[3]};
	 String[] p77 = {p7_[1],p7_[2],p7_[3]};
	 
	 //quitar los espacios alado de los numeros
	 String p0e = p00[0]+p00[1]+p00[2];
	 String p1e = p11[0]+p11[1]+p11[2];
	 String p2e = p22[0]+p22[1]+p22[2];
	 String p3e = p33[0]+p33[1]+p33[2];
	 String p4e = p44[0]+p44[1]+p44[2];
	 String p5e = p55[0]+p55[1]+p55[2];
	 String p6e = p66[0]+p66[1]+p66[2];
	 String p7e = p77[0]+p77[1]+p77[2];
	 
	 String[] p0x = p0e.split("\\s*");
	 String[] p1x = p1e.split("\\s*");
	 String[] p2x = p2e.split("\\s*");
	 String[] p3x = p3e.split("\\s*");
	 String[] p4x = p4e.split("\\s*");
	 String[] p5x = p5e.split("\\s*");
	 String[] p6x = p6e.split("\\s*");
	 String[] p7x = p7e.split("\\s*");
	 
	 
	 String[] p0n = {p0x[2],p0x[4],p0x[6]};
	 String[] p1n = {p1x[2],p1x[4],p1x[6]};
	 String[] p2n = {p2x[2],p2x[4],p2x[6]};
	 String[] p3n = {p3x[2],p3x[4],p3x[6]};
	 String[] p4n = {p4x[2],p4x[4],p4x[6]};
	 String[] p5n = {p5x[2],p5x[4],p5x[6]};
	 String[] p6n = {p6x[2],p6x[4],p6x[6]};
	 String[] p7n = {p7x[2],p7x[4],p7x[6]};
	 
	 //arreglos de enteros
	 
	 int np = Integer.parseInt(npp);
	 double x = Double.parseDouble(xx);
	 int c = Integer.parseInt(cc);
     int[] p0 = {Integer.parseInt(p0n[0]), Integer.parseInt(p0n[1]), Integer.parseInt(p0n[2])};
     int[] p1 = {Integer.parseInt(p1n[0]), Integer.parseInt(p1n[1]), Integer.parseInt(p1n[2])};
     int[] p2 = {Integer.parseInt(p2n[0]), Integer.parseInt(p2n[1]), Integer.parseInt(p2n[2])};
     int[] p3 = {Integer.parseInt(p3n[0]), Integer.parseInt(p3n[1]), Integer.parseInt(p3n[2])};
     int[] p4 = {Integer.parseInt(p4n[0]), Integer.parseInt(p4n[1]), Integer.parseInt(p4n[2])};
     int[] p5 = {Integer.parseInt(p5n[0]), Integer.parseInt(p5n[1]), Integer.parseInt(p5n[2])};
     int[] p6 = {Integer.parseInt(p6n[0]), Integer.parseInt(p6n[1]), Integer.parseInt(p6n[2])};
     int[] p7 = {Integer.parseInt(p7n[0]), Integer.parseInt(p7n[1]), Integer.parseInt(p7n[2])};
       
       
       
}
