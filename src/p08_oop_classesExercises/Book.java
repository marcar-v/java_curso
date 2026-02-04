package p08_oop_classesExercises;

public class Book {

    private String title;
    String author;
    int year;

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getAuthor(String author){
        return author;
    }

    public String getTitle(String title){
        return title;
    }

    public void showBookData(){
        System.out.println(title + ", " + author + " (" + year + ").");
    }
}
