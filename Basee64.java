package src;

import java.util.Base64;

public class Basee64 {

    public static void main(String[] args) {
        String encryptedClientId = "your_encrypted_client_id";
        String jwtSecretKey = "your_jwt_secret_key";
        long epoch = System.currentTimeMillis() / 1000; // Current Epoch time in seconds

        String dataToEncode = encryptedClientId + ":" + jwtSecretKey + ":" + epoch;

        // Encode the string using Base64
        String base64EncodedString = Base64.getEncoder().encodeToString(dataToEncode.getBytes());

        System.out.println("Base64 Encoded String: " + base64EncodedString);
    }
}


