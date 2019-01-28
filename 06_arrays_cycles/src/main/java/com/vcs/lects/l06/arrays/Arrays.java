package com.vcs.lects.l06.arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][][] cube = new int[3][3][3];

	}

	public void lastElement(int[][] matrix) {

		// TODO 2 kaip
		int paskutinis = matrix[ matrix.length - 1 ][ matrix[ matrix.length - 1 ].length - 1 ];
		
		

		// TODO 3 kaip padaryt kad paskutinis taptu kaip ir pirmas
//		paskutinis
		
		paskutinis = matrix[0][0];
		
		matrix[ matrix.length - 1 ][ matrix[ matrix.length - 1 ].length - 1 ] = matrix[0][0];
		
	}

}
