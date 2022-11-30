public class  Phone {
    private String name;
    private String model;
    private String color;
    private int ram;
    private int storage;

    public String getName(){
        return name ;
    }
    public void  setName(){
         name =name;
    }
    public String getModel(){
        return model ;
    }
    public  void setModel(){
        model =model;
    }
    public String getColor(){
        return color ;
    }

    public void setColor() {
        color = color;
    }
    public int getRam(){
        return ram;
    }

    public void setRam(int ram) {
       this.ram = ram;
    }
    public int getStorage(){
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public Phone(String name, String model, String color, int ram, int storage) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.storage = storage;

    }
    public String toString() {

        return "MobilePhone -" +name+",model-"+model +",color-"+color+
                ",ram-"+ram+",storage"+storage+".";


    }


}
