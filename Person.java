package string.colection;
import java.time.LocalDate;

/*Definisemo klasu Person koja ce da cuva podatke o osobi, svaki objekat ove klase ima 
 * atribute(ime, prezime,mestorodjenja i datum rodjenja)*/
public class Person{
    public String ime;
    public String prezime;
    public String mestorodjenja;
    public LocalDate birthdate;
    
/*Definisemo nas konstruktor koji prima argumente kao u postavci zadatka (4 atributa, 3 stringa i LocalDate)*/
    public Person(String ime, String prezime,LocalDate birthdate,String mestorodjenja ){
        this.ime=ime;
        this.prezime=prezime;
        this.mestorodjenja=mestorodjenja;
        this.birthdate=birthdate;
    }
    /*Kako bi nam kasnije bilo lakse da stampamo sadrzaje nasih objekata(Persona(Osoba)) implementiramo jednu 
     * metodu koja stampa nase objekte*/
    public void displayPerson() {
    	System.out.println("Ime: "+this.ime +" "+"Prezime: "+this.prezime + " " +"Mesto rodjenja: "+this.mestorodjenja+" "+"Datum rodjenja: "+this.birthdate.getDayOfMonth()+"."+this.birthdate.getMonth()+" "+ this.birthdate.getYear()+".god");
    
    }
}
