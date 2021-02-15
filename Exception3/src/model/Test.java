package model;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args)
		throws ArithmeticException,ArrayIndexOutOfBoundsException{
			int i= args.length;
			System.out.println("argument length: " +i);
			//String myString = args[i];
			try{
			int x=18/i;
			if(args[0].equals("Java")){
			System.out.println("The first word is Java");}
			System.out.println("The no of arguments are " + i);
			int y[] ={555,897};
			y[i]=x;
			}// try ends
			finally{
			System.out.println("Something has gone wrong");
			}//finally ends

	}

}