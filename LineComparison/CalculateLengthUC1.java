public class CalculateLengthUC1{

	public static double calcLength(int x1, int x2, int y1, int y2){
		
		int temp1 = (x2-x1) * (x2-x1);
		int temp2 = (y2-y1) * (y2-y1);

		double length = Math.sqrt(temp1+temp2);
		return length;
	}
	public static void main(String[] args){

		int x1 = (int)(Math.floor(Math.random() *10));
		int x2 = (int)(Math.floor(Math.random() *10));
		int y1 = (int)(Math.floor(Math.random() *10));
		int y2 = (int)(Math.floor(Math.random() *10));

		System.out.println("The co-ordinates are (" + x1 +","  + y1 + ") and (" + y1 + "," + y2 + ").");
		double length = calcLength(x1,x2,y1,y2);
		System.out.println("The length of the given line is : "+length);
	}
}