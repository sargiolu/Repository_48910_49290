Progetto creato da:
	Stefano Argiolu (matr. 48910)
	Alessandro Casula (matr. 49290)

Il progetto tratta la collaborazione di LibreOffice con Java attraverso l'espansione di LibreOffice "Obba"
Sono state create quindi delle classi (.class) in java che eseguono delle funzioni base.
Le classi sono cos� divise:
	Semplice -> che prende in ingresso un numero con la virgola e restituisce l'intero
		    successivo (arrotondamento per eccesso);
	Complessa -> data un matrice 3x3, la funzione restituisce il determinante.
	    	     Per eseguire questa funzione e rispettare la direttive imposte � stato
		     di utilizzare un vettore di 9 campi contenente tutti i campi della matrice
 		     prendendo solo numeri interi e restituendo un intero.
	Custom -> per quanto riguada la custom le direttive prevedevano l'importazione di una libreria esterna,
		  � stato cos� scelto di creare un file word chiedendo all'utente di inserie il nome del file
		  e il suo contenuto, per fare questo sono state implementate nel codice alcune librerie esterne.

Si ricorda a colui che utlizza il progetto che in seguito a problemi con l'espansione Obba � possibile che in taluni
casi al momento dell'avvio le funzioni diano problemi, per risolvere sar� utile semplicemente ricaricare la pagine .ods
tramite la funzione di LibreOffice (File -> Ricarica).

