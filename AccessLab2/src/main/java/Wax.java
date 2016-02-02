/**
 * Created by simonhamermesh on 1/29/16.
 */
public class Wax {

    private String color;
    private String type;

    private Wax(String x, String y){
        color = x;
        if(color.equals("yellow")||color.equals("white")){type = "Standard";}
        else{type = y;}
    }

    public static Wax chooseWax(String x, int y){
        String typeChoice = chooseType(x);
        String colorChoice = chooseColor(y);
        return new Wax(typeChoice, colorChoice);
    }

    public String getColor(){
        return color;
    }

    public void setColor(String x){
        color = x;
    }

    public String getType(){
        return type;
    }

    public void setType(String x ){
        type = x;
    }

    private static String chooseColor(int x){

        String temp="";

        if(x>38){temp = "Yellow";}
        else if(x>31 && x<=38){temp = "Red";}
        else if(x>26 && x<=31){temp = "Violet";}
        else if(x>18 && x<=26){temp = "Blue";}
        else if(x>5 && x<=18){temp = "Green";}
        else if(x<=5){temp = "White";}

        return temp;
    }

    private static String chooseType(String x){

        String temp;

            if(x.toLowerCase().equals("powder")){temp = "Special";}
            else if(x.toLowerCase().equals("firm")){temp = "Standard";}
            else if(x.toLowerCase().equals("crusty")){temp = "Extra";}
            else {temp = "INVALID SNOW TYPE";}

        return temp;
    }

}
