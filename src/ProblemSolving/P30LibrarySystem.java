package ProblemSolving;

class P30LibrarySystem {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrow;

     static{
         totalBooks=0;
     }
     {
         totalBooks++;
     }

     P30LibrarySystem(String title, String author,String isbn){
         this.title=title;
         this.author=author;
         this.isbn=isbn;
     }

     P30LibrarySystem(String isbn){
         this("Unknown","Unknown",isbn);
     }

     static int getTotalNoOfBooks(){
         return totalBooks;
     }

     void borrowBooks(){
         if(isBorrow){
             System.out.println("Book is Already borrowed..");
         }
         else{
             this.isBorrow=true;
             System.out.println("Enjoy book..");
         }
     }
     void returnBook(){
         if(isBorrow){
             this.isBorrow=false;
             System.out.println("Hope you enjoy it ...");
         }
         else{
             System.out.println("This book is already in library..");
         }
     }

     public static void main(String[] args) {
         P30LibrarySystem b=new P30LibrarySystem("Design","ABC","1");
         P30LibrarySystem NB= new P30LibrarySystem("2");
         System.out.println(P30LibrarySystem.getTotalNoOfBooks());
         b.borrowBooks();
         NB.borrowBooks();
         b.borrowBooks();
         b.returnBook();
         NB.returnBook();

     }


}
