class Chick implements Animal {     
     private String myType;     
     private String mySound; 
     private String mySound1; 
     public Chick(String type, String sound, String sound1)     {         
         myType = type;         
         mySound = sound;  
         mySound1 = sound1;
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";   
         mySound1 = "unknown"; 
     }      
     public String getSound(){return mySound+" "+mySound1;}     
     public String getType(){return myType;} 
}
