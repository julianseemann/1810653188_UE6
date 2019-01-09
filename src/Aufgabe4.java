import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class Aufgabe4
{
    public static void main(String[] args)
    {
        List<Freund> freunde = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            freunde.add(new Freund(JOptionPane.showInputDialog("Bitte " + (i + 1) + ". Freund eingeben:")));
        }

        System.out.println("Meine besten Freunde sind: ");
        for (Freund f : freunde)
        {
            System.out.println(f.toString());
        }
    }
}
