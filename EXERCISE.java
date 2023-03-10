package oops;

class Library {
    String[] bookname;
    public int numofbook;


    public Library() {
        this.bookname = new String[100];
        this.numofbook = 0;

    }

    public void addbook(String book) {
        this.bookname[numofbook] = book;
        numofbook++;
        System.out.println(book + " has been added");
    }

    void showavailablebooks() {
        System.out.println("Available books are");
        for (String book : this.bookname) {
            if (book == null) {
                continue;
            }
            System.out.println("*" + book + "*");
        }
    }

    void issuebook(String book) {
        for (int i = 0; i < this.bookname.length; i++) {
            if (this.bookname[i].equals(book)) {
                System.out.println("The book has been issued !!");
                this.bookname[i] = null;
                return;
            }
        }
        System.out.println("This book does not Exist");
    }

    void returmbook(String book) {
        addbook(book);
    }
}

public class EXERCISE {
    public static void main(String[] args) {
        Library cerntrallibrary = new Library();
        cerntrallibrary.addbook("Nineteen Eighty Four ");
        cerntrallibrary.addbook("The monk who sold his ferrari");
        cerntrallibrary.addbook("Rich Dad Poor Dad");
        System.out.println();
        cerntrallibrary.showavailablebooks();
        System.out.println();
        cerntrallibrary.issuebook("Nineteen Eighty Four ");
        System.out.println();
        cerntrallibrary.showavailablebooks();
        System.out.println();
        cerntrallibrary.returmbook("Rich Dad Poor Dad");
        System.out.println();
        cerntrallibrary.showavailablebooks();
    }
}
