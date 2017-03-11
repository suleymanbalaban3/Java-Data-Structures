/*
 * Suleyman Balaban 121044014 HW04
 * registers.java
 */
package slymnBlbn;

/**
 *
 * @author Suleyman Balaban
 */
public class registers {
    private static int temp=-1;
    private int num;
    private int value;
    private String name;
    private boolean isAssigned=false;
    /**
    * Default constructor
    * 
    */
    public registers() {
        temp++;
        num=temp;
        this.value=-9999;
        this.name="junk";      
        this.isAssigned=false;
    }
    /**
    * One parameter constructor
    *
    * @param name register name
    * 
    */
    public registers(String name) {
        temp++;
        num=temp;
        this.value=-9999;
        this.name=name;
        this.isAssigned=false;
    }
    /**
    * two parameter constructor
    *
    * @param value register value
    * @param name register name
    * 
    */
    public registers(int value,String name) {
        temp++;
        num=temp;
        this.value=value;
        this.name=name;
        this.isAssigned=false;
    }
    /**
    * This method get register name
    * 
    * : {@link #public String getterRegName()} 
    * @return String 
    */
    public String getterRegName() {
        return name;
    }
    /**
    * This method get register value
    * 
    * : {@link #public int getRegValue()} 
    * @return int 
    */
    public int getRegValue() {
        return value;
    }
    /**
    * This method get register num
    * 
    * : {@link #public int getNum()} 
    * @return int 
    */
    public int getNum() {
        return num;
    }
    /**
    * This method set register
    * 
    * : {@link #public void setRegister(int value)} 
    * @param value register value
    */
    public void setRegister(int value) {
        this.value=value;
    }
    /**
    * This method set isAssigned member
    * 
    * : {@link #public void setIsAssigned(boolean isAssigned)} 
    * @param isAssigned is assigned value
    */
    public void setIsAssigned(boolean isAssigned) {
        this.isAssigned=isAssigned;
    }
    /**
    * This method get isAssigned 
    * 
    * : {@link #public boolean getIsAssigned()} 
    * @return boolean 
    */
    public boolean getIsAssigned() {
        return isAssigned;
    }
    /**
    * This method print register informations
    * 
    * : {@link #public String toString()} 
    * @return String 
    */
    @Override
    public String toString() {
        return "$t"+num;
    }
}
