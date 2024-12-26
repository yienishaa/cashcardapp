# Student Shift Scheduler

## Overview
This project implements a **Student Shift Scheduling System** that allows users to manage student work schedules effectively. It provides functionalities to add students and their availability, define shifts, and automatically assign students to shifts based on their availability.

---

## Features
- **Student Management**: Add, update, and view student details.
- **Availability Tracking**: Record each student's availability for specific shifts.
- **Shift Management**: Define and manage multiple shifts in a day.
- **Automatic Scheduling**: Assign students to available shifts based on their availability.
- **Flexible Configuration**: Easily configure the number of shifts and working hours.

---

## System Architecture
The system consists of the following main components:

1. **Student Table**:
   - Stores student details such as name, ID, and availability.
2. **Shift Table**:
   - Maintains predefined shifts for each day.
3. **Scheduling Class**:
   - Implements the scheduling logic to assign students to shifts based on availability.

---

## How It Works
1. **Add Students**:
   - Input student details and their available shifts.
2. **Define Shifts**:
   - Set up shifts (e.g., Morning, Afternoon, Evening, and Night).
3. **Schedule Generation**:
   - The scheduling algorithm iterates through the list of students and assigns them to shifts.

---

## Installation
1. **Clone the Repository**:
```bash
 git clone https://github.com/your-repo/student-shift-scheduler.git
```
2. **Install Dependencies**:
```bash
 pip install -r requirements.txt
```
3. **Run the Application**:
```bash
 python main.py
```

---

## Usage
1. Add students and their availability using the input prompts or configuration files.
2. Define shifts in the database or configuration.
3. Run the scheduler to generate the assignments.
4. View or export the schedule as needed.

---

## Configuration
### Shift Setup
Edit the `shifts.json` or database table to define the number and timing of shifts:
```json
[
  {"id": 1, "name": "Morning", "start_time": "08:00", "end_time": "12:00"},
  {"id": 2, "name": "Afternoon", "start_time": "12:00", "end_time": "16:00"},
  {"id": 3, "name": "Evening", "start_time": "16:00", "end_time": "20:00"},
  {"id": 4, "name": "Night", "start_time": "20:00", "end_time": "00:00"}
]
```

---

## Example
Sample input data for students and shifts:
```python
students = [
    {"id": 1, "name": "Alice", "availability": [1, 2]},
    {"id": 2, "name": "Bob", "availability": [3, 4]},
    {"id": 3, "name": "Charlie", "availability": [1, 3]}
]
```

Output schedule:
```python
assignments = {
    "Morning": ["Alice", "Charlie"],
    "Afternoon": ["Alice"],
    "Evening": ["Bob", "Charlie"],
    "Night": ["Bob"]
}
```

---

## Future Enhancements
- Implement shift prioritization based on student preferences.
- Add export options (e.g., CSV, Excel).
- Integrate a web interface for easier management.
- Include notifications for shift reminders.

---

## Contributing
Contributions are welcome! Please submit a pull request or open an issue for suggestions or bug reports.

---

## License
This project is licensed under the [MIT License](LICENSE).

---

## Contact
For questions or support, reach out via email at [contact@example.com](mailto:contact@example.com).

