/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs471semesterproject;

/**
 *
 * @author kdashley
 */
public class Process implements Comparable<Process> {
    
    private int pid;
    private int priority;
    private String status;    
    
    public Process(int p, int pr, String s){
        this.pid = p;
        this.priority = pr;
        this.status = s;
    }
    
    public int getPid() {return this.pid;}
    public int getPriority() {return this.priority;}
    public String getStatus() {return this.status;}
    public void setStatus(String s){
        this.status = s;
    } 
    
    public boolean equals (Process other){
        return this.getPriority() == other.getPriority();
    }
    
    @Override
    public int compareTo(Process other) {
        if(this.equals(other))
            return 0;
        else if(this.getPriority() > other.getPriority())
            return 1;
        else
            return -1;
    }
}
