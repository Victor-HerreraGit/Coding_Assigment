import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
    public Sport() {
    }

    public Sport(int ID_IN,String Type_in,String Name_in,int date_in,int time_in,double vip_in,double
                 gold_price,double silver_in,double bronze_in,double general_in){
        this.ID = ID_IN;
        this.type = Type_in;
        this.name = Name_in;
        this.date = date_in;
        this.VIP_price = vip_in;
        this.Gold_price = gold_price;
        this.Silver_price = silver_in;
        this.Bronze_price = bronze_in;
        this.General_Admission = general_in;

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
    public void userTool() throws IOException {
        Scanner scr = new Scanner(System.in);
        System.out.println("Welcome to Miner Sports" + "\n" + "Please Make a Selection by Entering Number");
        System.out.println("1.View Event" + "\n" + "2.Update Event");
        int Selection = scr.nextInt();

        switch (Selection) {
            case 1:
                view();
                Reader();
            break;
            default:
        }

    }

    public void view() throws IOException {
       System.out.println("Please view events");
       Reader();
    }

    public List Reader() throws IOException {

        List read = new ArrayList<>();                // Arraylist To Store Data
        String Path = "EventList PA1 (1).csv";                          // Csv. File to be read
        BufferedReader BR = new BufferedReader(new FileReader(Path));    // Buffered Reader to read file
        String Read = BR.readLine();
        while (Read != null && !Read.isEmpty()) {
            String[] options = Read.split(",");
            int ID = Integer.parseInt(options[0]);
            String type = options[1];
            String name = options[2];
            int Date = Integer.parseInt(options[3]);
            int Time = Integer.parseInt(options[4]);
            double VIP = Double.parseDouble(options[5]);
            double GOLD = Double.parseDouble(options[6]);
            double Silver = Double.parseDouble(options[7]);
            double Bronze = Double.parseDouble(options[8]);
            double General = Double.parseDouble(options[9]);
            Sport event = new Sport(ID,type,name,Date,Time,VIP,GOLD,Silver,Bronze,General);
            read.add(event);
        }
        return read;

    }
    @Override
    public String toString() {
        return "Event[ID = "+ ID+ "Type = "+"Name = "+name+"Date = "+ date
                + "Time = "+time+ "VIP Price is "+VIP_price+ "Gold Price is "+ Gold_price
                + "Silver Price is "+Silver_price+ " Bronze Price is"+ Bronze_price+ "General Admission is"+ General_Admission+"]";

    }
}

