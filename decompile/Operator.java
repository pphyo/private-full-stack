package tech.codoverse;

public abstract sealed class Operator extends Enum permits Operator.1, Operator.2 {
   public static final Operator PLUS = new 1("PLUS", 0);
   public static final Operator MINUS = new 2("MINUS", 1);
   // $FF: synthetic field
   private static final Operator[] ENUM$VALUES = new Operator[]{PLUS, MINUS};

   private Operator(String var1, int var2) {
      super(var1, var2);
   }

   public abstract int apply(int var1, int var2);

   public static Operator[] values() {
      Operator[] var0;
      int var1;
      Operator[] var2;
      System.arraycopy(var0 = ENUM$VALUES, 0, var2 = new Operator[var1 = var0.length], 0, var1);
      return var2;
   }

   public static Operator valueOf(String var0) {
      return (Operator)Enum.valueOf(Operator.class, var0);
   }
}
