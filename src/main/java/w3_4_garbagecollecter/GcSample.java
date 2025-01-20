package w3_4_garbagecollecter;

import java.lang.ref.WeakReference;

public class GcSample {
    public static void main(String[] args) {
        //1. 강한참조(기본참조)로 객체생성
        ResourceHolder obj = new ResourceHolder(1);
        //2.약한참조로 객체연결
        WeakReference<ResourceHolder> weakRef = new WeakReference<>(obj);
        //3.강한참조 연결해제
        obj = null; // obj를 null로 설정하여 참조를 해제
        //4.생성되었던 heap메모리상의 객체를 gc강제호출로 수거
        System.out.println(weakRef.get());
        System.gc();
        //수거되는 동작을 sleep반복문으로 기다림
        for (int i=0; i<10; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(weakRef.get());
    }
}
