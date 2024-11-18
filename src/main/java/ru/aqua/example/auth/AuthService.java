package java.ru.aqua.example.auth;

public interface AuthService {
    Accessor auth(String token);
}
