<img width="3882" height="1088" alt="Gemini_Generated_Image_sc7p4sc7p4sc7p4s" src="https://github.com/user-attachments/assets/e56bfd9e-fd0d-4872-9213-58e4b4fcd461" />

# EcoPoints-Recycling-Tracker
This Porject basically developed an Console based Application for CityCouncil hired Eusha to develop Build a small system that encourages households to recycle.

## 🧱 Task 1: Domain Model & Core Classes

In this first milestone, the foundation of the object-oriented tracking system is established by defining two primary blueprint classes: `RecyclingEvent` and `Household`. Both classes follow encapsulation principles and implement serialization for persistence.

---

### 1. `RecyclingEvent.java`
Represents an individual recycling activity logged by a household.

* **Attributes:**
  * `materialType` (`String`): Category of the recycled material (e.g., plastic, glass, metal, paper).
  * `weight` (`double`): Weight in kilograms.
  * `date` (`LocalDate`): Date of the recycling transaction (defaults to the current date).
  * `ecoPoints` (`double`): Reward points earned (calculated automatically as 10 points per kg).
* **Key Features:**
  * Data encapsulation using `private` fields with `public` getters.
  * `Serializable` interface implementation to allow byte-stream storage.
  * Custom `toString()` method for clean console presentation.

---

### 2. `Household.java`
Represents a participating household entity enrolled in the municipal EcoPoints program.

* **Attributes:**
  * `id` (`String`): Unique identifier for the household.
  * `name` (`String`): Registered household/resident name.
  * `address` (`String`): Residential street address.
  * `joinDate` (`LocalDate`): Enrollment date (auto-assigned via `LocalDate.now()`).
  * `events` (`List<RecyclingEvent>`): Collection holding all historical recycling logs for this household.
  * `totalPoints` (`double`): Cumulative points balance accumulated across all events.
* **Key Methods:**
  * `addEvent(RecyclingEvent event)`: Appends an event to the internal collection and increments the cumulative `totalPoints`.
  * `getTotalWeight()`: Aggregates and calculates the total kilograms recycled across all associated events.
  * Full encapsulation with getter methods for read-only external access.
