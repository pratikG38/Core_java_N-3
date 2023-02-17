// Driver class 
package org.tnsif.ThreadDemo;
public class SenderExecutor
{ 
  public static void main(String args[]) 
  { 
    Sender sender = new Sender(); 
    SendUsingThreads sender1 = new SendUsingThreads( "Pratik" , sender);
    SendUsingThreads sender2 =  new SendUsingThreads( "Welcome TO MET ", sender);

    // Start two threads of SendUsingThreads type 
    sender1.start(); 
    sender2.start(); 
    // wait for threads to end 
    try
    { 
      sender1.join(); 
      sender2.join(); 
    } 
    catch(Exception e) 
    { 
      System.out.println("Interrupted"); 
    } 
  

  }
}
