/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;


public class IBook extends ElectronicBook {
    
    /** list of compatible reader devices*/
    /** type of eBook formats */
    public static final String APPIPAD = "Apple iPad";
    public static final String APPIPOD = "Apple iPod";
    public static final String APPIPHONE = "Apple iPhone";

    /** recommended reader
     * @param recommendedReader */
    public void setRecommendedReader(iBooksReaders recommendedReader) {
        this.recommendedReader = recommendedReader;
    }

    private iBooksReaders recommendedReader;
    
    public IBook(String ISBN, String[]authors) {
        super(ISBN, authors);
    }

    public IBook(String ISBN, String[] authors, String[]downloadLinks) {
        super(ISBN, authors, downloadLinks);
    }

    public IBook(String ISBN, String[] authors, String[]downloadLinks, String[] remarksAndNotes) {
        super(ISBN, authors, downloadLinks, remarksAndNotes);
    }
    public enum iBooksReaders { APPIPAD, APPIPOD, APPIPHONE
    }
    
    public iBooksReaders getRecommendedReader() {
        return recommendedReader;
    }
}
