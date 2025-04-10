# weatherconsolapp
Weather Console App (Java + OOP)

This is a simple Java-based console application that fetches and displays real-time weather data using the OpenWeatherMap API.

## Features
- Get current weather for any city
- Displays temperature and condition
- Handles invalid cities and API errors gracefully

## Technologies Used
- *Java*
- *org.json* for JSON parsing
- *OpenWeatherMap API*

## How It Works
1. The user provides a city name.
2. The app sends a request to OpenWeatherMap API.
3. JSON response is parsed and printed in a user-friendly format.

## OOP Concepts Used
- *Encapsulation*: Data like API key and URL are kept protected.
- *Inheritance*: WeatherApp extends BaseWeatherApp.
- *Polymorphism*: Used in method behavior between classes.
- *Abstraction*: Implementation details are hidden in reusable methods.

