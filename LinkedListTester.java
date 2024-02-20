
public class LinkedListTester {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        GenLL<String> StringTest = new GenLL<>(); 
        int GenSize = StringTest.getSize(); 

        String [] names = {"Saeed", "Anas", "Sadeen", "Somaya", "Osama"}; 

        System.out.println("Array componenets: "); 
        for(int i=0; i<names.length; i++)
        {
            System.out.println(names[i]);
        }

        //using generic list 
        for(int i=0; i<5; i++)
        {
            StringTest.add(names[i]);
        }
        System.out.println("LinkedList items");
        StringTest.print();

        
    }
    
}
