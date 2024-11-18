package java.ru.aqua.example.access;


import java.nio.file.Path;
import java.ru.aqua.example.auth.Accessor;
import java.ru.aqua.example.system.FileSystem;

public abstract class FileAccess {
    private final FileSystem fileSystem;
    private final Accessor accessor;

    protected FileAccess(FileSystem fileSystem, Accessor accessor) {
        this.fileSystem = fileSystem;
        this.accessor = accessor;
    }

    protected final <T> T read(Path path, FileMapper<T> fileMapper) {
        lock(path, "Reading by '%s'".formatted(accessor));
        var result = fileSystem.read(path, accessor);
        unlock(path);
        return fileMapper.map(result);
    }

    protected final <T> void write(Path path, FileMapper<T> fileMapper, T content) {
        if (fileSystem.exists(path, accessor)) {
            delete(path);
        }
        fileSystem.create(path, accessor);
        lock(path, "Writing by '%s'".formatted(accessor));
        fileSystem.write(path, fileMapper.unmap(content), accessor);
        unlock(path);
    }


    protected void delete(Path path) {
        lock(path, "Deleting by '%s'".formatted(accessor));
        fileSystem.delete(path, accessor);
    }

    protected final void lock(Path path, String reason) {
        fileSystem.lock(path, reason, accessor);
    }

    protected final void unlock(Path path) {
        fileSystem.unlock(path, accessor);
    }
}
