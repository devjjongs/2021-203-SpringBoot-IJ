package generics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
//@RequiredArgsConstructor
@AllArgsConstructor
public class CodeMap<K, V> {
    private K key;
    private V value;

    public void put(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V get(K key) throws Exception {
        if (this.key == key) return value;
        else throw new Exception("원하는 데이터가 없다.");
    }

    public static <K, V> boolean valueCompare(CodeMap<K, V> c1, CodeMap<K, V> c2) { // static <K, V> : <K,V>를 static하게 설정
        return c1.value.equals(c2.value);   //  자기 자신의 클래스 이기 떄문에 getValue 사용 안함
    }
}
