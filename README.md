# my-java-journey

A topic-oriented personal Java learning archive documenting my programming progress through hands-on practice, concept exploration, and problem-solving exercises.

Rather than following a course sequence, this repository is organized by core computer science and Java language topics—ranging from basic syntax and control flow to object-oriented architecture, data processing, and algorithms.

---

## Repository Structure

Each topic is contained within a numbered top-level directory. Exercises within each topic are isolated in their own subfolders, containing all required Java source files and data assets:

```text
my-java-journey/
├── README.md
├── .gitignore
├── 01-java-fundamentals/              # Program structure, standard printing, syntax
├── 02-variables-and-user-input/       # Data types, variable assignment, Scanner input
├── 03-operators-and-expressions/      # Arithmetic, formulas, mathematical calculations
├── 04-conditional-statements/         # Decision-making, boolean logic, branching
├── 05-loops-and-control-flow/         # While/for loops, sentinels, accumulators
├── 06-methods/                        # Static methods, parameters, return values, call stack
├── 07-arrays/                         # Fixed-size arrays, indexing, traversal, swapping
├── 08-lists-and-collections/          # ArrayList, dynamic lists, LIFO stack, dictionary
├── 09-strings-and-text-processing/    # String methods, tokenization (split), CSV lines
├── 10-object-oriented-programming/    # Classes, encapsulation, composition, immutability
├── 11-file-io-and-exception-handling/ # File reading, try-catch, runtime exceptions
├── 12-algorithms-and-problem-solving/ # Sorting, searching, multi-class console apps
└── 13-unit-testing/                   # Automated unit testing with JUnit assertions
```

---

## Topics Overview

1. **Java Fundamentals**: Entry-point methods (`main`), console output (`System.out.println`), statement sequencing, and code formatting/indentation.
2. **Variables and User Input**: Primitive data types (`int`, `double`, `boolean`) vs reference types (`String`), type conversion (`Integer.valueOf`), and interactive input using `java.util.Scanner`.
3. **Operators and Expressions**: Mathematical operators (`+`, `-`, `*`, `/`, `%`), floating-point vs integer division, operator precedence, accumulator formulas, and `Math.sqrt`.
4. **Conditional Statements**: Conditional branching (`if`, `else if`, `else`), relational comparisons (`==`, `!=`, `<`, `>`, `<=`, `>=`), compound boolean expressions (`&&`, `||`, `!`), and string value equality via `.equals()`.
5. **Loops and Control Flow**: Repetition with `while` and `for` loops, sentinel values, loop interruption (`break`, `continue`), sequence counters, and iterative aggregations.
6. **Methods**: Modular decomposition, method signatures, parameter passing, return types, call stack mechanics, and multi-step helper invocation.
7. **Arrays**: Fixed-size arrays (`int[]`, `String[]`), index boundaries, array iteration, element swapping, linear search, and custom array display formatting.
8. **Lists and Collections**: Dynamic sizing with `ArrayList<T>`, element insertion, removal, index-based access, linear filtering, custom LIFO stack implementation, and key-value mapping.
9. **Strings and Text Processing**: Immutability, string evaluation, tokenization with `.split()`, whitespace trimming, substring extraction, and parsing delimiter-separated text records.
10. **Object-Oriented Programming (OOP)**:
    - Custom class definitions, state encapsulation, private fields, constructors, and getters/setters.
    - Custom string representations by overriding `toString()`.
    - Constructor and method overloading.
    - Object references, memory aliasing, `null` checks, and defensive programming.
    - Composition: objects containing and orchestrating other objects.
    - Custom identity and equality logic with overridden `equals()`.
    - Immutable value objects (e.g. currency patterns returning fresh instances).
    - Separation of concerns: decoupling domain models from interactive user interfaces.
11. **File I/O and Exception Handling**: Reading files line-by-line using `java.nio.file.Paths` and `Scanner`, structured data ingestion, file creation, handling `try-catch` blocks, and exploring runtime exceptions (`NullPointerException`, `IndexOutOfBoundsException`).
12. **Algorithms and Problem Solving**: Manual Selection Sort, built-in sorting (`Collections.sort`, `Arrays.sort`), Linear vs Binary Search, state container logic, and multi-class console applications (Recipe Search, Bird Observation Database, Grade Statistics).
13. **Unit Testing**: Writing automated test fixtures using JUnit 4 (`@Test`, `@Before`, `assertEquals`, `assertTrue`, `assertFalse`).

---

## Exercise Index

<details open>
<summary><b>01: Java Fundamentals (7 exercises)</b></summary>

