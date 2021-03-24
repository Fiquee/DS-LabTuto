package dstuto2;

public class Util <T>{
    

    public void compare(T a,T b) {
        if (a instanceof Integer) {
            System.out.println("The sum of two Integers is : " + ((Integer) a + (Integer) b));
        }
        else if (a instanceof Double){
            System.out.println("The sum of two Double is : " + ((Double)a + (Double)b));
        }
        else if(a instanceof String){
            if(a.equals((String)b)){
                System.out.println("The strings are equal");
            }
            else{
                System.out.println("The strings are not equal");
            }
        }else{
            System.out.println("These are characters");
        }
    }
}
