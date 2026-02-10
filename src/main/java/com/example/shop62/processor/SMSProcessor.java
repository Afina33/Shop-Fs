package com.example.shop62.processor;

import com.example.shop62.service.SMS.SMSServiceInterface;

public class SMSProcessor {
    private  final SMSServiceInterface smsServiceInterface;

    public SMSProcessor(SMSServiceInterface smsServiceInterface){
        this.smsServiceInterface = smsServiceInterface;
        System.out.println("SMS: " + smsServiceInterface.getClass().getSimpleName());
    }
    public  void  processSMS(String sms, String recopoent){
        System.out.println("\n=== Processing SMS ===");
        smsServiceInterface.sendSMS(sms, recopoent);
        System.out.println("\n=== SMS Processed ===\n");
    }
}
