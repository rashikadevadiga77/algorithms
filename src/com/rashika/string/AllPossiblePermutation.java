package com.rashika.string;
/*
"" ABCDE
0	A BCDE
	1	AB CDE
		0	ABC DE	
			0	ABCD E 
				0	ABCDE	---
			1 	ABCE D
				0	ABCED	---
		1   ABD CE
			0	ABDC E
				0	ABDCE	---
			1	ABDE C
				0	ABDEC	---
		2	ABE CD
			0	ABEC D
				0	ABECD	---
			1	ABED C
				0	ABEDC	---
	2	AC	BDE	
		0	ACB DE	
			0	ACBD E
				0	ACBDE`	---
			1	ACBE D
				0 	ACBED	---
		1	ACD BE
			0	ACDB E
				0	ACDBE	---
			1	ACDE B
				0	ACDEB	---
		2	ACE BD
			0	ACEB D
				0	ACEBD	---
			1 	ACED B	
				0	ACEDB	---
*/
public class AllPossiblePermutation {
	public static void main(String[] args) {
		printAllPermutation("ABCDE");
	}

	public static void printAllPermutation(String input) {
		printAllPermutation(input, "");
	}

	private static void printAllPermutation(String input, String prefix) {
		if (input.length() == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < input.length(); i++) {
				printAllPermutation(
						input.substring(0, i)
								+ input.substring(i + 1, input.length()),
						prefix + input.charAt(i));
			}
		}
	}
}
