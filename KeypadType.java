/**
 * File: TestingFX/keypad/KeypadType.java
 * Package: keypad
 * @author Tiffany Fadgen 
 * Created on: April 19, 2023
 * Last Modified: April 19, 2023
 * Description: Changes button numbers 
 */

package keypad;

class KeypadType extends KeyPadPane {
	public KeypadType() {
		btn1.setText("7\nHome");
		btn2.setText("8\n^      ");
		btn3.setText("9\nPgUp");
		btn4.setText("4\n<       ");
		btn5.setText("5\n         ");
		btn6.setText("6\n>      ");
		btn7.setText("1\nEnd    ");
		btn8.setText("2\nv       ");
		btn9.setText("3\nPgDn");
		btnBlank1.setText("0\nIns     ");
		btn0.setText(".\nDel   ");
		
		listButtons.remove(btnBlank2);
	}
}
