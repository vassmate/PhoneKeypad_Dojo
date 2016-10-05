package keypad.reader;

import java.util.Hashtable;

public class KeypadReader {

	private Hashtable<String, String[]> keypad = new Hashtable<String, String[]>();

	public KeypadReader() {
		initPad();
	}

	public String reader(String input) {
		String result = "";

		if (input == null || input.equals("")) {
			return result;
		}
		String currentKey = "";
		int currentKeyCount = 0;

		for (int i = 0; i < input.length(); i++) {
			currentKey = String.valueOf(input.charAt(i));

			if (keypad.containsKey(currentKey)) {
				currentKeyCount++;
			}

			if (i + 1 > input.length() - 1) {
				currentKeyCount--;
				result += getKeypadValue(currentKey, currentKeyCount);
				break;
			}

			if (!String.valueOf(input.charAt(i + 1)).equals(currentKey)) {
				currentKeyCount--;
				result += getKeypadValue(currentKey, currentKeyCount);
				currentKey = "";
				currentKeyCount = 0;
			}
		}
		return result;
	}

	private String getKeypadValue(String currentKey, int currentKeyCount) {
		String value;
		if (currentKeyCount > keypad.get(currentKey).length - 1) {
			value = keypad.get(currentKey)[keypad.get(currentKey).length - 1];
		} else {
			value = keypad.get(currentKey)[currentKeyCount];
		}
		return value;
	}

	private void initPad() {
		keypad.put("1", new String[] { "" });
		keypad.put("2", new String[] { "A", "B", "C" });
		keypad.put("3", new String[] { "D", "E", "F" });
		keypad.put("4", new String[] { "G", "H", "I" });
		keypad.put("5", new String[] { "J", "K", "L" });
		keypad.put("6", new String[] { "M", "N", "O" });
		keypad.put("7", new String[] { "P", "Q", "R", "S" });
		keypad.put("8", new String[] { "T", "U", "V" });
		keypad.put("9", new String[] { "W", "X", "Y", "Z" });
		keypad.put("9", new String[] { "W", "X", "Y", "Z" });
		keypad.put("0", new String[] { " " });
	}
}
