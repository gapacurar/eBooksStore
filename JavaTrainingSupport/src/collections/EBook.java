/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 * class EBook defines ElectronicBooks that can be read on specific devices and 
 with specific software packages. These books cannot be read natively on 
 * Apple devices and cannot be bought from App Store.
 
 */
public class EBook extends ElectronicBook {

    /** list of compatible reader devices*/
    /** type of EBook formats */
    public static final String AMAZON = "Amazon Kindle";
    public static final String FIRE = "Fire";
    public static final String BNNOOK = "Barnes & Noble Nook";
    public static final String NOOK = "Nook Tablet";
    public static final String SONY = "SOny Reader";
    public static final String KOBOEREADER = "Kobo eReader";
    public static final String KOBOARC = "Kobo Arc";
    public static final String POCKETBOOK = "PocketBook Reader";
    public static final String POCKETTOUCH = "PoketBook Touch";
    
    /**
     * types of EBook readers
     */
    public enum eBooksReaders { AMAZON, FIRE, BNNOOK, NOOK, SONY, KOBOEREADER,
    KOBOARC, POCKETBOOK, POCKETTOUCH
    }    
    /** recommended reader*/
    private eBooksReaders recommendedReader;
    
    // constructors
    public EBook(String ISBN, String[] authors) {
        super(ISBN, authors);
    }

    public EBook(String ISBN, String[]authors, String[] downloadLinks) {
        super(ISBN, authors, downloadLinks);
    }

    public EBook(String ISBN, String[] authors, String[] downloadLinks, String[] remarksAndNotes) {
        super(ISBN, authors, downloadLinks, remarksAndNotes);
    }
    
    // get-ers and set-ers
    public eBooksReaders getRecommendedReader() {
        return recommendedReader;
    }

    /** recommended reade
     * @param recommendedReader */
    public void setRecommendedReader(eBooksReaders recommendedReader) {
        this.recommendedReader = recommendedReader;
    }    
}
