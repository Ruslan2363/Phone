public class SamsungPhone extends Phone implements PhoneConnection,PhoneMedia {
    private String numSamsung;

    public String getNumSamsung() {
        return numSamsung;
    }

    public void setNumSamsung(String numSamsung) {
        this.numSamsung = numSamsung;
    }

    public SamsungPhone(String name, String model, String color, int ram, int storage) {
        super(name, model, color, ram, storage);
        this.numSamsung=numSamsung;
    }

    @Override
    public void call() {
        System.out.println( numSamsung+"Телефонуємо");
    }

    @Override
    public void sendMassage() {
        System.out.println( numSamsung+"Надсилаємо");

    }

    @Override
    public void photo() {
        System.out.println(numSamsung+"Foto");

    }

    @Override
    public void video() {
        System.out.println(numSamsung+"Video");

    }
}
