package week3.day2.assignments;

public class Automation extends MultipleLanguage {

	public static void main(String[] args) {


		Automation a=new Automation();
		a.java();a.python();a.ruby();a.selenium();

	}

	public void selenium() {
		System.out.println("This is selenium");
		
	}

	public void java() {
		System.out.println("This is Java");
		
	}

	@Override
	public void ruby() {
		System.out.println("This is Ruby");
		
	}

}
