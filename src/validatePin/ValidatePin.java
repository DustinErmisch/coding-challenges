package validatePin;

public class ValidatePin {

	public static void main(String[] args) {
		print(validate("121317"));//true
		print(validate("1234"));//true
		print(validate("45135"));//false
		print(validate("89abc1"));//false
		print(validate("900876"));//true
		print(validate(" 4983"));//true
		

	}
	public static boolean validate (String pin) {
		boolean validation = false;
		int charAt = 0;
		//erstmal gucken ob die Laenge stimmt
		if(pin.length()==4 || pin.length() == 6) {
			validation = true;
		}
		//dann gucken ob nur Nummern im Pin und keine Leerzeichen
		for (int i = 0; i < pin.length(); i++) {
			charAt = pin.charAt(i);
			//0 ist Asci 48 und 9 ist Asci 57 -> alle die ausserhalb sind ungueltig
			if(charAt < 48 || charAt > 57) {
				validation = false;
				break;
			}
		}
		return validation;
	}
	
	
	//Print funktion mit validate true oder false
	public static void print(boolean validation) {
		if(validation) {
			System.out.println("Pin is valide");
		}else {
			System.out.println("Pin is not valide");
		}
	}

}
