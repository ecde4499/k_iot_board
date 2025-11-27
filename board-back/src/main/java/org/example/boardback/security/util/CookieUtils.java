package org.example.boardback.security.util;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseCookie;

import java.util.Arrays;
import java.util.Optional;

public class CookieUtils {
    public static Optional<Cookie> getCookie(HttpServletRequest request, String name) {
        if (request.getCookies() == null) return Optional.empty();

        return Arrays.stream(request.getCookies())
                .filter(cookie -> cookie.getName().equals(name))
                .findFirst();
    }

    public static void addHttpOnlyCookie(
<<<<<<< HEAD
        HttpServletResponse response,
        String name,
        String value,
        int maxAge,
        boolean secure
=======
            HttpServletResponse response,
            String name,
            String value,
            int maxAge,
            boolean secure
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
    ) {
        ResponseCookie cookie = ResponseCookie.from(name, value)
                .httpOnly(true)
                .secure(secure)
                .sameSite("Lax")
                .path("/")
                .maxAge(maxAge)
                .build();
        response.addHeader("Set-Cookie", cookie.toString());
    }

    public static void deleteCookie(HttpServletResponse response, String name) {
        ResponseCookie cookie = ResponseCookie.from(name, "")
                .httpOnly(true)
                .secure(false)
                .sameSite("Lax")
                .path("/")
                .maxAge(0)
                .build();
        response.addHeader("Set-Cookie", cookie.toString());
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> a013a0241d4baf24e9419fc9fc515a716664b11f