| Folder | Description | Source Files |
| :--- | :--- | :--- |
| [`01-sandbox`](01-java-fundamentals/01-sandbox) | Program entry point and initial test run | `Sandbox.java` |
| [`02-ada-lovelace`](01-java-fundamentals/02-ada-lovelace) | Console text printing | `AdaLovelace.java` |
| [`03-once-upon-a-time`](01-java-fundamentals/03-once-upon-a-time) | Sequential multi-line console output | `OnceUponATime.java` |
| [`04-dinosaur`](01-java-fundamentals/04-dinosaur) | Sequential print statements | `Dinosaur.java` |
| [`05-hi-ada-lovelace`](01-java-fundamentals/05-hi-ada-lovelace) | String output concatenation | `HiAdaLovelace.java` |
| [`06-message-three-times`](01-java-fundamentals/06-message-three-times) | Repeating console text output | `MessageThreeTimes.java` |
| [`07-check-your-indentation`](01-java-fundamentals/07-check-your-indentation) | Clean code formatting and structural indentation | `CheckYourIndentation.java` |

</details>

<details>
<summary><b>02: Variables and User Input (9 exercises)</b></summary>

| Folder | Description | Source Files |
| :--- | :--- | :--- |
| [`01-message`](02-variables-and-user-input/01-message) | Reading console input using Scanner | `Message.java` |
| [`02-greeting`](02-variables-and-user-input/02-greeting) | Reading string input and generating greeting | `Greeting.java` |
| [`03-conversation`](02-variables-and-user-input/03-conversation) | Interactive multi-turn console dialogue | `Conversation.java` |
| [`04-story`](02-variables-and-user-input/04-story) | Multi-variable input interpolation in a narrative | `Story.java` |
| [`05-various-variables`](02-variables-and-user-input/05-various-variables) | Primitive variable types and declarations | `VariousVariables.java` |
| [`06-integer-input`](02-variables-and-user-input/06-integer-input) | Reading and parsing integer values | `IntegerInput.java` |
| [`07-double-input`](02-variables-and-user-input/07-double-input) | Reading and parsing floating-point numbers | `DoubleInput.java` |
| [`08-boolean-input`](02-variables-and-user-input/08-boolean-input) | Reading and parsing boolean values | `BooleanInput.java` |
| [`09-different-types-of-input`](02-variables-and-user-input/09-different-types-of-input) | Mixed data type input reading in sequence | `DifferentTypesOfInput.java` |

</details>

<details>
<summary><b>03: Operators and Expressions (10 exercises)</b></summary>

| Folder | Description | Source Files |
| :--- | :--- | :--- |
| [`01-seconds-in-a-day`](03-operators-and-expressions/01-seconds-in-a-day) | Arithmetic unit conversion (days to seconds) | `SecondsInADay.java` |
| [`02-sum-of-two-numbers`](03-operators-and-expressions/02-sum-of-two-numbers) | Addition operator with two user inputs | `SumOfTwoNumbers.java` |
| [`03-sum-of-three-numbers`](03-operators-and-expressions/03-sum-of-three-numbers) | Addition operator with three user inputs | `SumOfThreeNumbers.java` |
| [`04-addition-formula`](03-operators-and-expressions/04-addition-formula) | Displaying formatted addition equations | `AdditionFormula.java` |
| [`05-multiplication-formula`](03-operators-and-expressions/05-multiplication-formula) | Displaying formatted multiplication equations | `MultiplicationFormula.java` |
| [`06-average-of-two-numbers`](03-operators-and-expressions/06-average-of-two-numbers) | Floating-point division and average computation | `AverageOfTwoNumbers.java` |
| [`07-average-of-three-numbers`](03-operators-and-expressions/07-average-of-three-numbers) | Calculating mean across three values | `AverageOfThreeNumbers.java` |
| [`08-simple-calculator`](03-operators-and-expressions/08-simple-calculator) | Multi-operation console arithmetic calculator | `SimpleCalculator.java` |
| [`09-squared`](03-operators-and-expressions/09-squared) | Squaring integer input | `Squared.java` |
| [`10-square-root-of-sum`](03-operators-and-expressions/10-square-root-of-sum) | Summation and square root via `Math.sqrt()` | `SquareRootOfSum.java` |

</details>

<details>
<summary><b>04: Conditional Statements (15 exercises)</b></summary>

