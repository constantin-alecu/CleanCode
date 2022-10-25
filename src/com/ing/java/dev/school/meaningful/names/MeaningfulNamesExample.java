package com.ing.java.dev.school.meaningful.names;


import java.net.URL;

public class MeaningfulNamesExample {

    //intention-revealing name
    int d; //elapsed days since last update
    int daysSinceLastUpdate;

    //avoid disinformation
    String patternForEfficient_Handling_OfStrings;
    String patternForEfficient_Storage_OfStrings;

    //make meaningful distinctions
    //public void copyProperties(Object o1, Object o2){}
    public void copyProperties(Object source, Object destination){}

    //pronounceable names
    class DtaRcrd102{
        int gentms;
    }
    class Customer{
        int generationTimestamp;
    }

    // use searchable names (ctrl + F), not interfering with other names
    int response = 0;
    int res = 10; // result

    //avoid using magic numbers
    static final int AVERAGE_NUMBER_OF_DAYS_IN_A_MONTH = 30;
    public void doSomething(int something){
        if(something < 30){
            //some logic
        }
    }

    // Avoid mental mapping
    // Good
    public URL url;
    // Bad
    public URL r; // not everybody would think r will be url

    // Pick one word for concept
    // Good
    void saveUser(){}; void saveAccount(){}; void saveContract(){};
    // Bad
    void saveUser(){}; void createAccount(){}; void generateContract(){};
}
