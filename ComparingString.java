abstract class ComparingString {
    abstract void compareStrings(String str1, String str2);
    
}

class StringComparator extends ComparingString {
    void compareStrings(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
}
class Main {
    public static void main(String[] args) {
        StringComparator comparator = new StringComparator();
        comparator.compareStrings("Hello", "Hello");
        comparator.compareStrings("Hello", "World");
        
    }
}