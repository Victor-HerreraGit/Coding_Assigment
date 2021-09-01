import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sport {
    // Attributes
    private int ID;
    private int date;
    private int time;
    private double VIP_price;
    private double Gold_price;
    private double Silver_price;
    private double Bronze_price;
    private double General_Admission;

    private String type;
    private String name;


    // Constructors
    public Sport(){
    }
    public Sport(int ID_IN){
        ID = ID_IN;
    }



    //Getters Setters

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getGeneral_Admission() {
        return General_Admission;
    }

    public void setGeneral_Admission(double general_Admission) {
        General_Admission = general_Admission;
    }

    public double getBronze_price() {
        return Bronze_price;
    }

    public void setBronze_price(double bronze_price) {
        Bronze_price = bronze_price;
    }

    public double getSilver_price() {
        return Silver_price;
    }

    public void setSilver_price(double silver_price) {
        Silver_price = silver_price;
    }

    public double getGold_price() {
        return Gold_price;
    }

    public void setGold_price(double gold_price) {
        Gold_price = gold_price;
    }

    public double getVIP_price() {
        return VIP_price;
    }

    public void setVIP_price(double VIP_price) {
        this.VIP_price = VIP_price;
    }

    //----------------------------Modifying Methods---------------------------------------------------------\\

    public static ArrayList<String> Read_to_Array(String file){

        ArrayList<String> Sporting_information = new ArrayList<String>();
        if (file != null) {
            String[] input_data = file.split("\\s*,\\s*");
            for (int i = 0; i < input_data.length; i++) {
                if (!(input_data[i] == null) || !(input_data[i].length() == 0)) {
                    Sporting_information.add(input_data[i].trim());
                }
            }
        }
        return Sporting_information;
    }
    public void User_Tools() throws IOException {
        Sport obj_1 = new Sport();
        Scanner scr = new Scanner(System.in);
        int i = 0;
        while(i<4) {
            obj_1.Selection();
        }


    }
    public void Reader_1() throws IOException {
        Sport obj_1 = new Sport();
        BufferedReader br = null;
        try {
            String readLine_1;
            br = new BufferedReader(new FileReader("C:\\Users\\victor\\Desktop\\School Information\\Advance Object Oriented Programming\\Coding Assigment_1\\EventList PA1 (1).csv"));
            while ((readLine_1 = br.readLine()) != null) {
                System.out.println((obj_1.Read_to_Array(readLine_1)));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        br.close();
    }
    public void Selection() throws IOException {
        ArrayList<String> Sporting_information = new ArrayList<String>();
        Sport Track = new Sport();
        Scanner scr = new Scanner(System.in);
        int i =0;
        while (i < 4) {
            System.out.println("Welcome UTEP Sporting Event Tracker");
            System.out.println("Please select one of the following options");
            System.out.println("1.Display event"+ "\n"+ "2.Update event " );
            String user_in = scr.nextLine();

            switch (user_in) {
                case "1": Track.Reader_1();
                System.out.println("Please make a selection");
                String[]events = Track.Read_to_Array();
                    String update = scr.nextLine();
                    for(int i =0;i<)
                    break;
                case  "2": System.out.print("Testing ");
                    break;
                case  "3": Track.getName();
                    break;
                default:



            }
            i++;
        }


    }



}







