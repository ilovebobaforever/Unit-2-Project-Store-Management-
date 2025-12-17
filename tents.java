public class tents extends campingGear {

// setting the values

  
private String tentSize;

public tents(){

  tentSize = " Large ";
}
// constructors with parameters in it for the tent size

  
public tents(String tentSize){
  this.tentSize = tentSize;
}

// getter methods for the tent sizd
  
public String getTentSize(){
  return tentSize;
}

// mutator/setter methods that sets the tent size to the tent 
  
public void setTentSize(){
  this.tentSize = tentSize;
}
// override to put in the actual values of the tent size
public String toString(){

return "Tentsize: " + tentSize;



}

} 