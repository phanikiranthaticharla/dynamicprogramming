/**  Calculate Longest Common SubSequence from two Strings
 *   @author Phani Kiran Thaticharla
 *  Ver 1.0: 06/02/2018
 */

import java.util.Scanner;

class LCS {

    private int LCS(String s1, String s2) {

	// Convert given strings into char Arrays
	char[] c1 = s1.toCharArray();
	char[] c2 = s2.toCharArray();
	int[][] lcs = new int[c1.length+1][c2.length+1];
	
	// If any string is empty, LCS is 0 
	if(c1.length == 0 || c2.length == 0) {
	    return 0;
	}
	
	// Comparing values of index 1 lower than current index
	// Hence iterate till c1.length+1 and c2.length+1
	for(int i=0; i<= c1.length; i++) {
	    for(int j=0; j<= c2.length; j++) {

		if(i==0 || j==0) {
		    // When either of strings are empty, lcs is 0
		    lcs[i][j] = 0;    
		} else if(c1[i-1] == c2[j-1]) {
		    // When there is match, increment lcs[i][j] 
		    lcs[i][j] = 1 + lcs[i-1][j-1];
		} else {
		    lcs[i][j] = max(lcs[i][j-1] , lcs[i-1][j]);
		}
	    }
	}
	return lcs[c1.length][c2.length];
    }

    // Method to calucate max of two numbers
    private int max(int a, int b) {
	return (a>b)? a:b ;
    }

    // Driver Method 
    public static void main(String args[]) {
	
	LCS l = new LCS();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first strings");
	String s1 = sc.nextLine();
	System.out.println("Enter second string");
	String s2 = sc.nextLine();
	int lcs = l.LCS(s1,s2);
	System.out.println("Length of LCS :"+lcs);
	
    }
}
