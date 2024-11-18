package java.ru.aqua.example.access;

import java.nio.ByteBuffer;

public interface FileMapper<T> {

    ByteBuffer unmap(T t);

    T map(ByteBuffer byteBuffer);
}
