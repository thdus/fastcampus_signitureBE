package fc.java.model2;

import java.util.Arrays;

public class ObjectArray {
    private final int DEFAULT_CAPACITY=5; // 수정불가(fianl)=>상수
    private Object[] elements; // 다형성배열
    private int size=0;
    // 생성동작
    public ObjectArray(){
        //elements=new Object[DEFAULT_CAPACITY]; // 5개 크기 배열
        this(5); // this(5) : 생성자 안에서 다른 생성자를 호출할 때 사용
    }
    public ObjectArray(int capacity){
        elements=new Object[capacity]; // 원하는 크기의 배열을 생성한다.
    }
    // 저장하는 동작
    public void add(Object element){ // 다형성인수
        if(size==elements.length){
            // 크기를 2배로 늘리는 작업
            ensureCapacity();
        }
        // 크기 체크? if
        elements[size++]=element;
    }
    // 얻는 동작
    public Object get(int index){ // -1, 5~
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("index의 범위(0~4)가 초과됨"); // JVM
        }
        return elements[index];
    }
    // 원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }

    public void ensureCapacity(){
        int newCapacity=elements.length*2;
        elements=Arrays.copyOf(elements, newCapacity);

    }
}
