

import java.util.*;
interface Vehicle{
void noofwheels();
}
class Car implements Vehicle{
public  void noofwheels(){
System.out.println("4 wheels");
}
}
class Bus implements Vehicle{
public void noofwheels(){
System.out.println("6 wheels");
}
}
class Auto implements Vehicle{
public void noofwheels(){
System.out.println("3 wheels");
}
}
class testinterface{
public static void main(String args[]){
Car c1=new Car();
c1.noofwheels();
Bus b1=new Bus();
b1.noofwheels();
Auto a1=new Auto();
a1.noofwheels();
}
}
