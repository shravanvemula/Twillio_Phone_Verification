package com.example.twillio;
import com.twilio.Twilio;
import com.twilio.rest.verify.v2.service.Verification;

public class SendToken {
    // Find your Account Sid and Token at twilio.com/console
    // DANGER! This is insecure. See http://twil.io/secure
    public static final String ACCOUNT_SID = "ACeffc570395fa34c1f322f187752727d8";
    public static final String AUTH_TOKEN = "27cbf5058c5cf69e6d726ba8bae5aff5";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Verification verification = Verification.creator(
                "VAd10bde58117cd0214c68d5860de835dd",
                "+919908338102",
                "sms")
                .create();

        System.out.println(verification.getStatus());
    }
}