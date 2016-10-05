package keypad.runner;

import keypad.reader.KeypadReader;

public class Runner {
	public static void main(String[] args) {
		KeypadReader kr = new KeypadReader();
		System.out.println(kr.reader("99966688088777733130866602221255515550633066616606999022233555155574466616633"));
	}
}
