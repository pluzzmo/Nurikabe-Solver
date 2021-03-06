/*
	Joseph Thuemler
	Last Updated: December 7th, 2011
*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		// int[][] intBoard = {{2,0,1,0,1},{0,0,0,0,0},{0,0,0,2,0},{2,0,0,0,4},{0,0,0,0,0}};
		// 5x5 Nurikabe Puzzle ID: 9,343,167 puzzle-nurikabe.com
		// int[][] intBoard = {{0,0,3,0,0},{0,0,0,0,0},{2,0,3,0,0},{0,0,0,0,0},{1,0,1,0,0}};
		// 5x5 Nurikabe Puzzle ID: 2,148,943 puzzle-nurikabe.com
		// int[][] intBoard = {{2,0,0,3,0},{0,0,0,0,0},{1,0,2,0,0},{0,0,0,0,0},{4,0,0,0,0}};
		// 5x5 Nurikabe Puzzle ID: 980,742 puzzle-nurikabe.com
		// int[][] intBoard = {{1,0,0,0,0,2,0},{0,0,2,0,0,0,0},{2,0,0,0,2,0,0},{0,0,0,0,0,0,0},
		// {0,0,0,2,0,0,0},{0,0,0,0,0,0,0},{4,0,2,0,0,3,0}};
		// 7x7 Nurikabe Puzzle ID: 334,128 puzzle-nurikabe.com
		int[][] intBoard = {{0,2,0,0,0,0,0,0,0,0},{0,0,0,1,0,0,0,1,0,0},{0,0,0,0,0,0,0,0,0,4},{2,0,0,0,0,0,0,0,0,0},{0,0,0,4,0,0,0,0,0,0},{0,0,0,0,0,0,6,0,0,4},{0,0,0,0,4,0,0,0,0,0},{0,3,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,3,0,1,0,3,0,3,0,3}};
		// 10x10 Nurikabe Puzzle ID: 2,666,587 puzzle-nurikabe.com
		int SIZE = intBoard.length;
		NurikabeBoard board = new NurikabeBoard(intBoard);
		NurikabeSolver solver = new NurikabeSolver();
		char[][] solvedBoard = solver.solveBoard(board);
		for(int i=0;i<SIZE;++i) {
			// O is open, X is filled, ? is unknown yet (still working on the algorithm!)
			System.out.println(solvedBoard[i]);
		}
	}
}