package java.ru.aqua.example.image;

import java.awt.image.RenderedImage;
import java.nio.ByteBuffer;
import java.ru.aqua.example.access.FileMapper;

public class ImageFileMapper implements FileMapper<RenderedImage> {
    @Override
    public ByteBuffer unmap(RenderedImage image) {
        return null;
    }

    @Override
    public RenderedImage map(ByteBuffer byteBuffer) {
        return null;
    }
}
