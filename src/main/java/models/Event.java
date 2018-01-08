package models;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Event {
    private int guest;
    private String food;
    private String drink;
    private String entertainment;
    private String coupon;
    private Integer baseCost;
    private int plate;

    public Event (int guest, String food, String drink, String entertainment, String coupon) {
        this.guest = guest;
        this.food = food;
        this.drink = drink;
        this.entertainment = entertainment;
        this.coupon = coupon;
    }
    public int getGuest() {
        return guest;
        }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public String getEntertainment() {
        return entertainment;
    }

    public String getCoupon() {
        return coupon;
    }



    public int calculatePlate() {

        Integer plate = 30;
        if (this.food.equals("Chicken")) {
            plate = plate + 2;
        } else if (this.drink.equals("Spirits")){
            plate = plate + 3;
        } else {
            plate = plate;
        } return plate;
    }
    public int totalCost() {
        Integer baseCost = plate * guest;
        if (this.entertainment.equals("Live Band")) {
            baseCost = baseCost + 150;
        } else if ((this.coupon.equals("FREE DJ")) && (this.guest > 150)) {
            baseCost = baseCost - 150;
        } else if (this.coupon.equals("FIFTY OFF")){
            baseCost = baseCost - 50;
        } else {
            baseCost = baseCost;
        } return baseCost;
    }






//    public static String calculatePoint() {
//        Pattern onePoint = Pattern.compile("['H']");
//        String[] uppedWord = enteredWord.split("");
//        Integer plate = 30;
//        for(int i = 0; i < uppedWord.length; i++){
//            if(uppedWord[i].matches("(?i)['A'|'E'|'I'|'O'|'U']")){
//                score = score + 1;
//            } else if (uppedWord[i].matches("(?i)['D'|'G']")) {
//                score = score + 2;
//            } else if (uppedWord[i].matches("(?i)['B'|'C'|'M'|'P']")) {
//                score = score + 3;
//            } else if (uppedWord[i].matches("(?i)['F'|'H'|'V'|'W'|'Y']")) {
//                score = score + 4;
//            } else if (uppedWord[i].matches("(?i)['K']")) {
//                score = score + 5;
//            } else if (uppedWord[i].matches("(?i)['J'|'X']")) {
//                score = score + 8;
//            } else if (uppedWord[i].matches("(?i)['Q'|'Z]")) {
//                score = score + 10;
//            } else {}
//        }
//        return score.toString();
}
