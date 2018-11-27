import java.time.LocalDate;
import java.util.Date;

public class Person{
    public String ime;
    public String prezime;
    public String mestorodjenja;
    public String datumrodjenja;

    public Person(String ime, String prezime, String datumrodjenja,String mestorodjenja ){
        this.ime=ime;
        this.prezime=prezime;
        this.datumrodjenja=datumrodjenja;
        this.mestorodjenja=mestorodjenja;
    }
    
    public void displayPerson() {
    	System.out.println("Ime: "+this.ime +" "+"Prezime: "+this.prezime +" "+"Datum rodjenja: " +this.datumrodjenja +" "+"Mesto rodjenja: "+this.mestorodjenja);
    }

}