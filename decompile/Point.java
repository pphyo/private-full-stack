package tech.codoverse.data;

public record Point(int x, int y) {
   public Point(int x, int y) {
      super();
      if (x < 0 && y < 0) {
         throw new IllegalArgumentException();
      }
      this.x = x;
      this.y = y;
   }
}
