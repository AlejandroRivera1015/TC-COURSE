package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sysIn = new Scanner(System.in);
        Call callModel = new Call();
        boolean flag = false;

        List<CallPriceRelation>  relations = new ArrayList<>();
            relations.add(new CallPriceRelation(12,2.0));
            relations.add(new CallPriceRelation(15,2.2));
            relations.add(new CallPriceRelation(18,4.5));
            relations.add(new CallPriceRelation(19,3.5));
            relations.add(new CallPriceRelation(23,6.0));
            relations.add(new CallPriceRelation(25,6.0));
            relations.add(new CallPriceRelation(29,5.0));

        do {
            System.out.println(Call.message);
            try {
                System.out.println("CODE:");
                    callModel.setCode(sysIn.nextInt());
                sysIn.nextLine();
                System.out.println("MINS: ");
                    callModel.setTime(sysIn.nextDouble());
                flag = true;

            } catch (Exception e) {
                System.out.println("ERROR, PLEASE TRY TYPING AGAIN");
                sysIn.nextLine();
            }
        }while (!flag);

        for (CallPriceRelation callRelation : relations){
                if(callRelation.code.equals(callModel.getCode())){
                    callModel.setCallCost(callRelation.price,callModel.getTime());
                }
        }

        System.out.println("YOUR TOTAL IS: $"+callModel.getCallCost());


    }
}