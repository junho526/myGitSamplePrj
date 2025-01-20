package w1_4_controllogics;

public class LoopSample {

    public static void main(String[] args) {
        int n =10;
        // ######## while #########
        // 탈출 조건 가능 여부와,
        // 탈출 조건 지연 요인 등을 고려해서 사용한다.
       /* while(n>0){
            n-=1; //n=n-1;
            System.out.println(n);
        }

        */

        // 선실행 후판단을 구현하는 방식으로
        //탈출 조건 달성 뿐 아니라
        //최소하늬 코드 실행을 제어하는 구문
        /*
        do {
            n -= 1; //n=n-1;
            System.out.println(n);
        }while (n>0);
         */


        // ######## for ########
        //1.기본 for문
        //횟수 기준 판단이 추가 되기 때문에
        //탈출 조건 만족을 검토하기가 비교적 좋다
        /*for (int i=0; i<5; i++){
            System.out.println(i);
        }

         */

        //2. 향상된 for문
        // 배열을 순회하기 때문에 종료 로직이 안전하며
        //배열 요소값을 돌고 매 회차 로직을 작성할수있어서 편리
        int[] arrayA = {1,2,3,4,5};

        for(int aa: arrayA){
            if (aa==3){
                //continue;
                //break;
                //return; //제어문에는 부적절, 메서스 종료및 탈출, 값 변환시 사용
            }
            System.out.println(aa);
            /*for (int i=0; i<5; i++){
                System.out.println(i);
            }
             */
        }
    }
}
