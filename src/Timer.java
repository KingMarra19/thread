public class Timer extends Thread{
    int i;
    Gui g;

    public Timer(Gui g){
        i=0;
        this.g=g;
    }

    @Override
    public void run() {
        while(g.getB()){
            i++;
            g.getLabel().setText(String.valueOf(i));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
