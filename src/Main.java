public class Main {
    public static void main(String[] args){

     Pair ii = new Pair<Integer, Integer> (1,2);
     Pair si = new Pair<String, Integer> ("hello", 12345);
     Pair ss = new Pair<String, String> ("two", "strings");

        System.out.println(ii.getOne());
        System.out.println(ii.getTwo());

        System.out.println(si.getOne() + " hello" + si.getTwo());

    }
}
