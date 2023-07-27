package LambdaExpression;
//Створити клас Book, зробити 3 поля та відповідні методи. Необхідно реалізувати замикання анонімного класу та лямбда-виразу.
public class HomeWork3 {

    public interface BookInterface{
         void printBook(Book book);
    }


    public static void main(String[] args) {

        Book book = new Book("Harry Potter", "J.K. Rowling", 1997);

        BookInterface bookInterface = new BookInterface(){
            @Override
            public void printBook(Book book){
                System.out.println(book);
            }
        };

        bookInterface.printBook(book);

        BookInterface bookInterface2 = System.out::println;

        bookInterface2.printBook(book);

    }

    public static class Book{
        private String name;
        private String author;
        private int year;

        public Book(String name, String author, int year){
            this.name = name;
            this.author = author;
            this.year = year;
        }

        public String getName(){
            return name;
        }

        public String getAuthor(){
            return author;
        }

        public int getYear(){
            return year;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAuthor(String author){
            this.author = author;
        }

        public void setYear(int year){
            this.year = year;
        }

        @Override
        public String toString(){
            return "Book{" + "name=" + name + ", author=" + author + ", year=" + year + '}';
        }
    }

}
