public class MotorBoat {
    boolean on_engine ;
    boolean off_engine;


    public void statusEngine(){
        on_engine = true;
    }
    public void start_engine(){
        on_engine = false;
        if (on_engine = false){
            off_engine = true;
            System.out.printf("звуки тарахтения");
        }
    }
}
