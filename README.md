# Mergesort in Java

Implement the mergesort presented in pseudocode below in Java in the `MergeSort` class. Then run
the `MergeSortTest` class to test your implementation. The test should be passing.

```
BEGIN MergeSort(list, left=0, right=-1)
IF right = -1
  right = LENGTH OF list
ENDIF
IF right > left
  middle = left + (right - left)/2
  // mergesort both halves
  MergeSort(list, left, middle)
  MergeSort(list, middle+1, right)
  // merge the halves
  Merge(list, left, middle, right)
ENDIF
END MergeSort

BEGIN Merge(list, left, middle, right)
n1 = middle - left + 1
n2 = right - middle

// Create temp lists
Left = LIST OF LENGTH n1
Right = LIST OF LENGTH n2

// Copy data to temp lists Left and Right
FOR i FROM 0 to n1
  Left[i] = list[left + 1]
ENDFOR

FOR j FROM 0 to n2
  Right[j] = list[middle + 1 + j]
ENDFOR

// Merge the temp lists back

// Initial index of first sublist
i = 0

// Initial index of second sublist
j = 0

// Initial index of merged sublist
k = left

WHILE i < n1 AND j < n2
  IF Left[i] <= Right[j]
    list[k] = Left[i]
    i++
  ELSE
    list[k] = Right[j]
    j++
  ENDIF
  k++
ENDWHILE

// Copy the remaining elements of
// Left, if there are any
WHILE i < n1
  list[k] = Left[i]
  i++
  k++
ENDWHILE

// Copy the remaining elements of
// Right, if there are any
WHILE j < n2
  list[k] = Right[j]
  j++
  k++
ENDWHILE
END Merge
```

Source: https://www.geeksforgeeks.org/merge-sort/