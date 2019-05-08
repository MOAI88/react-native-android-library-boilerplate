## React Native Send SMS Module
This module sends SMS to your react-native project. (Only android)
It sends sms to the background of the application, instead of popping the sms application up.

이 프로젝트는 리엑트네이티브를 통하여 sms를 전송할 수 있게 해준다. (only android)
sms를 보낼 때 새로운 창이 popup되는 형식이 아닌 뒷 단에서 보낼 수 있게 해준다.

## Getting started
1. npm install --save send-android-sms
2. react-native link send-android-sms
3. PROFIT!!!

## How To Use

    import SendAndroidSMS from 'send-android-sms';

    SendAndroidSMS.sendMessage("Message", "PhoneNumber", () => { console.log("it's work! :)"); }, (error) => {console.log("occured error... :(")} );

## Caution

_This module is only work for android!!_
