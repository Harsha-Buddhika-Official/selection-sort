# Selection Sort Implementation

This repository contains implementations of the Selection Sort algorithm in multiple programming languages.

## Algorithm Description

Selection sort is a simple sorting algorithm that works by repeatedly finding the minimum element from the unsorted portion of the array and placing it at the beginning. The algorithm maintains two subarrays:
- The sorted subarray (initially empty)
- The unsorted subarray (initially the entire array)

## Time Complexity
- Best Case: O(n²)
- Average Case: O(n²)
- Worst Case: O(n²)

## Space Complexity
O(1) - It's an in-place sorting algorithm

## How to Build and Run

### C Implementation

#### Using Make (Recommended)
```bash
# Compile the program
make

# Compile and run
make run

# Clean compiled files
make clean
```

#### Manual Compilation
```bash
# Compile
gcc -Wall -Wextra -std=c99 -o selection_sort selection_sort.c

# Run
./selection_sort
```

### Java Implementation

#### Basic Version
```bash
# Compile
javac SelectionSort.java

# Run
java SelectionSort
```

#### Advanced Version (with interactive features)
```bash
# Compile
javac SelectionSortAdvanced.java

# Run
java SelectionSortAdvanced
```

## Example Output

### C Version
```
Original array: 
64 34 25 12 22 11 90 
Sorted array: 
11 12 22 25 34 64 90 
```

### Java Version
```
=== Selection Sort Demo ===

Example 1: Predefined array
Original array: [64, 34, 25, 12, 22, 11, 90]
After pass 1: [11, 34, 25, 12, 22, 64, 90]
After pass 2: [11, 12, 25, 34, 22, 64, 90]
After pass 3: [11, 12, 22, 34, 25, 64, 90]
After pass 4: [11, 12, 22, 25, 34, 64, 90]
After pass 5: [11, 12, 22, 25, 34, 64, 90]
After pass 6: [11, 12, 22, 25, 34, 64, 90]
Final sorted array: [11, 12, 22, 25, 34, 64, 90]
Is sorted: true
```

## Files
- `selection_sort.c` - C implementation
- `SelectionSort.java` - Basic Java implementation
- `SelectionSortAdvanced.java` - Advanced Java implementation with interactive features
- `Makefile` - Build configuration for C
- `README.md` - This file
