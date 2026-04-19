# ⚡ Quick Sort Algorithm in Java



## 🧠 Algorithm (Quick Sort)

1. Choose a pivot element (generally the last element).  
2. Partition the array such that:
   - Elements smaller than pivot are on the left  
   - Elements greater than pivot are on the right  
3. Place pivot at its correct sorted position.  
4. Recursively apply Quick Sort on left subarray.  
5. Recursively apply Quick Sort on right subarray.  

---

## 🧾 Pseudocode

### 🔹 Quick Sort
```text id="qs_pseudo1"
QUICK_SORT(arr, low, high)

1. IF low < high THEN
2.     pi = PARTITION(arr, low, high)
3.     QUICK_SORT(arr, low, pi - 1)
4.     QUICK_SORT(arr, pi + 1, high)
5. END IF

# 🧠 Concepts Used
- Arrays
- Recursion
- Divide and Conquer
- Partitioning
- Time Complexity Analysis
