# Selection Sort

## 🔹 Algorithm (Step-wise)

Step 1: Start

Step 2: Declare an array of elements

Step 3: Find the length of the array (n)

Step 4: Assume the first element as minimum

Step 5: Run a loop from i = 0 to n-2

Step 6: Set minIndex = i

Step 7: Run another loop from j = i+1 to n-1

Step 8: Compare arr[j] with arr[minIndex]

Step 9: If arr[j] < arr[minIndex], update minIndex

Step 10: After inner loop, swap arr[i] with arr[minIndex]

Step 11: Repeat the process for all elements

Step 12: Display the sorted array

Step 13: Stop

---

## 🔹 Logic
Selection Sort selects the smallest element from the unsorted part of the array and places it at the correct position.

---

## 🔹 Time Complexity
- Best Case: O(n²)
- Average Case: O(n²)
- Worst Case: O(n²)

---

## 🔹 Space Complexity
- O(1)

---

## 🔹 Pseudocode

for i = 0 to n-2  
    minIndex = i  
    for j = i+1 to n-1  
        if arr[j] < arr[minIndex]  
            minIndex = j  
    swap(arr[i], arr[minIndex])

---

## 🔹 Example

Input:  [5, 2, 8, 1, 3]  
Output: [1, 2, 3, 5, 8]
