package java.ru.aqua.example.image;

import java.awt.*;
import java.awt.image.*;
import java.util.Vector;

public class RenderedImageImpl implements RenderedImage {
    @Override
    public Vector<RenderedImage> getSources() {
        return null;
    }

    @Override
    public Object getProperty(String s) {
        return null;
    }

    @Override
    public String[] getPropertyNames() {
        return new String[0];
    }

    @Override
    public ColorModel getColorModel() {
        return null;
    }

    @Override
    public SampleModel getSampleModel() {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getMinX() {
        return 0;
    }

    @Override
    public int getMinY() {
        return 0;
    }

    @Override
    public int getNumXTiles() {
        return 0;
    }

    @Override
    public int getNumYTiles() {
        return 0;
    }

    @Override
    public int getMinTileX() {
        return 0;
    }

    @Override
    public int getMinTileY() {
        return 0;
    }

    @Override
    public int getTileWidth() {
        return 0;
    }

    @Override
    public int getTileHeight() {
        return 0;
    }

    @Override
    public int getTileGridXOffset() {
        return 0;
    }

    @Override
    public int getTileGridYOffset() {
        return 0;
    }

    @Override
    public Raster getTile(int i, int i1) {
        return null;
    }

    @Override
    public Raster getData() {
        return null;
    }

    @Override
    public Raster getData(Rectangle rectangle) {
        return null;
    }

    @Override
    public WritableRaster copyData(WritableRaster writableRaster) {
        return null;
    }
}
