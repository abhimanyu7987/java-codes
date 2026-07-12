public class ForLoopEx2 {
	public static void main(String[] args) {
		for(int a=1;a<=5;) {
			System.out.println(" Abhimanyu Verma");
			a++;
		}
		System.out.println("--------------");
		int a=1;
		for(;a<=5;) {
			System.out.println("Abhimanyu Verma");
			a++;
		}
		System.out.println("--------------");
		for(;;) {  //Infinite Loop
			System.out.println("Abhimanyu Verma");
		}
		//System.out.println("bye");//error
	}
}