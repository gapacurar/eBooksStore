/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 * This application manages a store of electronic books format.
 * 
 * @author gheorgheaurelpacurar
 */
public class ElectronicBooksStore {
    
    public static void main(String[] args){
    
        // declare an array of ElectronicBooks
        ElectronicBook[] books;
        books = new ElectronicBook[3];

        // create a new eBook
        String isbn = "978-606-758-671-8";
        String[] authors = new String[]{"Lev Grossman","Mira Grossman"};
        EBook eBook = new EBook(isbn, authors);
        eBook.setTitle("Taramul Magicianului");
        eBook.setPrice(20.93f);
        eBook.setElectronicFormat(ElectronicBook.FormatOfElectronicBook.DRM);
        eBook.setRecommendedReader(EBook.eBooksReaders.AMAZON);
        eBook.setPublisher("Nemira");
        eBook.setYearOfPublication(ElectronicBook.YearOfPublication.Y2016);
        String[] downloadLinks = new String[]{
            "http://www.elefant.ro/ebooks/fictiune/literatura-de-divertisment/sf-fantasy/taramul-magicianului-al-treilea-volum-al-seriei-magicienii-322807.html"
        };
        eBook.setRemarksAndNotes(new String[] {""});
        eBook.setDownloadLinks(downloadLinks);
        // Add eBook to the books
        books[0] = eBook;
         // create a new eBook
        isbn = "978-606-758-667-1";
        authors = new String[]{"Bogdan Munteanu"};
        eBook = new EBook(isbn, authors);
        eBook.setTitle("Ai uitat sa zambesti.");
        eBook.setPrice(12.53f);
        eBook.setElectronicFormat(ElectronicBook.FormatOfElectronicBook.DRM);
        eBook.setRecommendedReader(EBook.eBooksReaders.AMAZON);
        eBook.setPublisher("Nemira");
        eBook.setYearOfPublication(ElectronicBook.YearOfPublication.Y2016);
        downloadLinks = new String[]{
            "http://www.elefant.ro/ebooks/fictiune/literatura-romana/literatura-romana-contemporana/ai-uitat-sa-razi-322805.html"
        };
        eBook.setDownloadLinks(downloadLinks);
        eBook.setRemarksAndNotes(new String[] {""});
        // Add eBook to the books
        books[1] = eBook;         
         // create a new eBook
        isbn = "978-606-758-667-3";
        authors = new String[]{"Dany Ionathan","Sandy Marion", "Leonore Bittman"};
        IBook iBook = new IBook(isbn, authors);
        iBook.setTitle("The Swift Programming Language (Swift 2.2)");
        iBook.setPrice(0.00f);
        iBook.setElectronicFormat(ElectronicBook.FormatOfElectronicBook.IBA);
        iBook.setRecommendedReader(IBook.iBooksReaders.APPIPAD);
        iBook.setPublisher("Apple");
        iBook.setYearOfPublication(ElectronicBook.YearOfPublication.Y2014);
        downloadLinks = new String[]{
            "https://itunes.apple.com/us/store?mt=11"
        };  
        iBook.setDownloadLinks(downloadLinks);
        eBook.setRemarksAndNotes(new String[] {"This is a great iBook!", "I recommend it!"});
        // Add eBook to the books
        books[2] = iBook;      

        //check the list of Books
        for(int index = 0; index <3;index++){
            System.out.println("Book title: "+books[index].getTitle());
            System.out.println("Book ISBN: "+books[index].getISBN());
            System.out.println("Book Publisher: "+books[index].getPublisher());
            String[] authorsOfThisBook = books[index].getAuthors();
            int numberOfAuthors = authorsOfThisBook.length;
            for(int currentAuthor=0;currentAuthor<numberOfAuthors;currentAuthor++)
            {
                System.out.println("Book author: "+ authorsOfThisBook[currentAuthor]);
            }
            //System.out.println("Book Authors: "+books[index].getAuthors()[0]);
            System.out.println("Book Price: "+books[index].getPrice());
            System.out.println("Book format: "+books[index].getElectronicFormat());
            System.out.println("Book year of publication: "+books[index].getYearOfPublication());
            //System.out.println("Book remarks and notes: "+books[index].getRemarksAndNotes()[0]);
            System.out.println("------------------------------------------------------------------");
        }
    }
}
