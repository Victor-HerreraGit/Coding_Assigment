import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Sport {
    // Attributes import java.text.SimpleDateFormat;
    private String ID;
    private String date;
    private String time;
    private String VIP_price;
    private String Gold_price;
    private String Silver_price;
    private String Bronze_price;
    private String General_Admission;

    private String type;
    private String name;


    // Constructors
    public Sport() {
    }

    public Sport(String ID_IN,String Type_in,String Name_in,String date_in,String time_in,String vip_in,String
                 gold_price,String silver_in,String bronze_in,String general_in){
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


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getGeneral_Admission() {
        return General_Admission;
    }

    public void setGeneral_Admission(String general_Admission) {
        General_Admission = general_Admission;
    }

    public String getBronze_price() {
        return Bronze_price;
    }

    public void setBronze_price(String bronze_price) {
        Bronze_price = bronze_price;
    }

    public String getSilver_price() {
        return Silver_price;
    }

    public void setSilver_price(String silver_price) {
        Silver_price = silver_price;
    }

    public String getGold_price() {
        return Gold_price;
    }

    public void setGold_price(String gold_price) {
        Gold_price = gold_price;
    }

    public String getVIP_price() {
        return VIP_price;
    }

    public void setVIP_price(String VIP_price) {
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

    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<List<String>> Reader() throws IOException {


        List read = null;
        try {
            read = new ArrayList<>();

            String Path = "EventList PA1 (1).csv";                          // Csv. File to be read

            String Read = " ";
            BufferedReader BR = new BufferedReader(new FileReader(Path));    // Buffered Reader to read file
            while ((Read = BR.readLine()) != null) {
                String[] options = Read.split(",");
                String ID = (options[0]);
                String type = options[1];
                String name = options[2];
                String Date = options[3];
                String Time = options[4];
                String VIP = (options[5]);
                String GOLD = (options[6]);
                String Silver = (options[7]);
                String Bronze = (options[8]);
                String General = (options[9]);
                Sport event = new Sport(ID, type, name, Date, Time, VIP, GOLD, Silver, Bronze, General);
                read.add(Arrays.asList(event));



            }

            for(int i =0;i<read.size();i++){
                System.out.println(read.get(i));

            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return read;
    }


    @Override
    public String toString() {
        return "Event[ ID = "+ ID + " Type = "+type+  " Name = "+name+" Date = "+ date
                + " Time = "+time+ " VIP Price is "+VIP_price+ " Gold Price is "+ Gold_price
                + " Silver Price is "+Silver_price+ " Bronze Price is "+ Bronze_price+ " General Admission is "+ General_Admission+" ]";

    }
}

