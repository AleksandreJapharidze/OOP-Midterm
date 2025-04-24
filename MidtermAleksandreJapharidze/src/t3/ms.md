# Conference Management System

## Overview

The **Conference Management System (CMS)** is a Java-based application that allows users to manage a list of sessions in a conference. Each session consists of a title and a speaker. Users can add new sessions, remove existing ones, view all scheduled sessions, and search for sessions by title.

This project demonstrates basic object-oriented programming (OOP) concepts in Java such as class design, encapsulation, and list manipulation.

## Features

- Add a session with a title and speaker
- Remove a session from the schedule
- View all scheduled sessions
- **(New Feature)** Search for a session by its title

## Program Structure

- **`Session.java`**  
  Represents a single conference session.  
  Contains private fields for the session title and speaker, along with getter and setter methods.

- **`CMS.java`**  
  The core class that stores and manages a list of `Session` objects.  
  Contains methods for adding, removing, displaying, and searching sessions.

- **`Testing.java`**  
  A demonstration class containing the `main()` method.  
  Used to simulate the program's behavior and test its functionality.

## New Feature

A new method called `searchSessionByTitle(String title)` was added to the `CMS` class. This method allows users to check whether a session with a given title is scheduled. It improves usability by allowing quick lookups.

A new method was added to the CMS class to allow searching for a session by its title:

```java
/**
 * NEW FEATURE: Search for a session by its title.
 * This method returns true if a session with the given title exists in the schedule.
 */
public boolean searchSessionByTitle(String title) {
    for (Session s : schedule) {
        if (s.getTitle().equalsIgnoreCase(title)) {
            return true;
        }
    }
    return false;
}
