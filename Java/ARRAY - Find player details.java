//************************************************************************Main.java*************************************************************************************

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Player[] pobj=new Player[4];
        pobj[0]= new Player(146, "Athul",16, 9876543210l); 
        pobj[1] =new Player(135, "Rakshana", 16,9956231045l);
        pobj[2] =new Player(168, "Christy", 16,9856471230l);
        pobj[3] =new Player(194, "Athulya", 16,9768541230l);
        // Invoke the method findPlayerDetails ById in the
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id to be searched"); 
        int id=sc.nextInt();
        
        PlayerUtility p=new PlayerUtility();
        Player r=p.findPlayerDetailsById(pobj,id);
        if(r!=null){
            System.out.println("Name:"+r.getPlayerName());
            System.out.println("Phone number:"+r.getPhoneNumber());
            
        }
        else{
            System.out.println("No player found");
        }
    }
    
}










//**********************************************************************************Player.java**********************************************************************

public class Player {

    private int playerId;
    private String playerName;
    private int age;
    private long phoneNumber;
    public int getPlayerId() {
        return playerId;
    }
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Player(int playerId, String playerName, int age, long phoneNumber) {
        super();
        this.playerId = playerId;
        this.playerName = playerName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    
    
    
    
}




















//***********************************************************************PlayerUtility.java************************************************************************

public class PlayerUtility {
    public Player findPlayerDetailsById(Player[] arr, int playerIdToSearch)
    {
        for (int i=0;i<arr.length; i++) {
            if(arr[i].getPlayerId()==playerIdToSearch) {
                return arr[i];
            }
            
        }
        return null;
        
    }
    
}

