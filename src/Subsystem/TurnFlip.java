package Subsystem;

import R.Robot;

public class TurnFlip {
	/**
	 *<pre>
	 *b = back
	 *bi = Back Prime
	 *d = down
	 *di = down prime
	 *f = front
	 *fi = front
	 *l = Left
	 *li = Left prime
	 *r = right
	 *ri = right prime
	 *u = up
	 *ui = up prime
	 *</pre>
	 * @param Move(all lowercase)
	 */
	public static void TurnFlip(String Move) {
		if(Move == "di") {
			DownPrime();
		}
		else if(Move == "d") {
			Down();
		}
		else if(Move == "b") {
			Back();
		}
		else if(Move == "bi") {
			BackPrime();
		}
		else if(Move == "f") {
			Front();
		}
		else if (Move == "fi") {
			FrontPrime();
		}
		else if (Move == "l") {
			Left();
		}
		else if (Move == "li") {
			LeftPrime();
		}
		else if (Move == "r") {
			Right();
		}
		else if (Move == "ri") {
			RightPrime();
		}
		else if (Move == "u") {
			Up();
		}
		else if(Move == "ui") {
			UpPrime();
		}
		else {
			System.out.println("Error: Your code with the Moves doesn't work (Look in TurnFlip.java)");
		}
	}
	private static void Down() {
		Robot.Down();
	}
	private static void DownPrime() {
		Robot.DownPrime();
	}
	private static void Back() {
		Robot.Back();
	}
	private static void BackPrime() {
		Robot.BackPrime();
	}
	private static void Front() {
		Robot.Front();
	}
	private static void FrontPrime() {
		Robot.FrontPrime();
	}
	private static void Left() {
		Robot.Left();
	}
	private static void LeftPrime() {
		Robot.LeftPrime();
	}
	private static void Right() {
		Robot.Right();
	}
	private static void RightPrime() {
		Robot.RightPrime();
	}
	private static void Up() {
		Robot.Up();
	}
	private static void UpPrime() {
		Robot.UpPrime();
	}
}