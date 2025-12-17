public class waterbottle extends campingGear{

//setting the values 

  
private int waterbottleCount;
  
public waterbottle(){

  waterbottleCount = 30;
}
// setting up values for water bottle
public waterbottle(int waterbottleCount){
  this.waterbottleCount = waterbottleCount;
}
// accessor methods, getting watterbottle count of the quantity 
public int getWaterbottleCount(){
  return waterbottleCount;
}
// mutator methods, setting waterbottle count
public void setWaterbottleCount(int waterbottleCount){
  this.waterbottleCount = waterbottleCount;
}
// toString override, printing information
public String toString(){

return "Waterbottle Counts: " + waterbottleCount;

}  
}