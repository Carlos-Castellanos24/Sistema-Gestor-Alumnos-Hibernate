package mx.com.gm.helper;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 {

    public static String getMd5(String password) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] encriptacionBytes = md.digest(password.getBytes());
        BigInteger numero = new BigInteger(1, encriptacionBytes);
        String encriptacionString = numero.toString(16);

        while (encriptacionString.length() < 32) {

            encriptacionString = "0" + encriptacionString;
        }

        return encriptacionString;
    }
}
