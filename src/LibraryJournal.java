import java.time.LocalDate;
import java.util.ArrayList;

public class LibraryJournal {

    public ArrayList<Student> students = new ArrayList<>();


    public LibraryJournal(Student student){
        addCard(student);
    }

    public void addCard(Student student){
        students.add(student);
        int numCard = students.size();
        students.getLast().setNumCard(numCard);
    }

    public boolean dateExpired(int id) {
        return !students.get(id).book.checkDate();
    }
    public String getName(int id) {
        return students.get(id).name;
    }

    public String getSurname(int id) {
        return students.get(id).surname;
    }

    public int getGroup(int id) {
        return students.get(id).group;
    }

}
