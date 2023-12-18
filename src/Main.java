import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023,12,1);
        Book book1 = new Book("War and peace", "L.Tolstoy", date1, 14);
        Student student1 = new Student("Andrei", "Ivanov", 5, book1);

        LibraryJournal journal = new LibraryJournal(student1);
        System.out.println(journal.students.getLast().getName());

        LocalDate date2 = LocalDate.of(2023,11,20);
        Book book2 = new Book("War and peace", "L.Tolstoy", date2, 14);
        Student student2 = new Student("Anna", "Ivanova", 11, book2);
        journal.addCard(student2);
        System.out.println(journal.students.getLast().getName());

        LocalDate date3 = LocalDate.of(2023,10,10);
        Book book3 = new Book("War and peace", "L.Tolstoy", date3, 14);
        Student student3 = new Student("Misha", "Popov", 1, book3);
        journal.addCard(student3);
        System.out.println(journal.students.getLast().getName());

        for (int i = 0; i < journal.students.size(); i++) {
            if (journal.dateExpired(i)) {
                System.out.println(journal.getName(i) + "  " + journal.getSurname(i) + "  " + journal.getGroup(i));

           }
        }
    }
}