| Folder | Description | Source Files |
| :--- | :--- | :--- |
| [`01-speeding-ticket`](04-conditional-statements/01-speeding-ticket) | Relational check with single `if` statement | `SpeedingTicket.java` |
| [`02-orwell`](04-conditional-statements/02-orwell) | Equality comparison with integer literal | `Orwell.java` |
| [`03-ancient`](04-conditional-statements/03-ancient) | Numerical threshold evaluation | `Ancient.java` |
| [`04-positivity`](04-conditional-statements/04-positivity) | Binary branching with `if-else` | `Positivity.java` |
| [`05-adulthood`](04-conditional-statements/05-adulthood) | Age verification logic | `Adulthood.java` |
| [`06-larger-than-or-equal-to`](04-conditional-statements/06-larger-than-or-equal-to) | Multi-branch comparison between two numbers | `LargerThanOrEqualTo.java` |
| [`07-grades-and-points`](04-conditional-statements/07-grades-and-points) | Multi-tier bracket evaluation for grading | `GradesAndPoints.java` |
| [`08-odd-or-even`](04-conditional-statements/08-odd-or-even) | Parity determination using modulo operator (`%`) | `OddOrEven.java` |
| [`09-password`](04-conditional-statements/09-password) | String comparison using `.equals()` | `Password.java` |
| [`10-same`](04-conditional-statements/10-same) | Equality comparison between two string inputs | `Same.java` |
| [`11-checking-the-age`](04-conditional-statements/11-checking-the-age) | Logical AND (`&&`) range validation | `CheckingTheAge.java` |
| [`12-leap-year`](04-conditional-statements/12-leap-year) | Compound conditional rules for leap year calculation | `LeapYear.java` |
| [`13-gift-tax`](04-conditional-statements/13-gift-tax) | Tiered taxation bracket calculation | `GiftTax.java` |
| [`14-absolute-value`](04-conditional-statements/14-absolute-value) | Absolute value determination without built-in helpers | `AbsoluteValue.java` |
| [`15-comparing-numbers`](04-conditional-statements/15-comparing-numbers) | Relative value comparison (`greater`, `smaller`, `equal`) | `ComparingNumbers.java` |

</details>

<details>
<summary><b>05: Loops and Control Flow (18 exercises)</b></summary>

| Folder | Description | Source Files |
| :--- | :--- | :--- |
| [`01-carry-on`](05-loops-and-control-flow/01-carry-on) | While loop terminated by specific string sentinel | `CarryOn.java` |
| [`02-are-we-there-yet`](05-loops-and-control-flow/02-are-we-there-yet) | While loop with sentinel integer value | `AreWeThereYet.java` |
| [`03-only-positives`](05-loops-and-control-flow/03-only-positives) | Using `continue` and `break` inside loop | `OnlyPositives.java` |
| [`04-number-of-numbers`](05-loops-and-control-flow/04-number-of-numbers) | Counting input entries until sentinel value | `NumberOfNumbers.java` |
| [`05-number-of-negative-numbers`](05-loops-and-control-flow/05-number-of-negative-numbers) | Conditional counter tally inside loop | `NumberOfNegativeNumbers.java` |
| [`06-sum-of-numbers`](05-loops-and-control-flow/06-sum-of-numbers) | Accumulator pattern tracking input sum | `SumOfNumbers.java` |
| [`07-number-and-sum-of-numbers`](05-loops-and-control-flow/07-number-and-sum-of-numbers) | Concurrently tracking input count and running sum | `NumberAndSumOfNumbers.java` |
| [`08-average-of-numbers`](05-loops-and-control-flow/08-average-of-numbers) | Calculating mean from loop accumulator | `AverageOfNumbers.java` |
| [`09-average-of-positive-numbers`](05-loops-and-control-flow/09-average-of-positive-numbers) | Filtered average calculation for positive values | `AverageOfPositiveNumbers.java` |
| [`10-counting`](05-loops-and-control-flow/10-counting) | Iterating upwards with `for` loop | `Counting.java` |
| [`11-counting-to-hundred`](05-loops-and-control-flow/11-counting-to-hundred) | Loop iteration up to constant bound | `CountingToHundred.java` |
| [`12-from-where-to-where`](05-loops-and-control-flow/12-from-where-to-where) | Configurable dynamic range bounds in `for` loop | `FromWhereToWhere.java` |
| [`13-sum-of-a-sequence`](05-loops-and-control-flow/13-sum-of-a-sequence) | Sequence summation from 1 to `n` | `SumOfASequence.java` |
| [`14-sum-of-a-sequence-the-sequel`](05-loops-and-control-flow/14-sum-of-a-sequence-the-sequel) | Sequence summation between arbitrary bounds | `SumOfASequenceTheSequel.java` |
| [`15-factorial`](05-loops-and-control-flow/15-factorial) | Factorial product accumulation | `Factorial.java` |
| [`16-repeating-breaking-and-remembering`](05-loops-and-control-flow/16-repeating-breaking-and-remembering) | Multi-metric loop accumulation (sum, count, evens, odds) | `RepeatingBreakingAndRemembering.java` |
| [`17-number-of-strings`](05-loops-and-control-flow/17-number-of-strings) | Loop counting string inputs until sentinel command | `NumberOfStrings.java` |
| [`18-cubes`](05-loops-and-control-flow/18-cubes) | Input loop calculating cubed integers | `Cubes.java` |

