public class StaticVarExample {
    public static String myClassVar= "class or static";
    public static void main(String[] args) {
        StaticVarExample obj= new StaticVarExample();
        StaticVarExample obj2= new StaticVarExample();
        StaticVarExample obj3= new StaticVarExample();
        //All thee will display "class or static

        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);
        //changing the value of the static variable using obj2
        obj2.myClassVar = "Changed Text";
        //All three will display "changed text"
        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);
    }

}
