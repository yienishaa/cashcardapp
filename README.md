# Student Shift Scheduler

## Overview
This project implements a **Student Shift Scheduling System** that allows users to manage student work schedules effectively. It provides functionalities to add students and their availability, define shifts, and automatically assign students to shifts based on their availability.

---

## Features
- **Student Management**: Add, delete, and view student details.
- **Availability Tracking**: Record each student's availability for specific shifts.
- **Shift Management**: Define multiple shifts in a day.
- **Scheduling**: Assign students to available shifts based on their availability.

---

## System Architecture
The system consists of the following main components:

1. **Student Table**:
   - Stores student details such as name, student ID, and phone number.
2. **Shift Table**:
   - Maintains predefined shifts for each day.
3. **Scheduling Class**:
   - Implements the scheduling logic to assign students to shifts based on availability.

---

## How It Works
0. **Define Shifts**:
   - Set up shifts using LoadInitialData  (e.g., MONDAY0830, TUESDAY1200).
1. **Add Students**:
   - Input student details.
1. **Add Availabilities**:
   - Input availability for each student.
2. **Schedule Generation**:
   - The scheduling algorithm iterates through the list of students and assigns them to shifts randomly

---

---

## Configuration
### Shift Setup
Edit the `LoadInitialData.java` or database table to define the number and timing of shifts:
```java
[
   shiftRepository.save(new ShiftsEntity("MONDAY0830", 3.5));
   shiftRepository.save(new ShiftsEntity("MONDAY1200", 3.0));
   shiftRepository.save(new ShiftsEntity("MONDAY1500", 3.0));
   shiftRepository.save(new ShiftsEntity("MONDAY1800", 3.0));
]
```

---

## Example
Sample input data for students and shifts:
```json
{
    "studentID" : "5678",
    "name" : "Anne",
    "phone_number" : "234332",
    "hours_allowed" : 3.9
}

{
    "studentId" : 
    {
        "id" : 1,
        "studentID" : "5678"
    },
    "shiftId" : 
    {
        "shiftId" : 3
    }
}
```

Output schedule:
```json
[
    {
        "scheduleId": 1,
        "weekId": "52",
        "availabilityEntity": [
            {
                "availabilityId": 3,
                "studentId": {
                    "studentID": "1234",
                    "name": "Marry",
                    "id": 1,
                    "phone_number": "097888",
                    "hours_allowed": 30.9
                },
                "shiftId": {
                    "shiftId": 3,
                    "shiftDescription": "MONDAY1500",
                    "hours": 3.0
                },
                "scheduleId": null
            }
        ]
    }
]
```

---

## Future Enhancements
- Implement shift prioritization based on student preferences.
- Integrate a web interface for easier management.
- Include notifications for shift reminders.

---

