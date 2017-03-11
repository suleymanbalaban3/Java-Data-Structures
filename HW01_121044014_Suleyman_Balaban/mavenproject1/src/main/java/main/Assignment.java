/*
 * Suleyman Balaban 121044014
 * Assignment.java
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Suleyman Balaban
 */
public class Assignment {

    private String deadLine;
    private String lateDeadLine;
    private String assignmentType;
    private String assignmentName;
    /**
     * document list 
     */
    protected ArrayList<Document>documentList;
    
    /**
    * Default constructor
    * 
    */
    public Assignment() {
        deadLine = "25/02/2016 - 23:00";
        lateDeadLine = "26/02/2016 - 13:00";
        assignmentType = "Homework";
        assignmentName = "HW1";
        createSystemSize();
    }
    /**
    * one parameter constructor
    *
    * @param assignmentName and set assignment name 
    */
    public Assignment(String assignmentName) {
        this.deadLine = "20/02/2016 - 10:00";
        lateDeadLine = "26/02/2016 - 13:00";
        assignmentType = "Homework";
        this.assignmentName = assignmentName;
        createSystemSize();
    }
    /**
    * two parameter constructor
    *
    * @param assignmentName and set assignment name 
    * @param assignmentType and set assignment type 
    */
    public Assignment(String assignmentName, String assignmentType) {
        deadLine = "20/02/2016 - 10:00";
        lateDeadLine = "26/02/2016 - 13:00";
        this.assignmentType = assignmentType;
        this.assignmentName = assignmentName;
        createSystemSize();
    }
    /**
    * four parameter constructor
    *
    * @param assignmentName and set assignment name 
    * @param assignmentType and set assignment type 
    * @param deadLine and set assignment dead line 
    * @param lateDeadLine and set assignment late dead line 
    */
    public Assignment(String assignmentName, String assignmentType, String deadLine, String lateDeadLine) {
        this.assignmentType = assignmentType;
        this.assignmentName = assignmentName;
        this.deadLine = deadLine;
        this.lateDeadLine = lateDeadLine;
        createSystemSize();
    }
    /**
    * This method list who student upload assignment
    * 
    * : {@link #listWhoUpload()} 
    * 
    */
    public void listWhoUpload() {
        int indis = -1;

        if (documentList.size() == 0)//exception
        {
            System.out.println("0-)There is no student upload document in assignment!");
        } else {
            for (int i = 0; i < documentList.size(); i++) {
                System.out.println(i + 1 + "-) " + documentList.get(i));
            }
        }
    }
    /**
    * This method get assignment dead line
    * 
    * : {@link #getterDeadLine()} 
    * 
    *
    * @return String
    */
    public String getterDeadLine() {
        return deadLine;
    }
    /**
    * This method get assignment late dead line
    * 
    * : {@link #getterLateDeadLine()} 
    * 
    *
    * @return String
    */
    public String getterLateDeadLine() {
        return lateDeadLine;
    }
    /**
    * This method get assignment type
    * 
    * : {@link #getterAssignmentType()} 
    * 
    *
    * @return String
    */
    public String getterAssignmentType() {
        return assignmentType;
    }
    /**
    * This method get assignment name
    * 
    * : {@link #getterAssignmentName()} 
    * 
    *
    * @return String
    */
    public String getterAssignmentName() {
        return assignmentName;
    }
    /**
    * This method set assignment dead line
    * 
    * : {@link #setterDeadline(String deadLine)} 
    * @param deadLine and set assignment dead line
    *
    */
    public void setterDeadline(String deadLine) {
        this.deadLine = deadLine;
    }
    /**
    * This method set assignment late dead line
    * 
    * : {@link #setterLateDeadline(String lateDeadLine)} 
    * @param lateDeadLine and set assignment late dead line
    *
    */
    public void setterLateDeadline(String lateDeadLine) {
        this.lateDeadLine = lateDeadLine;
    }
    /**
    * This method set assignment type
    * 
    * : {@link #setterAssignmentType(String assignmentType)} 
    * @param assignmentType and set assignment type
    *
    */
    public void setterAssignmentType(String assignmentType) {
        this.assignmentType = assignmentType;
    }
    /**
    * This method set assignment name
    * 
    * : {@link #setterAssignmentName(String assignmentName)} 
    * @param assignmentName and set assignment name
    *
    */
    public void setterAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }
    /**
    * This method create system size for document
    * 
    * : {@link #createSystemSize()} 
    */
    public void createSystemSize() {
        documentList = new ArrayList<Document>(100);
    }
    /**
    * This method return assigment object's string
    * 
    * : {@link #toString()} 
    * @return String
    */
    public String toString() {
        return "*Assignment type : " + getterAssignmentType() + " Assignment name : " + getterAssignmentName()
                + "\n deadline : " + getterDeadLine() + " lateDeadLine : " + getterLateDeadLine();
    }
    /**
    * This method add Document object
    * 
    * : {@link #addDocumnet(Document object)} 
    * @param object Document object add
    *
    */
    public void addDocumnet(Document object) {
        documentList.add(object);
    }
}
/**
 *
 * @author Suleyman Balaban
 */
class quiz extends Assignment {
    /**
    * Default constructor
    * 
    */
    public quiz() {
        super();
        setterAssignmentType("quiz");
    }
    /**
    * one parameter constructor
    *
    * @param quizName and set quiz name 
    */
    public quiz(String quizName) {
        super(quizName, "quiz");
    }
    /**
    * two parameter constructor
    *
    * @param quizName and set quiz name 
    * @param deadLine and set quiz dead line 
    * @param lateDeadLine and set quiz late dead line
    */
    public quiz(String quizName, String deadLine, String lateDeadLine) {
        super(quizName, "quiz", deadLine, lateDeadLine);
    }
}
/**
 *
 * @author Suleyman Balaban
 */
class homework extends Assignment {
    /**
    * Default constructor
    * 
    */
    public homework() {
        super();
        setterAssignmentType("homework");
    }
    /**
    * one parameter constructor
    *
    * @param homeworkName and set homework name 
    */
    public homework(String homeworkName) {
        super(homeworkName, "homework");
    }
    /**
    * two parameter constructor
    *
    * @param homeworkName and set homework name 
    * @param deadLine and set homework dead line 
    * @param lateDeadLine and set homework late dead line
    */
    public homework(String homeworkName, String deadLine, String lateDeadLine) {
        super(homeworkName, "homework", deadLine, lateDeadLine);
    }
}
/**
 *
 * @author Suleyman Balaban
 */
class groupProject extends Assignment {
    /**
    * Default constructor
    * 
    */
    public groupProject() {
        super();
        setterAssignmentType("groupProject");
    }
    /**
    * one parameter constructor
    *
    * @param groupProjectName and set group Project name 
    */
    public groupProject(String groupProjectName) {
        super(groupProjectName, "groupProject");
    }
    /**
    * two parameter constructor
    *
    * @param groupProjectName and set group Project name 
    * @param deadLine and set group Project dead line 
    * @param lateDeadLine and set group Project late dead line 
    */
    public groupProject(String groupProjectName, String deadLine, String lateDeadLine) {
        super(groupProjectName, "groupProject", deadLine, lateDeadLine);
    }
}