</details>

<details>
<summary><b>06: Methods (14 exercises)</b></summary>

| Folder | Description | Source Files |
| :--- | :--- | :--- |
| [`01-in-a-hole-in-the-ground`](06-methods/01-in-a-hole-in-the-ground) | Custom method declaration and execution | `InAHoleInTheGround.java` |
| [`02-reprint`](06-methods/02-reprint) | Invoking a method repeatedly in a loop | `Reprint.java` |
| [`03-from-one-to-parameter`](06-methods/03-from-one-to-parameter) | Parameterized method: printing 1 to `n` | `FromOneToParameter.java` |
| [`04-from-parameter-to-one`](06-methods/04-from-parameter-to-one) | Parameterized method: countdown from `n` to 1 | `FromParameterToOne.java` |
| [`05-division`](06-methods/05-division) | Parameterized method performing floating-point division | `Division.java` |
| [`06-divisible-by-three`](06-methods/06-divisible-by-three) | Range filtering logic encapsulated in method | `DivisibleByThree.java` |
| [`07-number-uno`](06-methods/07-number-uno) | Method returning constant integer value | `NumberUno.java` |
| [`08-word`](06-methods/08-word) | Method returning a String value | `Word.java` |
| [`09-summation`](06-methods/09-summation) | Method calculating and returning a sum | `Summation.java` |
| [`10-smallest`](06-methods/10-smallest) | Method returning minimum of two numbers | `Smallest.java` |
| [`11-greatest`](06-methods/11-greatest) | Method returning maximum of three numbers | `Greatest.java` |
| [`12-averaging`](06-methods/12-averaging) | Composing helper methods to compute average | `Averaging.java` |
| [`13-star-sign`](06-methods/13-star-sign) | Method decomposition for printing shapes | `StarSign.java` |
| [`14-advanced-astrology`](06-methods/14-advanced-astrology) | Geometric pattern printing (spaces, Christmas trees) | `AdvancedAstrology.java` |

</details>

<details>
<summary><b>07: Arrays (5 exercises)</b></summary>

| Folder | Description | Source Files |
| :--- | :--- | :--- |
| [`01-swap`](07-arrays/01-swap) | Swapping array elements by index | `Swap.java` |
| [`02-index-was-not-found`](07-arrays/02-index-was-not-found) | Linear search algorithm in fixed-size array | `IndexWasNotFound.java` |
| [`03-sum-of-array`](07-arrays/03-sum-of-array) | Iteration and sum aggregation in array | `SumOfArray.java` |
| [`04-print-neatly`](07-arrays/04-print-neatly) | Custom array formatting and separator handling | `PrintNeatly.java` |
| [`05-print-in-stars`](07-arrays/05-print-in-stars) | Visual bar chart generation from array values | `PrintInStars.java` |

</details>

<details>
<summary><b>08: Lists and Collections (18 exercises)</b></summary>

