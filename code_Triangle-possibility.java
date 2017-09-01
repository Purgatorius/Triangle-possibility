import java.util.Scanner;

/**
 * Created by B4RT on 2017-05-10.
 */
public class Triangle-possibility {

    public static void main (String args[])



    {
        System.out.println("Hey! Give me three lenghts and I'll tell you is it possible to make a triangle with them!");
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        a = scanner.nextInt();
        System.out.print("b=");
        b = scanner.nextInt();
        System.out.print("c=");
        c = scanner.nextInt();

        if(a<b+c|b<a+c|c<a+b)
        {
            System.out.println("Yes! You can build the triangle with it!");
        }
        else
            System.out.println("Oooops, no you can not build a triangle with this lenghts.");
    }
}
