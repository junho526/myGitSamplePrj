package w3_3_objects;

import java.util.Objects;

public class MyObject {
    private int field1;
    private String field2;

    public MyObject(int field1, String field2) {

        this.field1 = field1;
        this.field2 = field2;

    }

    // constructors, getters, setters 생략

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        //내가만든코드보다 좋은 코드있다면 교체
        if (obj == null || getClass() != obj.getClass()) return false;
        MyObject myObject = (MyObject) obj;
        return field1 == myObject.field1 && Objects.equals(field2, myObject.field2);
    }

    @Override
    public int hashCode() {
        //헤시값 계산 기초가 되는 인춧을 변병하는 나만의 헤시코드 생성 가능
        return Objects.hash(field1, field2);
        //다양한 케이스에서 hashcode() 오버라이딩 가능
        //64bit 헤시코드 특정 객체에 적용하고 싶다
        // 헤시함수를 해서 헤시충돌이 덜나오거나 특정결고가가 나오는 방향으로 변경하고싶다.
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "field1=" + field1 +
                ", field2='" + field2 + '\'' +
                '}';
    }

    @Override
    protected MyObject clone() throws CloneNotSupportedException {
        // 복제 로직 추가
        return new MyObject(this.field1,this.field2);
    }

//    public static void main(String[] args) {
//        MyObject myObj1 = new MyObject();
//    }
}