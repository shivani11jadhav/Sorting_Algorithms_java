# Merge Sort

## 🔹 Algorithm (Step-wise)

Step 1: Start

Step 2: Declare an array of elements

Step 3: Divide the array into two halves

Step 4: Recursively apply merge sort on left half

Step 5: Recursively apply merge sort on right half

Step 6: Merge the two sorted halves

Step 7: Compare elements from both halves and arrange them in order

Step 8: Repeat until entire array is sorted

Step 9: Display the sorted array

Step 10: Stop

---

## 🔹 Logic
Merge Sort follows Divide and Conquer approach. It divides the array into smaller parts, sorts them recursively, and then merges them back.

---

## 🔹 Time Complexity
- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n log n)

---

## 🔹 Space Complexity
- O(n)

---

## 🔹 Pseudocode

mergeSort(arr, left, right):
    if left < right:
        mid = (left + right) / 2
        mergeSort(arr, left, mid)
        mergeSort(arr, mid+1, right)
        merge(arr, left, mid, right)

---

## 🔹 Example

Input:  [5, 2, 8, 1, 3]  
Output: [1, 2, 3, 5, 8]
