package study.algorithm.baekjoon.p1158;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class boj1158_200104_PJW {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int index = k - 1;
		List<Integer> restNums = new LinkedList<Integer>();
		List<Integer> deletedNums = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			restNums.add(i);
		};
		while (restNums.size() != 0) {
			if (index < restNums.size()) {
				deletedNums.add(restNums.get(index));
				restNums.remove(index);
				index += (k-1);
			} else {
				index -= restNums.size();
			}
		};
		System.out.print("<");
		for(int num : deletedNums) {
			System.out.print(num);
			if(deletedNums.indexOf(num)==deletedNums.size()-1) {
				break;
			}
			System.out.print(", ");
		}
		System.out.print(">");
		scan.close();
	}
}