| Folder | Description | Source Files |
| :--- | :--- | :--- |
| [`01-third-element`](08-lists-and-collections/01-third-element) | `ArrayList` indexing and element retrieval | `ThirdElement.java` |
| [`02-second-plus-third`](08-lists-and-collections/02-second-plus-third) | Accessing and calculating with list items | `SecondPlusThird.java` |
| [`03-list-size`](08-lists-and-collections/03-list-size) | Dynamic sizing with `.size()` | `ListSize.java` |
| [`04-last-in-list`](08-lists-and-collections/04-last-in-list) | Accessing the final element in dynamic list | `LastInList.java` |
| [`05-first-and-last`](08-lists-and-collections/05-first-and-last) | Inspecting list boundaries | `FirstAndLast.java` |
| [`06-remember-these-numbers`](08-lists-and-collections/06-remember-these-numbers) | Storing numerical input until sentinel stop | `RememberTheseNumbers.java` |
| [`07-only-these-numbers`](08-lists-and-collections/07-only-these-numbers) | Slicing and iterating across list sub-ranges | `OnlyTheseNumbers.java` |
| [`08-greatest-in-list`](08-lists-and-collections/08-greatest-in-list) | Finding maximum value in a list | `GreatestInList.java` |
| [`09-index-of`](08-lists-and-collections/09-index-of) | Linear search for target value index | `IndexOf.java` |
| [`10-index-of-smallest`](08-lists-and-collections/10-index-of-smallest) | Tracking both minimum value and its position | `IndexOfSmallest.java` |
| [`11-sum-of-a-list`](08-lists-and-collections/11-sum-of-a-list) | Summing list elements with for-each loop | `SumOfAList.java` |
| [`12-average-of-a-list`](08-lists-and-collections/12-average-of-a-list) | Calculating list average | `AverageOfAList.java` |
| [`13-on-the-list`](08-lists-and-collections/13-on-the-list) | Searching for element existence (`.contains()`) | `OnTheList.java` |
| [`14-print-in-range`](08-lists-and-collections/14-print-in-range) | Filtering list items by range criteria | `PrintInRange.java` |
| [`15-sum`](08-lists-and-collections/15-sum) | Passing list as method parameter | `Sum.java` |
| [`16-remove-last`](08-lists-and-collections/16-remove-last) | Modifying list contents in-place | `RemoveLast.java` |
| [`17-stack`](08-lists-and-collections/17-stack) | Custom LIFO Stack data structure implementation | `Stack.java`, `Main.java` |
| [`18-simple-dictionary`](08-lists-and-collections/18-simple-dictionary) | Key-value dictionary paired with text UI | `SimpleDictionary.java`, `TextUI.java`, `Main.java` |

</details>

<details>
<summary><b>09: Strings and Text Processing (10 exercises)</b></summary>

| Folder | Description | Source Files |
| :--- | :--- | :--- |
| [`01-print-thrice`](09-strings-and-text-processing/01-print-thrice) | String repetition and output | `PrintThrice.java` |
| [`02-is-it-true`](09-strings-and-text-processing/02-is-it-true) | String boolean value verification | `IsItTrue.java` |
| [`03-login`](09-strings-and-text-processing/03-login) | Multi-credential authentication validation | `Login.java` |
| [`04-line-by-line`](09-strings-and-text-processing/04-line-by-line) | Tokenizing strings with `.split(" ")` | `LineByLine.java` |
| [`05-av-club`](09-strings-and-text-processing/05-av-club) | String splitting and substring filtering | `AVClub.java` |
| [`06-first-words`](09-strings-and-text-processing/06-first-words) | Extracting first token of delimited strings | `FirstWords.java` |
| [`07-last-words`](09-strings-and-text-processing/07-last-words) | Extracting final token of delimited strings | `LastWords.java` |
| [`08-age-of-the-oldest`](09-strings-and-text-processing/08-age-of-the-oldest) | Parsing CSV records to find maximum age field | `AgeOfTheOldest.java` |
| [`09-name-of-the-oldest`](09-strings-and-text-processing/09-name-of-the-oldest) | Correlating structured fields from delimited input | `NameOfTheOldest.java` |
| [`10-personal-details`](09-strings-and-text-processing/10-personal-details) | Processing CSV lines for max length and birth year mean | `PersonalDetails.java` |

</details>

<details>
<summary><b>10: Object-Oriented Programming (46 exercises)</b></summary>

