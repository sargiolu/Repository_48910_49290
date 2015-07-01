package it.unica.pr2.progetto2015.g48910_49290;
import it.unica.pr2.progetto2015.interfacce.SheetFunction;
import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.*;
import java.util.*;



public class Custom implements SheetFunction {

   @Override
   public Object execute(Object[] args) 
   { 
      /*
      * Funzione che crea un file .doc utilizzando un array in ingresso composta
      * nel campo uno dal percorso, nel campo 2 dal nome del file e nel campo 3 
      * dal contenuto del file.
      */
      String percorso;
      percorso = (String)args[0];
      String nomeFile;
      nomeFile = (String)args[1];
      String contenuto;
      contenuto = (String)args[2];
      
      XWPFDocument doc = new XWPFDocument(); 
      XWPFParagraph paragrafo = doc.createParagraph(); 
      XWPFRun run = paragrafo.createRun();
      run.setText(contenuto); 
      run.setFontSize(12);
      try 
      {
        doc.write(new FileOutputStream(new File(percorso + nomeFile + ".doc"))); 
      
      } catch (Exception e)
      {
          return false;
      }
      return true;
   }
   @Override
    public String getCategory()
    {
        return "Custom";
    }
   @Override
    public String getHelp()
    {
        return "Inserisci il nome del file e il contenuto e ti sarà restituito un file word";
    }
   @Override
    public String getName()
    {
        return "ApiWord";
    }
}