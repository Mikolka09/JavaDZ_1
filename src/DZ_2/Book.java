package DZ_2;

public class Book {
    String title;
    String author;
    int year;
    String publishing;
    String genre;
    int pages;

    public Book() {
        this.title = "No title";
        this.author = "No author";
        this.year = 1970;
        this.publishing = "No publishing";
        this.genre = "No genre";
        this.pages = 0;
    }

    public Book(String title, String author, int year, String publishing, String genre, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publishing = publishing;
        this.genre = genre;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishing() {
        return publishing;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        return "Title: " + this.title + "\n" + "Author: " + this.author +
                "\n" + "Year: " + this.year + "\n" + "Publishing: " + this.publishing +
                "\n" + "Genre: " + this.genre + "\n" + "Pages: " + this.pages;
    }
}
