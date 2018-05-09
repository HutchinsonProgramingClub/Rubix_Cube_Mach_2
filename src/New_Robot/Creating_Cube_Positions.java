package New_Robot;

import java.util.ArrayList;

public class Creating_Cube_Positions {
	
/**
 * Creates the cube faces for code communication
 * Say the face for what face you want, then what number you are references is inside an array
 * <pre>return (Fist letter of side)_List;</pre>
 * @param (string) face
 * @param (double) Number
 * @return Array w/ numbers representing
 * <pre>
 * 						Right
					 _ _ _ _ _ _
					|     |     |
					|  1  |  2  |
					|_ _ _|_ _ _|
					|     |     |
					|  4  |  3  |
					|_ _ _|_ _ _|

		Bottom          Front			 Top			Back
	 _ _ _ _ _ _	 _ _ _ _ _ _	 _ _ _ _ _ _ 	 _ _ _ _ _ _
	|     |     |	|     |     |	|     |     |	|     |     |
	|  1  |  2  |	|  1  |  2  |	|  1  |  2  |	|  1  |  2  |
	|_ _ _|_ _ _|	|_ _ _|_ _ _|	|_ _ _|_ _ _|	|_ _ _|_ _ _|
	|     |     |	|     |     |	|     |     |	|     |     |
	|  4  |  3  |	|  4  |  3  |	|  4  |  3  |	|  4  |  3  |
	|_ _ _|_ _ _|	|_ _ _|_ _ _|	|_ _ _|_ _ _|	|_ _ _|_ _ _|
	
						Left
					 _ _ _ _ _ _
					|     |     |
					|  1  |  2  |
					|_ _ _|_ _ _|
					|     |     |
					|  4  |  3  |
					|_ _ _|_ _ _|
 * </pre>
 */
	public Creating_Cube_Positions (String face) {
		face = face.toUpperCase();
		if(face == "FRONT") {
			getFront();
		}
		else if(face == "BACK") {
			getBack();
		}
		else if(face == "BOTTOM") {
			getBottom();
		}
		else if (face == "RIGHT") {
			getRight();
		}
		else if (face == "LEFT") {
			getLeft();
		}
		else if(face == "TOP") {
			getTop();
		}
		else{
			getNullList();
		}
	}
		
	public static ArrayList<Double> getRight() {
		double R_UpperRight = 1;
		double R_UpperLeft = 2;
		double R_LowerRight = 3;
		double R_LowerLeft = 4;
		
		ArrayList<Double> R_List = new ArrayList<Double>();
		
		R_List.add(R_UpperRight);
		R_List.add(R_UpperLeft);
		R_List.add(R_LowerRight);
		R_List.add(R_LowerLeft);
		
		return R_List;
	}
	public static ArrayList<Double> getFront() {
		double F_UpperRight = 1;
		double F_UpperLeft = 2;
		double F_LowerRight = 3;
		double F_LowerLeft = 4;
		
		ArrayList<Double> F_List = new ArrayList<Double>();
		
		F_List.add(F_UpperRight);
		F_List.add(F_UpperLeft);
		F_List.add(F_LowerRight);
		F_List.add(F_LowerLeft);
		
		return F_List;
	}
	public static ArrayList<Double> getLeft() {
		double L_UpperRight = 1;
		double L_UpperLeft = 2;
		double L_LowerRight = 3;
		double L_LowerLeft = 4;
		
		ArrayList<Double> L_List = new ArrayList<Double>();
		
		L_List.add(L_UpperRight);
		L_List.add(L_UpperLeft);
		L_List.add(L_LowerRight);
		L_List.add(L_LowerLeft);
		
		return L_List;
	}
	public static ArrayList<Double> getTop() {
		double T_UpperRight = 1;
		double T_UpperLeft = 2;
		double T_LowerRight = 3;
		double T_LowerLeft = 4;
		
		ArrayList<Double> T_List = new ArrayList<Double>();
		
		T_List.add(T_UpperRight);
		T_List.add(T_UpperLeft);
		T_List.add(T_LowerRight);
		T_List.add(T_LowerLeft);
		
		return T_List;
	}
	public static ArrayList<Double> getBottom() {
		double B_UpperRight = 1;
		double B_UpperLeft = 2;
		double B_LowerRight = 3;
		double B_LowerLeft = 4;
		
		ArrayList<Double> B_List = new ArrayList<Double>();
		
		B_List.add(B_UpperRight);
		B_List.add(B_UpperLeft);
		B_List.add(B_LowerRight);
		B_List.add(B_LowerLeft);
		
		return B_List;
	}
	public static ArrayList<Double> getBack() {
		double B_UpperRight = 1;
		double B_UpperLeft = 2;
		double B_LowerRight = 3;
		double B_LowerLeft = 4;
		
		ArrayList<Double> B_List = new ArrayList<Double>();
		
		B_List.add(B_UpperRight);
		B_List.add(B_UpperLeft);
		B_List.add(B_LowerRight);
		B_List.add(B_LowerLeft);
		
		return B_List;
	}
	public static ArrayList<Double> getNullList() {
		ArrayList<Double> Null_List = new ArrayList<Double>();
		return Null_List;
	}
	
}
