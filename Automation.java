package week3.day2;

public class Automation extends MultipleLanguage implements TestTool,Language {
	

		public void java() {
			System.out.println("Java language");
			
		}

		public void Selenium() {
			System.out.println("Selenium Tool");
			
			
		}

		@Override
		public void ruby() {
			System.out.println(" Learn Ruby ");
			
		}
		public static void main(String[] args) {
			Automation tt = new Automation();
			tt.python();
			tt.java();
			tt.ruby();
			tt.Selenium();
			
		}
		
}
