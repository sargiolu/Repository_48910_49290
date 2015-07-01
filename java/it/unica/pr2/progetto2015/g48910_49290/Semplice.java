package it.unica.pr2.progetto2015.g48910_49290;
import it.unica.pr2.progetto2015.interfacce.SheetFunction;
import java.lang.*;
import java.util.*;

public class Semplice implements SheetFunction{
    
    @Override
    public Object execute(Object[] args)
    {
        /*
        * Funzione matematica che restituisce il numero intero superiore
        */
        return ((int)Math.ceil((double) args[0]));
    }
    
    @Override
    public String getCategory()
    {
        return "Semplice";
    }
    @Override
    public String getHelp()
    {
        return "Inserisci un numero con la virgola nella cella gialla e verrà restituito il numero intero successivo nella cell verde";
    } 
    @Override
    public String getName()
    {
        return "Iso.Arrotonda.Eccesso";
    }
}
    