| Folder | Description | Source Files |
| :--- | :--- | :--- |
| [`01-your-first-account`](10-object-oriented-programming/01-your-first-account) | Instantiating Account object and mutating state | `Account.java`, `YourFirstAccount.java` |
| [`02-your-first-bank-transfer`](10-object-oriented-programming/02-your-first-bank-transfer) | Inter-object state transfer | `Account.java`, `YourFirstBankTransfer.java` |
| [`03-dog-attributes`](10-object-oriented-programming/03-dog-attributes) | Creating class fields and access patterns | `Dog.java` |
| [`04-room`](10-object-oriented-programming/04-room) | Class definition with constructor and fields | `Room.java` |
| [`05-whistle`](10-object-oriented-programming/05-whistle) | Encapsulating sound behaviour in class | `Whistle.java` |
| [`06-door`](10-object-oriented-programming/06-door) | Class with action methods | `Door.java` |
| [`07-product`](10-object-oriented-programming/07-product) | Managing inventory product state and printing | `Product.java` |
| [`08-decreasing-counter`](10-object-oriented-programming/08-decreasing-counter) | Bounded counter with decrement logic | `DecreasingCounter.java` |
| [`09-debt`](10-object-oriented-programming/09-debt) | Compound interest calculation on debt | `Debt.java` |
| [`10-song-attributes`](10-object-oriented-programming/10-song-attributes) | Encapsulating song metadata and accessors | `Song.java`, `Main.java` |
| [`11-film`](10-object-oriented-programming/11-film) | Age restriction check method on Film object | `Film.java`, `Main.java` |
| [`12-gauge`](10-object-oriented-programming/12-gauge) | State machine with boundaries (0 to 5) | `Gauge.java`, `Main.java` |
| [`13-agent`](10-object-oriented-programming/13-agent) | Custom `toString()` method representation | `Agent.java` |
| [`14-multiplier`](10-object-oriented-programming/14-multiplier) | Value multiplication via instance method | `Multiplier.java`, `Main.java` |
| [`15-number-statistics`](10-object-oriented-programming/15-number-statistics) | Multi-object state tracking (all, evens, odds) | `Statistics.java`, `MainProgram.java` |
| [`16-payment-card`](10-object-oriented-programming/16-payment-card) | Cafeteria payment card with spending rules | `PaymentCard.java`, `MainProgram.java` |
| [`17-items`](10-object-oriented-programming/17-items) | Storing custom objects in an `ArrayList` | `Item.java`, `Items.java` |
| [`18-personal-information`](10-object-oriented-programming/18-personal-information) | Collecting and printing structured domain objects | `PersonalInformation.java`, `PersonalInformationCollection.java` |
| [`19-television-programs`](10-object-oriented-programming/19-television-programs) | Filtering collection of objects by duration criteria | `TelevisionProgram.java`, `Main.java` |
| [`20-book-collection`](10-object-oriented-programming/20-book-collection) | Configurable output format for object collection | `Book.java`, `Main.java` |
| [`21-one-minute-timer`](10-object-oriented-programming/21-one-minute-timer) | Composition: building a Timer using multiple ClockHands | `ClockHand.java`, `Timer.java`, `Program.java` |
| [`22-book-class`](10-object-oriented-programming/22-book-class) | Class design with getters and custom `toString()` | `Book.java`, `Program.java` |
| [`23-cube`](10-object-oriented-programming/23-cube) | Volume calculation method on 3D geometric object | `Cube.java`, `Program.java` |
| [`24-fit-byte`](10-object-oriented-programming/24-fit-byte) | Target heart rate calculation using Karvonen formula | `Fitbyte.java`, `Program.java` |
| [`25-constructor-overload`](10-object-oriented-programming/25-constructor-overload) | Constructor chaining and default parameter values | `Product.java`, `MainProgram.java` |
| [`26-overloaded-counter`](10-object-oriented-programming/26-overloaded-counter) | Overloading constructors and increment/decrement methods | `Counter.java`, `MainProgram.java` |
| [`27-biggest-pet-shop`](10-object-oriented-programming/27-biggest-pet-shop) | Aggregation: linking Person and Pet objects | `Person.java`, `Pet.java`, `MainProgram.java` |
| [`28-health-station`](10-object-oriented-programming/28-health-station) | Object interaction: station measuring and mutating Person weight | `HealthStation.java`, `Person.java`, `Main.java` |
| [`29-card-payments`](10-object-oriented-programming/29-card-payments) | Modeling point-of-sale terminal and cards | `PaymentTerminal.java`, `PaymentCard.java`, `Main.java` |
| [`30-comparing-apartments`](10-object-oriented-programming/30-comparing-apartments) | Comparing apartment objects by size and price differences | `Apartment.java`, `Main.java` |
| [`31-song-equality`](10-object-oriented-programming/31-song-equality) | Implementing custom `.equals()` method on domain objects | `Song.java`, `Main.java` |
| [`32-identical-twins`](10-object-oriented-programming/32-identical-twins) | Deep equality checking with nested date objects | `Person.java`, `SimpleDate.java`, `Main.java` |
| [`33-book-equality`](10-object-oriented-programming/33-book-equality) | Duplicate prevention in list using custom `equals()` | `Book.java`, `Main.java` |
| [`34-archive-identifier`](10-object-oriented-programming/34-archive-identifier) | Deduplicating user items based on identifier equality | `Items.java`, `Main.java` |
| [`35-dating-app`](10-object-oriented-programming/35-dating-app) | Date arithmetic and advancing days/weeks | `SimpleDate.java`, `Main.java` |
| [`36-money-immutability`](10-object-oriented-programming/36-money-immutability) | Immutable value object pattern for currency operations | `Money.java`, `MainProgram.java` |
| [`37-menu`](10-object-oriented-programming/37-menu) | Encapsulating `ArrayList` operations within Menu class | `Menu.java`, `Main.java` |
| [`38-messaging-service`](10-object-oriented-programming/38-messaging-service) | Service class enforcing validation on incoming messages | `Message.java`, `MessagingService.java`, `Main.java` |
| [`39-printing-a-collection`](10-object-oriented-programming/39-printing-a-collection) | Formatting complex string representations of collections | `SimpleCollection.java`, `Main.java` |
| [`40-santas-workshop`](10-object-oriented-programming/40-santas-workshop) | Hierarchical aggregation: Gift inside Package | `Gift.java`, `Package.java`, `Main.java` |
| [`41-longest-in-collection`](10-object-oriented-programming/41-longest-in-collection) | Searching for longest element within internal collection | `SimpleCollection.java`, `Main.java` |
| [`42-height-order`](10-object-oriented-programming/42-height-order) | Finding and taking shortest Person from Room | `Person.java`, `Room.java`, `Main.java` |
| [`43-cargo-hold`](10-object-oriented-programming/43-cargo-hold) | Multi-level container hierarchy (Hold -> Suitcases -> Items) | `Item.java`, `Suitcase.java`, `Hold.java`, `Main.java` |
| [`44-todo-list`](10-object-oriented-programming/44-todo-list) | Clean architecture: separating TodoList domain model from UI | `TodoList.java`, `UserInterface.java`, `Main.java` |
| [`45-grade-register-ui`](10-object-oriented-programming/45-grade-register-ui) | Grade book tracking distributions and averages | `GradeRegister.java`, `UserInterface.java`, `Program.java` |
| [`46-joke-manager`](10-object-oriented-programming/46-joke-manager) | Separating joke collection manager from interactive console UI | `JokeManager.java`, `UserInterface.java`, `Program.java` |

