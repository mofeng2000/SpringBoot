package com.luoli.dao;


import org.springframework.stereotype.Component;

@Component
public class SaleMachine {
    private int countOfBeer, countOfOrangeJuice, countOfFiveCents, countOfOneDollar;
    private String[] typeOfGoods = {"Beer", "OrangeJuice"};
    private String resultOfDeal;

    private void initial() {
        countOfBeer = 6;
        countOfOrangeJuice = 6;
        countOfFiveCents = 6;
        countOfOneDollar = 6;
    }

    public void saleMachine() {
        initial();
    }

    public void saleMachine(int fiveCents, int oneDollar, int numOfBeer, int numOfOrange) {
        countOfFiveCents = fiveCents;
        countOfOneDollar = oneDollar;
        countOfBeer = numOfBeer;
        countOfOrangeJuice = numOfOrange;
    }

    public String currentState() {
        String state = "Current State\n" +
                "Beer:" + countOfBeer + "\n" +
                "Orange Juice:" + countOfOrangeJuice + "\n" +
                "5 Cents:" + countOfFiveCents + "\n" +
                "1 Dollar:" + countOfOneDollar;
        return state;
    }

    public String operation(String type, String money) {//System.out.println("money:"+money);
        //System.out.println("type:"+type);
        //System.out.println("countofbeer:"+countOfBeer);
        if (money.equalsIgnoreCase("5C")) {
            //equalsIgnoreCase()忽略大小写
            if (type.equals(typeOfGoods[0])) {
                if (countOfBeer > 0) {
                    countOfBeer--;
                    countOfFiveCents++;
                    resultOfDeal = "Input Information\n" +
                            "Type:Beer;Money:5 Cents;Change:0\n\n" + currentState();
                    return resultOfDeal;
                } else {
                    resultOfDeal = "Failure Information\n" + "Beer Shortage";
                    return resultOfDeal;
                }
            } else if (type.equals(typeOfGoods[1])) {
                if (countOfOrangeJuice > 0) {
                    countOfOrangeJuice--;
                    countOfFiveCents++;
                    resultOfDeal = "Input Information\n" +
                            "Type:OrangeJuice;Money:5 Cents;Change:0\n\n" + currentState();
                    return resultOfDeal;
                } else {
                    resultOfDeal = "Failure Information\n" + "OrangeJuice Shortage\n\n";
                    return resultOfDeal;
                }

            } else {
                resultOfDeal = "Failure Information\n" + "Type Error";
                return resultOfDeal;
            }

        } else if (money.equalsIgnoreCase("1D")) {
            if (countOfFiveCents > 0) {
                if (type.equals(typeOfGoods[0]) && countOfBeer > 0) {
                    countOfBeer--;
                    countOfFiveCents--;
                    countOfOneDollar++;
                    resultOfDeal = "Input Information\n" +
                            "Type:Beer;Money:1 Dollar;Change:5 Cents\n\n" + currentState();
                    return resultOfDeal;
                } else if (type.equals(typeOfGoods[1]) && countOfOrangeJuice > 0) {
                    countOfOrangeJuice--;
                    countOfFiveCents--;
                    countOfOneDollar++;
                    resultOfDeal = "Input Information\n" +
                            "Type:OrangeJuice;Money:1 Dollar;Change:5 Cents\n\n" + currentState();
                    return resultOfDeal;
                } else {
                    if (type.equals(typeOfGoods[0]) && countOfBeer <= 0) {
                        resultOfDeal = "Failure Information\n" + "Beer Shortage\n\n";
                        return resultOfDeal;
                    } else if (type.equals(typeOfGoods[1]) && countOfOrangeJuice <= 0) {
                        resultOfDeal = "Failure Information\n" + "OrangeJuice Shortage\n\n";
                        return resultOfDeal;
                    } else {
                        resultOfDeal = "Failure Information\n" + "Type Error";
                        return resultOfDeal;
                    }

                }

            } else {
                resultOfDeal = "Failure Information\n" + "Change Shortage\n\n";
                return resultOfDeal;
            }
        } else {
            resultOfDeal = "Failure Information\n" + "Money Error";
            return resultOfDeal;
        }

    }


}