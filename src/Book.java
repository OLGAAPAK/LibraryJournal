import java.time.LocalDate;

public class Book {
    public String title;
    public String author;
    LocalDate getBookDate;
    public int days;

    public Book() { }

    public Book(String title, String author, LocalDate getBookDate, int days) {
        setBook(title, author, getBookDate, days);
    }

    public void setBook(String title, String author, LocalDate getBookDate, int days) {
        this.title= title;
        this.author = author;
        this.getBookDate =getBookDate;
        this.days = days;
    }

    public Book(Book books) {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookDate(LocalDate getBookDate) {
        this.getBookDate = getBookDate;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public LocalDate dateReturn() {
        return getBookDate.plusDays(days);
    }

    public int leftDays() {
        return Math.abs(dateReturn().compareTo(LocalDate.now()));
    }

    public boolean checkDate(){
        LocalDate curDate = LocalDate.now();
        return curDate.isBefore(dateReturn());
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getGetBookDate() {
        return getBookDate;
    }
}
