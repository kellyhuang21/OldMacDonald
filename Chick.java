class Chick implements Animal {     
     private String myType;     
     private String mySound;      
     public Chick(String type, String sound, String sound1)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Chick()     {         
         myType = "unknown";         
         mySound = "unknown";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}