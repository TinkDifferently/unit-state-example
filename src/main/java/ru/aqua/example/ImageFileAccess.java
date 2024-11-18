package java.ru.aqua.example;

import java.awt.image.RenderedImage;
import java.nio.file.Path;
import java.ru.aqua.example.access.FileAccess;
import java.ru.aqua.example.auth.Accessor;
import java.ru.aqua.example.image.ImageFileMapper;
import java.ru.aqua.example.system.FileSystem;

public class ImageFileAccess extends FileAccess {

    private final ImageFileMapper toImageFileMapper = new ImageFileMapper();

    public ImageFileAccess(FileSystem fileSystem, Accessor accessor) {
        super(fileSystem, accessor);
    }

    public RenderedImage getImage(Path path) {
        return read(path, toImageFileMapper);
    }

    public void writeImage(Path path, RenderedImage image){

    }
}
