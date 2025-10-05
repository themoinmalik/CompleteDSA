package src;


import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class DocuSignOAuthToken {
    public static void main(String[] args) throws Exception {
        String code = "aEJygiydwlve1sTHk5lZftUVHee1yHB-YxtRrEdsmM0i1xeR5KYqgaWz6Uy3cXE5Ru6yEq5JnXB2tce_BNnb6iV0uGCm4V3PndQIv4KAIK4r4kL071NNeuTqQmAF5ZC-PJ60w";
        String clientId = "71d362f0-ce18-4d0b-93bf-8fa22a10e040";
        String clientSecret = "e5acea95-5c6a-4ae0-88f1-33efb61daba7";
        String redirectUri = "http://localhost/";

        String urlParameters =
                "grant_type=authorization_code"
                        + "&code=" + URLEncoder.encode(code, "UTF-8")
                        + "&client_id=" + URLEncoder.encode(clientId, "UTF-8")
                        + "&client_secret=" + URLEncoder.encode(clientSecret, "UTF-8")
                        + "&redirect_uri=" + URLEncoder.encode(redirectUri, "UTF-8");

        URL url = new URL("https://account.docusign.com/oauth/token");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        con.setDoOutput(true);

        try (DataOutputStream out = new DataOutputStream(con.getOutputStream())) {
            out.write(urlParameters.getBytes(StandardCharsets.UTF_8));
        }

        int status = con.getResponseCode();
        InputStream is = (status < 400) ? con.getInputStream() : con.getErrorStream();
        BufferedReader in = new BufferedReader(new InputStreamReader(is));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        // Show result (contains access_token, refresh_token, etc.)
        System.out.println("Response: " + content.toString());
    }
}
