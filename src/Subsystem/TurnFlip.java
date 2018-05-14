package Subsystem;

import Moves.Flipped;
import Moves.Spin;
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
	 *flip = flip forward
	 *flipi = flip backward
	 *quarterspin = quarter spin of the cube clockwise
	 *quarterspini = quarter spin of the cube counterclockwise
	 *threequarterspin = 3/4 spin of the cube clockwise
	 *threequarterspini = 3/4 spin of the cube counterclockwise
	 *halfspin = 1/2 spin of the cube clockwise
	 *halfspini = 1/2 spin of the cube counterclockwise
	 *spin = whole spin of the cube clockwise
	 *spini = whole spin of the cube counterclockwise
	 *flip = 1 flipper rooney dooney of the cube
	 *flipi = flip that cube backwards man!!
	 *</pre>
	 * @param Move(all lowercase) = what move you want to do(look key above!!)
	 * @param NumMoves = How many times you want the moves to run
	 */
	public static void TurnFlip(String Move, Integer NumMoves) {
		if(Move == "di") {
			DownPrime(NumMoves);
		}
		else if(Move == "d") {
			Down(NumMoves);
		}
		else if(Move == "b") {
			Back(NumMoves);
		}
		else if(Move == "bi") {
			BackPrime(NumMoves);
		}
		else if(Move == "f") {
			Front(NumMoves);
		}
		else if (Move == "fi") {
			FrontPrime(NumMoves);
		}
		else if (Move == "l") {
			Left(NumMoves);
		}
		else if (Move == "li") {
			LeftPrime(NumMoves);
		}
		else if (Move == "r") {
			Right(NumMoves);
		}
		else if (Move == "ri") {
			RightPrime(NumMoves);
		}
		else if (Move == "u") {
			Up(NumMoves);
		}
		else if(Move == "ui") {
			UpPrime(NumMoves);
		}
		else if(Move == "flipi") {
			flipBackward(NumMoves);
		}
		else if(Move == "quaterspin") {
			quarterspin(NumMoves);
		}
		else if(Move == "quarterspini") {
			quarterspini(NumMoves);
		}
		else if(Move == "threequarterspin") {
			threequarterspin(NumMoves);
		}
		else if(Move == "threequarterspini") {
			threequarterspini(NumMoves);
		}
		else if(Move == "halfspin") {
			halfspin(NumMoves);
		}
		else if(Move == "halfspini") {
			halfspini(NumMoves);
		}
		else if(Move == "spin") {
			fullspin(NumMoves);
		}
		else if(Move == "spini") {
			fullspini(NumMoves);
		}
		else if(Move == "flip") {
			flip(NumMoves);
		}
		else if(Move == "flipi") {
			flipi(NumMoves);
		}
		else {
			System.out.println("Error: Your code with the Moves doesn't work (Look in TurnFlip.java)");
		}
	}
	private static void Down(Integer NumMoves) {
		while(NumMoves > 0){
            Robot.Down();
            NumMoves--;
       }
	}
	private static void DownPrime(Integer NumMoves) {
		while(NumMoves > 0){
			Robot.DownPrime();
            NumMoves--;
       }
	}
	private static void Back(Integer NumMoves) {
		while(NumMoves > 0){
			Robot.Back();
            NumMoves--;
       }
	}
	private static void BackPrime(Integer NumMoves) {
		while(NumMoves > 0){
			Robot.BackPrime();
            NumMoves--;
       }
	}
	private static void Front(Integer NumMoves) {
		while(NumMoves > 0){
			Robot.Front();
            NumMoves--;
       }
	}
	private static void FrontPrime(Integer NumMoves) {
		while(NumMoves > 0){
			Robot.FrontPrime();
			NumMoves--;
       }
	}
	private static void Left(Integer NumMoves) {
		while(NumMoves > 0){
			Robot.Left();
            NumMoves--;
       }
	}
	private static void LeftPrime(Integer NumMoves) {
		while(NumMoves > 0){
			Robot.LeftPrime();
            NumMoves--;
       }
	}
	private static void Right(Integer NumMoves) {
		while(NumMoves > 0){
			Robot.Right();
            NumMoves--;
       }
	}
	private static void RightPrime(Integer NumMoves) {
		while(NumMoves > 0){
			Robot.RightPrime();
            NumMoves--;
       }
	}
	private static void Up(Integer NumMoves) {
		while(NumMoves > 0){
			Robot.Up();
            NumMoves--;
       }
	}
	private static void UpPrime(Integer NumMoves) {
		while(NumMoves > 0){
			Robot.UpPrime();
            NumMoves--;
       }
	}
	private static void flipBackward(Integer NumMoves) {
		while(NumMoves > 0){
			Flipped.flipBackward();
			NumMoves--;
       }
	}
	private static void threequarterspin(Integer NumMoves) {
		while(NumMoves > 0){
			Spin.Spin75();
			NumMoves--;
       }
	}
	private static void threequarterspini(Integer NumMoves) {
		while(NumMoves > 0){
			Spin.CounterSpin75();
			NumMoves--;
       }
	}
	private static void quarterspin(Integer NumMoves) {
		while(NumMoves > 0){
			Spin.Spin50();
			NumMoves--;
       }
	}
	private static void quarterspini(Integer NumMoves) {
		while(NumMoves > 0){
			Spin.CounterSpin75();
			NumMoves--;
       }
	}
	private static void halfspin(Integer NumMoves) {
		while(NumMoves > 0){
			Spin.Spin50();
			NumMoves--;
       }
	}
	private static void halfspini(Integer NumMoves) {
		while(NumMoves > 0){
			Spin.CounterSpin50();
			NumMoves--;
       }
	}
	private static void fullspin(Integer NumMoves) {
		while(NumMoves > 0){
			Spin.Spinfull();
			NumMoves--;
       }
	}
	private static void fullspini(Integer NumMoves) {
		while(NumMoves > 0){
			Spin.CounterSpinFull();
			NumMoves--;
       }
	}
	private static void flip(Integer NumMoves) {
		while(NumMoves > 0){
			Flipped.flipForward();
			NumMoves--;
       }
	}
	private static void flipi(Integer NumMoves) {
		while(NumMoves > 0){
			Flipped.flipBackward();
			NumMoves--;
       }
	}
}