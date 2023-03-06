final public class Civil extends Air{
    int passsengersQuantity = 0;
    boolean isBusinrssClassAvaliable = true;

    public Civil(int power, int maxSpeed, int weight, String carBrand) {
        super(power, maxSpeed, weight, carBrand);
    }

    public void isPasNumAvaliable(){
        //організовать ввод веса с клавіатуры
        float weight = 0.0f;
        if(weight <= this.weight ){
            System.out.println("Грузовик загружен");
        }else{
            System.out.println("Вам нужен грузовик побольше");
        }

    }

}
