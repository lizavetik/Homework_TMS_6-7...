final public class Cargo extends Ground{
    int loadCapacity;

    public Cargo(int power, int maxSpeed, int weight, String carBrand) {
        super(power, maxSpeed, weight, carBrand);
    }

    public void isWeightAvaliable(){
        //організовать ввод веса с клавіатуры
        float weight = 0.0f;
        if(weight <= this.weight ){
            System.out.println("Грузовик загружен");
        }else{
            System.out.println("Вам нужен грузовик побольше");
        }

    }

}
