package src.prep_extra;


import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import java.util.Base64;

public class RSAEncryptor {

    // Method to encrypt data using RSA
    public static String encrypt(String plainData, String publicKeyStr) throws Exception {
        // Decode Base64 encoded public key
        byte[] publicKeyBytes = Base64.getDecoder().decode(publicKeyStr);

//        byte[] pu

        // Create PublicKey object from the decoded bytes
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKeyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(keySpec);

        // Initialize Cipher for encryption
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        // Encrypt the data
        byte[] encryptedBytes = cipher.doFinal(plainData.getBytes());

        // Encode the encrypted bytes to Base64
        String encryptedData = Base64.getEncoder().encodeToString(encryptedBytes);

        return encryptedData;
    }

    public static void main(String[] args) throws Exception {
        // Example usage
        String plainData = "Hello, world!";
        String publicKeyStr = "base64_encoded_public_key_here";

        String encryptedData = encrypt(plainData, publicKeyStr);
        System.out.println("Encrypted data: " + encryptedData);
    }
}


