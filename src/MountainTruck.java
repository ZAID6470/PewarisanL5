public class MountainTruck extends Truck
{
    public int seatHeight;
    public MountainTruck (int startHeight, int startCadence, int startGear, int startSpeed)
    {
        super (startCadence, startGear, startSpeed);
        seatHeight = startHeight;
    }
    
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
    
   public static void main(String[] aku)
   {
       System.out.println("mulai berjalan");
       MountainTruck MB = new MountainTruck(0,0,0,0);
       System.out.println("gear="+MB.gear);
       System.out.println("speed="+MB.speed);
       MB.setGear(2);
       MB.speedUp(2);
       System.out.println("gear="+MB.gear);
       System.out.println("speed="+MB.speed);
       MB.speedUp(2);
       System.out.println("gear="+MB.gear);
       System.out.println("speed="+MB.speed);
   }
}
