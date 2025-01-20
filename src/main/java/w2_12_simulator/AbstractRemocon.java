package w2_12_simulator;

abstract class AbstractRemocon implements RemoconInterface {
    @Override
    public void remoconMethod() {
        System.out.println("리모컨 실행중");
    }
    public abstract void reactCommand();
}