// Khairul Islam
// 09/18/2020
// CptS 233
// PA #1 - Benchmarking a LinkedList
// Credit: https://courses.cs.washington.edu/courses/cse143/19au/index.shtml

public class LinkedIntList {
   private ListNode front;   // reference to front node in list (null if empty)
    
   // Constructs a new empty list.
   public LinkedIntList() {
      front = null;
   }
    
   // Adds the given value into the proper place to maintain sorted order.
   // Precondition: existing elements are sorted
   public void putSorted(int value) {
      if (front == null || value < front.data) {
         // add(0, value);
         ListNode newNode = new ListNode(value, front);
         front = newNode;
      } else {
         ListNode current = front;
         while (current.next != null && current.next.data < value) {
            current = current.next;
         }
         ListNode newNode = new ListNode(value, current.next);
         current.next = newNode;
      }
   }
   
   // Get the max value from the list
   public int getMax() {
      if (front == null) {
         return 0;
      }
      ListNode current = front;
      while (current.next != null) {
         current = current.next;
      }
      return current.data;
   }
   
   // Get the median value from the list
   public int getMed(int size) {
      ListNode current = front;
      for (int i = 0; i < (size / 2); i++) { 
         current = current.next;
      }
      return current.data;
   }
   
   // Get the minimum value from the list
   public int getMin() {
      if (front == null) {
         return 0;
      }
      return front.data;
   }
   
   // Get the total size of the list
   public int getSize() {
      ListNode current = front;
      int count = 0;
      while (current.next != null) {
         count++;
         current = current.next;
      }
      return count;
   }
    
   // Returns a String representation of the list, such as "[42, -3, 17]".
   public String toString() {
      if (front == null) {
         return "[]";
      } else {
         String result = "[" + front.data;
         ListNode current = front.next;
         while (current != null) {
            result += ", " + current.data;
            current = current.next;
         }
         result += "]";
         return result;
      }
   }
}