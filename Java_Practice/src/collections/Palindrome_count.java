package collections;
import java.util.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Palindrome_count {
	public static int[] removeDuplicates(int[] input) {
		int j = 0;
		int i = 1;
//return if the array length is less than 2
		if (input.length < 2) {
			return input;
		}
		while (i < input.length) {
			if (input[i] == input[j]) {
				i++;
				} else {
					input[++j] = input[i++];
				}
			}
			int[] output = new int[j + 1];
			for (int k = 0; k < output.length; k++) {
				output[k] = input[k];
			}
			return output;
		}

		

	public static void main(String[] args) {
		
		int[] input1 = { 2, 3, 6, 1, 8, 9, 10, 10, 10, 6, 12 };
		int[] output = removeDuplicates(input1);
		for (int i : output) {
			System.out.print(i + " ");
		}

	}

	}



	

	
	

