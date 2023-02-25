public class MyClass {
    public static void main(String[] args){
        String myString = "Hello World";
        int myStringLength = myString.length();
        String myStringinLowerCase = myString.toLowerCase();
        System.out.println(myString);
        System.out.println(myStringLength);
        System.out.println(myStringinLowerCase);
        System.out.println(myStringinLowerCase.codePointAt(10));
    }
}