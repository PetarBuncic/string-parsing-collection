import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.lang.*;
import java.time.LocalDate;


public class Appliation {

    public static void main(String [] args){
        List <Person> personsList= new LinkedList<>() ;
        String ime;
	     String prezime;
	     LocalDate datumrodjenja;
	     String test;
	     String mestorodjenja;
        String text ="John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";
        
        System.out.println(text);
        
        text=text.replace(".", "/");
        
        System.out.println(text);
        String [] persons;
        persons=text.split(" ");
        
        for(String i : persons){
            System.out.println(i);
        
        }
        
        for(int i=0;i<persons.length;i++) {
        			
        	String [] personsdetails=persons[i].split("/");
        		ime=personsdetails[0];
        		System.out.println(ime);
        		prezime=personsdetails[1];
        		//datumrodjenja=personsdetails[2];
        		test=personsdetails[2];
        		mestorodjenja=personsdetails[3];
        		
        	Person person= new Person(ime,prezime,test,mestorodjenja);
        	personsList.add(person);
        		
        }
       
        for(int i=0;i<personsList.size();i++) {
        personsList.get(i).displayPerson();  
        }
    }
    public LocalDate getDateFromString(String srt) {
    	
    	int dan= Integer.parseInt(srt.substring(0, 2));
    	int mesec= Integer.parseInt(srt.substring(3, 5));
    	int god = Integer.parseInt(srt.substring(5, 8));
    			
    	LocalDate datum= LocalDate.of(god, mesec, dan);
    	
    	return datum;
    	
    }

}