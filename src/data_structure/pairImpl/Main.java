package data_structure.pairImpl;

public class Main {
    public static void main(String[] args){

        PairImpl<String,Integer> pair1= new PairImpl<>("Abood",22);
        PairImpl<String,Integer> pair2= new PairImpl<>("Oday",15);
        PairImpl<String,Integer> pair3= new PairImpl<>("Tamer",32);
        PairImpl<String,Integer> pair4= new PairImpl<>("Abdallah",19);
        PairImpl<String,Integer> pair5= new PairImpl<>("Mohammed",28);

        System.out.println(pair1.getFirst()+" "+pair1.getSecond());
        System.out.println(pair2.getFirst()+" "+pair2.getSecond());
        System.out.println(pair3.getFirst()+" "+pair3.getSecond());
        System.out.println(pair4.getFirst()+" "+pair4.getSecond());
        System.out.println(pair5.getFirst()+" "+pair5.getSecond());


    }
}
