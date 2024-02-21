/*
 * Written by Anas Bamaroof 
 * February 20th 
 * Linked List work on a concept of node, data, and links 
 * you start the list, then you can append using the last node 
 * and you can remove data using the same node 
 * this is generic, so we can combine different types together 
 * unlike array 
 */

 // we create a generic linkedList that could be any data type 
public class GenLL <GenericType> {

    // create the private class "ListNode"
    // we have 2 main variables (data, link)
    // the variables are (Objects) 
    private class ListNode{
        GenericType data; 
        ListNode link; // memery address in the ListNode 

        //create parametrized class  
        public ListNode(GenericType aData, ListNode aLink)
        {
            data = aData; 
            link = aLink; 
        }
    }

    // we create the pointers we need 
    // head, current, previous 
    private ListNode head; 
    private ListNode current; 
    private ListNode previous; 

    // add a new variable to control the size of the list, the size is an integer 
    private int size; 

    // default parameters 
    public GenLL()
    {
        head = current = previous = null; 
        this.size = 0; 
    }

    // we initially have an empty LinkedList, then we append data 
    // we create an add method to add data
    // the method is GenericType (Object)
    public void add(GenericType aData)
    {
        // we create a new instance of the list, then add the data, then append 
        ListNode addingNode = new ListNode(aData, null); 
        if(head == null)
        {
            // if the head is empty, we add the new point there 
            head = current = addingNode; 
            this.size = 1; 
            return; 
        }
        // if the head is not empty, it means we have data in the list 
        // we create a temp variable and loop through the data to reach to the end and add data 
        ListNode temp = head; 
        while(temp.link != null)
        {
            temp = temp.link; 
        }
        // once we are here, we know that we are at the end of the list 
        // we can add the node here 
        temp.link = addingNode; 
        // we increase the size 
        this.size++; 
    }
    // create a method to add after current 
    public void addAfterCurrent(GenericType aData)
    {
    // check if current exists 
    if(current == null)
    {
        return; 
    }
    
        ListNode addAfterCurrentNode = new ListNode(aData, current.link); 
        current.link = addAfterCurrentNode; 
        // .link is the memory address for the object (current)
    }
    
    // create class to get the current 
    public GenericType getCurrent()
    {
        if(current == null)
            return null; 
        return current.data; 
        // .data is the data on that memory address (current)
    }
    // create another method to set the current to a particular memory address 
    public void setCurrent(GenericType aData)
    {
        if(current == null)
            return; 
        current.data = aData; 
    }
    // go through the list 
    public void goNext()
    {
        if(current != null)
        {
            previous = current; 
            current = current.link; 
        }
    }
    public boolean hasMore()
    {
        return current != null; 
    }
    public void reset()
    {
        current = head; 
        previous = null; 
    }

    // create a remove method 
    // in remove current, we set the current to previous 
    // the delete the current 
    public void removeCurrent()
    {
        // check sure the current is in the middle 
        if(current != null && previous !=null)
        {
            previous.link = current.link; // we skip over where the current really is 
            current = current.link; // the current memory address is lost 
        }
        // if the current is the head 
        else if(current != null && previous == null)
        {
            head = head.link; // the memory address is at the head 
            current = head; // the current is removed and set to head 
        }
        if(this.size >0)
        size--; 
    }
    // write an accessor to the size 
    public int getSize()
        {
    
            // create 2 methods to access the info at a certain position 
            return this.size; 
        }


    //print method 
    public void print()
    {
        ListNode temp = head; 
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.link; 
        }
    }

    public GenericType getAt(int index)
    {
        if(index < 0 || index >= size ) // if the index is 0 or bigger than the size of the list 
            return null; 
        ListNode temp = head; 
        for(int i=0; i<index; i++)
        {
            temp = temp.link; 
        }
        // we set the size to the index of the current 
        return temp.data; 
    }

}
