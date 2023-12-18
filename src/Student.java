import java.util.ArrayList;

public class Student {
    public String name;
    public String surname;
    public int group;
    public int numCard;

    Book book = new Book();

    public Student(){}
    public Student(String name, String surname, int group, Book book) {
        editStudent(name, surname, group, book);
    }

    public void editStudent(String name, String surname, int group, Book bk){
        book.setTitle(bk.title);
        book.setAuthor(bk.author);
        book.setBookDate(bk.getBookDate);
        book.setDays(bk.days);
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    public void setNumCard(int numCard) {
        this.numCard = numCard;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGroup() {
        return group;
    }

}
