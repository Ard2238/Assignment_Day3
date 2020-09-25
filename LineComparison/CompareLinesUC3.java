public class CompareLinesUC3{

	public static int calcLength(int x1, int x2, int y1, int y2){
		
		int temp1 = (int) Math.pow(x2-x1,2);
		int temp2 = (int) Math.pow(y2-y1,2);

		int length = (int) Math.sqrt(temp1+temp2);
		return length;
	}
	public static void main(String[] args){

		int x1 = (int)(Math.floor(Math.random() *10));
		int x2 = (int)(Math.floor(Math.random() *10));
		int x3 = (int)(Math.floor(Math.random() *10));
		int x4 = (int)(Math.floor(Math.random() *10));
		int y1 = (int)(Math.floor(Math.random() *10));
		int y2 = (int)(Math.floor(Math.random() *10));
		int y3 = (int)(Math.floor(Math.random() *10));
		int y4 = (int)(Math.floor(Math.random() *10));

		System.out.println("The co-ordinates are (" + x1 +","  + y1 + ") and (" + x2 + "," + y2 + ").");
		System.out.println("The co-ordinates are (" + x3 +","  + y3 + ") and (" + x4 + "," + y4 + ").");
		int length1 = calcLength(x1,x2,y1,y2);
		int length2 = calcLength(x1,x2,y1,y2);

		int value = ((Integer)length1).compareTo((Integer)length2);

		if(value > 0){
			System.out.println("Line1 is greater than Line2");
		}else if (value < 0){
			System.out.println("Line1 is lesser than Line2");
		}else{
			System.out.println("Lines are equal");	
		}
	}
}