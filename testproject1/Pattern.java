
package com.mycompany.testproject1;
public class Pattern {
    public static void main(String[] args) {
        int n = 5, i,j;
        //loop to iterate eeach row
        for( i=1; i<=n;i++){
            //loop to iterate over each row of the row
            for(j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
