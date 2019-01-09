import javax.swing.*;
import java.util.Random;

public class Aufgabe2
{
    public static void main(String[] args)
    {
        int arraysize = Integer.parseInt(JOptionPane.showInputDialog("Geben sie die Länge des Arrays an"));

        int[] array = new int[arraysize];

        Random zufall = new Random();

        for (int i=0; i<array.length; i++)
        {
            array[i]= zufall.nextInt(1000);
        }

        for(int i=array.length-1; i >= 0; i--)
        {
            System.out.print(array[i]+" ");
        }
    }

}
