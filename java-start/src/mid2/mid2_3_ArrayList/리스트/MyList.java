package mid2.mid2_3_ArrayList.리스트;

public interface MyList<E> {
    int size();
    void add(E e);
    void add(int index, E e);
    E get(int index);
    E set(int index, E e); // 기존값 반환.
    E remove(int index); // 기존값 반환.
    int indexOf(E e);


}
