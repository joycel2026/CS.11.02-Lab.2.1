public class Main {

    public static void main(String[] args) {
        int one = add(4,15);
        System.out.println(one);
        int two = add(3,14,12,16);
        System.out.println(two);
        String three = morningGreeting("Joyce");
        System.out.println(three);
        String four = afternoonGreeting("Joyce");
        System.out.println(four);
        String five = triple("pineapple");
        System.out.println(five);
        double six = half(5);
        System.out.println(six);
        int seven = roundPositiveValueToNearestInteger(5.5);
        System.out.println(seven);
        int eight = roundNegativeValueToNearestInteger(-7.5);
        System.out.println(eight);
    }


    // 1. add
    public static int add (int a, int b){
        return a+b;
    }    

    // 2. add
    public static int add(int a, int b, int c, int d){
        int e = add(a,b);
        int f = add(c,d);
        return add(e,f);
    }



    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }

    // 5. triple
    public static String triple(String input){
        return input+input+input;
    }

    // 6. half
    public static double half(int a){
        return a/2.0;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a){
        return (int) Math.round(a);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a){
        return (int) Math.round(a-0.01);
    }
}
