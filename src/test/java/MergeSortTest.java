import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MergeSortTest {

  private static MergeSort mergeSort;

  @BeforeAll
  public static void once() {
    mergeSort = new MergeSort();
  }

  @Test
  public void positiveTest() {
    int[] actual = {5, 1, 6, 2, 3, 4};
    int[] expected = {1, 2, 3, 4, 5, 6};

    mergeSort.sort(actual);

    assertArrayEquals(expected, actual);
  }
}
