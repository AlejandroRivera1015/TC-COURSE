package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Call implements CallServices{

    public static String message = "------------------>WELCOME, PLEASE ADD CODE / MINS RELATION ";
    private Integer code; // no estaticas xq cada instacia tiene estos valores,
    private Double time;
    private Double total;


    public Call(){};

    public void setCode(Integer code){
        this.code = code;
    }
    public Integer getCode(){
        return this.code;
    }

    public void setTime(Double time){
        this.time = time;
    }

    public Double getTime(){
        return  this.time;
    }


    @Override
    public void setCallCost(Double cost, Double time){
        this.total = cost * time;
    }

    @Override
    public Double getCallCost(){
        return this.total;
    }




}
