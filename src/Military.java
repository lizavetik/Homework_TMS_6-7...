final public class Military extends Air{
    boolean isEjectionSystemAvaliable = true;
    int numberOfMissiles = 0;

    public Military(int power, int maxSpeed, int weight, String carBrand) {
        super(power, maxSpeed, weight, carBrand);
    }

    public void Shot(){

        if(numberOfMissiles!=0){
         System.out.println("The rocket went");
         numberOfMissiles--;
        }
        else{System.out.println("Ammunition is missing");}
    }

    public void Ejection(){
        if(isEjectionSystemAvaliable == true){
            System.out.println("The ejection was successful");
        }else{
            System.out.println("You don't have such a system. RIP!");
        }
    }
}
