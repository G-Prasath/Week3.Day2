package Abstract_Class;

public class Automation extends MultipleLanguage implements TestTool {

	public void Java() {
		
		System.out.println("This Java Language");
	}

	public void Selenium() {
		System.out.println("This is Selenium Tool");
		
	}

	@Override
	public void ruby() {
		System.out.println("This is Ruby Language");
		
	}
	
	public static void main(String[] args) {
		
		Automation obj = new Automation();
		obj.Java();
		obj.python();
		obj.Selenium();
		obj.ruby();

	}

}
