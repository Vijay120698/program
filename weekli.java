import java.util.Scanner;
public class weeky
{
    public static void main(String[] s) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a day:");
        int ch = s1.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println(ch+" monday:");
                break;
            case 2:
                System.out.println(ch+" tuesday:");
                break;
            case 3:
                System.out.println(ch+" wednesday:");
                break;
            case 4:
                System.out.println(ch+" thursday:");
                break;
            case 5:
                System.out.println(ch+" friday:");
                break;
            case 6:
                System.out.println(ch+" saturday:");
                break;
            default:System.out.println(ch+" sunday:");




        }
    }
}