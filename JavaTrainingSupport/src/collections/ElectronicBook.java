/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 * class defines an Electronic Book as parent for eBook and iBook
 * @author gheorgheaurelpacurar
 */
public class ElectronicBook {

    public static final int Y2005 = 2005;
    public static final int Y2006 = 2006;
    public static final int Y2007 = 2007;
    public static final int Y2008 = 2008;
    public static final int Y2009 = 2009;
    public static final int Y2010 = 2010;
    public static final int Y2011 = 2011;
    public static final int Y2012 = 2012;
    public static final int Y2013 = 2013;
    public static final int Y2014 = 2014;
    public static final int Y2015 = 1015;
    public static final int Y2016 = 2016;
    
    /**
     * Year of publication as enumeration
     */
    public enum YearOfPublication {
    Y2005, Y2006, Y2007, Y2008, Y2009, Y2010, Y2011, Y2012, Y2013, Y2014, Y2015,
    Y2016
}
    /** type of eBook formats */
    public static final String AZW = "AZW";
    public static final String AZW3 = "AZW3";
    public static final String KF8 = "KF8";
    public static final String NONDRM = "non-DRM MOBI";
    public static final String DRM = "Adobe DRM";
    public static final String PDF = "PDF";
    public static final String PRC = "PRC";
    public static final String TXT = "TXT";
    public static final String EPUB = "EPUB";
    public static final String EPUBDRM = "EPUB DRM";
    public static final String IBA = "IBA";
    public static final String BBEB = "BBeB";
    public static final String HTML = "HTML";
    public static final String HTM = "HTM";
    public static final String CBR = "CBR (comic)";
    public static final String CBZ = "CBZ (comic)";
    public static final String FB2 = "FB2";
    public static final String FB2ZIP = "FB2.ZIP";
    public static final String DJVU = "DJVU";    
    public static final String RTF = "RTF"; 
    public static final String DOCX = "DOCX"; 
    public static final String DOC = "DOC";     
    public static final String CHM = "CHM"; 
    public static final String TCR = "TCR";  
    
    public enum FormatOfElectronicBook { AZW, AZW3, KF8, NonDRM, DRM, PDF, PRC, TXT, EPUB, EPUBDRM,
    IBA, BBEB, HTML, HTM, CBR, CBZ, FB2, FB2ZIP, DJVU, RTF, DOCX, DOC, CHM,TCR 
}
    
    /** format of publish*/
    private FormatOfElectronicBook electronicFormat;
    /**Unique serial number of book*/
    private String ISBN; 
    /** Title of book*/
    private String title;
    /** List of Authors with one first name, one middle name and one last name*/
    private String[] authors;
    /** list of links that can be used to download the book*/
    private String[] downloadLinks;
    /** central list of remarks noted by readers in format - (reader,remark) */
    private String[] remarksAndNotes;
    /** the publisher of eBook*/
    private String publisher;
    /** price */
    private float price;
    /** year of publication */
    private YearOfPublication yearOfPublication;

    //constructors
    public ElectronicBook(String ISBN, String[] authors) {
        this.ISBN = ISBN;
        this.authors = authors;
    }

    public ElectronicBook(String ISBN, String[] authors, String[] downloadLinks) {
        this.ISBN = ISBN;
        this.authors = authors;
        this.downloadLinks = downloadLinks;
    }

    public ElectronicBook(String ISBN, String[] authors, String[] downloadLinks, String[] remarksAndNotes) {
        this.ISBN = ISBN;
        this.authors = authors;
        this.downloadLinks = downloadLinks;
        this.remarksAndNotes = remarksAndNotes;
    }
    // get-ers and set-ers

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String[] getDownloadLinks() {
        return downloadLinks;
    }

    public void setDownloadLinks(String[] downloadLinks) {
        this.downloadLinks = downloadLinks;
    }

    public String[]getRemarksAndNotes() {
        return remarksAndNotes;
    }

    public void setRemarksAndNotes(String[]remarksAndNotes) {
        this.remarksAndNotes = remarksAndNotes;
    }
    
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public FormatOfElectronicBook getElectronicFormat() {
        return electronicFormat;
    }

    public void setElectronicFormat(FormatOfElectronicBook electronicFormat) {
        this.electronicFormat = electronicFormat;
    }

    public YearOfPublication getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(YearOfPublication yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }    
}
