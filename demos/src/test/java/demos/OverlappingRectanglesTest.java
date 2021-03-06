package demos;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import org.junit.jupiter.api.Test;

public class OverlappingRectanglesTest {

  @Test
  public void testPositiveOverlap() {
    OverlappingRectangles Rectangles =
        new OverlappingRectangles(new Integer[] {-3, 0, 3, 4, 0, -1, 9, 2});
    assertEquals(6, Rectangles.overlapArea);
  }

  @Test
  public void testPositiveOverlap2() {
    OverlappingRectangles Rectangles =
        new OverlappingRectangles(new Integer[] {-3, 0, 3, 4, 0, -1, 9, 2});
    assertEquals(45, Rectangles.totalArea);
  }

  @Test
  public void testPositiveOverlap3() {
    OverlappingRectangles Rectangles =
        new OverlappingRectangles(new Integer[] {2, 3, 5, 7, 1, 2, 6, 8});
    assertEquals(30, Rectangles.totalArea);
  }

  @Test
  public void testPositiveOverlap4() {
    OverlappingRectangles Rectangles =
        new OverlappingRectangles(new Integer[] {2, 3, 5, 7, 1, 2, 6, 8});
    assertEquals(12, Rectangles.overlapArea);
  }

  @Test
  public void testMain() {
    OverlappingRectangles Rectangles =
        new OverlappingRectangles(new Integer[] {2, 3, 5, 7, 1, 2, 6, 8});
    OverlappingRectangles.main("2", "3", "5", "7", "1", "2", "6", "8");

    assertEquals(12, Rectangles.overlapArea);
  }

  @Test
  public void testMainException() {
    OverlappingRectangles Rectangles =
        new OverlappingRectangles(new Integer[] {2, 3, 5, 7, 1, 2, 6, 8});
    OverlappingRectangles.main("2", "3", "5", "7", "1", "2");

    assertEquals(12, Rectangles.overlapArea);
  }
}
