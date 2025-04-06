# WomensSafety

SAFE SHOE: A Smart Women’s Safety System
      SAFE SHOE is an AI-powered smart shoe system that combines IoT sensors, mobile application, emergency alerts, and Gemini AI integration to provide a proactive and real-time safety solution for women.

TEAM MEMBERS
Akshaya N

Harismita B

Riyas Rahman A

OBJECTIVE
      The objective of this project is to design and develop an AI-integrated smart wearable (shoe) for women that can detect emergencies using pressure and button sensors, and instantly send alerts to contacts and nearby patrols, along with real-time location tracking and Gemini-generated safety tips.

FUNCTIONALITY
      Our system offers the following features:
      
      Emergency Detection: Tracks pressure and button triggers to identify distress.
      
      Real-Time Alerts: Sends alert messages to emergency contacts and nearby patrols.
      
      Geo-Zone Mapping: Displays green (safe) and red (unsafe/crime-prone) zones.
      
      Live Location Tracking: Shows current GPS location of the user in real-time.
      
      Community Support: Enables communication among users for collective safety.
      
      Safety Tips: Gemini AI generates personalized safety recommendations.
      
      Safety Product Store: Displays safety-related tools and kits for purchase.

USER FLOW
      Login/Registration: Users log in securely through the mobile app.
      
      Sensor Monitoring: Shoe continuously checks for high pressure or emergency button press.
      
      Alert Trigger: On detecting threat, an alert is sent via Firebase to the app.
      
      Live Tracking: The app shows live location and alert details to contacts and authorities.
      
      AI Safety Tips: Gemini API suggests actionable safety measures.

TECH STACKS USED
  HARDWARE
    Pressure Sensor
    
    Emergency Button
    
    ESP32 Microcontroller
    
    GPS Module

  BACKEND
    Firebase Realtime Database – For storing and broadcasting alerts.
    
    Gemini API (Google AI) – For smart alert message generation and safety tips.

  FRONTEND
    Android App using Kotlin & XML – User interface and functionality.

  Google Maps SDK – For live location tracking and zone mapping.

FILE STRUCTURE

smart-shoe/
│

├── hardware/

│   └── esp32_code/

│       ├── main.ino

│       └── firebase_config.h

│

├── android-app/

│   ├── app/

│   │   ├── src/

│   │   │   ├── main/

│   │   │   │   ├── java/

│   │   │   │   │   └── com.example.safeshoe/

│   │   │   │   │       ├── MainActivity.kt

│   │   │   │   │       ├── AlertListener.kt

│   │   │   │   │       └── GeminiHelper.kt

│   │   │   │   ├── res/

│   │   │   │   │   └── layout/

│   │   │   │   │       └── activity_main.xml

│   │   │   │   └── AndroidManifest.xml

│   └── build.gradle

│

├── images/

│   ├── architecture_diagram.png

│   └── prototype_snapshots.png

│

├── README.md


REFERENCES

https://firebase.google.com/docs

https://ai.google.dev/

https://developer.android.com/

https://www.arduino.cc/

https://mapsplatform.google.com/


