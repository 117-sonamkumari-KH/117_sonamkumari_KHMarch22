	 
	 class Nquestion1_11
	 {
	 public static void main(String args[])
	 {
		int letter = 69;
	 for(int i=5;i>=1;i--)
	 {
		 for(int j = 1;j<=i;j++)
		 {
			 System.out.print(" ");
		 }
		 for(int j=5-i;j>=0;j--)
		 {
			 System.out.print((char)(letter-j)+" ");
		 }
		 System.out.println();
	 }
	 }
     }