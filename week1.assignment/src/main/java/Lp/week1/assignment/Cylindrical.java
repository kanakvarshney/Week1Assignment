package Lp.week1.assignment;

public class Cylindrical {
   public static void main(String[] args) {
		
		
		int tankHeight= 20;  //in feet.
		int tankDiameter=5;  //in feet.
		int pipeDiameter=5;  //in feet.
		
		double tankHeight1= tankHeight*0.3048; //in metre
		double tankRadius= tankDiameter/2.0 * 0.3048; // in metre
		
		double volumeOfTank= 3.14*tankRadius*tankRadius*tankHeight1;  // in metre cube
		double volumeOfTank1=volumeOfTank*1000;                       //in litre.
		
		for(int i=1; i<5; i++) {
			
			double rate;
			rate= volumeOfTank1 / (3600*i);     //litre per second
			
			Math.round(rate);
			System.out.println("Rate in which liguid should flow within "+ i +"hour is: "+ String.format("%.2f", rate) + "  litre/sec");
		}
		
	}
}
