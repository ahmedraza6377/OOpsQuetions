import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CarServiceStation carStation = new CarServiceStation();
        System.out.println("1->Hatchback");
        System.out.println("2->Sedan");
        System.out.println("3->SUV");
        System.out.print("please Chose type of car: ");
        int n=sc.nextInt();

        String carType;
        if(n==1){
            carType = "Hatchback";
        }else if(n==2){
            carType = "Sedan";
        }else if(n==3){
            carType = "SUV";
        }else{
            System.out.println("please enter valid type");
            return;
        }

        System.out.println("1-BS01");
        System.out.println("2-EF01");
        System.out.println("3-CF01");
        System.out.println("4-BF01");
        System.out.println("5-GF01");
        System.out.print("please chose serivce number: ");
        String serNum=sc.next();

        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<serNum.length();i++){
            char ch=serNum.charAt(i);
            if(ch=='1'){
                al.add("BS01");
            }else if(ch=='2'){
                al.add("EF01");
            }else if(ch=='3'){
                al.add("CF01");
            }else if(ch=='4'){
                al.add("BF01");
            }else if(ch=='5'){
                al.add("GF01");
            }else{
                al.add("0");
            }
        }


        String[] serCode=new String[al.size()];
        serCode=al.toArray(serCode);

        carStation.generateBill(carType,serCode);
    }
}
