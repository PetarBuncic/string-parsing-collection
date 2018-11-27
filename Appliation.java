ipackage string.colection;
//import java.util.Date;
import java.util.LinkedList;
import java.util.List;
//import java.text.DateFormat;
import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;

/*Nasa test klasa koja ce nam pomoci da iz stringa koji je zadat dobijemo listu objekata klase Person*/
public class Application{

    public static void main(String [] args){
    	//definisemo jednu promenljivu personslist koja ce da cuva Objekte tipa Peron() 
        List <Person> personslist= new LinkedList<>() ;
        //definisemo pocne promeljive koje ce nam pomoci da inicijalizujemo atribute(ime, prezime,....) klase Person()
        String ime;
	    String prezime;
	    LocalDate datumrodjenja;
	    String mestorodjenja;
        String text ="John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";
        //Moja ideja: kako bih lakse razdelio String onako kako je zadato unificiram delimitere (tamo kde je . stavim / 
        //kako bi svuda bilo /)
        text=text.replace(".", "/");
        //posle ove linije koda nas text=John/Davidson/05051988/Belgrade Michael/Barton/01011968/Krakov Ivan/Perkinson/23051986/Moscow"
        System.out.println(text);//ova linija je opciona i sluzi nam da vidimo sta smo uradili
        
        /*znaci sada imamo jedan string sa tri substringa koja deli razmak
         * zato u redu ispod kreiramo niz stringova persons koji ce imati tri stringa 
         * koja smo dobili podelom do razmaka*/
        String [] persons;
        persons=text.split(" ");
        /*Debug kontrola opciono da vidimo kako nak izgledaju ta tri stringa koja se nalaze u 
         * nizu persons*/
        for(String i : persons){
            System.out.println(i);
        
        }
        try {//izuzetke necu sad da objasnjavam to cemo kasnije
	        //sada ovaj nas niz stringova treba rasclaniti na elemente ime prezime i td
        	for(int i=0;i<persons.length;i++) {
	        	//sve ove argumente deli znak / tako da ga eliminisemo kreirajuci pri tom od svakog niza novi
        		//podniz koji sada sadrzi {ime, prezime,datumrodjenja,mestorodjenja}
	        	String [] personsdetails=persons[i].split("/");
	        		ime=personsdetails[0];//prvi clan niza je ime
	        		prezime=personsdetails[1];//drugi clan je prezime
	        		//ovde imamo funkciju koja nam od stringa koji smo dobili deljenjem i koji je oblika 05051988 daje datum
	        		datumrodjenja=getDateFromString(personsdetails[2]);//treci clan je datutu
	        		mestorodjenja=personsdetails[3];// cetvrti clan mesto rodjenja
	        		// pozivamo konstruktor klase Person kako bi kreirali osobu i dodelili argumente
	        		Person person= new Person(ime,prezime,datumrodjenja,mestorodjenja);
	        		// tako kreiranu osobu(Objekat klase Person) ubacujemo u listu osoba koju smo definisali na pocetku zadatka
	        		personslist.add(person);
	        		
	        }
        }catch (Exception e) {// ovde se zavrsava try catch blok ali o izuzetcima cemo malo kasnije
			e.printStackTrace();
		}
        /*na kraju naseg zadatka prolazimo kroz listu i stampamo listu pomocu nase funkcije
         *koju smo implementirali u klasi Person*/
        for(int i=0;i<personslist.size();i++) {
        personslist.get(i).displayPerson();//svaki clan liste koji je u stvali objekat klase Person poziva svoju metodu za stampu  
        }
    }
    // metoda koja od Stringa kreira tip LocalDate
    public static LocalDate getDateFromString(String srt) throws ParseException {
    	
    	int dan= Integer.parseInt(srt.substring(0, 2));//iz stringa 05051988 uzima prva 2 elementa i kaze to je dan
    	int mesec= Integer.parseInt(srt.substring(2, 4));//iz stringa 05051988 uzima druga 2 elementa i kaze to je mesec
    	int god = Integer.parseInt(srt.substring(4, 8));//iz stringa 05051988 uzima zadnja 2 elementa i kaze to je godina
    			
    	LocalDate datum= LocalDate.of(god, mesec, dan);
    	
    	/*DateFormat formatter = new SimpleDateFormat("ddMMyyyy");
    	Date date = (Date)formatter.parse(srt);
    	System.out.println(date);*/
    	//vraca vrednost datum
    	return datum;
    	
    }
    
 

}/*iskomentarisani kodovi su drugi nacin i neka druga ideja da tipom Date ali nisam do kraja razradio*/
