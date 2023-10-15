package de.softwarerat.bansystemspigot.Api;

public class MiliCalc {

    public Long addDays(Long ms,int days){
      int dayMS = days*86400000;
    return  dayMS+ms;

    };


}