</details>

<details>
<summary><b>11: File I/O and Exception Handling (11 exercises)</b></summary>

| Folder | Description | Source Files |
| :--- | :--- | :--- |
| [`01-index-out-of-bounds-exception`](11-file-io-and-exception-handling/01-index-out-of-bounds-exception) | Investigating list boundary conditions and runtime exceptions | `IoobProgram.java` |
| [`02-null-pointer-exception`](11-file-io-and-exception-handling/02-null-pointer-exception) | Investigating null reference behavior and runtime exceptions | `NullPointerExceptionProgram.java` |
| [`03-creating-a-new-file`](11-file-io-and-exception-handling/03-creating-a-new-file) | File creation fundamentals | `Program.java`, `file.txt` |
| [`04-printing-a-file`](11-file-io-and-exception-handling/04-printing-a-file) | Reading file line-by-line via `Paths.get()` | `PrintingAFile.java`, `data.txt` |
| [`05-printing-a-specified-file`](11-file-io-and-exception-handling/05-printing-a-specified-file) | Reading dynamically chosen user file with try-catch | `PrintingASpecifiedFile.java`, `data.txt` |
| [`06-guest-list-from-a-file`](11-file-io-and-exception-handling/06-guest-list-from-a-file) | Cross-referencing user queries against file contents | `GuestListFromAFile.java`, `names.txt` |
| [`07-is-it-in-the-file`](11-file-io-and-exception-handling/07-is-it-in-the-file) | Searching within target files with exception handling | `IsItInTheFile.java`, `names.txt` |
| [`08-numbers-from-a-file`](11-file-io-and-exception-handling/08-numbers-from-a-file) | Numeric range filtering from file lines | `NumbersFromAFile.java`, `numbers-1.txt` |
| [`09-records-from-a-file`](11-file-io-and-exception-handling/09-records-from-a-file) | Parsing comma-separated records from file | `RecordsFromAFile.java`, `data.txt` |
| [`10-storing-records`](11-file-io-and-exception-handling/10-storing-records) | Reading file records into `ArrayList<Person>` | `Person.java`, `StoringRecords.java`, `data.txt` |
| [`11-sport-statistics`](11-file-io-and-exception-handling/11-sport-statistics) | Parsing CSV match records and calculating team records | `SportStatistics.java`, `data.csv` |

</details>

<details>
<summary><b>12: Algorithms and Problem Solving (8 exercises)</b></summary>

