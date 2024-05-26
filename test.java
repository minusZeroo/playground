package librarysystem;


public class methodsearchBook {

    public class LibrarySystem {
        public static void main(String[] args){

            Book[]books=new Book[5];

            books[0]=new Book("Java programming","John Smith");
            books[1]=new Book("Data Structure","Alice Johnson");
            books[2]=new Book("Machine Learning","David Williams");
            books[3]=new Book("Algorithms","Emily Davis");
            books[4]=new Book("Web development","Michael Brown");
        }
        public static int searchBook(Book[]books, String targetTitle){

          for (int i = 0; i < books.length; i++){
              if(books[i].getTitle().equals(targetTitle)){
                  return i;//Return the index if the book is found
              }
          }
          return -1;//Return -1 if the book is not found
            }
            
        }  
        
    }
        
 
       
                
    }
    
}
