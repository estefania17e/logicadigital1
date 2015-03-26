package package1;
import java.util.Scanner;
public class DecimalABinario {
    int a[] = new int[31];
    Scanner sc = new Scanner(System.in);
    int c = 0;
    public static void main(String[] args) {
    DecimalABinario x = new DecimalABinario();
    x.convertirDecimal();
    x.mostrarBinario();
    }
    private void convertirDecimal()
    {
        System.out.println("¿Cual numero decimal deseas convertir?");
        int n = sc.nextInt();
        int m = 0;
        for(int i = 0; n != 0; i++)
        {
            m = n%2;
            n = n/2;
            a[i] = m;
            c++;
            //System.out.println(c);
        }
    }
    private void mostrarBinario()
    {
        c--;
        for(int i = 0;  c >= 0; i++)
        {
            System.out.print(a[c]);
            c--;
        }               
        System.out.println("");
    }
}