| Folder | Description | Source Files |
| :--- | :--- | :--- |
| [`01-liquid-containers`](12-algorithms-and-problem-solving/01-liquid-containers) | State management across two connected liquid containers | `Containers.java`, `LiquidContainers.java` |
| [`02-liquid-containers2`](12-algorithms-and-problem-solving/02-liquid-containers2) | Refactoring state container logic into an object-oriented design | `Container.java`, `LiquidContainers2.java` |
| [`03-sorting`](12-algorithms-and-problem-solving/03-sorting) | Manual implementation of Selection Sort algorithm | `MainProgram.java` |
| [`04-readymade-sorting-algorithms`](12-algorithms-and-problem-solving/04-readymade-sorting-algorithms) | Utilizing built-in `Arrays.sort()` and `Collections.sort()` | `Main.java` |
| [`05-searching`](12-algorithms-and-problem-solving/05-searching) | Implementation and benchmarking of Linear vs Binary Search | `Book.java`, `Searching.java` |
| [`06-grade-statistics`](12-algorithms-and-problem-solving/06-grade-statistics) | Calculating grade point averages, pass percentages, and distribution stars | `Main.java` |
| [`07-recipe-search`](12-algorithms-and-problem-solving/07-recipe-search) | Multi-line text file parser searching recipes by name, cook time, and ingredients | `Recipe.java`, `RecipeSearch.java`, `recipes.txt` |
| [`08-big-year`](12-algorithms-and-problem-solving/08-big-year) | Console database application for birdwatchers tracking sightings and statistics | `Bird.java`, `mainProgram.java` |

</details>

<details>
<summary><b>13: Unit Testing (1 exercise)</b></summary>

| Folder | Description | Source Files |
| :--- | :--- | :--- |
| [`01-exercise-management`](13-unit-testing/01-exercise-management) | Test-Driven Development with JUnit 4 assertions (`assertEquals`, `assertTrue`, `@Before`, `@Test`) | `Exercise.java`, `ExerciseManagement.java`, `ExerciseManagementTest.java`, `MainProgram.java` |

</details>

---

## How to Run

### Requirements
- **Java Development Kit (JDK)**: JDK 11 or higher (JDK 17 or JDK 21 recommended).
- Check your installed version:
  ```bash
  javac -version
  java -version
  ```

### Running from the Terminal

1. **Navigate to the target exercise directory**:
   ```bash
   cd 03-operators-and-expressions/08-simple-calculator
   ```

2. **Compile the Java source file(s)**:
   ```bash
   javac *.java
   ```

3. **Run the class containing `main`**:
   ```bash
   java SimpleCalculator
   ```

#### Running exercises with data files (File I/O & Capstone applications):
For exercises that read companion text or CSV files (e.g. `11-file-io-and-exception-handling/11-sport-statistics` or `12-algorithms-and-problem-solving/07-recipe-search`), always execute the command from inside the exercise folder so relative paths resolve cleanly:
```bash
cd 12-algorithms-and-problem-solving/07-recipe-search
javac *.java
java RecipeSearch
```

### Running with an IDE

- **VS Code**: Open the root `my-java-journey` folder. With the *Extension Pack for Java* installed, open any `.java` file and click **Run | Debug** above `main`.
- **IntelliJ IDEA**: Open the `my-java-journey` folder. Right-click the folder or any class containing `public static void main` and select **Run '<ClassName>.main()'**.
- **Eclipse**: File > Open Projects from File System... > select the repository directory.

---

## Future Learning Topics

The repository's topic-based structure is designed to expand organically as I advance into intermediate and modern Java features.

Future topics will seamlessly follow this established pattern:

- **Numbered topic folders**: e.g., `14-generics`, `15-lambda-expressions-and-streams`, `16-concurrency-and-threads`.
- **Self-contained exercise directories**: `01-descriptive-name`, `02-descriptive-name`.
- **Exercise Index updates**: Easily append new topic tables without reorganizing existing categories.

---

## Progress

- [x] **01: Java Fundamentals** (7/7 exercises)
- [x] **02: Variables and User Input** (9/9 exercises)
- [x] **03: Operators and Expressions** (10/10 exercises)
- [x] **04: Conditional Statements** (15/15 exercises)
- [x] **05: Loops and Control Flow** (18/18 exercises)
- [x] **06: Methods** (14/14 exercises)
- [x] **07: Arrays** (5/5 exercises)
- [x] **08: Lists and Collections** (18/18 exercises)
- [x] **09: Strings and Text Processing** (10/10 exercises)
- [x] **10: Object-Oriented Programming** (46/46 exercises)
- [x] **11: File I/O and Exception Handling** (11/11 exercises)
- [x] **12: Algorithms and Problem Solving** (8/8 exercises)
- [x] **13: Unit Testing** (1/1 exercise)
