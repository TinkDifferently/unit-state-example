package java.ru.aqua.example.system;

import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.ru.aqua.example.auth.Accessor;

public class HardFileSystem implements FileSystem{

    @Override
    public ByteBuffer read(Path path, Accessor accessor) {
        return null;
    }

    @Override
    public void delete(Path path, Accessor accessor) {

    }

    @Override
    public void lock(Path path, String reason, Accessor owner) {

    }

    @Override
    public void unlock(Path path, Accessor accessor) {

    }

    @Override
    public void write(Path path, ByteBuffer byteBuffer, Accessor accessor) {

    }

    @Override
    public boolean exists(Path path, Accessor accessor) {
        return false;
    }

    @Override
    public void create(Path path, Accessor accessor) {

    }
}
