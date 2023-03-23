import java.util.Scanner;
public class A1113339_0317_1 {
    public static void main(String [] args)
    {
        System.out.println("Enter n & m = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int [][] paper = new int [n][m];

        for (int row = 1; row < paper.length; row++)
        {
            for (int column = 1; column < paper[row].length; column++)
            {
                paper [row][column] = row * column;
                System.out.print(paper[row][column] + "\t");
                    }
                    System.out.println();
        }
    }
}