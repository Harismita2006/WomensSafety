#include <WiFi.h>
#include <HTTPClient.h>

const char* ssid = "YourWiFi";
const char* password = "YourPassword";

const char* firebaseURL = "https://your-firebase-project.firebaseio.com/alerts.json";

#define PRESSURE_SENSOR A0
#define EMERGENCY_BUTTON 2

void setup() {
  Serial.begin(115200);
  WiFi.begin(ssid, password);
  pinMode(EMERGENCY_BUTTON, INPUT_PULLUP);
}

void loop() {
  int pressureValue = analogRead(PRESSURE_SENSOR);
  int buttonState = digitalRead(EMERGENCY_BUTTON);

  if (pressureValue > 700 || buttonState == LOW) {
    sendEmergencyAlert();
    delay(10000); // avoid spamming
  }
}

void sendEmergencyAlert() {
  if (WiFi.status() == WL_CONNECTED) {
    HTTPClient http;
    http.begin(firebaseURL);
    http.addHeader("Content-Type", "application/json");

    String jsonData = "{\"message\":\"Emergency Alert Triggered!\",\"location\":\"User’s GPS coordinates\"}";
    int httpResponseCode = http.POST(jsonData);

    Serial.println("Alert sent! Response code: " + String(httpResponseCode));
    http.end();
  }
}
