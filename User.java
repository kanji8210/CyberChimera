package CyberChimera.Utiliseteurs;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * User
 */
public class User {

    String nom;
    String prenom;
    String email;
    String password;

    // constructor
    public User(String nom, String prenom, String email, String password) {
        this.nom = nom;
        this.email = email;
        this.password = hashPassword(password);
    }

    // hash password
    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA 256");
            byte[] hashBytes = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            // Convert to hexdecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte hashByte : hashBytes) {
                String hex = Integer.toHexString(0Xff & hashByte);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

}