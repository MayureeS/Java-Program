package model;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0 ;
		String bootsUp[] = {"Cheerup" , "All is Well" , "We are at home"} ;
		while(i<4)
		{
			try {
				System.out.println(bootsUp[i++]);
			}
			catch(Exception e) {
				System.out.println(e.toString());
			}
			finally {
				System.out.println("You should quit and reset index value as i<3");
			}
		}
	}

}
