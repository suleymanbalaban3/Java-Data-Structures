/*
 * Suleyman Balaban 121044014
 * Document.java
 */
package main;

/**
 *
 * @author Suleyman Balaban
 */
public class Document {

    private String documentType;
    private String documentName;
    private String documentOwner;
    /**
    * Default constructor
    * 
    */
    public Document() {
        this.documentType = "Unknown document type";
        this.documentName = "Unknown document";
        this.documentOwner = "Unknown owner";
    }
    /**
    * One parameter constructor
    *
    * @param documentType and set document type 
    * 
    */
    public Document(String documentType) {
        this.documentType = documentType;
        this.documentName = "Unknown document";
        this.documentOwner = "Unknown owner";
    }
    /**
    * two parameter constructor
    *
    * @param documentType and set document type 
    * @param documentName and set document name
    * 
    */
    public Document(String documentType, String documentName) {
        this.documentType = documentType;
        this.documentName = documentName;
        this.documentOwner = "Unknown owner";
    }
    /**
    * three parameter constructor
    *
    * @param documentType and set document type 
    * @param documentName and set document name
    * @param documentOwner and set document owner
    * 
    */
    public Document(String documentType, String documentName, String documentOwner) {
        this.documentType = documentType;
        this.documentName = documentName;
        this.documentOwner = documentOwner;
    }
    /**
    * This method get document type
    * 
    * : {@link #getterDocumentType()} 
    * 
    *
    * @return String
    */
    public String getterDocumentType() {
        return documentType;
    }
    /**
    * This method get document type
    * 
    * : {@link #getterDocumentName()} 
    * 
    *
    * @return String
    */
    public String getterDocumentName() {
        return documentName;
    }
    /**
    * This method get document type
    * 
    * : {@link #getterDocumentOwner()} 
    * 
    *
    * @return String
    */
    public String getterDocumentOwner() {
        return documentOwner;
    }   
    /**
    * This method set document type,name,owner
    * 
    * : {@link #documentSetter(String documentType, String documentName, String documentOwner)} 
    * @param documentType and set document type 
    * @param documentName and set document name
    * @param documentOwner and set document owner
    *
    */
    public void documentSetter(String documentType, String documentName, String documentOwner) {
        this.documentType = documentType;
        this.documentName = documentName;
        this.documentOwner = documentOwner;
    }
    /**
    * This method return string of object
    * 
    * : {@link #toString()} 
    * 
    *
    * @return String
    */
    public String toString() {
        return "Document type : " + getterDocumentType() + ", Name : " + getterDocumentName() + ", Owner : " + getterDocumentOwner();
    }
}
/**
 *
 * @author Suleyman Balaban
 */
class file extends Document {

    private String fileName;
    /**
    * Default constructor
    * 
    */
    public file() {
        super("file");
        fileName="unknown file";
    }
    /**
    * One parameter constructor
    *
    * @param fileName and set file name 
    * 
    */
    public file(String fileName) {
        super("file", fileName);
        this.fileName=fileName;
    }
    /**
    * two parameter constructor
    *
    * @param fileName and set file name 
    * @param fileOwner and set file owner
    */
    public file(String fileName, String fileOwner) {
        super("file", fileName, fileOwner);
        this.fileName=fileName;
    }
    /**
    * This method get file name
    * 
    * : {@link #getterFile()} 
    * 
    *
    * @return String
    */
    public String getterFile() {
        return fileName;
    }
    /**
    * This method set file name
    * 
    * : {@link #setterFile(String fileName)} 
    * @param fileName and set file name
    *
    */
    public void setterFile(String fileName) {
        this.fileName = fileName;
    }
}

class books extends Document {

    private String booksName;
    /**
    * Default constructor
    * 
    */
    public books() {
        super("books");
        booksName="unknown books";
    }
    /**
    * two parameter constructor
    *
    * @param booksName and set books name 
    * @param booksOwner and set books owner 
    */
    public books(String booksName, String booksOwner) {
        super("books", booksName, booksOwner);
        this.booksName=booksName;
    }
    /**
    * This method get books name
    * 
    * : {@link #getterBooks()} 
    * 
    *
    * @return String
    */
    public String getterBooks() {
        return booksName;
    }
    /**
    * This method set books name
    * 
    * : {@link #setterBooks(String booksName)} 
    * @param booksName and set books name
    *
    */
    public void setterBooks(String booksName) {
        this.booksName = booksName;
    }
}

class slides extends Document {

    private String slidesName;
    /**
    * Default constructor
    * 
    */
    public slides() {
        super("slides");
        slidesName="unknown slides";
    }
    /**
    * two parameter constructor
    *
    * @param slidesName and set slides name 
    * @param slidesOwner and set slides owner 
    */
    public slides(String slidesName, String slidesOwner) {
        super("slides", slidesName, slidesOwner);
        this.slidesName=slidesName;
    }
    /**
    * This method get slides name
    * 
    * : {@link #getterSlides()} 
    * 
    *
    * @return String
    */
    public String getterSlides() {
        return slidesName;
    }
    /**
    * This method set slides name
    * 
    * : {@link #setterSildes(String slidesName)} 
    * @param slidesName and set books name
    *
    */
    public void setterSildes(String slidesName) {
        this.slidesName = slidesName;
    }
}

class url extends Document {

    private String urlName;
    /**
    * Default constructor
    * 
    */
    public url() {
        super("url");
        urlName="unknown url";
    }
    /**
    * two parameter constructor
    *
    * @param urlName and set url name 
    * @param urlOwner and set url owner 
    */
    public url(String urlName, String urlOwner) {
        super("url", urlName, urlOwner);
        this.urlName=urlName;
    }
    /**
    * This method get url name
    * 
    * : {@link #getterUrl()} 
    * 
    *
    * @return String
    */
    public String getterUrl() {
        return urlName;
    }
    /**
    * This method set url name
    * 
    * : {@link #setterUrl(String urlName)} 
    * @param urlName and set url name
    *
    */
    public void setterUrl(String urlName) {
        this.urlName = urlName;
    }
}

class whiteBoard extends Document {

    private String whiteBoardName;
    /**
    * Default constructor
    * 
    */
    public whiteBoard() {
        super("whiteBoard");
        whiteBoardName="unknown wBoard";
    }
    /**
    * two parameter constructor
    *
    * @param whiteBoardName and set white Board name 
    * @param whiteBoardOwner and set white Board owner 
    */
    public whiteBoard(String whiteBoardName, String whiteBoardOwner) {
        super("whiteBoard", whiteBoardName, whiteBoardOwner);
        this.whiteBoardName=whiteBoardName;
    }
    /**
    * This method get whiteBoard name
    * 
    * : {@link #getterWhiteBoard()} 
    * 
    *
    * @return String
    */
    public String getterWhiteBoard() {
        return whiteBoardName;
    }
    /**
    * This method set white Board name
    * 
    * : {@link #setterWhiteBoard(String whiteBoardName)} 
    * @param whiteBoardName and set books name
    *
    */
    public void setterWhiteBoard(String whiteBoardName) {
        this.whiteBoardName = whiteBoardName;
    }
}
