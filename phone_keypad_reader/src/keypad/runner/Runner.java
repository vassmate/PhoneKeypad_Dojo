package keypad.runner;

import keypad.reader.KeypadReader;

public class Runner {
	public static void main(String[] args) {
		KeypadReader kr = new KeypadReader();
		System.out.println(kr.reader("62833"));
	}
}
