package java.ru.aqua.example;


import java.nio.file.Path;
import java.ru.aqua.example.auth.AuthService;
import java.ru.aqua.example.image.RenderedImageImpl;
import java.ru.aqua.example.system.HardFileSystem;
import java.ru.aqua.example.system.VirtualFileSystem;

public class StateExample {

    AuthService service;

    public void testHard() {
        var imageAccess = new ImageFileAccess(new HardFileSystem(), service.auth("fake"));
        imageAccess.writeImage(Path.of("fake-path"), new RenderedImageImpl());
    }

    public void testVirtual() {
        var imageAccess = new ImageFileAccess(new VirtualFileSystem(), service.auth("fake"));
        imageAccess.writeImage(Path.of("fake-path"), new RenderedImageImpl());
    }

    public void testBrokenHard() {
        var imageAccess = new BrokenImageFileAccess(new HardFileSystem(), service.auth("fake"));
        imageAccess.writeImage(Path.of("fake-path"), new RenderedImageImpl());
    }

    public void testBrokenVirtual() {
        var imageAccess = new BrokenImageFileAccess(new VirtualFileSystem(), service.auth("fake"));
        imageAccess.writeImage(Path.of("fake-path"), new RenderedImageImpl());
    }
}
