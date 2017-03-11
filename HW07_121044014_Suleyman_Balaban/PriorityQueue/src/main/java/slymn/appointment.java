/*
 * HW07_121044014_Suleyman_Balaban
 * appointment.java
 */
package slymn;

/**
 *
 * @author Suleyman Balaban
 */
public class appointment {
    private int time;
    private int duration;
    private int priority;
    /**
     * default constructor
     */
    public appointment() {
        this.time=0;
        this.duration=0;
        this.priority=0;
    }
    /**
     *  theree parameter constructor
     * @param time
     * @param duration
     * @param priority 
     */
    public appointment(int time,int duration,int priority) {
        this.time=time;
        this.duration=duration;
        this.priority=priority;
    }
    /**
     * this method get time
     * @return 
     */
    public int getTime() {
        return time;
    }
    /**
     * this method get duration
     * @return 
     */
    public int getDuration() {
        return duration;
    }
    /**
     * this method get priority
     * @return 
     */
    public int getPriority() {
        return priority;
    }
    /**
     * this method set duration value
     * @param duration 
     */
    public void setDuration(int duration) {
        this.duration=duration;
    }
    /**
     * this method set priority value
     * @param priority 
     */
    public void setPriority(int priority) {
        this.priority=priority;
    }
    /**
     * this method set time value
     * @param time 
     */
    public void setTime(int time) {
        this.time=time;
    }
    /**
     * this method print object 
     * @return 
     */
    public String toString() {
        int hour=(time/60);
        if(hour>=24)
            hour=hour%24;
        
        if(hour<10&&(time%60)<10)
            return "0"+hour+":0"+(time%60)+"\t\t"+duration+"\t\t\t\tcustomer "+priority;
        else if(hour<10)
            return "0"+hour+":"+(time%60)+"\t\t"+duration+"\t\t\t\tcustomer "+priority;
        else if((time%60)<10)
            return hour+":0"+(time%60)+"\t\t"+duration+"\t\t\t\tcustomer "+priority;
        else
            return hour+":"+(time%60)+"\t\t"+duration+"\t\t\t\tcustomer "+priority;
    }
}
