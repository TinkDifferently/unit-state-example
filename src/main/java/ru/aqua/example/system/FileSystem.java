package java.ru.aqua.example.system;

import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.ru.aqua.example.auth.Accessor;

public interface FileSystem {
    ByteBuffer read(Path path, Accessor accessor);

    void delete(Path path, Accessor accessor);

    void lock(Path path, String reason, Accessor owner);

    void unlock(Path path, Accessor accessor);

    void write(Path path, ByteBuffer byteBuffer, Accessor accessor);

    boolean exists(Path path, Accessor accessor);

    void create(Path path, Accessor accessor);
}
