package it.unica.pr2.progetto2015.g48910_49290;
import it.unica.pr2.progetto2015.interfacce.SheetFunction;
import java.util.*;

public class Complessa implements SheetFunction {

    @Override
    public Object execute(Object [] args)
    {
        /*Passati in input un array contente i 9 campi della matrice 3x3
        * faccio il calcolo della determinante e lo restituisco in output
        */
        Integer[] a = ((Integer[]) args);
        return (a[0]*a[4]*a[8]+a[1]*a[5]*a[6]+a[2]*a[3]*a[7])-(a[2]*a[4]*a[6]+a[1]*a[3]*a[8]+a[0]*a[5]*a[7]);
    }
    @Override
    public String getCategory()
    {
        return "Complessa";
    }
    @Override
    public String getHelp()
    {
        return "Inserisci gli elementi mancanti nelle celle gialle e vedrai il suo determinante della cella verde";
    } 
    @Override
    public String getName()
    {
        return "Determinante di una matrice 3x3";
    }

}
