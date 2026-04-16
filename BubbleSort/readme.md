## 🔹 Algorithm (Step-wise)

Step 1: Start

Step 2: Declare an array of elements

Step 3: Find the length of the array (n)

Step 4: Run a loop from i = 0 to n-2

Step 5: Inside this loop, run another loop from j = 0 to n-i-2

Step 6: Compare arr[j] and arr[j+1]

Step 7: If arr[j] > arr[j+1], then swap the elements

Step 8: Repeat the process for all elements

Step 9: After each iteration, the largest element is placed at the end

Step 10: Continue until the array is sorted

Step 11: Display the sorted array

Step 12: Stop


## 🔹 Logic
Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order. With each iteration, the largest unsorted element "bubbles up" to its correct position.

## 🔹 Time Complexity
- Best Case: O(n) (already sorted)
- Average Case: O(n²)
- Worst Case: O(n²)

## 🔹 Space Complexity
- O(1)

## 🔹 Example

Input:  [5, 2, 8, 1, 3]  
Output: [1, 2, 3, 5, 8]
