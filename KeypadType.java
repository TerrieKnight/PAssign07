/**
 * File: TestingFX/keypad/KeyPadPane.java
 * Package: keypad
 * @author Christopher Williams
 * Created on: Mar 02, 2020
 * Last Modified:  Oct 27, 2021
 * Description:  Extended GridPane that creates a KeyPad with either an ATM or phone-esque 
 * 			Button arrangement
 * Small change to trigger update
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
