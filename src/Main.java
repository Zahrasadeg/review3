public class Main {
    public static void main(String[] args) {
        boolean logbd=true;
        boolean logbc=false;
        if(logbc && logbd){
            System.out.println("test case is passed");
        }else{
            System.out.println("test case failled");
        }
        System.out.println("_______________________");

        boolean dash=false;
        String message="hello";
        if(dash || message.equals("welcome")){
            System.out.println("user succesfully loged in");
        }else{
            System.out.println("user is not logged in");
        }
    }
}